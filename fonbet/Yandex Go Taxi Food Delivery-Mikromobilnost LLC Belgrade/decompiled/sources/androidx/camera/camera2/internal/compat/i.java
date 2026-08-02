package androidx.camera.camera2.internal.compat;

/* loaded from: classes10.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CameraManagerCompat$AvailabilityCallbackExecutorWrapper b;
    public final /* synthetic */ String c;

    public /* synthetic */ i(CameraManagerCompat$AvailabilityCallbackExecutorWrapper cameraManagerCompat$AvailabilityCallbackExecutorWrapper, String str, int i) {
        this.a = i;
        this.b = cameraManagerCompat$AvailabilityCallbackExecutorWrapper;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        String str = this.c;
        CameraManagerCompat$AvailabilityCallbackExecutorWrapper cameraManagerCompat$AvailabilityCallbackExecutorWrapper = this.b;
        switch (i) {
            case 0:
                cameraManagerCompat$AvailabilityCallbackExecutorWrapper.lambda$onCameraAvailable$1(str);
                break;
            default:
                cameraManagerCompat$AvailabilityCallbackExecutorWrapper.lambda$onCameraUnavailable$2(str);
                break;
        }
    }
}
