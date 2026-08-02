package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.zzac;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes12.dex */
public final class qr01 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        int i = 1000;
        int i2 = 1;
        int i3 = 1;
        long j = 0;
        zzac[] zzacVarArr = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i2 = SafeParcelReader.w(parcel, readInt);
                    break;
                case 2:
                    i3 = SafeParcelReader.w(parcel, readInt);
                    break;
                case 3:
                    j = SafeParcelReader.z(parcel, readInt);
                    break;
                case 4:
                    i = SafeParcelReader.w(parcel, readInt);
                    break;
                case 5:
                    zzacVarArr = (zzac[]) SafeParcelReader.l(parcel, readInt, zzac.CREATOR);
                    break;
                case 6:
                    SafeParcelReader.o(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.C(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, D);
        return new LocationAvailability(i, i2, i3, j, zzacVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationAvailability[i];
    }
}
