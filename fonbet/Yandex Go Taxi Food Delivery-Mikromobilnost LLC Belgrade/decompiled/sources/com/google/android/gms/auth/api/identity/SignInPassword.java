package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.cvw;
import defpackage.ooc;
import java.util.Arrays;

@Deprecated
/* loaded from: classes11.dex */
public class SignInPassword extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SignInPassword> CREATOR = new zbw();
    private final String zba;
    private final String zbb;

    public SignInPassword(String str, String str2) {
        cvw.m(str, "Account identifier cannot be null");
        String trim = str.trim();
        cvw.j(trim, "Account identifier cannot be empty");
        this.zba = trim;
        cvw.i(str2);
        this.zbb = str2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SignInPassword)) {
            return false;
        }
        SignInPassword signInPassword = (SignInPassword) obj;
        return ooc.m(this.zba, signInPassword.zba) && ooc.m(this.zbb, signInPassword.zbb);
    }

    public String getId() {
        return this.zba;
    }

    public String getPassword() {
        return this.zbb;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.zba, this.zbb});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.g0(parcel, 1, getId(), false);
        bb1.g0(parcel, 2, getPassword(), false);
        bb1.o0(parcel, n0);
    }
}
