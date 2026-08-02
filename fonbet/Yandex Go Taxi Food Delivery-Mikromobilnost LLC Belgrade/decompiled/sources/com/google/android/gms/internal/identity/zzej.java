package com.google.android.gms.internal.identity;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzej implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        zzeg zzegVar = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        PendingIntent pendingIntent = null;
        IBinder iBinder3 = null;
        String str = null;
        int i = 1;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = cma1.r0(parcel, readInt);
                    break;
                case 2:
                    zzegVar = (zzeg) cma1.y(parcel, readInt, zzeg.CREATOR);
                    break;
                case 3:
                    iBinder = cma1.q0(parcel, readInt);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) cma1.y(parcel, readInt, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinder2 = cma1.q0(parcel, readInt);
                    break;
                case 6:
                    iBinder3 = cma1.q0(parcel, readInt);
                    break;
                case 7:
                default:
                    cma1.A0(parcel, readInt);
                    break;
                case '\b':
                    str = cma1.z(parcel, readInt);
                    break;
            }
        }
        cma1.E(parcel, P0);
        return new zzei(i, zzegVar, iBinder, iBinder2, pendingIntent, iBinder3, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzei[i];
    }
}
