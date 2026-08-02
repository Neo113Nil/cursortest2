package com.yandex.go.navigator.map_interactions.long_taps;

import com.yandex.go.address.models.Address;
import defpackage.atd0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.uzs;
import defpackage.wls;
import defpackage.ynz;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.persuggest.api.finalsuggest.Action;
import ru.yandex.taxi.persuggest.api.finalsuggest.PositionInitAction;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/go/address/models/Address;", "<anonymous>", "(Ltse;)Lcom/yandex/go/address/models/Address;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.map_interactions.long_taps.LongTapPresenter$getPointAddress$1", f = "LongTapPresenter.kt", l = {85}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class LongTapPresenter$getPointAddress$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ ynz this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LongTapPresenter$getPointAddress$1(ynz ynzVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = ynzVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LongTapPresenter$getPointAddress$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LongTapPresenter$getPointAddress$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            uzs uzsVar = zzs.Companion;
            double latitude = this.this$0.x.getLatitude();
            double longitude = this.this$0.x.getLongitude();
            uzsVar.getClass();
            zzs zzsVar = (Double.isNaN(latitude) || Double.isNaN(longitude)) ? null : new zzs(latitude, longitude, 0, null, null, 12);
            if (zzsVar == null) {
                return null;
            }
            ynz ynzVar = this.this$0;
            c cVar = new c(atd0.c(ynzVar.y, zzsVar, RoutePointType.SERVICE_NAVIGATOR_B, PositionInitAction.MAP, Action.PIN_DROP, null, null, 48), zzsVar, ynzVar);
            this.L$0 = null;
            this.label = 1;
            obj = kotlinx.coroutines.flow.e.y(cVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return (Address) obj;
    }
}
