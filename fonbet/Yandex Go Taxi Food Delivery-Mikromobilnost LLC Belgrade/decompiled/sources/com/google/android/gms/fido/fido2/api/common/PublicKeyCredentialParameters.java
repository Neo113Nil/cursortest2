package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;
import defpackage.bb1;
import defpackage.cvw;
import defpackage.unr0;
import defpackage.yci0;
import java.util.Arrays;

/* loaded from: classes11.dex */
public class PublicKeyCredentialParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialParameters> CREATOR = new zzaq();
    private final PublicKeyCredentialType zza;
    private final COSEAlgorithmIdentifier zzb;

    public PublicKeyCredentialParameters(String str, int i) {
        cvw.l(str);
        try {
            this.zza = PublicKeyCredentialType.fromString(str);
            try {
                this.zzb = COSEAlgorithmIdentifier.fromCoseValue(i);
            } catch (COSEAlgorithmIdentifier.UnsupportedAlgorithmIdentifierException e) {
                yci0.r(e);
                throw null;
            }
        } catch (PublicKeyCredentialType.UnsupportedPublicKeyCredTypeException e2) {
            yci0.r(e2);
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialParameters)) {
            return false;
        }
        PublicKeyCredentialParameters publicKeyCredentialParameters = (PublicKeyCredentialParameters) obj;
        return this.zza.equals(publicKeyCredentialParameters.zza) && this.zzb.equals(publicKeyCredentialParameters.zzb);
    }

    public COSEAlgorithmIdentifier getAlgorithm() {
        return this.zzb;
    }

    public int getAlgorithmIdAsInteger() {
        return this.zzb.toCoseValue();
    }

    public PublicKeyCredentialType getType() {
        return this.zza;
    }

    public String getTypeAsString() {
        return this.zza.toString();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        return unr0.p("PublicKeyCredentialParameters{\n type=", String.valueOf(this.zza), ", \n algorithm=", String.valueOf(this.zzb), "\n }");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.g0(parcel, 2, getTypeAsString(), false);
        bb1.d0(parcel, 3, Integer.valueOf(getAlgorithmIdAsInteger()));
        bb1.o0(parcel, n0);
    }
}
