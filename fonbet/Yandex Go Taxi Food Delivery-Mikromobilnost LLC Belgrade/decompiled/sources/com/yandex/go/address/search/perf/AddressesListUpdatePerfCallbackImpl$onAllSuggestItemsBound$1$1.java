package com.yandex.go.address.search.perf;

import com.yandex.go.search.perf.AddressesListPointType;
import defpackage.czf0;
import defpackage.i8v0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ocp0;
import defpackage.r91;
import defpackage.tse;
import defpackage.v91;
import defpackage.wls;
import defpackage.yes;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.address.search.perf.AddressesListUpdatePerfCallbackImpl$onAllSuggestItemsBound$1$1", f = "AddressesListUpdatePerfCallbackImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class AddressesListUpdatePerfCallbackImpl$onAllSuggestItemsBound$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ long $currentTimeMs;
    final /* synthetic */ List<ocp0> $endpoints;
    final /* synthetic */ v91 $intent;
    final /* synthetic */ yes $metrics;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressesListUpdatePerfCallbackImpl$onAllSuggestItemsBound$1$1(yes yesVar, b bVar, v91 v91Var, long j, List list, Continuation continuation) {
        super(2, continuation);
        this.$metrics = yesVar;
        this.this$0 = bVar;
        this.$intent = v91Var;
        this.$currentTimeMs = j;
        this.$endpoints = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddressesListUpdatePerfCallbackImpl$onAllSuggestItemsBound$1$1(this.$metrics, this.this$0, this.$intent, this.$currentTimeMs, this.$endpoints, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        AddressesListUpdatePerfCallbackImpl$onAllSuggestItemsBound$1$1 addressesListUpdatePerfCallbackImpl$onAllSuggestItemsBound$1$1 = (AddressesListUpdatePerfCallbackImpl$onAllSuggestItemsBound$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        addressesListUpdatePerfCallbackImpl$onAllSuggestItemsBound$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        yes yesVar = this.$metrics;
        if (yesVar != null) {
            b bVar = this.this$0;
            v91 v91Var = this.$intent;
            r91 r91Var = bVar.b;
            int i = yesVar.b;
            r91Var.getClass();
            String concat = "Perf.Screen.Suggest.AddressesListUpdate.".concat("MaxHitchDuration");
            i d = ((j) r91Var.a).d(concat);
            String str = v91Var.a;
            AddressesListPointType addressesListPointType = v91Var.e;
            String str2 = v91Var.d;
            i8v0 i8v0Var = v91Var.c;
            d.d("id", str);
            i8v0Var.getClass();
            d.d("intent_reason", "taxi_shortcut");
            d.d("intent_source_screen", str2);
            d.d("point_type", addressesListPointType.getAnalyticsValue());
            d.b(i, "value");
            d.m();
            r91Var.b.getClass();
            czf0.a(i, concat);
            double d2 = yesVar.a;
            if (d2 != 0.0d) {
                r91 r91Var2 = bVar.b;
                r91Var2.getClass();
                String concat2 = "Perf.Screen.Suggest.AddressesListUpdate.".concat("HitchTimeRatio");
                i d3 = ((j) r91Var2.a).d(concat2);
                d3.d("id", v91Var.a);
                d3.d("intent_reason", "taxi_shortcut");
                d3.d("intent_source_screen", str2);
                d3.d("point_type", addressesListPointType.getAnalyticsValue());
                d3.a(d2, "value");
                d3.m();
                r91Var2.b.getClass();
                czf0.a((long) d2, concat2);
            }
        }
        b bVar2 = this.this$0;
        r91 r91Var3 = bVar2.b;
        v91 v91Var2 = this.$intent;
        long j = this.$currentTimeMs;
        r91Var3.a("LargestContentfulPaint", v91Var2, j - v91Var2.b, j - bVar2.c.e(), this.$endpoints);
        return zy11.a;
    }
}
