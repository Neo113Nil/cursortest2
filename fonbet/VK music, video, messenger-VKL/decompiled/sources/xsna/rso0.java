package xsna;

/* compiled from: ThumbnailBranchProducer.java */
/* loaded from: classes12.dex */
public final class rso0 implements thd0<rip> {
    public final uso0<rip>[] a;

    /* compiled from: ThumbnailBranchProducer.java */
    public class a extends wtl<rip, rip> {
        public final uhd0 c;
        public final int d;
        public final x9g0 e;

        public a(l7j<rip> l7jVar, uhd0 uhd0Var, int i) {
            super(l7jVar);
            this.c = uhd0Var;
            this.d = i;
            this.e = uhd0Var.r().h;
        }

        @Override // xsna.wtl, xsna.ac6
        public final void g(Throwable th) {
            int i = this.d + 1;
            uhd0 uhd0Var = this.c;
            rso0 rso0Var = rso0.this;
            l7j<O> l7jVar = this.b;
            if (rso0Var.c(i, l7jVar, uhd0Var)) {
                return;
            }
            l7jVar.onFailure(th);
        }

        @Override // xsna.ac6
        public final void h(int i, Object obj) {
            rip ripVar = (rip) obj;
            l7j<O> l7jVar = this.b;
            if (ripVar != null && (ac6.e(i) || m4s.x(ripVar, this.e))) {
                l7jVar.b(i, ripVar);
                return;
            }
            if (ac6.d(i)) {
                rip.c(ripVar);
                if (rso0.this.c(this.d + 1, l7jVar, this.c)) {
                    return;
                }
                l7jVar.b(1, null);
            }
        }
    }

    public rso0(uso0<rip>... uso0VarArr) {
        uso0<rip>[] uso0VarArr2 = uso0VarArr;
        this.a = uso0VarArr2;
        sex0.d(0, uso0VarArr2.length);
    }

    @Override // xsna.thd0
    public final void b(l7j<rip> l7jVar, uhd0 uhd0Var) {
        if (uhd0Var.r().h == null) {
            l7jVar.b(1, null);
        } else {
            if (c(0, l7jVar, uhd0Var)) {
                return;
            }
            l7jVar.b(1, null);
        }
    }

    public final boolean c(int i, l7j<rip> l7jVar, uhd0 uhd0Var) {
        uso0<rip>[] uso0VarArr;
        x9g0 x9g0Var = uhd0Var.r().h;
        while (true) {
            uso0VarArr = this.a;
            if (i >= uso0VarArr.length) {
                i = -1;
                break;
            }
            if (uso0VarArr[i].a(x9g0Var)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            return false;
        }
        uso0VarArr[i].b(new a(l7jVar, uhd0Var, i), uhd0Var);
        return true;
    }
}
