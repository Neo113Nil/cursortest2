package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.wallet.wobs.UriData;

/* compiled from: com.google.android.gms:play-services-wallet@@18.0.0 */
/* loaded from: classes13.dex */
public final class ak01 implements Parcelable.Creator<UriData> {
    @Override // android.os.Parcelable.Creator
    public final UriData createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = SafeParcelReader.i(parcel, readInt);
            } else if (c != 3) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                str2 = SafeParcelReader.i(parcel, readInt);
            }
        }
        SafeParcelReader.n(parcel, D);
        return new UriData(str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ UriData[] newArray(int i) {
        return new UriData[i];
    }
}
