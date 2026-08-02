package com.yandex.go.chargers.offer.data.mappers;

import defpackage.cy9;
import defpackage.laa;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.cprocsp.NGate.tools.Constants;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Llaa;", "<anonymous>", "(Ltse;)Llaa;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.offer.data.mappers.ChargersOfferUiStateMapper$map$5", f = "ChargersOfferUiStateMapper.kt", l = {Constants.VPN_TRAFFIC}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersOfferUiStateMapper$map$5 extends SuspendLambda implements wls {
    final /* synthetic */ Throwable $throwable;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersOfferUiStateMapper$map$5(b bVar, Throwable th, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$throwable = th;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersOfferUiStateMapper$map$5(this.this$0, this.$throwable, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersOfferUiStateMapper$map$5) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.chargers.error.data.a aVar = this.this$0.l;
            Throwable th = this.$throwable;
            this.label = 1;
            obj = aVar.a(th, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return new laa((cy9) obj);
    }
}
