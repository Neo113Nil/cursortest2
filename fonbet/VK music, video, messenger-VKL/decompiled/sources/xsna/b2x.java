package xsna;

import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.s2x;

/* compiled from: InputImpl.kt */
/* loaded from: classes17.dex */
public final class b2x extends s2x.a {
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

    public b2x() {
        throw null;
    }

    public b2x(tho0 tho0Var, izs izsVar, String str, long j, long j2, frv0 frv0Var, rgy rgyVar, uey ueyVar, b6u0 b6u0Var, sg50 sg50Var, r2x r2xVar, t2x t2xVar, boolean z, SemanticsConfiguration semanticsConfiguration) {
        this.c = androidx.compose.runtime.k.b(tho0Var);
        this.d = androidx.compose.runtime.k.b(izsVar);
        this.e = androidx.compose.runtime.k.b(str);
        this.f = zy60.d(j);
        this.g = zy60.d(j2);
        this.h = androidx.compose.runtime.k.b(frv0Var);
        this.i = androidx.compose.runtime.k.b(Boolean.FALSE);
        this.j = androidx.compose.runtime.k.b(rgyVar);
        this.k = androidx.compose.runtime.k.b(ueyVar);
        this.l = androidx.compose.runtime.k.b(b6u0Var);
        this.m = androidx.compose.runtime.k.b(sg50Var);
        this.n = androidx.compose.runtime.k.b(r2xVar);
        this.o = androidx.compose.runtime.k.b(t2xVar);
        this.p = androidx.compose.runtime.k.b(Boolean.valueOf(z));
        this.q = androidx.compose.runtime.k.b(semanticsConfiguration);
    }

    @Override // xsna.s2x
    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1318250824);
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
                androidx.compose.runtime.b.f(-1318250824, i2, -1, "com.vk.core.compose.component.input.InputImpl.Content (InputImpl.kt:69)");
            }
            nmo0 d = ((frv0) ((zak0) this.h).getValue()).a.d(new nmo0(((l5g) ((zak0) this.f).getValue()).a, 0L, null, null, 0L, null, null, 0, 0L, null, null, 0, 16777214));
            tho0 tho0Var = (tho0) ((zak0) this.c).getValue();
            izs izsVar = (izs) ((zak0) this.d).getValue();
            q630 a = o19.a(com.vk.core.compose.component.semantics.b.b(q630Var, (SemanticsConfiguration) ((zak0) this.q).getValue()), b() ? 1.0f : 0.64f);
            boolean b = b();
            rgy rgyVar = (rgy) ((zak0) this.j).getValue();
            uey ueyVar = (uey) ((zak0) this.k).getValue();
            b6u0 b6u0Var = (b6u0) ((zak0) this.l).getValue();
            boolean booleanValue = ((Boolean) ((zak0) this.i).getValue()).booleanValue();
            s1v.k();
            aVar2 = M;
            wt6.a(tho0Var, izsVar, a, b, booleanValue, d, rgyVar, ueyVar, true, 0, 0, b6u0Var, null, (sg50) ((zak0) this.m).getValue(), new rek0(on20.a.b(M)), kai.c(2021822453, new z1x(this, 0), M), aVar2, 100663296, 196608, 5632);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new rac(this, q630Var, i, 4);
        }
    }
}
