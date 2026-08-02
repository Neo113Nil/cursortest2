package kotlin.coroutines.jvm.internal;

import xsna.fpf0;
import xsna.h0t;
import xsna.hpf0;
import xsna.spj;

/* compiled from: ContinuationImpl.kt */
/* loaded from: classes8.dex */
public abstract class RestrictedSuspendLambda extends RestrictedContinuationImpl implements h0t<Object> {
    private final int arity;

    public RestrictedSuspendLambda(int i, spj<Object> spjVar) {
        super(spjVar);
        this.arity = i;
    }

    @Override // xsna.h0t
    public final int getArity() {
        return this.arity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        fpf0.a.getClass();
        return hpf0.a(this);
    }
}
