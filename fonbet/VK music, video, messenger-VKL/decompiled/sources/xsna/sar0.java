package xsna;

import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;

/* compiled from: VKCameraPosition.kt */
/* loaded from: classes3.dex */
public final class sar0 implements fk9 {
    public final CameraPosition a;

    public sar0(CameraPosition cameraPosition) {
        this.a = cameraPosition;
    }

    @Override // xsna.fk9
    public final float a() {
        return this.a.c;
    }

    public final CameraPosition b() {
        return this.a;
    }

    @Override // xsna.fk9
    public final edr0 getTarget() {
        LatLng latLng = this.a.b;
        return new edr0(latLng.b, latLng.c);
    }

    public sar0(edr0 edr0Var, float f, float f2, float f3) {
        this(new CameraPosition(new LatLng(edr0Var.a, edr0Var.b), f, f2, f3));
    }
}
