package xsna;

/* compiled from: SnapshotIntState.kt */
/* loaded from: classes11.dex */
public class wak0 extends nuk0 implements rg50, yak0<Integer> {
    public a c;

    /* compiled from: SnapshotIntState.kt */
    public static final class a extends puk0 {
        public int c;

        public a(long j, int i) {
            super(j);
            this.c = i;
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

    public wak0(int i) {
        dak0 j = qak0.j();
        a aVar = new a(j.g(), i);
        if (!(j instanceof k2u)) {
            aVar.b = new a(1, i);
        }
        this.c = aVar;
    }

    @Override // xsna.rg50
    public final void C(int i) {
        dak0 j;
        a aVar = (a) qak0.h(this.c);
        if (aVar.c != i) {
            a aVar2 = this.c;
            synchronized (qak0.c) {
                j = qak0.j();
                ((a) qak0.o(aVar2, this, j, aVar)).c = i;
                s3q0 s3q0Var = s3q0.a;
            }
            qak0.n(j, this);
        }
    }

    @Override // xsna.muk0
    public final puk0 F(puk0 puk0Var, puk0 puk0Var2, puk0 puk0Var3) {
        if (((a) puk0Var2).c == ((a) puk0Var3).c) {
            return puk0Var2;
        }
        return null;
    }

    @Override // xsna.wh50
    public final izs<Integer, s3q0> K() {
        return new m360(this, 17);
    }

    @Override // xsna.wh50
    public final Integer R() {
        return Integer.valueOf(getIntValue());
    }

    @Override // xsna.yak0
    public final abk0<Integer> d() {
        return k0x.c;
    }

    @Override // xsna.rg50
    public final int getIntValue() {
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

    public final String toString() {
        return "MutableIntState(value=" + ((a) qak0.h(this.c)).c + ")@" + hashCode();
    }
}
