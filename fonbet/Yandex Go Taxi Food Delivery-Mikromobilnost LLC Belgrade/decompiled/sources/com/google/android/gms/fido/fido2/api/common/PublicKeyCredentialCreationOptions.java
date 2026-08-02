package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import com.google.android.gms.internal.fido.l;
import com.google.android.gms.internal.fido.zzbl;
import defpackage.b64;
import defpackage.bb1;
import defpackage.cvw;
import defpackage.g8e;
import defpackage.hwa1;
import defpackage.mw4;
import defpackage.ooc;
import defpackage.tse0;
import defpackage.yci0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class PublicKeyCredentialCreationOptions extends RequestOptions {
    public static final Parcelable.Creator<PublicKeyCredentialCreationOptions> CREATOR = new zzan();
    private final PublicKeyCredentialRpEntity zza;
    private final PublicKeyCredentialUserEntity zzb;
    private final byte[] zzc;
    private final List zzd;
    private final Double zze;
    private final List zzf;
    private final AuthenticatorSelectionCriteria zzg;
    private final Integer zzh;
    private final TokenBinding zzi;
    private final AttestationConveyancePreference zzj;
    private final AuthenticationExtensions zzk;
    private final String zzl;
    private ResultReceiver zzm;

    public static final class a {
        public PublicKeyCredentialRpEntity a;
        public PublicKeyCredentialUserEntity b;
        public byte[] c;
        public ArrayList d;
        public Double e;
        public ArrayList f;
        public AuthenticatorSelectionCriteria g;
        public AttestationConveyancePreference h;
        public AuthenticationExtensions i;

        public final PublicKeyCredentialCreationOptions a() {
            PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = this.a;
            PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = this.b;
            byte[] bArr = this.c;
            ArrayList arrayList = this.d;
            Double d = this.e;
            ArrayList arrayList2 = this.f;
            AuthenticatorSelectionCriteria authenticatorSelectionCriteria = this.g;
            AttestationConveyancePreference attestationConveyancePreference = this.h;
            return new PublicKeyCredentialCreationOptions(publicKeyCredentialRpEntity, publicKeyCredentialUserEntity, bArr, arrayList, d, arrayList2, authenticatorSelectionCriteria, null, null, attestationConveyancePreference == null ? null : attestationConveyancePreference.toString(), this.i, null, null);
        }
    }

    public PublicKeyCredentialCreationOptions(PublicKeyCredentialRpEntity publicKeyCredentialRpEntity, PublicKeyCredentialUserEntity publicKeyCredentialUserEntity, byte[] bArr, List list, Double d, List list2, AuthenticatorSelectionCriteria authenticatorSelectionCriteria, Integer num, TokenBinding tokenBinding, String str, AuthenticationExtensions authenticationExtensions, String str2, ResultReceiver resultReceiver) {
        this.zzm = resultReceiver;
        if (str2 != null) {
            try {
                PublicKeyCredentialCreationOptions zza = zza(new JSONObject(str2));
                this.zza = zza.zza;
                this.zzb = zza.zzb;
                this.zzc = zza.zzc;
                this.zzd = zza.zzd;
                this.zze = zza.zze;
                this.zzf = zza.zzf;
                this.zzg = zza.zzg;
                this.zzh = zza.zzh;
                this.zzi = zza.zzi;
                this.zzj = zza.zzj;
                this.zzk = zza.zzk;
                this.zzl = str2;
                return;
            } catch (JSONException e) {
                yci0.r(e);
                throw null;
            }
        }
        cvw.l(publicKeyCredentialRpEntity);
        this.zza = publicKeyCredentialRpEntity;
        cvw.l(publicKeyCredentialUserEntity);
        this.zzb = publicKeyCredentialUserEntity;
        cvw.l(bArr);
        this.zzc = bArr;
        cvw.l(list);
        this.zzd = list;
        this.zze = d;
        this.zzf = list2;
        this.zzg = authenticatorSelectionCriteria;
        this.zzh = num;
        this.zzi = tokenBinding;
        if (str != null) {
            try {
                this.zzj = AttestationConveyancePreference.fromString(str);
            } catch (AttestationConveyancePreference.UnsupportedAttestationConveyancePreferenceException e2) {
                yci0.r(e2);
                throw null;
            }
        } else {
            this.zzj = null;
        }
        this.zzk = authenticationExtensions;
        this.zzl = null;
    }

    public static PublicKeyCredentialCreationOptions deserializeFromBytes(byte[] bArr) {
        return (PublicKeyCredentialCreationOptions) hwa1.a(bArr, CREATOR);
    }

    public static PublicKeyCredentialCreationOptions zza(JSONObject jSONObject) throws JSONException {
        zzbl c;
        a aVar = new a();
        JSONObject jSONObject2 = jSONObject.getJSONObject("rp");
        Parcelable.Creator<PublicKeyCredentialRpEntity> creator = PublicKeyCredentialRpEntity.CREATOR;
        aVar.a = new PublicKeyCredentialRpEntity(jSONObject2.getString("id"), jSONObject2.getString("name"), jSONObject2.has("icon") ? jSONObject2.optString("icon") : null);
        JSONObject jSONObject3 = jSONObject.getJSONObject("user");
        Parcelable.Creator<PublicKeyCredentialUserEntity> creator2 = PublicKeyCredentialUserEntity.CREATOR;
        aVar.b = new PublicKeyCredentialUserEntity(mw4.a(jSONObject3.getString("id")), jSONObject3.getString("name"), jSONObject3.has("icon") ? jSONObject3.optString("icon") : null, jSONObject3.optString("displayName"));
        byte[] a2 = mw4.a(jSONObject.getString("challenge"));
        cvw.l(a2);
        aVar.c = a2;
        JSONArray jSONArray = jSONObject.getJSONArray("pubKeyCredParams");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject4 = jSONArray.getJSONObject(i);
            try {
                c = zzbl.f(new PublicKeyCredentialParameters(jSONObject4.getString("type"), jSONObject4.getInt("alg")));
            } catch (IllegalArgumentException unused) {
                c = zzbl.c();
            }
            if (c.b()) {
                arrayList.add(c.a());
            }
        }
        aVar.d = arrayList;
        if (jSONObject.has("timeout")) {
            aVar.e = Double.valueOf(jSONObject.getDouble("timeout") / 1000.0d);
        }
        if (jSONObject.has("excludeCredentials")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("excludeCredentials");
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                arrayList2.add(PublicKeyCredentialDescriptor.zza(jSONArray2.getJSONObject(i2)));
            }
            aVar.f = arrayList2;
        }
        if (jSONObject.has("authenticatorSelection")) {
            JSONObject jSONObject5 = jSONObject.getJSONObject("authenticatorSelection");
            Parcelable.Creator<AuthenticatorSelectionCriteria> creator3 = AuthenticatorSelectionCriteria.CREATOR;
            aVar.g = new AuthenticatorSelectionCriteria(jSONObject5.has("authenticatorAttachment") ? jSONObject5.optString("authenticatorAttachment") : null, jSONObject5.has("requireResidentKey") ? Boolean.valueOf(jSONObject5.optBoolean("requireResidentKey")) : null, jSONObject5.has("userVerification") ? jSONObject5.optString("userVerification") : null, jSONObject5.has("residentKey") ? jSONObject5.optString("residentKey") : null);
        }
        if (jSONObject.has("extensions")) {
            aVar.i = AuthenticationExtensions.zza(jSONObject.getJSONObject("extensions"));
        }
        if (jSONObject.has("attestation")) {
            try {
                aVar.h = AttestationConveyancePreference.fromString(jSONObject.getString("attestation"));
            } catch (AttestationConveyancePreference.UnsupportedAttestationConveyancePreferenceException unused2) {
                aVar.h = AttestationConveyancePreference.NONE;
            }
        }
        return aVar.a();
    }

    public boolean equals(Object obj) {
        List list;
        List list2;
        if (!(obj instanceof PublicKeyCredentialCreationOptions)) {
            return false;
        }
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) obj;
        return ooc.m(this.zza, publicKeyCredentialCreationOptions.zza) && ooc.m(this.zzb, publicKeyCredentialCreationOptions.zzb) && Arrays.equals(this.zzc, publicKeyCredentialCreationOptions.zzc) && ooc.m(this.zze, publicKeyCredentialCreationOptions.zze) && this.zzd.containsAll(publicKeyCredentialCreationOptions.zzd) && publicKeyCredentialCreationOptions.zzd.containsAll(this.zzd) && (((list = this.zzf) == null && publicKeyCredentialCreationOptions.zzf == null) || (list != null && (list2 = publicKeyCredentialCreationOptions.zzf) != null && list.containsAll(list2) && publicKeyCredentialCreationOptions.zzf.containsAll(this.zzf))) && ooc.m(this.zzg, publicKeyCredentialCreationOptions.zzg) && ooc.m(this.zzh, publicKeyCredentialCreationOptions.zzh) && ooc.m(this.zzi, publicKeyCredentialCreationOptions.zzi) && ooc.m(this.zzj, publicKeyCredentialCreationOptions.zzj) && ooc.m(this.zzk, publicKeyCredentialCreationOptions.zzk) && ooc.m(this.zzl, publicKeyCredentialCreationOptions.zzl);
    }

    public AttestationConveyancePreference getAttestationConveyancePreference() {
        return this.zzj;
    }

    public String getAttestationConveyancePreferenceAsString() {
        AttestationConveyancePreference attestationConveyancePreference = this.zzj;
        if (attestationConveyancePreference == null) {
            return null;
        }
        return attestationConveyancePreference.toString();
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public AuthenticationExtensions getAuthenticationExtensions() {
        return this.zzk;
    }

    public AuthenticatorSelectionCriteria getAuthenticatorSelection() {
        return this.zzg;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public byte[] getChallenge() {
        return this.zzc;
    }

    public List<PublicKeyCredentialDescriptor> getExcludeList() {
        return this.zzf;
    }

    public String getJsonString() {
        return this.zzl;
    }

    public List<PublicKeyCredentialParameters> getParameters() {
        return this.zzd;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public Integer getRequestId() {
        return this.zzh;
    }

    public PublicKeyCredentialRpEntity getRp() {
        return this.zza;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public Double getTimeoutSeconds() {
        return this.zze;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public TokenBinding getTokenBinding() {
        return this.zzi;
    }

    public PublicKeyCredentialUserEntity getUser() {
        return this.zzb;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, Integer.valueOf(Arrays.hashCode(this.zzc)), this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl});
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public byte[] serializeToBytes() {
        l.b();
        throw null;
    }

    public final String toString() {
        AuthenticationExtensions authenticationExtensions = this.zzk;
        AttestationConveyancePreference attestationConveyancePreference = this.zzj;
        TokenBinding tokenBinding = this.zzi;
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = this.zzg;
        List list = this.zzf;
        List list2 = this.zzd;
        byte[] bArr = this.zzc;
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = this.zzb;
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(publicKeyCredentialUserEntity);
        String b = mw4.b(bArr);
        String valueOf3 = String.valueOf(list2);
        String valueOf4 = String.valueOf(list);
        String valueOf5 = String.valueOf(authenticatorSelectionCriteria);
        String valueOf6 = String.valueOf(tokenBinding);
        String valueOf7 = String.valueOf(attestationConveyancePreference);
        String valueOf8 = String.valueOf(authenticationExtensions);
        StringBuilder v = b64.v("PublicKeyCredentialCreationOptions{\n rp=", valueOf, ", \n user=", valueOf2, ", \n challenge=");
        g8e.D(v, b, ", \n parameters=", valueOf3, ", \n timeoutSeconds=");
        v.append(this.zze);
        v.append(", \n excludeList=");
        v.append(valueOf4);
        v.append(", \n authenticatorSelection=");
        v.append(valueOf5);
        v.append(", \n requestId=");
        tse0.w(this.zzh, ", \n tokenBinding=", valueOf6, ", \n attestationConveyancePreference=", v);
        return g8e.r(v, valueOf7, ", \n authenticationExtensions=", valueOf8, "}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.f0(parcel, 2, getRp(), i, false);
        bb1.f0(parcel, 3, getUser(), i, false);
        bb1.V(parcel, 4, getChallenge(), false);
        bb1.k0(parcel, 5, getParameters(), false);
        bb1.X(parcel, 6, getTimeoutSeconds());
        bb1.k0(parcel, 7, getExcludeList(), false);
        bb1.f0(parcel, 8, getAuthenticatorSelection(), i, false);
        bb1.d0(parcel, 9, getRequestId());
        bb1.f0(parcel, 10, getTokenBinding(), i, false);
        bb1.g0(parcel, 11, getAttestationConveyancePreferenceAsString(), false);
        bb1.f0(parcel, 12, getAuthenticationExtensions(), i, false);
        bb1.g0(parcel, 13, getJsonString(), false);
        bb1.f0(parcel, 14, this.zzm, i, false);
        bb1.o0(parcel, n0);
    }

    public PublicKeyCredentialCreationOptions(String str) {
        try {
            PublicKeyCredentialCreationOptions zza = zza(new JSONObject(str));
            this.zza = zza.zza;
            this.zzb = zza.zzb;
            this.zzc = zza.zzc;
            this.zzd = zza.zzd;
            this.zze = zza.zze;
            this.zzf = zza.zzf;
            this.zzg = zza.zzg;
            this.zzh = zza.zzh;
            this.zzi = zza.zzi;
            this.zzj = zza.zzj;
            this.zzk = zza.zzk;
            this.zzl = str;
        } catch (JSONException e) {
            yci0.r(e);
            throw null;
        }
    }
}
