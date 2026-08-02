package defpackage;

/* loaded from: classes4.dex */
public final class mq6 extends szn {
    public u2 w;
    public xr1 x;
    public dqf y;

    @Override // defpackage.szn
    public final xr1 m() {
        return this.x;
    }

    @Override // defpackage.szn
    public final u2 n() {
        return this.w;
    }

    @Override // defpackage.szn
    public final w2 o() {
        return this.y;
    }

    @Override // defpackage.szn, defpackage.a2
    public final b3 toASN1Primitive() {
        c2 c2Var = new c2();
        c2Var.a(this.w);
        c2Var.a(this.x);
        dqf dqfVar = this.y;
        if (dqfVar != null) {
            c2Var.a(new oqf(2, 128, 0, dqfVar, 0));
        }
        return new nd4(c2Var);
    }
}
