package xsna;

import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.d16;
import xsna.q630;

/* compiled from: ButtonImpl.kt */
/* loaded from: classes17.dex */
public final class zp8 implements d16.a {
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

    public zp8() {
        throw null;
    }

    public zp8(String str, String str2, ButtonStyle buttonStyle, ButtonAppearance buttonAppearance, ButtonSize buttonSize, lg90 lg90Var, l5g l5gVar, pco pcoVar, Integer num, lg90 lg90Var2, l5g l5gVar2, pco pcoVar2, SemanticsConfiguration semanticsConfiguration, gzs gzsVar) {
        this.a = androidx.compose.runtime.k.b(str);
        this.b = androidx.compose.runtime.k.b(semanticsConfiguration);
        this.c = androidx.compose.runtime.k.b(gzsVar);
        this.d = androidx.compose.runtime.k.b(str2);
        this.e = androidx.compose.runtime.k.b(buttonSize);
        this.f = androidx.compose.runtime.k.b(buttonStyle);
        this.g = androidx.compose.runtime.k.b(buttonAppearance);
        this.h = androidx.compose.runtime.k.b(lg90Var);
        this.i = androidx.compose.runtime.k.b(l5gVar);
        this.j = androidx.compose.runtime.k.b(pcoVar);
        this.k = androidx.compose.runtime.k.b(num);
        this.l = androidx.compose.runtime.k.b(lg90Var2);
        this.m = androidx.compose.runtime.k.b(l5gVar2);
        this.n = androidx.compose.runtime.k.b(pcoVar2);
    }

    @Override // xsna.d16.a
    public final void a(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-894567756);
        int i2 = (M.J(this) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-894567756, i2, -1, "com.vk.core.compose.component.banner.ButtonImpl.Content (ButtonImpl.kt:51)");
            }
            aVar2 = M;
            bhu0.e((gzs) ((zak0) this.c).getValue(), (ButtonSize) ((zak0) this.e).getValue(), (ButtonStyle) ((zak0) this.f).getValue(), (ButtonAppearance) ((zak0) this.g).getValue(), com.vk.core.compose.component.semantics.b.b(q630.a.a, (SemanticsConfiguration) ((zak0) this.b).getValue()), null, false, false, (lg90) ((zak0) this.h).getValue(), (l5g) ((zak0) this.i).getValue(), (pco) ((zak0) this.j).getValue(), (String) ((zak0) this.a).getValue(), (Integer) ((zak0) this.k).getValue(), (lg90) ((zak0) this.l).getValue(), (l5g) ((zak0) this.m).getValue(), (pco) ((zak0) this.n).getValue(), false, null, null, null, aVar2, 1073741824, 32768, 0, 4063712);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new yg7(this, i, 1);
        }
    }
}
