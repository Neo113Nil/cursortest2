package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import defpackage.cma1;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class zzb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        ArrayList arrayList6 = arrayList3;
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        int i = 0;
        boolean z = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        TimeInterval timeInterval = null;
        String str9 = null;
        String str10 = null;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = cma1.z(parcel, readInt);
                    break;
                case 3:
                    str2 = cma1.z(parcel, readInt);
                    break;
                case 4:
                    str3 = cma1.z(parcel, readInt);
                    break;
                case 5:
                    str4 = cma1.z(parcel, readInt);
                    break;
                case 6:
                    str5 = cma1.z(parcel, readInt);
                    break;
                case 7:
                    str6 = cma1.z(parcel, readInt);
                    break;
                case '\b':
                    str7 = cma1.z(parcel, readInt);
                    break;
                case '\t':
                    str8 = cma1.z(parcel, readInt);
                    break;
                case '\n':
                    i = cma1.r0(parcel, readInt);
                    break;
                case 11:
                    arrayList4 = cma1.D(parcel, readInt, WalletObjectMessage.CREATOR);
                    break;
                case '\f':
                    timeInterval = (TimeInterval) cma1.y(parcel, readInt, TimeInterval.CREATOR);
                    break;
                case '\r':
                    arrayList5 = cma1.D(parcel, readInt, LatLng.CREATOR);
                    break;
                case 14:
                    str9 = cma1.z(parcel, readInt);
                    break;
                case 15:
                    str10 = cma1.z(parcel, readInt);
                    break;
                case 16:
                    arrayList6 = cma1.D(parcel, readInt, LabelValueRow.CREATOR);
                    break;
                case 17:
                    z = cma1.k0(parcel, readInt);
                    break;
                case 18:
                    arrayList7 = cma1.D(parcel, readInt, UriData.CREATOR);
                    break;
                case 19:
                    arrayList8 = cma1.D(parcel, readInt, TextModuleData.CREATOR);
                    break;
                case 20:
                    arrayList9 = cma1.D(parcel, readInt, UriData.CREATOR);
                    break;
                default:
                    cma1.A0(parcel, readInt);
                    break;
            }
        }
        cma1.E(parcel, P0);
        return new CommonWalletObject(str, str2, str3, str4, str5, str6, str7, str8, i, arrayList4, timeInterval, arrayList5, str9, str10, arrayList6, z, arrayList7, arrayList8, arrayList9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CommonWalletObject[i];
    }
}
