package com.yandex.fintechsdk.core.analytics.impl.internal;

import defpackage.keo;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.fintechsdk.core.analytics.impl.internal.AnalyticsImpl$reportProductEvent$1", f = "AnalyticsImpl.kt", l = {53}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class AnalyticsImpl$reportProductEvent$1 extends SuspendLambda implements wls {
    final /* synthetic */ keo $event;
    final /* synthetic */ Map<String, String> $mergedParams;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticsImpl$reportProductEvent$1(a aVar, keo keoVar, Map map, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$event = keoVar;
        this.$mergedParams = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AnalyticsImpl$reportProductEvent$1(this.this$0, this.$event, this.$mergedParams, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AnalyticsImpl$reportProductEvent$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            com.yandex.fintechsdk.core.analytics.impl.internal.rum.a aVar = this.this$0.d;
            if (aVar != null) {
                keo keoVar = this.$event;
                Map<String, String> map = this.$mergedParams;
                this.label = 1;
                if (aVar.b(keoVar, map, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
