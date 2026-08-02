package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes12.dex */
public final class jr01 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        com.google.android.gms.auth.api.accounttransfer.zzw zzwVar = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = SafeParcelReader.w(parcel, readInt);
                hashSet.add(1);
            } else if (c == 2) {
                zzwVar = (com.google.android.gms.auth.api.accounttransfer.zzw) SafeParcelReader.h(parcel, readInt, com.google.android.gms.auth.api.accounttransfer.zzw.CREATOR);
                hashSet.add(2);
            } else if (c == 3) {
                str = SafeParcelReader.i(parcel, readInt);
                hashSet.add(3);
            } else if (c == 4) {
                str2 = SafeParcelReader.i(parcel, readInt);
                hashSet.add(4);
            } else if (c != 5) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                str3 = SafeParcelReader.i(parcel, readInt);
                hashSet.add(5);
            }
        }
        if (parcel.dataPosition() == D) {
            return new com.google.android.gms.auth.api.accounttransfer.zzu(hashSet, i, zzwVar, str, str2, str3);
        }
        throw new SafeParcelReader.ParseException(lhg.a(D, "Overread allowed size end="), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new com.google.android.gms.auth.api.accounttransfer.zzu[i];
    }
}
