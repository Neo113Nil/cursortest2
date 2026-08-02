package xsna;

import com.vungle.ads.internal.protos.Sdk;

/* compiled from: AudioBookChaptersHeaderButtons.kt */
/* loaded from: classes3.dex */
public final class we4 implements f9b0 {
    public final mtk0<Boolean> a;
    public final mtk0<Boolean> b;
    public final mtk0<Boolean> c;
    public final mtk0<Boolean> d;
    public final mtk0<i8o> e;
    public final mtk0<Boolean> f;
    public final gzs<s3q0> g;
    public final izs<Boolean, s3q0> h;

    public we4(wh50 wh50Var, wh50 wh50Var2, wh50 wh50Var3, wh50 wh50Var4, wh50 wh50Var5, wh50 wh50Var6, gzs gzsVar, izs izsVar) {
        this.a = wh50Var;
        this.b = wh50Var2;
        this.c = wh50Var3;
        this.d = wh50Var4;
        this.e = wh50Var5;
        this.f = wh50Var6;
        this.g = gzsVar;
        this.h = izsVar;
    }

    @Override // xsna.f9b0
    public final void a(final int i, androidx.compose.runtime.a aVar, final q630 q630Var, final boolean z) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-371169140);
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
                androidx.compose.runtime.b.f(-371169140, i2, -1, "com.vk.music.playlist.display.audiobook.presentation.AudioBookChaptersHeaderButtons.Component (AudioBookChaptersHeaderButtons.kt:44)");
            }
            if4.a(this.a.getValue().booleanValue(), this.b.getValue().booleanValue(), !this.c.getValue().booleanValue(), this.d.getValue().booleanValue(), this.e.getValue(), q630Var, this.f.getValue().booleanValue(), this.g, this.h, M, (i2 << 15) & 458752);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.ve4
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i | 1);
                    we4.this.a(I, (androidx.compose.runtime.a) obj, q630Var, z);
                    return s3q0.a;
                }
            };
        }
    }
}
