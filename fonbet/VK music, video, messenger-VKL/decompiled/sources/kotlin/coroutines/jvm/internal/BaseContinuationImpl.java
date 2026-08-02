package kotlin.coroutines.jvm.internal;

import java.io.Serializable;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.awj;
import xsna.kn4;
import xsna.s3q0;
import xsna.spj;

/* compiled from: ContinuationImpl.kt */
/* loaded from: classes11.dex */
public abstract class BaseContinuationImpl implements spj<Object>, awj, Serializable {
    private final spj<Object> completion;

    public BaseContinuationImpl(spj<Object> spjVar) {
        this.completion = spjVar;
    }

    public spj<s3q0> create(spj<?> spjVar) {
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // xsna.awj
    public awj getCallerFrame() {
        spj<Object> spjVar = this.completion;
        if (spjVar instanceof awj) {
            return (awj) spjVar;
        }
        return null;
    }

    public final spj<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        return kn4.j(this);
    }

    public abstract Object invokeSuspend(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.spj
    public final void resumeWith(Object obj) {
        spj spjVar = this;
        while (true) {
            BaseContinuationImpl baseContinuationImpl = (BaseContinuationImpl) spjVar;
            spj spjVar2 = baseContinuationImpl.completion;
            try {
                obj = baseContinuationImpl.invokeSuspend(obj);
                if (obj == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return;
                }
            } catch (Throwable th) {
                obj = new Result.Failure(th);
            }
            baseContinuationImpl.releaseIntercepted();
            if (!(spjVar2 instanceof BaseContinuationImpl)) {
                spjVar2.resumeWith(obj);
                return;
            }
            spjVar = spjVar2;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public spj<s3q0> create(Object obj, spj<?> spjVar) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
