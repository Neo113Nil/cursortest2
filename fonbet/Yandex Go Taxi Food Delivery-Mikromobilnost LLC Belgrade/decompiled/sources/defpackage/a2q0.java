package defpackage;

/* loaded from: classes5.dex */
public final /* synthetic */ class a2q0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ byk0 b;

    public /* synthetic */ a2q0(byk0 byk0Var, int i) {
        this.a = i;
        this.b = byk0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        byk0 byk0Var = this.b;
        switch (i) {
            case 0:
                c1y c1yVar = (c1y) obj;
                jb2 a = nb2.a();
                k28 k28Var = c1yVar.a;
                jd00.b(a, byk0Var.a(k28Var.c(), c1yVar.getLayoutDirection(), c1yVar));
                nfh nfhVar = k28Var.b;
                long v = nfhVar.v();
                nfhVar.q().save();
                try {
                    ((cot) nfhVar.a).e(a);
                    c1yVar.a();
                    b64.C(nfhVar, v);
                    return zy11.a;
                } catch (Throwable th) {
                    b64.C(nfhVar, v);
                    throw th;
                }
            default:
                return ymb1.l((f530) obj, byk0Var);
        }
    }
}
