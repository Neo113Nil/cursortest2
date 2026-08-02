package xsna;

import java.util.LinkedHashMap;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: BloodGlucose.kt */
/* loaded from: classes12.dex */
public final class eg7 implements Comparable<eg7> {
    public static final LinkedHashMap d;
    public final double b;
    public final a c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BloodGlucose.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a MILLIGRAMS_PER_DECILITER;
        public static final a MILLIMOLES_PER_LITER;

        /* compiled from: BloodGlucose.kt */
        /* renamed from: xsna.eg7$a$a, reason: collision with other inner class name */
        public static final class C2807a extends a {
            private final double millimolesPerLiterPerUnit;
            private final String title;

            public C2807a() {
                super("MILLIGRAMS_PER_DECILITER", 1);
                this.millimolesPerLiterPerUnit = 0.05555555555555555d;
                this.title = "mg/dL";
            }

            @Override // xsna.eg7.a
            public final String getTitle() {
                return this.title;
            }

            @Override // xsna.eg7.a
            public final double h() {
                return this.millimolesPerLiterPerUnit;
            }
        }

        /* compiled from: BloodGlucose.kt */
        public static final class b extends a {
            private final double millimolesPerLiterPerUnit;

            public b() {
                super("MILLIMOLES_PER_LITER", 0);
                this.millimolesPerLiterPerUnit = 1.0d;
            }

            @Override // xsna.eg7.a
            public final String getTitle() {
                return "mmol/L";
            }

            @Override // xsna.eg7.a
            public final double h() {
                return this.millimolesPerLiterPerUnit;
            }
        }

        static {
            b bVar = new b();
            MILLIMOLES_PER_LITER = bVar;
            C2807a c2807a = new C2807a();
            MILLIGRAMS_PER_DECILITER = c2807a;
            a[] aVarArr = {bVar, c2807a};
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

        public abstract double h();
    }

    static {
        a[] values = a.values();
        int e = on00.e(values.length);
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (a aVar : values) {
            linkedHashMap.put(aVar, new eg7(ConnectivityTracker.DEFAULT_UPLINK_BITRATE, aVar));
        }
        d = linkedHashMap;
    }

    public eg7(double d2, a aVar) {
        this.b = d2;
        this.c = aVar;
    }

    public final double a() {
        return this.c.h() * this.b;
    }

    @Override // java.lang.Comparable
    public final int compareTo(eg7 eg7Var) {
        eg7 eg7Var2 = eg7Var;
        return this.c == eg7Var2.c ? Double.compare(this.b, eg7Var2.b) : Double.compare(a(), eg7Var2.a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eg7)) {
            return false;
        }
        eg7 eg7Var = (eg7) obj;
        return this.c == eg7Var.c ? this.b == eg7Var.b : a() == eg7Var.a();
    }

    public final int hashCode() {
        return Double.hashCode(a());
    }

    public final String toString() {
        return this.b + ' ' + this.c.getTitle();
    }
}
