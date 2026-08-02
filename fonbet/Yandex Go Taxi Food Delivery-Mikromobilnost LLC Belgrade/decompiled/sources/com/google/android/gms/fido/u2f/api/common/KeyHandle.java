package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import defpackage.bb1;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.yci0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes11.dex */
public class KeyHandle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<KeyHandle> CREATOR = new zze();
    private final int zza;
    private final byte[] zzb;
    private final ProtocolVersion zzc;
    private final List zzd;

    public KeyHandle(int i, byte[] bArr, String str, List list) {
        this.zza = i;
        this.zzb = bArr;
        try {
            this.zzc = ProtocolVersion.fromString(str);
            this.zzd = list;
        } catch (ProtocolVersion.UnsupportedProtocolException e) {
            yci0.r(e);
            throw null;
        }
    }

    public static KeyHandle parseFromJson(JSONObject jSONObject) throws JSONException {
        try {
            try {
                return new KeyHandle(Base64.decode(jSONObject.getString(SignResponseData.JSON_RESPONSE_DATA_KEY_HANDLE), 8), ProtocolVersion.fromString(jSONObject.has("version") ? jSONObject.getString("version") : null), jSONObject.has("transports") ? Transport.parseTransports(jSONObject.getJSONArray("transports")) : null);
            } catch (IllegalArgumentException e) {
                throw new JSONException(e.toString());
            }
        } catch (ProtocolVersion.UnsupportedProtocolException e2) {
            throw new JSONException(e2.toString());
        }
    }

    public boolean equals(Object obj) {
        List list;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyHandle)) {
            return false;
        }
        KeyHandle keyHandle = (KeyHandle) obj;
        if (!Arrays.equals(this.zzb, keyHandle.zzb) || !this.zzc.equals(keyHandle.zzc)) {
            return false;
        }
        List list2 = this.zzd;
        if (list2 == null && keyHandle.zzd == null) {
            return true;
        }
        return list2 != null && (list = keyHandle.zzd) != null && list2.containsAll(list) && keyHandle.zzd.containsAll(this.zzd);
    }

    public byte[] getBytes() {
        return this.zzb;
    }

    public ProtocolVersion getProtocolVersion() {
        return this.zzc;
    }

    public List<Transport> getTransports() {
        return this.zzd;
    }

    public int getVersionCode() {
        return this.zza;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.zzb)), this.zzc, this.zzd});
    }

    public JSONObject toJson() {
        return zza();
    }

    public String toString() {
        List list = this.zzd;
        String obj = list == null ? "null" : list.toString();
        byte[] bArr = this.zzb;
        String encodeToString = bArr == null ? null : Base64.encodeToString(bArr, 0);
        ProtocolVersion protocolVersion = this.zzc;
        StringBuilder sb = new StringBuilder("{keyHandle: ");
        sb.append(encodeToString);
        sb.append(", version: ");
        sb.append(protocolVersion);
        sb.append(", transports: ");
        return oyr.t(sb, obj, "}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        int versionCode = getVersionCode();
        bb1.m0(1, parcel, 4);
        parcel.writeInt(versionCode);
        bb1.V(parcel, 2, getBytes(), false);
        bb1.g0(parcel, 3, this.zzc.toString(), false);
        bb1.k0(parcel, 4, getTransports(), false);
        bb1.o0(parcel, n0);
    }

    public final JSONObject zza() {
        JSONObject jSONObject = new JSONObject();
        try {
            byte[] bArr = this.zzb;
            if (bArr != null) {
                jSONObject.put(SignResponseData.JSON_RESPONSE_DATA_KEY_HANDLE, Base64.encodeToString(bArr, 11));
            }
            ProtocolVersion protocolVersion = this.zzc;
            if (protocolVersion != null) {
                jSONObject.put("version", protocolVersion.toString());
            }
            if (this.zzd != null) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = this.zzd.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((Transport) it.next()).toString());
                }
                jSONObject.put("transports", jSONArray);
            }
            return jSONObject;
        } catch (JSONException e) {
            ny61.j(e);
            return null;
        }
    }

    public KeyHandle(byte[] bArr, ProtocolVersion protocolVersion, List<Transport> list) {
        this.zza = 1;
        this.zzb = bArr;
        this.zzc = protocolVersion;
        this.zzd = list;
    }
}
