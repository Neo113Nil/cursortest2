package xsna;

import com.vk.dto.common.id.UserId;
import xsna.sft0;

/* compiled from: VoipPlaylistVideosRepositoryImpl.kt */
/* loaded from: classes7.dex */
public final class nvw0 implements q0x0, w8i {
    public final uft0 b;
    public final iid c;
    public final int d;
    public final bpn0 e = new bpn0(new oqh0(this, 28));

    public nvw0(uft0 uft0Var, iid iidVar, int i) {
        this.b = uft0Var;
        this.c = iidVar;
        this.d = i;
    }

    @Override // xsna.q0x0
    public final io.reactivex.rxjava3.internal.operators.single.y a(UserId userId, String str) {
        String s;
        dz2 x = yfb.x(sft0.a.b(this.b, userId, null, Integer.valueOf(this.d), 20, str != null ? Integer.valueOf(Integer.parseInt(str)) : null, Boolean.TRUE, q0x0.H7, 16773934));
        UserId f = ((rew0) this.e.getValue()).f();
        if (fkq0.c(f) && !o25.a().a(f) && (s = o25.a().s(f)) != null) {
            x.l = s;
            x.m = null;
        }
        return rsg0.w0(x).l(new pi40(new xvl0(this, 23), 23));
    }
}
