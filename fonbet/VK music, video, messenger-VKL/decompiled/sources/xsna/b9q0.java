package xsna;

/* compiled from: UpdateSearchQueryRule.kt */
/* loaded from: classes5.dex */
public interface b9q0 {

    /* compiled from: UpdateSearchQueryRule.kt */
    public static final class a {
        public static final b a = new b(false);
    }

    /* compiled from: UpdateSearchQueryRule.kt */
    public static final class b implements b9q0 {
        public final boolean a;

        public b() {
            this(false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("Request(ignoreSpellchecker="), this.a, ')');
        }

        public b(boolean z) {
            this.a = z;
        }
    }

    /* compiled from: UpdateSearchQueryRule.kt */
    public static final class c implements b9q0 {
        public static final c a = new c();
    }
}
