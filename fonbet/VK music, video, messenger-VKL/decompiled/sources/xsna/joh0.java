package xsna;

import androidx.compose.runtime.a;
import xsna.loh0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class joh0 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ mtk0 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ joh0(mtk0 mtk0Var, Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = mtk0Var;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                koh0 koh0Var = (koh0) this.d;
                c1h c1hVar = (c1h) this.e;
                izs<? super ynh0, s3q0> izsVar = (izs) this.f;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1116544899, intValue, -1, "com.vk.search.communities.map.impl.ui.details.compose.SearchCommunitiesOnMapDetailsView.SearchCommunitiesOnMapDetailsContent.<anonymous> (SearchCommunitiesOnMapDetailsView.kt:158)");
                    }
                    loh0.e eVar = (loh0.e) this.c.getValue();
                    if (epx.f(eVar, loh0.e.b.a)) {
                        aVar.K(1532749629);
                        koh0Var.o(0, aVar);
                        aVar.j();
                    } else {
                        if (!(eVar instanceof loh0.e.a)) {
                            throw alb0.c(742177019, aVar);
                        }
                        aVar.K(1532903420);
                        koh0Var.l((loh0.e.a) eVar, c1hVar, izsVar, aVar, 0);
                        aVar.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            default:
                wh50 wh50Var = (wh50) this.c;
                wh50 wh50Var2 = (wh50) this.d;
                wh50 wh50Var3 = (wh50) this.e;
                rg50 rg50Var = (rg50) this.f;
                jj jjVar = (jj) obj;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= aVar2.J(jjVar) ? 4 : 2;
                }
                if (aVar2.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1173692392, intValue2, -1, "com.vk.design.demo.presentation.screens.AccentTabsContent.<anonymous>.<anonymous>.<anonymous> (TabsScreenContent.kt:446)");
                    }
                    int intValue3 = rg50Var.getIntValue();
                    boolean booleanValue = ((Boolean) wh50Var.getValue()).booleanValue();
                    boolean booleanValue2 = ((Boolean) wh50Var2.getValue()).booleanValue();
                    boolean booleanValue3 = ((Boolean) wh50Var3.getValue()).booleanValue();
                    Object x = aVar2.x();
                    if (x == a.C0011a.a) {
                        x = new n9m0(rg50Var, 7);
                        aVar2.R(x);
                    }
                    jzn0.a(jjVar, 4, intValue3, false, (izs) x, booleanValue, booleanValue2, booleanValue3, aVar2, (intValue2 & 14) | 27696);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
        }
    }
}
