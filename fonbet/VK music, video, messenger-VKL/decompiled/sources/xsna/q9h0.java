package xsna;

/* compiled from: Schlick.java */
/* loaded from: classes11.dex */
public final class q9h0 extends guo {
    public double d;
    public double e;

    @Override // xsna.guo
    public final double a(double d) {
        double d2 = this.d;
        double d3 = this.e;
        if (d < d3) {
            return (d3 * d) / (((d3 - d) * d2) + d);
        }
        return ((d - 1.0d) * (1.0d - d3)) / ((1.0d - d) - ((d3 - d) * d2));
    }

    @Override // xsna.guo
    public final double b(double d) {
        double d2 = this.d;
        double d3 = this.e;
        if (d < d3) {
            double d4 = d2 * d3 * d3;
            double d5 = ((d3 - d) * d2) + d;
            return d4 / (d5 * d5);
        }
        double d6 = d3 - 1.0d;
        double d7 = (((d3 - d) * (-d2)) - d) + 1.0d;
        return ((d6 * d2) * d6) / (d7 * d7);
    }
}
