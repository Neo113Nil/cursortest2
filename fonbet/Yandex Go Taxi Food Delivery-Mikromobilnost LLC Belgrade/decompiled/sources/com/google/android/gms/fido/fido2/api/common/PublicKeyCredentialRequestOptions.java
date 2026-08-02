package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.internal.fido.l;
import defpackage.bb1;
import defpackage.cvw;
import defpackage.g8e;
import defpackage.hwa1;
import defpackage.mw4;
import defpackage.ooc;
import defpackage.tse0;
import defpackage.unr0;
import defpackage.yci0;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes11.dex */
public class PublicKeyCredentialRequestOptions extends RequestOptions {
    public static final Parcelable.Creator<PublicKeyCredentialRequestOptions> CREATOR = new zzar();
    private final byte[] zza;
    private final Double zzb;
    private final String zzc;
    private final List zzd;
    private final Integer zze;
    private final TokenBinding zzf;
    private final UserVerificationRequirement zzg;
    private final AuthenticationExtensions zzh;
    private final Long zzi;
    private ResultReceiver zzj;

    public PublicKeyCredentialRequestOptions(byte[] bArr, Double d, String str, List list, Integer num, TokenBinding tokenBinding, String str2, AuthenticationExtensions authenticationExtensions, Long l, String str3, ResultReceiver resultReceiver) {
        this.zzj = resultReceiver;
        if (str3 != null) {
            l.a();
            throw null;
        }
        cvw.l(bArr);
        this.zza = bArr;
        this.zzb = d;
        cvw.l(str);
        this.zzc = str;
        this.zzd = list;
        this.zze = num;
        this.zzf = tokenBinding;
        this.zzi = l;
        if (str2 != null) {
            try {
                this.zzg = UserVerificationRequirement.fromString(str2);
            } catch (zzbc e) {
                yci0.r(e);
                throw null;
            }
        } else {
            this.zzg = null;
        }
        this.zzh = authenticationExtensions;
    }

    public static PublicKeyCredentialRequestOptions deserializeFromBytes(byte[] bArr) {
        return (PublicKeyCredentialRequestOptions) hwa1.a(bArr, CREATOR);
    }

    public boolean equals(Object obj) {
        List list;
        List list2;
        if (!(obj instanceof PublicKeyCredentialRequestOptions)) {
            return false;
        }
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) obj;
        return Arrays.equals(this.zza, publicKeyCredentialRequestOptions.zza) && ooc.m(this.zzb, publicKeyCredentialRequestOptions.zzb) && ooc.m(this.zzc, publicKeyCredentialRequestOptions.zzc) && (((list = this.zzd) == null && publicKeyCredentialRequestOptions.zzd == null) || (list != null && (list2 = publicKeyCredentialRequestOptions.zzd) != null && list.containsAll(list2) && publicKeyCredentialRequestOptions.zzd.containsAll(this.zzd))) && ooc.m(this.zze, publicKeyCredentialRequestOptions.zze) && ooc.m(this.zzf, publicKeyCredentialRequestOptions.zzf) && ooc.m(this.zzg, publicKeyCredentialRequestOptions.zzg) && ooc.m(this.zzh, publicKeyCredentialRequestOptions.zzh) && ooc.m(this.zzi, publicKeyCredentialRequestOptions.zzi);
    }

    public List<PublicKeyCredentialDescriptor> getAllowList() {
        return this.zzd;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public AuthenticationExtensions getAuthenticationExtensions() {
        return this.zzh;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public byte[] getChallenge() {
        return this.zza;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public Integer getRequestId() {
        return this.zze;
    }

    public String getRpId() {
        return this.zzc;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public Double getTimeoutSeconds() {
        return this.zzb;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public TokenBinding getTokenBinding() {
        return this.zzf;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.zza)), this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi});
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public byte[] serializeToBytes() {
        l.b();
        throw null;
    }

    public final String toString() {
        AuthenticationExtensions authenticationExtensions = this.zzh;
        UserVerificationRequirement userVerificationRequirement = this.zzg;
        TokenBinding tokenBinding = this.zzf;
        List list = this.zzd;
        String b = mw4.b(this.zza);
        String valueOf = String.valueOf(list);
        String valueOf2 = String.valueOf(tokenBinding);
        String valueOf3 = String.valueOf(userVerificationRequirement);
        String valueOf4 = String.valueOf(authenticationExtensions);
        StringBuilder x = unr0.x("PublicKeyCredentialRequestOptions{\n challenge=", b, ", \n timeoutSeconds=");
        x.append(this.zzb);
        x.append(", \n rpId='");
        g8e.D(x, this.zzc, "', \n allowList=", valueOf, ", \n requestId=");
        tse0.w(this.zze, ", \n tokenBinding=", valueOf2, ", \n userVerification=", x);
        g8e.D(x, valueOf3, ", \n authenticationExtensions=", valueOf4, ", \n longRequestId=");
        x.append(this.zzi);
        x.append("}");
        return x.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.V(parcel, 2, getChallenge(), false);
        bb1.X(parcel, 3, getTimeoutSeconds());
        bb1.g0(parcel, 4, getRpId(), false);
        bb1.k0(parcel, 5, getAllowList(), false);
        bb1.d0(parcel, 6, getRequestId());
        bb1.f0(parcel, 7, getTokenBinding(), i, false);
        UserVerificationRequirement userVerificationRequirement = this.zzg;
        bb1.g0(parcel, 8, userVerificationRequirement == null ? null : userVerificationRequirement.toString(), false);
        bb1.f0(parcel, 9, getAuthenticationExtensions(), i, false);
        bb1.e0(parcel, 10, this.zzi);
        bb1.f0(parcel, 12, this.zzj, i, false);
        bb1.o0(parcel, n0);
    }

    public final ResultReceiver zza() {
        return this.zzj;
    }

    public final UserVerificationRequirement zzb() {
        return this.zzg;
    }

    public final Long zzc() {
        return this.zzi;
    }
}
