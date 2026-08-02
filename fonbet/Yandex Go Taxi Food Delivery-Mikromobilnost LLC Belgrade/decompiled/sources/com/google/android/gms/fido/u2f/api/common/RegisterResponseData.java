package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import defpackage.bb1;
import defpackage.cvw;
import defpackage.ira1;
import defpackage.jy91;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.p891;
import defpackage.xx91;
import defpackage.yci0;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes11.dex */
public class RegisterResponseData extends ResponseData {
    public static final Parcelable.Creator<RegisterResponseData> CREATOR = new zzi();
    private final byte[] zza;
    private final ProtocolVersion zzb;
    private final String zzc;

    public RegisterResponseData(byte[] bArr, ProtocolVersion protocolVersion, String str) {
        cvw.l(bArr);
        this.zza = bArr;
        cvw.l(protocolVersion);
        this.zzb = protocolVersion;
        cvw.e(protocolVersion != ProtocolVersion.UNKNOWN);
        if (protocolVersion == ProtocolVersion.V1) {
            cvw.e(str == null);
            this.zzc = null;
        } else {
            cvw.l(str);
            this.zzc = str;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof RegisterResponseData)) {
            return false;
        }
        RegisterResponseData registerResponseData = (RegisterResponseData) obj;
        return ooc.m(this.zzb, registerResponseData.zzb) && Arrays.equals(this.zza, registerResponseData.zza) && ooc.m(this.zzc, registerResponseData.zzc);
    }

    public String getClientDataString() {
        return this.zzc;
    }

    public ProtocolVersion getProtocolVersion() {
        return this.zzb;
    }

    public byte[] getRegisterData() {
        return this.zza;
    }

    public int getVersionCode() {
        ProtocolVersion protocolVersion = ProtocolVersion.UNKNOWN;
        int ordinal = this.zzb.ordinal();
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                return -1;
            }
        }
        return i;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.zzb, Integer.valueOf(Arrays.hashCode(this.zza)), this.zzc});
    }

    @Override // com.google.android.gms.fido.u2f.api.common.ResponseData
    public JSONObject toJsonObject() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("registrationData", Base64.encodeToString(this.zza, 11));
            jSONObject.put("version", this.zzb.toString());
            String str = this.zzc;
            if (str != null) {
                jSONObject.put(SignResponseData.JSON_RESPONSE_DATA_CLIENT_DATA, Base64.encodeToString(str.getBytes(), 11));
            }
            return jSONObject;
        } catch (JSONException e) {
            ny61.j(e);
            return null;
        }
    }

    public String toString() {
        p891 j = ira1.j(this);
        j.g(this.zzb, "protocolVersion");
        xx91 xx91Var = jy91.d;
        byte[] bArr = this.zza;
        j.g(xx91Var.c(bArr.length, bArr), "registerData");
        String str = this.zzc;
        if (str != null) {
            j.g(str, "clientDataString");
        }
        return j.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.V(parcel, 2, getRegisterData(), false);
        bb1.g0(parcel, 3, this.zzb.toString(), false);
        bb1.g0(parcel, 4, getClientDataString(), false);
        bb1.o0(parcel, n0);
    }

    public RegisterResponseData(byte[] bArr) {
        cvw.l(bArr);
        this.zza = bArr;
        this.zzb = ProtocolVersion.V1;
        this.zzc = null;
    }

    public RegisterResponseData(byte[] bArr, String str, String str2) {
        this.zza = bArr;
        try {
            this.zzb = ProtocolVersion.fromString(str);
            this.zzc = str2;
        } catch (ProtocolVersion.UnsupportedProtocolException e) {
            yci0.r(e);
            throw null;
        }
    }
}
