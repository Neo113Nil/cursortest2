package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: MasterSelectionComponentImpl.kt */
@b6l(c = "com.vk.push.pushsdk.domain.component.MasterSelectionComponentImpl", f = "MasterSelectionComponentImpl.kt", l = {176, 185, 196, 200}, m = "handleNotificationAboutNewHost")
/* loaded from: classes5.dex */
public final class jk10 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ nk10 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk10(nk10 nk10Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = nk10Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return nk10.f(this.this$0, null, this);
    }
}
