package kotlin.coroutines.intrinsics;

import kotlin.a;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import xsna.spj;

/* compiled from: IntrinsicsJvm.kt */
/* loaded from: classes8.dex */
public final class IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1 extends RestrictedContinuationImpl {
    public IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1(spj<Object> spjVar) {
        super(spjVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.a(obj);
        return obj;
    }
}
