package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: VkMixSettingsInteractorImpl.kt */
@b6l(c = "com.vk.music.bottomsheets.settings.domain.interactor.VkMixSettingsInteractorImpl", f = "VkMixSettingsInteractorImpl.kt", l = {27}, m = "getSettings-0E7RQCE")
/* loaded from: classes3.dex */
public final class r4v0 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ s4v0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4v0(s4v0 s4v0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = s4v0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object b = this.this$0.b(null, null, this);
        return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : new Result(b);
    }
}
