package com.yandex.go.chargers.station.presentation.details;

import com.yandex.go.chargers.data.i;
import com.yandex.go.chargers.data.j;
import defpackage.bra;
import defpackage.gra;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sra;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import ru.yandex.video.m3.preload_manager.PreloadManagerBuilder;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.station.presentation.details.ChargersStationDetailsPresenter$startFooterTimerUpdates$1", f = "ChargersStationDetailsPresenter.kt", l = {PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersStationDetailsPresenter$startFooterTimerUpdates$1 extends SuspendLambda implements wls {
    final /* synthetic */ bra $orderDetails;
    final /* synthetic */ gra $stationDetails;
    final /* synthetic */ String $timerKey;
    int label;
    final /* synthetic */ sra this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersStationDetailsPresenter$startFooterTimerUpdates$1(sra sraVar, String str, gra graVar, bra braVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = sraVar;
        this.$timerKey = str;
        this.$stationDetails = graVar;
        this.$orderDetails = braVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersStationDetailsPresenter$startFooterTimerUpdates$1(this.this$0, this.$timerKey, this.$stationDetails, this.$orderDetails, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersStationDetailsPresenter$startFooterTimerUpdates$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            j jVar = this.this$0.C;
            tpr t = e.t(new i(jVar.b, this.$timerKey));
            b bVar = new b(this.this$0, this.$stationDetails, this.$orderDetails, this.$timerKey);
            this.label = 1;
            if (t.collect(bVar, this) == coroutineSingletons) {
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
