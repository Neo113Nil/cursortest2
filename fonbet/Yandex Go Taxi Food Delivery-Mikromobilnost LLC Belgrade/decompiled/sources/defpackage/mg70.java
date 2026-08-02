package defpackage;

import java.security.MessageDigest;

/* loaded from: classes10.dex */
public final class mg70 implements khx {
    public final pd7 b = new pd7();

    @Override // defpackage.khx
    public final void a(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            pd7 pd7Var = this.b;
            if (i >= pd7Var.c) {
                return;
            }
            ce70 ce70Var = (ce70) pd7Var.f(i);
            Object j = this.b.j(i);
            yd70 yd70Var = ce70Var.b;
            if (ce70Var.d == null) {
                ce70Var.d = ce70Var.c.getBytes(khx.a);
            }
            yd70Var.b(ce70Var.d, j, messageDigest);
            i++;
        }
    }

    public final Object c(ce70 ce70Var) {
        pd7 pd7Var = this.b;
        return pd7Var.containsKey(ce70Var) ? pd7Var.get(ce70Var) : ce70Var.a;
    }

    @Override // defpackage.khx
    public final boolean equals(Object obj) {
        if (obj instanceof mg70) {
            return this.b.equals(((mg70) obj).b);
        }
        return false;
    }

    @Override // defpackage.khx
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.b + '}';
    }
}
