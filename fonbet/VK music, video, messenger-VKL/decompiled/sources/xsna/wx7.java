package xsna;

import android.content.res.Configuration;
import android.view.View;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.games.model.GamesCatalogScreenTab;
import java.util.List;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class wx7 implements yzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ wx7(List list, yjl yjlVar, wzs wzsVar, yjl yjlVar2) {
        this.c = list;
        this.d = yjlVar;
        this.f = wzsVar;
        this.e = yjlVar2;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                List list = (List) this.c;
                yjl yjlVar = (yjl) this.d;
                final wzs wzsVar = (wzs) this.f;
                final yjl yjlVar2 = (yjl) this.e;
                jj jjVar = (jj) obj;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= aVar.J(jjVar) ? 4 : 2;
                }
                int i = intValue;
                if (aVar.t(i & 1, (i & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1826003071, i, -1, "com.vk.ecomm.onlinebooking.impl.services.presentation.ui.CategoriesTabsView.<anonymous> (BookingServicesScreen.kt:408)");
                    }
                    final int i2 = 0;
                    for (Object obj4 : list) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            e43.t();
                            throw null;
                        }
                        final ow7 ow7Var = (ow7) obj4;
                        q630 E = ahn.E(q630.a.a, "services_category_tab");
                        boolean z = yjlVar.k() == i2;
                        boolean J = aVar.J(wzsVar) | aVar.o(i2) | aVar.J(ow7Var);
                        Object x = aVar.x();
                        if (J || x == a.C0011a.a) {
                            x = new gzs() { // from class: xsna.ay7
                                @Override // xsna.gzs
                                public final Object invoke() {
                                    ow7 ow7Var2 = ow7Var;
                                    wzs.this.invoke(Integer.valueOf(i2), ow7Var2);
                                    return s3q0.a;
                                }
                            };
                            aVar.R(x);
                        }
                        jjVar.b(z, (gzs) x, kai.c(-1282348976, new zzs() { // from class: xsna.by7
                            @Override // xsna.zzs
                            public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                                ((Boolean) obj6).getClass();
                                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj7;
                                int intValue2 = ((Integer) obj8).intValue();
                                if (aVar2.t(intValue2 & 1, (intValue2 & 129) != 128)) {
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(-1282348976, intValue2, -1, "com.vk.ecomm.onlinebooking.impl.services.presentation.ui.CategoriesTabsView.<anonymous>.<anonymous>.<anonymous> (BookingServicesScreen.kt:416)");
                                    }
                                    yqv0.c(ow7.this.b, txj0.x(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((Configuration) aVar2.r(AndroidCompositionLocals_androidKt.a)).screenWidthDp * 0.7f, 1, q630.a.a), f870.D(wlb0.h(aVar2).getText().p, wlb0.h(aVar2).getText().c, tni.m(yjlVar2, i2)), null, null, 0, 0, null, 2, false, 0, 1, null, wlb0.l(aVar2).P, aVar2, 100663296, 48, 5880);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                } else {
                                    aVar2.h();
                                }
                                return s3q0.a;
                            }
                        }, aVar), E, aVar, ((i << 12) & 57344) | 3456, 0);
                        i2 = i3;
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            default:
                mc90 mc90Var = (mc90) this.c;
                View view = (View) this.d;
                yvj yvjVar = (yvj) this.e;
                mc90 mc90Var2 = (mc90) this.f;
                k1i0 k1i0Var = (k1i0) obj;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= aVar2.J(k1i0Var) ? 4 : 2;
                }
                if (aVar2.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-461447866, intValue2, -1, "com.vk.games.presentation.components.tab.GamesCatalogTabsRow.<anonymous> (GamesCatalogTabsRow.kt:28)");
                    }
                    GamesCatalogScreenTab gamesCatalogScreenTab = GamesCatalogScreenTab.CATALOG;
                    boolean z2 = mc90Var.k() == gamesCatalogScreenTab.ordinal();
                    boolean y = aVar2.y(view) | aVar2.y(yvjVar) | aVar2.J(mc90Var);
                    Object x2 = aVar2.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (y || x2 == c0012a) {
                        x2 = new jtb(view, yvjVar, mc90Var, 1);
                        aVar2.R(x2);
                    }
                    gzs gzsVar = (gzs) x2;
                    int i4 = (intValue2 & 14) | 48;
                    met.a(k1i0Var, gamesCatalogScreenTab, z2, gzsVar, mc90Var2, aVar2, i4);
                    GamesCatalogScreenTab gamesCatalogScreenTab2 = GamesCatalogScreenTab.CATEGORIES;
                    boolean z3 = mc90Var.k() == gamesCatalogScreenTab2.ordinal();
                    boolean y2 = aVar2.y(view) | aVar2.y(yvjVar) | aVar2.J(mc90Var);
                    Object x3 = aVar2.x();
                    if (y2 || x3 == c0012a) {
                        x3 = new fu5(view, yvjVar, mc90Var, 3);
                        aVar2.R(x3);
                    }
                    met.a(k1i0Var, gamesCatalogScreenTab2, z3, (gzs) x3, mc90Var2, aVar2, i4);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ wx7(mc90 mc90Var, View view, yvj yvjVar, mc90 mc90Var2) {
        this.c = mc90Var;
        this.d = view;
        this.e = yvjVar;
        this.f = mc90Var2;
    }
}
