package xsna;

import android.view.View;
import com.vk.content.design.view.camera.CameraUIView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class dn9 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ CameraUIView c;

    public /* synthetic */ dn9(CameraUIView cameraUIView, int i) {
        this.b = i;
        this.c = cameraUIView;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        CameraUIView cameraUIView = this.c;
        switch (i) {
            case 0:
                View view = cameraUIView.k0;
                if (view != null) {
                    view.requestLayout();
                }
                break;
            default:
                float f = CameraUIView.w1;
                cameraUIView.v0();
                break;
        }
        return s3q0.a;
    }
}
