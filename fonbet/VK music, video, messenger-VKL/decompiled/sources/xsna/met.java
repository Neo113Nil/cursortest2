package xsna;

import com.vk.games.model.GamesCatalogScreenTab;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: GamesCatalogTabItemContent.kt */
/* loaded from: classes17.dex */
public final class met {

    /* compiled from: GamesCatalogTabItemContent.kt */
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

    public static final void a(k1i0 k1i0Var, final GamesCatalogScreenTab gamesCatalogScreenTab, boolean z, gzs<s3q0> gzsVar, final mc90 mc90Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        k1i0 k1i0Var2;
        gzs<s3q0> gzsVar2;
        final boolean z2;
        final int i3;
        androidx.compose.runtime.a M = aVar.M(-1312812443);
        if ((i & 6) == 0) {
            i2 = (M.J(k1i0Var) ? 4 : 2) | i;
        } else {
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
                androidx.compose.runtime.b.f(-1312812443, i2, -1, "com.vk.games.presentation.components.tab.GamesCatalogTabItemContent (GamesCatalogTabItemContent.kt:19)");
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
            jai c = kai.c(237820631, new zzs() { // from class: xsna.ket
                @Override // xsna.zzs
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    ((Boolean) obj2).getClass();
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if (aVar2.t(intValue & 1, (intValue & 129) != 128)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(237820631, intValue, -1, "com.vk.games.presentation.components.tab.GamesCatalogTabItemContent.<anonymous> (GamesCatalogTabItemContent.kt:29)");
                        }
                        yqv0.c(d370.N(i3, 0, aVar2), null, f870.D(wlb0.h(aVar2).getText().p, wlb0.h(aVar2).getText().m, tni.m(mc90Var, gamesCatalogScreenTab.ordinal())), null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(aVar2).P, aVar2, 0, 0, 8186);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M);
            int i5 = i2 >> 6;
            k1i0Var2 = k1i0Var;
            gzsVar2 = gzsVar;
            k1i0Var2.b(z, gzsVar2, c, null, M, (i5 & 112) | (i5 & 14) | 384 | ((i2 << 12) & 57344), 8);
            z2 = z;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            k1i0Var2 = k1i0Var;
            gzsVar2 = gzsVar;
            z2 = z;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final k1i0 k1i0Var3 = k1i0Var2;
            final gzs<s3q0> gzsVar3 = gzsVar2;
            s.d = new wzs() { // from class: xsna.let
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    met.a(k1i0.this, gamesCatalogScreenTab, z2, gzsVar3, mc90Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
