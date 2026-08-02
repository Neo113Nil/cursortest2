package com.yandex.go.taxi.order.details.v1.elements.destination;

import com.yandex.go.taxi.order.details.v1.ui.DetailsCardListItem;
import defpackage.ibk0;
import defpackage.mvg;
import defpackage.n5j;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ln5j;", ClidProvider.STATE, "", "isLoading", "<anonymous>", "(Ln5j;Z)Ln5j;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v1.elements.destination.DetailsCardDestinationStyleInteractor$stateFlow$1", f = "DetailsCardDestinationStyleInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class DetailsCardDestinationStyleInteractor$stateFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        DetailsCardDestinationStyleInteractor$stateFlow$1 detailsCardDestinationStyleInteractor$stateFlow$1 = new DetailsCardDestinationStyleInteractor$stateFlow$1(3, (Continuation) obj3);
        detailsCardDestinationStyleInteractor$stateFlow$1.L$0 = (n5j) obj;
        detailsCardDestinationStyleInteractor$stateFlow$1.Z$0 = booleanValue;
        return detailsCardDestinationStyleInteractor$stateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        n5j n5jVar = (n5j) this.L$0;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        CharSequence charSequence = n5jVar.a;
        CharSequence charSequence2 = n5jVar.b;
        UiStateDrawableWrapper uiStateDrawableWrapper = n5jVar.c;
        DetailsCardListItem.a aVar = n5jVar.d;
        boolean z2 = n5jVar.e;
        boolean z3 = n5jVar.g;
        ibk0 ibk0Var = n5jVar.h;
        n5jVar.getClass();
        return new n5j(charSequence, charSequence2, uiStateDrawableWrapper, aVar, z2, z, z3, ibk0Var);
    }
}
