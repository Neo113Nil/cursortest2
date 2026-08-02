package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: MediaPickerInteractorImpl.kt */
@b6l(c = "com.vk.mediapicker.impl.domain.MediaPickerInteractorImpl", f = "MediaPickerInteractorImpl.kt", l = {23}, m = "loadMedia-hUnOzRk")
/* loaded from: classes3.dex */
public final class au10 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ bu10 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au10(bu10 bu10Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bu10Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = this.this$0.a(0, 0, 0, 0, null, this);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : new Result(a);
    }
}
