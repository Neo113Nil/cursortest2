package com.google.android.gms.auth.api.identity;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import defpackage.bb1;
import defpackage.cvw;
import defpackage.ooc;
import java.util.Arrays;

@Deprecated
/* loaded from: classes11.dex */
public final class SignInCredential extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SignInCredential> CREATOR = new zbu();
    private final String zba;
    private final String zbb;
    private final String zbc;
    private final String zbd;
    private final Uri zbe;
    private final String zbf;
    private final String zbg;
    private final String zbh;
    private final PublicKeyCredential zbi;

    public SignInCredential(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, PublicKeyCredential publicKeyCredential) {
        cvw.l(str);
        this.zba = str;
        this.zbb = str2;
        this.zbc = str3;
        this.zbd = str4;
        this.zbe = uri;
        this.zbf = str5;
        this.zbg = str6;
        this.zbh = str7;
        this.zbi = publicKeyCredential;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SignInCredential)) {
            return false;
        }
        SignInCredential signInCredential = (SignInCredential) obj;
        return ooc.m(this.zba, signInCredential.zba) && ooc.m(this.zbb, signInCredential.zbb) && ooc.m(this.zbc, signInCredential.zbc) && ooc.m(this.zbd, signInCredential.zbd) && ooc.m(this.zbe, signInCredential.zbe) && ooc.m(this.zbf, signInCredential.zbf) && ooc.m(this.zbg, signInCredential.zbg) && ooc.m(this.zbh, signInCredential.zbh) && ooc.m(this.zbi, signInCredential.zbi);
    }

    public String getDisplayName() {
        return this.zbb;
    }

    public String getFamilyName() {
        return this.zbd;
    }

    public String getGivenName() {
        return this.zbc;
    }

    public String getGoogleIdToken() {
        return this.zbg;
    }

    public String getId() {
        return this.zba;
    }

    public String getPassword() {
        return this.zbf;
    }

    @Deprecated
    public String getPhoneNumber() {
        return this.zbh;
    }

    public Uri getProfilePictureUri() {
        return this.zbe;
    }

    public PublicKeyCredential getPublicKeyCredential() {
        return this.zbi;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.zba, this.zbb, this.zbc, this.zbd, this.zbe, this.zbf, this.zbg, this.zbh, this.zbi});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.g0(parcel, 1, getId(), false);
        bb1.g0(parcel, 2, getDisplayName(), false);
        bb1.g0(parcel, 3, getGivenName(), false);
        bb1.g0(parcel, 4, getFamilyName(), false);
        bb1.f0(parcel, 5, getProfilePictureUri(), i, false);
        bb1.g0(parcel, 6, getPassword(), false);
        bb1.g0(parcel, 7, getGoogleIdToken(), false);
        bb1.g0(parcel, 8, getPhoneNumber(), false);
        bb1.f0(parcel, 9, getPublicKeyCredential(), i, false);
        bb1.o0(parcel, n0);
    }
}
