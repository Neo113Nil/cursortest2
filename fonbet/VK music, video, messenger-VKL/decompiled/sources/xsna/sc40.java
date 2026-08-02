package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.defaults.PictureRadius;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.q630;
import xsna.yk8;

/* compiled from: MusicBuySubscription.kt */
/* loaded from: classes3.dex */
public final class sc40 {
    public static final void a(String str, String str2, lg90 lg90Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1950273323);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.J(str2) ? 32 : 16) | (M.y(lg90Var) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1950273323, i2, -1, "com.vk.music.ui.subscription.CellItem (MusicBuySubscription.kt:171)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = yk8.a.g(e43.l(new l5g(f870.d(4294045681L)), new l5g(f870.d(4292858339L)), new l5g(f870.d(4287856629L))), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
                M.R(x);
            }
            aVar2 = M;
            wiu0.b(q630Var, false, com.vk.core.compose.component.cell.content.g.a(new qc40(lg90Var, (yk8) x), Cell$Left.Main.Size.Medium, null, PictureRadius.Large, null, M, 12607536, 108), Cell$Middle.a.a(Cell$Middle.d.b.a(str, null, null, 0, null, null, M, (i2 & 14) | 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), new rc40(str2), null, null, aVar2, 196608, 28), null, null, null, aVar2, 6, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new byl(str, str2, lg90Var, q630Var, i);
        }
    }

    public static final void b(int i, androidx.compose.runtime.a aVar, gzs gzsVar, izs izsVar, q630 q630Var) {
        androidx.compose.runtime.a M = aVar.M(325678552);
        int i2 = (M.y(gzsVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | 384;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(325678552, i2, -1, "com.vk.music.ui.subscription.MusicBuySubscription (MusicBuySubscription.kt:57)");
            }
            rrv0.e(true, null, null, null, null, null, kai.c(1610158229, new au7(gzsVar, izsVar), M), M, 1572870, 62);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = q630.a.a;
        } else {
            M.h();
        }
        q630 q630Var2 = q630Var;
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wi4(i, 1, gzsVar, izsVar, q630Var2);
        }
    }

    public static final void c(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-603504847);
        if (M.t(i & 1, i != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-603504847, i, -1, "com.vk.music.ui.subscription.SubscriptionBenefits (MusicBuySubscription.kt:135)");
            }
            q630.a aVar2 = q630.a.a;
            q630 E = ahn.E(aVar2, "BENEFITS_ITEM1");
            String N = d370.N(R.string.music_subscription_paywall_no_ad_title, 0, M);
            String N2 = d370.N(R.string.music_subscription_paywall_no_ad_subtitle, 0, M);
            qzu0.a.getClass();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1187643018, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-LoudspeakerSlashOutline28> (VkIcons.kt:7168)");
            }
            lg90 a = pg90.a(R.drawable.vk_icon_loudspeaker_slash_outline_28, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            a(N, N2, a, E, M, 3584);
            q630 E2 = ahn.E(aVar2, "BENEFITS_ITEM2");
            String N3 = d370.N(R.string.music_subscription_paywall_no_internet_title, 0, M);
            String N4 = d370.N(R.string.music_subscription_paywall_no_internet_subtitle, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1319356550, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-DownloadOutline28> (VkIcons.kt:2276)");
            }
            lg90 b = or.b(M, 1705430940, R.drawable.vk_icon_download_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            a(N3, N4, b, E2, M, 3584);
            q630 E3 = ahn.E(aVar2, "BENEFITS_ITEM3");
            String N5 = d370.N(R.string.music_subscription_paywall_offline_title, 0, M);
            String N6 = d370.N(R.string.music_subscription_paywall_offline_subtitle, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1688054682, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-SmartphoneOutline28> (VkSdkIcons.kt:3368)");
            }
            lg90 b2 = or.b(M, 935218103, R.drawable.vk_icon_smartphone_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            a(N5, N6, b2, E3, M, 3584);
            q630 E4 = ahn.E(aVar2, "BENEFITS_ITEM4");
            String N7 = d370.N(R.string.music_subscription_paywall_book_title, 0, M);
            String N8 = d370.N(R.string.music_subscription_paywall_book_subtitle, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(759005726, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-BookSpreadOutline28> (VkIcons.kt:730)");
            }
            lg90 b3 = or.b(M, -1463051519, R.drawable.vk_icon_book_spread_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            a(N7, N8, b3, E4, M, 3584);
            q630 E5 = ahn.E(aVar2, "BENEFITS_ITEM5");
            String N9 = d370.N(R.string.music_buy_subscription_bottomsheet_kids_section_title, 0, M);
            String N10 = d370.N(R.string.music_buy_subscription_bottomsheet_kids_section_subtitle, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2043197612, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-HorseToyOutline28> (VkIcons.kt:3514)");
            }
            lg90 b4 = or.b(M, -623363571, R.drawable.vk_icon_horse_toy_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            a(N9, N10, b4, E5, M, 3584);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new f07(i);
        }
    }
}
