package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: DeleteAllClientInfoUseCase.kt */
/* loaded from: classes5.dex */
public final class sul {
    public final jlc a;

    public sul(jlc jlcVar) {
        this.a = jlcVar;
    }

    public final Object a(String str, ContinuationImpl continuationImpl) {
        Object a = this.a.a(str, continuationImpl);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : s3q0.a;
    }
}
