package xsna;

import java.util.LinkedHashMap;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: Power.kt */
/* loaded from: classes12.dex */
public final class swc0 implements Comparable<swc0> {
    public static final a d = new a();
    public static final LinkedHashMap e;
    public final double b;
    public final b c;

    /* compiled from: Power.kt */
    public static final class a {
        public static swc0 a(double d) {
            return new swc0(d, b.WATTS);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Power.kt */
    public static final class b {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b KILOCALORIES_PER_DAY;
        public static final b WATTS;

        /* compiled from: Power.kt */
        public static final class a extends b {
            private final String title;
            private final double wattsPerUnit;

            public a() {
                super("KILOCALORIES_PER_DAY", 1);
                this.wattsPerUnit = 0.0484259259d;
                this.title = "kcal/day";
            }

            @Override // xsna.swc0.b
            public final String getTitle() {
                return this.title;
            }

            @Override // xsna.swc0.b
            public final double h() {
                return this.wattsPerUnit;
            }
        }

        /* compiled from: Power.kt */
        /* renamed from: xsna.swc0$b$b, reason: collision with other inner class name */
        public static final class C3695b extends b {
            private final String title;
            private final double wattsPerUnit;

            public C3695b() {
                super("WATTS", 0);
                this.wattsPerUnit = 1.0d;
                this.title = "Watts";
            }

            @Override // xsna.swc0.b
            public final String getTitle() {
                return this.title;
            }

            @Override // xsna.swc0.b
            public final double h() {
                return this.wattsPerUnit;
            }
        }

        static {
            C3695b c3695b = new C3695b();
            WATTS = c3695b;
            a aVar = new a();
            KILOCALORIES_PER_DAY = aVar;
            b[] bVarArr = {c3695b, aVar};
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
            linkedHashMap.put(bVar, new swc0(ConnectivityTracker.DEFAULT_UPLINK_BITRATE, bVar));
        }
        e = linkedHashMap;
    }

    public swc0(double d2, b bVar) {
        this.b = d2;
        this.c = bVar;
    }

    public final double a() {
        return this.c.h() * this.b;
    }

    @Override // java.lang.Comparable
    public final int compareTo(swc0 swc0Var) {
        swc0 swc0Var2 = swc0Var;
        return this.c == swc0Var2.c ? Double.compare(this.b, swc0Var2.b) : Double.compare(a(), swc0Var2.a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof swc0)) {
            return false;
        }
        swc0 swc0Var = (swc0) obj;
        return this.c == swc0Var.c ? this.b == swc0Var.b : a() == swc0Var.a();
    }

    public final int hashCode() {
        return Double.hashCode(a());
    }

    public final String toString() {
        return this.b + ' ' + this.c.getTitle();
    }
}
