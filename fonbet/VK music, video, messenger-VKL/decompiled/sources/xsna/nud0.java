package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.tt9;

/* compiled from: ProfileCard.kt */
/* loaded from: classes16.dex */
public final class nud0 {
    public static final float a = 16;
    public static final float b = 6;
    public static final float c = 12;

    public static final void a(ut9 ut9Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(480762665);
        int i2 = (M.J(ut9Var) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 17) != 16)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(480762665, i2, -1, "com.vk.clips.design.compose.profile.AvatarOrPlaceholder (ProfileCard.kt:275)");
            }
            phw phwVar = ut9Var.a;
            com.vk.core.compose.component.semantics.a aVar2 = ut9Var.b;
            q630.a aVar3 = q630.a.a;
            if (phwVar != null) {
                M.K(-1315246866);
                j(ut9Var.a, com.vk.core.compose.component.semantics.b.b(aVar3, aVar2), ut9Var.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0);
                M.j();
            } else {
                M.K(-1315027231);
                f870.A().getClass();
                float a2 = er5.a();
                gzs<s3q0> gzsVar = ut9Var.c;
                boolean z = gzsVar != null;
                if (gzsVar == null) {
                    M.K(-1314815625);
                    Object x = M.x();
                    if (x == a.C0011a.a) {
                        x = new h13(22);
                        M.R(x);
                    }
                    gzsVar = (gzs) x;
                } else {
                    M.K(-1843529283);
                }
                M.j();
                q630 c2 = ojc.c(aVar3, z, null, null, gzsVar, 14);
                r5j0 e = f870.A().e(64, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                ja8.a(com.vk.core.compose.component.semantics.b.b(txj0.q(hr80.m(c2, ylu0Var.getBackground().x, e), a2), aVar2), M, 0);
                ck70.b(aVar3, 12, M, 6);
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new jd4(ut9Var, i, 13);
        }
    }

    public static final void b(tt9.a aVar, q630 q630Var, androidx.compose.runtime.a aVar2, int i) {
        q630 q630Var2;
        q630.a aVar3;
        String str;
        androidx.compose.runtime.a M = aVar2.M(2002377608);
        int i2 = (M.J(aVar) ? 4 : 2) | i | 48;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2002377608, i2, -1, "com.vk.clips.design.compose.profile.Bottom (ProfileCard.kt:222)");
            }
            boolean z = aVar instanceof tt9.a.C3768a;
            q630.a aVar4 = q630.a.a;
            if (z) {
                M.K(30716999);
                if (a690.d(aVar4, 6, M, 6)) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.m0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j = ylu0Var.getText().p;
                tt9.a.C3768a c3768a = (tt9.a.C3768a) aVar;
                CharSequence a2 = c3768a.a.a((Context) M.r(AndroidCompositionLocals_androidKt.b));
                if (a2 == null || (str = a2.toString()) == null) {
                    str = "";
                }
                aVar3 = aVar4;
                yqv0.c(str, com.vk.core.compose.component.semantics.b.b(s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar4), c3768a.b), j, null, null, 0, 3, null, 0, false, 0, 0, null, frv0Var, M, 0, 0, 8120);
                M = M;
                M.j();
            } else {
                q630.a aVar5 = aVar4;
                if (aVar != null) {
                    throw alb0.c(139536679, M);
                }
                M.K(31216378);
                ck70.b(aVar5, 1, M, 6);
                aVar3 = aVar5;
            }
            q630Var2 = aVar3;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
                q630Var2 = aVar3;
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new z85(aVar, q630Var2, i, 9);
        }
    }

    public static final void c(tt9.b.a aVar, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a M = aVar2.M(-1978267841);
        int i2 = (M.J(aVar) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1978267841, i2, -1, "com.vk.clips.design.compose.profile.Description (ProfileCard.kt:304)");
            }
            if (aVar instanceof tt9.b.a.C3769a) {
                M.K(964163074);
                dt1.a.getClass();
                d((tt9.b.a.C3769a) aVar, new gcv(dt1.a.o), M, 0);
                M.j();
            } else {
                if (!(aVar instanceof tt9.b.a.C3770b)) {
                    throw alb0.c(1555121101, M);
                }
                M.K(964383732);
                tt9.b.a.C3770b c3770b = (tt9.b.a.C3770b) aVar;
                us2 us2Var = c3770b.a;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.e0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j = ylu0Var.getText().j;
                dt1.a.getClass();
                gcv gcvVar = new gcv(dt1.a.o);
                M.K(964808897);
                Object x = M.x();
                if (x == a.C0011a.a) {
                    x = new dgc0(2);
                    M.R(x);
                }
                M.j();
                yqv0.d(us2Var, com.vk.core.compose.component.semantics.b.b(ojc.c(gcvVar, false, null, null, (gzs) x, 14), c3770b.b), j, 3, null, 0, false, 0, null, null, frv0Var, M, 0, 0, 8120);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new w5h(aVar, i, 7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(tt9.b.a.C3769a c3769a, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        boolean z;
        q630 q630Var2;
        gzs<s3q0> gzsVar;
        q630 q630Var3;
        int i2;
        gzs<s3q0> gzsVar2;
        us2 us2Var = c3769a.a;
        androidx.compose.runtime.a M = aVar.M(2076451947);
        int i3 = (M.J(c3769a) ? 4 : 2) | i | (M.J(q630Var) ? 32 : 16);
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2076451947, i3, -1, "com.vk.clips.design.compose.profile.DescriptionRow (ProfileCard.kt:378)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(null);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = androidx.compose.runtime.k.b(us2Var);
                M.R(x2);
            }
            wh50 wh50Var2 = (wh50) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x3);
            }
            wh50 wh50Var3 = (wh50) x3;
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = androidx.compose.runtime.k.b(us2Var);
                M.R(x4);
            }
            wh50 wh50Var4 = (wh50) x4;
            Object x5 = M.x();
            if (x5 == c0012a) {
                x5 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x5);
            }
            wh50 wh50Var5 = (wh50) x5;
            us2 us2Var2 = (us2) wh50Var2.getValue();
            gzs<s3q0> gzsVar3 = c3769a.c;
            if (!epx.f(us2Var2, us2Var)) {
                Boolean bool = Boolean.FALSE;
                wh50Var3.setValue(bool);
                wh50Var5.setValue(bool);
                wh50Var4.setValue(us2Var);
                wh50Var2.setValue(us2Var);
            }
            q630 f = txj0.f(q630Var, 1.0f);
            a.c cVar = androidx.compose.foundation.layout.a.e;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(cVar, dt1.a.k, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, f);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            boolean booleanValue = ((Boolean) wh50Var5.getValue()).booleanValue();
            q630.a aVar4 = q630.a.a;
            if (booleanValue) {
                if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    szw.a("invalid weight; must be greater than zero");
                }
                z = false;
                q630Var2 = new xpy(1.0f, false);
            } else {
                z = false;
                q630Var2 = aVar4;
            }
            q630 b2 = com.vk.core.compose.component.semantics.b.b(q630Var2, c3769a.d);
            Object x6 = M.x();
            if (x6 == c0012a) {
                x6 = new hb40(wh50Var3, 14);
                M.R(x6);
            }
            q630 f2 = bu00.f(b2, (izs) x6);
            boolean z2 = gzsVar3 != null ? true : z;
            if (gzsVar3 == null) {
                M.K(88741425);
                Object x7 = M.x();
                if (x7 == c0012a) {
                    x7 = new uz(29);
                    M.R(x7);
                }
                M.j();
                gzsVar = (gzs) x7;
            } else {
                M.K(-1659706072);
                M.j();
                gzsVar = gzsVar3;
            }
            q630 c3 = ojc.c(f2, z2, null, null, gzsVar, 14);
            us2 us2Var3 = (us2) wh50Var4.getValue();
            frv0 frv0Var = wlb0.l(M).e0;
            long j = wlb0.h(M).getText().j;
            Object x8 = M.x();
            if (x8 == c0012a) {
                q630Var3 = c3;
                x8 = new rte(wh50Var3, wh50Var, wh50Var5, 5);
                M.R(x8);
            } else {
                q630Var3 = c3;
            }
            yqv0.d(us2Var3, q630Var3, j, 3, null, 2, false, 1, (izs) x8, null, frv0Var, M, 100663296, 54, 4792);
            aVar2 = M;
            if (((Boolean) wh50Var5.getValue()).booleanValue()) {
                aVar2.K(89248616);
                q630 C = txj0.C(aVar4, dt1.a.o, 2);
                boolean z3 = gzsVar3 != null;
                if (gzsVar3 == null) {
                    aVar2.K(89508241);
                    Object x9 = aVar2.x();
                    if (x9 == c0012a) {
                        x9 = new daz(9);
                        aVar2.R(x9);
                    }
                    aVar2.j();
                    gzsVar2 = (gzs) x9;
                } else {
                    aVar2.K(-1659681336);
                    aVar2.j();
                    gzsVar2 = gzsVar3;
                }
                i2 = 75228339;
                yqv0.c(c3769a.b, ojc.c(C, z3, null, null, gzsVar2, 14), wlb0.h(aVar2).getText().r, null, null, 0, 0, null, 0, false, 0, 1, null, wlb0.l(aVar2).e0, aVar2, 0, 48, 6136);
                aVar2 = aVar2;
            } else {
                i2 = 75228339;
                aVar2.K(75228339);
            }
            aVar2.j();
            if (((Boolean) wh50Var3.getValue()).booleanValue()) {
                aVar2.K(i2);
            } else {
                aVar2.K(89791829);
                ljo0 ljo0Var = (ljo0) wh50Var.getValue();
                boolean z4 = (i3 & 14) == 4;
                Object x10 = aVar2.x();
                if (z4 || x10 == c0012a) {
                    lud0 lud0Var = new lud0(c3769a, wh50Var, wh50Var5, wh50Var4, wh50Var3, null);
                    aVar2.R(lud0Var);
                    x10 = lud0Var;
                }
                bap.g(ljo0Var, (wzs) x10, aVar2, 8);
            }
            aVar2.j();
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new p70(c3769a, q630Var, i, 4);
        }
    }

    public static final void e(tt9.b bVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-567823417);
        int i2 = (M.J(bVar) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-567823417, i2, -1, "com.vk.clips.design.compose.profile.Middle (ProfileCard.kt:206)");
            }
            tt9.b.C3771b c3771b = bVar.a;
            tt9.b.a aVar2 = bVar.b;
            q630.a aVar3 = q630.a.a;
            i(c3771b, txj0.f(aVar3, 1.0f), M, 48);
            if (drm0.N(aVar2.getText())) {
                M.K(1842137531);
            } else {
                M.K(1848989151);
                f9t.e(txj0.h(aVar3, 6), M, 6);
                c(aVar2, M, 6);
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
            s.d = new z5(bVar, i, 8);
        }
    }

    public static final void f(tt9 tt9Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(958922322);
        int i2 = (M.J(tt9Var) ? 4 : 2) | i | 48;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(958922322, i2, -1, "com.vk.clips.design.compose.profile.ProfileCard (ProfileCard.kt:71)");
            }
            q630Var2 = q630.a.a;
            float f = 16;
            uog0 uog0Var = wpu0.a;
            qco qcoVar = new qco(20);
            uog0Var.getClass();
            phu0.a(s200.H(txj0.f(q630Var2, 1.0f), f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10), new uog0(qcoVar, qcoVar, qcoVar, qcoVar), 0L, 0L, null, 3, kai.c(292394826, new bt3(tt9Var, 14), M), M, 1769472, 28);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xs8(tt9Var, q630Var2, i, 6);
        }
    }

    public static final void g(tt9.b.C3771b.a aVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar2, int i) {
        izs izsVar2;
        q630 q630Var2;
        float f;
        a.C0011a.C0012a c0012a;
        float f2;
        String str;
        gzs<s3q0> gzsVar;
        gzs<s3q0> gzsVar2;
        androidx.compose.runtime.a M = aVar2.M(388591372);
        int i2 = i | (M.J(aVar) ? 4 : 2);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(388591372, i2, -1, "com.vk.clips.design.compose.profile.ProfileIcons (ProfileCard.kt:474)");
            }
            izsVar2 = izsVar;
            izsVar2.invoke(Integer.valueOf(((ArrayList) rl3.I(new Object[]{aVar != null ? aVar.a : null, aVar != null ? aVar.b : null})).size()));
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630Var2 = q630Var;
            q630 c2 = qri.c(M, q630Var2);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            tt9.b.C3771b.a.C3772a c3772a = aVar != null ? aVar.a : null;
            q630.a aVar4 = q630.a.a;
            float f3 = a;
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            float f4 = b;
            if (c3772a != null) {
                M.K(1618508425);
                f9t.e(txj0.v(aVar4, f4), M, 6);
                tt9.b.C3771b.a.C3772a c3772a2 = aVar.a;
                lg90 lg90Var = c3772a2.a;
                M.K(1618683419);
                M.j();
                long j = c3772a2.b;
                gzs<s3q0> gzsVar3 = c3772a2.c;
                Object x = M.x();
                if (x == c0012a2) {
                    x = ir.h(M);
                }
                sg50 sg50Var = (sg50) x;
                if (gzsVar3 == null) {
                    M.K(1619052568);
                    Object x2 = M.x();
                    if (x2 == c0012a2) {
                        x2 = new kud0(0);
                        M.R(x2);
                    }
                    M.j();
                    gzsVar2 = (gzs) x2;
                } else {
                    M.K(-86320574);
                    M.j();
                    gzsVar2 = gzsVar3;
                }
                f2 = f4;
                c0012a = c0012a2;
                f = f3;
                str = null;
                pzu0.b(lg90Var, null, txj0.q(ojc.b(aVar4, sg50Var, null, gzsVar3 != null, null, gzsVar2, 24), f3), j, M, 8, 0);
            } else {
                f = f3;
                c0012a = c0012a2;
                f2 = f4;
                str = null;
                M.K(1602844218);
            }
            M.j();
            if ((aVar != null ? aVar.b : str) != null) {
                M.K(1619253696);
                f9t.e(txj0.v(aVar4, f2), M, 6);
                tt9.b.C3771b.a.C3773b c3773b = aVar.b;
                lg90 lg90Var2 = c3773b.a;
                M.K(1619434363);
                M.j();
                long j2 = c3773b.b;
                gzs<s3q0> gzsVar4 = c3773b.c;
                if (gzsVar4 == null) {
                    M.K(1619643800);
                    Object x3 = M.x();
                    if (x3 == c0012a) {
                        x3 = new ko60(3);
                        M.R(x3);
                    }
                    M.j();
                    gzsVar = (gzs) x3;
                } else {
                    M.K(-86301502);
                    M.j();
                    gzsVar = gzsVar4;
                }
                pzu0.b(lg90Var2, str, txj0.q(ojc.c(aVar4, gzsVar4 != null, null, null, gzsVar, 14), f), j2, M, 8, 0);
            } else {
                M.K(1602844218);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            izsVar2 = izsVar;
            q630Var2 = q630Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new q17(i, 3, aVar, izsVar2, q630Var2);
        }
    }

    public static final void h(ut9 ut9Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1812578125);
        int i2 = (M.J(ut9Var) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1812578125, i2, -1, "com.vk.clips.design.compose.profile.Top (ProfileCard.kt:196)");
            }
            M.K(-1869140155);
            a(ut9Var, M, 6);
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new y5(ut9Var, i, 7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void i(tt9.b.C3771b c3771b, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(86253157);
        int i2 = (M.J(c3771b) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(86253157, i2, -1, "com.vk.clips.design.compose.profile.UserNameAndIcons (ProfileCard.kt:334)");
            }
            azl azlVar = (azl) M.r(uvi.h);
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = androidx.compose.runtime.k.b(new pco(30));
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            ua8.a(txj0.j(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((pco) wh50Var.getValue()).b, 1, q630Var), null, false, kai.c(54525263, new qw(c3771b, azlVar, wh50Var, 1), M), M, 3072, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new pzj(c3771b, q630Var, i, 7);
        }
    }

    public static final void j(final phw phwVar, final q630 q630Var, final gzs gzsVar, float f, androidx.compose.runtime.a aVar, final int i) {
        final float f2;
        int i2;
        float a2;
        androidx.compose.runtime.a M = aVar.M(1303589598);
        int i3 = i | (M.J(phwVar) ? 4 : 2) | (M.J(q630Var) ? 32 : 16) | (M.y(gzsVar) ? 256 : 128) | 1024;
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            M.V();
            if ((i & 1) == 0 || M.i()) {
                f870.A().getClass();
                i2 = i3 & (-7169);
                a2 = er5.a();
            } else {
                M.h();
                i2 = i3 & (-7169);
                a2 = f;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1303589598, i2, -1, "com.vk.clips.design.compose.profile.VkAvatarAmbientShadow (ProfileCard.kt:250)");
            }
            float f3 = c;
            q630 s = txj0.s(s200.H(q630Var, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, f3, 2), a2, a2);
            dt1.a.getClass();
            ty6 ty6Var = dt1.a.f;
            cp10 d = ja8.d(ty6Var, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, s);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            ldu0.b(phwVar, a2, ra8.a.b(q630.a.a, ty6Var), rep.a, wep.a, false, null, gzsVar, null, M, (i2 & 14) | 27648 | ((i2 << 15) & 29360128), 352);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            f2 = a2;
        } else {
            M.h();
            f2 = f;
        }
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            s2.d = new wzs(q630Var, gzsVar, f2, i) { // from class: xsna.jud0
                public final /* synthetic */ q630 c;
                public final /* synthetic */ gzs d;
                public final /* synthetic */ float e;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    nud0.j(phw.this, this.c, this.d, this.e, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
