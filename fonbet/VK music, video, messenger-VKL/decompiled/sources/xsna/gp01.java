package xsna;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class gp01 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        boolean z = false;
        boolean z2 = false;
        ArrayList<String> arrayList = null;
        int[] iArr = null;
        String str = null;
        IBinder iBinder = null;
        long j = 0;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    arrayList = SafeParcelReader.k(parcel, readInt);
                    break;
                case 3:
                    iArr = SafeParcelReader.d(parcel, readInt);
                    break;
                case 4:
                    j = SafeParcelReader.z(parcel, readInt);
                    break;
                case 5:
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case 6:
                    i = SafeParcelReader.w(parcel, readInt);
                    break;
                case 7:
                    i2 = SafeParcelReader.w(parcel, readInt);
                    break;
                case '\b':
                    i3 = SafeParcelReader.w(parcel, readInt);
                    break;
                case '\t':
                    i4 = SafeParcelReader.w(parcel, readInt);
                    break;
                case '\n':
                    i5 = SafeParcelReader.w(parcel, readInt);
                    break;
                case 11:
                    i6 = SafeParcelReader.w(parcel, readInt);
                    break;
                case '\f':
                    i7 = SafeParcelReader.w(parcel, readInt);
                    break;
                case '\r':
                    i8 = SafeParcelReader.w(parcel, readInt);
                    break;
                case 14:
                    i9 = SafeParcelReader.w(parcel, readInt);
                    break;
                case 15:
                    i10 = SafeParcelReader.w(parcel, readInt);
                    break;
                case 16:
                    i11 = SafeParcelReader.w(parcel, readInt);
                    break;
                case 17:
                    i12 = SafeParcelReader.w(parcel, readInt);
                    break;
                case 18:
                    i13 = SafeParcelReader.w(parcel, readInt);
                    break;
                case 19:
                    i14 = SafeParcelReader.w(parcel, readInt);
                    break;
                case 20:
                    i15 = SafeParcelReader.w(parcel, readInt);
                    break;
                case 21:
                    i16 = SafeParcelReader.w(parcel, readInt);
                    break;
                case 22:
                    i17 = SafeParcelReader.w(parcel, readInt);
                    break;
                case 23:
                    i18 = SafeParcelReader.w(parcel, readInt);
                    break;
                case 24:
                    i19 = SafeParcelReader.w(parcel, readInt);
                    break;
                case 25:
                    i20 = SafeParcelReader.w(parcel, readInt);
                    break;
                case 26:
                    i21 = SafeParcelReader.w(parcel, readInt);
                    break;
                case 27:
                    i22 = SafeParcelReader.w(parcel, readInt);
                    break;
                case 28:
                    i23 = SafeParcelReader.w(parcel, readInt);
                    break;
                case 29:
                    i24 = SafeParcelReader.w(parcel, readInt);
                    break;
                case 30:
                    i25 = SafeParcelReader.w(parcel, readInt);
                    break;
                case 31:
                    i26 = SafeParcelReader.w(parcel, readInt);
                    break;
                case ' ':
                    i27 = SafeParcelReader.w(parcel, readInt);
                    break;
                case '!':
                    iBinder = SafeParcelReader.v(parcel, readInt);
                    break;
                case '\"':
                    z = SafeParcelReader.o(parcel, readInt);
                    break;
                case '#':
                    z2 = SafeParcelReader.o(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.C(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, D);
        return new NotificationOptions(arrayList, iArr, j, str, i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, iBinder, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new NotificationOptions[i];
    }
}
