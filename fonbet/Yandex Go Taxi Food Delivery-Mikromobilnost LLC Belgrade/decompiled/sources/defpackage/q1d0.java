package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes8.dex */
public final class q1d0 {
    public static final p1d0 Companion = new p1d0();
    public static final i3y[] f;
    public final String a;
    public final String b;
    public final List c;
    public final Set d;
    public final long e;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new i3y[]{null, null, a.b(lazyThreadSafetyMode, new mlc0(3)), a.b(lazyThreadSafetyMode, new mlc0(4)), null};
    }

    public /* synthetic */ q1d0(int i, String str, String str2, List list, Set set, e3n e3nVar) {
        if (16 != (i & 16)) {
            qje.Z(i, 16, o1d0.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = set;
        }
        this.e = e3nVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1d0)) {
            return false;
        }
        q1d0 q1d0Var = (q1d0) obj;
        return jl40.l(this.a, q1d0Var.a) && jl40.l(this.b, q1d0Var.b) && jl40.l(this.c, q1d0Var.c) && jl40.l(this.d, q1d0Var.d) && e3n.d(this.e, q1d0Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.c;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Set set = this.d;
        int hashCode4 = (hashCode3 + (set != null ? set.hashCode() : 0)) * 31;
        o430 o430Var = e3n.b;
        return Long.hashCode(this.e) + hashCode4;
    }

    public final String toString() {
        return "PlusCachedExperiments(testIdsWithBucketNumber=" + this.a + ", triggeredTestIdsWithBucketNumber=" + this.b + ", testIds=" + this.c + ", flags=" + this.d + ", createdAt=" + ((Object) e3n.p(this.e)) + ')';
    }

    public q1d0(String str, String str2, List list, Set set, long j) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = set;
        this.e = j;
    }
}
