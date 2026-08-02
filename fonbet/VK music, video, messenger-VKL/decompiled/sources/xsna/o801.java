package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.wallet.CardRequirements;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-wallet@@18.0.0 */
/* loaded from: classes13.dex */
public final class o801 implements Parcelable.Creator<CardRequirements> {
    @Override // android.os.Parcelable.Creator
    public final CardRequirements createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        ArrayList<Integer> arrayList = null;
        boolean z = false;
        boolean z2 = true;
        int i = 0;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                arrayList = SafeParcelReader.e(parcel, readInt);
            } else if (c == 2) {
                z2 = SafeParcelReader.o(parcel, readInt);
            } else if (c == 3) {
                z = SafeParcelReader.o(parcel, readInt);
            } else if (c != 4) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                i = SafeParcelReader.w(parcel, readInt);
            }
        }
        SafeParcelReader.n(parcel, D);
        CardRequirements cardRequirements = new CardRequirements();
        cardRequirements.b = arrayList;
        cardRequirements.c = z2;
        cardRequirements.d = z;
        cardRequirements.e = i;
        return cardRequirements;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CardRequirements[] newArray(int i) {
        return new CardRequirements[i];
    }
}
