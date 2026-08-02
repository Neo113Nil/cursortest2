package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: GamesCatalogPagingInteractor.kt */
@b6l(c = "com.vk.games.domain.interactors.GamesCatalogPagingInteractor", f = "GamesCatalogPagingInteractor.kt", l = {18}, m = "loadNext")
/* loaded from: classes17.dex */
public final class cdt extends ContinuationImpl {
    int I$0;
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ddt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdt(ddt ddtVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = ddtVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, 0, false, this);
    }
}
