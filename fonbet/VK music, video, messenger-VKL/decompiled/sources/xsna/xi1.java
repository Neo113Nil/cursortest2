package xsna;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.gl.tf.Tensorflow;
import xsna.cri;
import xsna.dt1;
import xsna.pi1;
import xsna.q630;
import xsna.wkj;

/* compiled from: AlbumItem.kt */
/* loaded from: classes18.dex */
public final class xi1 {
    public static final void a(final String str, final boolean z, final pi1 pi1Var, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        qow qowVar;
        androidx.compose.runtime.a M = aVar.M(704589232);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? M.J(pi1Var) : M.y(pi1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(q630Var) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(704589232, i2, -1, "com.vk.ecomm.design.compose.album.AlbumImage (AlbumItem.kt:167)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 g = q630Var.g(r18.a((float) 0.5d, ylu0Var.getImage().a, q630.a.a, pi1Var.b()));
            if (str == null || drm0.N(str)) {
                M.K(912951906);
                c(pi1Var, g, M, (i2 >> 6) & 14);
                M.j();
            } else {
                M.K(913078820);
                int i3 = (i2 >> 3) & 14;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1214595970, i3, -1, "com.vk.ecomm.design.compose.album.getPostProcessor (AlbumItem.kt:225)");
                }
                if (z) {
                    M.K(-1070789973);
                    Object x = M.x();
                    if (x == a.C0011a.a) {
                        qow qowVar2 = new qow(new jwx(2, 30));
                        M.R(qowVar2);
                        x = qowVar2;
                    }
                    T t = ((qow) x).a;
                    M.j();
                    qowVar = new qow(t);
                } else {
                    M.K(-1070690309);
                    M.j();
                    qowVar = null;
                }
                qow qowVar3 = qowVar;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                fwu0.c(g, null, str, null, null, null, qowVar3, kai.c(99438629, new a0t() { // from class: xsna.ti1
                    @Override // xsna.a0t
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                        d6g d6gVar;
                        lg90 lg90Var = (lg90) obj3;
                        androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj4;
                        int intValue = ((Integer) obj5).intValue();
                        if ((intValue & 384) == 0) {
                            intValue |= (intValue & 512) == 0 ? aVar2.J(lg90Var) : aVar2.y(lg90Var) ? 256 : 128;
                        }
                        if (aVar2.t(intValue & 1, (intValue & 1153) != 1152)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(99438629, intValue, -1, "com.vk.ecomm.design.compose.album.AlbumImage.<anonymous> (AlbumItem.kt:183)");
                            }
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(766238564, 0, -1, "com.vk.ecomm.design.compose.album.getPorterDuffFilter (AlbumItem.kt:234)");
                            }
                            Context context = (Context) aVar2.r(AndroidCompositionLocals_androidKt.b);
                            if (z) {
                                aVar2.K(-737951737);
                                Object x2 = aVar2.x();
                                if (x2 == a.C0011a.a) {
                                    x2 = l52.a(new PorterDuffColorFilter(context.getColor(R.color.vk_black_alpha24), PorterDuff.Mode.SRC_ATOP));
                                    aVar2.R(x2);
                                }
                                d6gVar = (d6g) x2;
                                aVar2.j();
                            } else {
                                aVar2.K(-737727143);
                                aVar2.j();
                                d6gVar = null;
                            }
                            d6g d6gVar2 = d6gVar;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            vjw.a(lg90Var, null, null, null, wkj.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, d6gVar2, aVar2, 24632 | ((intValue >> 6) & 14), 44);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar2.h();
                        }
                        return s3q0.a;
                    }
                }, M), M, ((i2 << 6) & 896) | 100663296, 186);
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
            s.d = new wzs() { // from class: xsna.ui1
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    xi1.a(str, z, pi1Var, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(int i, androidx.compose.runtime.a aVar, String str, String str2, q630 q630Var) {
        androidx.compose.runtime.a M = aVar.M(750334389);
        int i2 = (M.J(str) ? 4 : 2) | i | (M.J(str2) ? 32 : 16) | (M.J(q630Var) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(750334389, i2, -1, "com.vk.ecomm.design.compose.album.AlbumItem (AlbumItem.kt:63)");
            }
            float f = 8;
            a.j g = androidx.compose.foundation.layout.a.g(f);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(g, dt1.a.n, M, 6);
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
            a(str, false, pi1.a.b.a, txj0.f(sua.d(1.7777778f, rte0.d(q630.a.a, vog0.b(f)), true), 1.0f), M, (i2 & 14) | Tensorflow.FRAME_WIDTH);
            e(str2, M, (i2 >> 3) & 14);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new qi1(i, 0, str, str2, q630Var);
        }
    }

    public static final void c(pi1 pi1Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        ColorFilter porterDuffColorFilter;
        androidx.compose.runtime.a M = aVar.M(553042741);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? M.J(pi1Var) : M.y(pi1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(553042741, i2, -1, "com.vk.ecomm.design.compose.album.EmptyUrlAlbumImage (AlbumItem.kt:197)");
            }
            q630 d = txj0.d(q630Var, 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(d, ylu0Var.getImage().b, androidx.compose.ui.graphics.e.a);
            lg90 a = pi1Var.a(i2 & 14, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var2.getImage().a;
            if (Build.VERSION.SDK_INT >= 29) {
                se7.b();
                porterDuffColorFilter = re7.b(f870.H(j), z42.a(5));
            } else {
                porterDuffColorFilter = new PorterDuffColorFilter(f870.H(j), z42.b(5));
            }
            vjw.a(a, null, m, null, wkj.a.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new oe7(j, 5, porterDuffColorFilter), M, 24632, 40);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new vi1(pi1Var, q630Var, i, 0);
        }
    }

    public static final void d(int i, androidx.compose.runtime.a aVar, String str, String str2, q630 q630Var) {
        androidx.compose.runtime.a M = aVar.M(230875804);
        int i2 = (M.J(str) ? 4 : 2) | i | (M.J(str2) ? 32 : 16) | (M.J(q630Var) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(230875804, i2, -1, "com.vk.ecomm.design.compose.album.ServiceAlbumItem (AlbumItem.kt:87)");
            }
            float f = 8;
            a.j g = androidx.compose.foundation.layout.a.g(f);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(g, dt1.a.n, M, 6);
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
            a(str, false, pi1.a.c.a, txj0.f(sua.d(1.7777778f, rte0.d(q630.a.a, vog0.b(f)), true), 1.0f), M, (i2 & 14) | Tensorflow.FRAME_WIDTH);
            e(str2, M, (i2 >> 3) & 14);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ri1(i, 0, str, str2, q630Var);
        }
    }

    public static final void e(String str, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1802641478);
        if ((i & 6) == 0) {
            i2 = i | (M.J(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1802641478, i2, -1, "com.vk.ecomm.design.compose.album.TitleWithCount (AlbumItem.kt:146)");
            }
            q630 f = txj0.f(q630.a.a, 1.0f);
            a.j g = androidx.compose.foundation.layout.a.g(2);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(g, dt1.a.n, M, 6);
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
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.d0;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.c(str, null, ylu0Var.getText().m, null, null, 0, 0, null, 2, false, 0, 1, null, frv0Var, M, (i2 & 14) | 100663296, 48, 5882);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new si1(str, i, 0);
        }
    }

    public static final void f(tl1 tl1Var, String str, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(806770165);
        int i2 = (M.J(tl1Var) ? 4 : 2) | i | (M.J(str) ? 32 : 16) | (M.J(q630Var) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(806770165, i2, -1, "com.vk.ecomm.design.compose.album.ViewedAlbumItem (AlbumItem.kt:47)");
            }
            a.j g = androidx.compose.foundation.layout.a.g(8);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(g, dt1.a.n, M, 6);
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
            g(tl1Var, null, M, i2 & 14);
            e(str, M, (i2 >> 3) & 14);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new w70(tl1Var, str, q630Var, i, 1);
        }
    }

    public static final void g(tl1 tl1Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-657101946);
        if ((i & 6) == 0) {
            i2 = (M.J(tl1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-657101946, i3, -1, "com.vk.ecomm.design.compose.album.ViewedItemsRow (AlbumItem.kt:110)");
            }
            uog0 b = vog0.b(8);
            q630Var2 = q630.a.a;
            q630 f = txj0.f(sua.d(1.7777778f, rte0.d(q630Var2, b), true), 1.0f);
            float f2 = 2;
            a.j g = androidx.compose.foundation.layout.a.g(f2);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(g, dt1.a.l, M, 54);
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
            if (7.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            xpy xpyVar = new xpy(7.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 7.0f, true);
            sl1 sl1Var = tl1Var.a;
            a(sl1Var.a, sl1Var.b, pi1.a.C3513a.a, xpyVar, M, 384);
            if (3.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            xpy xpyVar2 = new xpy(3.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 3.0f, true);
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.g(f2), dt1.a.n, M, 6);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, xpyVar2);
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
            k9q0.w(M, c2, dVar);
            q630 a3 = q9g.a(q630Var2, 1.0f);
            sl1 sl1Var2 = tl1Var.b;
            a(sl1Var2.a, sl1Var2.b, pi1.b.C3514b.a, a3, M, 384);
            q630 a4 = q9g.a(q630Var2, 1.0f);
            sl1 sl1Var3 = tl1Var.c;
            a(sl1Var3.a, sl1Var3.b, pi1.b.a.a, a4, M, 384);
            if (kr.f(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wi1(tl1Var, q630Var2, i, 0);
        }
    }
}
