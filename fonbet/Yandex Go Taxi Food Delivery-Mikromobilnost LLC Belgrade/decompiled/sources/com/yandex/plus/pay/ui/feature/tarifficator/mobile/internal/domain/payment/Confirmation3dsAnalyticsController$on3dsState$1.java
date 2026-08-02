package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.payment;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.log.LogTag;
import defpackage.fu90;
import defpackage.mdd0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.u7d0;
import defpackage.wls;
import defpackage.zy11;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.payment.Confirmation3dsAnalyticsController$on3dsState$1", f = "Confirmation3dsAnalyticsController.kt", l = {29}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class Confirmation3dsAnalyticsController$on3dsState$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Confirmation3dsAnalyticsController$on3dsState$1(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$url = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Confirmation3dsAnalyticsController$on3dsState$1(this.this$0, this.$url, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((Confirmation3dsAnalyticsController$on3dsState$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            this.label = 1;
            if (kotlinx.coroutines.a.i(10000L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        mdd0.g(this.this$0.d, LogTag.TARIFFICATOR, "3ds.Error.TimeOut: timeOutTimeMs=10000", null, 12);
        u7d0 u7d0Var = this.this$0.c;
        String str = this.$url;
        fu90 fu90Var = u7d0Var.a;
        fu90Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("page_url", str);
        linkedHashMap.put("webViewName", "3ds");
        linkedHashMap.put("additionalData", "no_value");
        linkedHashMap.put("timeOutMillis", String.valueOf(10000L));
        linkedHashMap.put("_meta", fu90.c(new HashMap()));
        fu90Var.d("Error.WebView.Loading.Timeout", linkedHashMap);
        return zy11.a;
    }
}
