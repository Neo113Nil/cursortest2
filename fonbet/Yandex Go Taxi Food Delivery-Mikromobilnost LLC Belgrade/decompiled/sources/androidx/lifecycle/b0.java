package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import defpackage.bvf0;
import defpackage.ny61;
import defpackage.pey;
import defpackage.wls;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public abstract class b0 {
    public static final Object a(pey peyVar, Lifecycle.State state, wls wlsVar, Continuation continuation) {
        Object b = b(peyVar.getLifecycle(), state, wlsVar, continuation);
        return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : zy11.a;
    }

    public static final Object b(Lifecycle lifecycle, Lifecycle.State state, wls wlsVar, Continuation continuation) {
        Object n;
        if (state != Lifecycle.State.INITIALIZED) {
            return (lifecycle.b() != Lifecycle.State.DESTROYED && (n = bvf0.n(new RepeatOnLifecycleKt$repeatOnLifecycle$3(lifecycle, state, wlsVar, null), continuation)) == CoroutineSingletons.COROUTINE_SUSPENDED) ? n : zy11.a;
        }
        ny61.g("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
        return null;
    }
}
