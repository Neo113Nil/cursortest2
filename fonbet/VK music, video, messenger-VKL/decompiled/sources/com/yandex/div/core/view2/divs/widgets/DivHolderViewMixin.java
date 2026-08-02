package com.yandex.div.core.view2.divs.widgets;

import android.view.View;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.internal.widget.TransientView;
import com.yandex.div.internal.widget.TransientViewMixin;
import com.yandex.div2.a;
import com.yandex.div2.u1;
import java.util.ArrayList;
import java.util.List;

/* compiled from: DivHolderView.kt */
/* loaded from: classes7.dex */
public final class DivHolderViewMixin<T extends a> implements DivHolderView<T>, DivBorderSupports, TransientView {
    private BindingContext bindingContext;
    private T div;
    private final /* synthetic */ DivBorderSupportsMixin $$delegate_0 = new DivBorderSupportsMixin();
    private final /* synthetic */ TransientViewMixin $$delegate_1 = new TransientViewMixin();
    private final List<Disposable> subscriptions = new ArrayList();

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public BindingContext getBindingContext() {
        return this.bindingContext;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public T getDiv() {
        return this.div;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public DivBorderDrawer getDivBorderDrawer() {
        return this.$$delegate_0.getDivBorderDrawer();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public boolean getNeedClipping() {
        return this.$$delegate_0.getNeedClipping();
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public List<Disposable> getSubscriptions() {
        return this.subscriptions;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void invalidateBorder() {
        this.$$delegate_0.invalidateBorder();
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public boolean isTransient() {
        return this.$$delegate_1.isTransient();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void onBoundsChanged(int i, int i2) {
        this.$$delegate_0.onBoundsChanged(i, i2);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void releaseBorderDrawer() {
        this.$$delegate_0.releaseBorderDrawer();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public void setBindingContext(BindingContext bindingContext) {
        this.bindingContext = bindingContext;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setBorder(BindingContext bindingContext, u1 u1Var, View view) {
        this.$$delegate_0.setBorder(bindingContext, u1Var, view);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public void setDiv(T t) {
        this.div = t;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setNeedClipping(boolean z) {
        this.$$delegate_0.setNeedClipping(z);
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionFinished(View view) {
        this.$$delegate_1.transitionFinished(view);
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionStarted(View view) {
        this.$$delegate_1.transitionStarted(view);
    }
}
