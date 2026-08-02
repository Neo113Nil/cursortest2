package com.yandex.go.taxi.order.search.overlay.ordinary.domain;

import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.taxi.order.state.search.SearchState;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "", ClidProvider.STATE, "Lcom/yandex/go/taxi/order/state/search/SearchState;", "currentScreen", "Lcom/yandex/go/navigation/screen/api/Screen;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.order.search.overlay.ordinary.domain.OrdinarySearchInteractor$collectIsLongSearch$2", f = "OrdinarySearchInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrdinarySearchInteractor$collectIsLongSearch$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        OrdinarySearchInteractor$collectIsLongSearch$2 ordinarySearchInteractor$collectIsLongSearch$2 = new OrdinarySearchInteractor$collectIsLongSearch$2(3, (Continuation) obj3);
        ordinarySearchInteractor$collectIsLongSearch$2.L$0 = (SearchState) obj;
        ordinarySearchInteractor$collectIsLongSearch$2.L$1 = (Screen) obj2;
        return ordinarySearchInteractor$collectIsLongSearch$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SearchState searchState = (SearchState) this.L$0;
        Screen screen = (Screen) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Boolean.valueOf(searchState.t && screen == Screen.ORDER_DETAILS);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
