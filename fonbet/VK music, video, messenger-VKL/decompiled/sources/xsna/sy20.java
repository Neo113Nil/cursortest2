package xsna;

import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.oy20;

/* compiled from: ModalCardButtonsImpl.kt */
/* loaded from: classes17.dex */
public final class sy20 extends oy20.a {
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

    public sy20() {
        throw null;
    }

    public sy20(String str, gzs gzsVar, ButtonSize buttonSize, ButtonStyle buttonStyle, ButtonAppearance buttonAppearance, SemanticsConfiguration semanticsConfiguration) {
        this.a = androidx.compose.runtime.k.b(str);
        this.b = androidx.compose.runtime.k.b(gzsVar);
        this.c = androidx.compose.runtime.k.b(buttonSize);
        this.d = androidx.compose.runtime.k.b(buttonStyle);
        this.e = androidx.compose.runtime.k.b(buttonAppearance);
        this.f = androidx.compose.runtime.k.b(null);
        this.g = androidx.compose.runtime.k.b(null);
        this.h = androidx.compose.runtime.k.b(null);
        this.i = androidx.compose.runtime.k.b(null);
        this.j = androidx.compose.runtime.k.b(null);
        this.k = androidx.compose.runtime.k.b(null);
        this.l = androidx.compose.runtime.k.b(null);
        this.m = androidx.compose.runtime.k.b(semanticsConfiguration);
    }

    @Override // xsna.oy20.a
    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        aVar.K(1291779172);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1291779172, i, -1, "com.vk.core.compose.component.modal.card.ModalCardButtonImpl.Content (ModalCardButtonsImpl.kt:93)");
        }
        String str = (String) ((zak0) this.a).getValue();
        gzs gzsVar = (gzs) ((zak0) this.b).getValue();
        Integer num = (Integer) ((zak0) this.i).getValue();
        ButtonSize buttonSize = (ButtonSize) ((zak0) this.c).getValue();
        ButtonStyle buttonStyle = (ButtonStyle) ((zak0) this.d).getValue();
        ButtonAppearance buttonAppearance = (ButtonAppearance) ((zak0) this.e).getValue();
        lg90 lg90Var = (lg90) ((zak0) this.f).getValue();
        pco pcoVar = (pco) ((zak0) this.h).getValue();
        l5g l5gVar = (l5g) ((zak0) this.g).getValue();
        lg90 lg90Var2 = (lg90) ((zak0) this.j).getValue();
        pco pcoVar2 = (pco) ((zak0) this.l).getValue();
        bhu0.e(gzsVar, buttonSize, buttonStyle, buttonAppearance, com.vk.core.compose.component.semantics.b.b(q630Var, (SemanticsConfiguration) ((zak0) this.m).getValue()), null, false, false, lg90Var, l5gVar, pcoVar, str, num, lg90Var2, (l5g) ((zak0) this.k).getValue(), pcoVar2, false, null, null, null, aVar, 1073741824, 32768, 0, 4063712);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
    }
}
