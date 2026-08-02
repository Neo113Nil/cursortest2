package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import com.google.android.gms.wallet.GiftCardWalletObject;
import com.google.android.gms.wallet.LoyaltyWalletObject;
import com.google.android.gms.wallet.OfferWalletObject;

/* compiled from: com.google.android.gms:play-services-wallet@@18.0.0 */
/* loaded from: classes13.dex */
public final class bc01 implements Parcelable.Creator<CreateWalletObjectsRequest> {
    @Override // android.os.Parcelable.Creator
    public final CreateWalletObjectsRequest createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        LoyaltyWalletObject loyaltyWalletObject = null;
        GiftCardWalletObject giftCardWalletObject = null;
        int i = 0;
        OfferWalletObject offerWalletObject = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                loyaltyWalletObject = (LoyaltyWalletObject) SafeParcelReader.h(parcel, readInt, LoyaltyWalletObject.CREATOR);
            } else if (c == 3) {
                offerWalletObject = (OfferWalletObject) SafeParcelReader.h(parcel, readInt, OfferWalletObject.CREATOR);
            } else if (c == 4) {
                giftCardWalletObject = (GiftCardWalletObject) SafeParcelReader.h(parcel, readInt, GiftCardWalletObject.CREATOR);
            } else if (c != 5) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                i = SafeParcelReader.w(parcel, readInt);
            }
        }
        SafeParcelReader.n(parcel, D);
        CreateWalletObjectsRequest createWalletObjectsRequest = new CreateWalletObjectsRequest();
        createWalletObjectsRequest.b = loyaltyWalletObject;
        createWalletObjectsRequest.c = offerWalletObject;
        createWalletObjectsRequest.d = giftCardWalletObject;
        createWalletObjectsRequest.e = i;
        return createWalletObjectsRequest;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CreateWalletObjectsRequest[] newArray(int i) {
        return new CreateWalletObjectsRequest[i];
    }
}
