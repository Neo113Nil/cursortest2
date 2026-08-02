package xsna;

import androidx.compose.runtime.a;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class hx implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ hx(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                kx kxVar = (kx) this.d;
                ry ryVar = (ry) this.e;
                izs izsVar = (izs) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1431061601, intValue, -1, "com.vk.newsfeed.posting.action_button.presentation.ActionButtonsContentView.ThemedContent.<anonymous>.<anonymous>.<anonymous> (ActionButtonsContentView.kt:77)");
                    }
                    boolean J = aVar.J(izsVar);
                    Object x = aVar.x();
                    if (J || x == a.C0011a.a) {
                        x = new uw(izsVar, 0);
                        aVar.R(x);
                    }
                    kxVar.i(ryVar, (izs) x, ahn.E(q630.a.a, "ActionButtonsSaveButton"), aVar, 4480);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 1:
                lat latVar = (lat) this.d;
                xet xetVar = (xet) this.e;
                izs<? super o9t, s3q0> izsVar2 = (izs) this.c;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(262281925, intValue2, -1, "com.vk.games.presentation.catalog.view.GamesCatalogContentView.ThemedContent.<anonymous> (GamesCatalogContentView.kt:35)");
                    }
                    latVar.h(xetVar, izsVar2, aVar2, 512);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                qd10.a((ld10) this.d, (gzs) this.e, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((cic0) this.d).h((wpc0) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ hx(i6v0 i6v0Var, Object obj, izs izsVar, int i) {
        this.b = i;
        this.d = i6v0Var;
        this.e = obj;
        this.c = izsVar;
    }
}
