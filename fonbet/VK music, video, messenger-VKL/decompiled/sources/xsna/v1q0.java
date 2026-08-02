package xsna;

import android.view.View;
import android.widget.PopupWindow;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;

/* compiled from: UiTrackingPopupWindow.kt */
/* loaded from: classes17.dex */
public final class v1q0 extends PopupWindow implements n0q0 {
    public final n0q0 b;
    public PopupWindow.OnDismissListener c;

    public v1q0(n0q0 n0q0Var, View view, int i, int i2) {
        super(view, i, i2, false);
        this.b = n0q0Var;
        super.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: xsna.u1q0
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                PopupWindow.OnDismissListener onDismissListener = v1q0.this.c;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss();
                }
                UiTracker.i.g();
            }
        });
    }

    @Override // android.widget.PopupWindow
    public final void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.c = onDismissListener;
    }

    @Override // android.widget.PopupWindow
    public final void showAsDropDown(View view, int i, int i2, int i3) {
        super.showAsDropDown(view, i, i2, i3);
        l1q0 l1q0Var = UiTracker.i;
        n0q0 n0q0Var = this.b;
        if (n0q0Var == null) {
            n0q0Var = this;
        }
        if (l1q0Var.c()) {
            boolean z = l1q0Var.b;
            l1q0Var.b = false;
            if (z) {
                return;
            }
            l1q0Var.f(UiTracker.e().g(n0q0Var), true);
        }
    }

    @Override // android.widget.PopupWindow
    public final void showAtLocation(View view, int i, int i2, int i3) {
        super.showAtLocation(view, i, i2, i3);
        l1q0 l1q0Var = UiTracker.i;
        n0q0 n0q0Var = this.b;
        if (n0q0Var == null) {
            n0q0Var = this;
        }
        if (l1q0Var.c()) {
            boolean z = l1q0Var.b;
            l1q0Var.b = false;
            if (z) {
                return;
            }
            l1q0Var.f(UiTracker.e().g(n0q0Var), true);
        }
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
