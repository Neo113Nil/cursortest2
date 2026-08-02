package defpackage;

import android.content.Context;

/* loaded from: classes10.dex */
public final class i92 {
    public final Context a;
    public final fwi b;
    public final long c;
    public final j690 d;

    public i92(Context context, fwi fwiVar, long j, j690 j690Var) {
        this.a = context;
        this.b = fwiVar;
        this.c = j;
        this.d = j690Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!i92.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        i92 i92Var = (i92) obj;
        return jl40.l(this.a, i92Var.a) && jl40.l(this.b, i92Var.b) && ldc.c(this.c, i92Var.c) && jl40.l(this.d, i92Var.d);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        int i = ldc.n;
        return this.d.hashCode() + qv10.c(hashCode, 31, this.c);
    }
}
