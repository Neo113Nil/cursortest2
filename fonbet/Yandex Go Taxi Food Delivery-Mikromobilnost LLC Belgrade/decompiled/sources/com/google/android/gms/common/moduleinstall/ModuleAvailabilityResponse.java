package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;

/* loaded from: classes11.dex */
public class ModuleAvailabilityResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ModuleAvailabilityResponse> CREATOR = new zaa();
    private final boolean zaa;
    private final int zab;

    public ModuleAvailabilityResponse(boolean z, int i) {
        this.zaa = z;
        this.zab = i;
    }

    public boolean areModulesAvailable() {
        return this.zaa;
    }

    public int getAvailabilityStatus() {
        return this.zab;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        boolean areModulesAvailable = areModulesAvailable();
        bb1.m0(1, parcel, 4);
        parcel.writeInt(areModulesAvailable ? 1 : 0);
        int availabilityStatus = getAvailabilityStatus();
        bb1.m0(2, parcel, 4);
        parcel.writeInt(availabilityStatus);
        bb1.o0(parcel, n0);
    }
}
