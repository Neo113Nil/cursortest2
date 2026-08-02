package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: VkpnsNotifierMessagesReceiver.kt */
@b6l(c = "com.vk.push.pushsdk.notifier.VkpnsNotifierMessagesReceiver", f = "VkpnsNotifierMessagesReceiver.kt", l = {238}, m = "provideAnalyticsConfig")
/* loaded from: classes5.dex */
public final class r4w0 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ s4w0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4w0(s4w0 s4w0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = s4w0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return s4w0.i(this.this$0, this);
    }
}
