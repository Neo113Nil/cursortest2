package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fido.fido2.api.common.UvmEntry;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes12.dex */
public final class d301 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        int i = 0;
        short s = 0;
        short s2 = 0;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = SafeParcelReader.w(parcel, readInt);
            } else if (c == 2) {
                SafeParcelReader.E(parcel, readInt, 4);
                s = (short) parcel.readInt();
            } else if (c != 3) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                SafeParcelReader.E(parcel, readInt, 4);
                s2 = (short) parcel.readInt();
            }
        }
        SafeParcelReader.n(parcel, D);
        return new UvmEntry(i, s, s2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new UvmEntry[i];
    }
}
