package com.yandex.passport.api;

import defpackage.b64;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class y2 implements b3 {
    public final String a;
    public final String b;

    public y2(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2)) {
            return false;
        }
        y2 y2Var = (y2) obj;
        return jl40.l(this.a, y2Var.a) && jl40.l(this.b, y2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FinishWithUrl(url=");
        sb.append(this.a);
        sb.append(", purpose=");
        return b64.p(sb, this.b, ')');
    }
}
