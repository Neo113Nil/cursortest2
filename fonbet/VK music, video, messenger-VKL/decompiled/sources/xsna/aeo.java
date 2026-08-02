package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: DraftsListInteractor.kt */
@b6l(c = "com.vk.draftslist.impl.domain.DraftsListInteractorImpl", f = "DraftsListInteractor.kt", l = {18}, m = "getDrafts")
/* loaded from: classes18.dex */
public final class aeo extends ContinuationImpl {
    int I$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ beo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeo(beo beoVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = beoVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(0, this);
    }
}
