package com.yandex.go.address.search.common.presenter;

import com.yandex.go.pickup_from_photo.api.PickupFromPhotoEntryPointAnalytics$EntryPointScreen;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.umb0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "<unused var>", "Lzy11;", "<anonymous>", "(ZZ)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.address.search.common.presenter.SuggestionsPresenter$onResume$3", f = "SuggestionsPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class SuggestionsPresenter$onResume$3 extends SuspendLambda implements zls {
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestionsPresenter$onResume$3(i iVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = iVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Boolean) obj).booleanValue();
        ((Boolean) obj2).booleanValue();
        SuggestionsPresenter$onResume$3 suggestionsPresenter$onResume$3 = new SuggestionsPresenter$onResume$3(this.this$0, (Continuation) obj3);
        zy11 zy11Var = zy11.a;
        suggestionsPresenter$onResume$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ((umb0) this.this$0.Z.d).a(PickupFromPhotoEntryPointAnalytics$EntryPointScreen.SUGGEST);
        return zy11.a;
    }
}
