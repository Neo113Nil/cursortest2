package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes12.dex */
public final class pn01 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        ArrayList arrayList = null;
        com.google.android.gms.auth.api.accounttransfer.zzs zzsVar = null;
        int i2 = 0;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = SafeParcelReader.w(parcel, readInt);
                hashSet.add(1);
            } else if (c == 2) {
                arrayList = SafeParcelReader.m(parcel, readInt, com.google.android.gms.auth.api.accounttransfer.zzu.CREATOR);
                hashSet.add(2);
            } else if (c == 3) {
                i2 = SafeParcelReader.w(parcel, readInt);
                hashSet.add(3);
            } else if (c != 4) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                zzsVar = (com.google.android.gms.auth.api.accounttransfer.zzs) SafeParcelReader.h(parcel, readInt, com.google.android.gms.auth.api.accounttransfer.zzs.CREATOR);
                hashSet.add(4);
            }
        }
        if (parcel.dataPosition() == D) {
            return new com.google.android.gms.auth.api.accounttransfer.zzo(hashSet, i, arrayList, i2, zzsVar);
        }
        throw new SafeParcelReader.ParseException(lhg.a(D, "Overread allowed size end="), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new com.google.android.gms.auth.api.accounttransfer.zzo[i];
    }
}
