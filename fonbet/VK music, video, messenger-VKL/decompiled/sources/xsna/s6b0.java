package xsna;

import xsna.q630;

/* compiled from: PlayingIndication.kt */
/* loaded from: classes3.dex */
public final class s6b0 implements z190 {
    public final wh50 a;
    public final wh50 b;

    public s6b0(u5b0 u5b0Var, boolean z) {
        this.a = androidx.compose.runtime.k.b(u5b0Var);
        this.b = androidx.compose.runtime.k.b(Boolean.valueOf(z));
    }

    @Override // xsna.z190
    public final void a(final int i, final long j, androidx.compose.runtime.a aVar, final q630 q630Var) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(788060331);
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
                androidx.compose.runtime.b.f(788060331, i2, -1, "com.vk.music.stickyplayer.presentation.components.PlayingIndicationOverlay.invoke (PlayingIndication.kt:58)");
            }
            p6b0.a((u5b0) ((zak0) this.a).getValue(), ((Boolean) ((zak0) this.b).getValue()).booleanValue(), ahn.E(q630.a.a, "playingIndicator").g(q630Var), M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.r6b0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i | 1);
                    s6b0.this.a(I, j, (androidx.compose.runtime.a) obj, q630Var);
                    return s3q0.a;
                }
            };
        }
    }
}
