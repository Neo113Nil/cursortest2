package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.cvw;
import defpackage.ooc;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes11.dex */
public final class AuthorizationResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthorizationResult> CREATOR = new zbf();
    private final String zba;
    private final String zbb;
    private final String zbc;
    private final List zbd;
    private final GoogleSignInAccount zbe;
    private final PendingIntent zbf;

    public AuthorizationResult(String str, String str2, String str3, List<String> list, GoogleSignInAccount googleSignInAccount, PendingIntent pendingIntent) {
        this.zba = str;
        this.zbb = str2;
        this.zbc = str3;
        cvw.l(list);
        this.zbd = list;
        this.zbf = pendingIntent;
        this.zbe = googleSignInAccount;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthorizationResult)) {
            return false;
        }
        AuthorizationResult authorizationResult = (AuthorizationResult) obj;
        return ooc.m(this.zba, authorizationResult.zba) && ooc.m(this.zbb, authorizationResult.zbb) && ooc.m(this.zbc, authorizationResult.zbc) && ooc.m(this.zbd, authorizationResult.zbd) && ooc.m(this.zbf, authorizationResult.zbf) && ooc.m(this.zbe, authorizationResult.zbe);
    }

    public String getAccessToken() {
        return this.zbb;
    }

    public List<String> getGrantedScopes() {
        return this.zbd;
    }

    public PendingIntent getPendingIntent() {
        return this.zbf;
    }

    public String getServerAuthCode() {
        return this.zba;
    }

    public boolean hasResolution() {
        return this.zbf != null;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.zba, this.zbb, this.zbc, this.zbd, this.zbf, this.zbe});
    }

    public GoogleSignInAccount toGoogleSignInAccount() {
        return this.zbe;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.g0(parcel, 1, getServerAuthCode(), false);
        bb1.g0(parcel, 2, getAccessToken(), false);
        bb1.g0(parcel, 3, this.zbc, false);
        bb1.i0(parcel, 4, getGrantedScopes());
        bb1.f0(parcel, 5, toGoogleSignInAccount(), i, false);
        bb1.f0(parcel, 6, getPendingIntent(), i, false);
        bb1.o0(parcel, n0);
    }
}
