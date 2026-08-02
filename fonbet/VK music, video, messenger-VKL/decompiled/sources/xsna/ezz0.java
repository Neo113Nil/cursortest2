package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.tapandpay.firstparty.zzas;
import java.math.BigDecimal;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes13.dex */
public final class ezz0 implements Parcelable.Creator<zzas> {
    @Override // android.os.Parcelable.Creator
    public final zzas createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        long j = 0;
        long j2 = 0;
        BigDecimal bigDecimal = null;
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                j = SafeParcelReader.z(parcel, readInt);
            } else if (c == 2) {
                bigDecimal = SafeParcelReader.a(parcel, readInt);
            } else if (c == 3) {
                str = SafeParcelReader.i(parcel, readInt);
            } else if (c == 4) {
                j2 = SafeParcelReader.z(parcel, readInt);
            } else if (c != 5) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                i = SafeParcelReader.w(parcel, readInt);
            }
        }
        SafeParcelReader.n(parcel, D);
        return new zzas(j, bigDecimal, str, j2, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzas[] newArray(int i) {
        return new zzas[i];
    }
}
