package defpackage;

import com.yandex.messaging.internal.storage.folders.d;
import kotlin.coroutines.Continuation;

/* loaded from: classes15.dex */
public final class b721 extends wx4 {
    public final jjf b;
    public final d c;

    public b721(jjf jjfVar, d dVar, el21 el21Var) {
        super(el21Var);
        this.b = jjfVar;
        this.c = dVar;
    }

    @Override // defpackage.gr
    public final boolean a(gr grVar) {
        if (grVar instanceof b721) {
            return this.b.equals(((b721) grVar).b);
        }
        return false;
    }

    @Override // defpackage.wx4
    public final Object b(cl21 cl21Var, Continuation continuation) {
        d dVar = this.c;
        dVar.getClass();
        jjf jjfVar = this.b;
        return dVar.e(jjfVar.b, new fxr(jjfVar, 0), continuation);
    }
}
