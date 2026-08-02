package com.yandex.div.core.view2.divs;

import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.yandex.div.R$dimen;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.widgets.DivBorderSupports;
import com.yandex.div.internal.util.CollectionsKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAction;
import com.yandex.div2.u1;
import java.util.List;
import xsna.epx;

/* compiled from: DivFocusBinder.kt */
/* loaded from: classes7.dex */
public class DivFocusBinder {
    private final DivActionBinder actionBinder;

    /* compiled from: DivFocusBinder.kt */
    public final class FocusChangeListener implements View.OnFocusChangeListener {
        private List<DivAction> blurActions;
        private u1 blurredBorder;
        private final BindingContext context;
        private List<DivAction> focusActions;
        private u1 focusedBorder;

        public FocusChangeListener(BindingContext bindingContext) {
            this.context = bindingContext;
        }

        private final void applyBorder(View view, u1 u1Var) {
            DivFocusBinder.this.applyBorder(view, this.context, u1Var);
        }

        private final void handle(List<DivAction> list, View view, String str) {
            DivFocusBinder.this.actionBinder.handleBulkActions$div_release(this.context, view, list, str);
        }

        public final List<DivAction> getBlurActions() {
            return this.blurActions;
        }

        public final u1 getBlurredBorder() {
            return this.blurredBorder;
        }

        public final List<DivAction> getFocusActions() {
            return this.focusActions;
        }

        public final u1 getFocusedBorder() {
            return this.focusedBorder;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            if (z) {
                applyBorder(view, this.focusedBorder);
                List<DivAction> list = this.focusActions;
                if (list != null) {
                    handle(list, view, "focus");
                    return;
                }
                return;
            }
            if (this.focusedBorder != null) {
                applyBorder(view, this.blurredBorder);
            }
            List<DivAction> list2 = this.blurActions;
            if (list2 != null) {
                handle(list2, view, "blur");
            }
        }

        public final void setActions(List<DivAction> list, List<DivAction> list2) {
            this.focusActions = list;
            this.blurActions = list2;
        }

        public final void setBorders(u1 u1Var, u1 u1Var2) {
            this.focusedBorder = u1Var;
            this.blurredBorder = u1Var2;
        }
    }

    public DivFocusBinder(DivActionBinder divActionBinder) {
        this.actionBinder = divActionBinder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void applyBorder(View view, BindingContext bindingContext, u1 u1Var) {
        if (view instanceof DivBorderSupports) {
            ((DivBorderSupports) view).setBorder(bindingContext, u1Var, view);
            return;
        }
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (u1Var != null && !isConstantlyEmpty(u1Var) && u1Var.c.evaluate(bindingContext.getExpressionResolver()).booleanValue() && u1Var.d == null) {
            f = view.getResources().getDimension(R$dimen.div_shadow_elevation);
        }
        view.setElevation(f);
    }

    private boolean isConstantlyEmpty(u1 u1Var) {
        if (u1Var == null) {
            return true;
        }
        return u1Var.a == null && u1Var.b == null && epx.f(u1Var.c, Expression.Companion.constant$default(Expression.Companion, Boolean.FALSE, null, 2, null)) && u1Var.d == null && u1Var.e == null;
    }

    public void bindDivBorder(View view, BindingContext bindingContext, u1 u1Var, u1 u1Var2) {
        applyBorder(view, bindingContext, (u1Var == null || isConstantlyEmpty(u1Var) || !view.isFocused()) ? u1Var2 : u1Var);
        View.OnFocusChangeListener onFocusChangeListener = view.getOnFocusChangeListener();
        FocusChangeListener focusChangeListener = onFocusChangeListener instanceof FocusChangeListener ? (FocusChangeListener) onFocusChangeListener : null;
        if (focusChangeListener == null && isConstantlyEmpty(u1Var)) {
            return;
        }
        if (focusChangeListener != null && focusChangeListener.getFocusActions() == null && focusChangeListener.getBlurActions() == null && isConstantlyEmpty(u1Var)) {
            view.setOnFocusChangeListener(null);
            return;
        }
        FocusChangeListener focusChangeListener2 = new FocusChangeListener(bindingContext);
        focusChangeListener2.setBorders(u1Var, u1Var2);
        if (focusChangeListener != null) {
            focusChangeListener2.setActions(focusChangeListener.getFocusActions(), focusChangeListener.getBlurActions());
        }
        view.setOnFocusChangeListener(focusChangeListener2);
    }

    public void bindDivFocusActions(View view, BindingContext bindingContext, List<DivAction> list, List<DivAction> list2) {
        View.OnFocusChangeListener onFocusChangeListener = view.getOnFocusChangeListener();
        FocusChangeListener focusChangeListener = onFocusChangeListener instanceof FocusChangeListener ? (FocusChangeListener) onFocusChangeListener : null;
        if (focusChangeListener == null && CollectionsKt.allIsNullOrEmpty(list, list2)) {
            return;
        }
        if (focusChangeListener != null && focusChangeListener.getFocusedBorder() == null && CollectionsKt.allIsNullOrEmpty(list, list2)) {
            view.setOnFocusChangeListener(null);
            return;
        }
        FocusChangeListener focusChangeListener2 = new FocusChangeListener(bindingContext);
        if (focusChangeListener != null) {
            focusChangeListener2.setBorders(focusChangeListener.getFocusedBorder(), focusChangeListener.getBlurredBorder());
        }
        focusChangeListener2.setActions(list, list2);
        view.setOnFocusChangeListener(focusChangeListener2);
    }
}
