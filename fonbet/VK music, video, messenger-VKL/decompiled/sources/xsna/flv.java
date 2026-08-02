package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: HuaweiHealthDataSource.kt */
@b6l(c = "com.vk.superapp.vksteps.data.datasource.HuaweiHealthDataSource", f = "HuaweiHealthDataSource.kt", l = {63, 64}, m = "readData")
/* loaded from: classes6.dex */
public final class flv extends ContinuationImpl {
    int I$0;
    int I$1;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ glv this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public flv(glv glvVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = glvVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(null, 0L, 0L, null, this);
    }
}
