package xsna;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.ok.android.api.core.ApiInvocationException;

/* compiled from: Select.kt */
@b6l(c = "kotlinx.coroutines.selects.SelectImplementation", f = "Select.kt", l = {ApiInvocationException.ErrorCodes.SESSION_REQUIRED, ApiInvocationException.ErrorCodes.GROUP_RESTRICTION}, m = "doSelectSuspend")
/* loaded from: classes8.dex */
public final class w8i0 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ v8i0<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8i0(v8i0 v8i0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = v8i0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        v8i0<Object> v8i0Var = this.this$0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = v8i0.g;
        return v8i0Var.h(this);
    }
}
