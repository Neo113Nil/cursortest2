package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.tapandpay.firstparty.zzak;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes13.dex */
public final class dxz0 implements Parcelable.Creator<zzak> {
    @Override // android.os.Parcelable.Creator
    public final zzak createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        while (parcel.dataPosition() < D) {
            SafeParcelReader.C(parcel, parcel.readInt());
        }
        SafeParcelReader.n(parcel, D);
        return new zzak();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzak[] newArray(int i) {
        return new zzak[i];
    }
}
