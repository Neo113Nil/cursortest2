package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.Tile;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* loaded from: classes13.dex */
public final class np01 implements Parcelable.Creator<Tile> {
    @Override // android.os.Parcelable.Creator
    public final Tile createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        int i = 0;
        byte[] bArr = null;
        int i2 = 0;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                i = SafeParcelReader.w(parcel, readInt);
            } else if (c == 3) {
                i2 = SafeParcelReader.w(parcel, readInt);
            } else if (c != 4) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                bArr = SafeParcelReader.c(parcel, readInt);
            }
        }
        SafeParcelReader.n(parcel, D);
        return new Tile(i, i2, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Tile[] newArray(int i) {
        return new Tile[i];
    }
}
