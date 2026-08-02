package xsna;

import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: ThreadCountReporterConfig.kt */
/* loaded from: classes11.dex */
public final class pqo0 {
    public static final a b = new a();
    public static final EmptyList c = EmptyList.b;
    public static final pqo0 d = new pqo0(0);
    public final List<String> a;

    /* compiled from: ThreadCountReporterConfig.kt */
    public static final class a {
    }

    public pqo0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pqo0) && epx.f(this.a, ((pqo0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("ThreadCountReporterConfig(interestingThreadPools="), this.a);
    }

    public pqo0(List<String> list) {
        this.a = list;
    }

    public /* synthetic */ pqo0(int i) {
        this(c);
    }
}
