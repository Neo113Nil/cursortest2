package com.yandex.passport.internal.badges;

import defpackage.jl40;
import defpackage.unr0;
import java.util.List;

/* loaded from: classes2.dex */
public final class e {
    public final String a;
    public final List b;

    public e(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final List a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a.equals(eVar.a) && jl40.l(this.b, eVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(rawUserInfo=");
        sb.append(this.a);
        sb.append(", badges=");
        return unr0.t(sb, this.b, ')');
    }
}
