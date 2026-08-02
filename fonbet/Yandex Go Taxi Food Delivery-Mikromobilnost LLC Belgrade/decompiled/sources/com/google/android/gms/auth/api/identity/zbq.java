package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class zbq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        int i = 0;
        PendingIntent pendingIntent = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        String str3 = null;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    pendingIntent = (PendingIntent) cma1.y(parcel, readInt, PendingIntent.CREATOR);
                    break;
                case 2:
                    str = cma1.z(parcel, readInt);
                    break;
                case 3:
                    str2 = cma1.z(parcel, readInt);
                    break;
                case 4:
                    arrayList = cma1.B(parcel, readInt);
                    break;
                case 5:
                    str3 = cma1.z(parcel, readInt);
                    break;
                case 6:
                    i = cma1.r0(parcel, readInt);
                    break;
                default:
                    cma1.A0(parcel, readInt);
                    break;
            }
        }
        cma1.E(parcel, P0);
        return new SaveAccountLinkingTokenRequest(pendingIntent, str, str2, arrayList, str3, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SaveAccountLinkingTokenRequest[i];
    }
}
