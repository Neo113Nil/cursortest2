package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.Attachment;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement;
import defpackage.bb1;
import defpackage.ooc;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.yci0;
import java.util.Arrays;

/* loaded from: classes11.dex */
public class AuthenticatorSelectionCriteria extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticatorSelectionCriteria> CREATOR = new zzm();
    private final Attachment zza;
    private final Boolean zzb;
    private final UserVerificationRequirement zzc;
    private final ResidentKeyRequirement zzd;

    public static class a {
        public Attachment a;
        public Boolean b;
        public ResidentKeyRequirement c;
    }

    public AuthenticatorSelectionCriteria(String str, Boolean bool, String str2, String str3) {
        Attachment fromString;
        if (str == null) {
            fromString = null;
        } else {
            try {
                fromString = Attachment.fromString(str);
            } catch (Attachment.UnsupportedAttachmentException | ResidentKeyRequirement.UnsupportedResidentKeyRequirementException | zzbc e) {
                yci0.r(e);
                throw null;
            }
        }
        this.zza = fromString;
        this.zzb = bool;
        this.zzc = str2 == null ? null : UserVerificationRequirement.fromString(str2);
        this.zzd = str3 == null ? null : ResidentKeyRequirement.fromString(str3);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorSelectionCriteria)) {
            return false;
        }
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) obj;
        return ooc.m(this.zza, authenticatorSelectionCriteria.zza) && ooc.m(this.zzb, authenticatorSelectionCriteria.zzb) && ooc.m(this.zzc, authenticatorSelectionCriteria.zzc) && ooc.m(getResidentKeyRequirement(), authenticatorSelectionCriteria.getResidentKeyRequirement());
    }

    public Attachment getAttachment() {
        return this.zza;
    }

    public String getAttachmentAsString() {
        Attachment attachment = this.zza;
        if (attachment == null) {
            return null;
        }
        return attachment.toString();
    }

    public Boolean getRequireResidentKey() {
        return this.zzb;
    }

    public ResidentKeyRequirement getResidentKeyRequirement() {
        ResidentKeyRequirement residentKeyRequirement = this.zzd;
        if (residentKeyRequirement == null) {
            Boolean bool = this.zzb;
            residentKeyRequirement = null;
            if (bool != null) {
                if (bool.booleanValue()) {
                    return ResidentKeyRequirement.RESIDENT_KEY_REQUIRED;
                }
                return null;
            }
        }
        return residentKeyRequirement;
    }

    public String getResidentKeyRequirementAsString() {
        ResidentKeyRequirement residentKeyRequirement = getResidentKeyRequirement();
        if (residentKeyRequirement == null) {
            return null;
        }
        return residentKeyRequirement.toString();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc, getResidentKeyRequirement()});
    }

    public final String toString() {
        ResidentKeyRequirement residentKeyRequirement = this.zzd;
        UserVerificationRequirement userVerificationRequirement = this.zzc;
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(userVerificationRequirement);
        String valueOf3 = String.valueOf(residentKeyRequirement);
        StringBuilder x = unr0.x("AuthenticatorSelectionCriteria{\n attachment=", valueOf, ", \n requireResidentKey=");
        x.append(this.zzb);
        x.append(", \n requireUserVerification=");
        x.append(valueOf2);
        x.append(", \n residentKeyRequirement=");
        return oyr.t(x, valueOf3, "\n }");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.g0(parcel, 2, getAttachmentAsString(), false);
        Boolean requireResidentKey = getRequireResidentKey();
        if (requireResidentKey != null) {
            bb1.m0(3, parcel, 4);
            parcel.writeInt(requireResidentKey.booleanValue() ? 1 : 0);
        }
        UserVerificationRequirement userVerificationRequirement = this.zzc;
        bb1.g0(parcel, 4, userVerificationRequirement == null ? null : userVerificationRequirement.toString(), false);
        bb1.g0(parcel, 5, getResidentKeyRequirementAsString(), false);
        bb1.o0(parcel, n0);
    }
}
