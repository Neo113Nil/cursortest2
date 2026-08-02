package xsna;

/* compiled from: TaggedItemsPageState.kt */
/* loaded from: classes18.dex */
public final class g1o0 {
    public final int a;
    public final int b;
    public final a c;
    public final b d;

    /* compiled from: TaggedItemsPageState.kt */
    public static abstract class a {

        /* compiled from: TaggedItemsPageState.kt */
        /* renamed from: xsna.g1o0$a$a, reason: collision with other inner class name */
        public static final class C2910a extends a {
        }

        /* compiled from: TaggedItemsPageState.kt */
        public static final class b extends a {
            public static final b a = new b();
        }

        /* compiled from: TaggedItemsPageState.kt */
        public static final class c extends a {
            public static final c a = new c();
        }
    }

    /* compiled from: TaggedItemsPageState.kt */
    public static abstract class b {

        /* compiled from: TaggedItemsPageState.kt */
        public static final class a extends b {
            public static final a a = new a();
        }
    }

    public g1o0() {
        this(0);
    }

    public static g1o0 a(g1o0 g1o0Var, int i, int i2, a aVar, int i3) {
        if ((i3 & 1) != 0) {
            i = g1o0Var.a;
        }
        if ((i3 & 2) != 0) {
            i2 = g1o0Var.b;
        }
        if ((i3 & 4) != 0) {
            aVar = g1o0Var.c;
        }
        b bVar = g1o0Var.d;
        g1o0Var.getClass();
        return new g1o0(i, i2, aVar, bVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1o0)) {
            return false;
        }
        g1o0 g1o0Var = (g1o0) obj;
        return this.a == g1o0Var.a && this.b == g1o0Var.b && epx.f(this.c, g1o0Var.c) && epx.f(this.d, g1o0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + shy.a(this.b, Integer.hashCode(this.a) * 31, 31)) * 31);
    }

    public final String toString() {
        return "TaggedItemsPageState(offset=" + this.a + ", total=" + this.b + ", pagingState=" + this.c + ", reloadState=" + this.d + ')';
    }

    public g1o0(int i, int i2, a aVar, b bVar) {
        this.a = i;
        this.b = i2;
        this.c = aVar;
        this.d = bVar;
    }

    public /* synthetic */ g1o0(int i) {
        this(0, 0, a.b.a, b.a.a);
    }
}
