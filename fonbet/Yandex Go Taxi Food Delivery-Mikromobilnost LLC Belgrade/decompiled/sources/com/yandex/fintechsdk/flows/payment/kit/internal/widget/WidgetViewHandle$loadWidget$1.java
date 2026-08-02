package com.yandex.fintechsdk.flows.payment.kit.internal.widget;

import android.view.View;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.fintechsdk.flows.payment.kit.internal.widget.WidgetViewHandle$loadWidget$1", f = "WidgetViewHandle.kt", l = {120}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class WidgetViewHandle$loadWidget$1 extends SuspendLambda implements wls {
    final /* synthetic */ Map<String, String> $params;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetViewHandle$loadWidget$1(e eVar, Map map, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$params = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WidgetViewHandle$loadWidget$1(this.this$0, this.$params, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WidgetViewHandle$loadWidget$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            e eVar = this.this$0;
            a aVar = eVar.d;
            LinkedHashMap n = kotlin.collections.b.n(eVar.c, this.$params);
            this.this$0.getClass();
            this.label = 1;
            a = aVar.a(n, "payment_methods", this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            a = ((Result) obj).getValue();
        }
        e eVar2 = this.this$0;
        if (Result.a(a) == null) {
            eVar2.a.showContent((View) a);
        } else {
            eVar2.a.showEmpty();
        }
        return zy11.a;
    }
}
