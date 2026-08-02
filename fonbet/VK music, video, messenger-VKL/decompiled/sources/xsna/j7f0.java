package xsna;

import java.util.Set;
import kotlin.collections.EmptySet;
import xsna.zef0;

/* compiled from: ReadRecordsRequest.kt */
/* loaded from: classes12.dex */
public final class j7f0<T extends zef0> {
    public final dcy<T> a;
    public final dvo0 b;
    public final Set<luk> c;
    public final boolean d;
    public final int e;
    public final String f;

    public j7f0() {
        throw null;
    }

    public j7f0(rfc rfcVar, dvo0 dvo0Var, Set set, int i) {
        this(rfcVar, dvo0Var, (i & 4) != 0 ? EmptySet.b : set, true, 1000, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!j7f0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        j7f0 j7f0Var = (j7f0) obj;
        return epx.f(this.a, j7f0Var.a) && epx.f(this.b, j7f0Var.b) && epx.f(this.c, j7f0Var.c) && this.d == j7f0Var.d && this.e == j7f0Var.e && epx.f(this.f, j7f0Var.f);
    }

    public final int hashCode() {
        int b = (qoy.b(fw3.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d) + this.e) * 31;
        String str = this.f;
        return Integer.hashCode(0) + ((b + (str != null ? str.hashCode() : 0)) * 31);
    }

    public j7f0(dcy dcyVar, dvo0 dvo0Var, Set set, boolean z, int i, String str) {
        this.a = dcyVar;
        this.b = dvo0Var;
        this.c = set;
        this.d = z;
        this.e = i;
        this.f = str;
        if (i <= 0) {
            throw new IllegalArgumentException("pageSize must be positive.");
        }
    }
}
