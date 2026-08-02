package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-wallet@@18.0.0 */
/* loaded from: classes13.dex */
public final class pl01 implements Parcelable.Creator<IsReadyToPayRequest> {
    @Override // android.os.Parcelable.Creator
    public final IsReadyToPayRequest createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        ArrayList<Integer> arrayList = null;
        String str = null;
        ArrayList<Integer> arrayList2 = null;
        String str2 = null;
        boolean z = false;
        String str3 = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    arrayList = SafeParcelReader.e(parcel, readInt);
                    break;
                case 3:
                default:
                    SafeParcelReader.C(parcel, readInt);
                    break;
                case 4:
                    str3 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 5:
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case 6:
                    arrayList2 = SafeParcelReader.e(parcel, readInt);
                    break;
                case 7:
                    z = SafeParcelReader.o(parcel, readInt);
                    break;
                case '\b':
                    str2 = SafeParcelReader.i(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, D);
        IsReadyToPayRequest isReadyToPayRequest = new IsReadyToPayRequest();
        isReadyToPayRequest.b = arrayList;
        isReadyToPayRequest.c = str3;
        isReadyToPayRequest.d = str;
        isReadyToPayRequest.e = arrayList2;
        isReadyToPayRequest.f = z;
        isReadyToPayRequest.g = str2;
        return isReadyToPayRequest;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ IsReadyToPayRequest[] newArray(int i) {
        return new IsReadyToPayRequest[i];
    }
}
