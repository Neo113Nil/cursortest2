package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Device;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public final class lh01 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        DataType dataType = null;
        Device device = null;
        com.google.android.gms.fitness.data.zzb zzbVar = null;
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                dataType = (DataType) SafeParcelReader.h(parcel, readInt, DataType.CREATOR);
            } else if (c == 3) {
                i = SafeParcelReader.w(parcel, readInt);
            } else if (c == 4) {
                device = (Device) SafeParcelReader.h(parcel, readInt, Device.CREATOR);
            } else if (c == 5) {
                zzbVar = (com.google.android.gms.fitness.data.zzb) SafeParcelReader.h(parcel, readInt, com.google.android.gms.fitness.data.zzb.CREATOR);
            } else if (c != 6) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                str = SafeParcelReader.i(parcel, readInt);
            }
        }
        SafeParcelReader.n(parcel, D);
        return new DataSource(dataType, i, device, zzbVar, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DataSource[i];
    }
}
