package com.yandex.go.scooters.live.notification;

import android.os.SystemClock;
import com.yandex.go.scooters.live.domain.model.ScootersLiveAction;
import defpackage.avj0;
import defpackage.axn0;
import defpackage.cvu0;
import defpackage.ea90;
import defpackage.kyh0;
import defpackage.lrj0;
import defpackage.mvg;
import defpackage.noh;
import defpackage.nrk0;
import defpackage.ny61;
import defpackage.se90;
import defpackage.tje;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zls;
import defpackage.zuj0;
import defpackage.zuo0;
import defpackage.zwn0;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.yandex.taxi.scooters.presentation.ontheway.domain.model.ScootersOnTheWayAction;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Ltpr;", "Lzwn0;", "<anonymous>", "(Ltse;)Ltpr;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.live.notification.ScootersLiveNotificationUiStateInteractor$uiStateFlow$2$1", f = "ScootersLiveNotificationUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersLiveNotificationUiStateInteractor$uiStateFlow$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ zuo0 $sessionState;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ axn0 this$0;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", RemoteBioParameters.TIME, "Lru/yandex/taxi/scooters/presentation/ontheway/domain/model/ScootersOnTheWayAction;", "inProgressAction", "Lzwn0;", "<anonymous>", "(Ljava/lang/String;Lru/yandex/taxi/scooters/presentation/ontheway/domain/model/ScootersOnTheWayAction;)Lzwn0;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.scooters.live.notification.ScootersLiveNotificationUiStateInteractor$uiStateFlow$2$1$1", f = "ScootersLiveNotificationUiStateInteractor.kt", l = {42}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.scooters.live.notification.ScootersLiveNotificationUiStateInteractor$uiStateFlow$2$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements zls {
        final /* synthetic */ zuo0 $sessionState;
        final /* synthetic */ noh $stableUiStateAsync;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ axn0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(axn0 axn0Var, noh nohVar, zuo0 zuo0Var, Continuation continuation) {
            super(3, continuation);
            this.this$0 = axn0Var;
            this.$stableUiStateAsync = nohVar;
            this.$sessionState = zuo0Var;
        }

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$stableUiStateAsync, this.$sessionState, (Continuation) obj3);
            anonymousClass1.L$0 = (String) obj;
            anonymousClass1.L$1 = (ScootersOnTheWayAction) obj2;
            return anonymousClass1.invokeSuspend(zy11.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            d dVar;
            String v;
            String str = (String) this.L$0;
            ScootersOnTheWayAction scootersOnTheWayAction = (ScootersOnTheWayAction) this.L$1;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            ScootersLiveAction scootersLiveAction = null;
            if (i == 0) {
                kotlin.b.b(obj);
                d dVar2 = this.this$0.c;
                noh nohVar = this.$stableUiStateAsync;
                this.L$0 = str;
                this.L$1 = scootersOnTheWayAction;
                this.L$2 = dVar2;
                this.label = 1;
                Object k = nohVar.k(this);
                if (k == coroutineSingletons) {
                    return coroutineSingletons;
                }
                dVar = dVar2;
                obj = k;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dVar = (d) this.L$2;
                kotlin.b.b(obj);
            }
            zwn0 zwn0Var = (zwn0) obj;
            zuo0 zuo0Var = this.$sessionState;
            zuj0 zuj0Var = dVar.c;
            if (zuo0Var instanceof lrj0) {
                v = cvu0.v(((avj0) zuj0Var).h(kyh0.scooters_live_notification_title_reservation), "$TIME$", str, false);
            } else if (zuo0Var instanceof ea90) {
                v = cvu0.v(cvu0.v(((avj0) zuj0Var).h(kyh0.scooters_live_notification_title_paid_reservation), "$TIME$", str, false), "$COST$", ((ea90) zuo0Var).w, false);
            } else if (zuo0Var instanceof nrk0) {
                v = cvu0.v(cvu0.v(((avj0) zuj0Var).h(kyh0.scooters_live_notification_title_riding), "$TIME$", str, false), "$COST$", ((nrk0) zuo0Var).w, false);
            } else {
                if (!(zuo0Var instanceof se90)) {
                    w511.b();
                    return null;
                }
                v = cvu0.v(cvu0.v(((avj0) zuj0Var).h(kyh0.scooters_live_notification_title_parking), "$TIME$", str, false), "$COST$", ((se90) zuo0Var).v, false);
            }
            String str2 = v;
            if (scootersOnTheWayAction != null) {
                Iterator<E> it = ScootersLiveAction.b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((ScootersLiveAction) next).getOnTheWayAction() == scootersOnTheWayAction) {
                        scootersLiveAction = next;
                        break;
                    }
                }
                scootersLiveAction = scootersLiveAction;
            }
            String str3 = zwn0Var.a;
            List list = zwn0Var.d;
            return new zwn0(str3, str2, zwn0Var.c, list, zwn0Var.e, scootersLiveAction, zwn0Var.g);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersLiveNotificationUiStateInteractor$uiStateFlow$2$1(axn0 axn0Var, zuo0 zuo0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = axn0Var;
        this.$sessionState = zuo0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersLiveNotificationUiStateInteractor$uiStateFlow$2$1 scootersLiveNotificationUiStateInteractor$uiStateFlow$2$1 = new ScootersLiveNotificationUiStateInteractor$uiStateFlow$2$1(this.this$0, this.$sessionState, continuation);
        scootersLiveNotificationUiStateInteractor$uiStateFlow$2$1.L$0 = obj;
        return scootersLiveNotificationUiStateInteractor$uiStateFlow$2$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersLiveNotificationUiStateInteractor$uiStateFlow$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        com.yandex.go.analytics.b bVar = this.this$0.a;
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("current_time_ms", new Long(SystemClock.elapsedRealtime()));
        bVar.b("Scooters.Live.UiStateInteractorUiStateFlowFlatMapLatest", mapBuilder.j());
        return new m0(this.this$0.b.d(this.$sessionState), e.d(this.this$0.e.c(this.$sessionState.getSessionId())), new AnonymousClass1(this.this$0, tje.h(tseVar, null, null, new ScootersLiveNotificationUiStateInteractor$uiStateFlow$2$1$stableUiStateAsync$1(this.this$0, this.$sessionState, null), 3), this.$sessionState, null));
    }
}
