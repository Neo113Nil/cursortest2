package xsna;

/* compiled from: SnapshotLongState.kt */
/* loaded from: classes11.dex */
public class xak0 extends nuk0 implements ah50, yak0<Long> {
    public a c;

    /* compiled from: SnapshotLongState.kt */
    public static final class a extends puk0 {
        public long c;

        public a(long j, long j2) {
            super(j);
            this.c = j2;
        }

        @Override // xsna.puk0
        public final void a(puk0 puk0Var) {
            this.c = ((a) puk0Var).c;
        }

        @Override // xsna.puk0
        public final puk0 b() {
            return c(qak0.j().g());
        }

        @Override // xsna.puk0
        public final puk0 c(long j) {
            return new a(j, this.c);
        }
    }

    public xak0(long j) {
        dak0 j2 = qak0.j();
        a aVar = new a(j2.g(), j);
        if (!(j2 instanceof k2u)) {
            aVar.b = new a(1, j);
        }
        this.c = aVar;
    }

    @Override // xsna.muk0
    public final puk0 F(puk0 puk0Var, puk0 puk0Var2, puk0 puk0Var3) {
        if (((a) puk0Var2).c == ((a) puk0Var3).c) {
            return puk0Var2;
        }
        return null;
    }

    @Override // xsna.wh50
    public final izs<Long, s3q0> K() {
        return new hsc0(this, 13);
    }

    @Override // xsna.wh50
    public final Long R() {
        return Long.valueOf(i());
    }

    @Override // xsna.yak0
    public final abk0<Long> d() {
        return k0x.c;
    }

    @Override // xsna.ah50
    public final long i() {
        return ((a) qak0.t(this.c, this)).c;
    }

    @Override // xsna.muk0
    public final puk0 j() {
        return this.c;
    }

    @Override // xsna.muk0
    public final void n(puk0 puk0Var) {
        this.c = (a) puk0Var;
    }

    @Override // xsna.ah50
    public final void p(long j) {
        dak0 j2;
        a aVar = (a) qak0.h(this.c);
        if (aVar.c != j) {
            a aVar2 = this.c;
            synchronized (qak0.c) {
                j2 = qak0.j();
                ((a) qak0.o(aVar2, this, j2, aVar)).c = j;
                s3q0 s3q0Var = s3q0.a;
            }
            qak0.n(j2, this);
        }
    }

    public final String toString() {
        return "MutableLongState(value=" + ((a) qak0.h(this.c)).c + ")@" + hashCode();
    }
}
