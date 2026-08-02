package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class zzl implements Parcelable.Creator<PolygonOptions> {
    @Override // android.os.Parcelable.Creator
    public final PolygonOptions createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = null;
        float f = 0.0f;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i3 = 0;
        ArrayList arrayList3 = null;
        float f2 = 0.0f;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    arrayList3 = cma1.D(parcel, readInt, LatLng.CREATOR);
                    break;
                case 3:
                    ClassLoader classLoader = zzl.class.getClassLoader();
                    int w0 = cma1.w0(parcel, readInt);
                    int dataPosition = parcel.dataPosition();
                    if (w0 != 0) {
                        parcel.readList(arrayList, classLoader);
                        parcel.setDataPosition(dataPosition + w0);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    f2 = cma1.o0(parcel, readInt);
                    break;
                case 5:
                    i = cma1.r0(parcel, readInt);
                    break;
                case 6:
                    i2 = cma1.r0(parcel, readInt);
                    break;
                case 7:
                    f = cma1.o0(parcel, readInt);
                    break;
                case '\b':
                    z = cma1.k0(parcel, readInt);
                    break;
                case '\t':
                    z2 = cma1.k0(parcel, readInt);
                    break;
                case '\n':
                    z3 = cma1.k0(parcel, readInt);
                    break;
                case 11:
                    i3 = cma1.r0(parcel, readInt);
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
        return new PolygonOptions(arrayList3, arrayList, f2, i, i2, f, z, z2, z3, i3, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PolygonOptions[] newArray(int i) {
        return new PolygonOptions[i];
    }
}
