package xsna;

/* compiled from: SnapshotState.kt */
/* loaded from: classes.dex */
public class zak0<T> extends nuk0 implements yak0<T> {
    public final abk0<T> c;
    public a<T> d;

    /* compiled from: SnapshotState.kt */
    public static final class a<T> extends puk0 {
        public T c;

        public a(long j, T t) {
            super(j);
            this.c = t;
        }

        @Override // xsna.puk0
        public final void a(puk0 puk0Var) {
            this.c = ((a) puk0Var).c;
        }

        @Override // xsna.puk0
        public final puk0 b() {
            return new a(qak0.j().g(), this.c);
        }

        @Override // xsna.puk0
        public final puk0 c(long j) {
            return new a(qak0.j().g(), this.c);
        }
    }

    public zak0(T t, abk0<T> abk0Var) {
        this.c = abk0Var;
        dak0 j = qak0.j();
        a<T> aVar = new a<>(j.g(), t);
        if (!(j instanceof k2u)) {
            aVar.b = new a(1, t);
        }
        this.d = aVar;
    }

    @Override // xsna.muk0
    public final puk0 F(puk0 puk0Var, puk0 puk0Var2, puk0 puk0Var3) {
        if (this.c.b(((a) puk0Var2).c, ((a) puk0Var3).c)) {
            return puk0Var2;
        }
        return null;
    }

    @Override // xsna.wh50
    public final izs<T, s3q0> K() {
        return new i0b0(this, 14);
    }

    @Override // xsna.wh50
    public final T R() {
        return getValue();
    }

    @Override // xsna.yak0
    public final abk0<T> d() {
        return this.c;
    }

    @Override // xsna.mtk0
    public final T getValue() {
        return ((a) qak0.t(this.d, this)).c;
    }

    @Override // xsna.muk0
    public final puk0 j() {
        return this.d;
    }

    @Override // xsna.muk0
    public final void n(puk0 puk0Var) {
        this.d = (a) puk0Var;
    }

    @Override // xsna.wh50
    public final void setValue(T t) {
        dak0 j;
        a aVar = (a) qak0.h(this.d);
        if (this.c.b(aVar.c, t)) {
            return;
        }
        a<T> aVar2 = this.d;
        synchronized (qak0.c) {
            j = qak0.j();
            ((a) qak0.o(aVar2, this, j, aVar)).c = t;
            s3q0 s3q0Var = s3q0.a;
        }
        qak0.n(j, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((a) qak0.h(this.d)).c + ")@" + hashCode();
    }
}
