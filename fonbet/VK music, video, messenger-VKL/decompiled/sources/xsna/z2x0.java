package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: VoipUploadedVideosRepositoryImpl.kt */
/* loaded from: classes7.dex */
public final class z2x0 implements q0x0, w8i {
    public final uft0 b;
    public final iid c;
    public final bpn0 d = new bpn0(new sxq0(this, 5));

    public z2x0(uft0 uft0Var, iid iidVar) {
        this.b = uft0Var;
        this.c = iidVar;
    }

    @Override // xsna.q0x0
    public final io.reactivex.rxjava3.internal.operators.single.y a(UserId userId, String str) {
        String s;
        dz2 x = yfb.x(this.b.D(-1, str, 20, userId, q0x0.H7));
        UserId f = ((rew0) this.d.getValue()).f();
        if (fkq0.c(f) && !o25.a().a(f) && (s = o25.a().s(f)) != null) {
            x.l = s;
            x.m = null;
        }
        return rsg0.w0(x).l(new y2x0(new emh0(this, 29)));
    }
}
