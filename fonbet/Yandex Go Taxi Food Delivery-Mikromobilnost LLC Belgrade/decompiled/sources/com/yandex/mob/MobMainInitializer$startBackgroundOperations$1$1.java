package com.yandex.mob;

import com.yandex.mob.domain.InitialUseCase$Result;
import defpackage.eyc;
import defpackage.fyc;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.oo20;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import io.appmetrica.analytics.BuildConfig;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mob.MobMainInitializer$startBackgroundOperations$1$1", f = "MobMainInitializer.kt", l = {HProv.PP_RESERVED1, 108, 109, 110, 111, 112, 113, 114, HProv.PP_CACHE_SIZE, BuildConfig.API_LEVEL}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class MobMainInitializer$startBackgroundOperations$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ oo20 $deps;
    final /* synthetic */ oo20 $this_with;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$10;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ MobMainInitializer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobMainInitializer$startBackgroundOperations$1$1(MobMainInitializer mobMainInitializer, oo20 oo20Var, oo20 oo20Var2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mobMainInitializer;
        this.$this_with = oo20Var;
        this.$deps = oo20Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MobMainInitializer$startBackgroundOperations$1$1 mobMainInitializer$startBackgroundOperations$1$1 = new MobMainInitializer$startBackgroundOperations$1$1(this.this$0, this.$this_with, this.$deps, continuation);
        mobMainInitializer$startBackgroundOperations$1$1.L$0 = obj;
        return mobMainInitializer$startBackgroundOperations$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MobMainInitializer$startBackgroundOperations$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0367, code lost:
    
        if (r0.k(r14) == r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0346, code lost:
    
        if (r2.k(r14) == r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0325, code lost:
    
        if (r3.k(r14) == r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0304, code lost:
    
        if (r5.k(r14) == r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x02e3, code lost:
    
        if (r6.k(r14) != r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x02a0, code lost:
    
        if (r8.k(r14) != r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01c7, code lost:
    
        if (r15 == r1) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0280  */
    /* JADX WARN: Type inference failed for: r7v6, types: [noh] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        noh h2;
        noh h3;
        qoh qohVar;
        noh nohVar;
        noh nohVar2;
        noh nohVar3;
        noh nohVar4;
        noh nohVar5;
        noh nohVar6;
        noh nohVar7;
        noh nohVar8;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (this.label) {
            case 0:
                kotlin.b.b(obj);
                MobMainInitializer mobMainInitializer = this.this$0;
                this.L$0 = tseVar;
                this.label = 1;
                obj = ((fyc) ((eyc) mobMainInitializer.a.get())).s(this);
                break;
            case 1:
                kotlin.b.b(obj);
                qoh h4 = tje.h(tseVar, null, null, new MobMainInitializer$startBackgroundOperations$1$1$configMigrationDeferred$1(this.$this_with, (InitialUseCase$Result) obj, null), 3);
                h = tje.h(tseVar, null, null, new MobMainInitializer$startBackgroundOperations$1$1$notificationsDeferred$1(this.$this_with, null), 3);
                qoh h5 = tje.h(tseVar, null, null, new MobMainInitializer$startBackgroundOperations$1$1$reportDeferred$1(this.$this_with, null), 3);
                qoh h6 = tje.h(tseVar, null, null, new MobMainInitializer$startBackgroundOperations$1$1$metricaDataDeferred$1(this.this$0, this.$this_with, null), 3);
                qoh h7 = tje.h(tseVar, null, null, new MobMainInitializer$startBackgroundOperations$1$1$countryIsoDeferred$1(this.this$0, this.$this_with, null), 3);
                h2 = tje.h(tseVar, null, null, new MobMainInitializer$startBackgroundOperations$1$1$detailReportDeferred$1(this.$deps, null), 3);
                qoh h8 = tje.h(tseVar, null, null, new MobMainInitializer$startBackgroundOperations$1$1$remoteNotificationsDeferred$1(this.this$0, this.$this_with, null), 3);
                qoh h9 = tje.h(tseVar, null, null, new MobMainInitializer$startBackgroundOperations$1$1$vpnChangedDeferred$1(this.this$0, this.$this_with, null), 3);
                h3 = tje.h(tseVar, null, null, new MobMainInitializer$startBackgroundOperations$1$1$networkTypeChangedDeferred$1(this.this$0, this.$this_with, null), 3);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = h;
                this.L$4 = h5;
                this.L$5 = h6;
                this.L$6 = h7;
                this.L$7 = h2;
                this.L$8 = h8;
                this.L$9 = h9;
                this.L$10 = h3;
                this.label = 2;
                if (h4.s(this) != coroutineSingletons) {
                    qohVar = h7;
                    nohVar = h6;
                    nohVar2 = h8;
                    nohVar3 = h5;
                    nohVar4 = h9;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = nohVar3;
                    this.L$5 = nohVar;
                    this.L$6 = qohVar;
                    this.L$7 = h2;
                    this.L$8 = nohVar2;
                    this.L$9 = nohVar4;
                    this.L$10 = h3;
                    this.label = 3;
                    if (h.k(this) != coroutineSingletons) {
                        nohVar5 = nohVar2;
                        nohVar6 = h2;
                        nohVar7 = qohVar;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = nohVar;
                        this.L$6 = nohVar7;
                        this.L$7 = nohVar6;
                        this.L$8 = nohVar5;
                        this.L$9 = nohVar4;
                        this.L$10 = h3;
                        this.label = 4;
                        break;
                    }
                }
                return coroutineSingletons;
            case 2:
                h3 = (noh) this.L$10;
                nohVar4 = (noh) this.L$9;
                nohVar2 = (noh) this.L$8;
                h2 = (noh) this.L$7;
                ?? r7 = (noh) this.L$6;
                noh nohVar9 = (noh) this.L$5;
                noh nohVar10 = (noh) this.L$4;
                h = (noh) this.L$3;
                kotlin.b.b(obj);
                qohVar = r7;
                nohVar = nohVar9;
                nohVar3 = nohVar10;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = nohVar3;
                this.L$5 = nohVar;
                this.L$6 = qohVar;
                this.L$7 = h2;
                this.L$8 = nohVar2;
                this.L$9 = nohVar4;
                this.L$10 = h3;
                this.label = 3;
                if (h.k(this) != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 3:
                h3 = (noh) this.L$10;
                nohVar4 = (noh) this.L$9;
                nohVar5 = (noh) this.L$8;
                nohVar6 = (noh) this.L$7;
                nohVar7 = (noh) this.L$6;
                nohVar = (noh) this.L$5;
                nohVar3 = (noh) this.L$4;
                kotlin.b.b(obj);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = nohVar;
                this.L$6 = nohVar7;
                this.L$7 = nohVar6;
                this.L$8 = nohVar5;
                this.L$9 = nohVar4;
                this.L$10 = h3;
                this.label = 4;
                break;
            case 4:
                h3 = (noh) this.L$10;
                nohVar4 = (noh) this.L$9;
                nohVar5 = (noh) this.L$8;
                nohVar6 = (noh) this.L$7;
                nohVar7 = (noh) this.L$6;
                nohVar = (noh) this.L$5;
                kotlin.b.b(obj);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = nohVar;
                this.L$6 = null;
                this.L$7 = nohVar6;
                this.L$8 = nohVar5;
                this.L$9 = nohVar4;
                this.L$10 = h3;
                this.label = 5;
                if (nohVar7.k(this) != coroutineSingletons) {
                    nohVar8 = nohVar;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = nohVar6;
                    this.L$8 = nohVar5;
                    this.L$9 = nohVar4;
                    this.L$10 = h3;
                    this.label = 6;
                    break;
                }
                return coroutineSingletons;
            case 5:
                h3 = (noh) this.L$10;
                nohVar4 = (noh) this.L$9;
                nohVar5 = (noh) this.L$8;
                nohVar6 = (noh) this.L$7;
                nohVar8 = (noh) this.L$5;
                kotlin.b.b(obj);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = nohVar6;
                this.L$8 = nohVar5;
                this.L$9 = nohVar4;
                this.L$10 = h3;
                this.label = 6;
                break;
            case 6:
                h3 = (noh) this.L$10;
                nohVar4 = (noh) this.L$9;
                nohVar5 = (noh) this.L$8;
                nohVar6 = (noh) this.L$7;
                kotlin.b.b(obj);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = nohVar5;
                this.L$9 = nohVar4;
                this.L$10 = h3;
                this.label = 7;
                break;
            case 7:
                h3 = (noh) this.L$10;
                nohVar4 = (noh) this.L$9;
                nohVar5 = (noh) this.L$8;
                kotlin.b.b(obj);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = null;
                this.L$9 = nohVar4;
                this.L$10 = h3;
                this.label = 8;
                break;
            case 8:
                h3 = (noh) this.L$10;
                nohVar4 = (noh) this.L$9;
                kotlin.b.b(obj);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = null;
                this.L$9 = null;
                this.L$10 = h3;
                this.label = 9;
                break;
            case 9:
                h3 = (noh) this.L$10;
                kotlin.b.b(obj);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = null;
                this.L$9 = null;
                this.L$10 = null;
                this.label = 10;
                break;
            case 10:
                kotlin.b.b(obj);
                return zy11.a;
            default:
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
