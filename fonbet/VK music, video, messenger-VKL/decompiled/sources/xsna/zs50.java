package xsna;

import android.content.Context;
import com.vk.superapp.advertisement.api.dto.BannerSlotType;

/* compiled from: MyTargetStickyBannerAdTypeDelegate.kt */
/* loaded from: classes6.dex */
public final class zs50 implements iel0 {
    public final bpn0 a = new bpn0(new zq3(22));

    @Override // xsna.iel0
    public final ydl0 a(Context context, gel0 gel0Var, df0 df0Var) {
        int i = gel0Var.a;
        return ((Boolean) this.a.getValue()).booleanValue() ? new ct50(context, i, df0Var) : new ys50(context, i, df0Var);
    }

    @Override // xsna.iel0
    public final boolean b(gel0 gel0Var) {
        return gel0Var.c == null && gel0Var.b == BannerSlotType.AD;
    }
}
