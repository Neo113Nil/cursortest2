package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.tapandpay.firstparty.zzae;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes13.dex */
public final class jvz0 implements Parcelable.Creator<zzae> {
    @Override // android.os.Parcelable.Creator
    public final zzae createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        String str15 = null;
        String str16 = null;
        String str17 = null;
        long j = 0;
        int i = 0;
        String str18 = null;
        String str19 = null;
        String str20 = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            String str21 = str10;
            switch ((char) readInt) {
                case 2:
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case 3:
                    str18 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 4:
                    str19 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 5:
                    str20 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 6:
                    str2 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 7:
                    str3 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\b':
                    str4 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\t':
                    str5 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\n':
                    str6 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 11:
                    str7 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\f':
                    str8 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\r':
                    str9 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 14:
                    str10 = SafeParcelReader.i(parcel, readInt);
                    continue;
                case 15:
                    j = SafeParcelReader.z(parcel, readInt);
                    break;
                case 16:
                    str17 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 17:
                    str11 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 18:
                    str12 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 19:
                default:
                    SafeParcelReader.C(parcel, readInt);
                    break;
                case 20:
                    str13 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 21:
                    str14 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 22:
                    str15 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 23:
                    str16 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 24:
                    i = SafeParcelReader.w(parcel, readInt);
                    break;
            }
            str10 = str21;
        }
        SafeParcelReader.n(parcel, D);
        zzae zzaeVar = new zzae();
        zzaeVar.b = str;
        zzaeVar.c = str18;
        zzaeVar.d = str19;
        zzaeVar.e = str20;
        zzaeVar.f = str2;
        zzaeVar.g = str3;
        zzaeVar.h = str4;
        zzaeVar.i = str5;
        zzaeVar.j = str6;
        zzaeVar.k = str7;
        zzaeVar.l = str8;
        zzaeVar.m = str9;
        zzaeVar.n = str10;
        zzaeVar.o = j;
        zzaeVar.p = str17;
        zzaeVar.q = str11;
        zzaeVar.r = str12;
        zzaeVar.s = str13;
        zzaeVar.t = str14;
        zzaeVar.u = str15;
        zzaeVar.v = str16;
        zzaeVar.w = i;
        return zzaeVar;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzae[] newArray(int i) {
        return new zzae[i];
    }
}
