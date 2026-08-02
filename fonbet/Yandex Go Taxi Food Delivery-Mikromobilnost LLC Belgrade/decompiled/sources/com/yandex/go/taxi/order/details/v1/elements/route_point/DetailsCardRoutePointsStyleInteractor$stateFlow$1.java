package com.yandex.go.taxi.order.details.v1.elements.route_point;

import com.yandex.go.taxi.order.details.v1.ui.DetailsCardListItem;
import defpackage.f7j;
import defpackage.g7j;
import defpackage.ibk0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lg7j;", ClidProvider.STATE, "", "isLoading", "<anonymous>", "(Lg7j;Z)Lg7j;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v1.elements.route_point.DetailsCardRoutePointsStyleInteractor$stateFlow$1", f = "DetailsCardRoutePointsStyleInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class DetailsCardRoutePointsStyleInteractor$stateFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        DetailsCardRoutePointsStyleInteractor$stateFlow$1 detailsCardRoutePointsStyleInteractor$stateFlow$1 = new DetailsCardRoutePointsStyleInteractor$stateFlow$1(3, (Continuation) obj3);
        detailsCardRoutePointsStyleInteractor$stateFlow$1.L$0 = (g7j) obj;
        detailsCardRoutePointsStyleInteractor$stateFlow$1.Z$0 = booleanValue;
        return detailsCardRoutePointsStyleInteractor$stateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        g7j g7jVar = (g7j) this.L$0;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        List<f7j> list = g7jVar.a;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (f7j f7jVar : list) {
            CharSequence charSequence = f7jVar.a;
            CharSequence charSequence2 = f7jVar.b;
            UiStateDrawableWrapper uiStateDrawableWrapper = f7jVar.c;
            DetailsCardListItem.a aVar = f7jVar.d;
            boolean z2 = f7jVar.f;
            ibk0 ibk0Var = f7jVar.g;
            f7jVar.getClass();
            arrayList.add(new f7j(ibk0Var, aVar, charSequence, charSequence2, uiStateDrawableWrapper, z, z2));
        }
        return new g7j(arrayList);
    }
}
