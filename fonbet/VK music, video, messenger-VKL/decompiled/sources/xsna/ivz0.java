package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzkw;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class ivz0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        String str = null;
        String str2 = null;
        zzkw zzkwVar = null;
        String str3 = null;
        zzaw zzawVar = null;
        zzaw zzawVar2 = null;
        zzaw zzawVar3 = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        boolean z = false;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case 3:
                    str2 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 4:
                    zzkwVar = (zzkw) SafeParcelReader.h(parcel, readInt, zzkw.CREATOR);
                    break;
                case 5:
                    j = SafeParcelReader.z(parcel, readInt);
                    break;
                case 6:
                    z = SafeParcelReader.o(parcel, readInt);
                    break;
                case 7:
                    str3 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\b':
                    zzawVar = (zzaw) SafeParcelReader.h(parcel, readInt, zzaw.CREATOR);
                    break;
                case '\t':
                    j2 = SafeParcelReader.z(parcel, readInt);
                    break;
                case '\n':
                    zzawVar2 = (zzaw) SafeParcelReader.h(parcel, readInt, zzaw.CREATOR);
                    break;
                case 11:
                    j3 = SafeParcelReader.z(parcel, readInt);
                    break;
                case '\f':
                    zzawVar3 = (zzaw) SafeParcelReader.h(parcel, readInt, zzaw.CREATOR);
                    break;
                default:
                    SafeParcelReader.C(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, D);
        return new zzac(str, str2, zzkwVar, j, z, str3, zzawVar, j2, zzawVar2, j3, zzawVar3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzac[i];
    }
}
