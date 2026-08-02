package defpackage;

import com.yandex.messaging.internal.storage.folders.d;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes15.dex */
public final class h721 extends wx4 {
    public final long b;
    public final Set c;
    public final d d;

    public h721(long j, Set set, d dVar, el21 el21Var) {
        super(el21Var);
        this.b = j;
        this.c = set;
        this.d = dVar;
    }

    @Override // defpackage.gr
    public final boolean a(gr grVar) {
        if (grVar instanceof h721) {
            return this.b == ((h721) grVar).b;
        }
        return false;
    }

    @Override // defpackage.wx4
    public final Object b(cl21 cl21Var, Continuation continuation) {
        d dVar = this.d;
        dVar.getClass();
        return dVar.e(this.b, new exr(0, this.c), continuation);
    }
}
