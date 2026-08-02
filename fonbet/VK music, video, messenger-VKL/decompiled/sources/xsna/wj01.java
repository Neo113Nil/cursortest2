package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import com.google.android.gms.maps.model.PolygonOptions;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* loaded from: classes13.dex */
public final class wj01 implements Parcelable.Creator<PolygonOptions> {
    @Override // android.os.Parcelable.Creator
    public final PolygonOptions createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = null;
        float f = 0.0f;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i3 = 0;
        ArrayList arrayList3 = null;
        float f2 = 0.0f;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    arrayList3 = SafeParcelReader.m(parcel, readInt, LatLng.CREATOR);
                    break;
                case 3:
                    SafeParcelReader.y(parcel, readInt, arrayList, wj01.class.getClassLoader());
                    break;
                case 4:
                    f2 = SafeParcelReader.t(parcel, readInt);
                    break;
                case 5:
                    i = SafeParcelReader.w(parcel, readInt);
                    break;
                case 6:
                    i2 = SafeParcelReader.w(parcel, readInt);
                    break;
                case 7:
                    f = SafeParcelReader.t(parcel, readInt);
                    break;
                case '\b':
                    z = SafeParcelReader.o(parcel, readInt);
                    break;
                case '\t':
                    z2 = SafeParcelReader.o(parcel, readInt);
                    break;
                case '\n':
                    z3 = SafeParcelReader.o(parcel, readInt);
                    break;
                case 11:
                    i3 = SafeParcelReader.w(parcel, readInt);
                    break;
                case '\f':
                    arrayList2 = SafeParcelReader.m(parcel, readInt, PatternItem.CREATOR);
                    break;
                default:
                    SafeParcelReader.C(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, D);
        return new PolygonOptions(arrayList3, arrayList, f2, i, i2, f, z, z2, z3, i3, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PolygonOptions[] newArray(int i) {
        return new PolygonOptions[i];
    }
}
