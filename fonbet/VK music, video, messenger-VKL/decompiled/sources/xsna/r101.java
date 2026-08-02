package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import com.google.android.gms.wallet.wobs.TextModuleData;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-wallet@@18.0.0 */
/* loaded from: classes13.dex */
public final class r101 implements Parcelable.Creator<CommonWalletObject> {
    @Override // android.os.Parcelable.Creator
    public final CommonWalletObject createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        ArrayList<WalletObjectMessage> arrayList = new ArrayList<>();
        ArrayList<LatLng> arrayList2 = new ArrayList<>();
        ArrayList<LabelValueRow> arrayList3 = new ArrayList<>();
        String str = null;
        ArrayList<LabelValueRow> arrayList4 = arrayList3;
        ArrayList<UriData> arrayList5 = new ArrayList<>();
        ArrayList<TextModuleData> arrayList6 = new ArrayList<>();
        ArrayList<UriData> arrayList7 = new ArrayList<>();
        String str2 = null;
        TimeInterval timeInterval = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        int i = 0;
        boolean z = false;
        String str10 = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            String str11 = str2;
            switch ((char) readInt) {
                case 2:
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case 3:
                    str10 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 4:
                    str3 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 5:
                    str4 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 6:
                    str5 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 7:
                    str6 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\b':
                    str7 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\t':
                    str8 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\n':
                    i = SafeParcelReader.w(parcel, readInt);
                    break;
                case 11:
                    arrayList = SafeParcelReader.m(parcel, readInt, WalletObjectMessage.CREATOR);
                    break;
                case '\f':
                    timeInterval = (TimeInterval) SafeParcelReader.h(parcel, readInt, TimeInterval.CREATOR);
                    break;
                case '\r':
                    arrayList2 = SafeParcelReader.m(parcel, readInt, LatLng.CREATOR);
                    break;
                case 14:
                    str2 = SafeParcelReader.i(parcel, readInt);
                    continue;
                case 15:
                    str9 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 16:
                    arrayList4 = SafeParcelReader.m(parcel, readInt, LabelValueRow.CREATOR);
                    break;
                case 17:
                    z = SafeParcelReader.o(parcel, readInt);
                    break;
                case 18:
                    arrayList5 = SafeParcelReader.m(parcel, readInt, UriData.CREATOR);
                    break;
                case 19:
                    arrayList6 = SafeParcelReader.m(parcel, readInt, TextModuleData.CREATOR);
                    break;
                case 20:
                    arrayList7 = SafeParcelReader.m(parcel, readInt, UriData.CREATOR);
                    break;
                default:
                    SafeParcelReader.C(parcel, readInt);
                    break;
            }
            str2 = str11;
        }
        SafeParcelReader.n(parcel, D);
        CommonWalletObject commonWalletObject = new CommonWalletObject();
        commonWalletObject.b = str;
        commonWalletObject.c = str10;
        commonWalletObject.d = str3;
        commonWalletObject.e = str4;
        commonWalletObject.f = str5;
        commonWalletObject.g = str6;
        commonWalletObject.h = str7;
        commonWalletObject.i = str8;
        commonWalletObject.j = i;
        commonWalletObject.k = arrayList;
        commonWalletObject.l = timeInterval;
        commonWalletObject.m = arrayList2;
        commonWalletObject.n = str2;
        commonWalletObject.o = str9;
        commonWalletObject.p = arrayList4;
        commonWalletObject.q = z;
        commonWalletObject.r = arrayList5;
        commonWalletObject.s = arrayList6;
        commonWalletObject.t = arrayList7;
        return commonWalletObject;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CommonWalletObject[] newArray(int i) {
        return new CommonWalletObject[i];
    }
}
