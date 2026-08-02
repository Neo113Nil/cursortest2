package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class xm01 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        String str = null;
        ArrayList<String> arrayList = null;
        LaunchOptions launchOptions = null;
        CastMediaOptions castMediaOptions = null;
        ArrayList<String> arrayList2 = null;
        com.google.android.gms.cast.framework.zzk zzkVar = null;
        com.google.android.gms.cast.framework.zzm zzmVar = null;
        double d = 0.0d;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case 3:
                    arrayList = SafeParcelReader.k(parcel, readInt);
                    break;
                case 4:
                    z = SafeParcelReader.o(parcel, readInt);
                    break;
                case 5:
                    launchOptions = (LaunchOptions) SafeParcelReader.h(parcel, readInt, LaunchOptions.CREATOR);
                    break;
                case 6:
                    z2 = SafeParcelReader.o(parcel, readInt);
                    break;
                case 7:
                    castMediaOptions = (CastMediaOptions) SafeParcelReader.h(parcel, readInt, CastMediaOptions.CREATOR);
                    break;
                case '\b':
                    z3 = SafeParcelReader.o(parcel, readInt);
                    break;
                case '\t':
                    d = SafeParcelReader.r(parcel, readInt);
                    break;
                case '\n':
                    z4 = SafeParcelReader.o(parcel, readInt);
                    break;
                case 11:
                    z5 = SafeParcelReader.o(parcel, readInt);
                    break;
                case '\f':
                    z6 = SafeParcelReader.o(parcel, readInt);
                    break;
                case '\r':
                    arrayList2 = SafeParcelReader.k(parcel, readInt);
                    break;
                case 14:
                    z7 = SafeParcelReader.o(parcel, readInt);
                    break;
                case 15:
                    SafeParcelReader.w(parcel, readInt);
                    break;
                case 16:
                    z8 = SafeParcelReader.o(parcel, readInt);
                    break;
                case 17:
                    zzkVar = (com.google.android.gms.cast.framework.zzk) SafeParcelReader.h(parcel, readInt, com.google.android.gms.cast.framework.zzk.CREATOR);
                    break;
                case 18:
                    zzmVar = (com.google.android.gms.cast.framework.zzm) SafeParcelReader.h(parcel, readInt, com.google.android.gms.cast.framework.zzm.CREATOR);
                    break;
                case 19:
                    z9 = SafeParcelReader.o(parcel, readInt);
                    break;
                case 20:
                    z10 = SafeParcelReader.o(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.C(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, D);
        return new CastOptions(str, arrayList, z, launchOptions, z2, castMediaOptions, z3, d, z4, z5, z6, arrayList2, z7, z8, zzkVar, zzmVar, z9, z10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CastOptions[i];
    }
}
