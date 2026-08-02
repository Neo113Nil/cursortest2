package com.yandex.go.sdk_registry.runtime.metrics;

import com.yandex.go.sdk_registry.api.SdkLogLevel;
import defpackage.h33;
import defpackage.hst;
import defpackage.jst;
import defpackage.lrt;
import defpackage.mop0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.sdk_registry.runtime.metrics.MetricSinkSdkInitTracker$report$1", f = "MetricSinkSdkInitTracker.kt", l = {145}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class MetricSinkSdkInitTracker$report$1 extends SuspendLambda implements wls {
    final /* synthetic */ mop0 $event;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricSinkSdkInitTracker$report$1(a aVar, mop0 mop0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$event = mop0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MetricSinkSdkInitTracker$report$1(this.this$0, this.$event, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MetricSinkSdkInitTracker$report$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        zy11 zy11Var = zy11.a;
        if (i2 != 0) {
            if (i2 == 1) {
                b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        h33 h33Var = this.this$0.c;
        mop0 mop0Var = this.$event;
        this.label = 1;
        h33Var.getClass();
        SdkLogLevel sdkLogLevel = SdkLogLevel.DEBUG;
        String str = "name=" + mop0Var.g + " component_tag=" + mop0Var.a + " timestamp_ms=" + mop0Var.b + " dimensions=" + h33.a(mop0Var.h) + " measurements=" + h33.a(mop0Var.i);
        hst hstVar = jst.e;
        int i3 = lrt.a[sdkLogLevel.ordinal()];
        if (i3 == 1) {
            i = 5;
        } else if (i3 == 2) {
            i = 10;
        } else if (i3 == 3) {
            i = 15;
        } else {
            if (i3 != 4) {
                w511.b();
                return null;
            }
            i = 20;
        }
        hstVar.a(i, "SdkRegistryMetrics", null, str);
        return zy11Var == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
