package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.fido.zzgx;
import defpackage.b64;
import defpackage.bb1;
import defpackage.h6a1;
import defpackage.mw4;
import defpackage.ooc;
import defpackage.oyr;
import defpackage.s7a1;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class zzai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzai> CREATOR = new zzaj();
    static final s7a1 zza = new h6a1(1);
    static final s7a1 zzb = new h6a1(2);
    static final s7a1 zzc = new h6a1(3);
    static final s7a1 zzd = new h6a1(4);
    private final zzgx zze;
    private final zzgx zzf;
    private final zzgx zzg;
    private final int zzh;

    public zzai(zzgx zzgxVar, zzgx zzgxVar2, zzgx zzgxVar3, int i) {
        this.zze = zzgxVar;
        this.zzf = zzgxVar2;
        this.zzg = zzgxVar3;
        this.zzh = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzai)) {
            return false;
        }
        zzai zzaiVar = (zzai) obj;
        return ooc.m(this.zze, zzaiVar.zze) && ooc.m(this.zzf, zzaiVar.zzf) && ooc.m(this.zzg, zzaiVar.zzg) && this.zzh == zzaiVar.zzh;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zze, this.zzf, this.zzg, Integer.valueOf(this.zzh)});
    }

    public final String toString() {
        String b = mw4.b(zza());
        String b2 = mw4.b(zzc());
        String b3 = mw4.b(zzb());
        StringBuilder v = b64.v("HmacSecretExtension{coseKeyAgreement=", b, ", saltEnc=", b2, ", saltAuth=");
        v.append(b3);
        v.append(", getPinUvAuthProtocol=");
        return oyr.m(this.zzh, "}", v);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.V(parcel, 1, zza(), false);
        bb1.V(parcel, 2, zzc(), false);
        bb1.V(parcel, 3, zzb(), false);
        int i2 = this.zzh;
        bb1.m0(4, parcel, 4);
        parcel.writeInt(i2);
        bb1.o0(parcel, n0);
    }

    public final byte[] zza() {
        zzgx zzgxVar = this.zze;
        if (zzgxVar == null) {
            return null;
        }
        return zzgxVar.n();
    }

    public final byte[] zzb() {
        zzgx zzgxVar = this.zzg;
        if (zzgxVar == null) {
            return null;
        }
        return zzgxVar.n();
    }

    public final byte[] zzc() {
        zzgx zzgxVar = this.zzf;
        if (zzgxVar == null) {
            return null;
        }
        return zzgxVar.n();
    }
}
