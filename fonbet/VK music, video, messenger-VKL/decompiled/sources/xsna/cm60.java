package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class cm60 implements izs {
    public final /* synthetic */ em60 b;
    public final /* synthetic */ int c;

    public /* synthetic */ cm60(em60 em60Var, int i) {
        this.b = em60Var;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ce60 ce60Var = this.b.c;
        long currentTimeMillis = System.currentTimeMillis();
        ce60Var.getClass();
        ce60.h.put(Integer.valueOf(this.c), Long.valueOf(currentTimeMillis));
        return s3q0.a;
    }
}
