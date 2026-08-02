package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ClearPollsCacheUseCase.kt */
/* loaded from: classes6.dex */
public final class eic extends mf6 {
    public final n5r0 a;

    public eic(n5r0 n5r0Var) {
        this.a = n5r0Var;
    }

    @Override // xsna.mf6
    public final Object a(Object obj, spj spjVar) {
        Object h = this.a.h((ContinuationImpl) spjVar);
        return h == CoroutineSingletons.COROUTINE_SUSPENDED ? h : s3q0.a;
    }
}
