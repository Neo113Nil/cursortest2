package xsna;

/* compiled from: RadioPlaybackQueue.kt */
/* loaded from: classes3.dex */
public final class wte0 extends gxa0 {
    public wte0() {
        throw null;
    }

    public final void j(int i, androidx.compose.runtime.a aVar, izs izsVar, q630 q630Var) {
        androidx.compose.runtime.a M = aVar.M(-599293655);
        int i2 = (M.y(izsVar) ? 4 : 2) | i | (M.J(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-599293655, i2, -1, "com.vk.music.stickyplayer.presentation.components.radio.RadioPlaybackQueue.Content (RadioPlaybackQueue.kt:33)");
            }
            e(h(), g(), i(), izsVar, q630Var, kai.c(-1911453980, new e220(1, this, izsVar), M), M, ((i2 << 9) & 7168) | 221184 | ((i2 << 12) & 3670016));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new an7(i, 6, (Object) this, izsVar, q630Var);
        }
    }
}
