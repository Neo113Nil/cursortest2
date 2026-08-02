package xsna;

import com.vk.music.common.MusicPlaybackLaunchContext;

/* compiled from: MusicHandler.kt */
/* loaded from: classes7.dex */
public final class bl40 implements fhd0, lao0 {
    public final xk40 a;

    public bl40(xk40 xk40Var) {
        this.a = xk40Var;
    }

    @Override // xsna.g9l
    public final void a(fgx fgxVar) {
        String str = blk.O(fgxVar).d;
        if (str == null) {
            str = MusicPlaybackLaunchContext.P.t();
        }
        yk40 builder = this.a.builder();
        builder.C(o25.a().c());
        builder.E(str);
        builder.b(fgxVar.d.toString(), false);
        builder.B(fgxVar.e);
        blk.P(fgxVar).onSuccess();
    }
}
