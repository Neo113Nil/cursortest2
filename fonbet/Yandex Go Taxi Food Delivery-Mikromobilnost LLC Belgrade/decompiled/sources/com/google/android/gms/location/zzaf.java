package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.internal.identity.ClientIdentity;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzaf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        WorkSource workSource = new WorkSource();
        ClientIdentity clientIdentity = null;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        long j = -1;
        float f = 0.0f;
        int i3 = Integer.MAX_VALUE;
        long j2 = Long.MAX_VALUE;
        long j3 = Long.MAX_VALUE;
        long j4 = 0;
        long j5 = 600000;
        long j6 = 3600000;
        int i4 = 102;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i4 = cma1.r0(parcel, readInt);
                    break;
                case 2:
                    j6 = cma1.u0(parcel, readInt);
                    break;
                case 3:
                    j5 = cma1.u0(parcel, readInt);
                    break;
                case 4:
                case 14:
                default:
                    cma1.A0(parcel, readInt);
                    break;
                case 5:
                    j2 = cma1.u0(parcel, readInt);
                    break;
                case 6:
                    i3 = cma1.r0(parcel, readInt);
                    break;
                case 7:
                    f = cma1.o0(parcel, readInt);
                    break;
                case '\b':
                    j4 = cma1.u0(parcel, readInt);
                    break;
                case '\t':
                    z = cma1.k0(parcel, readInt);
                    break;
                case '\n':
                    j3 = cma1.u0(parcel, readInt);
                    break;
                case 11:
                    j = cma1.u0(parcel, readInt);
                    break;
                case '\f':
                    i = cma1.r0(parcel, readInt);
                    break;
                case '\r':
                    i2 = cma1.r0(parcel, readInt);
                    break;
                case 15:
                    z2 = cma1.k0(parcel, readInt);
                    break;
                case 16:
                    workSource = (WorkSource) cma1.y(parcel, readInt, WorkSource.CREATOR);
                    break;
                case 17:
                    clientIdentity = (ClientIdentity) cma1.y(parcel, readInt, ClientIdentity.CREATOR);
                    break;
            }
        }
        cma1.E(parcel, P0);
        return new LocationRequest(i4, j6, j5, j4, j2, j3, i3, f, z, j, i, i2, z2, workSource, clientIdentity);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationRequest[i];
    }
}
