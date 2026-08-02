package xsna;

import kotlin.coroutines.CombinedContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.c;
import kotlin.coroutines.d;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class ivj implements wzs {
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        d.b bVar = (d.b) obj2;
        kotlin.coroutines.d minusKey = ((kotlin.coroutines.d) obj).minusKey(bVar.getKey());
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.b;
        if (minusKey == emptyCoroutineContext) {
            return bVar;
        }
        c.a aVar = c.a.b;
        kotlin.coroutines.c cVar = (kotlin.coroutines.c) minusKey.get(aVar);
        if (cVar == null) {
            return new CombinedContext(minusKey, bVar);
        }
        kotlin.coroutines.d minusKey2 = minusKey.minusKey(aVar);
        return minusKey2 == emptyCoroutineContext ? new CombinedContext(bVar, cVar) : new CombinedContext(new CombinedContext(minusKey2, bVar), cVar);
    }
}
