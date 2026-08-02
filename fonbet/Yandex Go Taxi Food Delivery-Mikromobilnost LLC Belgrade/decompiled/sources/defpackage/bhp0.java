package defpackage;

/* loaded from: classes10.dex */
public final class bhp0 {
    public final sls a;
    public final sls b;

    public bhp0(sls slsVar, sls slsVar2) {
        this.a = slsVar;
        this.b = slsVar2;
    }

    public final sls a() {
        return this.b;
    }

    public final sls b() {
        return this.a;
    }

    public final String toString() {
        return "ScrollAxisRange(value=" + ((Number) this.a.invoke()).floatValue() + ", maxValue=" + ((Number) this.b.invoke()).floatValue() + ", reverseScrolling=false)";
    }
}
