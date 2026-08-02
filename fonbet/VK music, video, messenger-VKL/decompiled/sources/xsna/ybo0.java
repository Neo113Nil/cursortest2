package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.input.InputSelect$State;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.g8s;

/* compiled from: TextAreaImpl.kt */
/* loaded from: classes17.dex */
public final class ybo0 extends g8s.e {
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;
    public final wh50 f;
    public final rg50 g;
    public final rg50 h;
    public final wh50 i;
    public final wh50 j;
    public final wh50 k;
    public final wh50 l;
    public final wh50 m;
    public final wh50 n;
    public final wh50 o;
    public final wh50 p;
    public final wh50 q;
    public final wh50 r;
    public final wh50 s;

    public ybo0() {
        throw null;
    }

    public ybo0(tho0 tho0Var, izs izsVar, String str, InputSelect$State inputSelect$State, int i, int i2, boolean z, boolean z2, long j, long j2, frv0 frv0Var, rgy rgyVar, uey ueyVar, b6u0 b6u0Var, sg50 sg50Var, izs izsVar2, SemanticsConfiguration semanticsConfiguration) {
        this.c = androidx.compose.runtime.k.b(tho0Var);
        this.d = androidx.compose.runtime.k.b(izsVar);
        this.e = androidx.compose.runtime.k.b(str);
        this.f = androidx.compose.runtime.k.b(inputSelect$State);
        this.g = androidx.compose.runtime.i.a(i);
        this.h = androidx.compose.runtime.i.a(i2);
        this.i = androidx.compose.runtime.k.b(Boolean.valueOf(z));
        this.j = androidx.compose.runtime.k.b(Boolean.valueOf(z2));
        this.k = zy60.d(j);
        this.l = zy60.d(j2);
        this.m = androidx.compose.runtime.k.b(frv0Var);
        this.n = androidx.compose.runtime.k.b(rgyVar);
        this.o = androidx.compose.runtime.k.b(ueyVar);
        this.p = androidx.compose.runtime.k.b(b6u0Var);
        this.q = androidx.compose.runtime.k.b(sg50Var);
        this.r = androidx.compose.runtime.k.b(izsVar2);
        this.s = androidx.compose.runtime.k.b(semanticsConfiguration);
    }

    @Override // xsna.g8s
    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-143078436);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-143078436, i2, -1, "com.vk.core.compose.component.form.TextAreaImpl.Content (TextAreaImpl.kt:66)");
            }
            tho0 tho0Var = (tho0) ((zak0) this.c).getValue();
            izs izsVar = (izs) ((zak0) this.d).getValue();
            q630 f = txj0.f(com.vk.core.compose.component.semantics.b.b(q630Var, (SemanticsConfiguration) ((zak0) this.s).getValue()), 1.0f);
            wh50 wh50Var = this.b;
            aVar2 = M;
            hqv0.d(tho0Var, izsVar, s200.H(f, ((pco) ((zak0) wh50Var).getValue()).b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((Boolean) ((zak0) this.a).getValue()).booleanValue() ? 0 : ((pco) ((zak0) wh50Var).getValue()).b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10), (String) ((zak0) this.e).getValue(), (InputSelect$State) ((zak0) this.f).getValue(), ((wak0) this.g).getIntValue(), ((wak0) this.h).getIntValue(), ((Boolean) ((zak0) this.i).getValue()).booleanValue(), false, ((l5g) ((zak0) this.k).getValue()).a, ((l5g) ((zak0) this.l).getValue()).a, (frv0) ((zak0) this.m).getValue(), (rgy) ((zak0) this.n).getValue(), (uey) ((zak0) this.o).getValue(), (b6u0) ((zak0) this.p).getValue(), (sg50) ((zak0) this.q).getValue(), null, null, null, ((Boolean) ((zak0) this.j).getValue()).booleanValue(), aVar2, 0, 0, 459008);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new sac(this, q630Var, i, 5);
        }
    }
}
