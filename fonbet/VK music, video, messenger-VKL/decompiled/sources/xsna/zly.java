package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: LastLaunchedPushServiceDataSource.kt */
@b6l(c = "com.vk.push.pushsdk.data.source.LastLaunchedPushServiceDataSource", f = "LastLaunchedPushServiceDataSource.kt", l = {31}, m = "getPushServiceTypeLaunchedLastTime")
/* loaded from: classes5.dex */
public final class zly extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ yly this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zly(yly ylyVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = ylyVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
