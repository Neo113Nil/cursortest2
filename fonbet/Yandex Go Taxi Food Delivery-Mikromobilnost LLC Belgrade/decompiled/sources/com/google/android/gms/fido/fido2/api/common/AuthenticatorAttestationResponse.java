package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.u2f.api.common.SignResponseData;
import com.google.android.gms.internal.fido.i;
import com.google.android.gms.internal.fido.zzcj;
import com.google.android.gms.internal.fido.zzgx;
import com.google.android.gms.internal.fido.zzhj;
import com.google.android.gms.internal.fido.zzho;
import defpackage.bb1;
import defpackage.bwa1;
import defpackage.cvw;
import defpackage.d7a1;
import defpackage.h6a1;
import defpackage.hwa1;
import defpackage.ira1;
import defpackage.iwa1;
import defpackage.jy91;
import defpackage.mw4;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.p891;
import defpackage.s7a1;
import defpackage.w6a1;
import defpackage.xx91;
import defpackage.zr10;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes11.dex */
public class AuthenticatorAttestationResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator<AuthenticatorAttestationResponse> CREATOR = new zzk();
    private final zzgx zza;
    private final zzgx zzb;
    private final zzgx zzc;
    private final String[] zzd;

    public AuthenticatorAttestationResponse(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        cvw.l(bArr);
        zzgx m = zzgx.m(bArr.length, bArr);
        cvw.l(bArr2);
        zzgx m2 = zzgx.m(bArr2.length, bArr2);
        cvw.l(bArr3);
        zzgx m3 = zzgx.m(bArr3.length, bArr3);
        this.zza = m;
        this.zzb = m2;
        this.zzc = m3;
        cvw.l(strArr);
        this.zzd = strArr;
    }

    public static AuthenticatorAttestationResponse deserializeFromBytes(byte[] bArr) {
        return (AuthenticatorAttestationResponse) hwa1.a(bArr, CREATOR);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorAttestationResponse)) {
            return false;
        }
        AuthenticatorAttestationResponse authenticatorAttestationResponse = (AuthenticatorAttestationResponse) obj;
        return ooc.m(this.zza, authenticatorAttestationResponse.zza) && ooc.m(this.zzb, authenticatorAttestationResponse.zzb) && ooc.m(this.zzc, authenticatorAttestationResponse.zzc);
    }

    public byte[] getAttestationObject() {
        return this.zzc.n();
    }

    public zzgx getAttestationObjectAsByteString() {
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

    public zzgx getKeyHandleAsByteString() {
        return this.zza;
    }

    public String[] getTransports() {
        return this.zzd;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.zza})), Integer.valueOf(Arrays.hashCode(new Object[]{this.zzb})), Integer.valueOf(Arrays.hashCode(new Object[]{this.zzc}))});
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
        byte[] attestationObject = getAttestationObject();
        j.g(xx91Var.c(attestationObject.length, attestationObject), "attestationObject");
        j.g(Arrays.toString(this.zzd), "transports");
        return j.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.V(parcel, 2, getKeyHandle(), false);
        bb1.V(parcel, 3, getClientDataJSON(), false);
        bb1.V(parcel, 4, getAttestationObject(), false);
        bb1.h0(parcel, 5, getTransports(), false);
        bb1.o0(parcel, n0);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x020d A[Catch: JSONException -> 0x019e, TRY_LEAVE, TryCatch #5 {JSONException -> 0x019e, blocks: (B:51:0x01f7, B:53:0x020d, B:59:0x012f, B:61:0x013a, B:66:0x014e, B:69:0x016a, B:71:0x0180, B:73:0x0186, B:74:0x01a4, B:75:0x01a9, B:76:0x01aa, B:77:0x01af, B:82:0x01ba, B:84:0x01c7, B:86:0x01d5, B:87:0x01e9, B:88:0x01ee, B:89:0x01ef, B:90:0x01f4, B:92:0x0219, B:93:0x021e, B:96:0x0222, B:97:0x0229, B:101:0x022a, B:102:0x0231, B:110:0x0235, B:115:0x023f, B:116:0x0246, B:111:0x023b, B:123:0x024d, B:124:0x0254, B:127:0x0256, B:128:0x025d, B:134:0x0264, B:135:0x026b, B:138:0x026d, B:139:0x0274, B:143:0x0276, B:144:0x027f, B:22:0x0067), top: B:21:0x0067, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JSONObject zza() {
        JSONObject jSONObject;
        byte[] bArr;
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (this.zzb != null) {
                jSONObject2.put("clientDataJSON", mw4.b(getClientDataJSON()));
            }
            if (this.zzc != null) {
                jSONObject2.put("attestationObject", mw4.b(getAttestationObject()));
            }
            JSONArray jSONArray = new JSONArray();
            int i = 0;
            while (true) {
                String[] strArr = this.zzd;
                if (i >= strArr.length) {
                    break;
                }
                if (strArr[i].equals(Transport.HYBRID.toString())) {
                    jSONArray.put(i, "hybrid");
                } else {
                    jSONArray.put(i, this.zzd[i]);
                }
                i++;
            }
            jSONObject2.put("transports", jSONArray);
            try {
                try {
                    try {
                        s7a1 s7a1Var = (s7a1) ((w6a1) s7a1.f(getAttestationObject()).c(w6a1.class)).b.get(new d7a1("authData"));
                        if (s7a1Var == null) {
                            try {
                                throw new IllegalArgumentException("attestation object missing authData");
                            } catch (zzho e) {
                                e = e;
                                throw new IllegalArgumentException("authData value has wrong type", e);
                            }
                        }
                        zzgx zzgxVar = ((i) s7a1Var.c(i.class)).a;
                        ByteBuffer j = zzgxVar.j();
                        try {
                            j.position(j.position() + 32);
                            if ((j.get() & DerValue.TAG_APPLICATION) == 0) {
                                try {
                                    throw new IllegalArgumentException("authData does not include credential data");
                                } catch (IllegalArgumentException e2) {
                                    e = e2;
                                    throw new IllegalArgumentException("ill-formed authenticator data", e);
                                }
                            }
                            j.position(j.position() + 4);
                            j.position(j.position() + 16);
                            j.position(j.position() + j.getShort());
                            try {
                                zr10 zr10Var = new zr10(zzgxVar.h(j.position(), zzgxVar.f()).i());
                                try {
                                    s7a1 d = iwa1.d(zr10Var);
                                    try {
                                        zr10Var.close();
                                    } catch (IOException unused) {
                                    }
                                    zzcj zzcjVar = ((w6a1) d.c(w6a1.class)).b;
                                    s7a1 s7a1Var2 = (s7a1) zzcjVar.get(new h6a1(3L));
                                    s7a1 s7a1Var3 = (s7a1) zzcjVar.get(new h6a1(1L));
                                    if (s7a1Var2 == null || s7a1Var3 == null) {
                                        throw new IllegalArgumentException("COSE key missing required fields");
                                    }
                                    try {
                                        long j2 = ((h6a1) s7a1Var2.c(h6a1.class)).a;
                                        long j3 = ((h6a1) s7a1Var3.c(h6a1.class)).a;
                                        try {
                                            if (j3 != 1) {
                                                if (j3 != 2) {
                                                    jSONObject = jSONObject2;
                                                    bArr = null;
                                                    JSONObject jSONObject3 = jSONObject;
                                                    jSONObject3.put("authenticatorData", mw4.b(zzgxVar.n()));
                                                    jSONObject3.put("publicKeyAlgorithm", j2);
                                                    if (bArr != null) {
                                                        jSONObject3.put("publicKey", Base64.encodeToString(bArr, 11));
                                                    }
                                                    return jSONObject3;
                                                }
                                                j3 = 2;
                                            }
                                            s7a1 s7a1Var4 = (s7a1) zzcjVar.get(new h6a1(-1L));
                                            if (s7a1Var4 == null) {
                                                throw new IllegalArgumentException("COSE key missing required fields");
                                            }
                                            long j4 = ((h6a1) s7a1Var4.c(h6a1.class)).a;
                                            if (j3 == 2 && j4 == 1) {
                                                s7a1 s7a1Var5 = (s7a1) zzcjVar.get(new h6a1(-2L));
                                                s7a1 s7a1Var6 = (s7a1) zzcjVar.get(new h6a1(-3L));
                                                if (s7a1Var5 == null || s7a1Var6 == null) {
                                                    throw new IllegalArgumentException("COSE key missing required fields");
                                                }
                                                zzgx zzgxVar2 = ((i) s7a1Var5.c(i.class)).a;
                                                zzgx zzgxVar3 = ((i) s7a1Var6.c(i.class)).a;
                                                if (zzgxVar2.f() != 32 || zzgxVar3.f() != 32) {
                                                    throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                                }
                                                bArr = bwa1.g(Base64.decode("MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAE", 0), zzgxVar2.n(), zzgxVar3.n());
                                            } else if (j3 == 1 && j4 == 6) {
                                                s7a1 s7a1Var7 = (s7a1) zzcjVar.get(new h6a1(-2L));
                                                if (s7a1Var7 == null) {
                                                    throw new IllegalArgumentException("COSE key missing required fields");
                                                }
                                                zzgx zzgxVar4 = ((i) s7a1Var7.c(i.class)).a;
                                                if (zzgxVar4.f() != 32) {
                                                    throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                                }
                                                bArr = bwa1.g(Base64.decode("MCowBQYDK2VwAyEA", 0), zzgxVar4.n());
                                            } else {
                                                bArr = null;
                                            }
                                            JSONObject jSONObject32 = jSONObject;
                                            jSONObject32.put("authenticatorData", mw4.b(zzgxVar.n()));
                                            jSONObject32.put("publicKeyAlgorithm", j2);
                                            if (bArr != null) {
                                            }
                                            return jSONObject32;
                                        } catch (zzho e3) {
                                            e = e3;
                                            throw new IllegalArgumentException("COSE key ill-formed", e);
                                        }
                                        jSONObject = jSONObject2;
                                    } catch (zzho e4) {
                                        e = e4;
                                    }
                                } finally {
                                    try {
                                        try {
                                            zr10Var.close();
                                        } catch (zzhj | zzho e5) {
                                            e = e5;
                                            throw new IllegalArgumentException("failed to parse COSE key", e);
                                        }
                                    } catch (IOException unused2) {
                                    }
                                }
                            } catch (zzhj | zzho e6) {
                                e = e6;
                            }
                        } catch (IllegalArgumentException e7) {
                            e = e7;
                        }
                    } catch (zzho e8) {
                        e = e8;
                    }
                } catch (zzhj | zzho e9) {
                    throw new IllegalArgumentException("failed to parse attestation object", e9);
                }
            } catch (JSONException e10) {
                e = e10;
                ny61.n("Error encoding AuthenticatorAttestationResponse to JSON object", e);
                return null;
            }
        } catch (JSONException e11) {
            e = e11;
        }
    }
}
