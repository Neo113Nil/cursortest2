package com.yandex.go.scooters.mosru;

import com.yandex.go.scooters.mosru.api.analytics.ScootersMosRuAnalyticsEvent$WebViewOpened$OpenReason;
import com.yandex.go.scooters.mosru.api.domain.model.ScootersMosRuActionDialogOpenReason;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.azn0;
import defpackage.hzn0;
import defpackage.izn0;
import defpackage.jzn0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pzn0;
import defpackage.qzn0;
import defpackage.tse;
import defpackage.w511;
import defpackage.w8p0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.mosru.ScootersMosRuRouterImpl$onAttach$1", f = "ScootersMosRuRouterImpl.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE, 53, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE, 62}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersMosRuRouterImpl$onAttach$1 extends SuspendLambda implements wls {
    final /* synthetic */ jzn0 $payload;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersMosRuRouterImpl$onAttach$1(c cVar, jzn0 jzn0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$payload = jzn0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersMosRuRouterImpl$onAttach$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersMosRuRouterImpl$onAttach$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0074, code lost:
    
        if (r10 == r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0067, code lost:
    
        if (r10 != r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00cb  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        c cVar;
        jzn0 jzn0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        int i2 = 2;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar2 = this.this$0;
            jzn0 jzn0Var2 = this.$payload;
            this.label = 1;
            if (jzn0Var2 instanceof hzn0) {
                com.yandex.go.scooters.mosru.domain.a aVar = cVar2.E;
                ScootersMosRuActionDialogOpenReason scootersMosRuActionDialogOpenReason = ((hzn0) jzn0Var2).a;
                aVar.getClass();
                if (scootersMosRuActionDialogOpenReason == ScootersMosRuActionDialogOpenReason.FINISH_SCREEN) {
                    obj2 = aVar.a.b(this);
                }
            } else {
                cVar2.getClass();
            }
            obj2 = zy11Var;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    if (i != 4) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cVar = (c) this.L$2;
                    jzn0Var = (jzn0) this.L$1;
                    kotlin.b.b(obj);
                    w8p0 w8p0Var = (w8p0) obj;
                    if (azn0.b[((izn0) jzn0Var).a.ordinal()] != 1) {
                        c.R(cVar, w8p0Var, ScootersMosRuAnalyticsEvent$WebViewOpened$OpenReason.DEEPLINK);
                        return zy11Var;
                    }
                    w511.b();
                    return null;
                }
                kotlin.b.b(obj);
                qzn0 qzn0Var = (qzn0) obj;
                if (qzn0Var != null) {
                    String str = qzn0Var.d;
                    if (str.length() > 0) {
                        jzn0 jzn0Var3 = this.$payload;
                        if (jzn0Var3 instanceof hzn0) {
                            c cVar3 = this.this$0;
                            ScootersMosRuActionDialogOpenReason scootersMosRuActionDialogOpenReason2 = ((hzn0) jzn0Var3).a;
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 3;
                            if (c.P(cVar3, qzn0Var, scootersMosRuActionDialogOpenReason2, this) != coroutineSingletons) {
                                return zy11Var;
                            }
                        } else {
                            if (!(jzn0Var3 instanceof izn0)) {
                                w511.b();
                                return null;
                            }
                            c cVar4 = this.this$0;
                            this.L$0 = null;
                            this.L$1 = jzn0Var3;
                            this.L$2 = cVar4;
                            this.label = 4;
                            Object S = c.S(cVar4, str, this);
                            if (S != coroutineSingletons) {
                                cVar = cVar4;
                                jzn0Var = jzn0Var3;
                                obj = S;
                                w8p0 w8p0Var2 = (w8p0) obj;
                                if (azn0.b[((izn0) jzn0Var).a.ordinal()] != 1) {
                                }
                            }
                        }
                        return coroutineSingletons;
                    }
                }
                this.this$0.r(new pzn0(i2));
                return zy11Var;
            }
            kotlin.b.b(obj);
        }
        com.yandex.go.scooters.mosru.domain.a aVar2 = this.this$0.E;
        this.label = 2;
        obj = aVar2.b(this);
    }
}
