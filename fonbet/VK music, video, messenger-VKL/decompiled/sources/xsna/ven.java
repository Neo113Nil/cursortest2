package xsna;

/* compiled from: DisplayLayoutFeature.kt */
/* loaded from: classes11.dex */
public final class ven {
    public final rct0 a;
    public final afn b;
    public final bfn c;
    public final dfn d;
    public final yen e;

    public ven(rct0 rct0Var, io.reactivex.rxjava3.internal.operators.observable.i0 i0Var) {
        this.a = rct0Var;
        yji0 yji0Var = new yji0(e43.l(new mfu(), new tgz(), new apa0()));
        dfn dfnVar = new dfn();
        this.d = dfnVar;
        yen yenVar = new yen();
        this.e = yenVar;
        this.b = new afn(yenVar, dfnVar, yji0Var, rct0Var);
        this.c = new bfn(yenVar, dfnVar);
        io.reactivex.rxjava3.internal.operators.observable.m1 a0 = i0Var.a0(asu0.a.d());
        final ten tenVar = new ten(this);
        a0.subscribe(new io.reactivex.rxjava3.functions.f() { // from class: xsna.uen
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Object obj) {
                ten.this.invoke(obj);
            }
        });
    }
}
