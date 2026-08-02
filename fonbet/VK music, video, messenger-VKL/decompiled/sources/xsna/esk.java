package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class esk implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ jai c;

    public /* synthetic */ esk(int i, jai jaiVar) {
        this.b = 2;
        this.c = jaiVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
        Integer num = (Integer) obj2;
        switch (this.b) {
            case 0:
                int intValue = num.intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1638668474, intValue, -1, "com.vk.core.view.theme.DarkComposeThemeProvider.Theme.<anonymous> (DarkComposeThemeProvider.kt:10)");
                    }
                    if (cq.i(0, aVar, this.c)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 1:
                int intValue2 = num.intValue();
                if (aVar.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1616723068, intValue2, -1, "com.vk.video.ui.share.impl.compose.VideoComposeThemeProvider.Theme.<anonymous>.<anonymous> (VideoComposeThemeProvider.kt:21)");
                    }
                    if (cq.i(0, aVar, this.c)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                num.getClass();
                mnx0.f(ne7.I(55), aVar, this.c);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ esk(jai jaiVar, int i, byte b) {
        this.b = i;
        this.c = jaiVar;
    }
}
