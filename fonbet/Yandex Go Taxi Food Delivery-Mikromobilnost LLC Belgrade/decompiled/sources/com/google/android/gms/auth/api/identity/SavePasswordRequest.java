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
public class SavePasswordRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SavePasswordRequest> CREATOR = new zbs();
    private final SignInPassword zba;
    private final String zbb;
    private final int zbc;

    public static final class a {
        public SignInPassword a;
        public String b;
        public int c;
    }

    public SavePasswordRequest(SignInPassword signInPassword, String str, int i) {
        cvw.l(signInPassword);
        this.zba = signInPassword;
        this.zbb = str;
        this.zbc = i;
    }

    public static a builder() {
        return new a();
    }

    public static a zba(SavePasswordRequest savePasswordRequest) {
        cvw.l(savePasswordRequest);
        a builder = builder();
        builder.a = savePasswordRequest.getSignInPassword();
        builder.c = savePasswordRequest.zbc;
        String str = savePasswordRequest.zbb;
        if (str != null) {
            builder.b = str;
        }
        return builder;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SavePasswordRequest)) {
            return false;
        }
        SavePasswordRequest savePasswordRequest = (SavePasswordRequest) obj;
        return ooc.m(this.zba, savePasswordRequest.zba) && ooc.m(this.zbb, savePasswordRequest.zbb) && this.zbc == savePasswordRequest.zbc;
    }

    public SignInPassword getSignInPassword() {
        return this.zba;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.zba, this.zbb});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.f0(parcel, 1, getSignInPassword(), i, false);
        bb1.g0(parcel, 2, this.zbb, false);
        int i2 = this.zbc;
        bb1.m0(3, parcel, 4);
        parcel.writeInt(i2);
        bb1.o0(parcel, n0);
    }
}
