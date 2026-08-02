package xsna;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.annotation.NonNull;
import androidx.camera.core.CameraControl$OperationCanceledException;
import xsna.if9;
import xsna.p6y0;
import xsna.ub9;

/* compiled from: CropRegionZoomImpl.java */
/* loaded from: classes11.dex */
public final class cik implements p6y0.b {
    public final tg9 a;
    public ub9.a<Void> c;
    public Rect b = null;
    public Rect d = null;

    public cik(@NonNull tg9 tg9Var) {
        this.a = tg9Var;
    }

    @Override // xsna.p6y0.b
    public final void a(@NonNull TotalCaptureResult totalCaptureResult) {
        if (this.c != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Rect rect = request == null ? null : (Rect) request.get(CaptureRequest.SCALER_CROP_REGION);
            Rect rect2 = this.d;
            if (rect2 == null || !rect2.equals(rect)) {
                return;
            }
            this.c.b(null);
            this.c = null;
            this.d = null;
        }
    }

    @Override // xsna.p6y0.b
    public final float b() {
        return 1.0f;
    }

    @Override // xsna.p6y0.b
    public final float c() {
        Float f = (Float) this.a.a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f == null) {
            return 1.0f;
        }
        return f.floatValue();
    }

    @Override // xsna.p6y0.b
    public final void d() {
        this.d = null;
        this.b = null;
        ub9.a<Void> aVar = this.c;
        if (aVar != null) {
            aVar.d(new CameraControl$OperationCanceledException("Camera is not active."));
            this.c = null;
        }
    }

    @Override // xsna.p6y0.b
    @NonNull
    public final Rect e() {
        Rect rect = this.b;
        if (rect != null) {
            return rect;
        }
        Rect rect2 = (Rect) this.a.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect2.getClass();
        return rect2;
    }

    @Override // xsna.p6y0.b
    public final void f(@NonNull if9.a aVar) {
        Rect rect = this.b;
        if (rect != null) {
            aVar.a(CaptureRequest.SCALER_CROP_REGION, rect);
        }
    }

    @Override // xsna.p6y0.b
    public final void g(float f, @NonNull ub9.a<Void> aVar) {
        ((Rect) this.a.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE)).getClass();
        float width = r0.width() / f;
        float height = r0.height() / f;
        float width2 = (r0.width() - width) / 2.0f;
        float height2 = (r0.height() - height) / 2.0f;
        this.b = new Rect((int) width2, (int) height2, (int) (width2 + width), (int) (height2 + height));
        ub9.a<Void> aVar2 = this.c;
        if (aVar2 != null) {
            aVar2.d(new CameraControl$OperationCanceledException("There is a new zoomRatio being set"));
        }
        this.d = this.b;
        this.c = aVar;
    }
}
