package xsna;

import com.vungle.ads.internal.protos.Sdk;

/* compiled from: MusicPlaylistHeaderButtons.kt */
/* loaded from: classes3.dex */
public final class a050 implements f9b0 {
    public final wh50 a;
    public final gzs<s3q0> b;
    public final gzs<s3q0> c;
    public final gzs<s3q0> d;
    public final gzs<s3q0> e;
    public final gzs<s3q0> f;

    public a050(wh50 wh50Var, gzs gzsVar, gzs gzsVar2, gzs gzsVar3, gzs gzsVar4, gzs gzsVar5) {
        this.a = wh50Var;
        this.b = gzsVar;
        this.c = gzsVar2;
        this.d = gzsVar3;
        this.e = gzsVar4;
        this.f = gzsVar5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.f9b0
    public final void a(final int i, androidx.compose.runtime.a aVar, q630 q630Var, final boolean z) {
        int i2;
        final q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(331306171);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) != 130)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(331306171, i2, -1, "com.vk.music.playlist.display.presentation.MusicPlaylistHeaderButtons.Component (MusicPlaylistHeaderButtons.kt:57)");
            }
            wh50 wh50Var = this.a;
            q630Var2 = q630Var;
            k050.c((l050) wh50Var.getValue(), q630Var2, this.b, this.c, this.d, this.e, this.f, (((l050) wh50Var.getValue()).d || ((l050) wh50Var.getValue()).f || ((l050) wh50Var.getValue()).g || ((l050) wh50Var.getValue()).e) ? false : true, M, (i2 << 3) & 112);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            q630Var2 = q630Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.zz40
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i | 1);
                    a050.this.a(I, (androidx.compose.runtime.a) obj, q630Var2, z);
                    return s3q0.a;
                }
            };
        }
    }
}
