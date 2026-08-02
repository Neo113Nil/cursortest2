package com.yandex.passport.internal.links;

import android.net.Uri;
import com.yandex.passport.internal.ModernAccount;
import defpackage.b64;
import defpackage.jl40;

/* loaded from: classes15.dex */
public final class a extends e {
    public final Uri e;
    public final ModernAccount f;
    public final String g;

    public a(Uri uri, ModernAccount modernAccount, String str) {
        super(uri, modernAccount, LinkMode.AUTH_QR, str);
        this.e = uri;
        this.f = modernAccount;
        this.g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return jl40.l(this.e, aVar.e) && jl40.l(this.f, aVar.f) && jl40.l(this.g, aVar.g);
    }

    public final int hashCode() {
        int hashCode = this.e.hashCode() * 31;
        ModernAccount modernAccount = this.f;
        int hashCode2 = (hashCode + (modernAccount == null ? 0 : modernAccount.hashCode())) * 31;
        String str = this.g;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthQR(uri=");
        sb.append(this.e);
        sb.append(", account=");
        sb.append(this.f);
        sb.append(", browserName=");
        return b64.p(sb, this.g, ')');
    }
}
