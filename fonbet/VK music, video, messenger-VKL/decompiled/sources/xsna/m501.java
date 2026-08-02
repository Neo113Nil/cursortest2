package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.tapandpay.firstparty.TokenStatus;
import com.google.android.gms.tapandpay.firstparty.zzaz;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes13.dex */
public final class m501 implements Parcelable.Creator<com.google.android.gms.tapandpay.firstparty.zza> {
    @Override // android.os.Parcelable.Creator
    public final com.google.android.gms.tapandpay.firstparty.zza createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        String str = null;
        TokenStatus tokenStatus = null;
        String str2 = null;
        zzaz zzazVar = null;
        int i = 0;
        byte[] bArr = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case 2:
                    bArr = SafeParcelReader.c(parcel, readInt);
                    break;
                case 3:
                    i = SafeParcelReader.w(parcel, readInt);
                    break;
                case 4:
                    tokenStatus = (TokenStatus) SafeParcelReader.h(parcel, readInt, TokenStatus.CREATOR);
                    break;
                case 5:
                    str2 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 6:
                    zzazVar = (zzaz) SafeParcelReader.h(parcel, readInt, zzaz.CREATOR);
                    break;
                default:
                    SafeParcelReader.C(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, D);
        com.google.android.gms.tapandpay.firstparty.zza zzaVar = new com.google.android.gms.tapandpay.firstparty.zza();
        zzaVar.b = str;
        zzaVar.c = bArr;
        zzaVar.d = i;
        zzaVar.e = tokenStatus;
        zzaVar.f = str2;
        zzaVar.g = zzazVar;
        return zzaVar;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.tapandpay.firstparty.zza[] newArray(int i) {
        return new com.google.android.gms.tapandpay.firstparty.zza[i];
    }
}
