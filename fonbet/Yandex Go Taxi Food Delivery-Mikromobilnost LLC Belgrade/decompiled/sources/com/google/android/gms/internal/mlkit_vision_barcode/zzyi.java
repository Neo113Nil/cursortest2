package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzyi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = cma1.z(parcel, readInt);
                    break;
                case 2:
                    str2 = cma1.z(parcel, readInt);
                    break;
                case 3:
                    str3 = cma1.z(parcel, readInt);
                    break;
                case 4:
                    str4 = cma1.z(parcel, readInt);
                    break;
                case 5:
                    str5 = cma1.z(parcel, readInt);
                    break;
                case 6:
                    str6 = cma1.z(parcel, readInt);
                    break;
                case 7:
                    str7 = cma1.z(parcel, readInt);
                    break;
                case '\b':
                    str8 = cma1.z(parcel, readInt);
                    break;
                case '\t':
                    str9 = cma1.z(parcel, readInt);
                    break;
                case '\n':
                    str10 = cma1.z(parcel, readInt);
                    break;
                case 11:
                    str11 = cma1.z(parcel, readInt);
                    break;
                case '\f':
                    str12 = cma1.z(parcel, readInt);
                    break;
                case '\r':
                    str13 = cma1.z(parcel, readInt);
                    break;
                case 14:
                    str14 = cma1.z(parcel, readInt);
                    break;
                default:
                    cma1.A0(parcel, readInt);
                    break;
            }
        }
        cma1.E(parcel, P0);
        return new zzxt(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzxt[i];
    }
}
