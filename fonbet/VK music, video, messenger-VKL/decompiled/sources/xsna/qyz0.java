package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.zzam;
import com.google.android.gms.cast.zzao;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public final class qyz0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        zzam zzamVar = null;
        zzam zzamVar2 = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                zzamVar = (zzam) SafeParcelReader.h(parcel, readInt, zzam.CREATOR);
            } else if (c != 3) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                zzamVar2 = (zzam) SafeParcelReader.h(parcel, readInt, zzam.CREATOR);
            }
        }
        SafeParcelReader.n(parcel, D);
        return new zzao(zzamVar, zzamVar2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzao[i];
    }
}
