package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.server.converter.StringToIntConverter;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public final class slz0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        StringToIntConverter stringToIntConverter = null;
        int i = 0;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = SafeParcelReader.w(parcel, readInt);
            } else if (c != 2) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                stringToIntConverter = (StringToIntConverter) SafeParcelReader.h(parcel, readInt, StringToIntConverter.CREATOR);
            }
        }
        SafeParcelReader.n(parcel, D);
        return new com.google.android.gms.common.server.converter.zaa(i, stringToIntConverter);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new com.google.android.gms.common.server.converter.zaa[i];
    }
}
