package com.yandex.go.zone.repository;

import android.os.SystemClock;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.ms2;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.os2;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.perf.Milestone;

@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n"}, d2 = {"<anonymous>", "T"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.zone.repository.ZoneInfoAnalytics$zoneInfoWithLogging$2", f = "ZoneInfoAnalytics.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class ZoneInfoAnalytics$zoneInfoWithLogging$2 extends SuspendLambda implements tls {
    final /* synthetic */ tls $block;
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoneInfoAnalytics$zoneInfoWithLogging$2(l lVar, tls tlsVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = lVar;
        this.$block = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ZoneInfoAnalytics$zoneInfoWithLogging$2(this.this$0, this.$block, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((ZoneInfoAnalytics$zoneInfoWithLogging$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ms2 ms2Var = this.this$0.a;
            Milestone milestone = Milestone.ZoneInfo;
            ms2Var.getClass();
            ((os2) ms2Var).d(milestone, SystemClock.elapsedRealtime());
            tls tlsVar = this.$block;
            this.label = 1;
            obj = tlsVar.invoke(this);
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
        this.this$0.a.a(Milestone.ZoneInfo);
        return obj;
    }
}
