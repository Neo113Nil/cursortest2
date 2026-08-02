package xsna;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fitness.data.Value;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public final class sxz0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        String str = null;
        Bundle bundle = null;
        int[] iArr = null;
        float[] fArr = null;
        byte[] bArr = null;
        float f = 0.0f;
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = SafeParcelReader.w(parcel, readInt);
                    break;
                case 2:
                    z = SafeParcelReader.o(parcel, readInt);
                    break;
                case 3:
                    f = SafeParcelReader.t(parcel, readInt);
                    break;
                case 4:
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case 5:
                    bundle = SafeParcelReader.b(parcel, readInt);
                    break;
                case 6:
                    iArr = SafeParcelReader.d(parcel, readInt);
                    break;
                case 7:
                    int B = SafeParcelReader.B(parcel, readInt);
                    int dataPosition = parcel.dataPosition();
                    if (B != 0) {
                        float[] createFloatArray = parcel.createFloatArray();
                        parcel.setDataPosition(dataPosition + B);
                        fArr = createFloatArray;
                        break;
                    } else {
                        fArr = null;
                        break;
                    }
                case '\b':
                    bArr = SafeParcelReader.c(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.C(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, D);
        return new Value(i, z, f, str, bundle, iArr, fArr, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Value[i];
    }
}
