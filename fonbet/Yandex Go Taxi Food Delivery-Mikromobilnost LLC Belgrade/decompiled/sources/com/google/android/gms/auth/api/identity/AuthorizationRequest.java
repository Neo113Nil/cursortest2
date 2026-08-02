package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.cvw;
import defpackage.ooc;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes11.dex */
public class AuthorizationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AuthorizationRequest> CREATOR = new zbe();
    private final List zba;
    private final String zbb;
    private final boolean zbc;
    private final boolean zbd;
    private final Account zbe;
    private final String zbf;
    private final String zbg;
    private final boolean zbh;
    private final Bundle zbi;

    public static final class a {
        public String a;
        public Bundle b;
    }

    public AuthorizationRequest(List list, String str, boolean z, boolean z2, Account account, String str2, String str3, boolean z3, Bundle bundle) {
        boolean z4 = false;
        if (list != null && !list.isEmpty()) {
            z4 = true;
        }
        cvw.d("requestedScopes cannot be null or empty", z4);
        this.zba = list;
        this.zbb = str;
        this.zbc = z;
        this.zbd = z2;
        this.zbe = account;
        this.zbf = str2;
        this.zbg = str3;
        this.zbh = z3;
        this.zbi = bundle;
    }

    public static a builder() {
        return new a();
    }

    public static a zba(AuthorizationRequest authorizationRequest) {
        zbd zbdVar;
        cvw.l(authorizationRequest);
        a builder = builder();
        List<Scope> requestedScopes = authorizationRequest.getRequestedScopes();
        builder.getClass();
        boolean z = true;
        cvw.d("requestedScopes cannot be null or empty", (requestedScopes == null || requestedScopes.isEmpty()) ? false : true);
        Bundle bundle = authorizationRequest.zbi;
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                zbd[] values = zbd.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        zbdVar = null;
                        break;
                    }
                    zbdVar = values[i];
                    if (zbdVar.zbc.equals(str)) {
                        break;
                    }
                    i++;
                }
                if (string != null && zbdVar != null) {
                    if (builder.b == null) {
                        builder.b = new Bundle();
                    }
                    builder.b.putString(zbdVar.zbc, string);
                }
            }
        }
        authorizationRequest.isForceCodeForRefreshToken();
        String hostedDomain = authorizationRequest.getHostedDomain();
        authorizationRequest.getAccount();
        String serverClientId = authorizationRequest.getServerClientId();
        if (hostedDomain != null) {
            cvw.i(hostedDomain);
        }
        if (authorizationRequest.zbd && serverClientId != null) {
            String str2 = builder.a;
            cvw.d("two different server client ids provided", str2 == null || str2.equals(serverClientId));
            builder.a = serverClientId;
        }
        if (authorizationRequest.isOfflineAccessRequested() && serverClientId != null) {
            String str3 = builder.a;
            if (str3 != null && !str3.equals(serverClientId)) {
                z = false;
            }
            cvw.d("two different server client ids provided", z);
            builder.a = serverClientId;
        }
        return builder;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthorizationRequest)) {
            return false;
        }
        AuthorizationRequest authorizationRequest = (AuthorizationRequest) obj;
        if (this.zba.size() == authorizationRequest.zba.size() && this.zba.containsAll(authorizationRequest.zba)) {
            Bundle bundle = authorizationRequest.zbi;
            Bundle bundle2 = this.zbi;
            if (bundle2 == null) {
                if (bundle == null) {
                    bundle = null;
                }
                return false;
            }
            if (bundle2 == null || bundle != null) {
                if (bundle2 != null) {
                    if (bundle2.size() != bundle.size()) {
                        return false;
                    }
                    for (String str : this.zbi.keySet()) {
                        if (!ooc.m(this.zbi.getString(str), bundle.getString(str))) {
                            return false;
                        }
                    }
                }
                if (this.zbc == authorizationRequest.zbc && this.zbh == authorizationRequest.zbh && this.zbd == authorizationRequest.zbd && ooc.m(this.zbb, authorizationRequest.zbb) && ooc.m(this.zbe, authorizationRequest.zbe) && ooc.m(this.zbf, authorizationRequest.zbf) && ooc.m(this.zbg, authorizationRequest.zbg)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public Account getAccount() {
        return this.zbe;
    }

    public String getHostedDomain() {
        return this.zbf;
    }

    public List<Scope> getRequestedScopes() {
        return this.zba;
    }

    public String getServerClientId() {
        return this.zbb;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.zba, this.zbb, Boolean.valueOf(this.zbc), Boolean.valueOf(this.zbh), Boolean.valueOf(this.zbd), this.zbe, this.zbf, this.zbg, this.zbi});
    }

    public boolean isForceCodeForRefreshToken() {
        return this.zbh;
    }

    public boolean isOfflineAccessRequested() {
        return this.zbc;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.k0(parcel, 1, getRequestedScopes(), false);
        bb1.g0(parcel, 2, getServerClientId(), false);
        boolean isOfflineAccessRequested = isOfflineAccessRequested();
        bb1.m0(3, parcel, 4);
        parcel.writeInt(isOfflineAccessRequested ? 1 : 0);
        boolean z = this.zbd;
        bb1.m0(4, parcel, 4);
        parcel.writeInt(z ? 1 : 0);
        bb1.f0(parcel, 5, getAccount(), i, false);
        bb1.g0(parcel, 6, getHostedDomain(), false);
        bb1.g0(parcel, 7, this.zbg, false);
        boolean isForceCodeForRefreshToken = isForceCodeForRefreshToken();
        bb1.m0(8, parcel, 4);
        parcel.writeInt(isForceCodeForRefreshToken ? 1 : 0);
        bb1.U(parcel, 9, this.zbi, false);
        bb1.o0(parcel, n0);
    }
}
