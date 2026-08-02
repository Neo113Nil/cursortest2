package xsna;

import com.vk.core.ui.themes.VKTheme;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.engine.models.dialogs.DialogTheme;

/* compiled from: MsgListBuilderTheme.kt */
/* loaded from: classes2.dex */
public final class wk30 implements vk30 {
    public static final pue c = new pue(5);
    public final DialogTheme a;
    public final boolean b;

    public wk30(DialogTheme dialogTheme, boolean z) {
        this.a = dialogTheme;
        this.b = z;
    }

    @Override // xsna.vk30
    public final boolean a() {
        return c4g0.w(this.a);
    }

    @Override // xsna.vk30
    public final gl8 b(BubbleColors bubbleColors, int i, boolean z) {
        return z ? new gl8(bubbleColors.y, bubbleColors.z) : this.b ? new gl8(bubbleColors.v, bubbleColors.w) : new gl8(bubbleColors.p, bubbleColors.q);
    }

    @Override // xsna.vk30
    public final BubbleColors c(long j, boolean z, boolean z2) {
        VKTheme C = dhr0.C();
        dhr0.a.getClass();
        ehr0 ehr0Var = dhr0.e;
        VKTheme vKTheme = ehr0Var.a;
        VKTheme vKTheme2 = ehr0Var.b;
        boolean z3 = C.equals(vKTheme) || C.equals(vKTheme2);
        if (!z2) {
            vKTheme2 = z3 ? ehr0Var.a : dhr0.z();
        } else if (!z3) {
            vKTheme2 = dhr0.u();
        }
        return this.a.Ab(vKTheme2, j, z);
    }
}
