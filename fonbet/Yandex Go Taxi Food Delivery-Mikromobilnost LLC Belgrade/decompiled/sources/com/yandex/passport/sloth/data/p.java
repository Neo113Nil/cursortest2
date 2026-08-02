package com.yandex.passport.sloth.data;

import com.yandex.passport.sloth.dependencies.SlothLoginProperties;
import defpackage.jl40;
import defpackage.unr0;

/* loaded from: classes2.dex */
public final class p extends g {
    public final String a;
    public final SlothLoginProperties b;
    public final boolean c;
    public final String w;

    public p(String str, SlothLoginProperties slothLoginProperties, boolean z, String str2) {
        super(SlothMode.Login);
        this.a = str;
        this.b = slothLoginProperties;
        this.c = z;
        this.w = str2;
    }

    @Override // com.yandex.passport.sloth.data.g
    public final SlothLoginProperties c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        boolean l;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (!jl40.l(this.a, pVar.a) || !jl40.l(this.b, pVar.b) || this.c != pVar.c) {
            return false;
        }
        String str = pVar.w;
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
        String str = this.a;
        int e = unr0.e((this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31, this.c);
        String str2 = this.w;
        return e + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Login(loginHint=");
        sb.append(this.a);
        sb.append(", properties=");
        sb.append(this.b);
        sb.append(", canGoBack=");
        sb.append(this.c);
        sb.append(", customUrl=");
        String str = this.w;
        sb.append((Object) (str == null ? "null" : com.yandex.passport.common.url.b.l(str)));
        sb.append(')');
        return sb.toString();
    }
}
