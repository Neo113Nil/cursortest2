package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: OkioStorage.kt */
@b6l(c = "androidx.datastore.core.okio.OkioReadScope", f = "OkioStorage.kt", l = {180, 187}, m = "readData$suspendImpl")
/* loaded from: classes.dex */
public final class ty70<T> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ uy70<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ty70(uy70 uy70Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = uy70Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return uy70.f(this.this$0, this);
    }
}
