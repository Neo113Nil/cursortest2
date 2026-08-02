package xsna;

/* compiled from: MusicPlayingOverlay.kt */
/* loaded from: classes3.dex */
public final class fz40 implements z190 {
    public final wh50 a;

    public fz40(boolean z) {
        this.a = androidx.compose.runtime.k.b(Boolean.valueOf(z));
    }

    @Override // xsna.z190
    public final void a(final int i, final long j, androidx.compose.runtime.a aVar, final q630 q630Var) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1261337315);
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
                androidx.compose.runtime.b.f(1261337315, i2, -1, "com.vk.music.compose.MusicPlayingOverlay.invoke (MusicPlayingOverlay.kt:79)");
            }
            jz40.a(i2 & 112, M, q630Var, ((Boolean) ((zak0) this.a).getValue()).booleanValue());
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.ez40
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i | 1);
                    fz40.this.a(I, j, (androidx.compose.runtime.a) obj, q630Var);
                    return s3q0.a;
                }
            };
        }
    }
}
