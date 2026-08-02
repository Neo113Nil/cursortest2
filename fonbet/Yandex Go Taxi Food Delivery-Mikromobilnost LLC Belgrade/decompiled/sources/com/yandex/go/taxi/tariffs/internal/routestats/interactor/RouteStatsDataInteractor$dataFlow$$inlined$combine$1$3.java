package com.yandex.go.taxi.tariffs.internal.routestats.interactor;

import com.yandex.go.analytics.AccountType;
import com.yandex.go.zone.model.Zone;
import defpackage.bbl0;
import defpackage.cia0;
import defpackage.gqe0;
import defpackage.jni;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oje;
import defpackage.vpr;
import defpackage.w3l0;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lvpr;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Lkotlin/Array;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.tariffs.internal.routestats.interactor.RouteStatsDataInteractor$dataFlow$$inlined$combine$1$3", f = "RouteStatsDataInteractor.kt", l = {MSException.ERROR_MORE_DATA}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
public final class RouteStatsDataInteractor$dataFlow$$inlined$combine$1$3 extends SuspendLambda implements zls {
    final /* synthetic */ Zone $zone$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ a0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteStatsDataInteractor$dataFlow$$inlined$combine$1$3(Continuation continuation, a0 a0Var, Zone zone) {
        super(3, continuation);
        this.this$0 = a0Var;
        this.$zone$inlined = zone;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RouteStatsDataInteractor$dataFlow$$inlined$combine$1$3 routeStatsDataInteractor$dataFlow$$inlined$combine$1$3 = new RouteStatsDataInteractor$dataFlow$$inlined$combine$1$3((Continuation) obj3, this.this$0, this.$zone$inlined);
        routeStatsDataInteractor$dataFlow$$inlined$combine$1$3.L$0 = (vpr) obj;
        routeStatsDataInteractor$dataFlow$$inlined$combine$1$3.L$1 = (Object[]) obj2;
        return routeStatsDataInteractor$dataFlow$$inlined$combine$1$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Object[] objArr = (Object[]) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            Object obj4 = objArr[2];
            Object obj5 = objArr[3];
            Object obj6 = objArr[4];
            Object obj7 = objArr[5];
            Object obj8 = objArr[6];
            Object obj9 = objArr[7];
            Object obj10 = objArr[8];
            Object obj11 = objArr[9];
            Object obj12 = objArr[10];
            Object obj13 = objArr[11];
            Object obj14 = objArr[12];
            Object obj15 = objArr[13];
            long longValue = ((Number) obj14).longValue();
            AccountType accountType = (AccountType) obj13;
            long longValue2 = ((Number) obj12).longValue();
            String str = (String) obj11;
            jni jniVar = (jni) obj10;
            oje ojeVar = (oje) obj9;
            Boolean bool = (Boolean) obj8;
            bool.booleanValue();
            cia0 cia0Var = (cia0) obj7;
            gqe0 gqe0Var = (gqe0) obj6;
            String str2 = (String) obj5;
            List list = (List) obj4;
            w3l0 w3l0Var = (w3l0) obj3;
            String str3 = (String) obj2;
            ArrayList a = this.this$0.g.a();
            Zone zone = this.$zone$inlined;
            bbl0 bbl0Var = new bbl0(str3, zone, w3l0Var, list, this.this$0.c.a(zone, list), !this.this$0.d.b.d(this.$zone$inlined) ? null : str2, gqe0Var, cia0Var, a, false, bool, ojeVar, jniVar, str, longValue2, accountType, longValue);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (vprVar.emit(bbl0Var, this) == coroutineSingletons) {
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
