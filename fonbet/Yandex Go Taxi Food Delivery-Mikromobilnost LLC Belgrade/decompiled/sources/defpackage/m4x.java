package defpackage;

/* loaded from: classes.dex */
public final class m4x extends ky60 {
    public final /* synthetic */ l4x a;
    public final /* synthetic */ o4x b;

    public m4x(l4x l4xVar, o4x o4xVar) {
        this.a = l4xVar;
        this.b = o4xVar;
    }

    @Override // defpackage.ky60
    public final void a(long j, long j2, long j3) {
        long j4;
        l4x l4xVar = this.a;
        long j5 = (long) (j3 * l4xVar.d);
        o4x o4xVar = this.b;
        mes mesVar = o4xVar.i;
        yuf0 yuf0Var = o4xVar.g.a;
        if (yuf0Var != null) {
            j4 = j;
            yuf0Var.x(j4, j + j2, o4xVar.h);
        } else {
            j4 = j;
        }
        boolean z = j2 > j5;
        mesVar.b = j4;
        mesVar.c = j2;
        mesVar.d = z;
        l4xVar.a.b(mesVar);
    }
}
