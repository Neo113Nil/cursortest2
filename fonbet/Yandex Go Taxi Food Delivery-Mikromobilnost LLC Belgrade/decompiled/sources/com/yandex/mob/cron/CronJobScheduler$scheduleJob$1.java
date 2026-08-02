package com.yandex.mob.cron;

import defpackage.mvg;
import defpackage.no20;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mob.cron.CronJobScheduler$scheduleJob$1", f = "CronJobScheduler.kt", l = {37, 42, 43}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class CronJobScheduler$scheduleJob$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $job;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CronJobScheduler$scheduleJob$1(a aVar, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$job = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CronJobScheduler$scheduleJob$1 cronJobScheduler$scheduleJob$1 = new CronJobScheduler$scheduleJob$1(this.this$0, this.$job, continuation);
        cronJobScheduler$scheduleJob$1.L$0 = obj;
        return cronJobScheduler$scheduleJob$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CronJobScheduler$scheduleJob$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        if (r11 == r1) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh nohVar;
        int i;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        zy11 zy11Var = zy11.a;
        if (i2 == 0) {
            b.b(obj);
            a aVar = this.this$0;
            this.L$0 = tseVar;
            this.label = 1;
            obj = a.b(aVar, this);
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    return zy11Var;
                }
                i = this.I$0;
                nohVar = (noh) this.L$2;
                b.b(obj);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.I$0 = i;
                this.label = 3;
                return nohVar.k(this) != coroutineSingletons ? coroutineSingletons : zy11Var;
            }
            b.b(obj);
        }
        Integer num = (Integer) obj;
        if (num != null) {
            int intValue = num.intValue();
            a aVar2 = this.this$0;
            no20 no20Var = aVar2.f;
            aVar2.a.toString();
            qoh h = tje.h(tseVar, null, null, new CronJobScheduler$scheduleJob$1$asyncCron$1(this.this$0, intValue, this.$job, null), 3);
            qoh h2 = tje.h(tseVar, null, null, new CronJobScheduler$scheduleJob$1$asyncTrigger$1(this.this$0, intValue, this.$job, null), 3);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h2;
            this.I$0 = intValue;
            this.label = 2;
            if (h.s(this) != coroutineSingletons) {
                nohVar = h2;
                i = intValue;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.I$0 = i;
                this.label = 3;
                if (nohVar.k(this) != coroutineSingletons) {
                }
            }
        }
    }
}
