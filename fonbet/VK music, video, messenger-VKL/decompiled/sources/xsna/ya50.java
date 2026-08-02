package xsna;

/* compiled from: MusicTrack.kt */
/* loaded from: classes16.dex */
public final class ya50 implements efj {
    public static final float b = 8;
    public final wh50 a;

    public ya50(String str) {
        this.a = androidx.compose.runtime.k.b(str);
    }

    @Override // xsna.efj
    public final void a(int i, long j, androidx.compose.runtime.a aVar, q630 q630Var) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-326485362);
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
                androidx.compose.runtime.b.f(-326485362, i2, -1, "com.vk.catalog.mvi.block.music.impl.ui.musictrack.MusicTrackCover.invoke (MusicTrack.kt:110)");
            }
            wh50 wh50Var = this.a;
            if (drm0.N((String) ((zak0) wh50Var).getValue())) {
                M.K(1775620242);
                fc50.b(ahn.E(q630Var, "trackCover"), M, 0);
                M.j();
            } else {
                M.K(1775783457);
                fwu0.c(ahn.E(q630Var, "trackCover"), null, (String) ((zak0) wh50Var).getValue(), null, null, null, null, oii.a, M, 100663296, 250);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new mf4(this, j, q630Var, i, 1);
        }
    }
}
