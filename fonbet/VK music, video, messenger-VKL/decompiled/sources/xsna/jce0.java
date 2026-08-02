package xsna;

import com.mbridge.msdk.out.MBSupportMuteAdType;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: PublishInteractor.kt */
@b6l(c = "com.vk.video.ui.upload.impl.publish.domain.interactor.PublishInteractorImpl", f = "PublishInteractor.kt", l = {MBSupportMuteAdType.REWARD_VIDEO}, m = "getAvailableVideoAuthorList-IoAF18A")
/* loaded from: classes7.dex */
public final class jce0 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ uce0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jce0(uce0 uce0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = uce0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = this.this$0.a(this);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : new Result(a);
    }
}
