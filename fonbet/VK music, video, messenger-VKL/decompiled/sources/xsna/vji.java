package xsna;

import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class vji implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ vji(int i) {
        this.b = i;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1682586538, intValue, -1, "com.vk.ecomm.storefront.impl.community.presentation.ui.productmanagement.ComposableSingletons$ProductsManagementBannerKt.lambda$-1682586538.<anonymous> (ProductsManagementBanner.kt:44)");
                    }
                    rsd0.b(null, aVar, 0);
                    if (a690.d(q630.a.a, 8, aVar, 6)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1202428765, intValue2, -1, "com.vk.core.compose.utils.swipable.ComposableSingletons$SwipeToDismissKt.lambda$-1202428765.<anonymous> (SwipeToDismiss.kt:234)");
                    }
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
