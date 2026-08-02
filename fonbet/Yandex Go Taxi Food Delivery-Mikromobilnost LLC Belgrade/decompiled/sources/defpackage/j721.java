package defpackage;

import com.yandex.messaging.domain.actions.a;
import com.yandex.messaging.domain.k;
import com.yandex.messaging.internal.storage.folders.d;
import kotlin.coroutines.Continuation;

/* loaded from: classes15.dex */
public final class j721 extends k {
    public final a b;
    public final d c;
    public final w5t d;
    public final el21 e;
    public final xw50 f;
    public final zwr g;

    public j721(a aVar, d dVar, w5t w5tVar, el21 el21Var, xw50 xw50Var, zwr zwrVar, kse kseVar) {
        super(kseVar.e);
        this.b = aVar;
        this.c = dVar;
        this.d = w5tVar;
        this.e = el21Var;
        this.f = xw50Var;
        this.g = zwrVar;
    }

    @Override // com.yandex.messaging.domain.k
    public final Object b(Object obj, Continuation continuation) {
        i721 i721Var = (i721) obj;
        if (!this.f.a()) {
            return new iyj0(lwr.a);
        }
        this.g.a.reportEvent("edit_main_folder");
        long c = this.d.b.c();
        i721Var.getClass();
        return this.b.a(new h721(c, null, this.c, this.e), continuation);
    }
}
