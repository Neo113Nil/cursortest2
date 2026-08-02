package com.yandex.passport.internal.report;

import android.content.Context;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.report.MetricaReporter$1", f = "MetricaReporter.kt", l = {45, 47}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class MetricaReporter$1 extends SuspendLambda implements wls {
    final /* synthetic */ com.yandex.passport.common.analytics.f $analyticsHelper;
    Object L$0;
    int label;
    final /* synthetic */ nd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricaReporter$1(com.yandex.passport.common.analytics.f fVar, nd ndVar, Continuation continuation) {
        super(2, continuation);
        this.$analyticsHelper = fVar;
        this.this$0 = ndVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MetricaReporter$1(this.$analyticsHelper, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MetricaReporter$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0035, code lost:
    
        if (r7 == r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object e;
        nd ndVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.passport.common.analytics.f fVar = this.$analyticsHelper;
            this.label = 1;
            fVar.getClass();
            e = com.yandex.passport.common.analytics.f.e(fVar, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ndVar = (nd) this.L$0;
                kotlin.b.b(obj);
                ndVar.d = (Map) obj;
                return zy11.a;
            }
            kotlin.b.b(obj);
            com.yandex.passport.common.value.a aVar = (com.yandex.passport.common.value.a) obj;
            e = aVar != null ? aVar.a : null;
        }
        String str = (String) e;
        if (str != null) {
            od.a(str, this.this$0.c);
        }
        nd ndVar2 = this.this$0;
        Context context = ndVar2.a;
        this.L$0 = ndVar2;
        this.label = 2;
        Object k0 = tje.k0(uyj.a, new MetricaReporterKt$getBaseParams$2(context, null), this);
        if (k0 != coroutineSingletons) {
            obj = k0;
            ndVar = ndVar2;
            ndVar.d = (Map) obj;
            return zy11.a;
        }
        return coroutineSingletons;
    }
}
