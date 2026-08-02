package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class io01 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        String str = "";
        String str2 = str;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        Boolean bool = null;
        ArrayList<String> arrayList = null;
        String str10 = null;
        String str11 = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        boolean z = true;
        boolean z2 = true;
        boolean z3 = false;
        int i = 0;
        boolean z4 = false;
        long j6 = -2147483648L;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str3 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 3:
                    str4 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 4:
                    str5 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 5:
                    str6 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 6:
                    j = SafeParcelReader.z(parcel, readInt);
                    break;
                case 7:
                    j2 = SafeParcelReader.z(parcel, readInt);
                    break;
                case '\b':
                    str7 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\t':
                    z = SafeParcelReader.o(parcel, readInt);
                    break;
                case '\n':
                    z3 = SafeParcelReader.o(parcel, readInt);
                    break;
                case 11:
                    j6 = SafeParcelReader.z(parcel, readInt);
                    break;
                case '\f':
                    str8 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\r':
                    j3 = SafeParcelReader.z(parcel, readInt);
                    break;
                case 14:
                    j4 = SafeParcelReader.z(parcel, readInt);
                    break;
                case 15:
                    i = SafeParcelReader.w(parcel, readInt);
                    break;
                case 16:
                    z2 = SafeParcelReader.o(parcel, readInt);
                    break;
                case 17:
                case 20:
                default:
                    SafeParcelReader.C(parcel, readInt);
                    break;
                case 18:
                    z4 = SafeParcelReader.o(parcel, readInt);
                    break;
                case 19:
                    str9 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 21:
                    bool = SafeParcelReader.p(parcel, readInt);
                    break;
                case 22:
                    j5 = SafeParcelReader.z(parcel, readInt);
                    break;
                case 23:
                    arrayList = SafeParcelReader.k(parcel, readInt);
                    break;
                case 24:
                    str10 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 25:
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case 26:
                    str2 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 27:
                    str11 = SafeParcelReader.i(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, D);
        return new com.google.android.gms.measurement.internal.zzq(str3, str4, str5, str6, j, j2, str7, z, z3, j6, str8, j3, j4, i, z2, z4, str9, bool, j5, arrayList, str10, str, str2, str11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new com.google.android.gms.measurement.internal.zzq[i];
    }
}
