package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes4.dex */
public final class hzg implements Continuation {
    public zls a;
    public Continuation b;
    public Object c;

    public final CoroutineSingletons a(Continuation continuation) {
        this.b = continuation;
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    @Override // kotlin.coroutines.Continuation
    /* renamed from: getContext */
    public final fse get_context() {
        return EmptyCoroutineContext.a;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        this.b = null;
        this.c = obj;
    }
}
