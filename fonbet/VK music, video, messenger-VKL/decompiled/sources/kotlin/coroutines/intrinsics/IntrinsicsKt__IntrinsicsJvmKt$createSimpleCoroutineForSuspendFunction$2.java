package kotlin.coroutines.intrinsics;

import kotlin.a;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.spj;

/* compiled from: IntrinsicsJvm.kt */
/* loaded from: classes8.dex */
public final class IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2 extends ContinuationImpl {
    public IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2(spj<Object> spjVar, d dVar) {
        super(spjVar, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.a(obj);
        return obj;
    }
}
