package com.yandex.passport.internal.autologin;

import com.yandex.passport.common.core.Environment;
import defpackage.b64;
import defpackage.jl40;
import java.util.List;

/* loaded from: classes8.dex */
public final class i {
    public final List a;
    public final Environment b;
    public final String c;
    public final String d;

    public i(List list, Environment environment, String str, String str2) {
        this.a = list;
        this.b = environment;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return jl40.l(this.a, iVar.a) && this.b == iVar.b && jl40.l(this.c, iVar.c) && jl40.l(this.d, iVar.d);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(modernAccounts=");
        sb.append(this.a);
        sb.append(", environment=");
        sb.append(this.b);
        sb.append(", clientId=");
        sb.append(this.c);
        sb.append(", phoneNumber=");
        return b64.p(sb, this.d, ')');
    }
}
