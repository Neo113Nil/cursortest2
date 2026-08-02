package com.yandex.go.taxi.tariffs.internal.routestats.factory;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lfnx0;", "<anonymous>", "(Ltse;)Lfnx0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.tariffs.internal.routestats.factory.PrefetchRouteStatsParamBuilderImpl$buildParamForDestination$tariffSelection$1", f = "PrefetchRouteStatsParamBuilderImpl.kt", l = {HProv.PP_ENUM_CONTAINER_EXTENSION}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class PrefetchRouteStatsParamBuilderImpl$buildParamForDestination$tariffSelection$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrefetchRouteStatsParamBuilderImpl$buildParamForDestination$tariffSelection$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PrefetchRouteStatsParamBuilderImpl$buildParamForDestination$tariffSelection$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PrefetchRouteStatsParamBuilderImpl$buildParamForDestination$tariffSelection$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        mth b = ((k) this.this$0.d).j.b();
        this.label = 1;
        Object A = e.A(b, this);
        return A == coroutineSingletons ? coroutineSingletons : A;
    }
}
