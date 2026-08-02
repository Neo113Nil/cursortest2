package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.gnd;
import xsna.q630;
import xsna.tlo0;

/* compiled from: TopBar.kt */
/* loaded from: classes16.dex */
public final class r7p0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(int i, androidx.compose.runtime.a aVar, String str, gzs gzsVar, izs izsVar, q630 q630Var) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-508553619);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(gzsVar) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-508553619, i2, -1, "com.vk.clips.coauthors.selector.ui.Input (TopBar.kt:117)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = or.a(str, 0L, 6, M);
            }
            wh50 wh50Var = (wh50) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new rwr();
                M.R(x2);
            }
            rwr rwrVar = (rwr) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new Object();
                M.R(x3);
            }
            tho0 tho0Var = (tho0) wh50Var.getValue();
            String N = d370.N(R.string.vk_search, 0, M);
            q630 g = q630Var.g(txj0.f(jvi.d(q630.a.a, rwrVar), 1.0f));
            boolean z = (i2 & 896) == 256;
            Object x4 = M.x();
            if (z || x4 == c0012a) {
                x4 = new j1k0(4, gzsVar, wh50Var);
                M.R(x4);
            }
            gzs gzsVar2 = (gzs) x4;
            boolean y = M.y(x3) | ((i2 & 112) == 32);
            Object x5 = M.x();
            if (y || x5 == c0012a) {
                x5 = new pps(x3, wh50Var, izsVar, 4);
                M.R(x5);
            }
            aVar2 = M;
            jiv0.d(tho0Var, N, g, false, false, null, null, null, null, null, gzsVar2, false, (izs) x5, aVar2, 0, 0, 3064);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new vwl(str, izsVar, gzsVar, q630Var, i, 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(gnd.a aVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar2, int i) {
        tlo0 tlo0Var;
        tlo0 tlo0Var2;
        tlo0 tlo0Var3;
        tlo0 tlo0Var4;
        wh50 wh50Var;
        androidx.compose.runtime.a M = aVar2.M(1499072373);
        int i2 = i | (M.J(aVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.J(q630Var) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1499072373, i2, -1, "com.vk.clips.coauthors.selector.ui.TopBarContent (TopBar.kt:40)");
            }
            TopBar$Middle.Text.d dVar = null;
            if (aVar instanceof gnd.a.c) {
                M.K(-204532129);
                M.j();
                tlo0.Companion.getClass();
                tlo0Var4 = tlo0.c.a;
                tlo0Var3 = null;
            } else {
                if (aVar instanceof gnd.a.C2950a) {
                    M.K(-204390552);
                    gnd.a.C2950a c2950a = (gnd.a.C2950a) aVar;
                    tlo0Var = (tlo0) jk50.c(c2950a.a, M).getValue();
                    tlo0Var2 = (tlo0) jk50.a(c2950a.b, M, 0, 3).getValue();
                    M.j();
                } else if (aVar instanceof gnd.a.b) {
                    M.K(-204198104);
                    gnd.a.b bVar = (gnd.a.b) aVar;
                    tlo0Var = (tlo0) jk50.c(bVar.a, M).getValue();
                    tlo0Var2 = (tlo0) jk50.a(bVar.b, M, 0, 3).getValue();
                    M.j();
                } else {
                    if (!(aVar instanceof gnd.a.d)) {
                        throw alb0.c(1794515836, M);
                    }
                    M.K(-204003672);
                    gnd.a.d dVar2 = (gnd.a.d) aVar;
                    tlo0Var = (tlo0) jk50.c(dVar2.a, M).getValue();
                    tlo0Var2 = (tlo0) jk50.a(dVar2.b, M, 0, 3).getValue();
                    M.j();
                }
                tlo0Var3 = tlo0Var2;
                tlo0Var4 = tlo0Var;
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b("");
                M.R(x);
            }
            wh50 wh50Var2 = (wh50) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new Object();
                M.R(x2);
            }
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object x3 = M.x();
            if (z || x3 == c0012a) {
                x3 = new l1e(izsVar, 4);
                M.R(x3);
            }
            izs izsVar2 = (izs) x3;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(q630Var, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, m);
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
            iyk0 iyk0Var = AndroidCompositionLocals_androidKt.b;
            Object obj = x2;
            tlo0 tlo0Var5 = tlo0Var3;
            TopBar$Middle.Text.Title a2 = TopBar$Middle.Text.Title.b.a(tlo0Var4.a((Context) M.r(iyk0Var)).toString(), null, null, null, null, M, 196608, 30);
            if (tlo0Var5 == null) {
                M.K(-690655551);
            } else {
                M.K(-690655550);
                dVar = TopBar$Middle.Text.d.a.a(tlo0Var5.a((Context) M.r(iyk0Var)).toString(), 0, 0, null, null, M, 196608, 30);
            }
            M.j();
            TopBar$Middle.Text.d dVar3 = dVar;
            SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.Merge;
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = new e750(20);
                M.R(x4);
            }
            TopBar$Middle.Text a3 = TopBar$Middle.Text.b.a(a2, dVar3, null, com.vk.core.compose.component.semantics.b.a(mode, (izs) x4, 2), M, 4);
            String N = d370.N(R.string.clips_coauthors_selection_accessibility_close, 0, M);
            boolean z2 = i3 == 32;
            Object x5 = M.x();
            if (z2 || x5 == c0012a) {
                x5 = new me1(izsVar, 7);
                M.R(x5);
            }
            TopBar$Before.d a4 = TopBar$Before.d.a.a(N, (gzs) x5, null, null, M, 24576, 12);
            q630.a aVar4 = q630.a.a;
            muv0.h(a3, ahn.E(aVar4, "CoauthorsTopBar"), null, null, null, a4, null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 48, 0, 8156);
            String str = (String) wh50Var2.getValue();
            boolean y = M.y(obj) | M.J(izsVar2);
            Object x6 = M.x();
            if (y || x6 == c0012a) {
                wh50Var = wh50Var2;
                x6 = new zgb(wh50Var, obj, izsVar2, 7);
                M.R(x6);
            } else {
                wh50Var = wh50Var2;
            }
            izs izsVar3 = (izs) x6;
            boolean z3 = i3 == 32;
            Object x7 = M.x();
            if (z3 || x7 == c0012a) {
                x7 = new com.vk.movika.sdk.base.flow.binding.l(23, izsVar, wh50Var);
                M.R(x7);
            }
            a(3072, M, str, (gzs) x7, izsVar3, ahn.E(s200.E(aVar4, 16, 10), "SearchTextField"));
            M = M;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new o54(i, 5, aVar, izsVar, q630Var);
        }
    }
}
