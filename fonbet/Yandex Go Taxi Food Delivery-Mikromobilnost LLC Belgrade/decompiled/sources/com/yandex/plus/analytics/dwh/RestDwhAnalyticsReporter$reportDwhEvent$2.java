package com.yandex.plus.analytics.dwh;

import com.yandex.plus.core.network.error.NetworkException;
import com.yandex.plus.core.network.okhttp.call.c;
import com.yandex.plus.log.api.LogPriority;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.pz50;
import defpackage.qz50;
import defpackage.rkd0;
import defpackage.sq50;
import defpackage.sz50;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.analytics.dwh.RestDwhAnalyticsReporter$reportDwhEvent$2", f = "RestDwhAnalyticsReporter.kt", l = {38}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class RestDwhAnalyticsReporter$reportDwhEvent$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $event;
    final /* synthetic */ Map<String, Object> $parameters;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RestDwhAnalyticsReporter$reportDwhEvent$2(a aVar, String str, Map map, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$event = str;
        this.$parameters = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RestDwhAnalyticsReporter$reportDwhEvent$2(this.this$0, this.$event, this.$parameters, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RestDwhAnalyticsReporter$reportDwhEvent$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            c o = this.this$0.a.o(new RestDwhAnalyticsReporter$reportDwhEvent$2$call$1(this.$event, this.$parameters, null));
            this.L$0 = null;
            this.label = 1;
            obj = o.b(new sq50(0), this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        sz50 sz50Var = (sz50) obj;
        a aVar = this.this$0;
        String str = this.$event;
        boolean z = sz50Var instanceof qz50;
        if (z) {
            rkd0 rkd0Var = aVar.b;
            LogPriority logPriority = LogPriority.DEBUG;
            if (rkd0Var.e(logPriority)) {
                rkd0Var.b(logPriority, "DWH", oyr.p("DWH event ", str, " sent successfully."), null);
            }
        } else if (!(sz50Var instanceof pz50)) {
            w511.b();
            return null;
        }
        a aVar2 = this.this$0;
        String str2 = this.$event;
        if (!z) {
            if (!(sz50Var instanceof pz50)) {
                w511.b();
                return null;
            }
            NetworkException networkException = ((pz50) sz50Var).a;
            rkd0 rkd0Var2 = aVar2.b;
            LogPriority logPriority2 = LogPriority.ERROR;
            if (rkd0Var2.e(logPriority2)) {
                rkd0Var2.b(logPriority2, "DWH", oyr.p("DWH event ", str2, " not sent."), networkException);
            }
        }
        return zy11.a;
    }
}
