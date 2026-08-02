package xsna;

import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class jm implements io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.core.s, io.reactivex.rxjava3.functions.c {
    public final /* synthetic */ Object b;

    public /* synthetic */ jm(Object obj) {
        this.b = obj;
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (Boolean) ((s03) this.b).invoke(obj, obj2);
    }

    @Override // io.reactivex.rxjava3.core.s
    public void subscribe(io.reactivex.rxjava3.core.r rVar) {
        final b25 b25Var = (b25) this.b;
        final v660 v660Var = new v660(rVar);
        rVar.a(new io.reactivex.rxjava3.functions.e() { // from class: xsna.t660
            @Override // io.reactivex.rxjava3.functions.e
            public final void cancel() {
                b25.this.B(v660Var);
            }
        });
        b25Var.b0(v660Var);
        rVar.onNext(Boolean.valueOf(b25Var.b()));
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return ((Boolean) ((im) this.b).invoke(obj)).booleanValue();
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        return (List) ((im) this.b).invoke(obj);
    }
}
