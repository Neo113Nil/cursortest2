package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class g1j0 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ jai c;

    public /* synthetic */ g1j0(int i, jai jaiVar) {
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
                        androidx.compose.runtime.b.f(-806957310, intValue, -1, "com.vk.video.ui.upload.impl.settings.presentation.compose.SettingsComposeComponent.Theme.<anonymous> (SettingsComposeComponent.kt:43)");
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
                        androidx.compose.runtime.b.f(-2088035218, intValue, -1, "com.vk.video.ui.upload.impl.videoviewer.presentation.compose.VideoViewerComposeComponent.Theme.<anonymous> (VideoViewerComposeComponent.kt:43)");
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
