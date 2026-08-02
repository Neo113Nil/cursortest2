package defpackage;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class j2s {
    public final qr50 a;

    public j2s(qr50 qr50Var) {
        this.a = qr50Var;
    }

    public final Object a(ContinuationImpl continuationImpl) {
        Object a = this.a.a(continuationImpl);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : zy11.a;
    }
}
