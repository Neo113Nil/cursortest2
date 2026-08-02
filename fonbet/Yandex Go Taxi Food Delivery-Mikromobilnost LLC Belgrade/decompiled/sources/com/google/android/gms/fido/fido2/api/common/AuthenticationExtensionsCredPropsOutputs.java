package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.ny61;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class AuthenticationExtensionsCredPropsOutputs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticationExtensionsCredPropsOutputs> CREATOR = new zze();
    private final boolean zza;

    public AuthenticationExtensionsCredPropsOutputs(boolean z) {
        this.zza = z;
    }

    public boolean equals(Object obj) {
        return (obj instanceof AuthenticationExtensionsCredPropsOutputs) && this.zza == ((AuthenticationExtensionsCredPropsOutputs) obj).zza;
    }

    public boolean getIsDiscoverableCredential() {
        return this.zza;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.zza)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        boolean isDiscoverableCredential = getIsDiscoverableCredential();
        bb1.m0(1, parcel, 4);
        parcel.writeInt(isDiscoverableCredential ? 1 : 0);
        bb1.o0(parcel, n0);
    }

    public final JSONObject zza() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("rk", this.zza);
            return jSONObject;
        } catch (JSONException e) {
            ny61.n("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e);
            return null;
        }
    }
}
