package com.yandex.go.chargers.order.active;

import com.yandex.go.analytics.realtime.event.RealtimeEventType;
import defpackage.e3n;
import defpackage.fei0;
import defpackage.gei0;
import defpackage.hei0;
import defpackage.mvg;
import defpackage.nna;
import defpackage.ny61;
import defpackage.o430;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.order.active.ChargersActiveOrderAdapterKt$bindPromoShown$1", f = "ChargersActiveOrderAdapter.kt", l = {HProv.ALG_SID_GR3410_12_256}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersActiveOrderAdapterKt$bindPromoShown$1 extends SuspendLambda implements wls {
    final /* synthetic */ Map<String, Object> $payload;
    final /* synthetic */ nna $promoAnalytics;
    final /* synthetic */ gei0 $viewConfigProvider;
    long J$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersActiveOrderAdapterKt$bindPromoShown$1(gei0 gei0Var, nna nnaVar, Map map, Continuation continuation) {
        super(2, continuation);
        this.$viewConfigProvider = gei0Var;
        this.$promoAnalytics = nnaVar;
        this.$payload = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersActiveOrderAdapterKt$bindPromoShown$1(this.$viewConfigProvider, this.$promoAnalytics, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersActiveOrderAdapterKt$bindPromoShown$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            fei0 a = ((hei0) this.$viewConfigProvider).a();
            if (a != null) {
                j = a.b;
            } else {
                o430 o430Var = e3n.b;
                j = 0;
            }
            this.J$0 = j;
            this.label = 1;
            if (kotlinx.coroutines.a.j(j, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        nna nnaVar = this.$promoAnalytics;
        Map<String, Object> map = this.$payload;
        nnaVar.getClass();
        nnaVar.a(map, RealtimeEventType.Shown);
        return zy11.a;
    }
}
