package xsna;

import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SnapshotFlow.kt */
/* loaded from: classes11.dex */
public final class i640 extends jak0 {
    public final ph50<Object, Object> b = h5h0.b();
    public final ArrayList c = new ArrayList();
    public final qh50<ohi0<s3q0>> d = k5h0.a();
    public final ph50<ohi0<s3q0>, izs<Object, s3q0>> e = h5h0.b();
    public final cak0 f;

    /* compiled from: SnapshotFlow.kt */
    public static final class a implements c {
        public final Object a;
        public final ohi0<s3q0> b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Object obj, ohi0<? super s3q0> ohi0Var) {
            this.a = obj;
            this.b = ohi0Var;
        }
    }

    /* compiled from: SnapshotFlow.kt */
    public static final class b implements c {
        public final ohi0<s3q0> a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(ohi0<? super s3q0> ohi0Var) {
            this.a = ohi0Var;
        }
    }

    /* compiled from: SnapshotFlow.kt */
    public interface c {
    }

    public i640() {
        o4e o4eVar = new o4e(this, 5);
        qak0.e(qak0.a);
        synchronized (qak0.c) {
            qak0.h = j5g.v0(o4eVar, qak0.h);
            s3q0 s3q0Var = s3q0.a;
        }
        this.f = new cak0(o4eVar);
    }

    @Override // xsna.jak0
    public final void a(ohi0<? super s3q0> ohi0Var) {
        this.c.add(new b(ohi0Var));
    }

    @Override // xsna.jak0
    public final void b() {
        synchronized (this.a) {
            try {
                ArrayList arrayList = this.c;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    c cVar = (c) arrayList.get(i);
                    if (cVar instanceof a) {
                        s101.f(this.b, ((a) cVar).a, ((a) cVar).b);
                    } else {
                        if (!(cVar instanceof b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        s101.K(this.b, ((b) cVar).a);
                    }
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.c.clear();
    }

    @Override // xsna.jak0
    public final void c() {
        this.f.dispose();
        this.c.clear();
        this.e.h();
        synchronized (this.a) {
            this.b.h();
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // xsna.jak0
    public final izs<Object, s3q0> d(ohi0<? super s3q0> ohi0Var) {
        ph50<ohi0<s3q0>, izs<Object, s3q0>> ph50Var = this.e;
        izs<Object, s3q0> d = ph50Var.d(ohi0Var);
        if (d != null) {
            return d;
        }
        gb gbVar = new gb(21, this, ohi0Var);
        ph50Var.l(ohi0Var, gbVar);
        return gbVar;
    }

    @Override // xsna.jak0
    public final void e(qta qtaVar) {
        this.e.n(qtaVar);
        a(qtaVar);
        b();
    }
}
