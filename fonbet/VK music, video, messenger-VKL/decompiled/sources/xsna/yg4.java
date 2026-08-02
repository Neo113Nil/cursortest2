package xsna;

import android.content.Context;
import android.graphics.Canvas;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.yk8;

/* compiled from: AudioBookFreeBottomSheetView.kt */
/* loaded from: classes3.dex */
public final class yg4 {
    public static final void a(gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(305466245);
        int i2 = (M.y(gzsVar) ? 4 : 2) | i | (M.y(gzsVar2) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(305466245, i2, -1, "com.vk.music.playlist.display.audiobook.presentation.AudioBookFreeBottomSheetContentView (AudioBookFreeBottomSheetView.kt:39)");
            }
            q630 D = p490.D(txj0.f(q630.a.a, 1.0f), p490.x(M), 14);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c = qri.c(M, D);
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
            k9q0.w(M, D2, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            e(0, M);
            d(0, M);
            c(gzsVar, gzsVar2, M, i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new sg4(gzsVar, gzsVar2, i, 0);
        }
    }

    public static final void b(final gzs gzsVar, final int i, final ButtonStyle buttonStyle, final q630 q630Var, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(305857251);
        if ((i2 & 6) == 0) {
            i3 = (M.y(gzsVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.o(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.o(buttonStyle.ordinal()) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= M.J(q630Var) ? 2048 : 1024;
        }
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(305857251, i3, -1, "com.vk.music.playlist.display.audiobook.presentation.BottomSheetButton (AudioBookFreeBottomSheetView.kt:132)");
            }
            String N = d370.N(i, (i3 >> 3) & 14, M);
            ButtonSize buttonSize = ButtonSize.Large;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            boolean z = (i3 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new wg4(0, gzsVar);
                M.R(x);
            }
            aVar2 = M;
            bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance, q630Var, null, false, false, null, null, null, N, null, null, null, null, false, null, null, null, aVar2, (i3 & 896) | 3120 | ((i3 << 3) & 57344), 0, 0, 4190176);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.xg4
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    yg4.b(gzs.this, i, buttonStyle, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, androidx.compose.runtime.a aVar, int i) {
        gzs<s3q0> gzsVar3;
        gzs<s3q0> gzsVar4;
        androidx.compose.runtime.a M = aVar.M(205037169);
        int i2 = (M.y(gzsVar) ? 4 : 2) | i | (M.y(gzsVar2) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(205037169, i2, -1, "com.vk.music.playlist.display.audiobook.presentation.BottomSheetButtons (AudioBookFreeBottomSheetView.kt:106)");
            }
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            q630.a aVar2 = q630.a.a;
            b(gzsVar, R.string.music_audio_book_free_bottom_sheet_learn_about_subscribe, buttonStyle, txj0.f(s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 32, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 1.0f), M, (i2 & 14) | 3456);
            gzsVar3 = gzsVar;
            gzsVar4 = gzsVar2;
            b(gzsVar4, R.string.music_audio_book_free_bottom_sheet_later, ButtonStyle.Secondary, txj0.f(s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16, 5), 1.0f), M, ((i2 >> 3) & 14) | 3456);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            gzsVar3 = gzsVar;
            gzsVar4 = gzsVar2;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wd0(gzsVar3, gzsVar4, i, 1);
        }
    }

    public static final void d(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(559231578);
        if (M.t(i & 1, i != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(559231578, i, -1, "com.vk.music.playlist.display.audiobook.presentation.BottomSheetTextBlock (AudioBookFreeBottomSheetView.kt:79)");
            }
            String N = d370.N(R.string.music_audio_book_free_bottom_sheet_title, 0, M);
            frv0 frv0Var = wlb0.l(M).C;
            q630.a aVar3 = q630.a.a;
            float f = 16;
            yqv0.c(N, s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 1.0f)), wlb0.h(M).getText().m, null, null, 0, 3, null, 0, false, 0, 0, null, frv0Var, M, 48, 0, 8120);
            aVar2 = M;
            yqv0.c(d370.N(R.string.music_audio_book_free_bottom_sheet_subtitle, 0, M), s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 1.0f)), wlb0.h(M).getText().r, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(M).e0, aVar2, 48, 0, 8120);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new ug4(i);
        }
    }

    public static final void e(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-802079705);
        if (M.t(i & 1, i != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-802079705, i, -1, "com.vk.music.playlist.display.audiobook.presentation.GradientGiftIcon (AudioBookFreeBottomSheetView.kt:56)");
            }
            final long c = f870.c(((Context) M.r(AndroidCompositionLocals_androidKt.b)).getColor(R.color.vk_raspberry_pink));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            final long j = ylu0Var.getBackground().f;
            q630.a aVar2 = q630.a.a;
            txj0.q(aVar2, 56);
            q630 f = bu00.f(aVar2, new izs() { // from class: xsna.vg4
                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    ggj ggjVar = (ggj) obj;
                    yq9 a = ggjVar.a0().a();
                    Canvas canvas = e52.a;
                    Canvas canvas2 = ((d52) a).a;
                    int saveLayer = canvas2.saveLayer(null, null);
                    ggjVar.s1();
                    oio.x1(ggjVar, yk8.a.g(e43.l(new l5g(c), new l5g(j)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 5, 62);
                    canvas2.restoreToCount(saveLayer);
                    return s3q0.a;
                }
            });
            qzu0.a.getClass();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(597126508, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-GiftOutline56> (VkIcons.kt:3090)");
            }
            lg90 a = pg90.a(R.drawable.vk_icon_gift_outline_56, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            vqv.a(a, null, f, ylu0Var2.getIcon().c, M, 56, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new tg4(i);
        }
    }
}
