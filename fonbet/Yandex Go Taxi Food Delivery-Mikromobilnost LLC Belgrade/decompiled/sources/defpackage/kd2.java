package defpackage;

/* loaded from: classes7.dex */
public final class kd2 implements cq6 {
    public static final jd2[] b = {new jd2(0.2d, 7.0d), new jd2(3.0d, 11.0d), new jd2(10.0d, 25.0d)};
    public final jd2[] a;

    public kd2(int i) {
        this.a = b;
    }

    @Override // defpackage.cq6
    public final Double a(md6 md6Var) {
        jd2 jd2Var;
        Double d = (Double) md6Var.b;
        if (d != null) {
            double doubleValue = d.doubleValue();
            jd2[] jd2VarArr = this.a;
            int length = jd2VarArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    jd2Var = null;
                    break;
                }
                jd2Var = jd2VarArr[i];
                if (doubleValue <= jd2Var.a) {
                    break;
                }
                i++;
            }
            if (jd2Var != null) {
                return Double.valueOf(jd2Var.b);
            }
        }
        return null;
    }

    public kd2() {
        this(0);
    }
}
