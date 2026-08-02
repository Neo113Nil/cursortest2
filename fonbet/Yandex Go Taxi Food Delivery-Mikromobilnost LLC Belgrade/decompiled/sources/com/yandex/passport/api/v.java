package com.yandex.passport.api;

import defpackage.b64;
import defpackage.jl40;

/* loaded from: classes15.dex */
public final class v implements w {
    public final String a;
    public final String b;

    public v(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return jl40.l(this.a, vVar.a) && jl40.l(this.b, vVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenUrl(url=");
        sb.append(this.a);
        sb.append(", purpose=");
        return b64.p(sb, this.b, ')');
    }
}
