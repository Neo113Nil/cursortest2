package defpackage;

import com.yandex.go.ui.CameraModalView;

/* loaded from: classes14.dex */
public final /* synthetic */ class or7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CameraModalView b;

    public /* synthetic */ or7(CameraModalView cameraModalView, int i) {
        this.a = i;
        this.b = cameraModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        CameraModalView cameraModalView = this.b;
        switch (i) {
            case 0:
                cameraModalView.onBackPressed();
                break;
            case 1:
                cameraModalView.showCamera();
                break;
            case 2:
                cameraModalView.takeAndShowPreviewPhoto();
                break;
            case 3:
                CameraModalView.showCamera$lambda$0(cameraModalView);
                break;
            default:
                cameraModalView.takeAndShowPreviewPhoto();
                break;
        }
    }
}
