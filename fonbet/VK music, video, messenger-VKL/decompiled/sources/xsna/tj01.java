package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.measurement.internal.zzkw;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class tj01 implements Parcelable.Creator {
    public static void a(zzkw zzkwVar, Parcel parcel) {
        int w = ozg0.w(20293, parcel);
        int i = zzkwVar.b;
        ozg0.v(parcel, 1, 4);
        parcel.writeInt(i);
        ozg0.q(parcel, 2, zzkwVar.c, false);
        long j = zzkwVar.d;
        ozg0.v(parcel, 3, 8);
        parcel.writeLong(j);
        ozg0.o(parcel, 4, zzkwVar.e);
        ozg0.q(parcel, 6, zzkwVar.f, false);
        ozg0.q(parcel, 7, zzkwVar.g, false);
        ozg0.f(parcel, 8, zzkwVar.h);
        ozg0.x(w, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        int i = 0;
        String str = null;
        Long l = null;
        Float f = null;
        String str2 = null;
        String str3 = null;
        Double d = null;
        long j = 0;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = SafeParcelReader.w(parcel, readInt);
                    break;
                case 2:
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case 3:
                    j = SafeParcelReader.z(parcel, readInt);
                    break;
                case 4:
                    l = SafeParcelReader.A(parcel, readInt);
                    break;
                case 5:
                    f = SafeParcelReader.u(parcel, readInt);
                    break;
                case 6:
                    str2 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 7:
                    str3 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\b':
                    d = SafeParcelReader.s(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.C(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, D);
        return new zzkw(i, str, j, l, f, str2, str3, d);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzkw[i];
    }
}
