package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.hwa1;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.oyr;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class AuthenticationExtensionsClientOutputs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticationExtensionsClientOutputs> CREATOR = new zzc();
    private final UvmEntries zza;
    private final zzf zzb;
    private final AuthenticationExtensionsCredPropsOutputs zzc;
    private final zzh zzd;
    private final String zze;

    public AuthenticationExtensionsClientOutputs(UvmEntries uvmEntries, zzf zzfVar, AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs, zzh zzhVar, String str) {
        this.zza = uvmEntries;
        this.zzb = zzfVar;
        this.zzc = authenticationExtensionsCredPropsOutputs;
        this.zzd = zzhVar;
        this.zze = str;
    }

    public static AuthenticationExtensionsClientOutputs deserializeFromBytes(byte[] bArr) {
        return (AuthenticationExtensionsClientOutputs) hwa1.a(bArr, CREATOR);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensionsClientOutputs)) {
            return false;
        }
        AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = (AuthenticationExtensionsClientOutputs) obj;
        return ooc.m(this.zza, authenticationExtensionsClientOutputs.zza) && ooc.m(this.zzb, authenticationExtensionsClientOutputs.zzb) && ooc.m(this.zzc, authenticationExtensionsClientOutputs.zzc) && ooc.m(this.zzd, authenticationExtensionsClientOutputs.zzd) && ooc.m(this.zze, authenticationExtensionsClientOutputs.zze);
    }

    public AuthenticationExtensionsCredPropsOutputs getCredProps() {
        return this.zzc;
    }

    public UvmEntries getUvmEntries() {
        return this.zza;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc, this.zzd, this.zze});
    }

    public byte[] serializeToBytes() {
        return hwa1.f(this);
    }

    public final String toString() {
        return oyr.p("AuthenticationExtensionsClientOutputs{", zza().toString(), "}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.f0(parcel, 1, getUvmEntries(), i, false);
        bb1.f0(parcel, 2, this.zzb, i, false);
        bb1.f0(parcel, 3, getCredProps(), i, false);
        bb1.f0(parcel, 4, this.zzd, i, false);
        bb1.g0(parcel, 5, this.zze, false);
        bb1.o0(parcel, n0);
    }

    public final JSONObject zza() {
        try {
            JSONObject jSONObject = new JSONObject();
            AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs = this.zzc;
            if (authenticationExtensionsCredPropsOutputs != null) {
                jSONObject.put("credProps", authenticationExtensionsCredPropsOutputs.zza());
            }
            UvmEntries uvmEntries = this.zza;
            if (uvmEntries != null) {
                jSONObject.put("uvm", uvmEntries.zza());
            }
            zzh zzhVar = this.zzd;
            if (zzhVar != null) {
                jSONObject.put("prf", zzhVar.zza());
            }
            String str = this.zze;
            if (str != null) {
                jSONObject.put("txAuthSimple", str);
            }
            return jSONObject;
        } catch (JSONException e) {
            ny61.n("Error encoding AuthenticationExtensionsClientOutputs to JSON object", e);
            return null;
        }
    }
}
