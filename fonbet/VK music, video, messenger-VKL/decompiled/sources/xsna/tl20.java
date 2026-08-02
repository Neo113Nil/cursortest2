package xsna;

import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.q630;

/* compiled from: MiddleButtonImpl.kt */
/* loaded from: classes17.dex */
public final class tl20 implements f7k0 {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;
    public final wh50 f;
    public final wh50 g;
    public final wh50 h;
    public final wh50 i;
    public final wh50 j;
    public final wh50 k;
    public final wh50 l;
    public final wh50 m;
    public final wh50 n;

    public tl20() {
        throw null;
    }

    public tl20(String str, gzs gzsVar, ButtonSize buttonSize, ButtonStyle buttonStyle, ButtonAppearance buttonAppearance) {
        this.a = androidx.compose.runtime.k.b(str);
        this.b = androidx.compose.runtime.k.b(gzsVar);
        this.c = androidx.compose.runtime.k.b(buttonStyle);
        this.d = androidx.compose.runtime.k.b(buttonSize);
        this.e = androidx.compose.runtime.k.b(buttonAppearance);
        this.f = androidx.compose.runtime.k.b(null);
        this.g = androidx.compose.runtime.k.b(null);
        this.h = androidx.compose.runtime.k.b(null);
        this.i = androidx.compose.runtime.k.b(null);
        this.j = androidx.compose.runtime.k.b(null);
        this.k = androidx.compose.runtime.k.b(null);
        this.l = androidx.compose.runtime.k.b(null);
        this.m = androidx.compose.runtime.k.b(null);
        this.n = androidx.compose.runtime.k.b(null);
    }

    @Override // xsna.f7k0
    public final void a(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-41831013);
        int i2 = (M.J(this) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-41831013, i2, -1, "com.vk.core.compose.component.snackbar.MiddleButtonImpl.Content (MiddleButtonImpl.kt:52)");
            }
            q630 b = com.vk.core.compose.component.semantics.b.b(q630.a.a, (SemanticsConfiguration) ((zak0) this.n).getValue());
            aVar2 = M;
            bhu0.e((gzs) ((zak0) this.b).getValue(), (ButtonSize) ((zak0) this.d).getValue(), (ButtonStyle) ((zak0) this.c).getValue(), (ButtonAppearance) ((zak0) this.e).getValue(), b, null, false, false, (lg90) ((zak0) this.f).getValue(), (l5g) ((zak0) this.g).getValue(), (pco) ((zak0) this.h).getValue(), (String) ((zak0) this.a).getValue(), (Integer) ((zak0) this.i).getValue(), (lg90) ((zak0) this.j).getValue(), (l5g) ((zak0) this.k).getValue(), (pco) ((zak0) this.l).getValue(), false, null, (String) ((zak0) this.m).getValue(), null, aVar2, 1073741824, 32768, 0, 3539424);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new b47(this, i, 5);
        }
    }
}
