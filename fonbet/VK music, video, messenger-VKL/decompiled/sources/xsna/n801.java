package xsna;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.TokenStatus;
import com.google.android.gms.tapandpay.firstparty.zzaa;
import com.google.android.gms.tapandpay.firstparty.zzac;
import com.google.android.gms.tapandpay.firstparty.zzae;
import com.google.android.gms.tapandpay.firstparty.zzai;
import com.google.android.gms.tapandpay.firstparty.zzaz;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes13.dex */
public final class n801 implements Parcelable.Creator<CardInfo> {
    @Override // android.os.Parcelable.Creator
    public final CardInfo createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        String str = null;
        TokenStatus tokenStatus = null;
        String str2 = null;
        Uri uri = null;
        zzae zzaeVar = null;
        String str3 = null;
        zzaz zzazVar = null;
        String str4 = null;
        zzai[] zzaiVarArr = null;
        ArrayList arrayList = null;
        String str5 = null;
        String str6 = null;
        zzaa zzaaVar = null;
        zzac zzacVar = null;
        byte[] bArr = null;
        String str7 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        byte[] bArr2 = null;
        String str8 = null;
        String str9 = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            zzaz zzazVar2 = zzazVar;
            switch ((char) readInt) {
                case 2:
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case 3:
                    bArr2 = SafeParcelReader.c(parcel, readInt);
                    break;
                case 4:
                    str8 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 5:
                    str9 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 6:
                    i3 = SafeParcelReader.w(parcel, readInt);
                    break;
                case 7:
                    tokenStatus = (TokenStatus) SafeParcelReader.h(parcel, readInt, TokenStatus.CREATOR);
                    break;
                case '\b':
                    str2 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\t':
                    uri = (Uri) SafeParcelReader.h(parcel, readInt, Uri.CREATOR);
                    break;
                case '\n':
                    i2 = SafeParcelReader.w(parcel, readInt);
                    break;
                case 11:
                    i = SafeParcelReader.w(parcel, readInt);
                    break;
                case '\f':
                    zzaeVar = (zzae) SafeParcelReader.h(parcel, readInt, zzae.CREATOR);
                    break;
                case '\r':
                    str3 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 14:
                case 19:
                default:
                    SafeParcelReader.C(parcel, readInt);
                    break;
                case 15:
                    zzazVar = (zzaz) SafeParcelReader.h(parcel, readInt, zzaz.CREATOR);
                    continue;
                case 16:
                    str7 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 17:
                    bArr = SafeParcelReader.c(parcel, readInt);
                    break;
                case 18:
                    i4 = SafeParcelReader.w(parcel, readInt);
                    break;
                case 20:
                    i5 = SafeParcelReader.w(parcel, readInt);
                    break;
                case 21:
                    i6 = SafeParcelReader.w(parcel, readInt);
                    break;
                case 22:
                    zzacVar = (zzac) SafeParcelReader.h(parcel, readInt, zzac.CREATOR);
                    break;
                case 23:
                    zzaaVar = (zzaa) SafeParcelReader.h(parcel, readInt, zzaa.CREATOR);
                    break;
                case 24:
                    str4 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 25:
                    zzaiVarArr = (zzai[]) SafeParcelReader.l(parcel, readInt, zzai.CREATOR);
                    break;
                case 26:
                    z = SafeParcelReader.o(parcel, readInt);
                    break;
                case 27:
                    arrayList = SafeParcelReader.m(parcel, readInt, com.google.android.gms.tapandpay.firstparty.zza.CREATOR);
                    break;
                case 28:
                    z2 = SafeParcelReader.o(parcel, readInt);
                    break;
                case 29:
                    z3 = SafeParcelReader.o(parcel, readInt);
                    break;
                case 30:
                    j = SafeParcelReader.z(parcel, readInt);
                    break;
                case 31:
                    j2 = SafeParcelReader.z(parcel, readInt);
                    break;
                case ' ':
                    z4 = SafeParcelReader.o(parcel, readInt);
                    break;
                case '!':
                    j3 = SafeParcelReader.z(parcel, readInt);
                    break;
                case '\"':
                    str5 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '#':
                    str6 = SafeParcelReader.i(parcel, readInt);
                    break;
            }
            zzazVar = zzazVar2;
        }
        SafeParcelReader.n(parcel, D);
        CardInfo cardInfo = new CardInfo();
        cardInfo.b = str;
        cardInfo.c = bArr2;
        cardInfo.d = str8;
        cardInfo.e = str9;
        cardInfo.f = i3;
        cardInfo.g = tokenStatus;
        cardInfo.h = str2;
        cardInfo.i = uri;
        cardInfo.j = i2;
        cardInfo.k = i;
        cardInfo.l = zzaeVar;
        cardInfo.m = str3;
        cardInfo.n = zzazVar;
        cardInfo.o = str7;
        cardInfo.p = bArr;
        cardInfo.q = i4;
        cardInfo.r = i5;
        cardInfo.s = i6;
        cardInfo.t = zzacVar;
        cardInfo.u = zzaaVar;
        cardInfo.v = str4;
        cardInfo.w = zzaiVarArr;
        cardInfo.x = z;
        cardInfo.y = arrayList;
        cardInfo.z = z2;
        cardInfo.A = z3;
        cardInfo.B = j;
        cardInfo.C = j2;
        cardInfo.D = z4;
        cardInfo.E = j3;
        cardInfo.F = str5;
        cardInfo.G = str6;
        return cardInfo;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CardInfo[] newArray(int i) {
        return new CardInfo[i];
    }
}
