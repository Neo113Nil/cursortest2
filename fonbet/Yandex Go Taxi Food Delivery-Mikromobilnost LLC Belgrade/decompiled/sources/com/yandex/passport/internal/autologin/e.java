package com.yandex.passport.internal.autologin;

import com.yandex.passport.api.PassportAutoLoginMode;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.internal.credentials.ClientCredentials;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import java.util.List;

/* loaded from: classes8.dex */
public final class e {
    public final PassportAutoLoginMode a;
    public final List b;
    public final boolean c;
    public final Environment d;
    public final ClientCredentials e;
    public final String f;

    public e(PassportAutoLoginMode passportAutoLoginMode, List list, Environment environment, ClientCredentials clientCredentials, String str, int i) {
        boolean z = (i & 4) != 0;
        clientCredentials = (i & 16) != 0 ? null : clientCredentials;
        str = (i & 32) != 0 ? null : str;
        this.a = passportAutoLoginMode;
        this.b = list;
        this.c = z;
        this.d = environment;
        this.e = clientCredentials;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && jl40.l(this.b, eVar.b) && this.c == eVar.c && this.d == eVar.d && jl40.l(this.e, eVar.e) && jl40.l(this.f, eVar.f);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + unr0.e(unr0.c(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
        ClientCredentials clientCredentials = this.e;
        int hashCode2 = (hashCode + (clientCredentials == null ? 0 : clientCredentials.hashCode())) * 31;
        String str = this.f;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(mode=");
        sb.append(this.a);
        sb.append(", modernAccounts=");
        sb.append(this.b);
        sb.append(", searchFresh=");
        sb.append(this.c);
        sb.append(", environment=");
        sb.append(this.d);
        sb.append(", credentials=");
        sb.append(this.e);
        sb.append(", phoneNumber=");
        return b64.p(sb, this.f, ')');
    }
}
