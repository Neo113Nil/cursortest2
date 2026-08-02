package xsna;

import java.util.Map;

/* compiled from: DevNullSamplerConfig.kt */
/* loaded from: classes11.dex */
public final class m5m {
    public static final a d = new a();
    public static final m5m e = new m5m(0);
    public final boolean a;
    public final Map<String, Double> b;
    public final double c;

    /* compiled from: DevNullSamplerConfig.kt */
    public static final class a {
    }

    public m5m() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m5m)) {
            return false;
        }
        m5m m5mVar = (m5m) obj;
        return this.a == m5mVar.a && epx.f(this.b, m5mVar.b) && Double.compare(this.c, m5mVar.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + v11.a(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DevNullSamplerConfig(enabled=");
        sb.append(this.a);
        sb.append(", eventSamples=");
        sb.append(this.b);
        sb.append(", defaultSample=");
        return ojp0.a(sb, this.c, ')');
    }

    public m5m(double d2, Map map, boolean z) {
        this.a = z;
        this.b = map;
        this.c = d2;
    }

    public /* synthetic */ m5m(int i) {
        this(1.0d, jgp.b, false);
    }
}
