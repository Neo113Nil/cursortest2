package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.cvw;
import defpackage.ooc;
import defpackage.oyr;
import java.util.Arrays;

/* loaded from: classes11.dex */
public class PublicKeyCredentialRpEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialRpEntity> CREATOR = new zzas();
    private final String zza;
    private final String zzb;
    private final String zzc;

    public PublicKeyCredentialRpEntity(String str, String str2, String str3) {
        cvw.l(str);
        this.zza = str;
        cvw.l(str2);
        this.zzb = str2;
        this.zzc = str3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialRpEntity)) {
            return false;
        }
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = (PublicKeyCredentialRpEntity) obj;
        return ooc.m(this.zza, publicKeyCredentialRpEntity.zza) && ooc.m(this.zzb, publicKeyCredentialRpEntity.zzb) && ooc.m(this.zzc, publicKeyCredentialRpEntity.zzc);
    }

    public String getIcon() {
        return this.zzc;
    }

    public String getId() {
        return this.zza;
    }

    public String getName() {
        return this.zzb;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PublicKeyCredentialRpEntity{\n id='");
        sb.append(this.zza);
        sb.append("', \n name='");
        sb.append(this.zzb);
        sb.append("', \n icon='");
        return oyr.t(sb, this.zzc, "'}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.g0(parcel, 2, getId(), false);
        bb1.g0(parcel, 3, getName(), false);
        bb1.g0(parcel, 4, getIcon(), false);
        bb1.o0(parcel, n0);
    }
}
