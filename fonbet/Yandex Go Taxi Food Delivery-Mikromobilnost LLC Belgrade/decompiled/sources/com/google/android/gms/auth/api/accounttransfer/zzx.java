package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import defpackage.cma1;
import defpackage.oyr;
import java.util.HashSet;

/* loaded from: classes11.dex */
public final class zzx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        String str = null;
        byte[] bArr = null;
        PendingIntent pendingIntent = null;
        DeviceMetaData deviceMetaData = null;
        int i2 = 0;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = cma1.r0(parcel, readInt);
                    hashSet.add(1);
                    break;
                case 2:
                    str = cma1.z(parcel, readInt);
                    hashSet.add(2);
                    break;
                case 3:
                    i2 = cma1.r0(parcel, readInt);
                    hashSet.add(3);
                    break;
                case 4:
                    bArr = cma1.t(parcel, readInt);
                    hashSet.add(4);
                    break;
                case 5:
                    pendingIntent = (PendingIntent) cma1.y(parcel, readInt, PendingIntent.CREATOR);
                    hashSet.add(5);
                    break;
                case 6:
                    deviceMetaData = (DeviceMetaData) cma1.y(parcel, readInt, DeviceMetaData.CREATOR);
                    hashSet.add(6);
                    break;
                default:
                    cma1.A0(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == P0) {
            return new zzw(hashSet, i, str, i2, bArr, pendingIntent, deviceMetaData);
        }
        throw new SafeParcelReader$ParseException(oyr.i(P0, "Overread allowed size end="), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzw[i];
    }
}
