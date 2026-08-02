package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class zzh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        Integer num = null;
        Double d = null;
        Uri uri = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ChannelIdValue channelIdValue = null;
        String str = null;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    num = cma1.s0(parcel, readInt);
                    break;
                case 3:
                    d = cma1.n0(parcel, readInt);
                    break;
                case 4:
                    uri = (Uri) cma1.y(parcel, readInt, Uri.CREATOR);
                    break;
                case 5:
                    arrayList = cma1.D(parcel, readInt, RegisterRequest.CREATOR);
                    break;
                case 6:
                    arrayList2 = cma1.D(parcel, readInt, RegisteredKey.CREATOR);
                    break;
                case 7:
                    channelIdValue = (ChannelIdValue) cma1.y(parcel, readInt, ChannelIdValue.CREATOR);
                    break;
                case '\b':
                    str = cma1.z(parcel, readInt);
                    break;
                default:
                    cma1.A0(parcel, readInt);
                    break;
            }
        }
        cma1.E(parcel, P0);
        return new RegisterRequestParams(num, d, uri, arrayList, arrayList2, channelIdValue, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RegisterRequestParams[i];
    }
}
