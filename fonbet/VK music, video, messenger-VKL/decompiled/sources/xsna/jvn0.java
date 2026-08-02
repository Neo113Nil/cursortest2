package xsna;

import android.view.View;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.jun0;
import xsna.q630;
import xsna.y2j0;

/* compiled from: TabbarSettingsContentTable.kt */
/* loaded from: classes6.dex */
public final class jvn0 {
    public static final void a(final y2j0.a aVar, final izs<? super jun0, s3q0> izsVar, androidx.compose.runtime.a aVar2, int i) {
        izs<? super jun0, s3q0> izsVar2;
        String str;
        View view;
        y2j0.a aVar3 = aVar;
        izs<? super jun0, s3q0> izsVar3 = izsVar;
        androidx.compose.runtime.a M = aVar2.M(618308141);
        int i2 = (i & 6) == 0 ? (M.J(aVar3) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar3) ? 32 : 16;
        }
        int i3 = i2;
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(618308141, i3, -1, "com.vk.tabbar.settings.impl.compose.ItemsTableV2 (TabbarSettingsContentTable.kt:117)");
            }
            final String str2 = aVar3.b;
            ArrayList U0 = j5g.U0(aVar3.d, 3, 3, true);
            final View view2 = (View) M.r(AndroidCompositionLocals_androidKt.f);
            q630.a aVar4 = q630.a.a;
            float f = 1.0f;
            float f2 = 16;
            q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, 1, txj0.f(aVar4, 1.0f));
            a.c cVar = androidx.compose.foundation.layout.a.e;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(cVar, dt1.a.n, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, F);
            cri.h7.getClass();
            LayoutNode.a aVar5 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar5);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            M.K(49876860);
            Iterator it = U0.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    e43.t();
                    throw null;
                }
                List list = (List) next;
                q630 F2 = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, 1, txj0.f(aVar4, f));
                a.g gVar = androidx.compose.foundation.layout.a.h;
                dt1.a.getClass();
                Iterator it2 = it;
                androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(gVar, dt1.a.k, M, 6);
                int hashCode2 = Long.hashCode(n34.n(M));
                sy90 D2 = M.D();
                q630 c2 = qri.c(M, F2);
                cri.h7.getClass();
                LayoutNode.a aVar6 = cri.a.b;
                if (M.N() == null) {
                    n34.r();
                    throw null;
                }
                M.H();
                if (M.L()) {
                    M.I(aVar6);
                } else {
                    M.f();
                }
                k9q0.w(M, a2, cri.a.f);
                k9q0.w(M, D2, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode2), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c2, cri.a.d);
                M.K(-1290824587);
                Iterator it3 = list.iterator();
                int i6 = 0;
                while (it3.hasNext()) {
                    Object next2 = it3.next();
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        e43.t();
                        throw null;
                    }
                    final xvn0 xvn0Var = (xvn0) next2;
                    float f3 = f2;
                    if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                        szw.a("invalid weight; must be greater than zero");
                    }
                    xpy xpyVar = new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    boolean w = brm0.w(xvn0Var.a, str2, true);
                    int i8 = (i4 * 3) + i6;
                    Iterator it4 = it3;
                    boolean J = M.J(str2) | M.J(xvn0Var) | M.y(view2) | ((i3 & 112) == 32) | ((i3 & 14) == 4);
                    Object x = M.x();
                    if (J || x == a.C0011a.a) {
                        gzs gzsVar = new gzs() { // from class: xsna.ivn0
                            @Override // xsna.gzs
                            public final Object invoke() {
                                View view3 = view2;
                                String str3 = xvn0Var.a;
                                if (!epx.f(str2, str3)) {
                                    try {
                                        view3.performHapticFeedback(3);
                                    } catch (Throwable unused) {
                                    }
                                }
                                izsVar.invoke(new jun0.d(str3, aVar.g.size()));
                                return s3q0.a;
                            }
                        };
                        str = str2;
                        view = view2;
                        M.R(gzsVar);
                        x = gzsVar;
                    } else {
                        str = str2;
                        view = view2;
                    }
                    b(xvn0Var, w, aVar, i8, xpyVar, (gzs) x, M, (i3 << 6) & 896);
                    izsVar3 = izsVar;
                    it3 = it4;
                    f2 = f3;
                    i6 = i7;
                    str2 = str;
                    view2 = view;
                }
                f = 1.0f;
                aVar3 = aVar;
                String str3 = str2;
                View view3 = view2;
                izs<? super jun0, s3q0> izsVar4 = izsVar3;
                float f4 = f2;
                M.j();
                M.K(-1290801166);
                for (int size = list.size(); size < 3; size++) {
                    q630 f5 = txj0.f(aVar4, 1.0f);
                    if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                        szw.a("invalid weight; must be greater than zero");
                    }
                    ja8.a(f5.g(new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), M, 0);
                }
                M.j();
                M.G();
                izsVar3 = izsVar4;
                i4 = i5;
                f2 = f4;
                it = it2;
                str2 = str3;
                view2 = view3;
            }
            izsVar2 = izsVar3;
            if (gp.d(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            izsVar2 = izsVar3;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new zs0(aVar3, izsVar2, i, 3);
        }
    }

    public static final void b(xvn0 xvn0Var, boolean z, y2j0.a aVar, int i, q630 q630Var, gzs gzsVar, androidx.compose.runtime.a aVar2, int i2) {
        int i3;
        boolean z2;
        y2j0.a aVar3;
        int i4;
        androidx.compose.runtime.a M = aVar2.M(183495165);
        if ((i2 & 6) == 0) {
            i3 = (M.J(xvn0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            z2 = z;
            i3 |= M.l(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        if ((i2 & 384) == 0) {
            aVar3 = aVar;
            i3 |= M.J(aVar3) ? 256 : 128;
        } else {
            aVar3 = aVar;
        }
        if ((i2 & 3072) == 0) {
            i4 = i;
            i3 |= M.o(i4) ? 2048 : 1024;
        } else {
            i4 = i;
        }
        if ((i2 & 24576) == 0) {
            i3 |= M.J(q630Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= M.y(gzsVar) ? 131072 : 65536;
        }
        if (M.t(i3 & 1, (74899 & i3) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(183495165, i3, -1, "com.vk.tabbar.settings.impl.compose.MainTabbarItem (TabbarSettingsContentTable.kt:169)");
            }
            q630 f = txj0.f(q630Var, 1.0f);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = ir.h(M);
            }
            sg50 sg50Var = (sg50) x;
            boolean z3 = (458752 & i3) == 131072;
            Object x2 = M.x();
            if (z3 || x2 == c0012a) {
                x2 = new mwm0(gzsVar, 1);
                M.R(x2);
            }
            q630 a = qri.a(ojc.b(f, sg50Var, null, false, null, (gzs) x2, 28), a5x.a, new u0r(xvn0Var, 4));
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, a);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            bvn0.b(xvn0Var, z2, aVar3, i4, M, i3 & 8190);
            q630.a aVar5 = q630.a.a;
            f9t.e(txj0.h(aVar5, 8), M, 6);
            q630 f2 = txj0.f(aVar5, 1.0f);
            gzo0 gzo0Var = xvn0Var.b;
            String str = gzo0Var.b;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-521832112, 0, -1, "com.vk.tabbar.settings.impl.compose.getTitleOrDefault (TabbarSettingsContentTable.kt:281)");
            }
            Integer num = gzo0Var.a;
            if (str != null) {
                M.K(1030517429);
                M.j();
            } else if (num != null) {
                M.K(1030518536);
                str = d370.N(num.intValue(), 0, M);
                M.j();
            } else {
                M.K(1881343534);
                M.j();
                str = "";
            }
            String str2 = str;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
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
            yqv0.c(str2, f2, ylu0Var.getText().m, null, null, 0, 3, null, 2, false, 0, 1, null, frv0Var, M, 100663344, 48, 5816);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new fvn0(xvn0Var, z, aVar, i, q630Var, gzsVar, i2);
        }
    }
}
