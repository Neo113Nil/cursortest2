package com.yandex.div.core.view2.divs;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.R$id;
import com.yandex.div.core.DivCustomContainerViewAdapter;
import com.yandex.div.core.extension.DivExtensionController;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.divs.widgets.DivCustomWrapper;
import com.yandex.div.core.view2.divs.widgets.DivViewVisitorKt;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.a;
import com.yandex.div2.g3;
import java.util.List;
import xsna.e9e0;
import xsna.epx;
import xsna.gzs;
import xsna.izs;
import xsna.mxt0;
import xsna.s3q0;

/* compiled from: DivCustomBinder.kt */
/* loaded from: classes7.dex */
public final class DivCustomBinder extends DivViewBinder<a.b, g3, DivCustomWrapper> {
    private final DivBaseBinder baseBinder;
    private final e9e0<DivBinder> divBinder;
    private final DivCustomContainerViewAdapter divCustomContainerViewAdapter;
    private final DivExtensionController extensionController;

    public DivCustomBinder(DivBaseBinder divBaseBinder, DivCustomContainerViewAdapter divCustomContainerViewAdapter, DivExtensionController divExtensionController, e9e0<DivBinder> e9e0Var) {
        super(divBaseBinder);
        this.baseBinder = divBaseBinder;
        this.divCustomContainerViewAdapter = divCustomContainerViewAdapter;
        this.extensionController = divExtensionController;
        this.divBinder = e9e0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void bind(DivCustomWrapper divCustomWrapper, View view, g3 g3Var, g3 g3Var2, BindingContext bindingContext, gzs<? extends View> gzsVar, izs<? super View, s3q0> izsVar) {
        View invoke;
        List<com.yandex.div2.a> nonNullItems;
        g3 g3Var3;
        if (view != null) {
            a.b div = divCustomWrapper.getDiv();
            if (epx.f((div == null || (g3Var3 = div.c) == null) ? null : g3Var3.j, g3Var2.j) && g3Var != null && (nonNullItems = DivCollectionExtensionsKt.getNonNullItems(g3Var)) != null && nonNullItems.size() == DivCollectionExtensionsKt.getNonNullItems(g3Var2).size()) {
                invoke = view;
                Div2View divView = bindingContext.getDivView();
                if (!epx.f(view, invoke)) {
                    replaceInParent(divCustomWrapper, invoke, divView);
                }
                izsVar.invoke(invoke);
                this.baseBinder.bindId$div_release(divView, invoke, g3Var2.p);
                this.extensionController.bindView(divView, bindingContext.getExpressionResolver(), invoke, g3Var2);
            }
        }
        invoke = gzsVar.invoke();
        invoke.setTag(R$id.div_custom_tag, g3Var2);
        Div2View divView2 = bindingContext.getDivView();
        if (!epx.f(view, invoke)) {
        }
        izsVar.invoke(invoke);
        this.baseBinder.bindId$div_release(divView2, invoke, g3Var2.p);
        this.extensionController.bindView(divView2, bindingContext.getExpressionResolver(), invoke, g3Var2);
    }

    private final void replaceInParent(ViewGroup viewGroup, View view, Div2View div2View) {
        if (viewGroup.getChildCount() != 0) {
            DivViewVisitorKt.visitViewTree(div2View.getReleaseViewVisitor$div_release(), mxt0.a(0, viewGroup));
            viewGroup.removeViewAt(0);
        }
        viewGroup.addView(view);
    }

    public void bindView(BindingContext bindingContext, DivCustomWrapper divCustomWrapper, a.b bVar, final DivStatePath divStatePath) {
        BindingContext bindingContext2;
        ExpressionResolver expressionResolver;
        View customView = divCustomWrapper.getCustomView();
        a.b div = divCustomWrapper.getDiv();
        final Div2View divView = bindingContext.getDivView();
        final ExpressionResolver expressionResolver2 = bindingContext.getExpressionResolver();
        if (div == bVar) {
            BaseDivViewExtensionsKt.bindStates(divCustomWrapper, bindingContext, this.divBinder.get());
            return;
        }
        if (customView != null && div != null && (bindingContext2 = divCustomWrapper.getBindingContext()) != null && (expressionResolver = bindingContext2.getExpressionResolver()) != null) {
            this.extensionController.unbindView(divView, expressionResolver, customView, div.b());
        }
        this.baseBinder.bindView(bindingContext, divCustomWrapper, bVar, div);
        this.baseBinder.bindId$div_release(divView, divCustomWrapper, null);
        final g3 g3Var = bVar.c;
        if (this.divCustomContainerViewAdapter.isCustomTypeSupported(g3Var.j)) {
            bind(divCustomWrapper, customView, div != null ? div.c : null, g3Var, bindingContext, new gzs<View>() { // from class: com.yandex.div.core.view2.divs.DivCustomBinder$bindView$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // xsna.gzs
                public final View invoke() {
                    DivCustomContainerViewAdapter divCustomContainerViewAdapter;
                    divCustomContainerViewAdapter = DivCustomBinder.this.divCustomContainerViewAdapter;
                    return divCustomContainerViewAdapter.createView(g3Var, divView, expressionResolver2, divStatePath);
                }
            }, new izs<View, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivCustomBinder$bindView$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // xsna.izs
                public /* bridge */ /* synthetic */ s3q0 invoke(View view) {
                    invoke2(view);
                    return s3q0.a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(View view) {
                    DivCustomContainerViewAdapter divCustomContainerViewAdapter;
                    divCustomContainerViewAdapter = DivCustomBinder.this.divCustomContainerViewAdapter;
                    divCustomContainerViewAdapter.bindView(view, g3Var, divView, expressionResolver2, divStatePath);
                }
            });
        }
    }
}
