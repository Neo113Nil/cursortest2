package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ContentBadgeAppearance;
import com.vk.core.compose.component.defaults.ContentBadgeMode;
import com.vk.core.compose.component.defaults.ContentBadgeSize;
import com.vkontakte.android.R;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.us2;

/* compiled from: UploadItemView.kt */
/* loaded from: classes16.dex */
public final class sbq0 {
    public static final void a(final String str, final boolean z, final String str2, final String str3, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        Object obj;
        boolean z2;
        long j;
        float f;
        q630.a aVar2;
        int i2;
        androidx.compose.runtime.a M = aVar.M(1515879195);
        int i3 = i | (M.J(str) ? 4 : 2) | (M.l(z) ? 32 : 16) | (M.J(str2) ? 256 : 128) | (M.J(str3) ? 2048 : 1024) | (M.J(q630Var) ? 16384 : 8192);
        if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1515879195, i3, -1, "com.vk.catalog.mvi.block.video.impl.upload.video.view.UploadCover (UploadItemView.kt:138)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            Object x = M.x();
            Object obj2 = a.C0011a.a;
            if (x == obj2) {
                x = androidx.compose.runtime.k.b(null);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            long floatToRawIntBits = (Float.floatToRawIntBits(142.0f) << 32) | (Float.floatToRawIntBits(80.0f) & 4294967295L);
            boolean y = M.y(context) | ((i3 & 7168) == 2048);
            Object x2 = M.x();
            if (y || x2 == obj2) {
                obj = obj2;
                z2 = false;
                j = floatToRawIntBits;
                rbq0 rbq0Var = new rbq0(j, context, str3, wh50Var, null);
                M.R(rbq0Var);
                x2 = rbq0Var;
            } else {
                z2 = false;
                j = floatToRawIntBits;
                obj = obj2;
            }
            bap.g(str2, (wzs) x2, M, (i3 >> 6) & 14);
            float f2 = 8;
            q630 m = hr80.m(rte0.d(txj0.h(txj0.v(q630Var, Float.intBitsToFloat((int) (j >> 32))), Float.intBitsToFloat((int) (j & 4294967295L))), vog0.b(f2)), wlb0.h(M).getBackground().a, androidx.compose.ui.graphics.e.a);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, z2);
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
            agw agwVar = (agw) wh50Var.getValue();
            q630.a aVar4 = q630.a.a;
            if (agwVar == null) {
                M.K(2100766507);
                M.j();
                aVar2 = aVar4;
                f = f2;
                i2 = 2;
            } else {
                M.K(2100766508);
                final long j2 = wlb0.h(M).j().a;
                q630 d2 = txj0.d(aVar4, 1.0f);
                boolean p = M.p(j2);
                Object x3 = M.x();
                if (p || x3 == obj) {
                    x3 = new izs() { // from class: xsna.pbq0
                        @Override // xsna.izs
                        public final Object invoke(Object obj3) {
                            ggj ggjVar = (ggj) obj3;
                            ggjVar.s1();
                            oio.P(ggjVar, j2, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 9, 62);
                            return s3q0.a;
                        }
                    };
                    M.R(x3);
                }
                q630 E = ahn.E(bu00.f(d2, (izs) x3), "upload_video_item_card_cover_image_test_tag");
                f = f2;
                rc7 rc7Var = new rc7(agwVar);
                aVar2 = aVar4;
                i2 = 2;
                vjw.a(rc7Var, null, E, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, M, 56, 120);
                M = M;
                s3q0 s3q0Var = s3q0.a;
                M.j();
            }
            ra8 ra8Var = ra8.a;
            if (z) {
                M.K(2101376123);
                qzu0.a.getClass();
                pzu0.b(qzu0.R(M), null, ahn.E(ra8Var.b(txj0.q(aVar2, 20), dt1.a.f), "upload_video_item_card_cover_error_test_tag"), wlb0.h(M).getIcon().c, M, 56, 0);
                M.j();
            } else {
                M.K(2101767715);
                mku0.a(i2, 384, 24, wlb0.h(M).getIcon().c, M, ahn.E(ra8Var.b(txj0.q(aVar2, 20), dt1.a.f), "upload_video_item_card_cover_loader_test_tag"));
                M.j();
            }
            androidx.compose.runtime.a aVar5 = M;
            rnu0.c(ContentBadgeSize.Medium, ContentBadgeMode.Primary, ContentBadgeAppearance.Design.Overlay, ahn.E(s200.H(ra8Var.b(aVar2, dt1.a.j), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f, 3), "upload_video_item_card_cover_badge_test_tag"), null, null, str, null, null, null, false, null, false, null, aVar5, ((i3 << 18) & 3670016) | 438, 0, 16304);
            M = aVar5;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(str, z, str2, str3, q630Var, i) { // from class: xsna.qbq0
                public final /* synthetic */ String b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ String d;
                public final /* synthetic */ String e;
                public final /* synthetic */ q630 f;

                @Override // xsna.wzs
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int I = ne7.I(1);
                    sbq0.a(this.b, this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj3, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(int i, androidx.compose.runtime.a aVar, gzs gzsVar, q630 q630Var) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1033336630);
        if ((i & 6) == 0) {
            i2 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1033336630, i2, -1, "com.vk.catalog.mvi.block.video.impl.upload.video.view.UploadMenu (UploadItemView.kt:251)");
            }
            float f = 24;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-836118916, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-MoreVertical16> (VkSdkIcons.kt:2658)");
            }
            lg90 a = pg90.a(R.drawable.vk_icon_more_vertical_16, 0, M);
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
            nzu0.c(gzsVar, a, null, ahn.E(q630Var, "upload_video_item_card_menu_btn_tag"), f, ylu0Var.getIcon().j, false, null, false, null, null, M, (i2 & 14) | 25024, 1984);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new yc2(gzsVar, q630Var, i, 3);
        }
    }

    public static final void c(String str, us2 us2Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-241745658);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.J(us2Var) ? 32 : 16) | (M.J(q630Var) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-241745658, i2, -1, "com.vk.catalog.mvi.block.video.impl.upload.video.view.UploadMeta (UploadItemView.kt:224)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
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
            q630.a aVar4 = q630.a.a;
            yqv0.c(str, ahn.E(s200.H(aVar4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, 7), "upload_video_item_card_title_test_tag"), wlb0.h(M).getText().m, null, null, 0, 0, null, 2, false, 0, 2, null, wlb0.l(M).h0, M, (i2 & 14) | 100663344, 48, 5880);
            aVar2 = M;
            yqv0.d(us2Var, ahn.E(aVar4, "upload_video_item_card_subtitle_test_tag"), 0L, 0, null, 2, false, 2, null, null, wlb0.l(aVar2).s0, aVar2, ((i2 >> 3) & 14) | 100663344, 6, 6908);
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
            s.d = new g8k(i, 4, str, us2Var, q630Var, false);
        }
    }

    public static final void d(bdq0 bdq0Var, gzs gzsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        int m;
        androidx.compose.runtime.a M = aVar.M(-795255288);
        int i2 = i | (M.J(bdq0Var) ? 4 : 2) | (M.y(gzsVar) ? 32 : 16) | 384;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-795255288, i2, -1, "com.vk.catalog.mvi.block.video.impl.upload.video.view.VideoUploadItemView (UploadItemView.kt:74)");
            }
            q630.a aVar2 = q630.a.a;
            float f = 8;
            q630 E = ahn.E(s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 1, txj0.f(aVar2, 1.0f)), "upload_video_item_card_test_tag");
            a.h hVar = androidx.compose.foundation.layout.a.g;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(hVar, dt1.a.l, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E);
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
            float f2 = 6;
            a(z8s.a(bdq0Var.b), bdq0Var.f, bdq0Var.a, bdq0Var.g, s200.G(aVar2, kqu0.b, f2, 12, f2), M, 0);
            String str = bdq0Var.c;
            int i3 = i2 & 14;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1566720247, i3, -1, "com.vk.catalog.mvi.block.video.impl.upload.video.view.getSubtitleText (UploadItemView.kt:111)");
            }
            us2.b b = xga0.b(-1915359963, M);
            if (bdq0Var.f) {
                M.K(1709554358);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                m = b.m(new hik0(ylu0Var.getText().k, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                try {
                    b.g(d370.N(R.string.video_upload_error, 0, M));
                    s3q0 s3q0Var = s3q0.a;
                    b.k(m);
                    M.j();
                } finally {
                    b.k(m);
                }
            } else {
                M.K(1709734933);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                m = b.m(new hik0(ylu0Var2.getText().r, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                try {
                    String str2 = bdq0Var.e;
                    Float f3 = bdq0Var.d;
                    b.g(d370.O(R.string.video_upload_progress, new Object[]{str2, Integer.valueOf(f3 != null ? (int) (f3.floatValue() * 100) : 0)}, M));
                    s3q0 s3q0Var2 = s3q0.a;
                    b.k(m);
                    M.j();
                } catch (Throwable th) {
                    throw th;
                }
            }
            us2 n = b.n();
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            c(str, n, new xpy(1.0f, true), M, 0);
            b(((i2 >> 3) & 14) | 48, M, gzsVar, s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11));
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
            s.d = new w2k(i, 9, bdq0Var, gzsVar, q630Var2);
        }
    }
}
