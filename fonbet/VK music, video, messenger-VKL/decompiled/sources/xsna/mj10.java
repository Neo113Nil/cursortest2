package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: MasterHostElectionsInteractor.kt */
@b6l(c = "com.vk.push.pushsdk.masterhost.MasterHostElectionsInteractor", f = "MasterHostElectionsInteractor.kt", l = {127}, m = "tryToStartElectionService-IoAF18A")
/* loaded from: classes5.dex */
public final class mj10 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ nj10 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mj10(nj10 nj10Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = nj10Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object g = this.this$0.g(this);
        return g == CoroutineSingletons.COROUTINE_SUSPENDED ? g : new Result(g);
    }
}
