package xsna;

import com.vungle.ads.internal.protos.Sdk;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class shi implements zzs {
    public final /* synthetic */ int b;

    public /* synthetic */ shi(int i) {
        this.b = i;
    }

    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.b) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                if ((intValue2 & 48) == 0) {
                    intValue2 |= aVar.o(intValue) ? 32 : 16;
                }
                if (aVar.t(intValue2 & 1, (intValue2 & 145) != 144)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1305964696, intValue2, -1, "com.vk.design.demo.presentation.screens.ComposableSingletons$ModalPageScreenContentKt.lambda$1305964696.<anonymous> (ModalPageScreenContent.kt:236)");
                    }
                    yqv0.c("Row " + (intValue + 1) + " — scroll to expand to fullscreen", s200.E(txj0.f(q630.a.a, 1.0f), kqu0.b, kqu0.c), 0L, null, null, 0, 0, null, 0, false, 0, 0, null, null, aVar, 0, 0, 16380);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                jj jjVar = (jj) obj;
                ((Boolean) obj2).getClass();
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                int intValue3 = ((Integer) obj4).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= aVar2.J(jjVar) ? 4 : 2;
                }
                if (aVar2.t(intValue3 & 1, (intValue3 & Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) != 130)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1167625538, intValue3, -1, "com.vk.design.demo.presentation.screens.ComposableSingletons$TabsScreenContentKt.lambda$1167625538.<anonymous> (TabsScreenContent.kt:131)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) aVar2.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    jjVar.d("Accent", wuv0Var.P, aVar2, ((intValue3 << 6) & 896) | 6);
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
