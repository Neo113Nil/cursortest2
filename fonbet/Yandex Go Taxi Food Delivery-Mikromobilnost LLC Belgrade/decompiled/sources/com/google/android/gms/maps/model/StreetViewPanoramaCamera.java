package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import defpackage.bb1;
import defpackage.cvw;
import defpackage.kjz;
import java.util.Arrays;

/* loaded from: classes11.dex */
public class StreetViewPanoramaCamera extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaCamera> CREATOR = new zzn();
    public final float bearing;
    public final float tilt;
    public final float zoom;
    private final StreetViewPanoramaOrientation zza;

    public static final class a {
    }

    public StreetViewPanoramaCamera(float f, float f2, float f3) {
        boolean z = false;
        if (f2 >= -90.0f && f2 <= 90.0f) {
            z = true;
        }
        StringBuilder sb = new StringBuilder(62);
        sb.append("Tilt needs to be between -90 and 90 inclusive: ");
        sb.append(f2);
        cvw.d(sb.toString(), z);
        this.zoom = ((double) f) <= 0.0d ? 0.0f : f;
        this.tilt = 0.0f + f2;
        this.bearing = (((double) f3) <= 0.0d ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
        StreetViewPanoramaOrientation.a aVar = new StreetViewPanoramaOrientation.a();
        aVar.b = f2;
        aVar.a = f3;
        this.zza = new StreetViewPanoramaOrientation(aVar.b, aVar.a);
    }

    public static a builder(StreetViewPanoramaCamera streetViewPanoramaCamera) {
        a aVar = new a();
        cvw.m(streetViewPanoramaCamera, "StreetViewPanoramaCamera must not be null.");
        return aVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaCamera)) {
            return false;
        }
        StreetViewPanoramaCamera streetViewPanoramaCamera = (StreetViewPanoramaCamera) obj;
        return Float.floatToIntBits(this.zoom) == Float.floatToIntBits(streetViewPanoramaCamera.zoom) && Float.floatToIntBits(this.tilt) == Float.floatToIntBits(streetViewPanoramaCamera.tilt) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(streetViewPanoramaCamera.bearing);
    }

    public StreetViewPanoramaOrientation getOrientation() {
        return this.zza;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.zoom), Float.valueOf(this.tilt), Float.valueOf(this.bearing)});
    }

    public String toString() {
        kjz kjzVar = new kjz(this);
        kjzVar.b(Float.valueOf(this.zoom), "zoom");
        kjzVar.b(Float.valueOf(this.tilt), "tilt");
        kjzVar.b(Float.valueOf(this.bearing), "bearing");
        return kjzVar.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        float f = this.zoom;
        bb1.m0(2, parcel, 4);
        parcel.writeFloat(f);
        float f2 = this.tilt;
        bb1.m0(3, parcel, 4);
        parcel.writeFloat(f2);
        float f3 = this.bearing;
        bb1.m0(4, parcel, 4);
        parcel.writeFloat(f3);
        bb1.o0(parcel, n0);
    }

    public static a builder() {
        return new a();
    }
}
