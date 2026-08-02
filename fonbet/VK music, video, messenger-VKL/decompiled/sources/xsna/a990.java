package xsna;

/* compiled from: PageContent.kt */
/* loaded from: classes7.dex */
public final class a990<T> {
    public final T a;
    public final boolean b;
    public final a c;
    public final b d;

    /* compiled from: PageContent.kt */
    public static abstract class a {

        /* compiled from: PageContent.kt */
        /* renamed from: xsna.a990$a$a, reason: collision with other inner class name */
        public static final class C2530a extends a {
            public final Throwable a;

            public C2530a(Throwable th) {
                this.a = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2530a) && epx.f(this.a, ((C2530a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("Error(throwable="), this.a, ')');
            }
        }

        /* compiled from: PageContent.kt */
        public static final class b extends a {
            public static final b a = new b();
        }

        /* compiled from: PageContent.kt */
        public static final class c extends a {
            public static final c a = new c();
        }
    }

    /* compiled from: PageContent.kt */
    public static abstract class b {

        /* compiled from: PageContent.kt */
        public static final class a extends b {
            public static final a a = new a();
        }

        /* compiled from: PageContent.kt */
        /* renamed from: xsna.a990$b$b, reason: collision with other inner class name */
        public static final class C2531b extends b {
            public static final C2531b a = new C2531b();
        }
    }

    public a990(T t, boolean z, a aVar, b bVar) {
        this.a = t;
        this.b = z;
        this.c = aVar;
        this.d = bVar;
    }

    public static a990 a(a990 a990Var, Object obj, boolean z, a aVar, b bVar, int i) {
        if ((i & 1) != 0) {
            obj = a990Var.a;
        }
        if ((i & 2) != 0) {
            z = a990Var.b;
        }
        if ((i & 4) != 0) {
            aVar = a990Var.c;
        }
        if ((i & 8) != 0) {
            bVar = a990Var.d;
        }
        a990Var.getClass();
        return new a990(obj, z, aVar, bVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a990)) {
            return false;
        }
        a990 a990Var = (a990) obj;
        return epx.f(this.a, a990Var.a) && this.b == a990Var.b && epx.f(this.c, a990Var.c) && epx.f(this.d, a990Var.d);
    }

    public final int hashCode() {
        T t = this.a;
        return this.d.hashCode() + ((this.c.hashCode() + qoy.b((t == null ? 0 : t.hashCode()) * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "PageContent(pagingNextFrom=" + this.a + ", pagingHasMore=" + this.b + ", pagingState=" + this.c + ", reloadState=" + this.d + ')';
    }
}
