package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;

/* compiled from: OrganizationItem.kt */
/* loaded from: classes2.dex */
public final class ry80 {
    public static final void a(final long j, final String str, final int i, q630 q630Var, final boolean z, final String str2, final boolean z2, int i2, int i3, final izs izsVar, androidx.compose.runtime.a aVar, final int i4) {
        androidx.compose.runtime.a aVar2;
        final q630 q630Var2;
        final int i5;
        final int i6;
        int i7;
        long c;
        long j2;
        long c2;
        int i8;
        int i9;
        int i10;
        int i11;
        androidx.compose.runtime.a M = aVar.M(-1070018052);
        int i12 = i4 | (M.p(j) ? 4 : 2) | (M.J(str) ? 32 : 16) | (M.o(i) ? 256 : 128) | 3072 | (M.l(z) ? 16384 : 8192) | (M.J(str2) ? 131072 : 65536) | (M.l(z2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | 113246208 | (M.y(izsVar) ? 536870912 : 268435456);
        if (M.t(i12 & 1, (306783379 & i12) != 306783378)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1070018052, i12, -1, "com.vk.im.edu.ui.compose.item.OrganizationItem (OrganizationItem.kt:49)");
            }
            boolean z3 = izsVar != null;
            dt1.a.getClass();
            ty6.b bVar = dt1.a.l;
            q630.a aVar3 = q630.a.a;
            q630 f = txj0.f(aVar3, 1.0f);
            boolean z4 = ((i12 & 1879048192) == 536870912) | ((i12 & 14) == 4);
            Object x = M.x();
            if (z4 || x == a.C0011a.a) {
                x = new gzs() { // from class: xsna.py80
                    @Override // xsna.gzs
                    public final Object invoke() {
                        izs izsVar2 = izsVar;
                        if (izsVar2 != null) {
                            izsVar2.invoke(Long.valueOf(j));
                        }
                        return s3q0.a;
                    }
                };
                M.R(x);
            }
            q630 c3 = ojc.c(f, z3, null, null, (gzs) x, 14);
            float f2 = 16;
            float f3 = 8;
            float f4 = 12;
            q630 G = s200.G(c3, f2, f4, f2, f3);
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, bVar, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c4 = qri.c(M, G);
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
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c4, dVar);
            ty6.b bVar3 = dt1.a.k;
            gor0 gor0Var = new gor0(bVar3);
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c5 = qri.c(M, gor0Var);
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
            k9q0.w(M, d, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar2, M, c2678a);
            k9q0.w(M, c5, dVar);
            if (z) {
                M.K(2108892624);
                boolean d2 = androidx.compose.runtime.b.d();
                i7 = R.attr.vk_ui_accent_purple;
                if (d2) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                c = ylu0Var.getIcon().h;
                M.j();
            } else {
                i7 = R.attr.vk_ui_accent_purple;
                M.K(2108963552);
                M.j();
                c = f870.c(krv0.l(R.attr.vk_ui_accent_purple));
            }
            if (z) {
                M.K(2109125248);
                j2 = c;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                c2 = ylu0Var2.getBackground().u;
                M.j();
            } else {
                j2 = c;
                M.K(2109211552);
                M.j();
                c2 = f870.c(krv0.l(i7));
            }
            lg90 a2 = pg90.a(i, (i12 >> 6) & 14, M);
            float f5 = tut0.a;
            q630 s = txj0.s(aVar3, f5, f5);
            float f6 = 4;
            vqv.a(a2, "", s200.D(hr80.k(0.12f, new rek0(c2), s200.H(s, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f6, f6, 3), tut0.c), f3), j2, M, 56, 0);
            androidx.compose.runtime.a aVar5 = M;
            if (z) {
                aVar5.K(2109855298);
                if (androidx.compose.runtime.b.d()) {
                    i11 = 0;
                    androidx.compose.runtime.b.f(797276564, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ErrorCircle24> (VkSdkIcons.kt:796)");
                } else {
                    i11 = 0;
                }
                lg90 a3 = pg90.a(R.drawable.vk_icon_error_circle_24, i11, aVar5);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, i11, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var3 = (ylu0) aVar5.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                vqv.a(a3, "", txj0.q(ra8.a.b(aVar3, dt1.a.j), f2), ylu0Var3.getIcon().h, aVar5, 56, 0);
                aVar5 = aVar5;
                i8 = 56;
            } else {
                i8 = 56;
                aVar5.K(2106451312);
            }
            aVar5.j();
            aVar5.G();
            q630 H = s200.H(aVar3, f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f6, 6);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            q630 g = H.g(new xpy(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true));
            androidx.compose.foundation.layout.c a4 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, aVar5, 0);
            int hashCode3 = Long.hashCode(n34.n(aVar5));
            sy90 D3 = aVar5.D();
            q630 c6 = qri.c(aVar5, g);
            if (aVar5.N() == null) {
                n34.r();
                throw null;
            }
            aVar5.H();
            if (aVar5.L()) {
                aVar5.I(aVar4);
            } else {
                aVar5.f();
            }
            k9q0.w(aVar5, a4, cVar);
            k9q0.w(aVar5, D3, eVar);
            ur.d(hashCode3, aVar5, bVar2, aVar5, c2678a);
            k9q0.w(aVar5, c6, dVar);
            androidx.compose.runtime.a aVar6 = aVar5;
            yqv0.c(str, null, wlb0.h(aVar5).getText().m, null, null, 0, 0, null, 0, false, 0, Integer.MAX_VALUE, null, wlb0.l(aVar5).N, aVar6, (i12 >> 3) & 14, 48, 6138);
            aVar2 = aVar6;
            String str3 = (str2 == null || drm0.N(str2)) ? null : str2;
            if (str3 == null) {
                aVar2.K(-1194912987);
                aVar2.j();
                i9 = Integer.MAX_VALUE;
            } else {
                aVar2.K(-1194912986);
                i9 = Integer.MAX_VALUE;
                yqv0.c(str3, s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, tut0.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), f870.c(krv0.l(R.attr.vk_ui_text_secondary)), null, null, 0, 0, null, 0, false, 0, Integer.MAX_VALUE, null, wlb0.l(aVar2).s0, aVar2, 48, 48, 6136);
                aVar2 = aVar2;
                s3q0 s3q0Var = s3q0.a;
                aVar2.j();
            }
            aVar2.G();
            if (z2) {
                aVar2.K(507863954);
                f9t.e(txj0.v(aVar3, 28), aVar2, 6);
                if (androidx.compose.runtime.b.d()) {
                    i10 = 0;
                    androidx.compose.runtime.b.f(-2338790, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Chevron24> (VkSdkIcons.kt:412)");
                } else {
                    i10 = 0;
                }
                lg90 a5 = pg90.a(R.drawable.vk_icon_chevron_24, i10, aVar2);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                androidx.compose.runtime.a aVar7 = aVar2;
                vqv.a(a5, "", txj0.B(s200.H(new gor0(bVar3), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f6, 5), null, 3), f870.c(krv0.l(R.attr.vk_ui_icon_tertiary)), aVar7, i8, 0);
                aVar2 = aVar7;
            } else {
                aVar2.K(503161130);
            }
            aVar2.j();
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            i5 = Integer.MAX_VALUE;
            q630Var2 = aVar3;
            i6 = i9;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
            i5 = i2;
            i6 = i3;
        }
        androidx.compose.runtime.f s2 = aVar2.s();
        if (s2 != null) {
            s2.d = new wzs(j, str, i, q630Var2, z, str2, z2, i5, i6, izsVar, i4) { // from class: xsna.qy80
                public final /* synthetic */ long b;
                public final /* synthetic */ String c;
                public final /* synthetic */ int d;
                public final /* synthetic */ q630 e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ String g;
                public final /* synthetic */ boolean h;
                public final /* synthetic */ int i;
                public final /* synthetic */ int j;
                public final /* synthetic */ izs k;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    ry80.a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
