package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;
import xsna.spj;

/* compiled from: ContinuationImpl.kt */
/* loaded from: classes8.dex */
public abstract class RestrictedContinuationImpl extends BaseContinuationImpl {
    public RestrictedContinuationImpl(spj<Object> spjVar) {
        super(spjVar);
        if (spjVar != null && spjVar.getContext() != EmptyCoroutineContext.b) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // xsna.spj
    public final d getContext() {
        return EmptyCoroutineContext.b;
    }
}
