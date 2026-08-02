package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: VoipPlaylistRepositoryImpl.kt */
/* loaded from: classes7.dex */
public final class kvw0 implements w8i {
    public final uft0 b;
    public final bpn0 c = new bpn0(new uhs0(this, 12));

    public kvw0(uft0 uft0Var, iid iidVar) {
        this.b = uft0Var;
    }

    public final io.reactivex.rxjava3.internal.operators.single.y a(int i, Integer num, UserId userId) {
        String s;
        dz2 x = yfb.x(this.b.t(userId, num, Integer.valueOf(i)));
        UserId f = ((rew0) this.c.getValue()).f();
        if (fkq0.c(f) && !o25.a().a(f) && (s = o25.a().s(f)) != null) {
            x.l = s;
            x.m = null;
        }
        return rsg0.w0(x).l(new xq70(new m4k0(this), 27));
    }
}
