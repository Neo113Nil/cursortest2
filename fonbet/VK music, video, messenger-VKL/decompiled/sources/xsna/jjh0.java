package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: SdkEnabledDataStore.kt */
@b6l(c = "com.vk.push.pushsdk.storage.SdkEnabledDataStore", f = "SdkEnabledDataStore.kt", l = {27}, m = "isSdkEnabledLastValue")
/* loaded from: classes.dex */
public final class jjh0 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ijh0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jjh0(ijh0 ijh0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = ijh0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
