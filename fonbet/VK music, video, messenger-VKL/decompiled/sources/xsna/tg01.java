package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.CurrentLocationRequest;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes12.dex */
public final class tg01 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        WorkSource workSource = new WorkSource();
        long j = Long.MAX_VALUE;
        long j2 = Long.MAX_VALUE;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        int i3 = 102;
        String str = null;
        com.google.android.gms.internal.location.zzd zzdVar = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    j = SafeParcelReader.z(parcel, readInt);
                    break;
                case 2:
                    i = SafeParcelReader.w(parcel, readInt);
                    break;
                case 3:
                    i3 = SafeParcelReader.w(parcel, readInt);
                    break;
                case 4:
                    j2 = SafeParcelReader.z(parcel, readInt);
                    break;
                case 5:
                    z = SafeParcelReader.o(parcel, readInt);
                    break;
                case 6:
                    workSource = (WorkSource) SafeParcelReader.h(parcel, readInt, WorkSource.CREATOR);
                    break;
                case 7:
                    i2 = SafeParcelReader.w(parcel, readInt);
                    break;
                case '\b':
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\t':
                    zzdVar = (com.google.android.gms.internal.location.zzd) SafeParcelReader.h(parcel, readInt, com.google.android.gms.internal.location.zzd.CREATOR);
                    break;
                default:
                    SafeParcelReader.C(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, D);
        return new CurrentLocationRequest(j, i, i3, j2, z, i2, str, workSource, zzdVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CurrentLocationRequest[i];
    }
}
