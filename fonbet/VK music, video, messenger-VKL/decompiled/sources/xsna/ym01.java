package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.LoyaltyWalletObject;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.TextModuleData;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-wallet@@18.0.0 */
/* loaded from: classes13.dex */
public final class ym01 implements Parcelable.Creator<LoyaltyWalletObject> {
    @Override // android.os.Parcelable.Creator
    public final LoyaltyWalletObject createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        ArrayList<WalletObjectMessage> arrayList = new ArrayList<>();
        ArrayList<LatLng> arrayList2 = new ArrayList<>();
        ArrayList<LabelValueRow> arrayList3 = new ArrayList<>();
        String str = null;
        ArrayList<LatLng> arrayList4 = arrayList2;
        ArrayList<LabelValueRow> arrayList5 = arrayList3;
        ArrayList<UriData> arrayList6 = new ArrayList<>();
        ArrayList<TextModuleData> arrayList7 = new ArrayList<>();
        ArrayList<UriData> arrayList8 = new ArrayList<>();
        TimeInterval timeInterval = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        LoyaltyPoints loyaltyPoints = null;
        String str11 = null;
        int i = 0;
        boolean z = false;
        String str12 = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            TimeInterval timeInterval2 = timeInterval;
            switch ((char) readInt) {
                case 2:
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case 3:
                    str12 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 4:
                    str4 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 5:
                    str5 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 6:
                    str6 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 7:
                    str7 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\b':
                    str8 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\t':
                    str9 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\n':
                    str3 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 11:
                    str2 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\f':
                    i = SafeParcelReader.w(parcel, readInt);
                    break;
                case '\r':
                    arrayList = SafeParcelReader.m(parcel, readInt, WalletObjectMessage.CREATOR);
                    break;
                case 14:
                    timeInterval = (TimeInterval) SafeParcelReader.h(parcel, readInt, TimeInterval.CREATOR);
                    continue;
                case 15:
                    arrayList4 = SafeParcelReader.m(parcel, readInt, LatLng.CREATOR);
                    break;
                case 16:
                    str11 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 17:
                    str10 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 18:
                    arrayList5 = SafeParcelReader.m(parcel, readInt, LabelValueRow.CREATOR);
                    break;
                case 19:
                    z = SafeParcelReader.o(parcel, readInt);
                    break;
                case 20:
                    arrayList6 = SafeParcelReader.m(parcel, readInt, UriData.CREATOR);
                    break;
                case 21:
                    arrayList7 = SafeParcelReader.m(parcel, readInt, TextModuleData.CREATOR);
                    break;
                case 22:
                    arrayList8 = SafeParcelReader.m(parcel, readInt, UriData.CREATOR);
                    break;
                case 23:
                    loyaltyPoints = (LoyaltyPoints) SafeParcelReader.h(parcel, readInt, LoyaltyPoints.CREATOR);
                    break;
                default:
                    SafeParcelReader.C(parcel, readInt);
                    break;
            }
            timeInterval = timeInterval2;
        }
        SafeParcelReader.n(parcel, D);
        LoyaltyWalletObject loyaltyWalletObject = new LoyaltyWalletObject();
        loyaltyWalletObject.b = str;
        loyaltyWalletObject.c = str12;
        loyaltyWalletObject.d = str4;
        loyaltyWalletObject.e = str5;
        loyaltyWalletObject.f = str6;
        loyaltyWalletObject.g = str7;
        loyaltyWalletObject.h = str8;
        loyaltyWalletObject.i = str9;
        loyaltyWalletObject.j = str3;
        loyaltyWalletObject.k = str2;
        loyaltyWalletObject.l = i;
        loyaltyWalletObject.m = arrayList;
        loyaltyWalletObject.n = timeInterval;
        loyaltyWalletObject.o = arrayList4;
        loyaltyWalletObject.p = str11;
        loyaltyWalletObject.q = str10;
        loyaltyWalletObject.r = arrayList5;
        loyaltyWalletObject.s = z;
        loyaltyWalletObject.t = arrayList6;
        loyaltyWalletObject.u = arrayList7;
        loyaltyWalletObject.v = arrayList8;
        loyaltyWalletObject.w = loyaltyPoints;
        return loyaltyWalletObject;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LoyaltyWalletObject[] newArray(int i) {
        return new LoyaltyWalletObject[i];
    }
}
