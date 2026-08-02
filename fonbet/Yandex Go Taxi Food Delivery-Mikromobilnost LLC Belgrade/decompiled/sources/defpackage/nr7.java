package defpackage;

import android.view.View;
import com.yandex.go.ui.CameraModalView;

/* loaded from: classes14.dex */
public final /* synthetic */ class nr7 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ CameraModalView b;

    public /* synthetic */ nr7(CameraModalView cameraModalView, int i) {
        this.a = i;
        this.b = cameraModalView;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        w8v imageCapture_delegate$lambda$0;
        View insetsType$lambda$0;
        int i = this.a;
        CameraModalView cameraModalView = this.b;
        switch (i) {
            case 0:
                imageCapture_delegate$lambda$0 = CameraModalView.imageCapture_delegate$lambda$0(cameraModalView);
                return imageCapture_delegate$lambda$0;
            default:
                insetsType$lambda$0 = CameraModalView.insetsType$lambda$0(cameraModalView);
                return insetsType$lambda$0;
        }
    }
}
