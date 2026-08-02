package com.yandex.go.analytics.rythm;

import defpackage.ell0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.analytics.rythm.RythmAnalyticsImpl$report$1", f = "RythmAnalyticsImpl.kt", l = {32}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class RythmAnalyticsImpl$report$1 extends SuspendLambda implements wls {
    final /* synthetic */ ell0 $event;
    final /* synthetic */ String $time;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RythmAnalyticsImpl$report$1(ell0 ell0Var, String str, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$event = ell0Var;
        this.$time = str;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RythmAnalyticsImpl$report$1(this.$event, this.$time, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RythmAnalyticsImpl$report$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            LinkedHashMap linkedHashMap = new LinkedHashMap(this.$event.b);
            linkedHashMap.put(RemoteBioParameters.TIME, this.$time);
            a aVar = this.this$0;
            ell0 ell0Var = new ell0(this.$event.a, linkedHashMap);
            this.L$0 = null;
            this.label = 1;
            if (a.a(aVar, ell0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
