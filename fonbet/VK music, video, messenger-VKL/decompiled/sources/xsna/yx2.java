package xsna;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;

/* compiled from: ApiConfig.kt */
/* loaded from: classes11.dex */
public final class yx2 {
    public static final Set<String> g;
    public static final Set<String> h;
    public static final yx2 i;
    public final boolean a;
    public final List<String> b;
    public final Set<String> c;
    public final Set<String> d;
    public final Set<String> e;
    public final a f;

    /* compiled from: ApiConfig.kt */
    public static final class a {
        public final int a;
        public final long b;

        public a(int i, long j) {
            this.a = i;
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RequestLimits(count=");
            sb.append(this.a);
            sb.append(", time=");
            return vu5.a(')', this.b, sb);
        }
    }

    static {
        EmptyList emptyList = EmptyList.b;
        Set<String> singleton = Collections.singleton("account.getToggles");
        g = singleton;
        h = Collections.singleton("statEvents.add");
        i = new yx2(true, emptyList, singleton, singleton, EmptySet.b, new a(4, 1000L));
    }

    public yx2(boolean z, List<String> list, Set<String> set, Set<String> set2, Set<String> set3, a aVar) {
        this.a = z;
        this.b = list;
        this.c = set;
        this.d = set2;
        this.e = set3;
        this.f = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yx2)) {
            return false;
        }
        yx2 yx2Var = (yx2) obj;
        return this.a == yx2Var.a && epx.f(this.b, yx2Var.b) && epx.f(this.c, yx2Var.c) && epx.f(this.d, yx2Var.d) && epx.f(this.e, yx2Var.e) && epx.f(this.f, yx2Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + fw3.b(fw3.b(fw3.b(fw3.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        return "ApiConfig(apiMethodsPriorityBackoffEnabled=" + this.a + ", apiStartPriorityMethods=" + this.b + ", experimentExceptionsApiMethods=" + this.c + ", statExceptionsApiMethods=" + this.d + ", startUpHeavyMethods=" + this.e + ", requestLimits=" + this.f + ')';
    }
}
