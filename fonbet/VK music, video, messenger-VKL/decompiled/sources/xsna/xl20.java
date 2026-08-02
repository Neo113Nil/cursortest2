package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.banner.Banner$BackgroundMode;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.cri;
import xsna.d16;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;

/* compiled from: MiddleImpl.kt */
/* loaded from: classes17.dex */
public final class xl20 extends d16 {
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;
    public final wh50 f;
    public final wh50 g;
    public final wh50 h;
    public final wh50 i;

    public xl20() {
        this(null, null, null, null, null, null, null, null);
    }

    @Override // xsna.d16
    public final void a(int i, androidx.compose.runtime.a aVar) {
        wh50 wh50Var;
        wh50 wh50Var2;
        wh50 wh50Var3;
        wh50 wh50Var4;
        androidx.compose.runtime.a M = aVar.M(1542552916);
        int i2 = (M.J(this) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1542552916, i2, -1, "com.vk.core.compose.component.banner.MiddleImpl.Content (MiddleImpl.kt:41)");
            }
            wh50 wh50Var5 = this.d;
            d16.c cVar = (d16.c) ((zak0) wh50Var5).getValue();
            wh50 wh50Var6 = this.a;
            if (cVar != null) {
                ((zak0) cVar.a).setValue((Banner$BackgroundMode) ((zak0) wh50Var6).getValue());
                s3q0 s3q0Var = s3q0.a;
            }
            wh50 wh50Var7 = this.b;
            d16.e eVar = (d16.e) ((zak0) wh50Var7).getValue();
            if (eVar != null) {
                ((zak0) eVar.a).setValue((Banner$BackgroundMode) ((zak0) wh50Var6).getValue());
                s3q0 s3q0Var2 = s3q0.a;
            }
            wh50 wh50Var8 = this.c;
            d16.d dVar = (d16.d) ((zak0) wh50Var8).getValue();
            if (dVar != null) {
                ((zak0) dVar.a).setValue((Banner$BackgroundMode) ((zak0) wh50Var6).getValue());
                s3q0 s3q0Var3 = s3q0.a;
            }
            SemanticsConfiguration semanticsConfiguration = (SemanticsConfiguration) ((zak0) this.i).getValue();
            q630.a aVar2 = q630.a.a;
            q630 b = com.vk.core.compose.component.semantics.b.b(aVar2, semanticsConfiguration);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            ty6.a aVar3 = dt1.a.n;
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, aVar3, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, b);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            cri.a.c cVar2 = cri.a.f;
            k9q0.w(M, a, cVar2);
            cri.a.e eVar2 = cri.a.e;
            k9q0.w(M, D, eVar2);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar2 = cri.a.d;
            k9q0.w(M, c, dVar2);
            wzs wzsVar = (wzs) ((zak0) this.h).getValue();
            if (wzsVar == null) {
                M.K(1852827618);
                M.j();
                wh50Var = wh50Var5;
                wh50Var2 = wh50Var7;
                wh50Var3 = wh50Var8;
            } else {
                M.K(1852827619);
                wh50Var = wh50Var5;
                cp10 d = ja8.d(dt1.a.b, false);
                int hashCode2 = Long.hashCode(n34.n(M));
                wh50Var2 = wh50Var7;
                sy90 D2 = M.D();
                wh50Var3 = wh50Var8;
                q630 c2 = qri.c(M, aVar2);
                if (M.N() == null) {
                    n34.r();
                    throw null;
                }
                M.H();
                if (M.L()) {
                    M.I(aVar4);
                } else {
                    M.f();
                }
                k9q0.w(M, d, cVar2);
                k9q0.w(M, D2, eVar2);
                ur.d(hashCode2, M, bVar, M, c2678a);
                k9q0.w(M, c2, dVar2);
                wzsVar.invoke(M, 0);
                M.G();
                f9t.e(txj0.h(aVar2, kqu0.r), M, 0);
                s3q0 s3q0Var4 = s3q0.a;
                M.j();
            }
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.g(2), aVar3, M, 6);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c3 = qri.c(M, aVar2);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cVar2);
            k9q0.w(M, D3, eVar2);
            ur.d(hashCode3, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar2);
            d16.e eVar3 = (d16.e) ((zak0) wh50Var2).getValue();
            if (eVar3 == null) {
                M.K(1883309629);
                M.j();
            } else {
                M.K(614941252);
                eVar3.a(6, M);
                M.j();
                s3q0 s3q0Var5 = s3q0.a;
            }
            d16.d dVar3 = (d16.d) ((zak0) wh50Var3).getValue();
            if (dVar3 == null) {
                M.K(1883363197);
                M.j();
            } else {
                M.K(614942980);
                dVar3.a(6, M);
                M.j();
                s3q0 s3q0Var6 = s3q0.a;
            }
            d16.c cVar3 = (d16.c) ((zak0) wh50Var).getValue();
            if (cVar3 == null) {
                M.K(1883413789);
                M.j();
            } else {
                M.K(614944612);
                cVar3.a(6, M);
                M.j();
                s3q0 s3q0Var7 = s3q0.a;
            }
            M.G();
            wh50 wh50Var9 = this.e;
            d16.a aVar5 = (d16.a) ((zak0) wh50Var9).getValue();
            wh50 wh50Var10 = this.g;
            wh50 wh50Var11 = this.f;
            if (aVar5 == null && ((d16.a) ((zak0) wh50Var11).getValue()) == null && ((d16.a) ((zak0) wh50Var10).getValue()) == null) {
                M.K(1850832676);
                M.j();
                wh50Var4 = wh50Var9;
            } else {
                M.K(1853314071);
                if (androidx.compose.runtime.b.d()) {
                    wh50Var4 = wh50Var9;
                    androidx.compose.runtime.b.f(-462848918, 6, -1, "com.vk.core.compose.component.defaults.VkBannerDefaults.buttonsTopMargin (VkBannerDefaults.kt:152)");
                } else {
                    wh50Var4 = wh50Var9;
                }
                float f = kqu0.a;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                ck70.b(aVar2, kqu0.v, M, 0);
            }
            androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g(12), dt1.a.k, M, 6);
            int hashCode4 = Long.hashCode(n34.n(M));
            sy90 D4 = M.D();
            q630 c4 = qri.c(M, aVar2);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, a3, cVar2);
            k9q0.w(M, D4, eVar2);
            ur.d(hashCode4, M, bVar, M, c2678a);
            k9q0.w(M, c4, dVar2);
            d16.a aVar6 = (d16.a) ((zak0) wh50Var4).getValue();
            if (aVar6 == null) {
                M.K(-1323171786);
                M.j();
            } else {
                M.K(-181230293);
                aVar6.a(6, M);
                M.j();
                s3q0 s3q0Var8 = s3q0.a;
            }
            d16.a aVar7 = (d16.a) ((zak0) wh50Var11).getValue();
            if (aVar7 == null) {
                M.K(-1323124170);
                M.j();
            } else {
                M.K(-181228757);
                aVar7.a(6, M);
                M.j();
                s3q0 s3q0Var9 = s3q0.a;
            }
            d16.a aVar8 = (d16.a) ((zak0) wh50Var10).getValue();
            if (aVar8 == null) {
                M.K(-1323077546);
                M.j();
            } else {
                M.K(-181227253);
                aVar8.a(6, M);
                M.j();
                s3q0 s3q0Var10 = s3q0.a;
            }
            if (kr.f(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new oac(this, i, 10);
        }
    }

    public xl20(mzo0 mzo0Var, s0n0 s0n0Var, d16.c cVar, d16.a aVar, d16.a aVar2, d16.a aVar3, wzs wzsVar, SemanticsConfiguration semanticsConfiguration) {
        this.b = androidx.compose.runtime.k.b(mzo0Var);
        this.c = androidx.compose.runtime.k.b(s0n0Var);
        this.d = androidx.compose.runtime.k.b(cVar);
        this.e = androidx.compose.runtime.k.b(aVar);
        this.f = androidx.compose.runtime.k.b(aVar2);
        this.g = androidx.compose.runtime.k.b(aVar3);
        this.h = androidx.compose.runtime.k.b(wzsVar);
        this.i = androidx.compose.runtime.k.b(semanticsConfiguration);
    }
}
