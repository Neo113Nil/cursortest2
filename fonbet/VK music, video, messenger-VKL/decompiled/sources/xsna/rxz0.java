package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fido.fido2.api.common.zzak;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes12.dex */
public final class rxz0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        while (true) {
            byte[][] bArr = null;
            while (parcel.dataPosition() < D) {
                int readInt = parcel.readInt();
                if (((char) readInt) != 1) {
                    SafeParcelReader.C(parcel, readInt);
                } else {
                    int B = SafeParcelReader.B(parcel, readInt);
                    int dataPosition = parcel.dataPosition();
                    if (B == 0) {
                        break;
                    }
                    int readInt2 = parcel.readInt();
                    byte[][] bArr2 = new byte[readInt2][];
                    for (int i = 0; i < readInt2; i++) {
                        bArr2[i] = parcel.createByteArray();
                    }
                    parcel.setDataPosition(dataPosition + B);
                    bArr = bArr2;
                }
            }
            SafeParcelReader.n(parcel, D);
            return new zzak(bArr);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzak[i];
    }
}
