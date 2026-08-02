package xsna;

import java.util.Collection;
import java.util.Set;

/* compiled from: AddToCallState.kt */
/* loaded from: classes7.dex */
public abstract class bo0 {

    /* compiled from: AddToCallState.kt */
    public static final class a extends bo0 {
        public static final a a = new a();
    }

    /* compiled from: AddToCallState.kt */
    public static final class b extends bo0 {
        public static final b a = new b();
    }

    /* compiled from: AddToCallState.kt */
    public static final class c extends bo0 {
        public final Collection<whr0> a;
        public final Set<zn0> b;

        public c(Set set, Collection collection) {
            this.a = collection;
            this.b = set;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Result(added=");
            sb.append(this.a);
            sb.append(", failed=");
            return ur.c(sb, this.b, ')');
        }
    }
}
