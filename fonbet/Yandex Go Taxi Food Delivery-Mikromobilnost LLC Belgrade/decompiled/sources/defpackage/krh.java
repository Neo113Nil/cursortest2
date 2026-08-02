package defpackage;

import com.yandex.messaging.domain.actions.a;
import com.yandex.messaging.domain.k;
import com.yandex.messaging.internal.storage.folders.d;
import kotlin.coroutines.Continuation;

/* loaded from: classes15.dex */
public final class krh extends k {
    public final a b;
    public final d c;
    public final el21 d;
    public final zwr e;

    public krh(a aVar, d dVar, el21 el21Var, zwr zwrVar, kse kseVar) {
        super(kseVar.e);
        this.b = aVar;
        this.c = dVar;
        this.d = el21Var;
        this.e = zwrVar;
    }

    @Override // com.yandex.messaging.domain.k
    public final Object b(Object obj, Continuation continuation) {
        ((jrh) obj).getClass();
        this.e.a.c("delete_folder", "id", null);
        return this.b.a(new irh(0L, null, this.c, this.d), continuation);
    }
}
