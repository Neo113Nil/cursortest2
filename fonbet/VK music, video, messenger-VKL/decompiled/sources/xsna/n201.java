package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.tapandpay.firstparty.zzaq;
import com.google.android.gms.tapandpay.firstparty.zzbb;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes13.dex */
public final class n201 implements Parcelable.Creator<zzbb> {
    @Override // android.os.Parcelable.Creator
    public final zzbb createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                arrayList = SafeParcelReader.m(parcel, readInt, zzaq.CREATOR);
            }
        }
        SafeParcelReader.n(parcel, D);
        return new zzbb(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzbb[] newArray(int i) {
        return new zzbb[i];
    }
}
