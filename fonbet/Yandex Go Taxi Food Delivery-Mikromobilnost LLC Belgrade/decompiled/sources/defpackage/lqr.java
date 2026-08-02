package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* loaded from: classes9.dex */
public final class lqr implements vpr {
    public final /* synthetic */ Ref$ObjectRef a;

    public lqr(Ref$ObjectRef ref$ObjectRef) {
        this.a = ref$ObjectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        this.a.element = obj;
        throw new AbortFlowException(this);
    }
}
