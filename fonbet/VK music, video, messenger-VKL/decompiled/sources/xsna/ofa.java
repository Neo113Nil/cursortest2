package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: CatalogSectionScreenRepository.kt */
@b6l(c = "com.vk.catalog.mvi.section.screen.impl.data.CatalogSectionScreenRepositoryImpl", f = "CatalogSectionScreenRepository.kt", l = {20}, m = "getSection-gIAlu-s")
/* loaded from: classes16.dex */
public final class ofa extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ qfa this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofa(qfa qfaVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = qfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = this.this$0.a(null, this);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : new Result(a);
    }
}
