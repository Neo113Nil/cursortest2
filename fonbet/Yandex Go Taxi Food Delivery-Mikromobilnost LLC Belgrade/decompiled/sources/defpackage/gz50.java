package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class gz50 {
    public final Uri a;
    public final xu50 b;
    public final fz50 c;
    public final rq50 d;
    public final Object e;

    public gz50(Uri uri, xu50 xu50Var, fz50 fz50Var, rq50 rq50Var, Object obj) {
        this.a = uri;
        this.b = xu50Var;
        this.c = fz50Var;
        this.d = rq50Var;
        this.e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gz50) {
            gz50 gz50Var = (gz50) obj;
            if (this.a.equals(gz50Var.a) && this.b == gz50Var.b && this.c.equals(gz50Var.c) && this.d.equals(gz50Var.d) && jl40.l(this.e, gz50Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c.a), 31, this.d.a);
        Object obj = this.e;
        return b + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return vuu0.c("\n            Request uri: " + this.a + "\n            Method: " + this.c + "\n            \n            Headers:\n            " + this.b + "\n        ");
    }
}
