package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.messagetemplates.impl.keyboard.h;
import com.vkontakte.android.R;
import java.util.Iterator;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;

/* compiled from: TemplatesKeyboardView.kt */
/* loaded from: classes3.dex */
public final class m9o0 {
    /* JADX WARN: Code restructure failed: missing block: B:76:0x027d, code lost:
    
        if (r5 == r4) goto L89;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(h.a aVar, izs<? super j9o0, s3q0> izsVar, androidx.compose.runtime.a aVar2, int i) {
        int i2;
        wh50 wh50Var;
        int i3;
        int i4;
        wh50 wh50Var2;
        a.C0011a.C0012a c0012a;
        String str = aVar.b;
        androidx.compose.runtime.a M = aVar2.M(1271002801);
        if ((i & 6) == 0) {
            i2 = i | (M.J(aVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        int i5 = i2;
        if (M.t(i5 & 1, (i5 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1271002801, i5, -1, "com.vk.messagetemplates.impl.keyboard.ui.TemplateRow (TemplatesKeyboardView.kt:85)");
            }
            String concat = "template_".concat(str);
            q630.a aVar3 = q630.a.a;
            q630 E = ahn.E(aVar3, concat);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(E, ylu0Var.getBackground().g, vog0.b(16));
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, m);
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
            k9q0.w(M, d, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            Object x = M.x();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (x == c0012a2) {
                x = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x);
            }
            wh50 wh50Var3 = (wh50) x;
            Object x2 = M.x();
            if (x2 == c0012a2) {
                x2 = androidx.compose.runtime.i.a(0);
                M.R(x2);
            }
            rg50 rg50Var = (rg50) x2;
            float j1 = ((azl) M.r(uvi.h)).j1(rg50Var.getIntValue());
            Object x3 = M.x();
            if (x3 == c0012a2) {
                wh50Var = wh50Var3;
                x3 = new svk0(rg50Var, 10);
                M.R(x3);
            } else {
                wh50Var = wh50Var3;
            }
            q630 o = egi.o(aVar3, (izs) x3);
            SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.Merge;
            Object x4 = M.x();
            if (x4 == c0012a2) {
                x4 = new yml0(1);
                M.R(x4);
            }
            wh50 wh50Var4 = wh50Var;
            com.vk.core.compose.component.cell.content.h1 a = Cell$Middle.d.b.a(str, null, null, 1, com.vk.core.compose.component.semantics.b.a(mode, (izs) x4, 2), null, M, 12610560, 70);
            String str2 = aVar.c;
            Object x5 = M.x();
            if (x5 == c0012a2) {
                x5 = new tdk0(3);
                M.R(x5);
            }
            com.vk.core.compose.component.cell.content.k0 a2 = Cell$Middle.a.a(a, Cell$Middle.c.b.b(str2, 1, null, null, com.vk.core.compose.component.semantics.b.a(mode, (izs) x5, 2), M, 12583344, 88), null, null, M, 196608, 28);
            if (androidx.compose.runtime.b.d()) {
                i3 = -1;
                i4 = 0;
                androidx.compose.runtime.b.f(245428636, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-MoreHorizontal24> (VkSdkIcons.kt:2634)");
            } else {
                i3 = -1;
                i4 = 0;
            }
            lg90 b = or.b(M, 1530334916, R.drawable.vk_icon_more_horizontal_24, M, i4);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, i4, i3, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var2.getIcon().l;
            Object x6 = M.x();
            if (x6 == c0012a2) {
                wh50Var2 = wh50Var4;
                x6 = new prv(1, wh50Var2);
                M.R(x6);
            } else {
                wh50Var2 = wh50Var4;
            }
            gzs gzsVar = (gzs) x6;
            Object x7 = M.x();
            if (x7 == c0012a2) {
                x7 = new av70(20);
                M.R(x7);
            }
            wh50 wh50Var5 = wh50Var2;
            com.vk.core.compose.component.cell.content.y0 a3 = o.c.a(null, com.vk.core.compose.component.cell.content.p.a(b, j, 0L, null, gzsVar, com.vk.core.compose.component.semantics.b.a(mode, (izs) x7, 2), M, 1597448, 12), null, null, null, M, 61);
            int i6 = i5 & 112;
            boolean z = (i6 == 32) | ((i5 & 14) == 4);
            Object x8 = M.x();
            if (z) {
                c0012a = c0012a2;
            } else {
                c0012a = c0012a2;
            }
            x8 = new q2m0(1, izsVar, aVar);
            M.R(x8);
            wiu0.b(o, false, null, a2, a3, (gzs) x8, null, M, 6, 70);
            M = M;
            if (((Boolean) wh50Var5.getValue()).booleanValue()) {
                M.K(-1263642364);
                q630 l = kci.l(txj0.f(aVar3, 1.0f), -4, ((-j1) / 2) - 10);
                cp10 d2 = ja8.d(dt1.a.j, false);
                int hashCode2 = Long.hashCode(n34.n(M));
                sy90 D2 = M.D();
                q630 c2 = qri.c(M, l);
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
                ur.d(hashCode2, M, bVar, M, c2678a);
                k9q0.w(M, c2, dVar);
                int i7 = aVar.a;
                Object x9 = M.x();
                if (x9 == c0012a) {
                    x9 = new o8s(1, wh50Var5);
                    M.R(x9);
                }
                q70.a(i7, i6 | 384, M, (gzs) x9, izsVar);
                M.G();
            } else {
                M.K(-1268945193);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new zq8(aVar, izsVar, i, 2);
        }
    }

    public static final void b(com.vk.messagetemplates.impl.keyboard.h hVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1754770036);
        int i2 = i | (M.J(hVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.J(q630Var) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1754770036, i2, -1, "com.vk.messagetemplates.impl.keyboard.ui.TemplatesKeyboardScreen (TemplatesKeyboardView.kt:48)");
            }
            float f = 8;
            q630 z = txj0.z(s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(q630Var, 1.0f)), null, 3);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            ty6.a aVar2 = dt1.a.n;
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, aVar2, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, z);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            jgh0 x = p490.x(M);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            q630 H = s200.H(p490.D(ahn.E(new xpy(1.0f, false), "templates_list"), x, 14), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.g(f), aVar2, M, 6);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, H);
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
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            M.K(-59336032);
            Iterator it = hVar.b.iterator();
            while (it.hasNext()) {
                h.a aVar4 = (h.a) it.next();
                M.W(-1777686423, Integer.valueOf(aVar4.a));
                a(aVar4, izsVar, M, i2 & 112);
                M.a0();
            }
            M.j();
            M.G();
            n6k.a(hVar.c, txj0.f(s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 1, q630.a.a), 1.0f), izsVar, M, ((i2 << 3) & 896) | 48);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new m2(hVar, izsVar, q630Var, i, 5);
        }
    }
}
