package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.donut.price.model.template.DonutPriceTemplate;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashSet;
import java.util.Set;
import one.video.exo.offline.DownloadInfo;
import one.video.exo.offline.OfflineRequirement;
import xsna.cco;
import xsna.cri;
import xsna.dt1;
import xsna.phw;
import xsna.q630;

/* compiled from: DownloadedVideoInfoText.kt */
/* loaded from: classes16.dex */
public final class ybo {

    /* compiled from: DownloadedVideoInfoText.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DownloadInfo.State.values().length];
            try {
                iArr[DownloadInfo.State.STATE_QUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DownloadInfo.State.STATE_DOWNLOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DownloadInfo.State.STATE_RESTARTING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DownloadInfo.State.STATE_COMPLETED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DownloadInfo.State.STATE_FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DownloadInfo.State.STATE_STOPPED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(cco.b bVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        us2 a2;
        androidx.compose.runtime.a M = aVar.M(2088871147);
        int i2 = (M.J(bVar) ? 4 : 2) | i | 48;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2088871147, i2, -1, "com.vk.catalog.mvi.block.video.impl.downloaded.video.view.DonutVideoChip (DownloadedVideoInfoText.kt:351)");
            }
            DonutVideoUiModel.DescriptionChip descriptionChip = bVar.a;
            DonutPriceTemplate donutPriceTemplate = descriptionChip.c;
            gzs gzsVar = null;
            if (donutPriceTemplate == null) {
                M.K(-220625683);
                M.j();
                a2 = null;
            } else {
                M.K(1655451028);
                a2 = z1o.a(donutPriceTemplate, m4s.B(M), M, 0);
                M.j();
            }
            if (a2 == null) {
                M.K(1655454852);
                a2 = ws2.a(descriptionChip.b, M, 0);
                M.j();
            } else {
                M.K(1655450357);
                M.j();
            }
            Object obj = descriptionChip.e;
            Object obj2 = a.C0011a.a;
            if (obj == null) {
                M.K(-220409334);
            } else {
                M.K(-220409333);
                boolean y = M.y(obj) | ((i2 & 14) == 4);
                Object x = M.x();
                if (y || x == obj2) {
                    x = new oe5(8, bVar, obj);
                    M.R(x);
                }
                gzsVar = (gzs) x;
            }
            M.j();
            boolean y2 = M.y(descriptionChip);
            Object x2 = M.x();
            if (y2 || x2 == obj2) {
                x2 = new nvg(descriptionChip, 15);
                M.R(x2);
            }
            q630Var2 = q630.a.a;
            yyn.a(a2, egi0.b(q630Var2, false, (izs) x2), gzsVar, null, 0L, 0L, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 248);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new h08(bVar, q630Var2, i, 3);
        }
    }

    public static final void b(cco ccoVar, gzs gzsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1730376899);
        if ((i & 6) == 0) {
            i2 = (M.J(ccoVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1730376899, i3, -1, "com.vk.catalog.mvi.block.video.impl.downloaded.video.view.DownloadedVideoInfoText (DownloadedVideoInfoText.kt:46)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            HashSet hashSet = iah0.a;
            boolean d = fnj.d(context);
            q630.a aVar2 = q630.a.a;
            if (d) {
                M.K(1460944949);
                k(ccoVar, gzsVar, aVar2, M, i3 & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
                M.j();
            } else {
                M.K(1461024991);
                d(ccoVar, gzsVar, txj0.f(aVar2, 1.0f), M, i3 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                M.j();
            }
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
            s.d = new qbo(i, 0, ccoVar, gzsVar, q630Var2);
        }
    }

    public static final void c(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-2076638604);
        if ((i & 6) == 0) {
            i2 = i | (M.J(q630Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2076638604, i2, -1, "com.vk.catalog.mvi.block.video.impl.downloaded.video.view.FailedDownloadView (DownloadedVideoInfoText.kt:133)");
            }
            String N = d370.N(R.string.video_download_state_error, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().k;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.c(N, q630Var, j, null, null, 0, 0, null, 0, false, 0, 1, null, wuv0Var.i0, M, (i2 << 3) & 112, 48, 6136);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new rbo(q630Var, i, 0);
        }
    }

    public static final void d(cco ccoVar, gzs gzsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-644795943);
        if ((i & 6) == 0) {
            i2 = (M.J(ccoVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-644795943, i2, -1, "com.vk.catalog.mvi.block.video.impl.downloaded.video.view.MobileInfoText (DownloadedVideoInfoText.kt:59)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            l(ccoVar, M, (i2 & 14) | 48);
            f9t.e(txj0.h(q630.a.a, 3), M, 6);
            m(ccoVar, gzsVar, null, M, i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, 4);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new zx9(i, 3, ccoVar, gzsVar, q630Var);
        }
    }

    public static final void e(cco ccoVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        int i3;
        androidx.compose.runtime.a M = aVar.M(1444764167);
        if ((i & 6) == 0) {
            i2 = i | (M.J(ccoVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1444764167, i2, -1, "com.vk.catalog.mvi.block.video.impl.downloaded.video.view.OwnerAndViewsBlock (DownloadedVideoInfoText.kt:238)");
            }
            mno0 mno0Var = ccoVar.h;
            cco.b bVar = ccoVar.j;
            String a2 = mno0Var.a(0, M);
            int length = a2.length() + ccoVar.d.length();
            q630.a aVar2 = q630.a.a;
            int i4 = i2;
            if (length > 30) {
                M.K(1102312044);
                a.m mVar = androidx.compose.foundation.layout.a.c;
                dt1.a.getClass();
                androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
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
                k9q0.w(M, a3, cVar);
                cri.a.e eVar = cri.a.e;
                k9q0.w(M, D, eVar);
                Integer valueOf = Integer.valueOf(hashCode);
                cri.a.b bVar2 = cri.a.g;
                k9q0.w(M, valueOf, bVar2);
                cri.a.C2678a c2678a = cri.a.h;
                k9q0.t(M, c2678a);
                cri.a.d dVar = cri.a.d;
                k9q0.w(M, c, dVar);
                f(ccoVar, null, M, i4 & 14);
                androidx.compose.foundation.layout.k a4 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
                int hashCode2 = Long.hashCode(n34.n(M));
                sy90 D2 = M.D();
                q630 c2 = qri.c(M, aVar2);
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
                k9q0.w(M, a4, cVar);
                k9q0.w(M, D2, eVar);
                ur.d(hashCode2, M, bVar2, M, c2678a);
                k9q0.w(M, c2, dVar);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j = ylu0Var.getText().p;
                if (androidx.compose.runtime.b.d()) {
                    i3 = 0;
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                } else {
                    i3 = 0;
                }
                wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                int i5 = i3;
                yqv0.c(a2, null, j, null, null, 0, 0, null, 2, false, 0, 1, null, wuv0Var.s0, M, 100663296, 48, 5882);
                M = M;
                if (bVar == null) {
                    M.K(-791228084);
                } else {
                    M.K(-791228083);
                    n(i5, M);
                    a(bVar, null, M, i5);
                    s3q0 s3q0Var = s3q0.a;
                }
                M.j();
                M.G();
                M.G();
                M.j();
            } else {
                M.K(1102935640);
                a.m mVar2 = androidx.compose.foundation.layout.a.c;
                dt1.a.getClass();
                androidx.compose.foundation.layout.c a5 = androidx.compose.foundation.layout.b.a(mVar2, dt1.a.n, M, 0);
                int hashCode3 = Long.hashCode(n34.n(M));
                sy90 D3 = M.D();
                q630 c3 = qri.c(M, q630Var);
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
                cri.a.c cVar2 = cri.a.f;
                k9q0.w(M, a5, cVar2);
                cri.a.e eVar2 = cri.a.e;
                k9q0.w(M, D3, eVar2);
                Integer valueOf2 = Integer.valueOf(hashCode3);
                cri.a.b bVar3 = cri.a.g;
                k9q0.w(M, valueOf2, bVar3);
                cri.a.C2678a c2678a2 = cri.a.h;
                k9q0.t(M, c2678a2);
                cri.a.d dVar2 = cri.a.d;
                k9q0.w(M, c3, dVar2);
                androidx.compose.foundation.layout.k a6 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
                int hashCode4 = Long.hashCode(n34.n(M));
                sy90 D4 = M.D();
                q630 c4 = qri.c(M, aVar2);
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
                k9q0.w(M, a6, cVar2);
                k9q0.w(M, D4, eVar2);
                ur.d(hashCode4, M, bVar3, M, c2678a2);
                k9q0.w(M, c4, dVar2);
                f(ccoVar, null, M, i4 & 14);
                n(0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j2 = ylu0Var2.getText().p;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var2 = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                yqv0.c(a2, null, j2, null, null, 0, 0, null, 2, false, 0, 1, null, wuv0Var2.s0, M, 100663296, 48, 5882);
                M = M;
                M.G();
                if (bVar == null) {
                    M.K(867188440);
                } else {
                    M.K(867188441);
                    a(bVar, null, M, 0);
                    s3q0 s3q0Var2 = s3q0.a;
                }
                M.j();
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
            s.d = new ra5(ccoVar, q630Var, i, 3);
        }
    }

    public static final void f(cco ccoVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-39590246);
        if ((i & 6) == 0) {
            i2 = i | (M.J(ccoVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-39590246, i3, -1, "com.vk.catalog.mvi.block.video.impl.downloaded.video.view.OwnerNameWithVerified (DownloadedVideoInfoText.kt:297)");
            }
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g, dt1.a.l, M, 54);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            yqv0.c(ccoVar.d, null, wlb0.h(M).getText().p, null, null, 0, 0, null, 2, false, 0, 1, null, wlb0.l(M).s0, M, 100663296, 48, 5882);
            M = M;
            if (ccoVar.n) {
                M.K(965544592);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1159845476, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Verified16> (VkSdkIcons.kt:3652)");
                }
                lg90 a3 = pg90.a(R.drawable.vk_icon_verified_16, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630Var2 = aVar2;
                pzu0.b(a3, null, s200.H(aVar2, 4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), wlb0.h(M).q().b, M, 440, 0);
            } else {
                q630Var2 = aVar2;
                M.K(954713068);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new tbo(ccoVar, q630Var2, i, 0);
        }
    }

    public static final void g(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(178747493);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(178747493, i2, -1, "com.vk.catalog.mvi.block.video.impl.downloaded.video.view.PausedDownloadView (DownloadedVideoInfoText.kt:198)");
            }
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            qzu0.a.getClass();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1404568252, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-Pause16> (VkIcons.kt:8310)");
            }
            lg90 b = or.b(M, 1921562033, R.drawable.vk_icon_pause_16, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            pzu0.b(b, null, null, wlb0.h(M).getIcon().a, M, 56, 4);
            aVar2 = M;
            yqv0.c(d370.N(R.string.video_download_state_paused, 0, M), s200.H(q630.a.a, 4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), wlb0.h(M).getText().a, null, null, 0, 0, null, 0, false, 0, 1, null, wlb0.l(M).i0, aVar2, 48, 48, 6136);
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
            s.d = new wbo(q630Var, i);
        }
    }

    public static final void h(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-395359004);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-395359004, i2, -1, "com.vk.catalog.mvi.block.video.impl.downloaded.video.view.ProgressDownloadView (DownloadedVideoInfoText.kt:217)");
            }
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            qzu0.a.getClass();
            pzu0.b(qzu0.K(M), null, null, wlb0.h(M).getIcon().a, M, 56, 4);
            aVar2 = M;
            yqv0.c(d370.N(R.string.video_download_state_in_progress, 0, M), s200.H(q630.a.a, 4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), wlb0.h(M).getText().a, null, null, 0, 0, null, 0, false, 0, 1, null, wlb0.l(M).i0, aVar2, 48, 48, 6136);
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
            s.d = new vn1(q630Var, i, 2);
        }
    }

    public static final void i(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-931615318);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-931615318, i2, -1, "com.vk.catalog.mvi.block.video.impl.downloaded.video.view.QueuedDownloadView (DownloadedVideoInfoText.kt:180)");
            }
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            qzu0.a.getClass();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1312718238, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-DownloadDashedOutline16> (VkIcons.kt:2232)");
            }
            lg90 b = or.b(M, -1511615431, R.drawable.vk_icon_download_dashed_outline_16, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            pzu0.b(b, null, null, wlb0.h(M).getIcon().a, M, 56, 4);
            aVar2 = M;
            yqv0.c(d370.N(R.string.video_download_state_queued, 0, M), s200.H(q630.a.a, 4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), wlb0.h(M).getText().a, null, null, 0, 0, null, 0, false, 0, 1, null, wlb0.l(M).i0, aVar2, 48, 48, 6136);
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
            s.d = new ioa(q630Var, i, 1);
        }
    }

    public static final void j(cco ccoVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(565228410);
        if ((i & 6) == 0) {
            i2 = (M.J(ccoVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(565228410, i2, -1, "com.vk.catalog.mvi.block.video.impl.downloaded.video.view.SimpleOwnerName (DownloadedVideoInfoText.kt:283)");
            }
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            cco.b bVar = ccoVar.j;
            if (bVar == null) {
                M.K(-1238185870);
            } else {
                M.K(-1238185869);
                a(bVar, null, M, 0);
                n(0, M);
            }
            M.j();
            f(ccoVar, null, M, i2 & 14);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new z7d(ccoVar, q630Var, i, 2);
        }
    }

    public static final void k(cco ccoVar, gzs gzsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-21002832);
        if ((i & 6) == 0) {
            i2 = (M.J(ccoVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-21002832, i2, -1, "com.vk.catalog.mvi.block.video.impl.downloaded.video.view.TabletInfoTextView (DownloadedVideoInfoText.kt:72)");
            }
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.k, M, 48);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a2, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            int i3 = i2;
            ldu0.b(phw.a.a(fwu0.l(null, ccoVar.e, null, null, M, 0, 61), null, null, null, null, M, 196616, 30), 40, null, null, null, false, null, null, null, M, 48, IronSourceError.ERROR_CODE_INIT_FAILED);
            M = M;
            q630.a aVar3 = q630.a.a;
            f9t.e(txj0.v(aVar3, 12), M, 6);
            q630 f = txj0.f(aVar3, 1.0f);
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, f);
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
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            int i4 = i3 & 14;
            l(ccoVar, M, i4 | 48);
            f9t.e(txj0.h(aVar3, 3), M, 6);
            m(ccoVar, gzsVar, txj0.f(aVar3, 1.0f), M, i4 | 384 | (i3 & 112), 0);
            if (kr.f(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new zb1(i, 1, ccoVar, gzsVar, q630Var);
        }
    }

    public static final void l(cco ccoVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-806516145);
        if ((i & 6) == 0) {
            i2 = (M.J(ccoVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.o(2) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-806516145, i2, -1, "com.vk.catalog.mvi.block.video.impl.downloaded.video.view.TitleText (DownloadedVideoInfoText.kt:322)");
            }
            String f = kpt0.f((Context) M.r(AndroidCompositionLocals_androidKt.b), ccoVar.c, ccoVar.m);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().m;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            yqv0.c(f, null, j, null, null, 0, 0, null, 2, false, 0, 2, null, wuv0Var.h0, aVar2, 100663296, i2 & 112, 5882);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new ubo(ccoVar, i, 0);
        }
    }

    public static final void m(final cco ccoVar, final gzs<? extends Set<? extends OfflineRequirement>> gzsVar, q630 q630Var, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        Set<? extends OfflineRequirement> a2;
        androidx.compose.runtime.a M = aVar.M(2146349795);
        if ((i & 6) == 0) {
            i3 = (M.J(ccoVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.y(gzsVar) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                q630Var = q630.a.a;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2146349795, i3, -1, "com.vk.catalog.mvi.block.video.impl.downloaded.video.view.VideoDownloadStateView (DownloadedVideoInfoText.kt:97)");
            }
            switch (a.$EnumSwitchMapping$0[ccoVar.o.ordinal()]) {
                case 1:
                    M.K(-1566078707);
                    VideoFeatures videoFeatures = VideoFeatures.VIDEO_NEW_OFFLINE_MANAGER;
                    videoFeatures.getClass();
                    if (com.vk.toggle.b.A.a(videoFeatures)) {
                        a2 = gzsVar.invoke();
                    } else {
                        synchronized (bu70.a) {
                            one.video.exo.offline.c e = bu70.e();
                            OfflineRequirement.a aVar2 = OfflineRequirement.Companion;
                            int i5 = e.c.m;
                            aVar2.getClass();
                            a2 = OfflineRequirement.a.a(i5);
                        }
                    }
                    if (a2.contains(OfflineRequirement.NETWORK_UNMETERED)) {
                        M.K(-1565779650);
                        p(q630Var, M, (i3 >> 6) & 14);
                        M.j();
                    } else if (a2.contains(OfflineRequirement.NETWORK)) {
                        M.K(-1565648613);
                        o(q630Var, M, (i3 >> 6) & 14);
                        M.j();
                    } else {
                        M.K(-1565575453);
                        i(q630Var, M, (i3 >> 6) & 14);
                        M.j();
                    }
                    M.j();
                    break;
                case 2:
                case 3:
                    M.K(1057881239);
                    h(q630Var, M, (i3 >> 6) & 14);
                    M.j();
                    break;
                case 4:
                    M.K(-1565315983);
                    Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
                    HashSet hashSet = iah0.a;
                    if (fnj.d(context)) {
                        M.K(-1565261764);
                        e(ccoVar, q630Var, M, (i3 & 14) | ((i3 >> 3) & 112));
                        M.j();
                    } else {
                        M.K(-1565189441);
                        j(ccoVar, q630Var, M, (i3 & 14) | ((i3 >> 3) & 112));
                        M.j();
                    }
                    M.j();
                    break;
                case 5:
                    M.K(1057892447);
                    c(q630Var, M, (i3 >> 6) & 14);
                    M.j();
                    break;
                case 6:
                    M.K(1057894783);
                    g(q630Var, M, (i3 >> 6) & 14);
                    M.j();
                    break;
                default:
                    M.K(1057896199);
                    M.j();
                    break;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        final q630 q630Var2 = q630Var;
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.vbo
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ybo.m(cco.this, gzsVar, q630Var2, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void n(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-182701891);
        if (M.t(i & 1, i != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-182701891, i, -1, "com.vk.catalog.mvi.block.video.impl.downloaded.video.view.VideoInfoSeparator (DownloadedVideoInfoText.kt:337)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().p;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            yqv0.c(" · ", null, j, null, null, 0, 0, null, 2, false, 0, 1, null, wuv0Var.s0, aVar2, 100663302, 48, 5882);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new rc9(i);
        }
    }

    public static final void o(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(82796376);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(82796376, i2, -1, "com.vk.catalog.mvi.block.video.impl.downloaded.video.view.WaitingNetworkDownloadView (DownloadedVideoInfoText.kt:162)");
            }
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            qzu0.a.getClass();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2113638014, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-WifiSlashOutline16> (VkIcons.kt:11880)");
            }
            lg90 a3 = pg90.a(R.drawable.vk_icon_wifi_slash_outline_16, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            pzu0.b(a3, null, null, wlb0.h(M).getIcon().a, M, 56, 4);
            aVar2 = M;
            yqv0.c(d370.N(R.string.video_download_state_network_awaiting, 0, M), s200.H(q630.a.a, 4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), wlb0.h(M).getText().a, null, null, 0, 0, null, 0, false, 0, 1, null, wlb0.l(M).i0, aVar2, 48, 48, 6136);
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
            s.d = new xbo(q630Var, i);
        }
    }

    public static final void p(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-2146732387);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2146732387, i2, -1, "com.vk.catalog.mvi.block.video.impl.downloaded.video.view.WaitingWifiDownloadView (DownloadedVideoInfoText.kt:144)");
            }
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            qzu0.a.getClass();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1616544106, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-WifiOutline16> (VkIcons.kt:11870)");
            }
            lg90 b = or.b(M, -1002656708, R.drawable.vk_icon_wifi_outline_16, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            pzu0.b(b, null, null, wlb0.h(M).getIcon().a, M, 56, 4);
            aVar2 = M;
            yqv0.c(d370.N(R.string.video_download_state_wifi_awaiting, 0, M), s200.H(q630.a.a, 4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), wlb0.h(M).getText().a, null, null, 0, 0, null, 0, false, 0, 1, null, wlb0.l(M).i0, aVar2, 48, 48, 6136);
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
            s.d = new sbo(q630Var, i);
        }
    }
}
