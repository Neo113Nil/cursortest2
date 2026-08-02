package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.hkq0;
import xsna.q630;
import xsna.ty6;

/* compiled from: Info.kt */
/* loaded from: classes16.dex */
public final class eww {
    public static final void a(final String str, final boolean z, final hkq0.a aVar, final boolean z2, final izs izsVar, final q630 q630Var, androidx.compose.runtime.a aVar2, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar2.M(1286153892);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(aVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.l(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.y(izsVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(q630Var) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1286153892, i2, -1, "com.vk.fullscreenvideo.top.AuthorWithDonutBadge (Info.kt:107)");
            }
            M.K(407896542);
            b(str, z, aVar, z2, izsVar, q630Var, M, i2 & 524286);
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.bww
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    eww.a(str, z, aVar, z2, izsVar, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final String str, final boolean z, final hkq0.a aVar, final boolean z2, final izs izsVar, final q630 q630Var, androidx.compose.runtime.a aVar2, final int i) {
        int i2;
        q630.a aVar3;
        int i3;
        androidx.compose.runtime.a M = aVar2.M(-185659185);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(aVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.l(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.y(izsVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(q630Var) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-185659185, i2, -1, "com.vk.fullscreenvideo.top.AuthorWithDonutBadgeMilkshake (Info.kt:137)");
            }
            dt1.a.getClass();
            ty6.b bVar = dt1.a.l;
            boolean z3 = ((i2 & 7168) == 2048) | ((57344 & i2) == 16384);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z3 || x == c0012a) {
                x = new fnf(z2, izsVar, 1);
                M.R(x);
            }
            q630 c = ojc.c(q630Var, false, null, null, (gzs) x, 15);
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, bVar, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, c);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            q630.a aVar5 = q630.a.a;
            q630 E = ahn.E(aVar5, "fullscreen_video_subtitle");
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            yqv0.c(str, defpackage.j0.d(1.0f, E, false), wlb0.h(M).getText().r, null, null, 0, 5, null, 2, false, 0, 1, null, wlb0.l(M).v0, M, (i2 & 14) | 100663296, 48, 5816);
            M = M;
            if (z) {
                M.K(798483194);
                f9t.e(txj0.v(aVar5, 4), M, 6);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1159845476, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Verified16> (VkSdkIcons.kt:3652)");
                }
                lg90 a2 = pg90.a(R.drawable.vk_icon_verified_16, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar3 = aVar5;
                i3 = 793298351;
                pzu0.b(a2, d370.N(R.string.video_talkback_community_verified, 0, M), aVar3, wlb0.h(M).getIcon().b, M, 392, 0);
            } else {
                aVar3 = aVar5;
                i3 = 793298351;
                M.K(793298351);
            }
            M.j();
            if (aVar != null) {
                M.K(798872647);
                q630.a aVar6 = aVar3;
                yqv0.c(" · ", null, wlb0.h(M).getText().r, null, null, 0, 0, null, 2, false, 0, 1, null, wlb0.l(M).v0, M, 100663302, 48, 5882);
                us2 us2Var = (us2) aVar.a.invoke(M, 0);
                qzu0.a.getClass();
                lg90 I = qzu0.I(M);
                frv0 frv0Var = wlb0.l(M).v0;
                long j = wlb0.h(M).getText().r;
                boolean z4 = (i2 & 896) == 256;
                Object x2 = M.x();
                if (z4 || x2 == c0012a) {
                    x2 = new cww(aVar, 0);
                    M.R(x2);
                }
                yyn.a(us2Var, egi0.b(aVar6, false, (izs) x2), null, I, 0L, j, frv0Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 4096, 148);
                M = M;
            } else {
                M.K(i3);
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
            s.d = new wzs() { // from class: xsna.dww
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    eww.b(str, z, aVar, z2, izsVar, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(final hkq0 hkq0Var, final boolean z, final izs izsVar, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        boolean z2;
        androidx.compose.runtime.a M = aVar.M(-418079084);
        if ((i & 6) == 0) {
            i2 = (M.J(hkq0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z2 = z;
            i2 |= M.l(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(q630Var) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-418079084, i2, -1, "com.vk.fullscreenvideo.top.Info (Info.kt:39)");
            }
            a.c cVar = androidx.compose.foundation.layout.a.e;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(cVar, dt1.a.n, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            String str = hkq0Var.a;
            q630.a aVar3 = q630.a.a;
            d(((i2 >> 3) & 112) | 384, M, str, izsVar, txj0.u(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 20, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13));
            f9t.e(txj0.h(aVar3, 1), M, 6);
            int i3 = i2 << 6;
            a(hkq0Var.b, hkq0Var.c, hkq0Var.d, z2, izsVar, txj0.u(aVar3, 14, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), M, (i3 & 57344) | (i3 & 7168) | 196608);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.aww
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    eww.c(hkq0.this, z, izsVar, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void d(int i, androidx.compose.runtime.a aVar, String str, izs izsVar, q630 q630Var) {
        String str2;
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1358628486);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = (M.J(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1358628486, i3, -1, "com.vk.fullscreenvideo.top.Title (Info.kt:68)");
            }
            dt1.a.getClass();
            ty6.b bVar = dt1.a.l;
            boolean z = (i3 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new h97(izsVar, 2);
                M.R(x);
            }
            q630 c = ojc.c(q630Var, false, null, null, (gzs) x, 15);
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, bVar, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, c);
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
            k9q0.w(M, c2, cri.a.d);
            q630 E = ahn.E(q630.a.a, "fullscreen_video_title");
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            yqv0.c(str2, defpackage.j0.d(1.0f, E, false), wlb0.h(M).getText().d, null, null, 0, 5, null, 2, false, 0, 1, null, wlb0.l(M).E, M, (i3 & 14) | 100663296, 48, 5816);
            aVar2 = M;
            aVar2.K(-1147743360);
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
            s.d = new mte(i, 1, (Object) str, izsVar, q630Var);
        }
    }
}
