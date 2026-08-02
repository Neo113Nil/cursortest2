package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: CoverChooseFileStorageImpl.kt */
@b6l(c = "com.vk.video.ui.upload.impl.coverchoose.data.network.CoverChooseFileStorageImpl", f = "CoverChooseFileStorageImpl.kt", l = {24}, m = "saveCoverToTmpFile-gIAlu-s")
/* loaded from: classes7.dex */
public final class q0k extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ s0k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0k(s0k s0kVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = s0kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object b = this.this$0.b(null, this);
        return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : new Result(b);
    }
}
