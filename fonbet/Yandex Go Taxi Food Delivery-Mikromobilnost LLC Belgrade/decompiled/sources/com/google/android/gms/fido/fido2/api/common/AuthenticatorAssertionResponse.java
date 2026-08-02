package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.u2f.api.common.SignResponseData;
import com.google.android.gms.internal.fido.zzgx;
import defpackage.bb1;
import defpackage.cvw;
import defpackage.hwa1;
import defpackage.ira1;
import defpackage.jy91;
import defpackage.mw4;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.p891;
import defpackage.xx91;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import ru.CryptoPro.reprov.x509.X509CertImpl;

/* loaded from: classes11.dex */
public class AuthenticatorAssertionResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator<AuthenticatorAssertionResponse> CREATOR = new zzj();
    private final zzgx zza;
    private final zzgx zzb;
    private final zzgx zzc;
    private final zzgx zzd;
    private final zzgx zze;

    public AuthenticatorAssertionResponse(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        cvw.l(bArr);
        zzgx m = zzgx.m(bArr.length, bArr);
        cvw.l(bArr2);
        zzgx m2 = zzgx.m(bArr2.length, bArr2);
        cvw.l(bArr3);
        zzgx m3 = zzgx.m(bArr3.length, bArr3);
        cvw.l(bArr4);
        zzgx m4 = zzgx.m(bArr4.length, bArr4);
        zzgx m5 = bArr5 == null ? null : zzgx.m(bArr5.length, bArr5);
        this.zza = m;
        this.zzb = m2;
        this.zzc = m3;
        this.zzd = m4;
        this.zze = m5;
    }

    public static AuthenticatorAssertionResponse deserializeFromBytes(byte[] bArr) {
        return (AuthenticatorAssertionResponse) hwa1.a(bArr, CREATOR);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorAssertionResponse)) {
            return false;
        }
        AuthenticatorAssertionResponse authenticatorAssertionResponse = (AuthenticatorAssertionResponse) obj;
        return ooc.m(this.zza, authenticatorAssertionResponse.zza) && ooc.m(this.zzb, authenticatorAssertionResponse.zzb) && ooc.m(this.zzc, authenticatorAssertionResponse.zzc) && ooc.m(this.zzd, authenticatorAssertionResponse.zzd) && ooc.m(this.zze, authenticatorAssertionResponse.zze);
    }

    public byte[] getAuthenticatorData() {
        return this.zzc.n();
    }

    public zzgx getAuthenticatorDataAsByteString() {
        return this.zzc;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse
    public byte[] getClientDataJSON() {
        return this.zzb.n();
    }

    public zzgx getClientDataJSONAsByteString() {
        return this.zzb;
    }

    @Deprecated
    public byte[] getKeyHandle() {
        return this.zza.n();
    }

    @Deprecated
    public zzgx getKeyHandleAsByteString() {
        return this.zza;
    }

    public byte[] getSignature() {
        return this.zzd.n();
    }

    public zzgx getSignatureAsByteString() {
        return this.zzd;
    }

    public byte[] getUserHandle() {
        zzgx zzgxVar = this.zze;
        if (zzgxVar == null) {
            return null;
        }
        return zzgxVar.n();
    }

    public zzgx getUserHandleAsByteString() {
        return this.zze;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.zza})), Integer.valueOf(Arrays.hashCode(new Object[]{this.zzb})), Integer.valueOf(Arrays.hashCode(new Object[]{this.zzc})), Integer.valueOf(Arrays.hashCode(new Object[]{this.zzd})), Integer.valueOf(Arrays.hashCode(new Object[]{this.zze}))});
    }

    @Override // com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse
    public byte[] serializeToBytes() {
        return hwa1.f(this);
    }

    public String toString() {
        p891 j = ira1.j(this);
        xx91 xx91Var = jy91.d;
        byte[] keyHandle = getKeyHandle();
        j.g(xx91Var.c(keyHandle.length, keyHandle), SignResponseData.JSON_RESPONSE_DATA_KEY_HANDLE);
        byte[] clientDataJSON = getClientDataJSON();
        j.g(xx91Var.c(clientDataJSON.length, clientDataJSON), "clientDataJSON");
        byte[] authenticatorData = getAuthenticatorData();
        j.g(xx91Var.c(authenticatorData.length, authenticatorData), "authenticatorData");
        byte[] signature = getSignature();
        j.g(xx91Var.c(signature.length, signature), X509CertImpl.SIGNATURE);
        byte[] userHandle = getUserHandle();
        if (userHandle != null) {
            j.g(xx91Var.c(userHandle.length, userHandle), "userHandle");
        }
        return j.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.V(parcel, 2, getKeyHandle(), false);
        bb1.V(parcel, 3, getClientDataJSON(), false);
        bb1.V(parcel, 4, getAuthenticatorData(), false);
        bb1.V(parcel, 5, getSignature(), false);
        bb1.V(parcel, 6, getUserHandle(), false);
        bb1.o0(parcel, n0);
    }

    public final JSONObject zza() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", mw4.b(getClientDataJSON()));
            jSONObject.put("authenticatorData", mw4.b(getAuthenticatorData()));
            jSONObject.put(X509CertImpl.SIGNATURE, mw4.b(getSignature()));
            if (this.zze != null) {
                jSONObject.put("userHandle", mw4.b(getUserHandle()));
            }
            return jSONObject;
        } catch (JSONException e) {
            ny61.n("Error encoding AuthenticatorAssertionResponse to JSON object", e);
            return null;
        }
    }
}
