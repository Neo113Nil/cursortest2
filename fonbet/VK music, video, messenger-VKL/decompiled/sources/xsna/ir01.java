package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.LastLocationRequest;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes.dex */
public final class ir01 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        long j = Long.MAX_VALUE;
        int i = 0;
        boolean z = false;
        String str = null;
        com.google.android.gms.internal.location.zzd zzdVar = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                j = SafeParcelReader.z(parcel, readInt);
            } else if (c == 2) {
                i = SafeParcelReader.w(parcel, readInt);
            } else if (c == 3) {
                z = SafeParcelReader.o(parcel, readInt);
            } else if (c == 4) {
                str = SafeParcelReader.i(parcel, readInt);
            } else if (c != 5) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                zzdVar = (com.google.android.gms.internal.location.zzd) SafeParcelReader.h(parcel, readInt, com.google.android.gms.internal.location.zzd.CREATOR);
            }
        }
        SafeParcelReader.n(parcel, D);
        return new LastLocationRequest(j, i, z, str, zzdVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LastLocationRequest[i];
    }
}
