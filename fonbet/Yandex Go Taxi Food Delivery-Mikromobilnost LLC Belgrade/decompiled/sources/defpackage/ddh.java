package defpackage;

import android.view.ViewGroup;
import ru.yandex.taxi.camera.CameraPreview;
import ru.yandex.taxi.widget.ShimmeringFrameLayout;

/* loaded from: classes6.dex */
public final /* synthetic */ class ddh implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ gdh b;

    public /* synthetic */ ddh(gdh gdhVar, int i) {
        this.a = i;
        this.b = gdhVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        gdh gdhVar = this.b;
        switch (i) {
            case 0:
                CameraPreview cameraPreview = new CameraPreview(gdhVar.k, null, 0, 0, 14, null);
                cameraPreview.setBackgroundColor(cameraPreview.getContext().getColor(mqg0.component_fog_light));
                return cameraPreview;
            case 1:
                ShimmeringFrameLayout shimmeringFrameLayout = new ShimmeringFrameLayout(gdhVar.k, null, 0, 6, null);
                shimmeringFrameLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
                shimmeringFrameLayout.addView(gdhVar.j());
                return shimmeringFrameLayout;
            default:
                return gdhVar.j().getPreviewViewOutputTransform();
        }
    }
}
