package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.notifications.core.item.a;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.i870;
import xsna.kb70;
import xsna.q630;
import xsna.ty6;
import xsna.w770;

/* compiled from: MilkshakeNotification.kt */
/* loaded from: classes4.dex */
public final class un20 {
    public static final void a(kb70.d dVar, izs<? super snv, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1486080829);
        int i2 = (M.J(dVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1486080829, i2, -1, "com.vk.notifications.design.compose.list.common.AlignContent (MilkshakeNotification.kt:277)");
            }
            List<de70> list = null;
            q630 C = txj0.C(q630.a.a, null, 3);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, C);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            String str = dVar.d;
            if (str == null) {
                M.K(-1236059344);
            } else {
                M.K(-1236059343);
                k(str, M, 0);
            }
            M.j();
            List<de70> list2 = dVar.h;
            if (list2 != null && !list2.isEmpty()) {
                list = list2;
            }
            if (list == null) {
                M.K(-1235910389);
            } else {
                M.K(-1235910388);
                e(i2 & 112, M, list, izsVar);
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
            s.d = new hy7(dVar, izsVar, i, 3);
        }
    }

    public static final void b(kb70.d dVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1496253706);
        if ((i & 6) == 0) {
            i2 = (M.J(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1496253706, i2, -1, "com.vk.notifications.design.compose.list.common.MilkshakeNotification (MilkshakeNotification.kt:59)");
            }
            q630 E = ahn.E(q630Var, "NotificationItem");
            snv snvVar = dVar.c;
            w770 w770Var = dVar.e;
            boolean z = snvVar != null;
            int i3 = i2 & 112;
            boolean z2 = ((i2 & 14) == 4) | (i3 == 32);
            Object x = M.x();
            if (z2 || x == a.C0011a.a) {
                x = new com.vk.movika.sdk.android.defaultplayer.container.e(17, dVar, izsVar);
                M.R(x);
            }
            gzs gzsVar = (gzs) x;
            if (z) {
                E = ojc.c(E, false, null, null, gzsVar, 15);
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar2 = cri.a.d;
            k9q0.w(M, c, dVar2);
            q630.a aVar3 = q630.a.a;
            q630 E2 = s200.E(txj0.z(txj0.f(aVar3, 1.0f), null, 3), 16, 10);
            int i4 = i2;
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, w770Var instanceof w770.a ? dt1.a.l : dt1.a.k, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, E2);
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
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar2);
            y770.a(w770Var, izsVar, null, M, i3);
            f9t.e(txj0.v(aVar3, 12), M, 6);
            g(dVar, izsVar, M, i4 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            M.G();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new y2c(i, 1, dVar, izsVar, q630Var);
        }
    }

    public static final void c(com.vk.notifications.core.item.a aVar, boolean z, izs<? super snv, s3q0> izsVar, androidx.compose.runtime.a aVar2, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar2.M(969868063);
        if ((i & 6) == 0) {
            i2 = (M.J(aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(969868063, i2, -1, "com.vk.notifications.design.compose.list.common.NotificationAttachmentContent (MilkshakeNotification.kt:155)");
            }
            boolean z2 = aVar instanceof a.b;
            q630.a aVar3 = q630.a.a;
            if (z2) {
                M.K(1094715495);
                f9t.e(txj0.h(aVar3, 4), M, 6);
                fi70.a((a.b) aVar, null, M, 0);
                M.j();
            } else if (aVar instanceof a.C1441a) {
                M.K(1094886150);
                f9t.e(txj0.h(aVar3, 8), M, 6);
                c870.a((a.C1441a) aVar, izsVar, null, M, (i2 >> 3) & 112);
                M.j();
            } else if (aVar instanceof a.c) {
                M.K(1095123176);
                f9t.e(txj0.h(aVar3, z ? 4 : 8), M, 0);
                oi70.a((a.c) aVar, izsVar, null, M, (i2 >> 3) & 112);
                M.j();
            } else {
                if (aVar != null) {
                    throw alb0.c(35311950, M);
                }
                M.K(35336899);
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
            s.d = new sn20(aVar, z, izsVar, i, 0);
        }
    }

    public static final void d(i870 i870Var, izs<? super snv, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1707397273);
        if ((i & 6) == 0) {
            i2 = (M.J(i870Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1707397273, i2, -1, "com.vk.notifications.design.compose.list.common.NotificationButtonContent (MilkshakeNotification.kt:425)");
            }
            if (i870Var instanceof i870.a) {
                M.K(225737821);
                h870.b((i870.a) i870Var, izsVar, M, i2 & 112);
                M.j();
            } else {
                if (!(i870Var instanceof i870.b)) {
                    throw alb0.c(-131266571, M);
                }
                M.K(225875430);
                q630.a aVar2 = q630.a.a;
                q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 5, 1, aVar2);
                a.l lVar = androidx.compose.foundation.layout.a.a;
                dt1.a.getClass();
                androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, F);
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
                i870.b bVar = (i870.b) i870Var;
                pzu0.b(pg90.a(bVar.a, 0, M), null, s200.H(txj0.q(aVar2, 16), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), wlb0.h(M).getText().p, M, 440, 0);
                yqv0.c(bVar.b, ahn.E(txj0.C(aVar2, null, 3), "notificationButtonContent"), wlb0.h(M).getText().p, null, null, 0, 0, null, 0, false, 0, 1, null, wlb0.l(M).h0, M, 48, 48, 6136);
                M = M;
                M.G();
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
            s.d = new n5c(i870Var, izsVar, i, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(int i, androidx.compose.runtime.a aVar, List list, izs izsVar) {
        int i2;
        List list2 = list;
        androidx.compose.runtime.a M = aVar.M(1551909261);
        if ((i & 6) == 0) {
            i2 = i | (M.J(list2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1551909261, i2, -1, "com.vk.notifications.design.compose.list.common.NotificationDropdownContent (MilkshakeNotification.kt:365)");
            }
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar2 = q630.a.a;
            q630 c = qri.c(M, aVar2);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            float f = 16;
            q630 E = ahn.E(aVar2, "NotificationDotMenu");
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new vd1(25);
                M.R(x2);
            }
            q630 a = rdu.a(E, (izs) x2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-836118916, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-MoreVertical16> (VkSdkIcons.kt:2658)");
            }
            lg90 a2 = pg90.a(R.drawable.vk_icon_more_vertical_16, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getIcon().l;
            String N = d370.N(R.string.accessibility_actions, 0, M);
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new mni(2, wh50Var);
                M.R(x3);
            }
            nzu0.c((gzs) x3, a2, N, a, f, j, false, null, false, null, null, M, 27718, 1984);
            M = M;
            float f2 = 8;
            q630 H = s200.H(txj0.B(aVar2, null, 3), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, 5);
            ty6 ty6Var = dt1.a.d;
            long floatToRawIntBits = (Float.floatToRawIntBits(0) << 32) | (Float.floatToRawIntBits(f + f2) & 4294967295L);
            boolean booleanValue = ((Boolean) wh50Var.getValue()).booleanValue();
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = new pn20(0, wh50Var);
                M.R(x4);
            }
            list2 = list;
            oqu0.b(booleanValue, (gzs) x4, H, ty6Var, floatToRawIntBits, null, null, false, null, kai.c(1365789517, new qn20(list, izsVar, wh50Var, 0), M), M, 28080, 6, 992);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new rn20(list2, izsVar, i, 0);
        }
    }

    public static final void f(wh50<Boolean> wh50Var, boolean z) {
        wh50Var.setValue(Boolean.valueOf(z));
    }

    public static final void g(kb70.d dVar, izs<? super snv, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        izs<? super snv, s3q0> izsVar2;
        boolean z;
        int i3;
        int i4;
        q630.a aVar2;
        int i5;
        androidx.compose.runtime.a M = aVar.M(1767074988);
        if ((i & 6) == 0) {
            i2 = i | (M.J(dVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1767074988, i2, -1, "com.vk.notifications.design.compose.list.common.NotificationMiddleContent (MilkshakeNotification.kt:96)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            ty6.a aVar3 = dt1.a.n;
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, aVar3, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar4 = q630.a.a;
            q630 c = qri.c(M, aVar4);
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
            int i6 = i2 & 112;
            i(dVar, izsVar, M, i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            String str = dVar.i;
            if (str == null) {
                M.K(1440241558);
                M.j();
                i4 = i6;
                i3 = i2;
                z = false;
                aVar2 = aVar4;
                i5 = 6;
            } else {
                M.K(1440241559);
                float f = 3;
                f9t.e(txj0.h(aVar4, f), M, 6);
                q630 C = txj0.C(ahn.E(aVar4, "NotificationItemContent").g(new gcv(aVar3)), null, 3);
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
                z = false;
                i3 = i2;
                i4 = i6;
                aVar2 = aVar4;
                i5 = 6;
                yqv0.c(str, C, ylu0Var.getText().p, null, null, 0, 0, null, 2, false, 0, 1, null, frv0Var, M, 100663296, 48, 5880);
                M = M;
                ck70.b(aVar2, f, M, 6);
            }
            izsVar2 = izsVar;
            c(dVar.j, dVar.i != null ? true : z, izsVar2, M, (i3 << 3) & 896);
            i870 i870Var = dVar.k;
            if (i870Var == null) {
                M.K(1441034135);
            } else {
                M.K(1441034136);
                f9t.e(txj0.h(aVar2, 8), M, i5);
                d(i870Var, izsVar2, M, i4);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            izsVar2 = izsVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new u9z(dVar, izsVar2, i, 1);
        }
    }

    public static final void h(kb70.d dVar, izs<? super snv, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        us2 j;
        q630 q630Var;
        androidx.compose.runtime.a M = aVar.M(1231428197);
        if ((i & 6) == 0) {
            i2 = (M.J(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        int i3 = 1;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1231428197, i2, -1, "com.vk.notifications.design.compose.list.common.NotificationSubtitleAsTitleContent (MilkshakeNotification.kt:196)");
            }
            q630 f = txj0.f(q630.a.a, 1.0f);
            a.h hVar = androidx.compose.foundation.layout.a.g;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(hVar, dt1.a.l, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            wjo0 a2 = xjo0.a(0, 1, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.e0;
            s8u0 s8u0Var = dVar.g;
            if (s8u0Var == null) {
                M.K(-555240691);
                M.j();
                j = null;
            } else {
                M.K(-2096120972);
                j = s8u0Var.j(8, M);
                M.j();
            }
            String str = j != null ? (String) j5g.a0(drm0.b0(j, new char[]{'\n'}, 0, 6)) : null;
            if (str == null) {
                str = "";
            }
            boolean J = ((i2 & 112) == 32) | ((i2 & 14) == 4) | M.J(j) | M.J(frv0Var) | M.J(a2) | M.J(str);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                String str2 = str;
                q630Var = null;
                tn20 tn20Var = new tn20(j, frv0Var, a2, str2, dVar, izsVar, 0);
                M.R(tn20Var);
                x = tn20Var;
            } else {
                q630Var = null;
            }
            xtm0.a(q630Var, (wzs) x, M, 0, 1);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new sy9(dVar, izsVar, i, i3);
        }
    }

    public static final void i(kb70.d dVar, izs<? super snv, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-213640293);
        if ((i & 6) == 0) {
            i2 = (M.J(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-213640293, i2, -1, "com.vk.notifications.design.compose.list.common.NotificationTitleContent (MilkshakeNotification.kt:136)");
            }
            if (dVar.f.a.length() != 0 || dVar.g == null) {
                M.K(583932098);
                j(dVar, izsVar, M, i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                M.j();
            } else {
                M.K(583792288);
                h(dVar, izsVar, M, i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
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
            s.d = new y78(dVar, izsVar, i, 2);
        }
    }

    public static final void j(kb70.d dVar, izs<? super snv, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        int i3;
        androidx.compose.runtime.a M = aVar.M(443690339);
        if ((i & 6) == 0) {
            i2 = i | (M.J(dVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(443690339, i2, -1, "com.vk.notifications.design.compose.list.common.NotificationTitleSubtitleContent (MilkshakeNotification.kt:301)");
            }
            q630.a aVar3 = q630.a.a;
            q630 f = txj0.f(aVar3, 1.0f);
            a.h hVar = androidx.compose.foundation.layout.a.g;
            dt1.a.getClass();
            ty6.b bVar = dt1.a.l;
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(hVar, bVar, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
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
            cri.a.d dVar2 = cri.a.d;
            k9q0.w(M, c, dVar2);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            q630 E = ahn.E(s200.H(new xpy(1.0f, true), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), "NotificationTitle");
            us2 j = dVar.f.j(8, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            iyk0 iyk0Var = rrv0.c;
            wuv0 wuv0Var = (wuv0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int i4 = i2;
            yqv0.d(j, E, 0L, 0, null, 2, false, 1, null, null, wuv0Var.h0, M, 100663296, 6, 6908);
            q630 g = txj0.C(aVar3, null, 3).g(new gor0(dt1.a.k));
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, bVar, M, 48);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, g);
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
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar2, M, c2678a);
            k9q0.w(M, c2, dVar2);
            String str = dVar.d;
            if (str == null) {
                M.K(-1022156692);
                M.j();
                i3 = 0;
            } else {
                M.K(-1022156691);
                i3 = 0;
                k(str, M, 0);
                M.j();
            }
            List<de70> list = dVar.h;
            if (list == null || list.isEmpty()) {
                list = null;
            }
            if (list == null) {
                M.K(-1021987525);
            } else {
                M.K(-1021987524);
                e(i4 & 112, M, list, izsVar);
            }
            M.j();
            M.G();
            M.G();
            s8u0 s8u0Var = dVar.g;
            if (s8u0Var == null) {
                M.K(-1929100399);
                M.j();
                aVar2 = M;
            } else {
                M.K(-1929100398);
                f9t.e(txj0.h(aVar3, 2), M, 6);
                q630 E2 = ahn.E(aVar3, "NotificationSubtitle");
                us2 j2 = s8u0Var.j(8, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, i3, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var2 = (wuv0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2 = M;
                yqv0.d(j2, E2, 0L, 0, null, 2, false, 6, null, null, wuv0Var2.e0, aVar2, 100663344, 6, 6908);
                aVar2.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wp8(dVar, izsVar, i, 3);
        }
    }

    public static final void k(String str, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1539220304);
        int i2 = i | (M.J(str) ? 4 : 2);
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1539220304, i2, -1, "com.vk.notifications.design.compose.list.common.TimeText (MilkshakeNotification.kt:351)");
            }
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
            yqv0.c(str, q630.a.a, ylu0Var.getText().p, null, null, 0, 0, null, 0, false, 0, 1, null, frv0Var, M, (i2 & 14) | 48, 48, 6136);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new com.vk.movika.sdk.android.defaultplayer.control.l(str, i, 7);
        }
    }
}
