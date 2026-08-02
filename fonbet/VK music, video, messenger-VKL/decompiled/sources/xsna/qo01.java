package xsna;

import android.net.Network;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.internal.zzaa;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public final class qo01 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        ArrayList arrayList = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        byte[] bArr = null;
        String str9 = null;
        zzaa zzaaVar = null;
        Integer num = null;
        Boolean bool = null;
        Network network = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = -1;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case 3:
                    str2 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 4:
                    str3 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 5:
                    str4 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 6:
                    str5 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 7:
                    i = SafeParcelReader.w(parcel, readInt);
                    break;
                case '\b':
                    arrayList = SafeParcelReader.m(parcel, readInt, WebImage.CREATOR);
                    break;
                case '\t':
                    i2 = SafeParcelReader.w(parcel, readInt);
                    break;
                case '\n':
                    i4 = SafeParcelReader.w(parcel, readInt);
                    break;
                case 11:
                    str6 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\f':
                    str7 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\r':
                    i3 = SafeParcelReader.w(parcel, readInt);
                    break;
                case 14:
                    str8 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 15:
                    bArr = SafeParcelReader.c(parcel, readInt);
                    break;
                case 16:
                    str9 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 17:
                    z = SafeParcelReader.o(parcel, readInt);
                    break;
                case 18:
                    zzaaVar = (zzaa) SafeParcelReader.h(parcel, readInt, zzaa.CREATOR);
                    break;
                case 19:
                    num = SafeParcelReader.x(parcel, readInt);
                    break;
                case 20:
                    bool = SafeParcelReader.p(parcel, readInt);
                    break;
                case 21:
                    network = (Network) SafeParcelReader.h(parcel, readInt, Network.CREATOR);
                    break;
                default:
                    SafeParcelReader.C(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, D);
        return new CastDevice(str, str2, str3, str4, str5, i, arrayList, i2, i4, str6, str7, i3, str8, bArr, str9, z, zzaaVar, num, bool, network);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CastDevice[i];
    }
}
