package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: MediaPickerRepositoryImpl.kt */
@b6l(c = "com.vk.mediapicker.impl.data.MediaPickerRepositoryImpl", f = "MediaPickerRepositoryImpl.kt", l = {53}, m = "loadMedia-yxL6bBk")
/* loaded from: classes3.dex */
public final class ku10 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ nu10 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ku10(nu10 nu10Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = nu10Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = this.this$0.a(0, 0, 0, 0, this);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : new Result(a);
    }
}
