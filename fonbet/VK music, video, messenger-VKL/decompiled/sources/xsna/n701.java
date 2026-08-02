package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.TextTrackStyle;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public final class n701 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        String str = null;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        float f = 0.0f;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    f = SafeParcelReader.t(parcel, readInt);
                    break;
                case 3:
                    i = SafeParcelReader.w(parcel, readInt);
                    break;
                case 4:
                    i2 = SafeParcelReader.w(parcel, readInt);
                    break;
                case 5:
                    i3 = SafeParcelReader.w(parcel, readInt);
                    break;
                case 6:
                    i4 = SafeParcelReader.w(parcel, readInt);
                    break;
                case 7:
                    i5 = SafeParcelReader.w(parcel, readInt);
                    break;
                case '\b':
                    i6 = SafeParcelReader.w(parcel, readInt);
                    break;
                case '\t':
                    i7 = SafeParcelReader.w(parcel, readInt);
                    break;
                case '\n':
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case 11:
                    i8 = SafeParcelReader.w(parcel, readInt);
                    break;
                case '\f':
                    i9 = SafeParcelReader.w(parcel, readInt);
                    break;
                case '\r':
                    str2 = SafeParcelReader.i(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.C(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, D);
        return new TextTrackStyle(f, i, i2, i3, i4, i5, i6, i7, str, i8, i9, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new TextTrackStyle[i];
    }
}
