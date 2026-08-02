package xsna;

import android.view.View;
import androidx.compose.runtime.a;
import com.vk.catalog2.feature.music.search.history.di.SearchHistoryProviderComponent;
import com.vk.core.compose.component.subnavigation.SubnavigationButtonMode;
import com.vk.core.compose.component.subnavigation.SubnavigationButtonSize;
import com.vk.music.search.history.di.SearchHistoryRepoComponent;
import com.vkontakte.android.R;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import xsna.fgt0;
import xsna.q630;
import xsna.rc8;
import xsna.yqx0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class sc8 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sc8(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        wh50 wh50Var;
        wh50 wh50Var2;
        dbs0 y0t0Var;
        int i = this.b;
        Object obj4 = a.C0011a.a;
        int i2 = 4;
        int i3 = 0;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                qc8 qc8Var = (qc8) obj5;
                q630 q630Var = (q630) obj;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                aVar.K(1672772437);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1672772437, intValue, -1, "com.vk.core.compose.utils.relocate.<anonymous> (BringIntoViewRelocator.kt:49)");
                }
                rc8 rc8Var = (rc8) qc8Var;
                Object x = aVar.x();
                if (x == obj4) {
                    x = new bd8();
                    aVar.R(x);
                }
                yc8 yc8Var = (yc8) x;
                Object x2 = aVar.x();
                if (x2 == obj4) {
                    x2 = androidx.compose.runtime.k.b(null);
                    aVar.R(x2);
                }
                wh50 wh50Var3 = (wh50) x2;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1873571424, 6, -1, "androidx.compose.foundation.layout.<get-isImeVisible> (WindowInsets.android.kt:295)");
                }
                WeakHashMap<View, yqx0> weakHashMap = yqx0.w;
                Boolean bool = (Boolean) ((zak0) yqx0.a.c(aVar).c.d).getValue();
                boolean booleanValue = bool.booleanValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                Object x3 = aVar.x();
                if (x3 == obj4) {
                    x3 = androidx.compose.runtime.k.b(Boolean.FALSE);
                    aVar.R(x3);
                }
                wh50 wh50Var4 = (wh50) x3;
                Boolean bool2 = (Boolean) wh50Var4.getValue();
                bool2.booleanValue();
                rc8.a aVar2 = (rc8.a) ((zak0) rc8Var.a).getValue();
                boolean l = aVar.l(booleanValue) | aVar.y(yc8Var) | aVar.y(qc8Var);
                Object x4 = aVar.x();
                if (l || x4 == obj4) {
                    x4 = new vc8(booleanValue, yc8Var, qc8Var, wh50Var4, wh50Var3, null);
                    wh50Var = wh50Var4;
                    wh50Var2 = wh50Var3;
                    aVar.R(x4);
                } else {
                    wh50Var = wh50Var4;
                    wh50Var2 = wh50Var3;
                }
                bap.e(bool, bool2, aVar2, (wzs) x4, aVar, 0);
                Object x5 = aVar.x();
                if (x5 == obj4) {
                    x5 = new tc8(i3, wh50Var2);
                    aVar.R(x5);
                }
                q630 s = fo50.s(egi.o(q630Var, (izs) x5), yc8Var);
                Object x6 = aVar.x();
                if (x6 == obj4) {
                    x6 = new uc8(0, wh50Var);
                    aVar.R(x6);
                }
                q630 u = fvr.u(s, (izs) x6);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
                return u;
            case 1:
                izn iznVar = (izn) obj5;
                yzs<? super Integer, ? super androidx.compose.runtime.a, ? super Integer, s3q0> yzsVar = (yzs) obj;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= aVar3.y(yzsVar) ? 4 : 2;
                }
                if (aVar3.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-97050816, intValue2, -1, "com.vk.community.design.compose.donut.DonutUserStackScopeImpl.counter.<anonymous> (DonutUserStack.kt:321)");
                    }
                    iznVar.e(yzsVar, aVar3, intValue2 & 14);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 2:
                izs izsVar = (izs) obj5;
                lum0 lum0Var = (lum0) obj;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= (intValue3 & 8) == 0 ? aVar4.J(lum0Var) : aVar4.y(lum0Var) ? 4 : 2;
                }
                if (aVar4.t(intValue3 & 1, (intValue3 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-184915459, intValue3, -1, "com.vk.ecomm.storefront.impl.community.presentation.ui.Filters.<anonymous>.<anonymous>.<anonymous> (GoodsWithFiltersList.kt:205)");
                    }
                    q630.a aVar5 = q630.a.a;
                    q630 E = ahn.E(aVar5, "storefront_group_filters_button");
                    int i4 = intValue3;
                    SubnavigationButtonSize subnavigationButtonSize = SubnavigationButtonSize.Medium;
                    SubnavigationButtonMode subnavigationButtonMode = SubnavigationButtonMode.Primary;
                    String N = d370.N(R.string.community_market_title_filters, 0, aVar4);
                    lg90 a = pg90.a(R.drawable.vk_icon_filter_24, 0, aVar4);
                    boolean J = aVar4.J(izsVar);
                    Object x7 = aVar4.x();
                    if (J || x7 == obj4) {
                        x7 = new ega(izsVar, 4);
                        aVar4.R(x7);
                    }
                    int i5 = (i4 << 3) & 112;
                    lum0Var.a(subnavigationButtonSize, subnavigationButtonMode, false, (gzs) x7, E, null, N, a, null, null, false, aVar4, 16802230, i5, 1824);
                    q630 E2 = ahn.E(aVar5, "storefront_group_sorting_button");
                    String N2 = d370.N(R.string.community_market_title_sorting, 0, aVar4);
                    lg90 a2 = pg90.a(R.drawable.vk_icon_sort_outline_24, 0, aVar4);
                    boolean J2 = aVar4.J(izsVar);
                    Object x8 = aVar4.x();
                    if (J2 || x8 == obj4) {
                        x8 = new oq5(izsVar, i2);
                        aVar4.R(x8);
                    }
                    lum0Var.a(subnavigationButtonSize, subnavigationButtonMode, false, (gzs) x8, E2, null, N2, a2, null, null, false, aVar4, 16802230, i5, 1824);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 3:
                return new SearchHistoryProviderComponent((fvh0) obj3, (SearchHistoryRepoComponent) ((f8m) obj).b(fpf0.a(SearchHistoryRepoComponent.class), new hvh0(((uuh0) obj5).a)));
            default:
                fgt0 fgt0Var = (fgt0) obj5;
                fgt0.b bVar = (fgt0.b) obj2;
                ((Integer) obj3).intValue();
                fgt0.a aVar6 = bVar.a;
                if (aVar6 == fgt0.a.AUDIO && bVar.d) {
                    fgt0Var.d().b();
                }
                switch (fgt0.d.$EnumSwitchMapping$0[aVar6.ordinal()]) {
                    case 1:
                        if (!fxc0.B().J().l0()) {
                            y0t0Var = new y0t0(fgt0Var.d);
                            break;
                        } else {
                            y0t0Var = new x0t0(fgt0Var.d);
                            break;
                        }
                    case 2:
                        y0t0Var = new d1t0(fgt0Var.d);
                        break;
                    case 3:
                        y0t0Var = new q0t0(fgt0Var.d);
                        break;
                    case 4:
                        y0t0Var = new c1t0(fgt0Var.d);
                        break;
                    case 5:
                        y0t0Var = new e1t0(fgt0Var.d);
                        break;
                    case 6:
                        y0t0Var = zms0.a;
                        break;
                    case 7:
                        y0t0Var = new c4s0(!epx.f(fgt0Var.g.k, Boolean.TRUE));
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                fgt0Var.e.bk(y0t0Var);
                fgt0Var.dismiss();
                return s3q0.a;
        }
    }
}
