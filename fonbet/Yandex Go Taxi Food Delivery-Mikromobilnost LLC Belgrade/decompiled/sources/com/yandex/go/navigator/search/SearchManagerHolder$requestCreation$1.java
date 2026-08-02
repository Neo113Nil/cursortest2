package com.yandex.go.navigator.search;

import com.yandex.mapkit.MapKit;
import com.yandex.mapkit.search.SearchFactory;
import com.yandex.mapkit.search.SearchManagerType;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/yandex/mapkit/MapKit;", "Lzy11;", "<anonymous>", "(Lcom/yandex/mapkit/MapKit;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.search.SearchManagerHolder$requestCreation$1", f = "SearchManagerHolder.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes7.dex */
final class SearchManagerHolder$requestCreation$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $onCreated;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchManagerHolder$requestCreation$1(tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.$onCreated = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SearchManagerHolder$requestCreation$1(this.$onCreated, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SearchManagerHolder$requestCreation$1 searchManagerHolder$requestCreation$1 = (SearchManagerHolder$requestCreation$1) create((MapKit) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        searchManagerHolder$requestCreation$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        this.$onCreated.invoke(SearchFactory.getInstance().createSearchManager(SearchManagerType.COMBINED));
        return zy11.a;
    }
}
