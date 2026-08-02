package defpackage;

import defpackage.f1c0;
import defpackage.tje;
import kotlin.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class f1c0 {
    public final rgh a;
    public final hit b;
    public final zuj0 c;
    public final t1b0 d;
    public final i3y e = a.a(new sls() { // from class: ru.yandex.taxi.address.repository.a
        @Override // defpackage.sls
        public final Object invoke() {
            f1c0 f1c0Var = f1c0.this;
            return tje.h(f1c0Var.b.a, null, null, new PinV2ExperimentRepository$experimentDeferredLazy$2$1(f1c0Var, null), 3);
        }
    });

    public f1c0(rqo rqoVar, rgh rghVar, hit hitVar, zuj0 zuj0Var) {
        this.a = rghVar;
        this.b = hitVar;
        this.c = zuj0Var;
        this.d = ((jbh) rqoVar).e(new e1c0(null, false, 62));
    }

    public final Object a(ContinuationImpl continuationImpl) {
        return ((noh) this.e.getValue()).k(continuationImpl);
    }
}
