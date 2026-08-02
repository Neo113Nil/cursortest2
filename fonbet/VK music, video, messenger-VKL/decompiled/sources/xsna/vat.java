package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: GamesCatalogDetailPagingInteractor.kt */
@b6l(c = "com.vk.games.domain.interactors.GamesCatalogDetailPagingInteractor", f = "GamesCatalogDetailPagingInteractor.kt", l = {16, 22, 28, 29}, m = "loadNext")
/* loaded from: classes17.dex */
public final class vat extends ContinuationImpl {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ wat this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vat(wat watVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = watVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, 0, this);
    }
}
