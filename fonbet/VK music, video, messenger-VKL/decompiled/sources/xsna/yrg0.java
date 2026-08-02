package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: DataStoreImpl.kt */
@b6l(c = "androidx.datastore.core.RunOnce", f = "DataStoreImpl.kt", l = {544, 497}, m = "runIfNeeded")
/* loaded from: classes.dex */
public final class yrg0 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ zrg0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yrg0(zrg0 zrg0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = zrg0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(this);
    }
}
