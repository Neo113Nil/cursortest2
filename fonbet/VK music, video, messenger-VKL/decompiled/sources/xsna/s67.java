package xsna;

import androidx.compose.runtime.a;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class s67 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ s67(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-321332253, intValue, -1, "com.vk.biometrics.lock.impl.presentation.base.mvi.onboarding.BiometricsLockOnboardingView.MainScreen.<anonymous> (BiometricsLockOnboardingView.kt:49)");
                    }
                    izs izsVar = this.c;
                    boolean J = aVar.J(izsVar);
                    Object x = aVar.x();
                    if (J || x == a.C0011a.a) {
                        x = new v67(izsVar, 0);
                        aVar.R(x);
                    }
                    b57.a((gzs) x, null, false, null, 0L, aVar, 0, 30);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1975305848, intValue2, -1, "com.vk.ecomm.shop_conditions.impl.ui.dovdialog.presentation.compose.MarketShopConditionsView.ThemedContent.<anonymous> (MarketShopConditionsView.kt:84)");
                    }
                    se10.b(6, aVar2, this.c, txj0.f(txj0.c(q630.a.a, 0.5f), 1.0f));
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
        }
        return s3q0.a;
    }
}
