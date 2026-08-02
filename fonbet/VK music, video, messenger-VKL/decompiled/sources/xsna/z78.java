package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.defaults.IconButtonRippleType;
import com.vk.libvideo.adfree.impl.ui.entity.BottomSheetViewState;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.wkj;

/* compiled from: BottomSheetContentView.kt */
/* loaded from: classes18.dex */
public final class z78 {
    public static final void a(BottomSheetViewState bottomSheetViewState, izs<? super d78, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-814976993);
        if ((i & 6) == 0) {
            i2 = (M.J(bottomSheetViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-814976993, i2, -1, "com.vk.libvideo.adfree.impl.ui.view.BottomSheetContentView (BottomSheetContentView.kt:42)");
            }
            if (bottomSheetViewState.e) {
                M.K(470694746);
                rrv0.e(true, null, null, null, null, null, kai.c(-919299299, new x78(0, bottomSheetViewState, izsVar), M), M, 1572870, 62);
                M.j();
            } else {
                M.K(470802967);
                b(bottomSheetViewState, izsVar, M, i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
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
            s.d = new y78(bottomSheetViewState, izsVar, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(BottomSheetViewState bottomSheetViewState, izs<? super d78, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        izs<? super d78, s3q0> izsVar2;
        androidx.compose.runtime.a aVar2;
        char c;
        int i3;
        a.C0011a.C0012a c0012a;
        int i4;
        int i5;
        Object x;
        androidx.compose.runtime.a M = aVar.M(774228108);
        if ((i & 6) == 0) {
            i2 = i | (M.J(bottomSheetViewState) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        int i6 = i2;
        if (M.t(i6 & 1, (i6 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(774228108, i6, -1, "com.vk.libvideo.adfree.impl.ui.view.Content (BottomSheetContentView.kt:56)");
            }
            q630.a aVar3 = q630.a.a;
            q630 m = hr80.m(rte0.d(txj0.f(sua.d(0.9f, aVar3, false), 1.0f), vog0.b(12)), wlb0.h(M).getBackground().r, androidx.compose.ui.graphics.e.a);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, m);
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
            k9q0.w(M, d, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c2, dVar);
            ty6 ty6Var = dt1.a.i;
            ra8 ra8Var = ra8.a;
            float f = 16;
            q630 D2 = s200.D(txj0.z(txj0.f(ra8Var.b(aVar3, ty6Var), 1.0f), null, 3), f);
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c3 = qri.c(M, D2);
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
            k9q0.w(M, a, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            q630 E = ahn.E(aVar3, "adFreeBottomSheetPicture");
            qzu0.a.getClass();
            if (androidx.compose.runtime.b.d()) {
                c = 65535;
                i3 = 0;
                androidx.compose.runtime.b.f(2024751406, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-IllustrationVkvideoSubscriptionHorizontal160H> (VkIcons.kt:4092)");
            } else {
                c = 65535;
                i3 = 0;
            }
            lg90 a2 = pg90.a(R.drawable.vk_icon_illustration_vkvideo_subscription_horizontal_160h, i3, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            vjw.a(a2, null, E, null, wkj.a.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, M, 25016, 104);
            f9t.e(txj0.h(aVar3, f), M, 6);
            yqv0.c(bottomSheetViewState.b, ahn.E(aVar3, "adFreeBottomSheetTitle"), wlb0.h(M).getText().m, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(M).C, M, 48, 0, 8120);
            f9t.e(txj0.h(aVar3, 32), M, 6);
            q630 f2 = txj0.f(aVar3, 1.0f);
            float f3 = 44;
            q630 E2 = ahn.E(txj0.h(f2, f3), "adFreeBottomSheetProceedButton");
            String str = bottomSheetViewState.c;
            ButtonSize buttonSize = ButtonSize.Large;
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            int i7 = i6 & 112;
            boolean z = i7 == 32;
            Object x2 = M.x();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (z || x2 == c0012a2) {
                x2 = new u78(izsVar, 0);
                M.R(x2);
            }
            bhu0.e((gzs) x2, buttonSize, buttonStyle, buttonAppearance, E2, null, false, false, null, null, null, str, null, null, null, null, false, null, null, null, M, 28080, 0, 0, 4190176);
            f9t.e(txj0.h(aVar3, 8), M, 6);
            q630 E3 = ahn.E(txj0.h(txj0.f(aVar3, 1.0f), f3), "adFreeBottomSheetTermsButton");
            String str2 = bottomSheetViewState.d;
            ButtonStyle buttonStyle2 = ButtonStyle.Tertiary;
            boolean z2 = i7 == 32;
            Object x3 = M.x();
            if (z2) {
                c0012a = c0012a2;
            } else {
                c0012a = c0012a2;
                if (x3 != c0012a) {
                    izsVar2 = izsVar;
                    bhu0.e((gzs) x3, buttonSize, buttonStyle2, buttonAppearance, E3, null, false, false, null, null, null, str2, null, null, null, null, false, null, null, null, M, 28080, 0, 0, 4190176);
                    M.G();
                    q630 E4 = ahn.E(ra8Var.b(aVar3, dt1.a.d), "adFreeBottomSheetClose");
                    float f4 = 48;
                    if (androidx.compose.runtime.b.d()) {
                        i4 = 0;
                    } else {
                        i4 = 0;
                        androidx.compose.runtime.b.f(-1624152604, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-DismissDark24> (VkSdkIcons.kt:656)");
                    }
                    lg90 b = or.b(M, 1971505535, R.drawable.vk_icon_dismiss_dark_24, M, i4);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    IconButtonRippleType iconButtonRippleType = IconButtonRippleType.Bounded;
                    i5 = i7 != 32 ? i4 : 1;
                    x = M.x();
                    if (i5 == 0 || x == c0012a) {
                        x = new v78(izsVar2, 0);
                        M.R(x);
                    }
                    aVar2 = M;
                    nzu0.c((gzs) x, b, null, E4, f4, 0L, false, iconButtonRippleType, false, null, null, aVar2, 12607936, 1888);
                    aVar2.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                }
            }
            x3 = new oq5(izsVar, 1);
            M.R(x3);
            izsVar2 = izsVar;
            bhu0.e((gzs) x3, buttonSize, buttonStyle2, buttonAppearance, E3, null, false, false, null, null, null, str2, null, null, null, null, false, null, null, null, M, 28080, 0, 0, 4190176);
            M.G();
            q630 E42 = ahn.E(ra8Var.b(aVar3, dt1.a.d), "adFreeBottomSheetClose");
            float f42 = 48;
            if (androidx.compose.runtime.b.d()) {
            }
            lg90 b2 = or.b(M, 1971505535, R.drawable.vk_icon_dismiss_dark_24, M, i4);
            if (androidx.compose.runtime.b.d()) {
            }
            IconButtonRippleType iconButtonRippleType2 = IconButtonRippleType.Bounded;
            if (i7 != 32) {
            }
            x = M.x();
            if (i5 == 0) {
            }
            x = new v78(izsVar2, 0);
            M.R(x);
            aVar2 = M;
            nzu0.c((gzs) x, b2, null, E42, f42, 0L, false, iconButtonRippleType2, false, null, null, aVar2, 12607936, 1888);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
            }
        } else {
            izsVar2 = izsVar;
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new w78(bottomSheetViewState, izsVar2, i, 0);
        }
    }
}
