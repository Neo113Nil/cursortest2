package com.yandex.passport.sloth.ui;

/* loaded from: classes2.dex */
public final class w0 implements z0 {
    public final int a;
    public final String b;

    public w0(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return this.a == w0Var.a && this.b.equals(w0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Error(code=" + this.a + ", url=" + ((Object) com.yandex.passport.common.url.b.l(this.b)) + ')';
    }
}
