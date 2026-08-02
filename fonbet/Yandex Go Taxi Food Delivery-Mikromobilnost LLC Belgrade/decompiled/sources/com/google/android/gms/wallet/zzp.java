package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zzp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        ArrayList arrayList = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        boolean z = false;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    arrayList = cma1.x(parcel, readInt);
                    break;
                case 3:
                default:
                    cma1.A0(parcel, readInt);
                    break;
                case 4:
                    str = cma1.z(parcel, readInt);
                    break;
                case 5:
                    str2 = cma1.z(parcel, readInt);
                    break;
                case 6:
                    arrayList2 = cma1.x(parcel, readInt);
                    break;
                case 7:
                    z = cma1.k0(parcel, readInt);
                    break;
                case '\b':
                    str3 = cma1.z(parcel, readInt);
                    break;
            }
        }
        cma1.E(parcel, P0);
        return new IsReadyToPayRequest(arrayList, str, str2, arrayList2, z, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new IsReadyToPayRequest[i];
    }
}
