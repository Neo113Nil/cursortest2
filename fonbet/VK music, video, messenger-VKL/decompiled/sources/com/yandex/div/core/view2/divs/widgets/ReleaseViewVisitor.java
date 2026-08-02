package com.yandex.div.core.view2.divs.widgets;

import android.view.View;
import com.yandex.div.core.DivCustomContainerViewAdapter;
import com.yandex.div.core.extension.DivExtensionController;
import com.yandex.div.core.util.ReleasablesKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.Releasable;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.a;
import com.yandex.div2.g3;
import java.util.Iterator;
import xsna.ikn;

/* compiled from: ReleaseViewVisitor.kt */
/* loaded from: classes7.dex */
public class ReleaseViewVisitor extends DivViewVisitor {
    private final DivCustomContainerViewAdapter divCustomContainerViewAdapter;
    private final DivExtensionController divExtensionController;
    private final Div2View divView;

    public ReleaseViewVisitor(Div2View div2View, DivCustomContainerViewAdapter divCustomContainerViewAdapter, DivExtensionController divExtensionController) {
        this.divView = div2View;
        this.divCustomContainerViewAdapter = divCustomContainerViewAdapter;
        this.divExtensionController = divExtensionController;
    }

    private void releaseInternal(View view, ikn iknVar, ExpressionResolver expressionResolver) {
        if (iknVar != null && expressionResolver != null) {
            this.divExtensionController.unbindView(this.divView, expressionResolver, view, iknVar);
        }
        release$div_release(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    public void defaultVisit(DivHolderView<?> divHolderView) {
        View view = (View) divHolderView;
        a div = divHolderView.getDiv();
        ikn b = div != null ? div.b() : null;
        BindingContext bindingContext = divHolderView.getBindingContext();
        releaseInternal(view, b, bindingContext != null ? bindingContext.getExpressionResolver() : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void release$div_release(View view) {
        if (view instanceof Releasable) {
            ((Releasable) view).release();
        }
        Iterable<Releasable> releasableList = ReleasablesKt.getReleasableList(view);
        if (releasableList != null) {
            Iterator<Releasable> it = releasableList.iterator();
            while (it.hasNext()) {
                it.next().release();
            }
        }
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    public void visit(DivPagerView divPagerView) {
        super.visit(divPagerView);
        divPagerView.getViewPager().setAdapter(null);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    public void visit(DivRecyclerView divRecyclerView) {
        super.visit(divRecyclerView);
        divRecyclerView.setAdapter(null);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    public void visit(DivCustomWrapper divCustomWrapper) {
        ExpressionResolver expressionResolver;
        a.b div = divCustomWrapper.getDiv();
        if (div == null) {
            return;
        }
        g3 g3Var = div.c;
        BindingContext bindingContext = divCustomWrapper.getBindingContext();
        if (bindingContext == null || (expressionResolver = bindingContext.getExpressionResolver()) == null) {
            return;
        }
        release$div_release(divCustomWrapper);
        View customView = divCustomWrapper.getCustomView();
        if (customView != null) {
            this.divExtensionController.unbindView(this.divView, expressionResolver, customView, g3Var);
            this.divCustomContainerViewAdapter.release(customView, g3Var);
        }
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    public void visit(View view) {
        release$div_release(view);
    }
}
