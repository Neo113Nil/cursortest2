package com.yandex.go.address.search.common.presenter;

import com.yandex.go.pickup_from_photo.api.PickupFromPhotoEntryPointAnalytics$EntryPointScreen;
import com.yandex.go.pickup_from_photo.api.PickupFromPhotoPayload$Origin;
import defpackage.cob0;
import defpackage.gtq0;
import defpackage.h4v0;
import defpackage.hxx;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pep0;
import defpackage.tse;
import defpackage.umb0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.address.search.common.presenter.SuggestionsPresenter$onTrailAction$1", f = "SuggestionsPresenter.kt", l = {505}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class SuggestionsPresenter$onTrailAction$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestionsPresenter$onTrailAction$1(i iVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuggestionsPresenter$onTrailAction$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuggestionsPresenter$onTrailAction$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            h4v0 h4v0Var = this.this$0.Z;
            this.label = 1;
            ((umb0) h4v0Var.d).b(PickupFromPhotoEntryPointAnalytics$EntryPointScreen.SUGGEST);
            com.yandex.go.pickup_from_photo.navigation.c cVar = (com.yandex.go.pickup_from_photo.navigation.c) h4v0Var.c.get();
            ((pep0) h4v0Var.a).f(cVar, new cob0(PickupFromPhotoPayload$Origin.SUGGEST, true), hxx.a);
            if (com.yandex.go.navigation.base.a.d(gtq0.b(cVar), this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        r0 r0Var = this.this$0.g0;
        Boolean bool = Boolean.FALSE;
        r0Var.getClass();
        r0Var.m(null, bool);
        return zy11.a;
    }
}
