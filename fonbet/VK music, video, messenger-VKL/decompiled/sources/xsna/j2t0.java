package xsna;

import com.vk.dto.common.id.UserId;
import xsna.sft0;

/* compiled from: VideoPickerFeature.kt */
/* loaded from: classes4.dex */
public final class j2t0 implements zf90 {
    public final /* synthetic */ l2t0 a;

    public j2t0(l2t0 l2t0Var) {
        this.a = l2t0Var;
    }

    @Override // xsna.zf90
    public final io.reactivex.rxjava3.core.q<e3t0<p2t0>> a(int i, int i2) {
        l2t0 l2t0Var = this.a;
        a3t0 a3t0Var = l2t0Var.h;
        UserId userId = l2t0Var.f;
        Integer num = l2t0Var.i;
        uft0 uft0Var = a3t0Var.a;
        if (!fkq0.c(userId)) {
            userId = null;
        }
        return new io.reactivex.rxjava3.internal.operators.single.o(rsg0.w0(yfb.x(sft0.a.b(uft0Var, userId, null, num, Integer.valueOf(i2), Integer.valueOf(i), null, null, 16777006))).l(new o8c0(new alj0(a3t0Var, 25), 9)).l(new adz(new qso(i, 3), 16)), new h2t0(new vyq0(l2t0Var, 6), 0)).h(new v4r0(new u2k0(l2t0Var, 22), 2)).w();
    }
}
