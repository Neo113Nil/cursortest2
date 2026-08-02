package com.google.android.gms.internal.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.location.DeviceOrientationRequest;
import defpackage.cma1;
import java.util.List;

/* loaded from: classes11.dex */
public final class zzi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        DeviceOrientationRequest deviceOrientationRequest = zzh.zzb;
        List list = zzh.zza;
        String str = null;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                deviceOrientationRequest = (DeviceOrientationRequest) cma1.y(parcel, readInt, DeviceOrientationRequest.CREATOR);
            } else if (c == 2) {
                list = cma1.D(parcel, readInt, ClientIdentity.CREATOR);
            } else if (c != 3) {
                cma1.A0(parcel, readInt);
            } else {
                str = cma1.z(parcel, readInt);
            }
        }
        cma1.E(parcel, P0);
        return new zzh(deviceOrientationRequest, list, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzh[i];
    }
}
