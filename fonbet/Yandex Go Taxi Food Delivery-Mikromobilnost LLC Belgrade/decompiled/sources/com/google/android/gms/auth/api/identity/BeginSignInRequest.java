package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.cvw;
import defpackage.ooc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

@Deprecated
/* loaded from: classes11.dex */
public final class BeginSignInRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BeginSignInRequest> CREATOR = new zbg();
    private final PasswordRequestOptions zba;
    private final GoogleIdTokenRequestOptions zbb;
    private final String zbc;
    private final boolean zbd;
    private final int zbe;
    private final PasskeysRequestOptions zbf;
    private final PasskeyJsonRequestOptions zbg;
    private final boolean zbh;

    @Deprecated
    public static final class GoogleIdTokenRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<GoogleIdTokenRequestOptions> CREATOR = new zbm();
        private final boolean zba;
        private final String zbb;
        private final String zbc;
        private final boolean zbd;
        private final String zbe;
        private final List zbf;
        private final boolean zbg;

        public static final class a {
        }

        public GoogleIdTokenRequestOptions(boolean z, String str, String str2, boolean z2, String str3, List list, boolean z3) {
            boolean z4 = true;
            if (z2 && z3) {
                z4 = false;
            }
            cvw.d("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z4);
            this.zba = z;
            if (z) {
                cvw.m(str, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.zbb = str;
            this.zbc = str2;
            this.zbd = z2;
            Parcelable.Creator<BeginSignInRequest> creator = BeginSignInRequest.CREATOR;
            ArrayList arrayList = null;
            if (list != null && !list.isEmpty()) {
                arrayList = new ArrayList(list);
                Collections.sort(arrayList);
            }
            this.zbf = arrayList;
            this.zbe = str3;
            this.zbg = z3;
        }

        public static a builder() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof GoogleIdTokenRequestOptions)) {
                return false;
            }
            GoogleIdTokenRequestOptions googleIdTokenRequestOptions = (GoogleIdTokenRequestOptions) obj;
            return this.zba == googleIdTokenRequestOptions.zba && ooc.m(this.zbb, googleIdTokenRequestOptions.zbb) && ooc.m(this.zbc, googleIdTokenRequestOptions.zbc) && this.zbd == googleIdTokenRequestOptions.zbd && ooc.m(this.zbe, googleIdTokenRequestOptions.zbe) && ooc.m(this.zbf, googleIdTokenRequestOptions.zbf) && this.zbg == googleIdTokenRequestOptions.zbg;
        }

        public boolean filterByAuthorizedAccounts() {
            return this.zbd;
        }

        public List<String> getIdTokenDepositionScopes() {
            return this.zbf;
        }

        public String getLinkedServiceId() {
            return this.zbe;
        }

        public String getNonce() {
            return this.zbc;
        }

        public String getServerClientId() {
            return this.zbb;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.zba), this.zbb, this.zbc, Boolean.valueOf(this.zbd), this.zbe, this.zbf, Boolean.valueOf(this.zbg)});
        }

        public boolean isSupported() {
            return this.zba;
        }

        @Deprecated
        public boolean requestVerifiedPhoneNumber() {
            return this.zbg;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            int n0 = bb1.n0(parcel, 20293);
            boolean isSupported = isSupported();
            bb1.m0(1, parcel, 4);
            parcel.writeInt(isSupported ? 1 : 0);
            bb1.g0(parcel, 2, getServerClientId(), false);
            bb1.g0(parcel, 3, getNonce(), false);
            boolean filterByAuthorizedAccounts = filterByAuthorizedAccounts();
            bb1.m0(4, parcel, 4);
            parcel.writeInt(filterByAuthorizedAccounts ? 1 : 0);
            bb1.g0(parcel, 5, getLinkedServiceId(), false);
            bb1.i0(parcel, 6, getIdTokenDepositionScopes());
            boolean requestVerifiedPhoneNumber = requestVerifiedPhoneNumber();
            bb1.m0(7, parcel, 4);
            parcel.writeInt(requestVerifiedPhoneNumber ? 1 : 0);
            bb1.o0(parcel, n0);
        }
    }

    @Deprecated
    public static final class PasskeyJsonRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<PasskeyJsonRequestOptions> CREATOR = new zbn();
        private final boolean zba;
        private final String zbb;

        public static final class a {
            public boolean a = false;
            public String b;
        }

        public PasskeyJsonRequestOptions(boolean z, String str) {
            if (z) {
                cvw.l(str);
            }
            this.zba = z;
            this.zbb = str;
        }

        public static a builder() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasskeyJsonRequestOptions)) {
                return false;
            }
            PasskeyJsonRequestOptions passkeyJsonRequestOptions = (PasskeyJsonRequestOptions) obj;
            return this.zba == passkeyJsonRequestOptions.zba && ooc.m(this.zbb, passkeyJsonRequestOptions.zbb);
        }

        public String getRequestJson() {
            return this.zbb;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.zba), this.zbb});
        }

        public boolean isSupported() {
            return this.zba;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            int n0 = bb1.n0(parcel, 20293);
            boolean isSupported = isSupported();
            bb1.m0(1, parcel, 4);
            parcel.writeInt(isSupported ? 1 : 0);
            bb1.g0(parcel, 2, getRequestJson(), false);
            bb1.o0(parcel, n0);
        }
    }

    @Deprecated
    public static final class PasskeysRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<PasskeysRequestOptions> CREATOR = new zbo();
        private final boolean zba;
        private final byte[] zbb;
        private final String zbc;

        public static final class a {
            public boolean a = false;
            public byte[] b;
            public String c;
        }

        public PasskeysRequestOptions(boolean z, byte[] bArr, String str) {
            if (z) {
                cvw.l(bArr);
                cvw.l(str);
            }
            this.zba = z;
            this.zbb = bArr;
            this.zbc = str;
        }

        public static a builder() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasskeysRequestOptions)) {
                return false;
            }
            PasskeysRequestOptions passkeysRequestOptions = (PasskeysRequestOptions) obj;
            return this.zba == passkeysRequestOptions.zba && Arrays.equals(this.zbb, passkeysRequestOptions.zbb) && Objects.equals(this.zbc, passkeysRequestOptions.zbc);
        }

        public byte[] getChallenge() {
            return this.zbb;
        }

        public String getRpId() {
            return this.zbc;
        }

        public int hashCode() {
            return Arrays.hashCode(this.zbb) + (Objects.hash(Boolean.valueOf(this.zba), this.zbc) * 31);
        }

        public boolean isSupported() {
            return this.zba;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            int n0 = bb1.n0(parcel, 20293);
            boolean isSupported = isSupported();
            bb1.m0(1, parcel, 4);
            parcel.writeInt(isSupported ? 1 : 0);
            bb1.V(parcel, 2, getChallenge(), false);
            bb1.g0(parcel, 3, getRpId(), false);
            bb1.o0(parcel, n0);
        }
    }

    @Deprecated
    public static final class PasswordRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<PasswordRequestOptions> CREATOR = new zbp();
        private final boolean zba;

        public static final class a {
            public boolean a = false;
        }

        public PasswordRequestOptions(boolean z) {
            this.zba = z;
        }

        public static a builder() {
            return new a();
        }

        public boolean equals(Object obj) {
            return (obj instanceof PasswordRequestOptions) && this.zba == ((PasswordRequestOptions) obj).zba;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.zba)});
        }

        public boolean isSupported() {
            return this.zba;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            int n0 = bb1.n0(parcel, 20293);
            boolean isSupported = isSupported();
            bb1.m0(1, parcel, 4);
            parcel.writeInt(isSupported ? 1 : 0);
            bb1.o0(parcel, n0);
        }
    }

    public static final class a {
        public PasswordRequestOptions a;
        public GoogleIdTokenRequestOptions b;
        public PasskeysRequestOptions c;
        public PasskeyJsonRequestOptions d;
        public String e;
        public boolean f;
        public int g;
        public boolean h;

        public a() {
            PasswordRequestOptions.a builder = PasswordRequestOptions.builder();
            builder.a = false;
            this.a = new PasswordRequestOptions(builder.a);
            GoogleIdTokenRequestOptions.builder().getClass();
            this.b = new GoogleIdTokenRequestOptions(false, null, null, true, null, null, false);
            PasskeysRequestOptions.a builder2 = PasskeysRequestOptions.builder();
            builder2.a = false;
            this.c = new PasskeysRequestOptions(builder2.a, builder2.b, builder2.c);
            PasskeyJsonRequestOptions.a builder3 = PasskeyJsonRequestOptions.builder();
            builder3.a = false;
            this.d = new PasskeyJsonRequestOptions(builder3.a, builder3.b);
        }
    }

    public BeginSignInRequest(PasswordRequestOptions passwordRequestOptions, GoogleIdTokenRequestOptions googleIdTokenRequestOptions, String str, boolean z, int i, PasskeysRequestOptions passkeysRequestOptions, PasskeyJsonRequestOptions passkeyJsonRequestOptions, boolean z2) {
        cvw.l(passwordRequestOptions);
        this.zba = passwordRequestOptions;
        cvw.l(googleIdTokenRequestOptions);
        this.zbb = googleIdTokenRequestOptions;
        this.zbc = str;
        this.zbd = z;
        this.zbe = i;
        if (passkeysRequestOptions == null) {
            PasskeysRequestOptions.a builder = PasskeysRequestOptions.builder();
            builder.a = false;
            passkeysRequestOptions = new PasskeysRequestOptions(builder.a, builder.b, builder.c);
        }
        this.zbf = passkeysRequestOptions;
        if (passkeyJsonRequestOptions == null) {
            PasskeyJsonRequestOptions.a builder2 = PasskeyJsonRequestOptions.builder();
            builder2.a = false;
            passkeyJsonRequestOptions = new PasskeyJsonRequestOptions(builder2.a, builder2.b);
        }
        this.zbg = passkeyJsonRequestOptions;
        this.zbh = z2;
    }

    public static a builder() {
        return new a();
    }

    public static a zba(BeginSignInRequest beginSignInRequest) {
        cvw.l(beginSignInRequest);
        a builder = builder();
        GoogleIdTokenRequestOptions googleIdTokenRequestOptions = beginSignInRequest.getGoogleIdTokenRequestOptions();
        builder.getClass();
        cvw.l(googleIdTokenRequestOptions);
        builder.b = googleIdTokenRequestOptions;
        PasswordRequestOptions passwordRequestOptions = beginSignInRequest.getPasswordRequestOptions();
        cvw.l(passwordRequestOptions);
        builder.a = passwordRequestOptions;
        PasskeysRequestOptions passkeysRequestOptions = beginSignInRequest.getPasskeysRequestOptions();
        cvw.l(passkeysRequestOptions);
        builder.c = passkeysRequestOptions;
        PasskeyJsonRequestOptions passkeyJsonRequestOptions = beginSignInRequest.getPasskeyJsonRequestOptions();
        cvw.l(passkeyJsonRequestOptions);
        builder.d = passkeyJsonRequestOptions;
        builder.f = beginSignInRequest.zbd;
        builder.g = beginSignInRequest.zbe;
        builder.h = beginSignInRequest.zbh;
        String str = beginSignInRequest.zbc;
        if (str != null) {
            builder.e = str;
        }
        return builder;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BeginSignInRequest)) {
            return false;
        }
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) obj;
        return ooc.m(this.zba, beginSignInRequest.zba) && ooc.m(this.zbb, beginSignInRequest.zbb) && ooc.m(this.zbf, beginSignInRequest.zbf) && ooc.m(this.zbg, beginSignInRequest.zbg) && ooc.m(this.zbc, beginSignInRequest.zbc) && this.zbd == beginSignInRequest.zbd && this.zbe == beginSignInRequest.zbe && this.zbh == beginSignInRequest.zbh;
    }

    public GoogleIdTokenRequestOptions getGoogleIdTokenRequestOptions() {
        return this.zbb;
    }

    public PasskeyJsonRequestOptions getPasskeyJsonRequestOptions() {
        return this.zbg;
    }

    public PasskeysRequestOptions getPasskeysRequestOptions() {
        return this.zbf;
    }

    public PasswordRequestOptions getPasswordRequestOptions() {
        return this.zba;
    }

    public boolean getPreferImmediatelyAvailableCredentials() {
        return this.zbh;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.zba, this.zbb, this.zbf, this.zbg, this.zbc, Boolean.valueOf(this.zbd), Integer.valueOf(this.zbe), Boolean.valueOf(this.zbh)});
    }

    public boolean isAutoSelectEnabled() {
        return this.zbd;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.f0(parcel, 1, getPasswordRequestOptions(), i, false);
        bb1.f0(parcel, 2, getGoogleIdTokenRequestOptions(), i, false);
        bb1.g0(parcel, 3, this.zbc, false);
        boolean isAutoSelectEnabled = isAutoSelectEnabled();
        bb1.m0(4, parcel, 4);
        parcel.writeInt(isAutoSelectEnabled ? 1 : 0);
        int i2 = this.zbe;
        bb1.m0(5, parcel, 4);
        parcel.writeInt(i2);
        bb1.f0(parcel, 6, getPasskeysRequestOptions(), i, false);
        bb1.f0(parcel, 7, getPasskeyJsonRequestOptions(), i, false);
        boolean preferImmediatelyAvailableCredentials = getPreferImmediatelyAvailableCredentials();
        bb1.m0(8, parcel, 4);
        parcel.writeInt(preferImmediatelyAvailableCredentials ? 1 : 0);
        bb1.o0(parcel, n0);
    }
}
