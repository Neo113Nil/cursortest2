package xsna;

/* compiled from: SnapshotFloatState.kt */
/* loaded from: classes11.dex */
public class vak0 extends nuk0 implements kg50, yak0<Float> {
    public a c;

    /* compiled from: SnapshotFloatState.kt */
    public static final class a extends puk0 {
        public float c;

        public a(long j, float f) {
            super(j);
            this.c = f;
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

    public vak0(float f) {
        dak0 j = qak0.j();
        a aVar = new a(j.g(), f);
        if (!(j instanceof k2u)) {
            aVar.b = new a(1, f);
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
    public final izs<Float, s3q0> K() {
        return new u2k0(this, 1);
    }

    @Override // xsna.wh50
    public final Float R() {
        return Float.valueOf(getFloatValue());
    }

    @Override // xsna.yak0
    public final abk0<Float> d() {
        return k0x.c;
    }

    @Override // xsna.kg50
    public final void g(float f) {
        dak0 j;
        a aVar = (a) qak0.h(this.c);
        if (aVar.c == f) {
            return;
        }
        a aVar2 = this.c;
        synchronized (qak0.c) {
            j = qak0.j();
            ((a) qak0.o(aVar2, this, j, aVar)).c = f;
            s3q0 s3q0Var = s3q0.a;
        }
        qak0.n(j, this);
    }

    @Override // xsna.kg50
    public final float getFloatValue() {
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
        return "MutableFloatState(value=" + ((a) qak0.h(this.c)).c + ")@" + hashCode();
    }
}
