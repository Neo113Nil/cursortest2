package xsna;

import io.opentelemetry.sdk.metrics.data.MetricDataType;

/* compiled from: AutoValue_ImmutableMetricData.java */
/* loaded from: classes8.dex */
public final class qm5 extends epw {
    public final gag0 a;
    public final q8x b;
    public final String c;
    public final String d;
    public final String e;
    public final MetricDataType f;
    public final qtk<?> g;

    public qm5(gag0 gag0Var, q8x q8xVar, String str, String str2, String str3, MetricDataType metricDataType, qtk<?> qtkVar) {
        if (gag0Var == null) {
            throw new NullPointerException("Null resource");
        }
        this.a = gag0Var;
        if (q8xVar == null) {
            throw new NullPointerException("Null instrumentationScopeInfo");
        }
        this.b = q8xVar;
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.c = str;
        if (str2 == null) {
            throw new NullPointerException("Null description");
        }
        this.d = str2;
        if (str3 == null) {
            throw new NullPointerException("Null unit");
        }
        this.e = str3;
        if (metricDataType == null) {
            throw new NullPointerException("Null type");
        }
        this.f = metricDataType;
        if (qtkVar == null) {
            throw new NullPointerException("Null data");
        }
        this.g = qtkVar;
    }

    @Override // xsna.yk20
    public final String a() {
        return this.e;
    }

    @Override // xsna.yk20
    public final q8x c() {
        return this.b;
    }

    @Override // xsna.yk20
    public final gag0 d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof epw) {
            epw epwVar = (epw) obj;
            if (this.a.equals(((qm5) epwVar).a)) {
                qm5 qm5Var = (qm5) epwVar;
                if (this.b.equals(qm5Var.b) && this.c.equals(qm5Var.c) && this.d.equals(qm5Var.d) && this.e.equals(qm5Var.e) && this.f.equals(qm5Var.f) && this.g.equals(qm5Var.g)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // xsna.yk20
    public final qtk<?> getData() {
        return this.g;
    }

    @Override // xsna.yk20
    public final String getDescription() {
        return this.d;
    }

    @Override // xsna.yk20
    public final String getName() {
        return this.c;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        return "ImmutableMetricData{resource=" + this.a + ", instrumentationScopeInfo=" + this.b + ", name=" + this.c + ", description=" + this.d + ", unit=" + this.e + ", type=" + this.f + ", data=" + this.g + "}";
    }
}
