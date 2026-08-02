package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs;
import com.google.android.gms.fido.fido2.api.common.UvmEntries;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes12.dex */
public final class a501 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        UvmEntries uvmEntries = null;
        com.google.android.gms.fido.fido2.api.common.zzf zzfVar = null;
        AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs = null;
        com.google.android.gms.fido.fido2.api.common.zzh zzhVar = null;
        String str = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                uvmEntries = (UvmEntries) SafeParcelReader.h(parcel, readInt, UvmEntries.CREATOR);
            } else if (c == 2) {
                zzfVar = (com.google.android.gms.fido.fido2.api.common.zzf) SafeParcelReader.h(parcel, readInt, com.google.android.gms.fido.fido2.api.common.zzf.CREATOR);
            } else if (c == 3) {
                authenticationExtensionsCredPropsOutputs = (AuthenticationExtensionsCredPropsOutputs) SafeParcelReader.h(parcel, readInt, AuthenticationExtensionsCredPropsOutputs.CREATOR);
            } else if (c == 4) {
                zzhVar = (com.google.android.gms.fido.fido2.api.common.zzh) SafeParcelReader.h(parcel, readInt, com.google.android.gms.fido.fido2.api.common.zzh.CREATOR);
            } else if (c != 5) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                str = SafeParcelReader.i(parcel, readInt);
            }
        }
        SafeParcelReader.n(parcel, D);
        return new AuthenticationExtensionsClientOutputs(uvmEntries, zzfVar, authenticationExtensionsCredPropsOutputs, zzhVar, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AuthenticationExtensionsClientOutputs[i];
    }
}
