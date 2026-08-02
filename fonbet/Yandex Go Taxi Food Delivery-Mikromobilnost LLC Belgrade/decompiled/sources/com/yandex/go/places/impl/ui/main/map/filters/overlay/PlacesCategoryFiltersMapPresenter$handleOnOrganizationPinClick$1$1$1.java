package com.yandex.go.places.impl.ui.main.map.filters.overlay;

import com.yandex.go.places.map.data.repositories.i;
import defpackage.in00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lin00;", "selectableItem", "Lzy11;", "<anonymous>", "(Lin00;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.ui.main.map.filters.overlay.PlacesCategoryFiltersMapPresenter$handleOnOrganizationPinClick$1$1$1", f = "PlacesCategoryFiltersMapPresenter.kt", l = {152}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PlacesCategoryFiltersMapPresenter$handleOnOrganizationPinClick$1$1$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacesCategoryFiltersMapPresenter$handleOnOrganizationPinClick$1$1$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PlacesCategoryFiltersMapPresenter$handleOnOrganizationPinClick$1$1$1 placesCategoryFiltersMapPresenter$handleOnOrganizationPinClick$1$1$1 = new PlacesCategoryFiltersMapPresenter$handleOnOrganizationPinClick$1$1$1(this.this$0, continuation);
        placesCategoryFiltersMapPresenter$handleOnOrganizationPinClick$1$1$1.L$0 = obj;
        return placesCategoryFiltersMapPresenter$handleOnOrganizationPinClick$1$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlacesCategoryFiltersMapPresenter$handleOnOrganizationPinClick$1$1$1) create((in00) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in00 in00Var = (in00) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            i iVar = this.this$0.z;
            this.L$0 = null;
            this.label = 1;
            if (iVar.w(in00Var, false, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
