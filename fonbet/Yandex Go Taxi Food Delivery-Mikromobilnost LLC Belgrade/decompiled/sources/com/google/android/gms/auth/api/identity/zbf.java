package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import defpackage.cma1;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class zbf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        ArrayList arrayList = null;
        GoogleSignInAccount googleSignInAccount = null;
        PendingIntent pendingIntent = null;
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
                    arrayList = cma1.B(parcel, readInt);
                    break;
                case 5:
                    googleSignInAccount = (GoogleSignInAccount) cma1.y(parcel, readInt, GoogleSignInAccount.CREATOR);
                    break;
                case 6:
                    pendingIntent = (PendingIntent) cma1.y(parcel, readInt, PendingIntent.CREATOR);
                    break;
                default:
                    cma1.A0(parcel, readInt);
                    break;
            }
        }
        cma1.E(parcel, P0);
        return new AuthorizationResult(str, str2, str3, arrayList, googleSignInAccount, pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AuthorizationResult[i];
    }
}
