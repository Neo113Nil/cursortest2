package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.cvw;
import defpackage.kjz;
import java.util.Arrays;

/* loaded from: classes11.dex */
public class StreetViewPanoramaOrientation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaOrientation> CREATOR = new zzq();
    public final float bearing;
    public final float tilt;

    public static final class a {
        public float a;
        public float b;
    }

    public StreetViewPanoramaOrientation(float f, float f2) {
        boolean z = false;
        if (f >= -90.0f && f <= 90.0f) {
            z = true;
        }
        StringBuilder sb = new StringBuilder(62);
        sb.append("Tilt needs to be between -90 and 90 inclusive: ");
        sb.append(f);
        cvw.d(sb.toString(), z);
        this.tilt = f + 0.0f;
        this.bearing = (((double) f2) <= 0.0d ? (f2 % 360.0f) + 360.0f : f2) % 360.0f;
    }

    public static a builder(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        a aVar = new a();
        cvw.m(streetViewPanoramaOrientation, "StreetViewPanoramaOrientation must not be null.");
        aVar.a = streetViewPanoramaOrientation.bearing;
        aVar.b = streetViewPanoramaOrientation.tilt;
        return aVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaOrientation)) {
            return false;
        }
        StreetViewPanoramaOrientation streetViewPanoramaOrientation = (StreetViewPanoramaOrientation) obj;
        return Float.floatToIntBits(this.tilt) == Float.floatToIntBits(streetViewPanoramaOrientation.tilt) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(streetViewPanoramaOrientation.bearing);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.tilt), Float.valueOf(this.bearing)});
    }

    public String toString() {
        kjz kjzVar = new kjz(this);
        kjzVar.b(Float.valueOf(this.tilt), "tilt");
        kjzVar.b(Float.valueOf(this.bearing), "bearing");
        return kjzVar.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        float f = this.tilt;
        bb1.m0(2, parcel, 4);
        parcel.writeFloat(f);
        float f2 = this.bearing;
        bb1.m0(3, parcel, 4);
        parcel.writeFloat(f2);
        bb1.o0(parcel, n0);
    }

    public static a builder() {
        return new a();
    }
}
