package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: VoipAddedVideosRepositoryImpl.kt */
/* loaded from: classes7.dex */
public final class zcw0 implements q0x0, w8i {
    public final uft0 b;
    public final iid c;
    public final bpn0 d = new bpn0(new o8u0(this, 4));

    public zcw0(uft0 uft0Var, iid iidVar) {
        this.b = uft0Var;
        this.c = iidVar;
    }

    @Override // xsna.q0x0
    public final io.reactivex.rxjava3.internal.operators.single.y a(UserId userId, String str) {
        String s;
        dz2 x = yfb.x(this.b.D(-2, str, 20, userId, q0x0.H7));
        UserId f = ((rew0) this.d.getValue()).f();
        if (fkq0.c(f) && !o25.a().a(f) && (s = o25.a().s(f)) != null) {
            x.l = s;
            x.m = null;
        }
        return rsg0.w0(x).l(new fhb0(new qjg0(this, 24), 16));
    }
}
