package com.yandex.passport.sloth;

import defpackage.b64;
import defpackage.j73;
import defpackage.jl40;
import java.util.Set;

/* loaded from: classes2.dex */
public final class k {
    public static final Set b = j73.f0(new String[]{"2fa.ya_team_wrong_way", "register_webauthn_error"});
    public final String a;

    public k(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && jl40.l(this.a, ((k) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("SlothError(value="), this.a, ')');
    }
}
