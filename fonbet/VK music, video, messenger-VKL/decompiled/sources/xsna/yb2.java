package xsna;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import androidx.annotation.NonNull;
import androidx.camera.core.CameraControl$OperationCanceledException;
import xsna.if9;
import xsna.p6y0;
import xsna.ub9;

/* compiled from: AndroidRZoomImpl.java */
/* loaded from: classes11.dex */
public final class yb2 implements p6y0.b {
    public final tg9 a;
    public final Range<Float> b;
    public ub9.a<Void> d;
    public float c = 1.0f;
    public float e = 1.0f;

    public yb2(@NonNull tg9 tg9Var) {
        CameraCharacteristics.Key key;
        this.a = tg9Var;
        key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
        this.b = (Range) tg9Var.a(key);
    }

    @Override // xsna.p6y0.b
    public final void a(@NonNull TotalCaptureResult totalCaptureResult) {
        CaptureResult.Key key;
        if (this.d != null) {
            key = CaptureResult.CONTROL_ZOOM_RATIO;
            Float f = (Float) totalCaptureResult.get(key);
            if (f == null) {
                return;
            }
            if (this.e == f.floatValue()) {
                this.d.b(null);
                this.d = null;
            }
        }
    }

    @Override // xsna.p6y0.b
    public final float b() {
        return this.b.getLower().floatValue();
    }

    @Override // xsna.p6y0.b
    public final float c() {
        return this.b.getUpper().floatValue();
    }

    @Override // xsna.p6y0.b
    public final void d() {
        this.c = 1.0f;
        ub9.a<Void> aVar = this.d;
        if (aVar != null) {
            aVar.d(new CameraControl$OperationCanceledException("Camera is not active."));
            this.d = null;
        }
    }

    @Override // xsna.p6y0.b
    @NonNull
    public final Rect e() {
        Rect rect = (Rect) this.a.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect.getClass();
        return rect;
    }

    @Override // xsna.p6y0.b
    public final void f(@NonNull if9.a aVar) {
        CaptureRequest.Key key;
        key = CaptureRequest.CONTROL_ZOOM_RATIO;
        aVar.a(key, Float.valueOf(this.c));
    }

    @Override // xsna.p6y0.b
    public final void g(float f, @NonNull ub9.a<Void> aVar) {
        this.c = f;
        ub9.a<Void> aVar2 = this.d;
        if (aVar2 != null) {
            aVar2.d(new CameraControl$OperationCanceledException("There is a new zoomRatio being set"));
        }
        this.e = this.c;
        this.d = aVar;
    }
}
