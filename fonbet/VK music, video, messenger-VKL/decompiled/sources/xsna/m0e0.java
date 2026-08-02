package xsna;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$BalloonTilt;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import com.vk.dto.hints.Hint;
import xsna.m8v0;

/* compiled from: ViewExt.kt */
/* loaded from: classes5.dex */
public final class m0e0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ o0e0 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ Hint d;
    public final /* synthetic */ Lifecycle e;

    public m0e0(o0e0 o0e0Var, View view, Hint hint, Lifecycle lifecycle) {
        this.b = o0e0Var;
        this.c = view;
        this.d = hint;
        this.e = lifecycle;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        o0e0 o0e0Var = this.b;
        h7v h7vVar = o0e0Var.a;
        if (h7vVar.n()) {
            return;
        }
        View view2 = this.c;
        h7vVar.k(view2);
        Hint hint = this.d;
        String str = hint.c;
        if (str == null) {
            str = "";
        }
        int i9 = m8v0.M;
        m8v0.a.a(view2, str, null, VkTooltip$MarkerStyle.Style3, VkTooltip$MarkerSize.Size146, null, VkTooltip$BalloonPosition.Bottom, VkTooltip$BalloonTilt.Left, new u5l(view2, 1), new n0e0(view2), null, null, null, new ziw(o0e0Var, 1), null, 0, false, this.e, null, false, null, false, 12966948);
        h7vVar.b(hint.b);
    }
}
