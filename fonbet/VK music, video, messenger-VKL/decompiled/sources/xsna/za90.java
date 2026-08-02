package xsna;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class za90 implements yzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ za90(float f, e3n0 e3n0Var, pwn0 pwn0Var) {
        this.c = f;
        this.d = e3n0Var;
        this.e = pwn0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                mc90 mc90Var = (mc90) this.d;
                LayoutDirection layoutDirection = (LayoutDirection) this.e;
                float floatValue = ((Float) obj).floatValue();
                float floatValue2 = ((Float) obj2).floatValue();
                float floatValue3 = ((Float) obj3).floatValue();
                boolean u = a020.u(mc90Var, floatValue);
                if (mc90Var.n().getOrientation() != Orientation.Vertical && layoutDirection != LayoutDirection.Ltr) {
                    u = !u;
                }
                int d = mc90Var.n().d();
                float m = d == 0 ? 0.0f : a020.m(mc90Var) / d;
                float f = m - ((int) m);
                char c = Math.abs(floatValue) >= mc90Var.n.I0(r9k0.a) ? floatValue > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? (char) 1 : (char) 2 : (char) 0;
                if (c != 0) {
                    if (c != 1) {
                        if (c != 2) {
                            floatValue2 = 0.0f;
                        }
                    }
                    floatValue2 = floatValue3;
                } else if (Math.abs(f) <= this.c) {
                    floatValue2 = floatValue3;
                    break;
                } else {
                    floatValue2 = floatValue3;
                }
                return Float.valueOf(floatValue2);
            default:
                e3n0 e3n0Var = (e3n0) this.d;
                pwn0 pwn0Var = (pwn0) this.e;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1094295850, intValue, -1, "com.vk.tabbar.settings.impl.suggests.TabbarSuggestContent.<anonymous> (TabbarSuggestContent.kt:53)");
                    }
                    float f2 = 12;
                    uog0 b = vog0.b(f2);
                    q630.a aVar2 = q630.a.a;
                    q630 d2 = txj0.d(aVar2, 1.0f);
                    dt1.a.getClass();
                    cp10 d3 = ja8.d(dt1.a.b, false);
                    int hashCode = Long.hashCode(n34.n(aVar));
                    sy90 D = aVar.D();
                    q630 c2 = qri.c(aVar, d2);
                    cri.h7.getClass();
                    LayoutNode.a aVar3 = cri.a.b;
                    if (aVar.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar.H();
                    if (aVar.L()) {
                        aVar.I(aVar3);
                    } else {
                        aVar.f();
                    }
                    cri.a.c cVar = cri.a.f;
                    k9q0.w(aVar, d3, cVar);
                    cri.a.e eVar = cri.a.e;
                    k9q0.w(aVar, D, eVar);
                    Integer valueOf = Integer.valueOf(hashCode);
                    cri.a.b bVar = cri.a.g;
                    k9q0.w(aVar, valueOf, bVar);
                    cri.a.C2678a c2678a = cri.a.h;
                    k9q0.t(aVar, c2678a);
                    cri.a.d dVar = cri.a.d;
                    k9q0.w(aVar, c2, dVar);
                    float f3 = this.c;
                    q630 b2 = ra8.a.b(txj0.v(aVar2, f3), dt1.a.i);
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, aVar, 0);
                    int hashCode2 = Long.hashCode(n34.n(aVar));
                    sy90 D2 = aVar.D();
                    q630 c3 = qri.c(aVar, b2);
                    if (aVar.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar.H();
                    if (aVar.L()) {
                        aVar.I(aVar3);
                    } else {
                        aVar.f();
                    }
                    k9q0.w(aVar, a, cVar);
                    k9q0.w(aVar, D2, eVar);
                    ur.d(hashCode2, aVar, bVar, aVar, c2678a);
                    k9q0.w(aVar, c3, dVar);
                    float size = f3 / e3n0Var.g.size();
                    float f4 = 2;
                    float f5 = (((e3n0Var.c + 1) * size) - (size / f4)) - 10;
                    float f6 = vwn0.a;
                    float f7 = 0;
                    float f8 = swe0.f(f5 - (f6 / f4), f7, ((pco) swe0.c(new pco((f3 - f6) - 24), new pco(f7))).b);
                    Object x = aVar.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (x == c0012a) {
                        x = androidx.compose.runtime.k.b(new pco(f8));
                        aVar.R(x);
                    }
                    q630 v = txj0.v(kci.m(((pco) ((wh50) x).getValue()).b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar2), 264);
                    Object x2 = aVar.x();
                    if (x2 == c0012a) {
                        x2 = new ufm0(2);
                        aVar.R(x2);
                    }
                    q630 c4 = ojc.c(v, false, null, null, (gzs) x2, 15);
                    Object x3 = aVar.x();
                    if (x3 == c0012a) {
                        x3 = new viu(26);
                        aVar.R(x3);
                    }
                    q630 b3 = a5j0.b(s200.F(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, egi0.b(c4, false, (izs) x3)), 6, b, false, 0L, 0L, 28);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    jxn0.a(e3n0Var.a, f5, d370.N(e3n0Var.d, 0, aVar), e3n0Var.f, pwn0Var, hr80.m(b3, ylu0Var.getBackground().r, b), aVar, 0);
                    gcv gcvVar = new gcv(dt1.a.o);
                    int i = e3n0Var.c;
                    int i2 = e3n0Var.b;
                    boolean J = aVar.J(e3n0Var);
                    Object x4 = aVar.x();
                    if (J || x4 == c0012a) {
                        x4 = new orj0(e3n0Var, 9);
                        aVar.R(x4);
                    }
                    uwn0.c(f3, (gzs) x4, i, i2, gcvVar, aVar, 0);
                    if (kr.f(aVar)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ za90(mc90 mc90Var, LayoutDirection layoutDirection, float f) {
        this.d = mc90Var;
        this.e = layoutDirection;
        this.c = f;
    }
}
