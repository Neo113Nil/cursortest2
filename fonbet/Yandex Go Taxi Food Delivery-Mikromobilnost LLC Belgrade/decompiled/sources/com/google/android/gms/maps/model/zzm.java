package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class zzm implements Parcelable.Creator<PolylineOptions> {
    @Override // android.os.Parcelable.Creator
    public final PolylineOptions createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        ArrayList arrayList = null;
        Cap cap = null;
        Cap cap2 = null;
        ArrayList arrayList2 = null;
        float f = 0.0f;
        float f2 = 0.0f;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    arrayList = cma1.D(parcel, readInt, LatLng.CREATOR);
                    break;
                case 3:
                    f = cma1.o0(parcel, readInt);
                    break;
                case 4:
                    i = cma1.r0(parcel, readInt);
                    break;
                case 5:
                    f2 = cma1.o0(parcel, readInt);
                    break;
                case 6:
                    z = cma1.k0(parcel, readInt);
                    break;
                case 7:
                    z2 = cma1.k0(parcel, readInt);
                    break;
                case '\b':
                    z3 = cma1.k0(parcel, readInt);
                    break;
                case '\t':
                    cap = (Cap) cma1.y(parcel, readInt, Cap.CREATOR);
                    break;
                case '\n':
                    cap2 = (Cap) cma1.y(parcel, readInt, Cap.CREATOR);
                    break;
                case 11:
                    i2 = cma1.r0(parcel, readInt);
                    break;
                case '\f':
                    arrayList2 = cma1.D(parcel, readInt, PatternItem.CREATOR);
                    break;
                default:
                    cma1.A0(parcel, readInt);
                    break;
            }
        }
        cma1.E(parcel, P0);
        return new PolylineOptions(arrayList, f, i, f2, z, z2, z3, cap, cap2, i2, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PolylineOptions[] newArray(int i) {
        return new PolylineOptions[i];
    }
}
