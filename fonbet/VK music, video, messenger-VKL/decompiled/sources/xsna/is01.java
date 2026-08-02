package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.LocationRequest;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes12.dex */
public final class is01 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        WorkSource workSource = new WorkSource();
        int i = 102;
        long j = 3600000;
        long j2 = 600000;
        long j3 = 0;
        long j4 = Long.MAX_VALUE;
        long j5 = Long.MAX_VALUE;
        int i2 = Integer.MAX_VALUE;
        float f = 0.0f;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        boolean z2 = false;
        long j6 = -1;
        String str = null;
        com.google.android.gms.internal.location.zzd zzdVar = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = SafeParcelReader.w(parcel, readInt);
                    break;
                case 2:
                    j = SafeParcelReader.z(parcel, readInt);
                    break;
                case 3:
                    j2 = SafeParcelReader.z(parcel, readInt);
                    break;
                case 4:
                default:
                    SafeParcelReader.C(parcel, readInt);
                    break;
                case 5:
                    j4 = SafeParcelReader.z(parcel, readInt);
                    break;
                case 6:
                    i2 = SafeParcelReader.w(parcel, readInt);
                    break;
                case 7:
                    f = SafeParcelReader.t(parcel, readInt);
                    break;
                case '\b':
                    j3 = SafeParcelReader.z(parcel, readInt);
                    break;
                case '\t':
                    z = SafeParcelReader.o(parcel, readInt);
                    break;
                case '\n':
                    j5 = SafeParcelReader.z(parcel, readInt);
                    break;
                case 11:
                    j6 = SafeParcelReader.z(parcel, readInt);
                    break;
                case '\f':
                    i3 = SafeParcelReader.w(parcel, readInt);
                    break;
                case '\r':
                    i4 = SafeParcelReader.w(parcel, readInt);
                    break;
                case 14:
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case 15:
                    z2 = SafeParcelReader.o(parcel, readInt);
                    break;
                case 16:
                    workSource = (WorkSource) SafeParcelReader.h(parcel, readInt, WorkSource.CREATOR);
                    break;
                case 17:
                    zzdVar = (com.google.android.gms.internal.location.zzd) SafeParcelReader.h(parcel, readInt, com.google.android.gms.internal.location.zzd.CREATOR);
                    break;
            }
        }
        SafeParcelReader.n(parcel, D);
        return new LocationRequest(i, j, j2, j3, j4, j5, i2, f, z, j6, i3, i4, str, z2, workSource, zzdVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationRequest[i];
    }
}
