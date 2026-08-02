package com.yandex.div.core.view2.reuse;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.animations.DivComparator;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.reuse.util.RebindTokenUtilsKt;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.a;
import com.yandex.div2.j3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import xsna.j5g;
import xsna.zcl;

/* compiled from: RebindTask.kt */
/* loaded from: classes7.dex */
public final class RebindTask {
    public static final Companion Companion = new Companion(null);
    private final Div2View div2View;
    private final DivBinder divBinder;
    private final ExpressionResolver newResolver;
    private final ExpressionResolver oldResolver;
    private boolean rebindInProgress;
    private final ComplexRebindReporter reporter;
    private final Set<ExistingToken> bindingPoints = new LinkedHashSet();
    private final List<ExistingToken> idsToBind = new ArrayList();
    private final List<ExistingToken> aloneExisting = new ArrayList();
    private final List<NewToken> aloneNew = new ArrayList();
    private final Map<String, ExistingToken> aloneIds = new LinkedHashMap();
    private final ReusableTokenList reusableList = new ReusableTokenList();

    /* compiled from: RebindTask.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: RebindTask.kt */
    public static final class UnsupportedElementException extends IllegalArgumentException {
        private final String message;

        public UnsupportedElementException(Class<?> cls) {
            this.message = cls + " is unsupported by complex rebind";
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.message;
        }
    }

    public RebindTask(Div2View div2View, DivBinder divBinder, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2, ComplexRebindReporter complexRebindReporter) {
        this.div2View = div2View;
        this.divBinder = divBinder;
        this.oldResolver = expressionResolver;
        this.newResolver = expressionResolver2;
        this.reporter = complexRebindReporter;
    }

    private final boolean calculateDiff(j3 j3Var, j3 j3Var2, ViewGroup viewGroup) {
        a aVar;
        a aVar2;
        j3.b stateToBind = this.div2View.stateToBind(j3Var);
        if (stateToBind == null || (aVar = stateToBind.a) == null) {
            this.reporter.onComplexRebindNoDivInState();
            return false;
        }
        ExistingToken existingToken = new ExistingToken(DivCollectionExtensionsKt.toItemBuilderResult(aVar, this.oldResolver), 0, viewGroup, null);
        j3.b stateToBind2 = this.div2View.stateToBind(j3Var2);
        if (stateToBind2 == null || (aVar2 = stateToBind2.a) == null) {
            this.reporter.onComplexRebindNoDivInState();
            return false;
        }
        NewToken newToken = new NewToken(DivCollectionExtensionsKt.toItemBuilderResult(aVar2, this.newResolver), 0, null);
        if (existingToken.isCombinable(newToken)) {
            doNodeInSameMode(existingToken, newToken);
        } else {
            doNodeInExistingMode(existingToken);
            doNodeInNewMode(newToken);
        }
        Iterator<T> it = this.aloneNew.iterator();
        while (it.hasNext()) {
            ExistingToken lastExistingParent = ((NewToken) it.next()).getLastExistingParent();
            if (lastExistingParent == null) {
                this.reporter.onComplexRebindNoExistingParent();
                return false;
            }
            this.reusableList.remove(lastExistingParent);
            this.bindingPoints.add(lastExistingParent);
        }
        return true;
    }

    private final void doNodeInExistingMode(ExistingToken existingToken) {
        String id = existingToken.getDiv().b().getId();
        if (id != null) {
            this.aloneIds.put(id, existingToken);
        } else {
            this.aloneExisting.add(existingToken);
        }
        Iterator it = ExistingToken.getChildrenTokens$default(existingToken, null, 1, null).iterator();
        while (it.hasNext()) {
            doNodeInExistingMode((ExistingToken) it.next());
        }
    }

    private final void doNodeInNewMode(NewToken newToken) {
        Object obj;
        Iterator<T> it = this.aloneExisting.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((ExistingToken) obj).isCombinable(newToken)) {
                    break;
                }
            }
        }
        ExistingToken existingToken = (ExistingToken) obj;
        if (existingToken != null) {
            this.aloneExisting.remove(existingToken);
            doNodeInSameMode(existingToken, newToken);
            return;
        }
        String id = newToken.getDiv().b().getId();
        ExistingToken existingToken2 = id != null ? this.aloneIds.get(id) : null;
        if (id == null || existingToken2 == null || !existingToken2.getDiv().getClass().equals(newToken.getDiv().getClass()) || !DivComparator.areValuesReplaceable$default(DivComparator.INSTANCE, existingToken2.getDiv().b(), newToken.getDiv().b(), this.oldResolver, this.newResolver, null, 16, null)) {
            this.aloneNew.add(newToken);
        } else {
            this.aloneIds.remove(id);
            this.idsToBind.add(RebindTokenUtilsKt.combineTokens(existingToken2, newToken));
        }
        Iterator<T> it2 = newToken.getChildrenTokens().iterator();
        while (it2.hasNext()) {
            doNodeInNewMode((NewToken) it2.next());
        }
    }

    private final void doNodeInSameMode(ExistingToken existingToken, NewToken newToken) {
        Object obj;
        ExistingToken combineTokens = RebindTokenUtilsKt.combineTokens(existingToken, newToken);
        newToken.setLastExistingParent(combineTokens);
        ArrayList arrayList = new ArrayList(newToken.getChildrenTokens());
        ArrayList arrayList2 = new ArrayList();
        for (ExistingToken existingToken2 : existingToken.getChildrenTokens(combineTokens)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((NewToken) obj).isCombinable(existingToken2)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            NewToken newToken2 = (NewToken) obj;
            if (newToken2 != null) {
                doNodeInSameMode(existingToken2, newToken2);
                arrayList.remove(newToken2);
            } else {
                arrayList2.add(existingToken2);
            }
        }
        if (arrayList.size() != arrayList2.size()) {
            this.bindingPoints.add(combineTokens);
        } else {
            this.reusableList.add(combineTokens);
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            doNodeInExistingMode((ExistingToken) it2.next());
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            doNodeInNewMode((NewToken) it3.next());
        }
    }

    private final boolean rebind(DivStatePath divStatePath) {
        if (this.bindingPoints.isEmpty() && this.reusableList.isEmpty()) {
            this.reporter.onComplexRebindNothingToBind();
            return false;
        }
        for (ExistingToken existingToken : this.aloneExisting) {
            releaseIfNecessary(existingToken.getDiv(), existingToken.getView());
            this.div2View.unbindViewFromDiv$div_release(existingToken.getView());
        }
        for (ExistingToken existingToken2 : this.aloneIds.values()) {
            releaseIfNecessary(existingToken2.getDiv(), existingToken2.getView());
            this.div2View.unbindViewFromDiv$div_release(existingToken2.getView());
        }
        for (ExistingToken existingToken3 : this.bindingPoints) {
            if (!j5g.P(this.bindingPoints, existingToken3.getParentToken())) {
                BindingContext bindingContext = BaseDivViewExtensionsKt.getBindingContext(existingToken3.getView());
                if (bindingContext == null) {
                    bindingContext = this.div2View.getBindingContext$div_release();
                }
                this.divBinder.bind(bindingContext, existingToken3.getView(), existingToken3.getItem().getDiv(), divStatePath);
            }
        }
        for (ExistingToken existingToken4 : this.idsToBind) {
            if (!j5g.P(this.bindingPoints, existingToken4.getParentToken())) {
                BindingContext bindingContext2 = BaseDivViewExtensionsKt.getBindingContext(existingToken4.getView());
                if (bindingContext2 == null) {
                    bindingContext2 = this.div2View.getBindingContext$div_release();
                }
                this.divBinder.bind(bindingContext2, existingToken4.getView(), existingToken4.getItem().getDiv(), divStatePath);
            }
        }
        clear();
        this.reporter.onComplexRebindSuccess();
        return true;
    }

    private final void releaseIfNecessary(a aVar, View view) {
        if (aVar instanceof a.b ? true : aVar instanceof a.q) {
            this.div2View.getReleaseViewVisitor$div_release().visit(view);
        }
    }

    public final void clear() {
        this.rebindInProgress = false;
        this.reusableList.clear();
        this.bindingPoints.clear();
        this.aloneExisting.clear();
        this.aloneNew.clear();
    }

    public final boolean getRebindInProgress() {
        return this.rebindInProgress;
    }

    public final ReusableTokenList getReusableList() {
        return this.reusableList;
    }

    public final boolean prepareAndRebind(j3 j3Var, j3 j3Var2, ViewGroup viewGroup, DivStatePath divStatePath) {
        boolean z;
        clear();
        this.rebindInProgress = true;
        try {
            z = calculateDiff(j3Var, j3Var2, viewGroup);
        } catch (UnsupportedElementException e) {
            this.reporter.onComplexRebindUnsupportedElementException(e);
            z = false;
        }
        if (z) {
            return rebind(divStatePath);
        }
        return false;
    }
}
