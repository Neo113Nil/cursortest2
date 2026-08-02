package com.yandex.go.chargers.order.completion.pre_finish.domain;

import com.yandex.go.chargers.data.f;
import com.yandex.go.chargers.data.model.ChargersStationDto;
import com.yandex.go.chargers.order.completion.pre_finish.data.ChargersFinishApi;
import com.yandex.go.chargers.order.completion.pre_finish.data.model.ChargersPreFinishParams;
import defpackage.ena;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tsa;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lcom/yandex/go/chargers/order/completion/pre_finish/data/model/ChargersPreFinishResponse;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.order.completion.pre_finish.domain.ChargersFinishUiStateInteractor$listenPreFinishState$1", f = "ChargersFinishUiStateInteractor.kt", l = {56, 56}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersFinishUiStateInteractor$listenPreFinishState$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $orderId;
    final /* synthetic */ tsa $stationNumber;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersFinishUiStateInteractor$listenPreFinishState$1(b bVar, String str, tsa tsaVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$orderId = str;
        this.$stationNumber = tsaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChargersFinishUiStateInteractor$listenPreFinishState$1 chargersFinishUiStateInteractor$listenPreFinishState$1 = new ChargersFinishUiStateInteractor$listenPreFinishState$1(this.this$0, this.$orderId, this.$stationNumber, continuation);
        chargersFinishUiStateInteractor$listenPreFinishState$1.L$0 = obj;
        return chargersFinishUiStateInteractor$listenPreFinishState$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersFinishUiStateInteractor$listenPreFinishState$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006a, code lost:
    
        if (r0.emit(r12, r11) == r1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        if (r12 == r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ena enaVar = this.this$0.e;
            String str = this.$orderId;
            tsa tsaVar = this.$stationNumber;
            this.L$0 = null;
            this.L$1 = vprVar;
            this.label = 1;
            ChargersFinishApi chargersFinishApi = (ChargersFinishApi) enaVar.a.get();
            enaVar.b.getClass();
            obj = ru.yandex.taxi.network.api.a.d(chargersFinishApi.b(new ChargersPreFinishParams(str, new ChargersStationDto(tsaVar.a, tsaVar.b, tsaVar.c)), f.e()), this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar = (vpr) this.L$1;
            kotlin.b.b(obj);
        }
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }
}
