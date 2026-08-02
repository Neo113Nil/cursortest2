package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.server.response.FastJsonResponse;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zaj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        String str = null;
        String str2 = null;
        zaa zaaVar = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        int i4 = 0;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = cma1.r0(parcel, readInt);
                    break;
                case 2:
                    i2 = cma1.r0(parcel, readInt);
                    break;
                case 3:
                    z = cma1.k0(parcel, readInt);
                    break;
                case 4:
                    i3 = cma1.r0(parcel, readInt);
                    break;
                case 5:
                    z2 = cma1.k0(parcel, readInt);
                    break;
                case 6:
                    str = cma1.z(parcel, readInt);
                    break;
                case 7:
                    i4 = cma1.r0(parcel, readInt);
                    break;
                case '\b':
                    str2 = cma1.z(parcel, readInt);
                    break;
                case '\t':
                    zaaVar = (zaa) cma1.y(parcel, readInt, zaa.CREATOR);
                    break;
                default:
                    cma1.A0(parcel, readInt);
                    break;
            }
        }
        cma1.E(parcel, P0);
        return new FastJsonResponse.Field(i, i2, z, i3, z2, str, i4, str2, zaaVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new FastJsonResponse.Field[i];
    }
}
