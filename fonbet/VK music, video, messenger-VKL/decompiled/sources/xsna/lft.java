package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.group.header.f;
import com.vk.games.presentation.catalog.model.GamesDetailCatalogHeaderType;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.q630;

/* compiled from: GamesDetailHeader.kt */
/* loaded from: classes17.dex */
public final class lft {
    public static final void a(GamesDetailCatalogHeaderType gamesDetailCatalogHeaderType, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        int i2;
        androidx.compose.runtime.a M = aVar.M(1005383902);
        int i3 = (M.o(gamesDetailCatalogHeaderType.ordinal()) ? 4 : 2) | i | 48;
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1005383902, i3, -1, "com.vk.games.presentation.components.items.GamesDetailHeader (GamesDetailHeader.kt:15)");
            }
            int i4 = i3 & 14;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2050333463, i4, -1, "com.vk.games.presentation.catalog.model.getString (GamesDetailCatalogHeaderType.kt:12)");
            }
            int i5 = kft.$EnumSwitchMapping$0[gamesDetailCatalogHeaderType.ordinal()];
            if (i5 == 1) {
                i2 = R.string.vk_games_new;
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = R.string.vk_games_old;
            }
            String N = d370.N(i2, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            com.vk.core.compose.component.group.header.f a = f.a.a(N, null, null, null, null, null, null, null, false, M, 805306368, 510);
            float f = gamesDetailCatalogHeaderType == GamesDetailCatalogHeaderType.OLD ? 12 : 0;
            q630.a aVar2 = q630.a.a;
            q630Var2 = aVar2;
            com.vk.core.compose.component.group.header.g.b(a, s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), null, null, null, null, true, M, 1572864, 60);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new n85(gamesDetailCatalogHeaderType, q630Var2, i, 5);
        }
    }
}
