package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog.mvi.block.video.impl.p002short.ShortVideoListView;
import com.vk.core.view.VideoRestrictionView;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.yk8;

/* compiled from: ShortVideoCardView.kt */
/* loaded from: classes16.dex */
public final class tfj0 {
    public static final void a(ShortVideoListView.e eVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-362912952);
        if ((i & 6) == 0) {
            i2 = (M.J(eVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-362912952, i2, -1, "com.vk.catalog.mvi.block.video.impl.short.ui.ClipCover (ShortVideoCardView.kt:91)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            if (eVar.g) {
                M.K(-1106878441);
                int i3 = VideoRestrictionView.d;
                r0v0.a(new yjo(VideoRestrictionView.a.a(0, context)), q630Var, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, null, M, 8 | (i2 & 112), 252);
                q630Var2 = q630Var;
                M.j();
            } else {
                q630Var2 = q630Var;
                M.K(-1106674306);
                fwu0.c(q630Var2, null, eVar.d, null, null, null, null, yki.a, M, ((i2 >> 3) & 14) | 100663296, 250);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            q630Var2 = q630Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new w78(eVar, q630Var2, i, 5);
        }
    }

    public static final void b(ShortVideoListView.e eVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630.a aVar2;
        float f;
        ra8 ra8Var;
        int i3;
        int i4;
        int i5;
        int i6;
        androidx.compose.runtime.a M = aVar.M(-48620085);
        if ((i & 6) == 0) {
            i2 = (M.J(eVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        int i7 = i2;
        if (M.t(i7 & 1, (i7 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-48620085, i7, -1, "com.vk.catalog.mvi.block.video.impl.short.ui.ClipTopBar (ShortVideoCardView.kt:145)");
            }
            dt1.a.getClass();
            ty6 ty6Var = dt1.a.b;
            cp10 d = ja8.d(ty6Var, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            k9q0.w(M, d, cVar);
            cri.a.e eVar2 = cri.a.e;
            k9q0.w(M, D, eVar2);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            ra8 ra8Var2 = ra8.a;
            q630.a aVar4 = q630.a.a;
            float f2 = 8;
            q630 D2 = s200.D(ra8Var2.b(aVar4, ty6Var), f2);
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.k, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c2 = qri.c(M, D2);
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
            k9q0.w(M, a, cVar);
            k9q0.w(M, D3, eVar2);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            if (eVar.h) {
                M.K(-957271950);
                qzu0.a.getClass();
                lg90 a1 = qzu0.a1(M);
                if (androidx.compose.runtime.b.d()) {
                    i6 = -1;
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                } else {
                    i6 = -1;
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j = ylu0Var.getIcon().c;
                q630 H = s200.H(aVar4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11);
                f = f2;
                aVar2 = aVar4;
                i3 = i6;
                ra8Var = ra8Var2;
                pzu0.b(a1, null, ahn.E(H, "mvi_catalog_short_video_pin_icon_test_tag"), j, M, 440, 0);
            } else {
                aVar2 = aVar4;
                f = f2;
                ra8Var = ra8Var2;
                i3 = -1;
                M.K(-962137183);
            }
            M.j();
            if (eVar.e) {
                M.K(-956874809);
                if (androidx.compose.runtime.b.d()) {
                    i5 = 0;
                    androidx.compose.runtime.b.f(903493116, 0, i3, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Lock12> (VkSdkIcons.kt:2144)");
                } else {
                    i5 = 0;
                }
                lg90 a2 = pg90.a(R.drawable.vk_icon_lock_12, i5, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, i5, i3, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                pzu0.b(a2, null, new gor0(dt1.a.l), ylu0Var2.getText().d, M, 56, 0);
            } else {
                M.K(-962137183);
            }
            M.j();
            M.G();
            if (eVar.f) {
                M.K(215873192);
                if (androidx.compose.runtime.b.d()) {
                    i4 = 0;
                    androidx.compose.runtime.b.f(864001564, 0, i3, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-MoreVertical24> (VkSdkIcons.kt:2666)");
                } else {
                    i4 = 0;
                }
                lg90 a3 = pg90.a(R.drawable.vk_icon_more_vertical_24, i4, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, i4, i3, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var3 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j2 = ylu0Var3.getText().d;
                q630 D4 = s200.D(ra8Var.b(aVar2, dt1.a.d), f);
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (x == c0012a) {
                    x = ir.h(M);
                }
                sg50 sg50Var = (sg50) x;
                mlg0 a4 = qer0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 0L, true);
                int i8 = (i7 & 14) != 4 ? i4 : 1;
                Object x2 = M.x();
                if (i8 != 0 || x2 == c0012a) {
                    x2 = new w2j0(eVar, 1);
                    M.R(x2);
                }
                pzu0.b(a3, null, ojc.b(D4, sg50Var, a4, false, null, (gzs) x2, 28), j2, M, 56, 0);
            } else {
                M.K(210247901);
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
            s.d = new aak(eVar, q630Var, i, 4);
        }
    }

    public static final void c(ShortVideoListView.e eVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1792065102);
        if ((i & 6) == 0) {
            i2 = (M.J(eVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1792065102, i2, -1, "com.vk.catalog.mvi.block.video.impl.short.ui.ClipViewsCount (ShortVideoCardView.kt:119)");
            }
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            qzu0.a.getClass();
            pzu0.b(qzu0.E1(M), null, s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), wlb0.h(M).getIcon().c, M, 440, 0);
            aVar2 = M;
            yqv0.c(xpm0.a(eVar.c), null, wlb0.h(aVar2).getText().d, null, null, 0, 3, null, 0, false, 0, 2, null, wlb0.l(aVar2).s0, aVar2, 0, 48, 6074);
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
            s.d = new u9z(eVar, q630Var, i, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(ShortVideoListView.e eVar, q630 q630Var, androidx.compose.runtime.a aVar, int i, int i2) {
        int i3;
        q630 q630Var2;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar.M(-501233743);
        if ((i & 6) == 0) {
            i3 = i | (M.J(eVar) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 32 : 16;
            if (M.t(i3 & 1, (i3 & 19) == 18)) {
                M.h();
            } else {
                q630.a aVar2 = q630.a.a;
                if (i4 != 0) {
                    q630Var2 = aVar2;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-501233743, i3, -1, "com.vk.catalog.mvi.block.video.impl.short.ui.ShortVideoCardView (ShortVideoCardView.kt:43)");
                }
                q630 m = hr80.m(q630Var2, wlb0.h(M).getImage().b, androidx.compose.ui.graphics.e.a);
                dt1.a.getClass();
                cp10 d = ja8.d(dt1.a.b, false);
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
                k9q0.w(M, d, cri.a.f);
                k9q0.w(M, D, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c, cri.a.d);
                int i5 = i3 & 14;
                a(eVar, txj0.d(aVar2, 1.0f), M, i5 | 48);
                q630 d2 = sua.d(0.857f, txj0.f(aVar2, 1.0f), false);
                ty6 ty6Var = dt1.a.i;
                ra8 ra8Var = ra8.a;
                ja8.a(hr80.l(ra8Var.b(d2, ty6Var), yk8.a.g(e43.l(new l5g(l5g.c(14, wlb0.h(M).getBackground().a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)), new l5g(l5g.c(14, wlb0.h(M).getBackground().a, 0.25f))), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), null, 6), M, 0);
                float f = 8;
                c(eVar, s200.H(ra8Var.b(aVar2, ty6Var), f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 10, 2), M, i5);
                b(eVar, ra8Var.b(txj0.f(aVar2, 1.0f), dt1.a.c), M, i5);
                M.G();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            }
            s = M.s();
            if (s == null) {
                s.d = new qg4(eVar, q630Var2, i, i2, 1);
                return;
            }
            return;
        }
        q630Var2 = q630Var;
        if (M.t(i3 & 1, (i3 & 19) == 18)) {
        }
        s = M.s();
        if (s == null) {
        }
    }
}
