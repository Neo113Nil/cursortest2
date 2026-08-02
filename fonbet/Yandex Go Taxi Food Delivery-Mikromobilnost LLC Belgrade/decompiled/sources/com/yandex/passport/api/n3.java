package com.yandex.passport.api;

import defpackage.oyr;

/* loaded from: classes2.dex */
public final class n3 {
    public final int a;
    public final int b;

    public n3(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3)) {
            return false;
        }
        n3 n3Var = (n3) obj;
        return this.a == n3Var.a && this.b == n3Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Size(width=");
        sb.append(this.a);
        sb.append(", height=");
        return oyr.s(sb, this.b, ')');
    }
}
