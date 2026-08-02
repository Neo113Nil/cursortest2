package xsna;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import com.vk.superapp.browser.internal.utils.FlashlightUtils;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class xnr implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ xnr(boolean z, int i) {
        this.b = i;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                if (!((Boolean) obj).booleanValue()) {
                    return io.reactivex.rxjava3.core.x.k(FlashlightUtils.EnableFlashlightResult.NO_PERMISSIONS);
                }
                final boolean z = this.c;
                return io.reactivex.rxjava3.core.a.l(new io.reactivex.rxjava3.functions.a() { // from class: xsna.ynr
                    @Override // io.reactivex.rxjava3.functions.a
                    public final void run() {
                        io.reactivex.rxjava3.core.w wVar = FlashlightUtils.a;
                        if (z) {
                            Camera camera = FlashlightUtils.b;
                            if (camera != null ? epx.f(camera.getParameters().getFlashMode(), "torch") : false) {
                                return;
                            }
                            FlashlightUtils.a();
                            Camera camera2 = FlashlightUtils.b;
                            if (camera2 == null) {
                                throw new Exception();
                            }
                            Camera.Parameters parameters = camera2.getParameters();
                            parameters.setFlashMode("torch");
                            camera2.setParameters(parameters);
                            return;
                        }
                        if (FlashlightUtils.b == null) {
                            FlashlightUtils.a();
                        }
                        Camera camera3 = FlashlightUtils.b;
                        if (camera3 == null) {
                            throw new Exception();
                        }
                        Camera.Parameters parameters2 = camera3.getParameters();
                        parameters2.setFlashMode("off");
                        camera3.setParameters(parameters2);
                        Camera camera4 = FlashlightUtils.b;
                        if (camera4 != null) {
                            camera4.stopPreview();
                        }
                        Camera camera5 = FlashlightUtils.b;
                        if (camera5 != null) {
                            camera5.release();
                        }
                        FlashlightUtils.b = null;
                        SurfaceTexture surfaceTexture = FlashlightUtils.c;
                        if (surfaceTexture != null) {
                            surfaceTexture.release();
                        }
                        FlashlightUtils.c = null;
                    }
                }).q(FlashlightUtils.a).e(io.reactivex.rxjava3.core.x.k(FlashlightUtils.EnableFlashlightResult.SUCCESS));
            default:
                bn40.c((Throwable) obj, new Object[0]);
                if (this.c) {
                    cvk.u(R.string.common_network_error, false);
                }
                return s3q0.a;
        }
    }
}
