package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class wnd implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ jai c;

    public /* synthetic */ wnd(int i, jai jaiVar) {
        this.b = i;
        this.c = jaiVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-761468116, intValue, -1, "com.vk.clips.compose.ClipsComposeThemeProvider.Theme.<anonymous>.<anonymous> (ClipsComposeThemeProvider.kt:27)");
                    }
                    if (cq.i(0, aVar, this.c)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1238969225, intValue, -1, "com.vk.video.ui.upload.impl.coverchoose.presentation.compose.CoverChooseComposeComponent.Theme.<anonymous> (CoverChooseComposeComponent.kt:45)");
                    }
                    if (cq.i(0, aVar, this.c)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
        }
        return s3q0.a;
    }
}
