package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.wallet.wobs.LabelValue;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-wallet@@18.0.0 */
/* loaded from: classes13.dex */
public final class p801 implements Parcelable.Creator<LabelValueRow> {
    @Override // android.os.Parcelable.Creator
    public final LabelValueRow createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        ArrayList<LabelValue> arrayList = new ArrayList<>();
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = SafeParcelReader.i(parcel, readInt);
            } else if (c == 3) {
                str2 = SafeParcelReader.i(parcel, readInt);
            } else if (c != 4) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                arrayList = SafeParcelReader.m(parcel, readInt, LabelValue.CREATOR);
            }
        }
        SafeParcelReader.n(parcel, D);
        LabelValueRow labelValueRow = new LabelValueRow();
        labelValueRow.b = str;
        labelValueRow.c = str2;
        labelValueRow.d = arrayList;
        return labelValueRow;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LabelValueRow[] newArray(int i) {
        return new LabelValueRow[i];
    }
}
