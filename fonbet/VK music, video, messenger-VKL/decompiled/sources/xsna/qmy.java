package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: LaunchAppDataSource.kt */
@b6l(c = "com.vk.push.pushsdk.storage.LaunchAppDataSource", f = "LaunchAppDataSource.kt", l = {28}, m = "isFirstAppLaunch")
/* loaded from: classes.dex */
public final class qmy extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ pmy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qmy(pmy pmyVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = pmyVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
