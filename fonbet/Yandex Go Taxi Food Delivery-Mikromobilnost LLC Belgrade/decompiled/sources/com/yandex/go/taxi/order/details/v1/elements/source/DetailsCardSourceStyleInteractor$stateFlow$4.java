package com.yandex.go.taxi.order.details.v1.elements.source;

import com.yandex.go.taxi.order.details.v1.ui.DetailsCardListItem;
import defpackage.ibk0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o7j;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo7j;", "sourceStyleState", "", "isLoading", "<anonymous>", "(Lo7j;Z)Lo7j;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v1.elements.source.DetailsCardSourceStyleInteractor$stateFlow$4", f = "DetailsCardSourceStyleInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class DetailsCardSourceStyleInteractor$stateFlow$4 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        DetailsCardSourceStyleInteractor$stateFlow$4 detailsCardSourceStyleInteractor$stateFlow$4 = new DetailsCardSourceStyleInteractor$stateFlow$4(3, (Continuation) obj3);
        detailsCardSourceStyleInteractor$stateFlow$4.L$0 = (o7j) obj;
        detailsCardSourceStyleInteractor$stateFlow$4.Z$0 = booleanValue;
        return detailsCardSourceStyleInteractor$stateFlow$4.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        o7j o7jVar = (o7j) this.L$0;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        CharSequence charSequence = o7jVar.a;
        CharSequence charSequence2 = o7jVar.b;
        UiStateDrawableWrapper uiStateDrawableWrapper = o7jVar.c;
        DetailsCardListItem.a aVar = o7jVar.d;
        ibk0 ibk0Var = o7jVar.e;
        boolean z2 = o7jVar.f;
        o7j o7jVar2 = o7j.h;
        o7jVar.getClass();
        return new o7j(ibk0Var, aVar, charSequence, charSequence2, uiStateDrawableWrapper, z2, z);
    }
}
