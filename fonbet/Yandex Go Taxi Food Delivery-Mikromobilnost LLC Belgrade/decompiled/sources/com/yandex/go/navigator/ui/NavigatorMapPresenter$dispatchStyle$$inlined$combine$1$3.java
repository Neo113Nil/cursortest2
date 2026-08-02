package com.yandex.go.navigator.ui;

import defpackage.dd50;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.yc50;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lvpr;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Lkotlin/Array;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.ui.NavigatorMapPresenter$dispatchStyle$$inlined$combine$1$3", f = "NavigatorMapPresenter.kt", l = {MSException.ERROR_MORE_DATA}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
public final class NavigatorMapPresenter$dispatchStyle$$inlined$combine$1$3 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ dd50 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigatorMapPresenter$dispatchStyle$$inlined$combine$1$3(dd50 dd50Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = dd50Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        NavigatorMapPresenter$dispatchStyle$$inlined$combine$1$3 navigatorMapPresenter$dispatchStyle$$inlined$combine$1$3 = new NavigatorMapPresenter$dispatchStyle$$inlined$combine$1$3(this.this$0, (Continuation) obj3);
        navigatorMapPresenter$dispatchStyle$$inlined$combine$1$3.L$0 = (vpr) obj;
        navigatorMapPresenter$dispatchStyle$$inlined$combine$1$3.L$1 = (Object[]) obj2;
        return navigatorMapPresenter$dispatchStyle$$inlined$combine$1$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ((yc50) this.this$0.Dg()).refreshStyle();
        this.L$0 = null;
        this.L$1 = null;
        this.label = 1;
        return vprVar.emit(zy11Var, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
