package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes11.dex */
public final class LocationSettingsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationSettingsRequest> CREATOR = new zzah();
    private final List zza;
    private final boolean zzb;
    private final boolean zzc;

    public static final class a {
        public final ArrayList a = new ArrayList();
        public boolean b = false;

        public final void a(LocationRequest locationRequest) {
            if (locationRequest != null) {
                this.a.add(locationRequest);
            }
        }

        public final LocationSettingsRequest b() {
            return new LocationSettingsRequest(this.a, this.b, false);
        }

        public final void c() {
            this.b = true;
        }
    }

    public LocationSettingsRequest(List list, boolean z, boolean z2) {
        this.zza = list;
        this.zzb = z;
        this.zzc = z2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        List list = this.zza;
        int n0 = bb1.n0(parcel, 20293);
        bb1.k0(parcel, 1, Collections.unmodifiableList(list), false);
        boolean z = this.zzb;
        bb1.m0(2, parcel, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.zzc;
        bb1.m0(3, parcel, 4);
        parcel.writeInt(z2 ? 1 : 0);
        bb1.o0(parcel, n0);
    }
}
