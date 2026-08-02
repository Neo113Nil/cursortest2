package com.yandex.mob.domain;

import com.yandex.mob.reporting.MobTrigger;
import defpackage.dq20;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.rot;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mob.domain.DetailReportUseCase$startReporting$2$1", f = "DetailReportUseCase.kt", l = {HProv.PP_BIO_STATISTICA_LEN, HProv.PP_REBOOT, HProv.PP_SIGNATUREOID, 105}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class DetailReportUseCase$startReporting$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ dq20 $entry;
    final /* synthetic */ List<dq20> $pendingHosts;
    final /* synthetic */ MobTrigger $trigger;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailReportUseCase$startReporting$2$1(h hVar, dq20 dq20Var, MobTrigger mobTrigger, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
        this.$entry = dq20Var;
        this.$trigger = mobTrigger;
        this.$pendingHosts = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DetailReportUseCase$startReporting$2$1 detailReportUseCase$startReporting$2$1 = new DetailReportUseCase$startReporting$2$1(this.this$0, this.$entry, this.$trigger, this.$pendingHosts, continuation);
        detailReportUseCase$startReporting$2$1.L$0 = obj;
        return detailReportUseCase$startReporting$2$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DetailReportUseCase$startReporting$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x012e, code lost:
    
        if (r0.t(r1, r14) == r9) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x010c, code lost:
    
        if (r0 != r9) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        rot rotVar;
        String str;
        Object s;
        com.yandex.mob.reporting.a aVar;
        MobTrigger mobTrigger;
        Object k;
        MobTrigger mobTrigger2;
        String str2;
        rot rotVar2;
        Object h2;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            qoh h3 = tje.h(tseVar, null, null, new DetailReportUseCase$startReporting$2$1$tracerouteDeferred$1(this.this$0, this.$entry, null), 3);
            h = tje.h(tseVar, null, null, new DetailReportUseCase$startReporting$2$1$pingDeferred$1(this.this$0, this.$entry, null), 3);
            h hVar = this.this$0;
            rotVar = hVar.g;
            com.yandex.mob.reporting.a aVar2 = hVar.f;
            str = this.$entry.b;
            MobTrigger mobTrigger3 = this.$trigger;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h;
            this.L$3 = rotVar;
            this.L$4 = aVar2;
            this.L$5 = str;
            this.L$6 = mobTrigger3;
            this.label = 1;
            s = h3.s(this);
            if (s != coroutineSingletons) {
                aVar = aVar2;
                mobTrigger = mobTrigger3;
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            mobTrigger = (MobTrigger) this.L$6;
            String str3 = (String) this.L$5;
            aVar = (com.yandex.mob.reporting.a) this.L$4;
            rotVar = (rot) this.L$3;
            h = (noh) this.L$2;
            kotlin.b.b(obj);
            str = str3;
            s = obj;
        } else if (i == 2) {
            str2 = (String) this.L$7;
            mobTrigger2 = (MobTrigger) this.L$6;
            String str4 = (String) this.L$5;
            aVar = (com.yandex.mob.reporting.a) this.L$4;
            rotVar = (rot) this.L$3;
            kotlin.b.b(obj);
            str = str4;
            k = obj;
            rotVar2 = rotVar;
            String str5 = (String) k;
            dq20 dq20Var = this.$entry;
            String str6 = dq20Var.a;
            String str7 = dq20Var.c;
            String str8 = dq20Var.d;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = rotVar2;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = null;
            this.L$7 = null;
            this.label = 3;
            MobTrigger mobTrigger4 = mobTrigger2;
            h2 = aVar.h(str, mobTrigger4, str2, str5, str6, str7, str8, this);
        } else {
            if (i != 3) {
                if (i != 4) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            rot rotVar3 = (rot) this.L$3;
            kotlin.b.b(obj);
            rotVar2 = rotVar3;
            h2 = obj;
            rotVar2.b((Pair) h2);
            this.$pendingHosts.remove(0);
            com.yandex.mob.datastore.d dVar = this.this$0.c;
            List<dq20> list = this.$pendingHosts;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 4;
        }
        String str9 = (String) s;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = rotVar;
        this.L$4 = aVar;
        this.L$5 = str;
        this.L$6 = mobTrigger;
        this.L$7 = str9;
        this.label = 2;
        k = h.k(this);
        if (k != coroutineSingletons) {
            mobTrigger2 = mobTrigger;
            str2 = str9;
            rotVar2 = rotVar;
            String str52 = (String) k;
            dq20 dq20Var2 = this.$entry;
            String str62 = dq20Var2.a;
            String str72 = dq20Var2.c;
            String str82 = dq20Var2.d;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = rotVar2;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = null;
            this.L$7 = null;
            this.label = 3;
            MobTrigger mobTrigger42 = mobTrigger2;
            h2 = aVar.h(str, mobTrigger42, str2, str52, str62, str72, str82, this);
        }
        return coroutineSingletons;
    }
}
