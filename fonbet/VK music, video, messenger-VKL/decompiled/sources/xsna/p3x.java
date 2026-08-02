package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: InsertPushTokenByProjectIdInteractor.kt */
@b6l(c = "com.vk.push.pushsdk.domain.interactor.InsertPushTokenByProjectIdInteractor", f = "InsertPushTokenByProjectIdInteractor.kt", l = {56, 58, 59, 68}, m = "getCallingPackageInfoId")
/* loaded from: classes5.dex */
public final class p3x extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ t3x this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3x(t3x t3xVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = t3xVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return t3x.a(this.this$0, null, this);
    }
}
