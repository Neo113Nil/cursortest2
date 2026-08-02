package com.yandex.go.taxi.order.domain.interactors;

import defpackage.bms;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "isEnabled", "isSearchState", "shouldHideProgress"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.order.domain.interactors.SearchProgressInteractor$isProgressVisible$1", f = "SearchProgressInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SearchProgressInteractor$isProgressVisible$1 extends SuspendLambda implements bms {
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    /* synthetic */ boolean Z$2;
    int label;

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        boolean booleanValue3 = ((Boolean) obj3).booleanValue();
        SearchProgressInteractor$isProgressVisible$1 searchProgressInteractor$isProgressVisible$1 = new SearchProgressInteractor$isProgressVisible$1(4, (Continuation) obj4);
        searchProgressInteractor$isProgressVisible$1.Z$0 = booleanValue;
        searchProgressInteractor$isProgressVisible$1.Z$1 = booleanValue2;
        searchProgressInteractor$isProgressVisible$1.Z$2 = booleanValue3;
        return searchProgressInteractor$isProgressVisible$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        boolean z2 = this.Z$1;
        boolean z3 = this.Z$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Boolean.valueOf(!z3 && z && z2);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
