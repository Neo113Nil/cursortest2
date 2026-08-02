package defpackage;

/* loaded from: classes4.dex */
public final class g3 implements j3 {
    public int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ i3 c;

    public g3(i3 i3Var, int i) {
        this.c = i3Var;
        this.b = i;
    }

    @Override // defpackage.mlv
    public final b3 a() {
        return this.c;
    }

    @Override // defpackage.j3
    public final a2 readObject() {
        int i = this.a;
        if (this.b == i) {
            return null;
        }
        a2[] a2VarArr = this.c.a;
        this.a = i + 1;
        a2 a2Var = a2VarArr[i];
        if (a2Var instanceof i3) {
            i3 i3Var = (i3) a2Var;
            return new g3(i3Var, i3Var.size());
        }
        if (!(a2Var instanceof m3)) {
            return a2Var;
        }
        m3 m3Var = (m3) a2Var;
        return new k3(m3Var, m3Var.a.length);
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        return this.c;
    }
}
