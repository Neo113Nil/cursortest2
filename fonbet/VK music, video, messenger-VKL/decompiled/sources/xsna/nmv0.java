package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: VkStepsManagerImpl.kt */
@b6l(c = "com.vk.superapp.vksteps.VkStepsManagerImpl", f = "VkStepsManagerImpl.kt", l = {153, 154}, m = "updateStepsFromGooglePlayServices")
/* loaded from: classes6.dex */
public final class nmv0 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ imv0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nmv0(imv0 imv0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = imv0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return imv0.m(this.this$0, null, null, this);
    }
}
