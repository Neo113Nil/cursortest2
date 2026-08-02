package xsna;

import android.view.View;
import com.vk.core.tool.view.vkblur.VkBlurView;

/* compiled from: View.kt */
/* loaded from: classes17.dex */
public final class pw20 implements View.OnLayoutChangeListener {
    public final /* synthetic */ nw20 b;

    public pw20(nw20 nw20Var) {
        this.b = nw20Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        nw20 nw20Var = this.b;
        if (!nw20Var.H0 && nw20Var.I0) {
            nw20.p(nw20Var);
        }
        nw20.n(nw20Var, nw20Var.n0);
        nw20.n(nw20Var, nw20Var.p0);
        nw20.o(nw20Var);
        nw20Var.x();
        VkBlurView vkBlurView = nw20Var.x0;
        if (vkBlurView != null) {
            vkBlurView.invalidate();
        }
    }
}
