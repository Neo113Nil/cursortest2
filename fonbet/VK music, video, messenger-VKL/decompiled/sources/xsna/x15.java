package xsna;

import kotlin.Triple;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class x15 implements io.reactivex.rxjava3.core.s, io.reactivex.rxjava3.functions.g {
    public final /* synthetic */ Object b;

    public /* synthetic */ x15(Object obj) {
        this.b = obj;
    }

    @Override // io.reactivex.rxjava3.functions.g
    public Object d(Object obj, Object obj2, Object obj3) {
        return (Triple) ((qdj) this.b).invoke(obj, obj2, obj3);
    }

    @Override // io.reactivex.rxjava3.core.s
    public void subscribe(io.reactivex.rxjava3.core.r rVar) {
        final b25 b25Var = (b25) this.b;
        final c25 c25Var = new c25(rVar);
        rVar.a(new io.reactivex.rxjava3.functions.e() { // from class: xsna.a25
            @Override // io.reactivex.rxjava3.functions.e
            public final void cancel() {
                b25.this.B(c25Var);
            }
        });
        b25Var.b0(c25Var);
    }
}
