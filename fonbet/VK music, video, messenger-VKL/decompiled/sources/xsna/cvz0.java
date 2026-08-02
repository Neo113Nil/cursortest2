package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.internal.zzac;
import com.google.android.gms.cast.zzao;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public final class cvz0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        ApplicationMetadata applicationMetadata = null;
        zzao zzaoVar = null;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    d = SafeParcelReader.r(parcel, readInt);
                    break;
                case 3:
                    z = SafeParcelReader.o(parcel, readInt);
                    break;
                case 4:
                    i = SafeParcelReader.w(parcel, readInt);
                    break;
                case 5:
                    applicationMetadata = (ApplicationMetadata) SafeParcelReader.h(parcel, readInt, ApplicationMetadata.CREATOR);
                    break;
                case 6:
                    i2 = SafeParcelReader.w(parcel, readInt);
                    break;
                case 7:
                    zzaoVar = (zzao) SafeParcelReader.h(parcel, readInt, zzao.CREATOR);
                    break;
                case '\b':
                    d2 = SafeParcelReader.r(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.C(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, D);
        return new zzac(d, z, i, applicationMetadata, i2, zzaoVar, d2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzac[i];
    }
}
