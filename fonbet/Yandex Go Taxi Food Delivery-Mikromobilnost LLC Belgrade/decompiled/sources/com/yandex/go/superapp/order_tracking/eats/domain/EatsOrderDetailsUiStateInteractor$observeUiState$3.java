package com.yandex.go.superapp.order_tracking.eats.domain;

import defpackage.avj0;
import defpackage.hn70;
import defpackage.kyh0;
import defpackage.m301;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.yl70;
import defpackage.yn70;
import defpackage.zls;
import defpackage.zn70;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lzn70;", ClidProvider.STATE, "", "badgeText", "<anonymous>", "(Lzn70;Ljava/lang/String;)Lzn70;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.order_tracking.eats.domain.EatsOrderDetailsUiStateInteractor$observeUiState$3", f = "EatsOrderDetailsUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class EatsOrderDetailsUiStateInteractor$observeUiState$3 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EatsOrderDetailsUiStateInteractor$observeUiState$3(c cVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        EatsOrderDetailsUiStateInteractor$observeUiState$3 eatsOrderDetailsUiStateInteractor$observeUiState$3 = new EatsOrderDetailsUiStateInteractor$observeUiState$3(this.this$0, (Continuation) obj3);
        eatsOrderDetailsUiStateInteractor$observeUiState$3.L$0 = (zn70) obj;
        eatsOrderDetailsUiStateInteractor$observeUiState$3.L$1 = (String) obj2;
        return eatsOrderDetailsUiStateInteractor$observeUiState$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zn70 zn70Var = (zn70) this.L$0;
        String str = (String) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (!(zn70Var instanceof yn70)) {
            return zn70Var;
        }
        yn70 yn70Var = (yn70) zn70Var;
        hn70 hn70Var = yn70Var.a;
        return new yn70(hn70Var != null ? hn70.a(hn70Var, null, null, null, null, null, 2097135) : null, yn70Var.b, yn70Var.c, new yl70(new m301(((avj0) this.this$0.d).h(kyh0.order_options_details), null, 14), 1), yn70Var.e, yn70Var.f, yn70Var.g, yn70Var.h, str);
    }
}
