package xsna;

/* compiled from: SessionFirelogPublisherImpl_Factory.java */
/* loaded from: classes.dex */
public final class rti0 implements vhq<pti0> {
    public final o6x b;
    public final e9e0<uir> c;
    public final e9e0<cyi0> d;
    public final e9e0<xyp> e;
    public final e9e0<kotlin.coroutines.d> f;

    public rti0(o6x o6xVar, e9e0 e9e0Var, e9e0 e9e0Var2, e9e0 e9e0Var3, e9e0 e9e0Var4) {
        this.b = o6xVar;
        this.c = e9e0Var;
        this.d = e9e0Var2;
        this.e = e9e0Var3;
        this.f = e9e0Var4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.e9e0
    public final Object get() {
        return new pti0((vhr) this.b.b, this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
