package xsna;

/* compiled from: DatePicker.kt */
/* loaded from: classes11.dex */
public final class yzk<T> implements lsr {
    public final /* synthetic */ xvy b;
    public final /* synthetic */ izs<Long, s3q0> c;
    public final /* synthetic */ wz8 d;
    public final /* synthetic */ k9x e;

    /* JADX WARN: Multi-variable type inference failed */
    public yzk(xvy xvyVar, izs<? super Long, s3q0> izsVar, wz8 wz8Var, k9x k9xVar) {
        this.b = xvyVar;
        this.c = izsVar;
        this.d = wz8Var;
        this.e = k9xVar;
    }

    @Override // xsna.lsr
    public final Object emit(Object obj, spj spjVar) {
        ((Number) obj).intValue();
        xvy xvyVar = this.b;
        int h = xvyVar.h() / 12;
        int h2 = (xvyVar.h() % 12) + 1;
        this.c.invoke(new Long(this.d.e(this.e.b + h, h2).e));
        return s3q0.a;
    }
}
