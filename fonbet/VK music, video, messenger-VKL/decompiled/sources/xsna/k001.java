package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzaw;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class k001 implements Parcelable.Creator {
    public static void a(zzaw zzawVar, Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.q(parcel, 2, zzawVar.b, false);
        ozg0.p(parcel, 3, zzawVar.c, i, false);
        ozg0.q(parcel, 4, zzawVar.d, false);
        long j = zzawVar.e;
        ozg0.v(parcel, 5, 8);
        parcel.writeLong(j);
        ozg0.x(w, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        String str = null;
        zzau zzauVar = null;
        String str2 = null;
        long j = 0;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = SafeParcelReader.i(parcel, readInt);
            } else if (c == 3) {
                zzauVar = (zzau) SafeParcelReader.h(parcel, readInt, zzau.CREATOR);
            } else if (c == 4) {
                str2 = SafeParcelReader.i(parcel, readInt);
            } else if (c != 5) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                j = SafeParcelReader.z(parcel, readInt);
            }
        }
        SafeParcelReader.n(parcel, D);
        return new zzaw(str, zzauVar, str2, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaw[i];
    }
}
