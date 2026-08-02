package com.yandex.go.scooters.data;

import com.yandex.go.experiments.api.ExperimentSource;
import defpackage.c0e;
import defpackage.cmt;
import defpackage.fmt;
import defpackage.hd7;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.udq0;
import defpackage.wls;
import defpackage.zan0;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzan0;", "<anonymous>", "(Ltse;)Lzan0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.data.ScootersConfigRepository$getConfig$response$1", f = "ScootersConfigRepository.kt", l = {36}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersConfigRepository$getConfig$response$1 extends SuspendLambda implements wls {
    final /* synthetic */ Map<String, String> $headers;
    final /* synthetic */ c0e $params;
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersConfigRepository$getConfig$response$1(b bVar, Map map, c0e c0eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$headers = map;
        this.$params = c0eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersConfigRepository$getConfig$response$1(this.this$0, this.$headers, this.$params, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersConfigRepository$getConfig$response$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        hd7 hd7Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            hd7 b = this.this$0.e.b(ExperimentSource.SCOOTERS_CONFIG, true);
            ScootersConfigApi scootersConfigApi = this.this$0.b;
            Map<String, String> map = this.$headers;
            c0e c0eVar = this.$params;
            cmt<zan0> a = scootersConfigApi.a(map, new c0e(c0eVar.a, c0eVar.b, b.d));
            this.L$0 = b;
            this.label = 1;
            Object b2 = ru.yandex.taxi.network.api.a.b(a, null, this);
            if (b2 == coroutineSingletons) {
                return coroutineSingletons;
            }
            hd7Var = b;
            obj = b2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hd7Var = (hd7) this.L$0;
            kotlin.b.b(obj);
        }
        zan0 zan0Var = (zan0) ((fmt) obj).a;
        udq0.P(zan0Var.a, this.this$0.e, hd7Var);
        return zan0Var;
    }
}
