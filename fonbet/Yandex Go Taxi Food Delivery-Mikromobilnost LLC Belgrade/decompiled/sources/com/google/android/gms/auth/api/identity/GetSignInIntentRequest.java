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
public class GetSignInIntentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetSignInIntentRequest> CREATOR = new zbl();
    private final String zba;
    private final String zbb;
    private final String zbc;
    private final String zbd;
    private final boolean zbe;
    private final int zbf;

    public static final class a {
        public String a;
        public String b;
        public String c;
        public String d;
        public boolean e;
        public int f;
    }

    public GetSignInIntentRequest(String str, String str2, String str3, String str4, boolean z, int i) {
        cvw.l(str);
        this.zba = str;
        this.zbb = str2;
        this.zbc = str3;
        this.zbd = str4;
        this.zbe = z;
        this.zbf = i;
    }

    public static a builder() {
        return new a();
    }

    public static a zba(GetSignInIntentRequest getSignInIntentRequest) {
        cvw.l(getSignInIntentRequest);
        a builder = builder();
        String serverClientId = getSignInIntentRequest.getServerClientId();
        builder.getClass();
        cvw.l(serverClientId);
        builder.a = serverClientId;
        builder.d = getSignInIntentRequest.getNonce();
        builder.b = getSignInIntentRequest.getHostedDomainFilter();
        builder.e = getSignInIntentRequest.zbe;
        builder.f = getSignInIntentRequest.zbf;
        String str = getSignInIntentRequest.zbc;
        if (str != null) {
            builder.c = str;
        }
        return builder;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GetSignInIntentRequest)) {
            return false;
        }
        GetSignInIntentRequest getSignInIntentRequest = (GetSignInIntentRequest) obj;
        return ooc.m(this.zba, getSignInIntentRequest.zba) && ooc.m(this.zbd, getSignInIntentRequest.zbd) && ooc.m(this.zbb, getSignInIntentRequest.zbb) && ooc.m(Boolean.valueOf(this.zbe), Boolean.valueOf(getSignInIntentRequest.zbe)) && this.zbf == getSignInIntentRequest.zbf;
    }

    public String getHostedDomainFilter() {
        return this.zbb;
    }

    public String getNonce() {
        return this.zbd;
    }

    public String getServerClientId() {
        return this.zba;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.zba, this.zbb, this.zbd, Boolean.valueOf(this.zbe), Integer.valueOf(this.zbf)});
    }

    @Deprecated
    public boolean requestVerifiedPhoneNumber() {
        return this.zbe;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.g0(parcel, 1, getServerClientId(), false);
        bb1.g0(parcel, 2, getHostedDomainFilter(), false);
        bb1.g0(parcel, 3, this.zbc, false);
        bb1.g0(parcel, 4, getNonce(), false);
        boolean requestVerifiedPhoneNumber = requestVerifiedPhoneNumber();
        bb1.m0(5, parcel, 4);
        parcel.writeInt(requestVerifiedPhoneNumber ? 1 : 0);
        int i2 = this.zbf;
        bb1.m0(6, parcel, 4);
        parcel.writeInt(i2);
        bb1.o0(parcel, n0);
    }
}
