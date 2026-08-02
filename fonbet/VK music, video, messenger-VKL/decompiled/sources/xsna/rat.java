package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: GamesCatalogDetailFeature.kt */
@b6l(c = "com.vk.games.presentation.detail.mvi.GamesCatalogDetailFeature", f = "GamesCatalogDetailFeature.kt", l = {134}, m = "loadDetail$loadNext")
/* loaded from: classes17.dex */
public final class rat extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;

    public rat() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return tat.U(null, 0, false, this);
    }
}
