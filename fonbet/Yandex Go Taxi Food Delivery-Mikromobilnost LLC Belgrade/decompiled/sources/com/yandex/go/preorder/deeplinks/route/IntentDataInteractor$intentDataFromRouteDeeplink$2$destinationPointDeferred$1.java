package com.yandex.go.preorder.deeplinks.route;

import com.yandex.go.address.models.FavoriteAddress;
import defpackage.c2l0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzzs;", "<anonymous>", "(Ltse;)Lzzs;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.preorder.deeplinks.route.IntentDataInteractor$intentDataFromRouteDeeplink$2$destinationPointDeferred$1", f = "IntentDataInteractor.kt", l = {64}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class IntentDataInteractor$intentDataFromRouteDeeplink$2$destinationPointDeferred$1 extends SuspendLambda implements wls {
    final /* synthetic */ c2l0 $deeplink;
    final /* synthetic */ List<FavoriteAddress> $favoriteAddresses;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntentDataInteractor$intentDataFromRouteDeeplink$2$destinationPointDeferred$1(b bVar, c2l0 c2l0Var, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$deeplink = c2l0Var;
        this.$favoriteAddresses = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new IntentDataInteractor$intentDataFromRouteDeeplink$2$destinationPointDeferred$1(this.this$0, this.$deeplink, this.$favoriteAddresses, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((IntentDataInteractor$intentDataFromRouteDeeplink$2$destinationPointDeferred$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        b bVar = this.this$0;
        c2l0 c2l0Var = this.$deeplink;
        List<FavoriteAddress> list = this.$favoriteAddresses;
        this.label = 1;
        Object a = b.a(bVar, c2l0Var, list, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
