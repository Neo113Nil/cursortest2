package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: Publisher.kt */
@b6l(c = "com.vk.geo.impl.presentation.publish.Publisher", f = "Publisher.kt", l = {182}, m = "execute")
/* loaded from: classes2.dex */
public final class bfe0 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ efe0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bfe0(efe0 efe0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = efe0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return efe0.g(this.this$0, null, null, null, false, this);
    }
}
