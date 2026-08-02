package xsna;

/* compiled from: InteractiveVideoFactory.kt */
/* loaded from: classes3.dex */
public abstract class tcx {

    /* compiled from: InteractiveVideoFactory.kt */
    public static final class b extends tcx {
        public final boolean a;
        public final boolean b;

        public b() {
            this(3);
        }

        public b(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public /* synthetic */ b(int i) {
            this(false, (i & 2) != 0);
        }
    }

    /* compiled from: InteractiveVideoFactory.kt */
    public static final class c extends tcx {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 734673193;
        }

        public final String toString() {
            return "Minimizable";
        }
    }

    /* compiled from: InteractiveVideoFactory.kt */
    public static final class a extends tcx {
        public final boolean a;
        public final boolean b;
        public final boolean c;

        public a(boolean z, boolean z2, boolean z3) {
            this.a = z;
            this.b = z2;
            this.c = z3;
        }

        public a() {
            this(false, false, false);
        }
    }
}
