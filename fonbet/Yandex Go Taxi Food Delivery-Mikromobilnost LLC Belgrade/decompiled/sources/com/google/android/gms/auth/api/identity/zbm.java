package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import defpackage.cma1;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class zbm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    z = cma1.k0(parcel, readInt);
                    break;
                case 2:
                    str = cma1.z(parcel, readInt);
                    break;
                case 3:
                    str2 = cma1.z(parcel, readInt);
                    break;
                case 4:
                    z2 = cma1.k0(parcel, readInt);
                    break;
                case 5:
                    str3 = cma1.z(parcel, readInt);
                    break;
                case 6:
                    arrayList = cma1.B(parcel, readInt);
                    break;
                case 7:
                    z3 = cma1.k0(parcel, readInt);
                    break;
                default:
                    cma1.A0(parcel, readInt);
                    break;
            }
        }
        cma1.E(parcel, P0);
        return new BeginSignInRequest.GoogleIdTokenRequestOptions(z, str, str2, z2, str3, arrayList, z3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new BeginSignInRequest.GoogleIdTokenRequestOptions[i];
    }
}
