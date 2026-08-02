package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.games.model.GamesCatalogScreenTab;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.q630;

/* compiled from: CatalogTabItemContentLego.kt */
/* loaded from: classes17.dex */
public final class kha {

    /* compiled from: CatalogTabItemContentLego.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GamesCatalogScreenTab.values().length];
            try {
                iArr[GamesCatalogScreenTab.CATALOG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GamesCatalogScreenTab.CATEGORIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(final k1i0 k1i0Var, GamesCatalogScreenTab gamesCatalogScreenTab, final boolean z, final gzs<s3q0> gzsVar, final mc90 mc90Var, androidx.compose.runtime.a aVar, final int i) {
        k1i0 k1i0Var2;
        int i2;
        final GamesCatalogScreenTab gamesCatalogScreenTab2;
        final int i3;
        androidx.compose.runtime.a M = aVar.M(-1572536780);
        if ((i & 6) == 0) {
            k1i0Var2 = k1i0Var;
            i2 = (M.J(k1i0Var2) ? 4 : 2) | i;
        } else {
            k1i0Var2 = k1i0Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.o(gamesCatalogScreenTab.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(gzsVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(mc90Var) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1572536780, i2, -1, "com.vk.games.presentation.components.tab.GamesCatalogTabItemContentLego (CatalogTabItemContentLego.kt:22)");
            }
            int i4 = a.$EnumSwitchMapping$0[gamesCatalogScreenTab.ordinal()];
            if (i4 == 1) {
                i3 = R.string.vk_games_tab_main;
            } else {
                if (i4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i3 = R.string.vk_games_tab_categories;
            }
            gamesCatalogScreenTab2 = gamesCatalogScreenTab;
            int i5 = i2 >> 6;
            k1i0Var2.b(z, gzsVar, kai.c(964102274, new zzs() { // from class: xsna.iha
                @Override // xsna.zzs
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    ((Boolean) obj2).getClass();
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if (aVar2.t(intValue & 1, (intValue & 129) != 128)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(964102274, intValue, -1, "com.vk.games.presentation.components.tab.GamesCatalogTabItemContentLego.<anonymous> (CatalogTabItemContentLego.kt:32)");
                        }
                        yqv0.c(d370.N(i3, 0, aVar2), null, f870.D(wlb0.h(aVar2).getText().p, wlb0.h(aVar2).getText().m, tni.m(mc90Var, gamesCatalogScreenTab2.ordinal())), null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(aVar2).W0, aVar2, 0, 0, 8186);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), M, (i5 & 112) | (i5 & 14) | 3456 | ((i2 << 12) & 57344), 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            gamesCatalogScreenTab2 = gamesCatalogScreenTab;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final GamesCatalogScreenTab gamesCatalogScreenTab3 = gamesCatalogScreenTab2;
            s.d = new wzs() { // from class: xsna.jha
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    kha.a(k1i0.this, gamesCatalogScreenTab3, z, gzsVar, mc90Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
