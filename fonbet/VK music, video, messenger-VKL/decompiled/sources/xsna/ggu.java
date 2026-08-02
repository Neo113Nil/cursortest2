package xsna;

/* compiled from: LazyGridDsl.kt */
/* loaded from: classes11.dex */
public final class ggu implements vry {
    public final wzs<azl, o6j, ury> a;
    public long b = s6j.b(0, 0, 0, 0, 15);
    public float c;
    public ury d;

    /* JADX WARN: Multi-variable type inference failed */
    public ggu(wzs<? super azl, ? super o6j, ury> wzsVar) {
        this.a = wzsVar;
    }

    @Override // xsna.vry
    public final ury a(qty qtyVar, long j) {
        ztm0 ztm0Var = qtyVar.c;
        if (this.d != null && o6j.c(this.b, j) && this.c == ztm0Var.getDensity()) {
            return this.d;
        }
        this.b = j;
        this.c = ztm0Var.getDensity();
        ury invoke = this.a.invoke(qtyVar, new o6j(j));
        this.d = invoke;
        return invoke;
    }
}
