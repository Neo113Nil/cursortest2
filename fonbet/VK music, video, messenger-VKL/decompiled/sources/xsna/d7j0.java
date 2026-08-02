package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: ShareBottomSheetContent.kt */
/* loaded from: classes7.dex */
public final class d7j0 {
    public static final void a(final r9j0 r9j0Var, final int i, final izs<? super t6j0, s3q0> izsVar, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        androidx.compose.runtime.a M = aVar.M(-701720965);
        if ((i2 & 6) == 0) {
            i3 = (M.J(r9j0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.o(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.y(izsVar) ? 256 : 128;
        }
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-701720965, i3, -1, "com.vk.video.ui.share.impl.presentation.views.AppItem (ShareBottomSheetContent.kt:118)");
            }
            boolean z = ((i3 & 896) == 256) | ((i3 & 112) == 32);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new as4(izsVar, i, 2);
                M.R(x);
            }
            q9j0.b(r9j0Var.a, pg90.a(r9j0Var.b, 0, M), ojc.c(q630.a.a, false, null, null, (gzs) x, 15), M, 64);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.a7j0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i2 | 1);
                    d7j0.a(r9j0.this, i, izsVar, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final int i, androidx.compose.runtime.a aVar, final izs izsVar, final boolean z) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1139531767);
        if ((i & 6) == 0) {
            i2 = (M.l(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1139531767, i2, -1, "com.vk.video.ui.share.impl.presentation.views.CopyActionItem (ShareBottomSheetContent.kt:136)");
            }
            boolean z2 = (i2 & 112) == 32;
            Object x = M.x();
            if (z2 || x == a.C0011a.a) {
                x = new tw(izsVar, 7);
                M.R(x);
            }
            q630 c = ojc.c(q630.a.a, false, null, null, (gzs) x, 15);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-780062500, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ChainOutline24> (VkSdkIcons.kt:308)");
            }
            lg90 b = or.b(M, 1226276742, R.drawable.vk_icon_chain_outline_24, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q9j0.a(R.string.video_share_dialog_copy, b, z, c, M, 64 | ((i2 << 6) & 896));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.y6j0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    d7j0.b(ne7.I(i | 1), (androidx.compose.runtime.a) obj, izsVar, z);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(final int i, androidx.compose.runtime.a aVar, final izs izsVar, final boolean z) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(58749545);
        if ((i & 6) == 0) {
            i2 = (M.l(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(58749545, i2, -1, "com.vk.video.ui.share.impl.presentation.views.ShareActionItem (ShareBottomSheetContent.kt:149)");
            }
            boolean z2 = (i2 & 112) == 32;
            Object x = M.x();
            if (z2 || x == a.C0011a.a) {
                x = new f74(izsVar, 5);
                M.R(x);
            }
            q630 c = ojc.c(q630.a.a, false, null, null, (gzs) x, 15);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(576726460, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ShareExternalOutline24> (VkSdkIcons.kt:3336)");
            }
            lg90 a = pg90.a(R.drawable.vk_icon_share_external_outline_24, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q9j0.a(R.string.video_share_dialog_more, a, z, c, M, 64 | ((i2 << 6) & 896));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.b7j0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    d7j0.c(ne7.I(i | 1), (androidx.compose.runtime.a) obj, izsVar, z);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void d(final u9j0 u9j0Var, final boolean z, final izs<? super t6j0, s3q0> izsVar, androidx.compose.runtime.a aVar, final int i) {
        q630.a aVar2;
        a.C0011a.C0012a c0012a;
        q630.a aVar3;
        int i2;
        i9j0 i9j0Var = u9j0Var.b;
        int i3 = i9j0Var.a;
        List<r9j0> list = u9j0Var.a;
        androidx.compose.runtime.a M = aVar.M(81778749);
        int i4 = (i & 6) == 0 ? (M.J(u9j0Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i4 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= M.y(izsVar) ? 256 : 128;
        }
        if (M.t(i4 & 1, (i4 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(81778749, i4, -1, "com.vk.video.ui.share.impl.presentation.views.ShareBottomSheetContent (ShareBottomSheetContent.kt:44)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            final azl azlVar = (azl) M.r(uvi.h);
            final int i5 = context.getResources().getDisplayMetrics().widthPixels;
            int size = list.size() + 2;
            final float f = size * 80;
            boolean o = M.o(size);
            Object x = M.x();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (o || x == c0012a2) {
                x = bbk0.b(new gzs() { // from class: xsna.w6j0
                    @Override // xsna.gzs
                    public final Object invoke() {
                        return Boolean.valueOf(azl.this.I0(f) > ((float) i5));
                    }
                });
                M.R(x);
            }
            mtk0 mtk0Var = (mtk0) x;
            q630.a aVar4 = q630.a.a;
            q630 E = ahn.E(aVar4, "video_share_bottom_sheet_root");
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E);
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
            if (((Boolean) mtk0Var.getValue()).booleanValue()) {
                M.K(515484247);
                q630 f2 = txj0.f(aVar4, 1.0f);
                u890 m = s200.m(8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                boolean z2 = ((i4 & 14) == 4) | ((i4 & 896) == 256) | ((i4 & 112) == 32);
                Object x2 = M.x();
                if (z2 || x2 == c0012a2) {
                    x2 = new shh(u9j0Var, izsVar, z, 3);
                    M.R(x2);
                }
                c0012a = c0012a2;
                lqy.b(f2, null, m, null, null, null, false, null, (izs) x2, M, 390, IronSourceError.ERROR_CODE_INVALID_KEY_VALUE);
                M = M;
                M.j();
                i4 = i4;
                aVar2 = aVar4;
            } else {
                aVar2 = aVar4;
                c0012a = c0012a2;
                M.K(516061002);
                q630 C = txj0.C(aVar2, null, 3);
                androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.e, dt1.a.k, M, 6);
                int hashCode2 = Long.hashCode(n34.n(M));
                sy90 D2 = M.D();
                q630 c2 = qri.c(M, C);
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
                k9q0.w(M, a2, cVar);
                k9q0.w(M, D2, eVar);
                ur.d(hashCode2, M, bVar, M, c2678a);
                k9q0.w(M, c2, dVar);
                M.K(1333987459);
                int i6 = 0;
                for (Object obj : list) {
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        e43.t();
                        throw null;
                    }
                    a((r9j0) obj, i6, izsVar, M, i4 & 896);
                    i6 = i7;
                }
                M.j();
                int i8 = (i4 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
                b(i8, M, izsVar, z);
                c(i8, M, izsVar, z);
                M.G();
                M.j();
            }
            if (i3 > 0) {
                M.K(516539487);
                q630 E2 = s200.E(aVar2, 16, 6);
                if (androidx.compose.runtime.b.d()) {
                    i2 = 0;
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                } else {
                    i2 = 0;
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                int i9 = i2;
                aVar3 = aVar2;
                jqu0.a(E2, ylu0Var.p().a, 1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 390, 8);
                boolean z3 = i9j0Var.b;
                int i10 = (i4 & 896) == 256 ? 1 : i9;
                Object x3 = M.x();
                if (i10 != 0 || x3 == c0012a) {
                    x3 = new egt(izsVar, 2);
                    M.R(x3);
                }
                h9j0.a(i3, z3, (izs) x3, M, i9);
            } else {
                aVar3 = aVar2;
                M.K(512866235);
            }
            M.j();
            if (xga0.c(aVar3, 8, M, 6)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.z6j0
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    int I = ne7.I(i | 1);
                    d7j0.d(u9j0.this, z, izsVar, (androidx.compose.runtime.a) obj2, I);
                    return s3q0.a;
                }
            };
        }
    }
}
