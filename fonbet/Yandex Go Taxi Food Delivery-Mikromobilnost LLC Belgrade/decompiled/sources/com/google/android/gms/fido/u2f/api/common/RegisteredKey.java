package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.cvw;
import defpackage.ny61;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes11.dex */
public class RegisteredKey extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RegisteredKey> CREATOR = new zzj();
    String zza;
    private final KeyHandle zzb;
    private final String zzc;

    public RegisteredKey(KeyHandle keyHandle, String str, String str2) {
        cvw.l(keyHandle);
        this.zzb = keyHandle;
        this.zza = str;
        this.zzc = str2;
    }

    public static RegisteredKey parseFromJson(JSONObject jSONObject) throws JSONException {
        return new RegisteredKey(KeyHandle.parseFromJson(jSONObject), jSONObject.has("challenge") ? jSONObject.getString("challenge") : null, jSONObject.has("appId") ? jSONObject.getString("appId") : null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisteredKey)) {
            return false;
        }
        RegisteredKey registeredKey = (RegisteredKey) obj;
        String str = this.zza;
        String str2 = registeredKey.zza;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        if (!this.zzb.equals(registeredKey.zzb)) {
            return false;
        }
        String str3 = this.zzc;
        String str4 = registeredKey.zzc;
        if (str3 == null) {
            if (str4 != null) {
                return false;
            }
        } else if (!str3.equals(str4)) {
            return false;
        }
        return true;
    }

    public String getAppId() {
        return this.zzc;
    }

    public String getChallengeValue() {
        return this.zza;
    }

    public KeyHandle getKeyHandle() {
        return this.zzb;
    }

    public int hashCode() {
        String str = this.zza;
        int hashCode = this.zzb.hashCode() + (((str == null ? 0 : str.hashCode()) + 31) * 31);
        String str2 = this.zzc;
        return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.zza;
            if (str != null) {
                jSONObject.put("challenge", str);
            }
            JSONObject zza = this.zzb.zza();
            Iterator<String> keys = zza.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject.put(next, zza.get(next));
            }
            String str2 = this.zzc;
            if (str2 != null) {
                jSONObject.put("appId", str2);
            }
            return jSONObject;
        } catch (JSONException e) {
            ny61.j(e);
            return null;
        }
    }

    public String toString() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(SignResponseData.JSON_RESPONSE_DATA_KEY_HANDLE, Base64.encodeToString(this.zzb.getBytes(), 11));
            if (this.zzb.getProtocolVersion() != ProtocolVersion.UNKNOWN) {
                jSONObject.put("version", this.zzb.getProtocolVersion().toString());
            }
            if (this.zzb.getTransports() != null) {
                jSONObject.put("transports", this.zzb.getTransports().toString());
            }
            String str = this.zza;
            if (str != null) {
                jSONObject.put("challenge", str);
            }
            String str2 = this.zzc;
            if (str2 != null) {
                jSONObject.put("appId", str2);
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            ny61.j(e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.f0(parcel, 2, getKeyHandle(), i, false);
        bb1.g0(parcel, 3, getChallengeValue(), false);
        bb1.g0(parcel, 4, getAppId(), false);
        bb1.o0(parcel, n0);
    }

    public RegisteredKey(KeyHandle keyHandle) {
        this(keyHandle, null, null);
    }
}
