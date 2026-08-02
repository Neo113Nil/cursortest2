package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: PublishSharedPrefsImpl.kt */
@b6l(c = "com.vk.video.ui.upload.impl.publish.data.sharedpref.PublishSharedPrefsImpl", f = "PublishSharedPrefsImpl.kt", l = {16}, m = "getAuthorOnboardingShowCount-gIAlu-s")
/* loaded from: classes7.dex */
public final class lee0 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ pee0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lee0(pee0 pee0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = pee0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = this.this$0.a(null, this);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : new Result(a);
    }
}
