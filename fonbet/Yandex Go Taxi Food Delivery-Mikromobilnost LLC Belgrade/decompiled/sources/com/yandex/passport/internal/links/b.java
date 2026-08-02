package com.yandex.passport.internal.links;

import android.net.Uri;
import com.yandex.passport.internal.ModernAccount;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;

/* loaded from: classes15.dex */
public final class b extends e {
    public final Uri e;
    public final ModernAccount f;
    public final String g;
    public final String h;

    public b(Uri uri, ModernAccount modernAccount, String str, String str2) {
        super(uri, modernAccount, LinkMode.PAY_URL, str2);
        this.e = uri;
        this.f = modernAccount;
        this.g = str;
        this.h = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return jl40.l(this.e, bVar.e) && jl40.l(this.f, bVar.f) && jl40.l(this.g, bVar.g) && jl40.l(this.h, bVar.h);
    }

    public final int hashCode() {
        int hashCode = this.e.hashCode() * 31;
        ModernAccount modernAccount = this.f;
        int b = unr0.b((hashCode + (modernAccount == null ? 0 : modernAccount.hashCode())) * 31, 31, this.g);
        String str = this.h;
        return b + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PayUrl(uri=");
        sb.append(this.e);
        sb.append(", account=");
        sb.append(this.f);
        sb.append(", paySessionId=");
        sb.append(this.g);
        sb.append(", browserName=");
        return b64.p(sb, this.h, ')');
    }
}
