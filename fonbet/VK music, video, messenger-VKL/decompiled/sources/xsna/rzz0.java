package xsna;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.tapandpay.firstparty.TokenStatus;
import com.google.android.gms.tapandpay.firstparty.zzai;
import com.google.android.gms.tapandpay.firstparty.zzau;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes13.dex */
public final class rzz0 implements Parcelable.Creator<zzau> {
    @Override // android.os.Parcelable.Creator
    public final zzau createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        String str = null;
        TokenStatus tokenStatus = null;
        String str2 = null;
        Uri uri = null;
        byte[] bArr = null;
        zzai[] zzaiVarArr = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        String str3 = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case 2:
                    str3 = SafeParcelReader.i(parcel, readInt);
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
                    uri = (Uri) SafeParcelReader.h(parcel, readInt, Uri.CREATOR);
                    break;
                case 7:
                    bArr = SafeParcelReader.c(parcel, readInt);
                    break;
                case '\b':
                    zzaiVarArr = (zzai[]) SafeParcelReader.l(parcel, readInt, zzai.CREATOR);
                    break;
                case '\t':
                    i2 = SafeParcelReader.w(parcel, readInt);
                    break;
                case '\n':
                    z = SafeParcelReader.o(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.C(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, D);
        zzau zzauVar = new zzau();
        zzauVar.b = str;
        zzauVar.c = str3;
        zzauVar.d = i;
        zzauVar.e = tokenStatus;
        zzauVar.f = str2;
        zzauVar.g = uri;
        zzauVar.h = bArr;
        zzauVar.i = zzaiVarArr;
        zzauVar.j = i2;
        zzauVar.k = z;
        return zzauVar;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzau[] newArray(int i) {
        return new zzau[i];
    }
}
