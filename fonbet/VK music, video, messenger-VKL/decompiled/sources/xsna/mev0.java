package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class mev0 implements wzs {
    public final /* synthetic */ pev0 b;

    public /* synthetic */ mev0(pev0 pev0Var) {
        this.b = pev0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        v9e0 v9e0Var = (v9e0) obj;
        boolean isEmpty = v9e0Var.c.isEmpty();
        pev0 pev0Var = this.b;
        pev0Var.j.onNext(Boolean.valueOf((isEmpty || v9e0Var.a.isEmpty() || !pev0Var.c.b()) ? false : true));
        return s3q0.a;
    }
}
