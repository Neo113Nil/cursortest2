package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.tapandpay.firstparty.zzac;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes13.dex */
public final class suz0 implements Parcelable.Creator<zzac> {
    @Override // android.os.Parcelable.Creator
    public final zzac createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        boolean z = false;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                z = SafeParcelReader.o(parcel, readInt);
            } else if (c == 3) {
                i = SafeParcelReader.w(parcel, readInt);
            } else if (c == 4) {
                i2 = SafeParcelReader.w(parcel, readInt);
            } else if (c != 5) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                i3 = SafeParcelReader.w(parcel, readInt);
            }
        }
        SafeParcelReader.n(parcel, D);
        zzac zzacVar = new zzac();
        zzacVar.b = z;
        zzacVar.c = i;
        zzacVar.d = i2;
        zzacVar.e = i3;
        return zzacVar;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzac[] newArray(int i) {
        return new zzac[i];
    }
}
