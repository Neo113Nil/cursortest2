package xsna;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.SpinnerState;
import java.util.Collections;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.gnd;
import xsna.q630;
import xsna.tlo0;
import xsna.v6p0;

/* compiled from: MainContent.kt */
/* loaded from: classes16.dex */
public final class de00 {
    public static final void a(v6p0 v6p0Var, q630 q630Var, jai jaiVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1299814365);
        int i2 = (M.J(v6p0Var) ? 4 : 2) | i | (M.J(q630Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1299814365, i2, -1, "com.vk.clips.coauthors.selector.ui.CollapsableAuthorsContainer (MainContent.kt:136)");
            }
            q630 D = p490.D(q630Var, p490.x(M), 14);
            List singletonList = Collections.singletonList(jaiVar);
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new ud00(v6p0Var);
                M.R(x);
            }
            b540 b540Var = (b540) x;
            jai b = joy.b(singletonList);
            boolean J = M.J(b540Var);
            Object x2 = M.x();
            if (J || x2 == c0012a) {
                x2 = new c540(b540Var);
                M.R(x2);
            }
            cp10 cp10Var = (cp10) x2;
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c = qri.c(M, D);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, cp10Var, cri.a.f);
            k9q0.w(M, D2, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (er.f(0, M, b)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new bqg(i, 2, v6p0Var, q630Var, jaiVar);
        }
    }

    public static final void b(gnd.a.b bVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1479999354);
        int i2 = (M.J(bVar) ? 4 : 2) | i | 48;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1479999354, i2, -1, "com.vk.clips.coauthors.selector.ui.ErrorContent (MainContent.kt:178)");
            }
            yzt0<tlo0> yzt0Var = bVar.f;
            tlo0.Companion.getClass();
            wh50 d = jk50.d(yzt0Var, tlo0.c.a, M, 0);
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            q630.a aVar3 = q630.a.a;
            q630 E = ahn.E(aVar3, "LoadingErrorContent");
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar2 = cri.a.g;
            k9q0.w(M, valueOf, bVar2);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            f9t.e(txj0.h(aVar3, 8), M, 6);
            q630 f = txj0.f(aVar3, 1.0f);
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, f);
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
            k9q0.w(M, d2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar2, M, c2678a);
            k9q0.w(M, c2, dVar);
            String obj = ((tlo0) d.getValue()).a(context).toString();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.N;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
            aVar2 = M;
            yqv0.c(obj, s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48, 1, ra8.a.b(aVar3, dt1.a.f)), ylu0Var.getText().p, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, aVar2, 0, 0, 8184);
            if (kr.f(aVar2)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new p9(bVar, q630Var2, i, 4);
        }
    }

    public static final void c(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(275938730);
        int i2 = i | 6;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(275938730, i2, -1, "com.vk.clips.coauthors.selector.ui.LoadingContent (MainContent.kt:164)");
            }
            q630.a aVar2 = q630.a.a;
            q630 f = txj0.f(aVar2, 1.0f);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            f9t.e(txj0.h(aVar2, 8), M, 6);
            zfr0.f(SpinnerState.Loading, null, null, 0L, null, null, M, 6, 62);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = aVar2;
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new p3c(q630Var, i, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(final gnd.a aVar, final izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar2, int i) {
        wh50 wh50Var;
        v6p0 a;
        spj spjVar;
        androidx.compose.runtime.a M = aVar2.M(-534760672);
        int i2 = i | (M.J(aVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.J(q630Var) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-534760672, i2, -1, "com.vk.clips.coauthors.selector.ui.MainContent (MainContent.kt:60)");
            }
            boolean z = aVar instanceof gnd.a.C2950a;
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z) {
                M.K(1491080458);
                wh50Var = jk50.d(((gnd.a.C2950a) aVar).e, d8p0.d, M, 48);
                M.j();
            } else if (aVar instanceof gnd.a.b) {
                M.K(1491084426);
                wh50Var = jk50.d(((gnd.a.b) aVar).e, d8p0.d, M, 48);
                M.j();
            } else if (aVar instanceof gnd.a.d) {
                M.K(1491088458);
                wh50Var = jk50.d(((gnd.a.d) aVar).e, d8p0.d, M, 48);
                M.j();
            } else {
                if (!(aVar instanceof gnd.a.c)) {
                    throw alb0.c(1491077787, M);
                }
                M.K(-1020797554);
                Object x = M.x();
                if (x == c0012a) {
                    x = androidx.compose.runtime.k.b(d8p0.d);
                    M.R(x);
                }
                wh50Var = (wh50) x;
                M.j();
            }
            x6p0 A = m200.A(M);
            boolean J = M.J(wh50Var) | M.J(A);
            Object x2 = M.x();
            if (J || x2 == c0012a) {
                x2 = new defpackage.u(19, A, wh50Var);
                M.R(x2);
            }
            gzs gzsVar = (gzs) x2;
            xmk0 c = jq2.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 400.0f, null, 5);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1359291088, 0, -1, "com.vk.clips.coauthors.selector.ui.createDirectedScrollSpanBehavior (MainContent.kt:201)");
            }
            pqo pqoVar = AndroidCompositionLocals_androidKt.a;
            if (((Configuration) M.r(pqoVar)).orientation == 2) {
                M.K(-1688748635);
                l7l a2 = ilk0.a(M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-576400351, 196608, -1, "com.vk.core.compose.component.topbar.TopAppBarScrollBehavior.Companion.exitUntilCollapsed (TopAppBarScrollBehavior.kt:153)");
                }
                boolean J2 = M.J(A) | M.J(c) | M.J(a2) | M.J(gzsVar) | M.l(false);
                Object x3 = M.x();
                if (J2 || x3 == c0012a) {
                    x3 = new g5q(A, c, a2, gzsVar);
                    M.R(x3);
                }
                a = (g5q) x3;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            } else {
                M.K(-1688539540);
                a = v6p0.a.a(A, gzsVar, c, M, 196608, 20);
                M.j();
            }
            final v6p0 v6p0Var = a;
            Integer valueOf = Integer.valueOf(((Configuration) M.r(pqoVar)).orientation);
            boolean J3 = M.J(A);
            Object x4 = M.x();
            if (J3 || x4 == c0012a) {
                spjVar = null;
                x4 = new be00(A, null);
                M.R(x4);
            } else {
                spjVar = null;
            }
            bap.g(valueOf, (wzs) x4, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 d = txj0.d(q630Var, 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            spj spjVar2 = spjVar;
            phv0.b(d, kai.c(91737145, new o54(v6p0Var, wh50Var, izsVar), M), null, null, null, 0, ylu0Var.getBackground().g, 0L, kai.c(1677579588, new yzs() { // from class: xsna.sd00
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    s890 s890Var = (s890) obj;
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar3.J(s890Var) ? 4 : 2;
                    }
                    if (aVar3.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1677579588, intValue, -1, "com.vk.clips.coauthors.selector.ui.MainContent.<anonymous> (MainContent.kt:109)");
                        }
                        q630.a aVar4 = q630.a.a;
                        q630 C = s200.C(aVar4, s890Var);
                        dt1.a.getClass();
                        cp10 d2 = ja8.d(dt1.a.b, false);
                        int hashCode = Long.hashCode(n34.n(aVar3));
                        sy90 D = aVar3.D();
                        q630 c2 = qri.c(aVar3, C);
                        cri.h7.getClass();
                        LayoutNode.a aVar5 = cri.a.b;
                        if (aVar3.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar3.H();
                        if (aVar3.L()) {
                            aVar3.I(aVar5);
                        } else {
                            aVar3.f();
                        }
                        k9q0.w(aVar3, d2, cri.a.f);
                        k9q0.w(aVar3, D, cri.a.e);
                        k9q0.w(aVar3, Integer.valueOf(hashCode), cri.a.g);
                        k9q0.t(aVar3, cri.a.h);
                        k9q0.w(aVar3, c2, cri.a.d);
                        gnd.a aVar6 = gnd.a.this;
                        if (aVar6 instanceof gnd.a.C2950a) {
                            aVar3.K(-797829768);
                            qqz.c((gnd.a.C2950a) aVar6, izsVar, n34.t(aVar4, v6p0Var.a(), null), aVar3, 0);
                            aVar3.j();
                        } else if (aVar6 instanceof gnd.a.b) {
                            aVar3.K(-797821639);
                            de00.b((gnd.a.b) aVar6, null, aVar3, 0);
                            aVar3.j();
                        } else if (aVar6 instanceof gnd.a.d) {
                            aVar3.K(-797818418);
                            de00.c(null, aVar3, 0);
                            aVar3.j();
                        } else {
                            if (!(aVar6 instanceof gnd.a.c)) {
                                throw alb0.c(-797832175, aVar3);
                            }
                            aVar3.K(-797815608);
                            f9t.e(txj0.f(aVar4, 1.0f), aVar3, 6);
                            aVar3.j();
                        }
                        aVar3.G();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 805306416, 380);
            M = M;
            d8p0 d8p0Var = (d8p0) wh50Var.getValue();
            boolean J4 = M.J(wh50Var) | M.J(v6p0Var);
            Object x5 = M.x();
            if (J4 || x5 == c0012a) {
                x5 = new wd00(v6p0Var, wh50Var, spjVar2);
                M.R(x5);
            }
            bap.g(d8p0Var, (wzs) x5, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xce(i, 5, aVar, izsVar, q630Var);
        }
    }
}
