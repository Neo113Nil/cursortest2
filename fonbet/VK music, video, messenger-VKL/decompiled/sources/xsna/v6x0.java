package xsna;

import java.util.LinkedHashMap;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: Volume.kt */
/* loaded from: classes12.dex */
public final class v6x0 implements Comparable<v6x0> {
    public static final a d = new a();
    public static final LinkedHashMap e;
    public final double b;
    public final b c;

    /* compiled from: Volume.kt */
    public static final class a {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Volume.kt */
    public static final class b {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b FLUID_OUNCES_US;
        public static final b LITERS;
        public static final b MILLILITERS;

        /* compiled from: Volume.kt */
        public static final class a extends b {
            private final double litersPerUnit;
            private final String title;

            public a() {
                super("FLUID_OUNCES_US", 2);
                this.litersPerUnit = 0.02957353d;
                this.title = "fl. oz (US)";
            }

            @Override // xsna.v6x0.b
            public final String getTitle() {
                return this.title;
            }

            @Override // xsna.v6x0.b
            public final double h() {
                return this.litersPerUnit;
            }
        }

        /* compiled from: Volume.kt */
        /* renamed from: xsna.v6x0$b$b, reason: collision with other inner class name */
        public static final class C3872b extends b {
            private final double litersPerUnit;
            private final String title;

            public C3872b() {
                super("LITERS", 0);
                this.litersPerUnit = 1.0d;
                this.title = "L";
            }

            @Override // xsna.v6x0.b
            public final String getTitle() {
                return this.title;
            }

            @Override // xsna.v6x0.b
            public final double h() {
                return this.litersPerUnit;
            }
        }

        /* compiled from: Volume.kt */
        public static final class c extends b {
            private final double litersPerUnit;
            private final String title;

            public c() {
                super("MILLILITERS", 1);
                this.litersPerUnit = 0.001d;
                this.title = "mL";
            }

            @Override // xsna.v6x0.b
            public final String getTitle() {
                return this.title;
            }

            @Override // xsna.v6x0.b
            public final double h() {
                return this.litersPerUnit;
            }
        }

        static {
            C3872b c3872b = new C3872b();
            LITERS = c3872b;
            c cVar = new c();
            MILLILITERS = cVar;
            a aVar = new a();
            FLUID_OUNCES_US = aVar;
            b[] bVarArr = {c3872b, cVar, aVar};
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
            linkedHashMap.put(bVar, new v6x0(ConnectivityTracker.DEFAULT_UPLINK_BITRATE, bVar));
        }
        e = linkedHashMap;
    }

    public v6x0(double d2, b bVar) {
        this.b = d2;
        this.c = bVar;
    }

    public final double a() {
        return this.c.h() * this.b;
    }

    @Override // java.lang.Comparable
    public final int compareTo(v6x0 v6x0Var) {
        v6x0 v6x0Var2 = v6x0Var;
        return this.c == v6x0Var2.c ? Double.compare(this.b, v6x0Var2.b) : Double.compare(a(), v6x0Var2.a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v6x0)) {
            return false;
        }
        v6x0 v6x0Var = (v6x0) obj;
        return this.c == v6x0Var.c ? this.b == v6x0Var.b : a() == v6x0Var.a();
    }

    public final int hashCode() {
        return Double.hashCode(a());
    }

    public final String toString() {
        return this.b + ' ' + this.c.getTitle();
    }
}
