package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.kjz;
import java.util.Arrays;

/* loaded from: classes11.dex */
public class StreetViewPanoramaLink extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaLink> CREATOR = new zzo();
    public final float bearing;
    public final String panoId;

    public StreetViewPanoramaLink(String str, float f) {
        this.panoId = str;
        this.bearing = (((double) f) <= 0.0d ? (f % 360.0f) + 360.0f : f) % 360.0f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaLink)) {
            return false;
        }
        StreetViewPanoramaLink streetViewPanoramaLink = (StreetViewPanoramaLink) obj;
        return this.panoId.equals(streetViewPanoramaLink.panoId) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(streetViewPanoramaLink.bearing);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.panoId, Float.valueOf(this.bearing)});
    }

    public String toString() {
        kjz kjzVar = new kjz(this);
        kjzVar.b(this.panoId, "panoId");
        kjzVar.b(Float.valueOf(this.bearing), "bearing");
        return kjzVar.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.g0(parcel, 2, this.panoId, false);
        float f = this.bearing;
        bb1.m0(3, parcel, 4);
        parcel.writeFloat(f);
        bb1.o0(parcel, n0);
    }
}
