package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.core.compose.component.defaults.TabMode;
import xsna.cri;
import xsna.dt1;
import xsna.npv0;
import xsna.q630;

/* compiled from: VkTabItem.kt */
/* loaded from: classes17.dex */
public final class ipv0 {
    public static final void a(final mtk0 mtk0Var, final TabMode tabMode, q630 q630Var, final psn0 psn0Var, osn0 osn0Var, final ssn0 ssn0Var, final msn0 msn0Var, androidx.compose.runtime.a aVar, final int i) {
        final q630 q630Var2;
        int i2;
        final osn0 osn0Var2 = osn0Var;
        androidx.compose.runtime.a M = aVar.M(-316672283);
        int i3 = i | 384 | (M.J(psn0Var) ? 2048 : 1024) | (M.J(osn0Var2) ? 16384 : 8192) | (M.J(ssn0Var) ? 131072 : 65536) | (M.J(msn0Var) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (M.t(i3 & 1, (599187 & i3) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-316672283, i3, -1, "com.vk.core.compose.component.tabs.VKTabItem (VkTabItem.kt:54)");
            }
            Object value = mtk0Var.getValue();
            boolean z = ((i3 & 7168) == 2048) | ((57344 & i3) == 16384) | ((458752 & i3) == 131072);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                i2 = -1;
                hpv0 hpv0Var = new hpv0(psn0Var, mtk0Var, osn0Var2, ssn0Var, null);
                osn0Var2 = osn0Var2;
                M.R(hpv0Var);
                x = hpv0Var;
            } else {
                i2 = -1;
            }
            bap.g(value, (wzs) x, M, 0);
            bpn0 bpn0Var = npv0.a;
            int i4 = i3 >> 3;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-906745748, 6, i2, "com.vk.core.compose.component.defaults.VkTabsDefault.tabInnerHorizontalPadding (VkTabsDefault.kt:98)");
            }
            int[] iArr = npv0.a.$EnumSwitchMapping$0;
            float f = iArr[tabMode.ordinal()] == 1 ? kqu0.v : kqu0.t;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-798896870, 6, i2, "com.vk.core.compose.component.defaults.VkTabsDefault.tabInnerVerticalPadding (VkTabsDefault.kt:109)");
            }
            float f2 = iArr[tabMode.ordinal()] == 1 ? (float) 5.5d : kqu0.r;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630.a aVar2 = q630.a.a;
            q630 E = s200.E(aVar2, f, f2);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new fuh0(10);
                M.R(x2);
            }
            q630 b = egi0.b(E, true, (izs) x2);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            a.j g = androidx.compose.foundation.layout.a.g(kqu0.s);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(g, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, b);
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
            if (osn0Var2 == null) {
                M.K(134183046);
            } else {
                M.K(1805443803);
                osn0Var2.a(tabMode, M, ((i3 >> 6) & 896) | 54);
            }
            M.j();
            if (psn0Var == null) {
                M.K(134225702);
            } else {
                M.K(1805445179);
                psn0Var.a(tabMode, M, (i4 & 896) | 54);
            }
            M.j();
            if (msn0Var == null) {
                M.K(134271055);
            } else {
                M.K(1805446642);
                msn0Var.a(((i3 >> 15) & 112) | 6, M);
            }
            M.j();
            if (ssn0Var == null) {
                M.K(134304070);
            } else {
                M.K(1805447707);
                ssn0Var.a(tabMode, M, ((i3 >> 9) & 896) | 54);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(tabMode, q630Var2, psn0Var, osn0Var2, ssn0Var, msn0Var, i) { // from class: xsna.gpv0
                public final /* synthetic */ TabMode c;
                public final /* synthetic */ q630 d;
                public final /* synthetic */ psn0 e;
                public final /* synthetic */ osn0 f;
                public final /* synthetic */ ssn0 g;
                public final /* synthetic */ msn0 h;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(55);
                    ipv0.a(mtk0.this, this.c, this.d, this.e, this.f, this.g, this.h, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
