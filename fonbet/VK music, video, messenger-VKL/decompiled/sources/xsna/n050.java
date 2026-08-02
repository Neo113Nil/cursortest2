package xsna;

/* compiled from: MusicPlaylistHeaderButtonsWithMix.kt */
/* loaded from: classes3.dex */
public final class n050 implements f9b0 {
    public final wh50 a;
    public final gzs<s3q0> b;
    public final gzs<s3q0> c;
    public final gzs<s3q0> d;
    public final gzs<s3q0> e;
    public final gzs<s3q0> f;
    public final gzs<s3q0> g;

    public n050(wh50 wh50Var, gzs gzsVar, gzs gzsVar2, gzs gzsVar3, gzs gzsVar4, gzs gzsVar5, gzs gzsVar6) {
        this.a = wh50Var;
        this.b = gzsVar;
        this.c = gzsVar2;
        this.d = gzsVar3;
        this.e = gzsVar4;
        this.f = gzsVar5;
        this.g = gzsVar6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.f9b0
    public final void a(final int i, androidx.compose.runtime.a aVar, final q630 q630Var, final boolean z) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1965442119);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1965442119, i2, -1, "com.vk.music.playlist.display.presentation.MusicPlaylistHeaderButtonsWithMix.Component (MusicPlaylistHeaderButtonsWithMix.kt:67)");
            }
            s050.g((l050) this.a.getValue(), z, q630Var, this.b, this.c, this.d, this.e, this.f, this.g, M, (i2 & 112) | ((i2 << 6) & 896));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.m050
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i | 1);
                    n050.this.a(I, (androidx.compose.runtime.a) obj, q630Var, z);
                    return s3q0.a;
                }
            };
        }
    }
}
