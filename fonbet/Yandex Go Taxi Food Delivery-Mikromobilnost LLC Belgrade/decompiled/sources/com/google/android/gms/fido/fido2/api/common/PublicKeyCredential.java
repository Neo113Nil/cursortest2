package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.fido.l;
import com.google.android.gms.internal.fido.zzgx;
import defpackage.b64;
import defpackage.cvw;
import defpackage.g8e;
import defpackage.hwa1;
import defpackage.mw4;
import defpackage.ny61;
import defpackage.ooc;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class PublicKeyCredential extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredential> CREATOR = new zzao();
    private final String zza;
    private final String zzb;
    private final zzgx zzc;
    private final AuthenticatorAttestationResponse zzd;
    private final AuthenticatorAssertionResponse zze;
    private final AuthenticatorErrorResponse zzf;
    private final AuthenticationExtensionsClientOutputs zzg;
    private final String zzh;
    private String zzi;

    private PublicKeyCredential(String str, String str2, zzgx zzgxVar, AuthenticatorAttestationResponse authenticatorAttestationResponse, AuthenticatorAssertionResponse authenticatorAssertionResponse, AuthenticatorErrorResponse authenticatorErrorResponse, AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs, String str3, String str4) {
        boolean z = false;
        cvw.d("Must provide a response object.", (authenticatorAttestationResponse != null && authenticatorAssertionResponse == null && authenticatorErrorResponse == null) || (authenticatorAttestationResponse == null && authenticatorAssertionResponse != null && authenticatorErrorResponse == null) || (authenticatorAttestationResponse == null && authenticatorAssertionResponse == null && authenticatorErrorResponse != null));
        if (authenticatorErrorResponse != null || (str != null && zzgxVar != null)) {
            z = true;
        }
        cvw.d("Must provide id and rawId if not an error response.", z);
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzgxVar;
        this.zzd = authenticatorAttestationResponse;
        this.zze = authenticatorAssertionResponse;
        this.zzf = authenticatorErrorResponse;
        this.zzg = authenticationExtensionsClientOutputs;
        this.zzh = str3;
        this.zzi = null;
    }

    public static PublicKeyCredential deserializeFromBytes(byte[] bArr) {
        return (PublicKeyCredential) hwa1.a(bArr, CREATOR);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredential)) {
            return false;
        }
        PublicKeyCredential publicKeyCredential = (PublicKeyCredential) obj;
        return ooc.m(this.zza, publicKeyCredential.zza) && ooc.m(this.zzb, publicKeyCredential.zzb) && ooc.m(this.zzc, publicKeyCredential.zzc) && ooc.m(this.zzd, publicKeyCredential.zzd) && ooc.m(this.zze, publicKeyCredential.zze) && ooc.m(this.zzf, publicKeyCredential.zzf) && ooc.m(this.zzg, publicKeyCredential.zzg) && ooc.m(this.zzh, publicKeyCredential.zzh);
    }

    public String getAuthenticatorAttachment() {
        return this.zzh;
    }

    public AuthenticationExtensionsClientOutputs getClientExtensionResults() {
        return this.zzg;
    }

    public String getId() {
        return this.zza;
    }

    public byte[] getRawId() {
        zzgx zzgxVar = this.zzc;
        if (zzgxVar == null) {
            return null;
        }
        return zzgxVar.n();
    }

    public zzgx getRawIdAsByteString() {
        return this.zzc;
    }

    public AuthenticatorResponse getResponse() {
        AuthenticatorAttestationResponse authenticatorAttestationResponse = this.zzd;
        if (authenticatorAttestationResponse != null) {
            return authenticatorAttestationResponse;
        }
        AuthenticatorAssertionResponse authenticatorAssertionResponse = this.zze;
        if (authenticatorAssertionResponse != null) {
            return authenticatorAssertionResponse;
        }
        AuthenticatorErrorResponse authenticatorErrorResponse = this.zzf;
        if (authenticatorErrorResponse != null) {
            return authenticatorErrorResponse;
        }
        ny61.r("No response set.");
        return null;
    }

    public String getType() {
        return this.zzb;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc, this.zze, this.zzd, this.zzf, this.zzg, this.zzh});
    }

    public byte[] serializeToBytes() {
        return hwa1.f(this);
    }

    public String toJson() {
        return zza().toString();
    }

    public final String toString() {
        zzgx zzgxVar = this.zzc;
        byte[] n = zzgxVar == null ? null : zzgxVar.n();
        String str = this.zzb;
        String str2 = this.zza;
        AuthenticatorAttestationResponse authenticatorAttestationResponse = this.zzd;
        AuthenticatorAssertionResponse authenticatorAssertionResponse = this.zze;
        AuthenticatorErrorResponse authenticatorErrorResponse = this.zzf;
        AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = this.zzg;
        String str3 = this.zzh;
        String b = mw4.b(n);
        String valueOf = String.valueOf(authenticatorAttestationResponse);
        String valueOf2 = String.valueOf(authenticatorAssertionResponse);
        String valueOf3 = String.valueOf(authenticatorErrorResponse);
        String valueOf4 = String.valueOf(authenticationExtensionsClientOutputs);
        StringBuilder v = b64.v("PublicKeyCredential{\n id='", str2, "', \n type='", str, "', \n rawId=");
        g8e.D(v, b, ", \n registerResponse=", valueOf, ", \n signResponse=");
        g8e.D(v, valueOf2, ", \n errorResponse=", valueOf3, ", \n extensionsClientOutputs=");
        return g8e.r(v, valueOf4, ", \n authenticatorAttachment='", str3, "'}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        l.a();
        throw null;
    }

    public final JSONObject zza() {
        JSONObject jSONObject;
        try {
            JSONObject jSONObject2 = new JSONObject();
            zzgx zzgxVar = this.zzc;
            if (zzgxVar != null && zzgxVar.n().length > 0) {
                jSONObject2.put("rawId", mw4.b(this.zzc.n()));
            }
            String str = this.zzh;
            if (str != null) {
                jSONObject2.put("authenticatorAttachment", str);
            }
            String str2 = this.zzb;
            if (str2 != null && this.zzf == null) {
                jSONObject2.put("type", str2);
            }
            String str3 = this.zza;
            if (str3 != null) {
                jSONObject2.put("id", str3);
            }
            String str4 = "response";
            AuthenticatorAssertionResponse authenticatorAssertionResponse = this.zze;
            boolean z = true;
            if (authenticatorAssertionResponse != null) {
                jSONObject = authenticatorAssertionResponse.zza();
            } else {
                AuthenticatorAttestationResponse authenticatorAttestationResponse = this.zzd;
                if (authenticatorAttestationResponse != null) {
                    jSONObject = authenticatorAttestationResponse.zza();
                } else {
                    AuthenticatorErrorResponse authenticatorErrorResponse = this.zzf;
                    z = false;
                    if (authenticatorErrorResponse != null) {
                        jSONObject = authenticatorErrorResponse.zza();
                        str4 = "error";
                    } else {
                        jSONObject = null;
                    }
                }
            }
            if (jSONObject != null) {
                jSONObject2.put(str4, jSONObject);
            }
            AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = this.zzg;
            if (authenticationExtensionsClientOutputs != null) {
                jSONObject2.put("clientExtensionResults", authenticationExtensionsClientOutputs.zza());
                return jSONObject2;
            }
            if (z) {
                jSONObject2.put("clientExtensionResults", new JSONObject());
            }
            return jSONObject2;
        } catch (JSONException e) {
            ny61.n("Error encoding PublicKeyCredential to JSON object", e);
            return null;
        }
    }

    public PublicKeyCredential(String str, String str2, byte[] bArr, AuthenticatorAttestationResponse authenticatorAttestationResponse, AuthenticatorAssertionResponse authenticatorAssertionResponse, AuthenticatorErrorResponse authenticatorErrorResponse, AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs, String str3, String str4) {
        this(str, str2, bArr == null ? null : zzgx.m(bArr.length, bArr), authenticatorAttestationResponse, authenticatorAssertionResponse, authenticatorErrorResponse, authenticationExtensionsClientOutputs, str3, str4);
    }
}
