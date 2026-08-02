package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.tapandpay.firstparty.zzaw;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes13.dex */
public final class c001 implements Parcelable.Creator<zzaw> {
    @Override // android.os.Parcelable.Creator
    public final zzaw createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = SafeParcelReader.i(parcel, readInt);
            } else if (c != 3) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                i = SafeParcelReader.w(parcel, readInt);
            }
        }
        SafeParcelReader.n(parcel, D);
        zzaw zzawVar = new zzaw();
        zzawVar.b = str;
        zzawVar.c = i;
        return zzawVar;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaw[] newArray(int i) {
        return new zzaw[i];
    }
}
