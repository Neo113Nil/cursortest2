package com.yandex.go.chargers.order.completion.pre_finish;

import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersFinishCardCloseReason;
import com.yandex.go.chargers.analytics.ChargersError;
import com.yandex.go.chargers.order.completion.pre_finish.domain.a;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.cy9;
import defpackage.h1a;
import defpackage.io9;
import defpackage.j1a;
import defpackage.k1a;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.yx9;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.serialization.json.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.order.completion.pre_finish.ChargersFinishPresenter$finish$1", f = "ChargersFinishPresenter.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE, 60}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersFinishPresenter$finish$1 extends SuspendLambda implements wls {
    final /* synthetic */ b $args;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ h1a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersFinishPresenter$finish$1(h1a h1aVar, b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = h1aVar;
        this.$args = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersFinishPresenter$finish$1(this.this$0, this.$args, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersFinishPresenter$finish$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0041, code lost:
    
        if (r5.b(r1, r7) == r0) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        h1a h1aVar;
        Object a;
        h1a h1aVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                h1aVar = this.this$0;
                b bVar = this.$args;
                try {
                    a aVar = h1aVar.y;
                    this.L$0 = h1aVar;
                    this.label = 1;
                } catch (Throwable th) {
                    th = th;
                    h1aVar.x.k(ChargersAnalytics$ChargersFinishCardCloseReason.Error);
                    com.yandex.go.chargers.error.data.a aVar2 = h1aVar.z;
                    this.L$0 = h1aVar;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 2;
                    a = aVar2.a(th, this);
                    if (a != coroutineSingletons) {
                        h1a h1aVar3 = h1aVar;
                        obj = a;
                        h1aVar2 = h1aVar3;
                        cy9 cy9Var = (cy9) obj;
                        yx9.a(ChargersError.Companion, ChargersError.FinishingParserError, cy9Var.a, 4);
                        ((k1a) ((io9) h1aVar2.D).a).r(new j1a(cy9Var, 0));
                        return zy11.a;
                    }
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    h1aVar2 = (h1a) this.L$0;
                    kotlin.b.b(obj);
                    cy9 cy9Var2 = (cy9) obj;
                    yx9.a(ChargersError.Companion, ChargersError.FinishingParserError, cy9Var2.a, 4);
                    ((k1a) ((io9) h1aVar2.D).a).r(new j1a(cy9Var2, 0));
                    return zy11.a;
                }
                h1a h1aVar4 = (h1a) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    h1aVar = h1aVar4;
                    h1aVar.x.k(ChargersAnalytics$ChargersFinishCardCloseReason.Error);
                    com.yandex.go.chargers.error.data.a aVar22 = h1aVar.z;
                    this.L$0 = h1aVar;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 2;
                    a = aVar22.a(th, this);
                    if (a != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
            }
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
