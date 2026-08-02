package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class vbi implements zzs {
    public final /* synthetic */ int b;

    public /* synthetic */ vbi(int i) {
        this.b = i;
    }

    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        z37 z37Var = (z37) obj;
        switch (this.b) {
            case 0:
                et7 et7Var = (et7) obj2;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
                int intValue = ((Integer) obj4).intValue();
                if ((intValue & 6) == 0) {
                    i = (aVar.J(z37Var) ? 4 : 2) | intValue;
                } else {
                    i = intValue;
                }
                if ((intValue & 48) == 0) {
                    i |= aVar.J(et7Var) ? 32 : 16;
                }
                if (aVar.t(i & 1, (i & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-687683584, i, -1, "com.vk.ecomm.onlinebooking.impl.preloader.ui.compose.ComposableSingletons$BookingPreloaderScreenKt.lambda$-687683584.<anonymous> (BookingPreloaderScreen.kt:45)");
                    }
                    emi.e.g(6, aVar, kai.c(-1140660446, new wbi(0, et7Var, z37Var), aVar));
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                sx80 sx80Var = (sx80) obj2;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i2 = (aVar2.J(z37Var) ? 4 : 2) | intValue2;
                } else {
                    i2 = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i2 |= aVar2.J(sx80Var) ? 32 : 16;
                }
                if (aVar2.t(i2 & 1, (i2 & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-2093604808, i2, -1, "com.vk.ecomm.orders.impl.order.presentation.compose.ComposableSingletons$OrderScreenKt.lambda$-2093604808.<anonymous> (OrderScreen.kt:52)");
                    }
                    emi.e.g(6, aVar2, kai.c(-1901715882, new wbi(1, sx80Var, z37Var), aVar2));
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
