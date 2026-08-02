package defpackage;

import com.yandex.messaging.internal.storage.folders.d;
import kotlin.coroutines.Continuation;

/* loaded from: classes15.dex */
public final class irh extends wx4 {
    public final long b;
    public final String c;
    public final d d;

    public irh(long j, String str, d dVar, el21 el21Var) {
        super(el21Var);
        this.b = j;
        this.c = str;
        this.d = dVar;
    }

    @Override // defpackage.gr
    public final boolean a(gr grVar) {
        if (!(grVar instanceof irh)) {
            return false;
        }
        irh irhVar = (irh) grVar;
        return irhVar.b == this.b && jl40.l(irhVar.c, this.c);
    }

    @Override // defpackage.wx4
    public final Object b(cl21 cl21Var, Continuation continuation) {
        d dVar = this.d;
        dVar.getClass();
        return dVar.e(this.b, new vsq(this.c, 4), continuation);
    }
}
