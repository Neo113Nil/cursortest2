package com.google.android.gms.fido.fido2.api.common;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.fido.zzgx;
import defpackage.bb1;
import defpackage.hwa1;
import defpackage.ooc;
import java.util.Arrays;

/* loaded from: classes11.dex */
public class FidoCredentialDetails extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FidoCredentialDetails> CREATOR = new zzy();
    private final String zza;
    private final String zzb;
    private final zzgx zzc;
    private final zzgx zzd;
    private final boolean zze;
    private final boolean zzf;
    private final long zzg;
    private final Account zzh;
    private final boolean zzi;

    public FidoCredentialDetails(String str, String str2, byte[] bArr, byte[] bArr2, boolean z, boolean z2, long j, Account account, boolean z3) {
        zzgx m = bArr == null ? null : zzgx.m(bArr.length, bArr);
        zzgx zzgxVar = zzgx.a;
        zzgx m2 = zzgx.m(bArr2.length, bArr2);
        this.zza = str;
        this.zzb = str2;
        this.zzc = m;
        this.zzd = m2;
        this.zze = z;
        this.zzf = z2;
        this.zzg = j;
        this.zzh = account;
        this.zzi = z3;
    }

    public static FidoCredentialDetails deserializeFromBytes(byte[] bArr) {
        return (FidoCredentialDetails) hwa1.a(bArr, CREATOR);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FidoCredentialDetails)) {
            return false;
        }
        FidoCredentialDetails fidoCredentialDetails = (FidoCredentialDetails) obj;
        return ooc.m(this.zza, fidoCredentialDetails.zza) && ooc.m(this.zzb, fidoCredentialDetails.zzb) && ooc.m(this.zzc, fidoCredentialDetails.zzc) && ooc.m(this.zzd, fidoCredentialDetails.zzd) && this.zze == fidoCredentialDetails.zze && this.zzf == fidoCredentialDetails.zzf && this.zzi == fidoCredentialDetails.zzi && this.zzg == fidoCredentialDetails.zzg && ooc.m(this.zzh, fidoCredentialDetails.zzh);
    }

    public byte[] getCredentialId() {
        return this.zzd.n();
    }

    public zzgx getCredentialIdAsByteString() {
        return this.zzd;
    }

    public boolean getIsDiscoverable() {
        return this.zze;
    }

    public boolean getIsPaymentCredential() {
        return this.zzf;
    }

    public long getLastUsedTime() {
        return this.zzg;
    }

    public String getUserDisplayName() {
        return this.zzb;
    }

    public byte[] getUserId() {
        zzgx zzgxVar = this.zzc;
        if (zzgxVar == null) {
            return null;
        }
        return zzgxVar.n();
    }

    public zzgx getUserIdAsByteString() {
        return this.zzc;
    }

    public String getUserName() {
        return this.zza;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc, this.zzd, Boolean.valueOf(this.zze), Boolean.valueOf(this.zzf), Boolean.valueOf(this.zzi), Long.valueOf(this.zzg), this.zzh});
    }

    public byte[] serializeToBytes() {
        return hwa1.f(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.g0(parcel, 1, getUserName(), false);
        bb1.g0(parcel, 2, getUserDisplayName(), false);
        bb1.V(parcel, 3, getUserId(), false);
        bb1.V(parcel, 4, getCredentialId(), false);
        boolean isDiscoverable = getIsDiscoverable();
        bb1.m0(5, parcel, 4);
        parcel.writeInt(isDiscoverable ? 1 : 0);
        boolean isPaymentCredential = getIsPaymentCredential();
        bb1.m0(6, parcel, 4);
        parcel.writeInt(isPaymentCredential ? 1 : 0);
        long lastUsedTime = getLastUsedTime();
        bb1.m0(7, parcel, 8);
        parcel.writeLong(lastUsedTime);
        bb1.f0(parcel, 8, this.zzh, i, false);
        boolean z = this.zzi;
        bb1.m0(9, parcel, 4);
        parcel.writeInt(z ? 1 : 0);
        bb1.o0(parcel, n0);
    }
}
