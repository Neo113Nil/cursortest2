package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: CatalogSectionRepositoryImpl.kt */
@b6l(c = "com.vk.catalog.mvi.section.impl.data.CatalogSectionRepositoryImpl", f = "CatalogSectionRepositoryImpl.kt", l = {174}, m = "reorderAlbumItems-yxL6bBk")
/* loaded from: classes16.dex */
public final class vea extends ContinuationImpl {
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ zea this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vea(zea zeaVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = zeaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object f = this.this$0.f(0L, 0, null, null, this);
        return f == CoroutineSingletons.COROUTINE_SUSPENDED ? f : new Result(f);
    }
}
