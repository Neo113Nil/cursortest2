package com.yandex.go.scooters.live.notification;

import com.yandex.go.scooters.live.domain.model.ScootersLiveAction;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.ea90;
import defpackage.lrj0;
import defpackage.mvg;
import defpackage.nrk0;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.scc;
import defpackage.se90;
import defpackage.tje;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.ywn0;
import defpackage.zuo0;
import defpackage.zwn0;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzwn0;", "<anonymous>", "(Ltse;)Lzwn0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.live.notification.ScootersLiveNotificationUiStateMapper$mapToStableUiState$2", f = "ScootersLiveNotificationUiStateMapper.kt", l = {44, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE, 66, HProv.ALG_SID_SHA3_224}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersLiveNotificationUiStateMapper$mapToStableUiState$2 extends SuspendLambda implements wls {
    final /* synthetic */ zuo0 $sessionState;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersLiveNotificationUiStateMapper$mapToStableUiState$2(zuo0 zuo0Var, d dVar, Continuation continuation) {
        super(2, continuation);
        this.$sessionState = zuo0Var;
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersLiveNotificationUiStateMapper$mapToStableUiState$2 scootersLiveNotificationUiStateMapper$mapToStableUiState$2 = new ScootersLiveNotificationUiStateMapper$mapToStableUiState$2(this.$sessionState, this.this$0, continuation);
        scootersLiveNotificationUiStateMapper$mapToStableUiState$2.L$0 = obj;
        return scootersLiveNotificationUiStateMapper$mapToStableUiState$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersLiveNotificationUiStateMapper$mapToStableUiState$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        List g;
        List list;
        String str2;
        List g2;
        List list2;
        List list3;
        String str3;
        List list4;
        List list5;
        String str4;
        List list6;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                List list7 = (List) this.L$4;
                List list8 = (List) this.L$3;
                String str5 = (String) this.L$2;
                kotlin.b.b(obj);
                list5 = list8;
                list6 = list7;
                str4 = str5;
                return new zwn0(str4, "", list5, list6, (ywn0) obj, null, false);
            }
            if (i == 2) {
                List list9 = (List) this.L$4;
                List list10 = (List) this.L$3;
                String str6 = (String) this.L$2;
                kotlin.b.b(obj);
                list3 = list10;
                list4 = list9;
                str3 = str6;
                return new zwn0(str3, "", list3, list4, (ywn0) obj, null, false);
            }
            if (i == 3) {
                g2 = (List) this.L$4;
                List list11 = (List) this.L$3;
                str2 = (String) this.L$2;
                kotlin.b.b(obj);
                list2 = list11;
                return new zwn0(str2, "", list2, g2, (ywn0) obj, null, true);
            }
            if (i != 4) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g = (List) this.L$4;
            List list12 = (List) this.L$3;
            str = (String) this.L$2;
            kotlin.b.b(obj);
            list = list12;
            return new zwn0(str, "", list, g, (ywn0) obj, null, false);
        }
        kotlin.b.b(obj);
        qoh h = tje.h(tseVar, null, null, new ScootersLiveNotificationUiStateMapper$mapToStableUiState$2$vehicleInfoAsync$1(this.$sessionState, this.this$0, null), 3);
        zuo0 zuo0Var = this.$sessionState;
        if (zuo0Var instanceof lrj0) {
            String str7 = ((lrj0) zuo0Var).b;
            ScootersLiveAction scootersLiveAction = ScootersLiveAction.START;
            ScootersLiveAction scootersLiveAction2 = ScootersLiveAction.CANCEL;
            List g3 = scc.g(scootersLiveAction, scootersLiveAction2);
            List g4 = scc.g(ScootersLiveAction.BEEP, scootersLiveAction, scootersLiveAction2);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = str7;
            this.L$3 = g3;
            this.L$4 = g4;
            this.label = 1;
            obj = h.s(this);
            if (obj != coroutineSingletons) {
                list5 = g3;
                str4 = str7;
                list6 = g4;
                return new zwn0(str4, "", list5, list6, (ywn0) obj, null, false);
            }
        } else if (zuo0Var instanceof ea90) {
            String str8 = ((ea90) zuo0Var).b;
            ScootersLiveAction scootersLiveAction3 = ScootersLiveAction.START;
            ScootersLiveAction scootersLiveAction4 = ScootersLiveAction.CANCEL;
            List g5 = scc.g(scootersLiveAction3, scootersLiveAction4);
            List g6 = scc.g(ScootersLiveAction.BEEP, scootersLiveAction3, scootersLiveAction4);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = str8;
            this.L$3 = g5;
            this.L$4 = g6;
            this.label = 2;
            obj = h.s(this);
            if (obj != coroutineSingletons) {
                list3 = g5;
                str3 = str8;
                list4 = g6;
                return new zwn0(str3, "", list3, list4, (ywn0) obj, null, false);
            }
        } else if (zuo0Var instanceof nrk0) {
            str2 = ((nrk0) zuo0Var).b;
            ScootersLiveAction scootersLiveAction5 = ScootersLiveAction.FINISH;
            ScootersLiveAction scootersLiveAction6 = ScootersLiveAction.PAUSE;
            List g7 = scc.g(scootersLiveAction5, scootersLiveAction6);
            g2 = scc.g(ScootersLiveAction.ROUTE, scootersLiveAction5, scootersLiveAction6);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = str2;
            this.L$3 = g7;
            this.L$4 = g2;
            this.label = 3;
            obj = h.s(this);
            if (obj != coroutineSingletons) {
                list2 = g7;
                return new zwn0(str2, "", list2, g2, (ywn0) obj, null, true);
            }
        } else {
            if (!(zuo0Var instanceof se90)) {
                w511.b();
                return null;
            }
            str = ((se90) zuo0Var).b;
            ScootersLiveAction scootersLiveAction7 = ScootersLiveAction.FINISH;
            ScootersLiveAction scootersLiveAction8 = ScootersLiveAction.CONTINUE;
            List g8 = scc.g(scootersLiveAction7, scootersLiveAction8);
            g = scc.g(ScootersLiveAction.ROUTE, scootersLiveAction7, scootersLiveAction8);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = str;
            this.L$3 = g8;
            this.L$4 = g;
            this.label = 4;
            obj = h.s(this);
            if (obj != coroutineSingletons) {
                list = g8;
                return new zwn0(str, "", list, g, (ywn0) obj, null, false);
            }
        }
        return coroutineSingletons;
    }
}
