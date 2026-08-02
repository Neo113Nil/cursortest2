package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bb1;
import defpackage.cvw;
import defpackage.f991;
import defpackage.ira1;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.p891;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes11.dex */
public class ErrorResponseData extends ResponseData {
    public static final Parcelable.Creator<ErrorResponseData> CREATOR = new zzd();
    public static final String JSON_ERROR_CODE = "errorCode";
    public static final String JSON_ERROR_MESSAGE = "errorMessage";
    private final ErrorCode zza;
    private final String zzb;

    public ErrorResponseData(int i, String str) {
        this.zza = ErrorCode.toErrorCode(i);
        this.zzb = str;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ErrorResponseData)) {
            return false;
        }
        ErrorResponseData errorResponseData = (ErrorResponseData) obj;
        return ooc.m(this.zza, errorResponseData.zza) && ooc.m(this.zzb, errorResponseData.zzb);
    }

    public ErrorCode getErrorCode() {
        return this.zza;
    }

    public int getErrorCodeAsInt() {
        return this.zza.getCode();
    }

    public String getErrorMessage() {
        return this.zzb;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    @Override // com.google.android.gms.fido.u2f.api.common.ResponseData
    public final JSONObject toJsonObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(JSON_ERROR_CODE, this.zza.getCode());
            String str = this.zzb;
            if (str != null) {
                jSONObject.put(JSON_ERROR_MESSAGE, str);
            }
            return jSONObject;
        } catch (JSONException e) {
            ny61.j(e);
            return null;
        }
    }

    public String toString() {
        p891 j = ira1.j(this);
        String valueOf = String.valueOf(this.zza.getCode());
        f991 f991Var = new f991(1);
        ((p891) j.w).w = f991Var;
        j.w = f991Var;
        f991Var.c = valueOf;
        f991Var.b = JSON_ERROR_CODE;
        String str = this.zzb;
        if (str != null) {
            j.g(str, JSON_ERROR_MESSAGE);
        }
        return j.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        int errorCodeAsInt = getErrorCodeAsInt();
        bb1.m0(2, parcel, 4);
        parcel.writeInt(errorCodeAsInt);
        bb1.g0(parcel, 3, getErrorMessage(), false);
        bb1.o0(parcel, n0);
    }

    public ErrorResponseData(ErrorCode errorCode) {
        cvw.l(errorCode);
        this.zza = errorCode;
        this.zzb = null;
    }

    public ErrorResponseData(ErrorCode errorCode, String str) {
        cvw.l(errorCode);
        this.zza = errorCode;
        this.zzb = str;
    }
}
