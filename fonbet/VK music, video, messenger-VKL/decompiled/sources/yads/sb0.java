package yads;

/* loaded from: classes10.dex */
public final class sb0 {
    public final bl[] a;
    public final xz2 b;
    public final h33 c;

    public sb0(bl[] blVarArr, xz2 xz2Var, h33 h33Var) {
        bl[] blVarArr2 = new bl[blVarArr.length + 2];
        this.a = blVarArr2;
        System.arraycopy(blVarArr, 0, blVarArr2, 0, blVarArr.length);
        this.b = xz2Var;
        this.c = h33Var;
        blVarArr2[blVarArr.length] = xz2Var;
        blVarArr2[blVarArr.length + 1] = h33Var;
    }

    public final bl[] a() {
        return this.a;
    }
}
