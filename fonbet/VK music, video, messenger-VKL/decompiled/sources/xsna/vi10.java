package xsna;

import java.util.LinkedHashMap;
import java.util.Locale;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: Mass.kt */
/* loaded from: classes12.dex */
public final class vi10 implements Comparable<vi10> {
    public static final a d = new a();
    public static final LinkedHashMap e;
    public final double b;
    public final b c;

    /* compiled from: Mass.kt */
    public static final class a {
        public static vi10 a(double d) {
            return new vi10(d, b.GRAMS);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Mass.kt */
    public static final class b {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b GRAMS;
        public static final b KILOGRAMS;
        public static final b MICROGRAMS;
        public static final b MILLIGRAMS;
        public static final b OUNCES;
        public static final b POUNDS;

        /* compiled from: Mass.kt */
        public static final class a extends b {
            private final double gramsPerUnit;

            public a() {
                super("GRAMS", 0);
                this.gramsPerUnit = 1.0d;
            }

            @Override // xsna.vi10.b
            public final double h() {
                return this.gramsPerUnit;
            }
        }

        /* compiled from: Mass.kt */
        /* renamed from: xsna.vi10$b$b, reason: collision with other inner class name */
        public static final class C3893b extends b {
            private final double gramsPerUnit;

            public C3893b() {
                super("KILOGRAMS", 1);
                this.gramsPerUnit = 1000.0d;
            }

            @Override // xsna.vi10.b
            public final double h() {
                return this.gramsPerUnit;
            }
        }

        /* compiled from: Mass.kt */
        public static final class c extends b {
            private final double gramsPerUnit;

            public c() {
                super("MICROGRAMS", 3);
                this.gramsPerUnit = 1.0E-6d;
            }

            @Override // xsna.vi10.b
            public final double h() {
                return this.gramsPerUnit;
            }
        }

        /* compiled from: Mass.kt */
        public static final class d extends b {
            private final double gramsPerUnit;

            public d() {
                super("MILLIGRAMS", 2);
                this.gramsPerUnit = 0.001d;
            }

            @Override // xsna.vi10.b
            public final double h() {
                return this.gramsPerUnit;
            }
        }

        /* compiled from: Mass.kt */
        public static final class e extends b {
            private final double gramsPerUnit;

            public e() {
                super("OUNCES", 4);
                this.gramsPerUnit = 28.34952d;
            }

            @Override // xsna.vi10.b
            public final double h() {
                return this.gramsPerUnit;
            }
        }

        /* compiled from: Mass.kt */
        public static final class f extends b {
            private final double gramsPerUnit;

            public f() {
                super("POUNDS", 5);
                this.gramsPerUnit = 453.59237d;
            }

            @Override // xsna.vi10.b
            public final double h() {
                return this.gramsPerUnit;
            }
        }

        static {
            a aVar = new a();
            GRAMS = aVar;
            C3893b c3893b = new C3893b();
            KILOGRAMS = c3893b;
            d dVar = new d();
            MILLIGRAMS = dVar;
            c cVar = new c();
            MICROGRAMS = cVar;
            e eVar = new e();
            OUNCES = eVar;
            f fVar = new f();
            POUNDS = fVar;
            b[] bVarArr = {aVar, c3893b, dVar, cVar, eVar, fVar};
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

        public abstract double h();
    }

    static {
        b[] values = b.values();
        int e2 = on00.e(values.length);
        if (e2 < 16) {
            e2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e2);
        for (b bVar : values) {
            linkedHashMap.put(bVar, new vi10(ConnectivityTracker.DEFAULT_UPLINK_BITRATE, bVar));
        }
        e = linkedHashMap;
    }

    public vi10(double d2, b bVar) {
        this.b = d2;
        this.c = bVar;
    }

    public final double a() {
        return this.c.h() * this.b;
    }

    @Override // java.lang.Comparable
    public final int compareTo(vi10 vi10Var) {
        vi10 vi10Var2 = vi10Var;
        return this.c == vi10Var2.c ? Double.compare(this.b, vi10Var2.b) : Double.compare(a(), vi10Var2.a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vi10)) {
            return false;
        }
        vi10 vi10Var = (vi10) obj;
        return this.c == vi10Var.c ? this.b == vi10Var.b : a() == vi10Var.a();
    }

    public final int hashCode() {
        return Double.hashCode(a());
    }

    public final String toString() {
        return this.b + ' ' + this.c.name().toLowerCase(Locale.ROOT);
    }
}
