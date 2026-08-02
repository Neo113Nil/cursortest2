package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-wallet@@18.0.0 */
/* loaded from: classes13.dex */
public final class btz0 implements Parcelable.Creator<com.google.android.gms.wallet.zzb> {
    @Override // android.os.Parcelable.Creator
    public final com.google.android.gms.wallet.zzb createFromParcel(Parcel parcel) {
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
        boolean z = false;
        String str10 = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case 3:
                    str10 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 4:
                    str2 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 5:
                    str3 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 6:
                    str4 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 7:
                    str5 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\b':
                    str6 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\t':
                    str7 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\n':
                    str8 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 11:
                    z = SafeParcelReader.o(parcel, readInt);
                    break;
                case '\f':
                    str9 = SafeParcelReader.i(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.C(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, D);
        com.google.android.gms.wallet.zzb zzbVar = new com.google.android.gms.wallet.zzb();
        zzbVar.b = str;
        zzbVar.c = str10;
        zzbVar.d = str2;
        zzbVar.e = str3;
        zzbVar.f = str4;
        zzbVar.g = str5;
        zzbVar.h = str6;
        zzbVar.i = str7;
        zzbVar.j = str8;
        zzbVar.k = z;
        zzbVar.l = str9;
        return zzbVar;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.wallet.zzb[] newArray(int i) {
        return new com.google.android.gms.wallet.zzb[i];
    }
}
