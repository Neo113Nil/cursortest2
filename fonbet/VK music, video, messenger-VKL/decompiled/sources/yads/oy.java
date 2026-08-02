package yads;

/* loaded from: classes10.dex */
public final class oy implements jk1 {
    public final ik1 a = new ik1();
    public final jk1[] b;

    public oy(jk1... jk1VarArr) {
        this.b = jk1VarArr;
    }

    @Override // yads.jk1
    public final ik1 a(int i, int i2) {
        jk1[] jk1VarArr = this.b;
        int length = jk1VarArr.length;
        int i3 = 0;
        while (i3 < length) {
            ik1 a = jk1VarArr[i3].a(i, i2);
            int i4 = a.a;
            i3++;
            i2 = a.b;
            i = i4;
        }
        ik1 ik1Var = this.a;
        ik1Var.a = i;
        ik1Var.b = i2;
        return ik1Var;
    }
}
