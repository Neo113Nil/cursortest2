package xsna;

import java.util.LinkedHashMap;
import java.util.Locale;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: Length.kt */
/* loaded from: classes12.dex */
public final class c2z implements Comparable<c2z> {
    public static final a d = new a();
    public static final LinkedHashMap e;
    public final double b;
    public final b c;

    /* compiled from: Length.kt */
    public static final class a {
        public static c2z a(double d) {
            return new c2z(d, b.METERS);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Length.kt */
    public static final class b {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b FEET;
        public static final b INCHES;
        public static final b KILOMETERS;
        public static final b METERS;
        public static final b MILES;

        /* compiled from: Length.kt */
        public static final class a extends b {
            private final double metersPerUnit;

            public a() {
                super("FEET", 4);
                this.metersPerUnit = 0.3048d;
            }

            @Override // xsna.c2z.b
            public final double h() {
                return this.metersPerUnit;
            }
        }

        /* compiled from: Length.kt */
        /* renamed from: xsna.c2z$b$b, reason: collision with other inner class name */
        public static final class C2637b extends b {
            private final double metersPerUnit;

            public C2637b() {
                super("INCHES", 3);
                this.metersPerUnit = 0.0254d;
            }

            @Override // xsna.c2z.b
            public final double h() {
                return this.metersPerUnit;
            }
        }

        /* compiled from: Length.kt */
        public static final class c extends b {
            private final double metersPerUnit;

            public c() {
                super("KILOMETERS", 1);
                this.metersPerUnit = 1000.0d;
            }

            @Override // xsna.c2z.b
            public final double h() {
                return this.metersPerUnit;
            }
        }

        /* compiled from: Length.kt */
        public static final class d extends b {
            private final double metersPerUnit;

            public d() {
                super("METERS", 0);
                this.metersPerUnit = 1.0d;
            }

            @Override // xsna.c2z.b
            public final double h() {
                return this.metersPerUnit;
            }
        }

        /* compiled from: Length.kt */
        public static final class e extends b {
            private final double metersPerUnit;

            public e() {
                super("MILES", 2);
                this.metersPerUnit = 1609.34d;
            }

            @Override // xsna.c2z.b
            public final double h() {
                return this.metersPerUnit;
            }
        }

        static {
            d dVar = new d();
            METERS = dVar;
            c cVar = new c();
            KILOMETERS = cVar;
            e eVar = new e();
            MILES = eVar;
            C2637b c2637b = new C2637b();
            INCHES = c2637b;
            a aVar = new a();
            FEET = aVar;
            b[] bVarArr = {dVar, cVar, eVar, c2637b, aVar};
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
            linkedHashMap.put(bVar, new c2z(ConnectivityTracker.DEFAULT_UPLINK_BITRATE, bVar));
        }
        e = linkedHashMap;
    }

    public c2z(double d2, b bVar) {
        this.b = d2;
        this.c = bVar;
    }

    public final double a() {
        return this.c.h() * this.b;
    }

    @Override // java.lang.Comparable
    public final int compareTo(c2z c2zVar) {
        c2z c2zVar2 = c2zVar;
        return this.c == c2zVar2.c ? Double.compare(this.b, c2zVar2.b) : Double.compare(a(), c2zVar2.a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2z)) {
            return false;
        }
        c2z c2zVar = (c2z) obj;
        return this.c == c2zVar.c ? this.b == c2zVar.b : a() == c2zVar.a();
    }

    public final int hashCode() {
        return Double.hashCode(a());
    }

    public final String toString() {
        return this.b + ' ' + this.c.name().toLowerCase(Locale.ROOT);
    }
}
