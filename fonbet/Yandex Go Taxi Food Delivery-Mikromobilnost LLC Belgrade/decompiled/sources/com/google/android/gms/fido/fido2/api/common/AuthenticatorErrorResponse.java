package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.bb1;
import defpackage.f991;
import defpackage.hwa1;
import defpackage.ira1;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.p891;
import defpackage.yci0;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class AuthenticatorErrorResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator<AuthenticatorErrorResponse> CREATOR = new zzl();
    private final ErrorCode zza;
    private final String zzb;
    private final int zzc;

    public AuthenticatorErrorResponse(int i, String str, int i2) {
        try {
            this.zza = ErrorCode.toErrorCode(i);
            this.zzb = str;
            this.zzc = i2;
        } catch (ErrorCode.UnsupportedErrorCodeException e) {
            yci0.r(e);
            throw null;
        }
    }

    public static AuthenticatorErrorResponse deserializeFromBytes(byte[] bArr) {
        return (AuthenticatorErrorResponse) hwa1.a(bArr, CREATOR);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorErrorResponse)) {
            return false;
        }
        AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) obj;
        return ooc.m(this.zza, authenticatorErrorResponse.zza) && ooc.m(this.zzb, authenticatorErrorResponse.zzb) && ooc.m(Integer.valueOf(this.zzc), Integer.valueOf(authenticatorErrorResponse.zzc));
    }

    @Override // com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse
    public byte[] getClientDataJSON() {
        throw new UnsupportedOperationException();
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
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, Integer.valueOf(this.zzc)});
    }

    @Override // com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse
    public byte[] serializeToBytes() {
        return hwa1.f(this);
    }

    public String toString() {
        p891 j = ira1.j(this);
        String valueOf = String.valueOf(this.zza.getCode());
        f991 f991Var = new f991(1);
        ((p891) j.w).w = f991Var;
        j.w = f991Var;
        f991Var.c = valueOf;
        f991Var.b = ErrorResponseData.JSON_ERROR_CODE;
        String str = this.zzb;
        if (str != null) {
            j.g(str, ErrorResponseData.JSON_ERROR_MESSAGE);
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
        int i2 = this.zzc;
        bb1.m0(4, parcel, 4);
        parcel.writeInt(i2);
        bb1.o0(parcel, n0);
    }

    public final JSONObject zza() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(AuthSdkActivity.RESPONSE_TYPE_CODE, this.zza.getCode());
            String str = this.zzb;
            if (str != null) {
                jSONObject.put(Constants.KEY_MESSAGE, str);
            }
            return jSONObject;
        } catch (JSONException e) {
            ny61.n("Error encoding AuthenticatorErrorResponse to JSON object", e);
            return null;
        }
    }
}
