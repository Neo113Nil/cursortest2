package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.fido.zzgx;
import defpackage.bb1;
import defpackage.cvw;
import defpackage.mw4;
import defpackage.ooc;
import defpackage.oyr;
import defpackage.unr0;
import java.util.Arrays;

/* loaded from: classes11.dex */
public class PublicKeyCredentialUserEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialUserEntity> CREATOR = new zzau();
    private final zzgx zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;

    public PublicKeyCredentialUserEntity(zzgx zzgxVar, String str, String str2, String str3) {
        cvw.l(zzgxVar);
        this.zza = zzgxVar;
        cvw.l(str);
        this.zzb = str;
        this.zzc = str2;
        cvw.l(str3);
        this.zzd = str3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialUserEntity)) {
            return false;
        }
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) obj;
        return ooc.m(this.zza, publicKeyCredentialUserEntity.zza) && ooc.m(this.zzb, publicKeyCredentialUserEntity.zzb) && ooc.m(this.zzc, publicKeyCredentialUserEntity.zzc) && ooc.m(this.zzd, publicKeyCredentialUserEntity.zzd);
    }

    public String getDisplayName() {
        return this.zzd;
    }

    public String getIcon() {
        return this.zzc;
    }

    public byte[] getId() {
        return this.zza.n();
    }

    public zzgx getIdAsByteString() {
        return this.zza;
    }

    public String getName() {
        return this.zzb;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc, this.zzd});
    }

    public final String toString() {
        StringBuilder x = unr0.x("PublicKeyCredentialUserEntity{\n id=", mw4.b(this.zza.n()), ", \n name='");
        x.append(this.zzb);
        x.append("', \n icon='");
        x.append(this.zzc);
        x.append("', \n displayName='");
        return oyr.t(x, this.zzd, "'}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.V(parcel, 2, getId(), false);
        bb1.g0(parcel, 3, getName(), false);
        bb1.g0(parcel, 4, getIcon(), false);
        bb1.g0(parcel, 5, getDisplayName(), false);
        bb1.o0(parcel, n0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PublicKeyCredentialUserEntity(byte[] bArr, String str, String str2, String str3) {
        this(zzgx.m(bArr.length, bArr), str, str2, str3);
        cvw.l(bArr);
    }
}
