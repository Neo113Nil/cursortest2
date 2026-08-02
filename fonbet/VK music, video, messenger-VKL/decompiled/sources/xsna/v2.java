package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.api;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;

/* compiled from: AboutAppStateContentView.kt */
/* loaded from: classes6.dex */
public final class v2 extends i6v0<p3, u0> {
    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        i((p3) ao50Var, izsVar, aVar, 512);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(api.a aVar, final izs<? super u0, s3q0> izsVar, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a aVar3;
        androidx.compose.runtime.a M = aVar2.M(443814355);
        int i2 = i | (M.J(aVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(443814355, i2, -1, "com.vk.superapp.presentation.about.compose.AboutAppStateContentView.MainScreen (AboutAppStateContentView.kt:55)");
            }
            final boolean booleanValue = ((Boolean) jk50.d(aVar.a, Boolean.TRUE, M, 48).getValue()).booleanValue();
            yzt0<Boolean> yzt0Var = aVar.b;
            Boolean bool = Boolean.FALSE;
            final boolean booleanValue2 = ((Boolean) jk50.d(yzt0Var, bool, M, 48).getValue()).booleanValue();
            final boolean booleanValue3 = ((Boolean) jk50.d(aVar.c, bool, M, 48).getValue()).booleanValue();
            final y0 y0Var = (y0) jk50.d(aVar.d, new y0(0), M, 48).getValue();
            final jgh0 x = p490.x(M);
            aVar3 = M;
            phv0.b(null, kai.c(564149164, new q2(0, x, izsVar), M), null, null, null, 0, 0L, 0L, kai.c(526042871, new yzs() { // from class: xsna.r2
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    boolean z;
                    androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if (aVar4.t(intValue & 1, (intValue & 17) != 16)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(526042871, intValue, -1, "com.vk.superapp.presentation.about.compose.AboutAppStateContentView.MainScreen.<anonymous> (AboutAppStateContentView.kt:69)");
                        }
                        q630.a aVar5 = q630.a.a;
                        q630 d = txj0.d(aVar5, 1.0f);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        iyk0 iyk0Var = rrv0.a;
                        ylu0 ylu0Var = (ylu0) aVar4.r(iyk0Var);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j = ylu0Var.getBackground().g;
                        e.a aVar6 = androidx.compose.ui.graphics.e.a;
                        q630 m = hr80.m(d, j, aVar6);
                        a.m mVar = androidx.compose.foundation.layout.a.c;
                        dt1.a.getClass();
                        ty6.a aVar7 = dt1.a.n;
                        androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, aVar7, aVar4, 0);
                        int hashCode = Long.hashCode(n34.n(aVar4));
                        sy90 D = aVar4.D();
                        q630 c = qri.c(aVar4, m);
                        cri.h7.getClass();
                        LayoutNode.a aVar8 = cri.a.b;
                        if (aVar4.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar4.H();
                        if (aVar4.L()) {
                            aVar4.I(aVar8);
                        } else {
                            aVar4.f();
                        }
                        cri.a.c cVar = cri.a.f;
                        k9q0.w(aVar4, a, cVar);
                        cri.a.e eVar = cri.a.e;
                        k9q0.w(aVar4, D, eVar);
                        Integer valueOf = Integer.valueOf(hashCode);
                        cri.a.b bVar = cri.a.g;
                        k9q0.w(aVar4, valueOf, bVar);
                        cri.a.C2678a c2678a = cri.a.h;
                        k9q0.t(aVar4, c2678a);
                        cri.a.d dVar = cri.a.d;
                        k9q0.w(aVar4, c, dVar);
                        q630 D2 = p490.D(aVar5, jgh0.this, 14);
                        if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                            szw.a("invalid weight; must be greater than zero");
                        }
                        q630 d2 = defpackage.j0.d(1.0f, D2, true);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var2 = (ylu0) aVar4.r(iyk0Var);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        q630 m2 = hr80.m(d2, ylu0Var2.getBackground().g, aVar6);
                        androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, aVar7, aVar4, 0);
                        int hashCode2 = Long.hashCode(n34.n(aVar4));
                        sy90 D3 = aVar4.D();
                        q630 c2 = qri.c(aVar4, m2);
                        if (aVar4.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar4.H();
                        if (aVar4.L()) {
                            aVar4.I(aVar8);
                        } else {
                            aVar4.f();
                        }
                        k9q0.w(aVar4, a2, cVar);
                        k9q0.w(aVar4, D3, eVar);
                        ur.d(hashCode2, aVar4, bVar, aVar4, c2678a);
                        k9q0.w(aVar4, c2, dVar);
                        boolean z2 = booleanValue;
                        boolean z3 = booleanValue2;
                        izs izsVar2 = izsVar;
                        a.C0011a.C0012a c0012a = a.C0011a.a;
                        if (z3) {
                            aVar4.K(485000440);
                            boolean J = aVar4.J(izsVar2);
                            Object x2 = aVar4.x();
                            if (J || x2 == c0012a) {
                                x2 = new t2(izsVar2, 0);
                                aVar4.R(x2);
                            }
                            z = false;
                            a3.b((gzs) x2, aVar4, 0);
                            aVar4.j();
                        } else {
                            z = false;
                            if (z2) {
                                aVar4.K(485003066);
                                a3.c(0, aVar4);
                                aVar4.j();
                            } else {
                                aVar4.K(485004619);
                                a3.a(y0Var, izsVar2, aVar4, 0);
                                aVar4.j();
                            }
                        }
                        aVar4.G();
                        if (booleanValue3) {
                            aVar4.K(-236342767);
                            q630 f = txj0.f(aVar5, 1.0f);
                            if (!z2 && !z3) {
                                z = true;
                            }
                            boolean J2 = aVar4.J(izsVar2);
                            Object x3 = aVar4.x();
                            if (J2 || x3 == c0012a) {
                                x3 = new u2(izsVar2, 0);
                                aVar4.R(x3);
                            }
                            o3.a(384, aVar4, (gzs) x3, f, z);
                        } else {
                            aVar4.K(-239672415);
                        }
                        aVar4.j();
                        aVar4.G();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar4.h();
                    }
                    return s3q0.a;
                }
            }, M), aVar3, 805306416, IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar3 = M;
            aVar3.h();
        }
        androidx.compose.runtime.f s = aVar3.s();
        if (s != null) {
            s.d = new s2(i, 0, this, aVar, izsVar);
        }
    }

    public final void i(p3 p3Var, izs<? super u0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-499625392);
        int i2 = (M.J(p3Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-499625392, i2, -1, "com.vk.superapp.presentation.about.compose.AboutAppStateContentView.ThemedContent (AboutAppStateContentView.kt:43)");
            }
            int i3 = i2 & 896;
            wh50 d = d(api.b.a, new n0u0[]{p3Var.a}, M, 518 | i3);
            if (((api) d.getValue()) instanceof api.a) {
                M.K(2016838526);
                h((api.a) ((api) d.getValue()), izsVar, M, i3 | (i2 & 112) | 512);
            } else {
                M.K(2014978898);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new p2(i, 0, this, p3Var, izsVar);
        }
    }
}
