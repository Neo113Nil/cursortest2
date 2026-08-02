package androidx.compose.animation.core;

import defpackage.bvf0;
import defpackage.gtq0;
import defpackage.tls;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;

/* loaded from: classes10.dex */
public final class d {
    public final AtomicReference a = new AtomicReference(null);
    public final kotlinx.coroutines.sync.a b = gtq0.a();

    public static Object a(d dVar, tls tlsVar, Continuation continuation) {
        MutatePriority mutatePriority = MutatePriority.Default;
        dVar.getClass();
        return bvf0.n(new MutatorMutex$mutate$2(mutatePriority, dVar, tlsVar, null), continuation);
    }
}
