package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: SmartCropRepositoryImpl.kt */
@b6l(c = "com.vk.video.ui.smartcrop.impl.data.SmartCropRepositoryImpl", f = "SmartCropRepositoryImpl.kt", l = {22}, m = "startCropVideo-0E7RQCE")
/* loaded from: classes7.dex */
public final class d5k0 extends ContinuationImpl {
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a5k0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5k0(a5k0 a5k0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = a5k0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object b = this.this$0.b(null, false, this);
        return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : new Result(b);
    }
}
