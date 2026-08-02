package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.cvw;
import defpackage.oyr;
import java.util.Arrays;

/* loaded from: classes11.dex */
public class FidoAppIdExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FidoAppIdExtension> CREATOR = new zzx();
    private final String zza;

    public FidoAppIdExtension(String str) {
        cvw.l(str);
        this.zza = str;
    }

    public boolean equals(Object obj) {
        if (obj instanceof FidoAppIdExtension) {
            return this.zza.equals(((FidoAppIdExtension) obj).zza);
        }
        return false;
    }

    public String getAppId() {
        return this.zza;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza});
    }

    public final String toString() {
        return oyr.t(new StringBuilder("FidoAppIdExtension{appid='"), this.zza, "'}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.g0(parcel, 2, getAppId(), false);
        bb1.o0(parcel, n0);
    }
}
