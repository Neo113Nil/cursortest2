package defpackage;

import defpackage.ny61;
import defpackage.wls;
import defpackage.ym11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;

/* loaded from: classes9.dex */
public class dvw {
    /* JADX WARN: Multi-variable type inference failed */
    public static Continuation a(final wls wlsVar, final Continuation continuation, final Continuation continuation2) {
        if (wlsVar instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) wlsVar).create(continuation, continuation2);
        }
        final fse fseVar = continuation2.get_context();
        return fseVar == EmptyCoroutineContext.a ? new RestrictedContinuationImpl(continuation2) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$3
            private int label;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i = this.label;
                if (i == 0) {
                    this.label = 1;
                    b.b(obj);
                    wls wlsVar2 = wls.this;
                    ym11.e(2, wlsVar2);
                    return wlsVar2.invoke(continuation, this);
                }
                if (i != 1) {
                    ny61.r("This coroutine had already completed");
                    return null;
                }
                this.label = 2;
                b.b(obj);
                return obj;
            }
        } : new ContinuationImpl(continuation2, fseVar) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4
            private int label;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i = this.label;
                if (i == 0) {
                    this.label = 1;
                    b.b(obj);
                    wls wlsVar2 = wlsVar;
                    ym11.e(2, wlsVar2);
                    return wlsVar2.invoke(continuation, this);
                }
                if (i != 1) {
                    ny61.r("This coroutine had already completed");
                    return null;
                }
                this.label = 2;
                b.b(obj);
                return obj;
            }
        };
    }

    public static Continuation b(Continuation continuation) {
        Continuation<Object> intercepted;
        ContinuationImpl continuationImpl = continuation instanceof ContinuationImpl ? (ContinuationImpl) continuation : null;
        return (continuationImpl == null || (intercepted = continuationImpl.intercepted()) == null) ? continuation : intercepted;
    }
}
