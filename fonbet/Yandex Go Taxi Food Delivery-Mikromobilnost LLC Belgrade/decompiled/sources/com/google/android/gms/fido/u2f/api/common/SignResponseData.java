package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import defpackage.bb1;
import defpackage.cvw;
import defpackage.ira1;
import defpackage.jy91;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.p891;
import defpackage.xx91;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import ru.yandex.common.clid.ClidProvider;

@Deprecated
/* loaded from: classes11.dex */
public class SignResponseData extends ResponseData {
    public static final Parcelable.Creator<SignResponseData> CREATOR = new zzl();
    public static final String JSON_RESPONSE_DATA_CLIENT_DATA = "clientData";
    public static final String JSON_RESPONSE_DATA_KEY_HANDLE = "keyHandle";
    public static final String JSON_RESPONSE_DATA_SIGNATURE_DATA = "signatureData";
    private final byte[] zza;
    private final String zzb;
    private final byte[] zzc;
    private final byte[] zzd;

    public SignResponseData(byte[] bArr, String str, byte[] bArr2, byte[] bArr3) {
        cvw.l(bArr);
        this.zza = bArr;
        cvw.l(str);
        this.zzb = str;
        cvw.l(bArr2);
        this.zzc = bArr2;
        cvw.l(bArr3);
        this.zzd = bArr3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SignResponseData)) {
            return false;
        }
        SignResponseData signResponseData = (SignResponseData) obj;
        return Arrays.equals(this.zza, signResponseData.zza) && ooc.m(this.zzb, signResponseData.zzb) && Arrays.equals(this.zzc, signResponseData.zzc) && Arrays.equals(this.zzd, signResponseData.zzd);
    }

    public String getClientDataString() {
        return this.zzb;
    }

    public byte[] getKeyHandle() {
        return this.zza;
    }

    public byte[] getSignatureData() {
        return this.zzc;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.zza)), this.zzb, Integer.valueOf(Arrays.hashCode(this.zzc)), Integer.valueOf(Arrays.hashCode(this.zzd))});
    }

    @Override // com.google.android.gms.fido.u2f.api.common.ResponseData
    public JSONObject toJsonObject() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_RESPONSE_DATA_KEY_HANDLE, Base64.encodeToString(this.zza, 11));
            jSONObject.put(JSON_RESPONSE_DATA_CLIENT_DATA, Base64.encodeToString(this.zzb.getBytes(), 11));
            jSONObject.put(JSON_RESPONSE_DATA_SIGNATURE_DATA, Base64.encodeToString(this.zzc, 11));
            return jSONObject;
        } catch (JSONException e) {
            ny61.j(e);
            return null;
        }
    }

    public String toString() {
        p891 j = ira1.j(this);
        xx91 xx91Var = jy91.d;
        byte[] bArr = this.zza;
        j.g(xx91Var.c(bArr.length, bArr), JSON_RESPONSE_DATA_KEY_HANDLE);
        j.g(this.zzb, "clientDataString");
        byte[] bArr2 = this.zzc;
        j.g(xx91Var.c(bArr2.length, bArr2), JSON_RESPONSE_DATA_SIGNATURE_DATA);
        byte[] bArr3 = this.zzd;
        j.g(xx91Var.c(bArr3.length, bArr3), ClidProvider.APPLICATION);
        return j.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.V(parcel, 2, getKeyHandle(), false);
        bb1.g0(parcel, 3, getClientDataString(), false);
        bb1.V(parcel, 4, getSignatureData(), false);
        bb1.V(parcel, 5, this.zzd, false);
        bb1.o0(parcel, n0);
    }

    @Deprecated
    public SignResponseData(byte[] bArr, String str, byte[] bArr2) {
        this(bArr, str, bArr2, new byte[0]);
    }
}
