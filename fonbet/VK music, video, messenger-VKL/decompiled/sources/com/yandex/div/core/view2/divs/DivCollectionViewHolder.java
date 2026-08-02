package com.yandex.div.core.view2.divs;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.animations.DivComparator;
import com.yandex.div.core.view2.divs.widgets.DivHolderView;
import com.yandex.div.core.view2.divs.widgets.ReleaseUtils;
import com.yandex.div.core.view2.reuse.util.RebindUtilsKt;
import com.yandex.div.core.widget.DivViewWrapper;
import com.yandex.div.json.expressions.ExpressionResolver;

/* compiled from: DivCollectionViewHolder.kt */
/* loaded from: classes7.dex */
public abstract class DivCollectionViewHolder extends RecyclerView.e0 {
    private final DivBinder divBinder;
    private com.yandex.div2.a oldDiv;
    private final BindingContext parentContext;
    private final DivViewCreator viewCreator;
    private final DivViewWrapper viewWrapper;

    public DivCollectionViewHolder(DivViewWrapper divViewWrapper, BindingContext bindingContext, DivBinder divBinder, DivViewCreator divViewCreator) {
        super(divViewWrapper);
        this.viewWrapper = divViewWrapper;
        this.parentContext = bindingContext;
        this.divBinder = divBinder;
        this.viewCreator = divViewCreator;
    }

    private final View createChildView(BindingContext bindingContext, com.yandex.div2.a aVar) {
        if (this.oldDiv != null) {
            logReuseError();
        }
        ReleaseUtils.INSTANCE.releaseAndRemoveChildren$div_release(this.viewWrapper, bindingContext.getDivView());
        return this.viewCreator.create(aVar, bindingContext.getExpressionResolver());
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r10 != null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void bind(BindingContext bindingContext, com.yandex.div2.a aVar, int i, DivStatePath divStatePath) {
        com.yandex.div2.a aVar2;
        View view;
        BindingContext bindingContext2;
        ExpressionResolver expressionResolver;
        Div2View divView = bindingContext.getDivView();
        ExpressionResolver expressionResolver2 = bindingContext.getExpressionResolver();
        if (RebindUtilsKt.tryRebindRecycleContainerChildren(this.viewWrapper, divView, aVar)) {
            this.oldDiv = aVar;
            return;
        }
        View child = this.viewWrapper.getChild();
        if (child != null) {
            view = null;
            if (this.oldDiv == null) {
                child = null;
            }
            if (child != null) {
                DivHolderView divHolderView = child instanceof DivHolderView ? (DivHolderView) child : null;
                if (divHolderView == null || (bindingContext2 = divHolderView.getBindingContext()) == null || (expressionResolver = bindingContext2.getExpressionResolver()) == null) {
                    aVar2 = aVar;
                } else {
                    boolean areDivsReplaceable$default = DivComparator.areDivsReplaceable$default(DivComparator.INSTANCE, this.oldDiv, aVar, expressionResolver, expressionResolver2, null, 16, null);
                    aVar2 = aVar;
                    expressionResolver2 = expressionResolver2;
                    if (areDivsReplaceable$default) {
                        view = child;
                    }
                }
            }
        }
        aVar2 = aVar;
        view = createChildView(bindingContext, aVar2);
        this.viewWrapper.addView(view);
        this.oldDiv = aVar2;
        divView.getRuntimeStore$div_release().resolveRuntimeWith(divView, divStatePath, aVar2, expressionResolver2, this.parentContext.getExpressionResolver());
        this.divBinder.bind(bindingContext, view, aVar2, divStatePath);
        updateWrapperLayoutParams(view);
        divView.getRuntimeStore$div_release().showWarningIfNeeded(aVar2.b());
    }

    public final com.yandex.div2.a getOldDiv() {
        return this.oldDiv;
    }

    public abstract void logReuseError();

    public final void updateState() {
        BindingContext bindingContext;
        View child = this.viewWrapper.getChild();
        if (child == null || (bindingContext = BaseDivViewExtensionsKt.getBindingContext(child)) == null) {
            return;
        }
        BaseDivViewExtensionsKt.bindStates(child, bindingContext, this.divBinder);
    }

    public void updateWrapperLayoutParams(View view) {
    }
}
