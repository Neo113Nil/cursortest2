package yads;

/* loaded from: classes10.dex */
public final class qq1 implements y32 {
    public final v9 a;
    public final ir1 b;

    public qq1(v9 v9Var, ir1 ir1Var) {
        this.a = v9Var;
        this.b = ir1Var;
    }

    @Override // yads.y32
    public final x32 a(n12 n12Var) {
        v9 v9Var = this.a;
        ir1 ir1Var = this.b;
        d4 d4Var = n12Var.c;
        ov2 ov2Var = n12Var.d;
        fq1 fq1Var = new fq1(d4Var);
        yp1 yp1Var = new yp1(d4Var, ov2Var, v9Var);
        mq1 mq1Var = new mq1(new np1(ir1Var.b, fq1Var, yp1Var));
        ep1 ep1Var = new ep1(d4Var, ov2Var, n12Var.b, new nq1(), yp1Var, mq1Var, new tc2(n12Var, ir1Var));
        return new pq1(ep1Var, new d32(v9Var, ov2Var, n12Var, ep1Var));
    }
}
