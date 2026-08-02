package xsna;

import kotlin.NoWhenBranchMatchedException;

/* compiled from: TemperatureDelta.kt */
/* loaded from: classes12.dex */
public final class d8o0 implements Comparable<d8o0> {
    public static final a d = new a();
    public final double b;
    public final b c;

    /* compiled from: TemperatureDelta.kt */
    public static final class a {
        public static d8o0 a(double d) {
            return new d8o0(d, b.CELSIUS);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TemperatureDelta.kt */
    public static final class b {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b CELSIUS;
        public static final b FAHRENHEIT;

        /* compiled from: TemperatureDelta.kt */
        public static final class a extends b {
            private final String title;

            public a() {
                super("CELSIUS", 0);
                this.title = "Celsius";
            }

            @Override // xsna.d8o0.b
            public final String getTitle() {
                return this.title;
            }
        }

        /* compiled from: TemperatureDelta.kt */
        /* renamed from: xsna.d8o0$b$b, reason: collision with other inner class name */
        public static final class C2714b extends b {
            private final String title;

            public C2714b() {
                super("FAHRENHEIT", 1);
                this.title = "Fahrenheit";
            }

            @Override // xsna.d8o0.b
            public final String getTitle() {
                return this.title;
            }
        }

        static {
            a aVar = new a();
            CELSIUS = aVar;
            C2714b c2714b = new C2714b();
            FAHRENHEIT = c2714b;
            b[] bVarArr = {aVar, c2714b};
            $VALUES = bVarArr;
            $ENTRIES = new asp(bVarArr);
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        public abstract String getTitle();
    }

    /* compiled from: TemperatureDelta.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.CELSIUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.FAHRENHEIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public d8o0(double d2, b bVar) {
        this.b = d2;
        this.c = bVar;
    }

    public final double a() {
        int i = c.$EnumSwitchMapping$0[this.c.ordinal()];
        double d2 = this.b;
        if (i == 1) {
            return d2;
        }
        if (i == 2) {
            return d2 / 1.8d;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // java.lang.Comparable
    public final int compareTo(d8o0 d8o0Var) {
        d8o0 d8o0Var2 = d8o0Var;
        return this.c == d8o0Var2.c ? Double.compare(this.b, d8o0Var2.b) : Double.compare(a(), d8o0Var2.a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d8o0)) {
            return false;
        }
        d8o0 d8o0Var = (d8o0) obj;
        return this.c == d8o0Var.c ? this.b == d8o0Var.b : a() == d8o0Var.a();
    }

    public final int hashCode() {
        return Double.hashCode(a());
    }

    public final String toString() {
        return this.b + ' ' + this.c.getTitle();
    }
}
