package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.cvw;

/* loaded from: classes11.dex */
public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new zbc();

    @Deprecated
    final String zba;

    @Deprecated
    final String zbb;
    private final GoogleSignInAccount zbc;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.zbc = googleSignInAccount;
        cvw.j(str, "8.3 and 8.4 SDKs require non-null email");
        this.zba = str;
        cvw.j(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.zbb = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zba;
        int n0 = bb1.n0(parcel, 20293);
        bb1.g0(parcel, 4, str, false);
        bb1.f0(parcel, 7, this.zbc, i, false);
        bb1.g0(parcel, 8, this.zbb, false);
        bb1.o0(parcel, n0);
    }

    public final GoogleSignInAccount zba() {
        return this.zbc;
    }
}
