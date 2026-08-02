package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.cvw;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class zzag extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzag> CREATOR = new zzah();
    private final String zza;

    public zzag(String str) {
        cvw.l(str);
        this.zza = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzag) {
            return this.zza.equals(((zzag) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int n0 = bb1.n0(parcel, 20293);
        bb1.g0(parcel, 1, str, false);
        bb1.o0(parcel, n0);
    }
}
