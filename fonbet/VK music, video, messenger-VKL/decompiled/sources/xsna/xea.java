package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: CatalogSectionRepositoryImpl.kt */
@b6l(c = "com.vk.catalog.mvi.section.impl.data.CatalogSectionRepositoryImpl", f = "CatalogSectionRepositoryImpl.kt", l = {146}, m = "reorderBlockItems-0E7RQCE")
/* loaded from: classes16.dex */
public final class xea extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ zea this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xea(zea zeaVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = zeaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object g = this.this$0.g(null, null, this);
        return g == CoroutineSingletons.COROUTINE_SUSPENDED ? g : new Result(g);
    }
}
