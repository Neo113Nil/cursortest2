package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.tapandpay.firstparty.zzas;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes13.dex */
public final class wq01 implements Parcelable.Creator<com.google.android.gms.tapandpay.firstparty.zzw> {
    @Override // android.os.Parcelable.Creator
    public final com.google.android.gms.tapandpay.firstparty.zzw createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                arrayList = SafeParcelReader.m(parcel, readInt, zzas.CREATOR);
            }
        }
        SafeParcelReader.n(parcel, D);
        return new com.google.android.gms.tapandpay.firstparty.zzw(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.tapandpay.firstparty.zzw[] newArray(int i) {
        return new com.google.android.gms.tapandpay.firstparty.zzw[i];
    }
}
