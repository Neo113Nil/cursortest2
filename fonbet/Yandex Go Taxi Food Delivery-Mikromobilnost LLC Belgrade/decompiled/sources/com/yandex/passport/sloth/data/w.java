package com.yandex.passport.sloth.data;

import com.yandex.passport.sloth.dependencies.SlothLoginProperties;
import defpackage.jl40;
import defpackage.unr0;

/* loaded from: classes2.dex */
public final class w extends g {
    public final SlothLoginProperties a;
    public final boolean b;
    public final AccountForProfile c;
    public final String w;

    public w(SlothLoginProperties slothLoginProperties, boolean z, AccountForProfile accountForProfile, String str) {
        super(SlothMode.Registration);
        this.a = slothLoginProperties;
        this.b = z;
        this.c = accountForProfile;
        this.w = str;
    }

    @Override // com.yandex.passport.sloth.data.g
    public final SlothLoginProperties c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        boolean l;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (!jl40.l(this.a, wVar.a) || this.b != wVar.b || !jl40.l(this.c, wVar.c)) {
            return false;
        }
        String str = wVar.w;
        String str2 = this.w;
        if (str2 == null) {
            if (str == null) {
                l = true;
            }
            l = false;
        } else {
            if (str != null) {
                l = jl40.l(str2, str);
            }
            l = false;
        }
        return l;
    }

    public final int hashCode() {
        int e = unr0.e(this.a.hashCode() * 31, 31, this.b);
        AccountForProfile accountForProfile = this.c;
        int hashCode = (e + (accountForProfile == null ? 0 : accountForProfile.hashCode())) * 31;
        String str = this.w;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Registration(properties=");
        sb.append(this.a);
        sb.append(", canGoBack=");
        sb.append(this.b);
        sb.append(", accountForProfile=");
        sb.append(this.c);
        sb.append(", customUrl=");
        String str = this.w;
        sb.append((Object) (str == null ? "null" : com.yandex.passport.common.url.b.l(str)));
        sb.append(')');
        return sb.toString();
    }
}
