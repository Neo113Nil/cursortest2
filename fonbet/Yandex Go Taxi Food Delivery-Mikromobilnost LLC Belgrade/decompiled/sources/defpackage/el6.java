package defpackage;

/* loaded from: classes4.dex */
public final class el6 implements szl {
    public final ryl a;

    public el6(int i) {
        i3y i3yVar = ryl.c;
        this.a = ck91.b();
    }

    @Override // defpackage.szl
    public final void a(neo neoVar, l1o l1oVar) {
        if (neoVar instanceof f1m) {
            f1m f1mVar = (f1m) neoVar;
            boolean z = f1mVar instanceof w0m;
            ryl rylVar = this.a;
            if (z) {
                rylVar.c(((w0m) f1mVar).b);
                return;
            }
            if (f1mVar instanceof y0m) {
                y0m y0mVar = (y0m) f1mVar;
                u1m u1mVar = y0mVar.b;
                if (y0mVar.d.contains("screenIsBroken")) {
                    rylVar.c(u1mVar);
                }
            }
        }
    }

    @Override // defpackage.szl
    public final void b(t9 t9Var) {
    }

    @Override // defpackage.szl
    public final void dispose() {
    }

    public el6() {
        this(0);
    }
}
