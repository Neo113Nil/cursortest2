package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.cvw;
import defpackage.h8u;

/* loaded from: classes11.dex */
public final class SignInConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new zbu();
    private final String zba;
    private final GoogleSignInOptions zbb;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        cvw.i(str);
        this.zba = str;
        this.zbb = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.zba.equals(signInConfiguration.zba)) {
            GoogleSignInOptions googleSignInOptions = this.zbb;
            GoogleSignInOptions googleSignInOptions2 = signInConfiguration.zbb;
            if (googleSignInOptions == null) {
                if (googleSignInOptions2 == null) {
                    return true;
                }
            } else if (googleSignInOptions.equals(googleSignInOptions2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        h8u h8uVar = new h8u();
        h8uVar.a(this.zba);
        h8uVar.a(this.zbb);
        return h8uVar.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zba;
        int n0 = bb1.n0(parcel, 20293);
        bb1.g0(parcel, 2, str, false);
        bb1.f0(parcel, 5, this.zbb, i, false);
        bb1.o0(parcel, n0);
    }

    public final GoogleSignInOptions zba() {
        return this.zbb;
    }
}
