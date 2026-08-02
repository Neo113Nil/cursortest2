package com.yandex.go.superapp_favorites.flex.jason_state;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.superapp_favorites.flex.jason_state.SuperappFavoritesScreenStateInteractor", f = "SuperappFavoritesScreenStateInteractor.kt", l = {22}, m = "setErrorScreenState", v = 2)
/* loaded from: classes14.dex */
final class SuperappFavoritesScreenStateInteractor$setErrorScreenState$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperappFavoritesScreenStateInteractor$setErrorScreenState$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
