package xsna;

import com.vk.dto.music.MusicTrack;
import kotlin.NoWhenBranchMatchedException;
import xsna.bgp0;
import xsna.wzm0;

/* compiled from: TrackMenuReducer.kt */
/* loaded from: classes3.dex */
public final class dgp0 extends dm50<ggp0, bgp0, fgp0> {
    @Override // xsna.dm50
    public final fgp0 c(fgp0 fgp0Var, bgp0 bgp0Var) {
        fgp0 fgp0Var2 = fgp0Var;
        bgp0 bgp0Var2 = bgp0Var;
        if (bgp0Var2 instanceof bgp0.a) {
            return fgp0.a(fgp0Var2, null, ((bgp0.a) bgp0Var2).b, null, null, 59);
        }
        if (bgp0Var2 instanceof bgp0.c) {
            bgp0.c cVar = (bgp0.c) bgp0Var2;
            if (epx.f(cVar.b, fgp0Var2.b)) {
                return fgp0.a(fgp0Var2, null, null, cVar.c, null, 55);
            }
        } else {
            if (!(bgp0Var2 instanceof bgp0.d)) {
                if (!(bgp0Var2 instanceof bgp0.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                MusicTrack musicTrack = fgp0Var2.b;
                ((bgp0.b) bgp0Var2).getClass();
                return fgp0.a(fgp0Var2, MusicTrack.zb(musicTrack, 0, null, 0, 0, null, false, null, null, false, false, null, null, null, -1, 1048319), null, null, null, 62);
            }
            bgp0.d dVar = (bgp0.d) bgp0Var2;
            String str = dVar.b;
            String str2 = dVar.c;
            fgp0 a = (str == null || str2 == null) ? null : fgp0.a(fgp0Var2, null, null, null, new wzm0.a(str, str2), 47);
            if (a != null) {
                return a;
            }
        }
        return fgp0Var2;
    }

    @Override // xsna.dm50
    public final ggp0 d() {
        return new ggp0(e(new ev60(15)));
    }

    @Override // xsna.dm50
    public final void h(fgp0 fgp0Var, ggp0 ggp0Var) {
        f(ggp0Var.a, fgp0Var);
    }
}
