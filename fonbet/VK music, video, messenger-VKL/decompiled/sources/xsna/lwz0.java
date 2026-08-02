package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.wallet.ShippingAddressRequirements;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-wallet@@18.0.0 */
/* loaded from: classes13.dex */
public final class lwz0 implements Parcelable.Creator<ShippingAddressRequirements> {
    @Override // android.os.Parcelable.Creator
    public final ShippingAddressRequirements createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        ArrayList<String> arrayList = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                arrayList = SafeParcelReader.k(parcel, readInt);
            }
        }
        SafeParcelReader.n(parcel, D);
        ShippingAddressRequirements shippingAddressRequirements = new ShippingAddressRequirements();
        shippingAddressRequirements.b = arrayList;
        return shippingAddressRequirements;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ShippingAddressRequirements[] newArray(int i) {
        return new ShippingAddressRequirements[i];
    }
}
