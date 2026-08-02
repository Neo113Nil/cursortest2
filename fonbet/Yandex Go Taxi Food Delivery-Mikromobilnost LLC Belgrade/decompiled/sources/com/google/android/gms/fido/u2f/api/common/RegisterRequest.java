package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import defpackage.bb1;
import defpackage.cvw;
import defpackage.ny61;
import defpackage.yci0;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes11.dex */
public class RegisterRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RegisterRequest> CREATOR = new zzg();
    public static final int U2F_V1_CHALLENGE_BYTE_LENGTH = 65;
    private final int zza;
    private final ProtocolVersion zzb;
    private final byte[] zzc;
    private final String zzd;

    public RegisterRequest(ProtocolVersion protocolVersion, byte[] bArr, String str) {
        this.zza = 1;
        cvw.l(protocolVersion);
        this.zzb = protocolVersion;
        cvw.l(bArr);
        this.zzc = bArr;
        if (protocolVersion == ProtocolVersion.V1) {
            cvw.d("invalid challengeValue length for V1", bArr.length == 65);
        }
        this.zzd = str;
    }

    public static RegisterRequest parseFromJson(JSONObject jSONObject) throws JSONException {
        try {
            try {
                try {
                    return new RegisterRequest(ProtocolVersion.fromString(jSONObject.has("version") ? jSONObject.getString("version") : null), Base64.decode(jSONObject.getString("challenge"), 8), jSONObject.has("appId") ? jSONObject.getString("appId") : null);
                } catch (IllegalArgumentException e) {
                    throw new JSONException(e.getMessage());
                }
            } catch (IllegalArgumentException e2) {
                throw new JSONException(e2.toString());
            }
        } catch (ProtocolVersion.UnsupportedProtocolException e3) {
            throw new JSONException(e3.toString());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterRequest)) {
            return false;
        }
        RegisterRequest registerRequest = (RegisterRequest) obj;
        if (!Arrays.equals(this.zzc, registerRequest.zzc) || this.zzb != registerRequest.zzb) {
            return false;
        }
        String str = this.zzd;
        String str2 = registerRequest.zzd;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        return true;
    }

    public String getAppId() {
        return this.zzd;
    }

    public byte[] getChallengeValue() {
        return this.zzc;
    }

    public ProtocolVersion getProtocolVersion() {
        return this.zzb;
    }

    public int getVersionCode() {
        return this.zza;
    }

    public int hashCode() {
        int hashCode = this.zzb.hashCode() + ((Arrays.hashCode(this.zzc) + 31) * 31);
        String str = this.zzd;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", this.zzb.toString());
            jSONObject.put("challenge", Base64.encodeToString(this.zzc, 11));
            String str = this.zzd;
            if (str != null) {
                jSONObject.put("appId", str);
            }
            return jSONObject;
        } catch (JSONException e) {
            ny61.j(e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        int versionCode = getVersionCode();
        bb1.m0(1, parcel, 4);
        parcel.writeInt(versionCode);
        bb1.g0(parcel, 2, this.zzb.toString(), false);
        bb1.V(parcel, 3, getChallengeValue(), false);
        bb1.g0(parcel, 4, getAppId(), false);
        bb1.o0(parcel, n0);
    }

    public RegisterRequest(int i, String str, byte[] bArr, String str2) {
        this.zza = i;
        try {
            this.zzb = ProtocolVersion.fromString(str);
            this.zzc = bArr;
            this.zzd = str2;
        } catch (ProtocolVersion.UnsupportedProtocolException e) {
            yci0.r(e);
            throw null;
        }
    }
}
