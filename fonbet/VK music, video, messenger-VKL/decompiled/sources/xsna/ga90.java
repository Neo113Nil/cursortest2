package xsna;

/* compiled from: PageVisibilityProvider.kt */
/* loaded from: classes7.dex */
public interface ga90 {

    /* compiled from: PageVisibilityProvider.kt */
    public static abstract class a {

        /* compiled from: PageVisibilityProvider.kt */
        /* renamed from: xsna.ga90$a$a, reason: collision with other inner class name */
        public static final class C2929a extends a {
            public final int a;

            public C2929a(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2929a) && this.a == ((C2929a) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("Page(position="), this.a, ')');
            }
        }

        /* compiled from: PageVisibilityProvider.kt */
        public static final class b extends a {
            public static final b a = new b();
        }
    }

    io.reactivex.rxjava3.core.q<a> a();
}
