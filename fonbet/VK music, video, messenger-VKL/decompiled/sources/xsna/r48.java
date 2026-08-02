package xsna;

import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.defaults.PlaceholderMode;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.q630;
import xsna.wra0;
import xsna.ym20;

/* compiled from: BottomButtonImpl.kt */
/* loaded from: classes17.dex */
public final class r48 implements wra0.a {
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
    public final wh50 o;
    public final wh50 p;
    public final wh50 q;

    public r48() {
        throw null;
    }

    public r48(String str, gzs gzsVar, ButtonSize buttonSize, ButtonStyle buttonStyle, ButtonAppearance buttonAppearance, boolean z, lg90 lg90Var, l5g l5gVar, pco pcoVar, Integer num, lg90 lg90Var2, l5g l5gVar2, pco pcoVar2, boolean z2, boolean z3, String str2, SemanticsConfiguration semanticsConfiguration) {
        this.a = androidx.compose.runtime.k.b(Boolean.valueOf(z2));
        this.b = androidx.compose.runtime.k.b(str);
        this.c = androidx.compose.runtime.k.b(gzsVar);
        this.d = androidx.compose.runtime.k.b(buttonSize);
        this.e = androidx.compose.runtime.k.b(buttonStyle);
        this.f = androidx.compose.runtime.k.b(buttonAppearance);
        this.g = androidx.compose.runtime.k.b(Boolean.valueOf(z));
        this.h = androidx.compose.runtime.k.b(lg90Var);
        this.i = androidx.compose.runtime.k.b(l5gVar);
        this.j = androidx.compose.runtime.k.b(pcoVar);
        this.k = androidx.compose.runtime.k.b(num);
        this.l = androidx.compose.runtime.k.b(lg90Var2);
        this.m = androidx.compose.runtime.k.b(l5gVar2);
        this.n = androidx.compose.runtime.k.b(pcoVar2);
        this.o = androidx.compose.runtime.k.b(Boolean.valueOf(z3));
        this.p = androidx.compose.runtime.k.b(str2);
        this.q = androidx.compose.runtime.k.b(semanticsConfiguration);
    }

    @Override // xsna.wra0.a
    public final void a(q630 q630Var, PlaceholderMode placeholderMode, ButtonSize buttonSize, androidx.compose.runtime.a aVar, int i) {
        aVar.K(-1102938640);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1102938640, i, -1, "com.vk.core.compose.component.placeholder.BottomButtonImpl.Content (BottomButtonImpl.kt:64)");
        }
        wh50 wh50Var = this.q;
        q630 g = ((SemanticsConfiguration) ((zak0) wh50Var).getValue()) != null ? q630Var.g(egi0.b(q630.a.a, true, (SemanticsConfiguration) ((zak0) wh50Var).getValue())) : q630Var;
        String str = (String) ((zak0) this.b).getValue();
        gzs gzsVar = (gzs) ((zak0) this.c).getValue();
        ButtonStyle buttonStyle = (ButtonStyle) ((zak0) this.e).getValue();
        ButtonAppearance buttonAppearance = (ButtonAppearance) ((zak0) this.f).getValue();
        if (buttonAppearance == null) {
            aVar.K(932907366);
            int i2 = (i >> 3) & 14;
            sdy.m().getClass();
            aVar.K(-1389166883);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1389166883, i2, -1, "com.vk.core.compose.component.defaults.milkshake.MilkShakePlaceholderDefaults.buttonAppearance (MilkShakePlaceholderDefaults.kt:38)");
            }
            int i3 = ym20.a.$EnumSwitchMapping$0[placeholderMode.ordinal()];
            buttonAppearance = i3 != 1 ? i3 != 2 ? ButtonAppearance.Accent : ButtonAppearance.Overlay : ButtonAppearance.Accent;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
        } else {
            aVar.K(932906064);
        }
        aVar.j();
        bhu0.e(gzsVar, buttonSize, buttonStyle, buttonAppearance, g, null, ((Boolean) ((zak0) this.g).getValue()).booleanValue(), false, (lg90) ((zak0) this.h).getValue(), (l5g) ((zak0) this.i).getValue(), (pco) ((zak0) this.j).getValue(), str, (Integer) ((zak0) this.k).getValue(), (lg90) ((zak0) this.l).getValue(), (l5g) ((zak0) this.m).getValue(), (pco) ((zak0) this.n).getValue(), ((Boolean) ((zak0) this.o).getValue()).booleanValue(), null, (String) ((zak0) this.p).getValue(), null, aVar, ((i >> 3) & 112) | 1073741824, 32768, 0, 3408224);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
    }
}
