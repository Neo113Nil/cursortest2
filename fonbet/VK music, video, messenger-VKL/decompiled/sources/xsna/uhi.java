package xsna;

import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class uhi implements zzs {
    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Integer) obj2).intValue();
        androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
        int intValue2 = ((Integer) obj4).intValue();
        if ((intValue2 & 48) == 0) {
            intValue2 |= aVar.o(intValue) ? 32 : 16;
        }
        if (aVar.t(intValue2 & 1, (intValue2 & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1317930233, intValue2, -1, "com.vk.design.demo.presentation.screens.ComposableSingletons$ModalPageScreenContentKt.lambda$1317930233.<anonymous> (ModalPageScreenContent.kt:294)");
            }
            yqv0.c("Row " + (intValue + 1) + " — content scrolls under blurred bottom bar", s200.E(txj0.f(q630.a.a, 1.0f), kqu0.b, kqu0.c), 0L, null, null, 0, 0, null, 0, false, 0, 0, null, null, aVar, 0, 0, 16380);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar.h();
        }
        return s3q0.a;
    }
}
