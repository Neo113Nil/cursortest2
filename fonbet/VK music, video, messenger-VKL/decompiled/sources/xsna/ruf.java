package xsna;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.EmptySet;

/* compiled from: ClipsWrapperUploadState.kt */
/* loaded from: classes17.dex */
public interface ruf {

    /* compiled from: ClipsWrapperUploadState.kt */
    public static final class a implements ruf {
        public final ceq0 a;
        public final Set<Integer> b;

        public a(ceq0 ceq0Var, Set<Integer> set) {
            this.a = ceq0Var;
            this.b = set;
        }

        @Override // xsna.ruf
        public final Set<Integer> a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Canceled(event=");
            sb.append(this.a);
            sb.append(", doneIds=");
            return ur.c(sb, this.b, ')');
        }
    }

    /* compiled from: ClipsWrapperUploadState.kt */
    public static final class b implements ruf {
        public static final b a = new b();
        public static final EmptySet b = EmptySet.b;

        @Override // xsna.ruf
        public final Set<Integer> a() {
            return b;
        }
    }

    /* compiled from: ClipsWrapperUploadState.kt */
    public static final class c implements ruf {
        public static final c a = new c();
        public static final EmptySet b = EmptySet.b;

        @Override // xsna.ruf
        public final Set<Integer> a() {
            return b;
        }
    }

    /* compiled from: ClipsWrapperUploadState.kt */
    public static final class d implements ruf {
        public final ceq0 a;
        public final LinkedHashSet b;

        public d(ceq0 ceq0Var, LinkedHashSet linkedHashSet) {
            this.a = ceq0Var;
            this.b = linkedHashSet;
        }

        @Override // xsna.ruf
        public final Set<Integer> a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a.equals(dVar.a) && this.b.equals(dVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Finished(event=" + this.a + ", doneIds=" + this.b + ')';
        }
    }

    /* compiled from: ClipsWrapperUploadState.kt */
    public static final class e implements ruf {
        public final ceq0 a;
        public final Set<Integer> b;

        public e(ceq0 ceq0Var, Set<Integer> set) {
            this.a = ceq0Var;
            this.b = set;
        }

        @Override // xsna.ruf
        public final Set<Integer> a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InProgress(event=");
            sb.append(this.a);
            sb.append(", doneIds=");
            return ur.c(sb, this.b, ')');
        }
    }

    /* compiled from: ClipsWrapperUploadState.kt */
    public static final class f implements ruf {
        public final Set<Integer> a;

        public f(Set<Integer> set) {
            this.a = set;
        }

        @Override // xsna.ruf
        public final Set<Integer> a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.a, ((f) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ur.c(new StringBuilder("None(doneIds="), this.a, ')');
        }
    }

    Set<Integer> a();
}
