package com.yandex.go.taxi.order.infosharing.navigation;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.s5w0;
import defpackage.t5y0;
import defpackage.tse;
import defpackage.wls;
import defpackage.z30;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.activity.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.infosharing.navigation.TaxiOrderScreenshotSharingRouterImpl$onLaunch$1$onCloseAndShare$2", f = "TaxiOrderScreenshotSharingRouterImpl.kt", l = {53}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TaxiOrderScreenshotSharingRouterImpl$onLaunch$1$onCloseAndShare$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ t5y0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiOrderScreenshotSharingRouterImpl$onLaunch$1$onCloseAndShare$2(t5y0 t5y0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = t5y0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TaxiOrderScreenshotSharingRouterImpl$onLaunch$1$onCloseAndShare$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TaxiOrderScreenshotSharingRouterImpl$onLaunch$1$onCloseAndShare$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            g gVar = this.this$0.G;
            this.label = 1;
            obj = gVar.c(145, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        this.this$0.r(new s5w0(20, (z30) obj));
        return zy11.a;
    }
}
