package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.wallet.wobs.TimeInterval;

/* compiled from: com.google.android.gms:play-services-wallet@@18.0.0 */
/* loaded from: classes13.dex */
public final class pi01 implements Parcelable.Creator<TimeInterval> {
    @Override // android.os.Parcelable.Creator
    public final TimeInterval createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        long j = 0;
        long j2 = 0;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                j = SafeParcelReader.z(parcel, readInt);
            } else if (c != 3) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                j2 = SafeParcelReader.z(parcel, readInt);
            }
        }
        SafeParcelReader.n(parcel, D);
        return new TimeInterval(j, j2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ TimeInterval[] newArray(int i) {
        return new TimeInterval[i];
    }
}
