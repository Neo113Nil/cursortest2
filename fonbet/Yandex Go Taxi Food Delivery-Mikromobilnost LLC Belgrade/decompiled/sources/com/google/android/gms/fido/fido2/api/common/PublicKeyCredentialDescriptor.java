package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;
import com.google.android.gms.internal.fido.zzcf;
import com.google.android.gms.internal.fido.zzgx;
import defpackage.b64;
import defpackage.bb1;
import defpackage.cvw;
import defpackage.l3a1;
import defpackage.mw4;
import defpackage.ooc;
import defpackage.oyr;
import defpackage.yci0;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class PublicKeyCredentialDescriptor extends AbstractSafeParcelable {
    private final PublicKeyCredentialType zzb;
    private final zzgx zzc;
    private final List zzd;
    private static final zzcf zza = zzcf.i(2, l3a1.a, l3a1.b);
    public static final Parcelable.Creator<PublicKeyCredentialDescriptor> CREATOR = new zzap();

    public PublicKeyCredentialDescriptor(String str, zzgx zzgxVar, List<Transport> list) {
        cvw.l(str);
        try {
            this.zzb = PublicKeyCredentialType.fromString(str);
            cvw.l(zzgxVar);
            this.zzc = zzgxVar;
            this.zzd = list;
        } catch (PublicKeyCredentialType.UnsupportedPublicKeyCredTypeException e) {
            yci0.r(e);
            throw null;
        }
    }

    public static PublicKeyCredentialDescriptor zza(JSONObject jSONObject) throws JSONException {
        return new PublicKeyCredentialDescriptor(jSONObject.getString("type"), Base64.decode(jSONObject.getString("id"), 11), jSONObject.has("transports") ? Transport.parseTransports(jSONObject.getJSONArray("transports")) : null);
    }

    public boolean equals(Object obj) {
        List list;
        if (!(obj instanceof PublicKeyCredentialDescriptor)) {
            return false;
        }
        PublicKeyCredentialDescriptor publicKeyCredentialDescriptor = (PublicKeyCredentialDescriptor) obj;
        if (!this.zzb.equals(publicKeyCredentialDescriptor.zzb) || !ooc.m(this.zzc, publicKeyCredentialDescriptor.zzc)) {
            return false;
        }
        List list2 = this.zzd;
        if (list2 == null && publicKeyCredentialDescriptor.zzd == null) {
            return true;
        }
        return list2 != null && (list = publicKeyCredentialDescriptor.zzd) != null && list2.containsAll(list) && publicKeyCredentialDescriptor.zzd.containsAll(this.zzd);
    }

    public byte[] getId() {
        return this.zzc.n();
    }

    public zzgx getIdAsByteString() {
        return this.zzc;
    }

    public List<Transport> getTransports() {
        return this.zzd;
    }

    public PublicKeyCredentialType getType() {
        return this.zzb;
    }

    public String getTypeAsString() {
        return this.zzb.toString();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.zzb, this.zzc, this.zzd});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzb);
        String b = mw4.b(getId());
        return oyr.t(b64.v("PublicKeyCredentialDescriptor{\n type=", valueOf, ", \n id=", b, ", \n transports="), String.valueOf(this.zzd), "}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.g0(parcel, 2, getTypeAsString(), false);
        bb1.V(parcel, 3, getId(), false);
        bb1.k0(parcel, 4, getTransports(), false);
        bb1.o0(parcel, n0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PublicKeyCredentialDescriptor(String str, byte[] bArr, List<Transport> list) {
        this(str, zzgx.m(bArr.length, bArr), list);
        zzgx zzgxVar = zzgx.a;
    }
}
