package xsna;

import kotlin.NoWhenBranchMatchedException;

/* compiled from: Temperature.kt */
/* loaded from: classes12.dex */
public final class c8o0 implements Comparable<c8o0> {
    public final double b;
    public final a c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Temperature.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a CELSIUS;
        public static final a FAHRENHEIT;

        /* compiled from: Temperature.kt */
        /* renamed from: xsna.c8o0$a$a, reason: collision with other inner class name */
        public static final class C2649a extends a {
            private final String title;

            public C2649a() {
                super("CELSIUS", 0);
                this.title = "Celsius";
            }

            @Override // xsna.c8o0.a
            public final String getTitle() {
                return this.title;
            }
        }

        /* compiled from: Temperature.kt */
        public static final class b extends a {
            private final String title;

            public b() {
                super("FAHRENHEIT", 1);
                this.title = "Fahrenheit";
            }

            @Override // xsna.c8o0.a
            public final String getTitle() {
                return this.title;
            }
        }

        static {
            C2649a c2649a = new C2649a();
            CELSIUS = c2649a;
            b bVar = new b();
            FAHRENHEIT = bVar;
            a[] aVarArr = {c2649a, bVar};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public abstract String getTitle();
    }

    /* compiled from: Temperature.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.CELSIUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.FAHRENHEIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public c8o0(double d, a aVar) {
        this.b = d;
        this.c = aVar;
    }

    public final double a() {
        int i = b.$EnumSwitchMapping$0[this.c.ordinal()];
        double d = this.b;
        if (i == 1) {
            return d;
        }
        if (i == 2) {
            return (d - 32.0d) / 1.8d;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // java.lang.Comparable
    public final int compareTo(c8o0 c8o0Var) {
        c8o0 c8o0Var2 = c8o0Var;
        return this.c == c8o0Var2.c ? Double.compare(this.b, c8o0Var2.b) : Double.compare(a(), c8o0Var2.a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c8o0)) {
            return false;
        }
        c8o0 c8o0Var = (c8o0) obj;
        return this.c == c8o0Var.c ? this.b == c8o0Var.b : a() == c8o0Var.a();
    }

    public final int hashCode() {
        return Double.hashCode(a());
    }

    public final String toString() {
        return this.b + ' ' + this.c.getTitle();
    }
}
