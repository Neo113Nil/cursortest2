package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: NetworkConnectionCheckDataSource.kt */
@b6l(c = "com.vk.push.pushsdk.data.source.NetworkConnectionCheckDataSource", f = "NetworkConnectionCheckDataSource.kt", l = {28, 29}, m = "compareAndSetNetworkConnectionCheckByGoogle")
/* loaded from: classes5.dex */
public final class w260 extends ContinuationImpl {
    int I$0;
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ v260 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w260(v260 v260Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = v260Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(false, this);
    }
}
