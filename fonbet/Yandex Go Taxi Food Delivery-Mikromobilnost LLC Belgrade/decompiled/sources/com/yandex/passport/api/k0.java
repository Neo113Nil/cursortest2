package com.yandex.passport.api;

import defpackage.b64;

/* loaded from: classes15.dex */
public final class k0 implements m0 {
    public final String a;
    public final String b;

    public k0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return this.a.equals(k0Var.a) && this.b.equals(k0Var.b);
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
