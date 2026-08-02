package com.yandex.div.core.view2.state;

import android.view.View;
import com.yandex.div.core.state.DivPathUtils;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.widgets.DivStateLayout;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.a;
import com.yandex.div2.j3;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import xsna.j5g;

/* compiled from: DivJoinedStateSwitcher.kt */
/* loaded from: classes7.dex */
public final class DivJoinedStateSwitcher implements DivStateSwitcher {
    private final DivBinder divBinder;
    private final Div2View divView;

    public DivJoinedStateSwitcher(Div2View div2View, DivBinder divBinder) {
        this.divView = div2View;
        this.divBinder = divBinder;
    }

    private final DivStatePath findCommonPath(List<DivStatePath> list, DivStatePath divStatePath) {
        int size = list.size();
        if (size == 0) {
            return divStatePath;
        }
        if (size == 1) {
            return (DivStatePath) j5g.Y(list);
        }
        Iterator<T> it = list.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            DivStatePath divStatePath2 = (DivStatePath) it.next();
            next = DivStatePath.Companion.lowestCommonAncestor$div_release((DivStatePath) next, divStatePath2);
            if (next == null) {
                next = divStatePath;
            }
        }
        return (DivStatePath) next;
    }

    @Override // com.yandex.div.core.view2.state.DivStateSwitcher
    public void switchStates(j3.b bVar, List<DivStatePath> list, ExpressionResolver expressionResolver) {
        View childAt = this.divView.getChildAt(0);
        a aVar = bVar.a;
        DivStatePath fromState$div_release = DivStatePath.Companion.fromState$div_release(bVar);
        DivStatePath findCommonPath = findCommonPath(list, fromState$div_release);
        if (!findCommonPath.isRootPath()) {
            Pair<DivStateLayout, a.m> tryFindStateDivAndLayout$div_release = DivPathUtils.INSTANCE.tryFindStateDivAndLayout$div_release(childAt, bVar, findCommonPath, expressionResolver);
            if (tryFindStateDivAndLayout$div_release == null) {
                return;
            }
            DivStateLayout d = tryFindStateDivAndLayout$div_release.d();
            a.m g = tryFindStateDivAndLayout$div_release.g();
            if (d != null) {
                DivStatePath path = d.getPath();
                fromState$div_release = path == null ? findCommonPath : path;
                aVar = g;
                childAt = d;
            }
        }
        BindingContext bindingContext = BaseDivViewExtensionsKt.getBindingContext(childAt);
        if (bindingContext == null) {
            bindingContext = this.divView.getBindingContext$div_release();
        }
        this.divBinder.bind(bindingContext, childAt, aVar, fromState$div_release.parentState());
        this.divBinder.attachIndicators$div_release();
    }
}
