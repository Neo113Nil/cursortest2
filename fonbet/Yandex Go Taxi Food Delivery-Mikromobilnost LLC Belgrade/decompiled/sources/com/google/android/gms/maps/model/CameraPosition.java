package com.google.android.gms.maps.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.GoogleMapOptions;
import defpackage.bb1;
import defpackage.cvw;
import defpackage.kjz;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class CameraPosition extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CameraPosition> CREATOR = new zza();
    public final float bearing;
    public final LatLng target;
    public final float tilt;
    public final float zoom;

    public static final class a {
        public LatLng a;
        public float b;
        public float c;
        public float d;
    }

    public CameraPosition(LatLng latLng, float f, float f2, float f3) {
        cvw.m(latLng, "camera target must not be null.");
        boolean z = false;
        if (f2 >= 0.0f && f2 <= 90.0f) {
            z = true;
        }
        cvw.f(z, "Tilt needs to be between 0 and 90 inclusive: %s", Float.valueOf(f2));
        this.target = latLng;
        this.zoom = f;
        this.tilt = f2 + 0.0f;
        this.bearing = (((double) f3) <= 0.0d ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
    }

    public static a builder(CameraPosition cameraPosition) {
        a aVar = new a();
        cvw.m(cameraPosition, "previous must not be null.");
        aVar.a = cameraPosition.target;
        aVar.b = cameraPosition.zoom;
        aVar.c = cameraPosition.tilt;
        aVar.d = cameraPosition.bearing;
        return aVar;
    }

    public static CameraPosition createFromAttributes(Context context, AttributeSet attributeSet) {
        return GoogleMapOptions.zza(context, attributeSet);
    }

    public static final CameraPosition fromLatLngZoom(LatLng latLng, float f) {
        return new CameraPosition(latLng, f, 0.0f, 0.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.target.equals(cameraPosition.target) && Float.floatToIntBits(this.zoom) == Float.floatToIntBits(cameraPosition.zoom) && Float.floatToIntBits(this.tilt) == Float.floatToIntBits(cameraPosition.tilt) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(cameraPosition.bearing);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.target, Float.valueOf(this.zoom), Float.valueOf(this.tilt), Float.valueOf(this.bearing)});
    }

    public String toString() {
        kjz kjzVar = new kjz(this);
        kjzVar.b(this.target, "target");
        kjzVar.b(Float.valueOf(this.zoom), "zoom");
        kjzVar.b(Float.valueOf(this.tilt), "tilt");
        kjzVar.b(Float.valueOf(this.bearing), "bearing");
        return kjzVar.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.f0(parcel, 2, this.target, i, false);
        float f = this.zoom;
        bb1.m0(3, parcel, 4);
        parcel.writeFloat(f);
        float f2 = this.tilt;
        bb1.m0(4, parcel, 4);
        parcel.writeFloat(f2);
        float f3 = this.bearing;
        bb1.m0(5, parcel, 4);
        parcel.writeFloat(f3);
        bb1.o0(parcel, n0);
    }

    public static a builder() {
        return new a();
    }
}
