package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.fido.zzgx;
import defpackage.bb1;
import defpackage.cvw;
import defpackage.ooc;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new zzr();
    private final long zza;
    private final zzgx zzb;
    private final zzgx zzc;
    private final zzgx zzd;

    public zzq(long j, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        cvw.l(bArr);
        zzgx m = zzgx.m(bArr.length, bArr);
        cvw.l(bArr2);
        zzgx m2 = zzgx.m(bArr2.length, bArr2);
        cvw.l(bArr3);
        zzgx m3 = zzgx.m(bArr3.length, bArr3);
        this.zza = j;
        this.zzb = m;
        this.zzc = m2;
        this.zzd = m3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzq)) {
            return false;
        }
        zzq zzqVar = (zzq) obj;
        return this.zza == zzqVar.zza && ooc.m(this.zzb, zzqVar.zzb) && ooc.m(this.zzc, zzqVar.zzc) && ooc.m(this.zzd, zzqVar.zzd);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza), this.zzb, this.zzc, this.zzd});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.zza;
        int n0 = bb1.n0(parcel, 20293);
        bb1.m0(1, parcel, 8);
        parcel.writeLong(j);
        bb1.V(parcel, 2, this.zzb.n(), false);
        bb1.V(parcel, 3, this.zzc.n(), false);
        bb1.V(parcel, 4, this.zzd.n(), false);
        bb1.o0(parcel, n0);
    }
}
