package xsna;

/* compiled from: ThreadHandoffProducer.kt */
/* loaded from: classes12.dex */
public final class rqo0<T> implements thd0<T> {
    public final thd0<T> a;
    public final sqo0 b;

    /* compiled from: ThreadHandoffProducer.kt */
    public static final class a {
    }

    /* compiled from: ThreadHandoffProducer.kt */
    public static final class b extends uk6 {
        public final /* synthetic */ c a;
        public final /* synthetic */ rqo0<T> b;

        public b(c cVar, rqo0 rqo0Var) {
            this.a = cVar;
            this.b = rqo0Var;
        }

        @Override // xsna.vhd0
        public final void c() {
            this.a.a();
            sqo0 sqo0Var = this.b.b;
            c cVar = this.a;
            synchronized (sqo0Var) {
                sqo0Var.b.remove(cVar);
            }
        }
    }

    public rqo0(thd0<T> thd0Var, sqo0 sqo0Var) {
        this.a = thd0Var;
        this.b = sqo0Var;
    }

    @Override // xsna.thd0
    public final void b(l7j<T> l7jVar, uhd0 uhd0Var) {
        sqo0 sqo0Var = this.b;
        if (!lhs.d()) {
            yhd0 q = uhd0Var.q();
            uhd0Var.n().getExperiments().getClass();
            c cVar = new c(l7jVar, q, uhd0Var, this);
            uhd0Var.p(new b(cVar, this));
            synchronized (sqo0Var) {
                sqo0Var.a.execute(cVar);
            }
            return;
        }
        lhs.a("ThreadHandoffProducer#produceResults");
        try {
            yhd0 q2 = uhd0Var.q();
            uhd0Var.n().getExperiments().getClass();
            c cVar2 = new c(l7jVar, q2, uhd0Var, this);
            uhd0Var.p(new b(cVar2, this));
            synchronized (sqo0Var) {
                sqo0Var.a.execute(cVar2);
            }
            s3q0 s3q0Var = s3q0.a;
        } finally {
            lhs.b();
        }
    }

    /* compiled from: ThreadHandoffProducer.kt */
    public static final class c extends zuk0<T> {
        public final /* synthetic */ l7j<T> g;
        public final /* synthetic */ yhd0 h;
        public final /* synthetic */ uhd0 i;
        public final /* synthetic */ rqo0<T> j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(l7j<T> l7jVar, yhd0 yhd0Var, uhd0 uhd0Var, rqo0<T> rqo0Var) {
            super(l7jVar, yhd0Var, uhd0Var, "BackgroundThreadHandoffProducer");
            this.g = l7jVar;
            this.h = yhd0Var;
            this.i = uhd0Var;
            this.j = rqo0Var;
        }

        @Override // xsna.zuk0
        public final T d() throws Exception {
            return null;
        }

        @Override // xsna.zuk0
        public final void g(T t) {
            yhd0 yhd0Var = this.h;
            uhd0 uhd0Var = this.i;
            yhd0Var.f(uhd0Var, "BackgroundThreadHandoffProducer", null);
            this.j.a.b(this.g, uhd0Var);
        }

        @Override // xsna.zuk0
        public final void b(T t) {
        }
    }
}
