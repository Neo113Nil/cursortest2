package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.SeparatorAppearance;
import com.vk.core.compose.component.defaults.SeparatorDpi;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: NotificationListAppBar.kt */
/* loaded from: classes4.dex */
public final class ra70 {
    public static final void a(String str, gzs gzsVar, gzs gzsVar2, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-42990447);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.y(gzsVar) ? 32 : 16) | (M.y(gzsVar2) ? 256 : 128) | 3072;
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-42990447, i2, -1, "com.vk.notifications.list.impl.presentation.base.view.list.MilkshakeTopBarPinnedContent (NotificationListAppBar.kt:112)");
            }
            TopBar$Middle.Text a = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(str, null, null, null, null, M, (i2 & 14) | 196608, 30), null, null, null, M, 14);
            M.K(1635868547);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
            }
            lg90 b = or.b(M, -45049119, R.drawable.vk_icon_arrow_left_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.j();
            String N = d370.N(R.string.accessibility_back, 0, M);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new tcu(14);
                M.R(x);
            }
            TopBar$Before.e a2 = TopBar$Before.e.a.a(b, N, gzsVar, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), M, 1572872 | ((i2 << 3) & 896), 24);
            M.K(1635883263);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(950398620, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-MoreVertical28> (VkSdkIcons.kt:2670)");
            }
            lg90 a3 = pg90.a(R.drawable.vk_icon_more_vertical_28, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.j();
            String N2 = d370.N(R.string.notification_list_menu_settings_title, 0, M);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new ehu(17);
                M.R(x2);
            }
            aVar2 = M;
            com.vk.core.compose.component.topbar.a a4 = d.a.a(d.c.C0760d.a.a(a3, N2, gzsVar2, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3), aVar2, 1572872 | (i2 & 896), 24), null, null, null, aVar2, 24576, 14);
            q630.a aVar3 = q630.a.a;
            muv0.h(a, aVar3, null, null, null, a2, a4, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar2, 48, 0, 8092);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new f95(i, 3, str, gzsVar, gzsVar2, q630Var2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final String str, final gzs<s3q0> gzsVar, final gzs<s3q0> gzsVar2, final v6p0 v6p0Var, final q630 q630Var, wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar2;
        androidx.compose.runtime.a aVar2;
        final wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar3;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar.M(-136754391);
        int i3 = (M.J(str) ? 4 : 2) | i | (M.y(gzsVar) ? 32 : 16);
        if ((i & 384) == 0) {
            i3 |= M.y(gzsVar2) ? 256 : 128;
        }
        int i4 = i3 | (M.J(v6p0Var) ? 2048 : 1024);
        if ((i & 24576) == 0) {
            i4 |= M.J(q630Var) ? 16384 : 8192;
        }
        int i5 = i2 & 32;
        if (i5 != 0) {
            i4 |= 196608;
        } else if ((196608 & i) == 0) {
            wzsVar2 = wzsVar;
            i4 |= M.y(wzsVar2) ? 131072 : 65536;
            if (M.t(i4 & 1, (74899 & i4) == 74898)) {
                aVar2 = M;
                aVar2.h();
                wzsVar3 = wzsVar2;
            } else {
                final wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar4 = i5 != 0 ? qii.a : wzsVar2;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-136754391, i4, -1, "com.vk.notifications.list.impl.presentation.base.view.list.NotificationListAppBar (NotificationListAppBar.kt:36)");
                }
                q630 f = txj0.f(q630Var, 1.0f);
                a.m mVar = androidx.compose.foundation.layout.a.c;
                dt1.a.getClass();
                androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
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
                wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar5 = wzsVar4;
                xlu0.a(v6p0Var, null, kai.c(2136893496, new wzs() { // from class: xsna.pa70
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                        int intValue = ((Integer) obj2).intValue();
                        if (aVar4.t(intValue & 1, (intValue & 3) != 2)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(2136893496, intValue, -1, "com.vk.notifications.list.impl.presentation.base.view.list.NotificationListAppBar.<anonymous>.<anonymous> (NotificationListAppBar.kt:41)");
                            }
                            aVar4.K(189035816);
                            a.m mVar2 = androidx.compose.foundation.layout.a.c;
                            dt1.a.getClass();
                            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar2, dt1.a.n, aVar4, 0);
                            int hashCode2 = Long.hashCode(n34.n(aVar4));
                            sy90 D2 = aVar4.D();
                            q630 c2 = qri.c(aVar4, q630.a.a);
                            cri.h7.getClass();
                            LayoutNode.a aVar5 = cri.a.b;
                            if (aVar4.N() == null) {
                                n34.r();
                                throw null;
                            }
                            aVar4.H();
                            if (aVar4.L()) {
                                aVar4.I(aVar5);
                            } else {
                                aVar4.f();
                            }
                            k9q0.w(aVar4, a2, cri.a.f);
                            k9q0.w(aVar4, D2, cri.a.e);
                            k9q0.w(aVar4, Integer.valueOf(hashCode2), cri.a.g);
                            k9q0.t(aVar4, cri.a.h);
                            k9q0.w(aVar4, c2, cri.a.d);
                            ra70.a(str, gzsVar, gzsVar2, null, aVar4, 0);
                            wzsVar4.invoke(aVar4, 0);
                            aVar4.G();
                            aVar4.j();
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar4.h();
                        }
                        return s3q0.a;
                    }
                }, M), qii.b, M, ((i4 >> 9) & 14) | 3456);
                M.K(-471999436);
                ijv0.c(SeparatorDpi.At2x, SeparatorAppearance.Primary, txj0.f(s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630.a.a), 1.0f), M, 438, 0);
                aVar2 = M;
                if (gp.d(aVar2)) {
                    androidx.compose.runtime.b.e();
                }
                wzsVar3 = wzsVar5;
            }
            s = aVar2.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.qa70
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ra70.b(str, gzsVar, gzsVar2, v6p0Var, q630Var, wzsVar3, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        wzsVar2 = wzsVar;
        if (M.t(i4 & 1, (74899 & i4) == 74898)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }
}
