package xsna;

import android.content.Context;
import xsna.om;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class km implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.core.s, com.my.tracker.obfuscated.z2 {
    public final /* synthetic */ Object b;

    public /* synthetic */ km(Object obj) {
        this.b = obj;
    }

    @Override // com.my.tracker.obfuscated.z2
    public void a(Object obj, Object obj2, Object obj3) {
        ((com.my.tracker.obfuscated.l2) this.b).b((com.my.tracker.obfuscated.q2) obj, (Boolean) obj2, (com.my.tracker.obfuscated.b3) obj3);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        return ((om.b) this.b).invoke(obj);
    }

    @Override // io.reactivex.rxjava3.core.s
    public void subscribe(io.reactivex.rxjava3.core.r rVar) {
        final g5u0 g5u0Var = new g5u0((Context) this.b);
        final ps3 ps3Var = new ps3(rVar, 2);
        rVar.a(new io.reactivex.rxjava3.functions.e() { // from class: xsna.u660
            @Override // io.reactivex.rxjava3.functions.e
            public final void cancel() {
                g5u0.this.c.remove(ps3Var);
            }
        });
        g5u0Var.c.add(ps3Var);
        rVar.onNext(Boolean.valueOf(g5u0Var.b()));
    }
}
