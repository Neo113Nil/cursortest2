package xsna;

import java.util.LinkedHashMap;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: Velocity.kt */
/* loaded from: classes12.dex */
public final class imr0 implements Comparable<imr0> {
    public static final a d = new a();
    public static final LinkedHashMap e;
    public final double b;
    public final b c;

    /* compiled from: Velocity.kt */
    public static final class a {
        public static imr0 a(double d) {
            return new imr0(d, b.METERS_PER_SECOND);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Velocity.kt */
    public static final class b {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b KILOMETERS_PER_HOUR;
        public static final b METERS_PER_SECOND;
        public static final b MILES_PER_HOUR;

        /* compiled from: Velocity.kt */
        public static final class a extends b {
            private final double metersPerSecondPerUnit;
            private final String title;

            public a() {
                super("KILOMETERS_PER_HOUR", 1);
                this.metersPerSecondPerUnit = 0.2777777777777778d;
                this.title = "km/h";
            }

            @Override // xsna.imr0.b
            public final String getTitle() {
                return this.title;
            }

            @Override // xsna.imr0.b
            public final double h() {
                return this.metersPerSecondPerUnit;
            }
        }

        /* compiled from: Velocity.kt */
        /* renamed from: xsna.imr0$b$b, reason: collision with other inner class name */
        public static final class C3061b extends b {
            private final double metersPerSecondPerUnit;
            private final String title;

            public C3061b() {
                super("METERS_PER_SECOND", 0);
                this.metersPerSecondPerUnit = 1.0d;
                this.title = "meters/sec";
            }

            @Override // xsna.imr0.b
            public final String getTitle() {
                return this.title;
            }

            @Override // xsna.imr0.b
            public final double h() {
                return this.metersPerSecondPerUnit;
            }
        }

        /* compiled from: Velocity.kt */
        public static final class c extends b {
            private final double metersPerSecondPerUnit;
            private final String title;

            public c() {
                super("MILES_PER_HOUR", 2);
                this.metersPerSecondPerUnit = 0.447040357632d;
                this.title = "miles/h";
            }

            @Override // xsna.imr0.b
            public final String getTitle() {
                return this.title;
            }

            @Override // xsna.imr0.b
            public final double h() {
                return this.metersPerSecondPerUnit;
            }
        }

        static {
            C3061b c3061b = new C3061b();
            METERS_PER_SECOND = c3061b;
            a aVar = new a();
            KILOMETERS_PER_HOUR = aVar;
            c cVar = new c();
            MILES_PER_HOUR = cVar;
            b[] bVarArr = {c3061b, aVar, cVar};
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
            linkedHashMap.put(bVar, new imr0(ConnectivityTracker.DEFAULT_UPLINK_BITRATE, bVar));
        }
        e = linkedHashMap;
    }

    public imr0(double d2, b bVar) {
        this.b = d2;
        this.c = bVar;
    }

    public final double a() {
        return this.c.h() * this.b;
    }

    @Override // java.lang.Comparable
    public final int compareTo(imr0 imr0Var) {
        imr0 imr0Var2 = imr0Var;
        return this.c == imr0Var2.c ? Double.compare(this.b, imr0Var2.b) : Double.compare(a(), imr0Var2.a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof imr0)) {
            return false;
        }
        imr0 imr0Var = (imr0) obj;
        return this.c == imr0Var.c ? this.b == imr0Var.b : a() == imr0Var.a();
    }

    public final int hashCode() {
        return Double.hashCode(a());
    }

    public final String toString() {
        return this.b + ' ' + this.c.getTitle();
    }
}
