package xsna;

/* compiled from: StorageEnvironmentImpl.kt */
/* loaded from: classes2.dex */
public final class ugl0 implements tgl0 {
    public final xgl0 a;
    public final e0w b;
    public final dil0 c;
    public final bpn0 d;

    public ugl0(xgl0 xgl0Var, e0w e0wVar, np npVar, dil0 dil0Var) {
        this.a = xgl0Var;
        this.b = e0wVar;
        this.c = dil0Var;
        this.d = new bpn0(new u210(npVar, 28));
    }

    @Override // xsna.tgl0
    public final xgl0 I0() {
        return this.a;
    }

    @Override // xsna.tgl0
    public final mey a() {
        return (mey) this.d.getValue();
    }

    @Override // xsna.tgl0
    public final e0w b() {
        return this.b;
    }

    @Override // xsna.tgl0
    public final <T> cil0<T> c(Class<T> cls) {
        return this.c.a(cls);
    }
}
