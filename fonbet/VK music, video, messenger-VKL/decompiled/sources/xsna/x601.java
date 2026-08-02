package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.tapandpay.globalactions.GetGlobalActionCardsResponse;
import com.google.android.gms.tapandpay.globalactions.GlobalActionCard;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes13.dex */
public final class x601 implements Parcelable.Creator<GetGlobalActionCardsResponse> {
    @Override // android.os.Parcelable.Creator
    public final GetGlobalActionCardsResponse createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        GlobalActionCard[] globalActionCardArr = null;
        int i = 0;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                globalActionCardArr = (GlobalActionCard[]) SafeParcelReader.l(parcel, readInt, GlobalActionCard.CREATOR);
            } else if (c != 2) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                i = SafeParcelReader.w(parcel, readInt);
            }
        }
        SafeParcelReader.n(parcel, D);
        GetGlobalActionCardsResponse getGlobalActionCardsResponse = new GetGlobalActionCardsResponse();
        getGlobalActionCardsResponse.b = globalActionCardArr;
        getGlobalActionCardsResponse.c = i;
        return getGlobalActionCardsResponse;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GetGlobalActionCardsResponse[] newArray(int i) {
        return new GetGlobalActionCardsResponse[i];
    }
}
