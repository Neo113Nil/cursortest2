package xsna;

/* compiled from: AutoValue_MetricDescriptor.java */
/* loaded from: classes8.dex */
public final class mn5 extends zk20 {
    public final String c;
    public final String d;
    public final ttt0 e;
    public final ym5 f;

    public mn5(String str, String str2, ttt0 ttt0Var, ym5 ym5Var) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.c = str;
        if (str2 == null) {
            throw new NullPointerException("Null description");
        }
        this.d = str2;
        if (ttt0Var == null) {
            throw new NullPointerException("Null view");
        }
        this.e = ttt0Var;
        this.f = ym5Var;
    }

    @Override // xsna.zk20
    public final String b() {
        return this.d;
    }

    @Override // xsna.zk20
    public final String c() {
        return this.c;
    }

    @Override // xsna.zk20
    public final m8x d() {
        return this.f;
    }

    @Override // xsna.zk20
    public final ttt0 e() {
        return this.e;
    }

    public final String toString() {
        return "MetricDescriptor{name=" + this.c + ", description=" + this.d + ", view=" + this.e + ", sourceInstrument=" + this.f + "}";
    }
}
