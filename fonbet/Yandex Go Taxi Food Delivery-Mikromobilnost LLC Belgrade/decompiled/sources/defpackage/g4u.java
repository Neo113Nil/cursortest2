package defpackage;

import com.yandex.go.walking.navigation.impl.guidance.interactor.k;
import com.yandex.mapkit.navigation.guidance_camera.Camera;
import com.yandex.mapkit.navigation.guidance_camera.CameraListener;
import com.yandex.mapkit.navigation.guidance_camera.CameraMode;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final /* synthetic */ class g4u implements CameraListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g4u(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.yandex.mapkit.navigation.guidance_camera.CameraListener
    public final void onCameraModeChanged() {
        CameraMode cameraMode;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                kmj kmjVar = (kmj) obj;
                kmjVar.c(new tzt(1, kmjVar));
                break;
            default:
                k kVar = (k) obj;
                Camera camera = kVar.h;
                if (camera != null && (cameraMode = camera.cameraMode()) != null) {
                    ist istVar = kVar.f;
                    cameraMode.toString();
                    istVar.getClass();
                    r0 r0Var = kVar.i;
                    r0Var.getClass();
                    r0Var.m(null, cameraMode);
                    break;
                }
                break;
        }
    }
}
