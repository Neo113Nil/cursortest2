package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import defpackage.cma1;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class zab implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = cma1.r0(parcel, readInt);
                    break;
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
                    uri = (Uri) cma1.y(parcel, readInt, Uri.CREATOR);
                    break;
                case 7:
                    str5 = cma1.z(parcel, readInt);
                    break;
                case '\b':
                    j = cma1.u0(parcel, readInt);
                    break;
                case '\t':
                    str6 = cma1.z(parcel, readInt);
                    break;
                case '\n':
                    arrayList = cma1.D(parcel, readInt, Scope.CREATOR);
                    break;
                case 11:
                    str7 = cma1.z(parcel, readInt);
                    break;
                case '\f':
                    str8 = cma1.z(parcel, readInt);
                    break;
                default:
                    cma1.A0(parcel, readInt);
                    break;
            }
        }
        cma1.E(parcel, P0);
        return new GoogleSignInAccount(i, str, str2, str3, str4, uri, str5, j, str6, arrayList, str7, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }
}
