package xsna;

import com.vk.toggle.b;
import org.json.JSONObject;

/* compiled from: AppTracerConfig.kt */
/* loaded from: classes6.dex */
public final class la3 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final b e;

    /* compiled from: AppTracerConfig.kt */
    public static final class a {
        public static la3 a(b.d dVar, boolean z) {
            String obj;
            if (dVar == null || (obj = dVar.c.toString()) == null || obj.length() <= 0) {
                return new la3(z, b.i, 23);
            }
            boolean z2 = dVar.a;
            JSONObject g = dVar.g();
            return new la3(false, new b(z2, g != null ? g.optInt("maxSpansCountToUpload", 512) : 512, g != null ? g.optBoolean("uploadOnlyCompleteTraces", true) : true, g != null ? g.optBoolean("installAsGlobalTracer", true) : true, g != null ? g.optInt("maxEventsPerSpan", 2048) : 2048, g != null ? g.optInt("maxAttributesPerEvent", 128) : 128, g != null ? g.optInt("maxAttributesPerSpan", 128) : 128, g != null ? g.optDouble("samplerRatio", 0.01d) : 0.01d), 31);
        }
    }

    /* compiled from: AppTracerConfig.kt */
    public static final class b {
        public static final b i = new b(0);
        public final boolean a;
        public final int b;
        public final boolean c;
        public final boolean d;
        public final int e;
        public final int f;
        public final int g;
        public final double h;

        public b() {
            this(0);
        }

        public final boolean a() {
            return this.a;
        }

        public final boolean b() {
            return this.d;
        }

        public final int c() {
            return this.f;
        }

        public final int d() {
            return this.g;
        }

        public final int e() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e && this.f == bVar.f && this.g == bVar.g && Double.compare(this.h, bVar.h) == 0;
        }

        public final int f() {
            return this.b;
        }

        public final double g() {
            return this.h;
        }

        public final boolean h() {
            return this.c;
        }

        public final int hashCode() {
            return Double.hashCode(this.h) + shy.a(this.g, shy.a(this.f, shy.a(this.e, qoy.b(qoy.b(shy.a(this.b, Boolean.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OtelConfig(enabled=");
            sb.append(this.a);
            sb.append(", maxSpansCountToUpload=");
            sb.append(this.b);
            sb.append(", uploadOnlyCompleteTraces=");
            sb.append(this.c);
            sb.append(", installAsGlobalTracer=");
            sb.append(this.d);
            sb.append(", maxEventsPerSpan=");
            sb.append(this.e);
            sb.append(", maxAttributesPerEvent=");
            sb.append(this.f);
            sb.append(", maxAttributesPerSpan=");
            sb.append(this.g);
            sb.append(", samplerRatio=");
            return ojp0.a(sb, this.h, ')');
        }

        public /* synthetic */ b(int i2) {
            this(false, 512, false, false, 2048, 128, 128, 0.01d);
        }

        public b(boolean z, int i2, boolean z2, boolean z3, int i3, int i4, int i5, double d) {
            this.a = z;
            this.b = i2;
            this.c = z2;
            this.d = z3;
            this.e = i3;
            this.f = i4;
            this.g = i5;
            this.h = d;
        }
    }

    public la3() {
        this(false, null, 63);
    }

    public final boolean a() {
        return this.b;
    }

    public final boolean b() {
        return this.a;
    }

    public final boolean c() {
        return this.c;
    }

    public final b d() {
        return this.e;
    }

    public final boolean e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof la3)) {
            return false;
        }
        la3 la3Var = (la3) obj;
        return this.a == la3Var.a && this.b == la3Var.b && this.c == la3Var.c && this.d == la3Var.d && epx.f(this.e, la3Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + qoy.b(qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, false);
    }

    public final String toString() {
        return "AppTracerConfig(crashEnabled=" + this.a + ", anrEnabled=" + this.b + ", heapsEnabled=" + this.c + ", tracingEnabled=" + this.d + ", samplingEnabled=false, otelConfig=" + this.e + ')';
    }

    public la3(boolean z, b bVar, int i) {
        z = (i & 8) != 0 ? false : z;
        bVar = (i & 32) != 0 ? b.i : bVar;
        this.a = true;
        this.b = true;
        this.c = true;
        this.d = z;
        this.e = bVar;
    }
}
