package xsna;

import java.util.List;

/* compiled from: ClipCtaWithDonutMviState.kt */
/* loaded from: classes16.dex */
public interface g0o {

    /* compiled from: ClipCtaWithDonutMviState.kt */
    public static final class a implements g0o {
        public final List a;

        public a(List list) {
            this.a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return jr.a(')', new StringBuilder("Loaded(levels="), this.a);
        }
    }

    /* compiled from: ClipCtaWithDonutMviState.kt */
    public static final class b implements g0o {
        public static final b a = new b();
    }

    /* compiled from: ClipCtaWithDonutMviState.kt */
    public static final class c implements g0o {
        public static final c a = new c();
    }
}
