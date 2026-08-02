package com.yandex.go.places.impl.ui.main.map.filters;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.places.impl.ui.main.map.filters.PlacesCategoryFiltersPresenter$subscribeToFavoritesUpdates$$inlined$safeCollectIn$1$2", f = "PlacesCategoryFiltersPresenter.kt", l = {HProv.PP_BIO_STATISTICA_LEN}, m = "emit", v = 2)
/* loaded from: classes13.dex */
public final class PlacesCategoryFiltersPresenter$subscribeToFavoritesUpdates$$inlined$safeCollectIn$1$2$1 extends ContinuationImpl {
    float F$0;
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacesCategoryFiltersPresenter$subscribeToFavoritesUpdates$$inlined$safeCollectIn$1$2$1(d dVar, Continuation continuation) {
        super(continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
