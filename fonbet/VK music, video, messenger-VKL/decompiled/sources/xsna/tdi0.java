package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class tdi0 implements b0t {
    public final /* synthetic */ bei0 b;

    @Override // xsna.b0t
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        tny tnyVar = (tny) obj2;
        long j = ((ov70) obj3).a;
        bei0 bei0Var = this.b;
        long a = bei0Var.a(tnyVar, j);
        long a2 = bei0Var.a(tnyVar, ((ov70) obj4).a);
        bei0Var.k(booleanValue);
        return Boolean.valueOf(bei0Var.n(a, a2, ((Boolean) obj5).booleanValue(), (zbi0) obj6));
    }
}
