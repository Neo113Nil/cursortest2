package xsna;

import com.vk.catalog.mvi.block.music.impl.entity.PlayingState;

/* compiled from: MusicTrack.kt */
/* loaded from: classes16.dex */
public final class ab50 implements z190 {
    public final wh50 a;

    public ab50(PlayingState playingState) {
        this.a = androidx.compose.runtime.k.b(playingState);
    }

    @Override // xsna.z190
    public final void a(final int i, final long j, androidx.compose.runtime.a aVar, final q630 q630Var) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1444386538);
        if ((i & 48) == 0) {
            i2 = (M.J(q630Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1444386538, i2, -1, "com.vk.catalog.mvi.block.music.impl.ui.musictrack.MusicTrackCoverOverlay.invoke (MusicTrack.kt:162)");
            }
            wh50 wh50Var = this.a;
            if (((PlayingState) ((zak0) wh50Var).getValue()) != PlayingState.NONE) {
                M.K(-1557840418);
                float f = 2;
                float f2 = 18;
                float f3 = 4;
                float f4 = 10;
                q6b0.a(new t6b0(((PlayingState) ((zak0) wh50Var).getValue()) == PlayingState.PLAYING, f, f2, f3, f, f3, l5g.d, e43.l(new pco(f4), new pco(16), new pco(f2), new pco(f4)), new l5g(l5g.c(14, l5g.b, 0.3f))), ahn.E(q630Var, "playingIndicator"), M, 0);
            } else {
                M.K(-1564036264);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.za50
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i | 1);
                    ab50.this.a(I, j, (androidx.compose.runtime.a) obj, q630Var);
                    return s3q0.a;
                }
            };
        }
    }
}
