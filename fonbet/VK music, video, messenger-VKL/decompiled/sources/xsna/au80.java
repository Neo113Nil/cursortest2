package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.security.MessageDigest;
import xsna.ht80;

/* compiled from: Options.java */
/* loaded from: classes12.dex */
public final class au80 implements ady {
    public final hy8 b = new hy8();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.ady
    public final void b(@NonNull MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            hy8 hy8Var = this.b;
            if (i >= hy8Var.d) {
                return;
            }
            ht80 ht80Var = (ht80) hy8Var.f(i);
            V j = this.b.j(i);
            ht80.b<T> bVar = ht80Var.b;
            if (ht80Var.d == null) {
                ht80Var.d = ht80Var.c.getBytes(ady.a);
            }
            bVar.a(ht80Var.d, j, messageDigest);
            i++;
        }
    }

    @Nullable
    public final <T> T c(@NonNull ht80<T> ht80Var) {
        hy8 hy8Var = this.b;
        return hy8Var.containsKey(ht80Var) ? (T) hy8Var.get(ht80Var) : ht80Var.a;
    }

    @Override // xsna.ady
    public final boolean equals(Object obj) {
        if (obj instanceof au80) {
            return this.b.equals(((au80) obj).b);
        }
        return false;
    }

    @Override // xsna.ady
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.b + '}';
    }
}
