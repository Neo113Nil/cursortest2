package xsna;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes12.dex */
public final class co01 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        String str = null;
        IBinder iBinder = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case 2:
                    z = SafeParcelReader.o(parcel, readInt);
                    break;
                case 3:
                    z2 = SafeParcelReader.o(parcel, readInt);
                    break;
                case 4:
                    iBinder = SafeParcelReader.v(parcel, readInt);
                    break;
                case 5:
                    z3 = SafeParcelReader.o(parcel, readInt);
                    break;
                case 6:
                    z4 = SafeParcelReader.o(parcel, readInt);
                    break;
                case 7:
                default:
                    SafeParcelReader.C(parcel, readInt);
                    break;
                case '\b':
                    z5 = SafeParcelReader.o(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, D);
        return new com.google.android.gms.common.zzp(str, z, z2, iBinder, z3, z4, z5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new com.google.android.gms.common.zzp[i];
    }
}
