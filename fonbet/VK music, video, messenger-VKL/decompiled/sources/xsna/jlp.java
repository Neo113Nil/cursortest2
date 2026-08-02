package xsna;

import java.util.LinkedHashMap;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: Energy.kt */
/* loaded from: classes12.dex */
public final class jlp implements Comparable<jlp> {
    public static final a d = new a();
    public static final LinkedHashMap e;
    public final double b;
    public final b c;

    /* compiled from: Energy.kt */
    public static final class a {
        public static jlp a(double d) {
            return new jlp(d, b.KILOCALORIES);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Energy.kt */
    public static final class b {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b CALORIES;
        public static final b JOULES;
        public static final b KILOCALORIES;
        public static final b KILOJOULES;

        /* compiled from: Energy.kt */
        public static final class a extends b {
            private final double caloriesPerUnit;
            private final String title;

            public a() {
                super("CALORIES", 0);
                this.caloriesPerUnit = 1.0d;
                this.title = "cal";
            }

            @Override // xsna.jlp.b
            public final String getTitle() {
                return this.title;
            }

            @Override // xsna.jlp.b
            public final double h() {
                return this.caloriesPerUnit;
            }
        }

        /* compiled from: Energy.kt */
        /* renamed from: xsna.jlp$b$b, reason: collision with other inner class name */
        public static final class C3124b extends b {
            private final double caloriesPerUnit;
            private final String title;

            public C3124b() {
                super("JOULES", 2);
                this.caloriesPerUnit = 0.2390057361d;
                this.title = "J";
            }

            @Override // xsna.jlp.b
            public final String getTitle() {
                return this.title;
            }

            @Override // xsna.jlp.b
            public final double h() {
                return this.caloriesPerUnit;
            }
        }

        /* compiled from: Energy.kt */
        public static final class c extends b {
            private final double caloriesPerUnit;
            private final String title;

            public c() {
                super("KILOCALORIES", 1);
                this.caloriesPerUnit = 1000.0d;
                this.title = "kcal";
            }

            @Override // xsna.jlp.b
            public final String getTitle() {
                return this.title;
            }

            @Override // xsna.jlp.b
            public final double h() {
                return this.caloriesPerUnit;
            }
        }

        /* compiled from: Energy.kt */
        public static final class d extends b {
            private final double caloriesPerUnit;
            private final String title;

            public d() {
                super("KILOJOULES", 3);
                this.caloriesPerUnit = 239.0057361d;
                this.title = "kJ";
            }

            @Override // xsna.jlp.b
            public final String getTitle() {
                return this.title;
            }

            @Override // xsna.jlp.b
            public final double h() {
                return this.caloriesPerUnit;
            }
        }

        static {
            a aVar = new a();
            CALORIES = aVar;
            c cVar = new c();
            KILOCALORIES = cVar;
            C3124b c3124b = new C3124b();
            JOULES = c3124b;
            d dVar = new d();
            KILOJOULES = dVar;
            b[] bVarArr = {aVar, cVar, c3124b, dVar};
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
            linkedHashMap.put(bVar, new jlp(ConnectivityTracker.DEFAULT_UPLINK_BITRATE, bVar));
        }
        e = linkedHashMap;
    }

    public jlp(double d2, b bVar) {
        this.b = d2;
        this.c = bVar;
    }

    public final double a() {
        return this.c.h() * this.b;
    }

    public final double c() {
        b bVar = b.KILOCALORIES;
        return this.c == bVar ? this.b : a() / bVar.h();
    }

    @Override // java.lang.Comparable
    public final int compareTo(jlp jlpVar) {
        jlp jlpVar2 = jlpVar;
        return this.c == jlpVar2.c ? Double.compare(this.b, jlpVar2.b) : Double.compare(a(), jlpVar2.a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jlp)) {
            return false;
        }
        jlp jlpVar = (jlp) obj;
        return this.c == jlpVar.c ? this.b == jlpVar.b : a() == jlpVar.a();
    }

    public final int hashCode() {
        return Double.hashCode(a());
    }

    public final String toString() {
        return this.b + ' ' + this.c.getTitle();
    }
}
