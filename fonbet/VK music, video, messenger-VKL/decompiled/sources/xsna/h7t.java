package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ContentBadgeAppearance;
import com.vk.core.compose.component.defaults.ContentBadgeMode;
import com.vk.core.compose.component.defaults.ContentBadgeSize;
import com.vk.games.presentation.catalog.model.items.GameCatalogBadge;
import com.vkontakte.android.R;
import xsna.n6t;
import xsna.q630;

/* compiled from: GameItemBadge.kt */
/* loaded from: classes17.dex */
public final class h7t {
    public static final void a(GameCatalogBadge gameCatalogBadge, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        long j;
        String a;
        androidx.compose.runtime.a M = aVar.M(-286027915);
        int i2 = (M.o(gameCatalogBadge.ordinal()) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-286027915, i2, -1, "com.vk.games.presentation.components.items.GameItemBadge (GameItemBadge.kt:16)");
            }
            int i3 = i2 & 14;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1103252622, i3, -1, "com.vk.games.presentation.catalog.model.items.toBackgroundColor (GameCatalogBadge.kt:24)");
            }
            int[] iArr = n6t.a.$EnumSwitchMapping$0;
            int i4 = iArr[gameCatalogBadge.ordinal()];
            if (i4 == 1) {
                M.K(631156477);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var.q().a;
                M.j();
            } else {
                if (i4 != 2) {
                    throw alb0.c(631154564, M);
                }
                M.K(631158530);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var2.q().h;
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var3 = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            ContentBadgeAppearance.a aVar3 = new ContentBadgeAppearance.a(12, j, ylu0Var3.getText().d, 0L);
            ContentBadgeSize contentBadgeSize = ContentBadgeSize.Medium;
            ContentBadgeMode contentBadgeMode = ContentBadgeMode.Primary;
            q630 H = s200.H(q630.a.a, 2, 12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1885441216, i3, -1, "com.vk.games.presentation.catalog.model.items.toText (GameCatalogBadge.kt:30)");
            }
            int i5 = iArr[gameCatalogBadge.ordinal()];
            if (i5 == 1) {
                a = zq.a(M, 567193419, R.string.vk_games_badge_new, M, 0);
            } else {
                if (i5 != 2) {
                    throw alb0.c(567192195, M);
                }
                a = zq.a(M, 567195789, R.string.vk_games_badge_bonus, M, 0);
            }
            String str = a;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            rnu0.c(contentBadgeSize, contentBadgeMode, aVar3, H, null, null, str, null, null, null, false, null, false, null, aVar2, 3126, 0, 16304);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new te1(gameCatalogBadge, i, 5);
        }
    }
}
