package com.google.android.gms.fido.fido2.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b64;
import defpackage.bb1;
import defpackage.cvw;
import defpackage.hwa1;
import defpackage.mw4;
import defpackage.ooc;
import defpackage.oyr;
import java.util.Arrays;

/* loaded from: classes11.dex */
public class BrowserPublicKeyCredentialCreationOptions extends BrowserRequestOptions {
    public static final Parcelable.Creator<BrowserPublicKeyCredentialCreationOptions> CREATOR = new zzn();
    private final PublicKeyCredentialCreationOptions zza;
    private final Uri zzb;
    private final byte[] zzc;

    public BrowserPublicKeyCredentialCreationOptions(PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions, Uri uri, byte[] bArr) {
        cvw.l(publicKeyCredentialCreationOptions);
        this.zza = publicKeyCredentialCreationOptions;
        zzc(uri);
        this.zzb = uri;
        zzd(bArr);
        this.zzc = bArr;
    }

    public static BrowserPublicKeyCredentialCreationOptions deserializeFromBytes(byte[] bArr) {
        return (BrowserPublicKeyCredentialCreationOptions) hwa1.a(bArr, CREATOR);
    }

    public static /* bridge */ /* synthetic */ Uri zza(Uri uri) {
        zzc(uri);
        return uri;
    }

    public static /* bridge */ /* synthetic */ byte[] zzb(byte[] bArr) {
        zzd(bArr);
        return bArr;
    }

    private static Uri zzc(Uri uri) {
        cvw.l(uri);
        cvw.d("origin scheme must be non-empty", uri.getScheme() != null);
        cvw.d("origin authority must be non-empty", uri.getAuthority() != null);
        return uri;
    }

    private static byte[] zzd(byte[] bArr) {
        boolean z = true;
        if (bArr != null && bArr.length != 32) {
            z = false;
        }
        cvw.d("clientDataHash must be 32 bytes long", z);
        return bArr;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BrowserPublicKeyCredentialCreationOptions)) {
            return false;
        }
        BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions = (BrowserPublicKeyCredentialCreationOptions) obj;
        return ooc.m(this.zza, browserPublicKeyCredentialCreationOptions.zza) && ooc.m(this.zzb, browserPublicKeyCredentialCreationOptions.zzb);
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public AuthenticationExtensions getAuthenticationExtensions() {
        return this.zza.getAuthenticationExtensions();
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public byte[] getChallenge() {
        return this.zza.getChallenge();
    }

    @Override // com.google.android.gms.fido.fido2.api.common.BrowserRequestOptions
    public byte[] getClientDataHash() {
        return this.zzc;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.BrowserRequestOptions
    public Uri getOrigin() {
        return this.zzb;
    }

    public PublicKeyCredentialCreationOptions getPublicKeyCredentialCreationOptions() {
        return this.zza;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public Integer getRequestId() {
        return this.zza.getRequestId();
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public Double getTimeoutSeconds() {
        return this.zza.getTimeoutSeconds();
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public TokenBinding getTokenBinding() {
        return this.zza.getTokenBinding();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public byte[] serializeToBytes() {
        return hwa1.f(this);
    }

    public final String toString() {
        byte[] bArr = this.zzc;
        Uri uri = this.zzb;
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(uri);
        return oyr.t(b64.v("BrowserPublicKeyCredentialCreationOptions{\n publicKeyCredentialCreationOptions=", valueOf, ", \n origin=", valueOf2, ", \n clientDataHash="), mw4.b(bArr), "}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.f0(parcel, 2, getPublicKeyCredentialCreationOptions(), i, false);
        bb1.f0(parcel, 3, getOrigin(), i, false);
        bb1.V(parcel, 4, getClientDataHash(), false);
        bb1.o0(parcel, n0);
    }
}
