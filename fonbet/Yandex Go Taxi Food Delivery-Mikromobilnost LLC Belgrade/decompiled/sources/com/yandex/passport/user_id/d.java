package com.yandex.passport.user_id;

import defpackage.b64;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class d {
    public final p a;
    public final String b;

    public d(p pVar, String str) {
        this.a = pVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return jl40.l(this.a, dVar.a) && jl40.l(this.b, dVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserIdJsCommand(data=");
        sb.append(this.a);
        sb.append(", requestId=");
        return b64.p(sb, this.b, ')');
    }
}
