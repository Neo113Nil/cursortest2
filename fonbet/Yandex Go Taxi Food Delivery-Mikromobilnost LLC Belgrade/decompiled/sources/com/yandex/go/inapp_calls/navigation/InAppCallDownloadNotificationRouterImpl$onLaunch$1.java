package com.yandex.go.inapp_calls.navigation;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.b0;
import com.yandex.go.inapp_calls.experiment.InAppCallExperiment;
import com.yandex.go.inapp_calls.experiment.q;
import com.yandex.go.inapp_calls.repository.InAppCallsFeatureWrapper$State;
import com.yandex.go.inapp_calls.ui.notification.DownloadInAppCallsNotificationItemComponent;
import com.yandex.go.proxyprovision.j;
import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;
import defpackage.bvf0;
import defpackage.f1h0;
import defpackage.mvg;
import defpackage.njv;
import defpackage.ny61;
import defpackage.o950;
import defpackage.pz40;
import defpackage.qu;
import defpackage.tse;
import defpackage.tzt;
import defpackage.wls;
import defpackage.wz1;
import defpackage.x3z;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.notifications.local.LocalNotificationItemComponent;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.inapp_calls.navigation.InAppCallDownloadNotificationRouterImpl$onLaunch$1", f = "InAppCallDownloadNotificationRouterImpl.kt", l = {43, 48, 54, 66, HProv.ALG_SID_GR3410_12_256, CalendarDayView.DISABLED_DAY_ALPHA}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class InAppCallDownloadNotificationRouterImpl$onLaunch$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ c this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.inapp_calls.navigation.InAppCallDownloadNotificationRouterImpl$onLaunch$1$1", f = "InAppCallDownloadNotificationRouterImpl.kt", l = {70}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.inapp_calls.navigation.InAppCallDownloadNotificationRouterImpl$onLaunch$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ pz40 $terminateStateFlow;
        int label;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(c cVar, pz40 pz40Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = cVar;
            this.$terminateStateFlow = pz40Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$terminateStateFlow, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                kotlinx.coroutines.flow.internal.g c = this.this$0.E.c();
                pz40 pz40Var = this.$terminateStateFlow;
                this.label = 1;
                if (c.collect(pz40Var, this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.inapp_calls.navigation.InAppCallDownloadNotificationRouterImpl$onLaunch$1$2", f = "InAppCallDownloadNotificationRouterImpl.kt", l = {HProv.ALG_SID_SHA3_256}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.inapp_calls.navigation.InAppCallDownloadNotificationRouterImpl$onLaunch$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        final /* synthetic */ InAppCallExperiment $experiment;
        final /* synthetic */ pz40 $terminateStateFlow;
        int label;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(c cVar, InAppCallExperiment inAppCallExperiment, pz40 pz40Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = cVar;
            this.$experiment = inAppCallExperiment;
            this.$terminateStateFlow = pz40Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.this$0, this.$experiment, this.$terminateStateFlow, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                c cVar = this.this$0;
                InAppCallExperiment inAppCallExperiment = this.$experiment;
                cVar.getClass();
                InAppCallExperiment.UpdateNotificationConfig updateNotificationConfig = inAppCallExperiment.m;
                String i2 = InAppCallExperiment.i(inAppCallExperiment, updateNotificationConfig != null ? updateNotificationConfig.a : null);
                InAppCallExperiment.UpdateNotificationConfig updateNotificationConfig2 = inAppCallExperiment.m;
                String i3 = InAppCallExperiment.i(inAppCallExperiment, updateNotificationConfig2 != null ? updateNotificationConfig2.b : null);
                if ((i2 != null && i2.length() != 0) || (i3 != null && i3.length() != 0)) {
                    DownloadInAppCallsNotificationItemComponent downloadInAppCallsNotificationItemComponent = new DownloadInAppCallsNotificationItemComponent(cVar.D);
                    downloadInAppCallsNotificationItemComponent.init(i2, i3);
                    cVar.G.e(downloadInAppCallsNotificationItemComponent);
                }
                b bVar = new b(this.$terminateStateFlow);
                this.label = 1;
                obj = kotlinx.coroutines.flow.e.y(bVar, this);
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
            InAppCallsFeatureWrapper$State inAppCallsFeatureWrapper$State = (InAppCallsFeatureWrapper$State) obj;
            this.this$0.G.c("DOWNLOADING_NOTIFICATION_ID");
            InAppCallsFeatureWrapper$State inAppCallsFeatureWrapper$State2 = InAppCallsFeatureWrapper$State.READY;
            if (inAppCallsFeatureWrapper$State == inAppCallsFeatureWrapper$State2) {
                c cVar2 = this.this$0;
                InAppCallExperiment inAppCallExperiment2 = this.$experiment;
                cVar2.getClass();
                InAppCallExperiment.UpdateNotificationConfig updateNotificationConfig3 = inAppCallExperiment2.m;
                String i4 = InAppCallExperiment.i(inAppCallExperiment2, updateNotificationConfig3 != null ? updateNotificationConfig3.c : null);
                if (i4 != null && i4.length() != 0) {
                    LocalNotificationItemComponent localNotificationItemComponent = new LocalNotificationItemComponent(cVar2.D, null, 0, 6, null);
                    x3z x3zVar = new x3z();
                    x3zVar.a = i4;
                    x3zVar.c = f1h0.ic_success_change;
                    x3zVar.d = "DOWNLOAD_SUCCESS_NOTIFICATION_ID";
                    localNotificationItemComponent.init(x3zVar.a());
                    localNotificationItemComponent.startExpiresTimer();
                    localNotificationItemComponent.setExpiresListener(new wz1(7, cVar2));
                    ru.yandex.taxi.design.utils.c.z(new tzt(11, cVar2), localNotificationItemComponent);
                    cVar2.G.e(localNotificationItemComponent);
                }
            }
            this.this$0.H.e(inAppCallsFeatureWrapper$State == inAppCallsFeatureWrapper$State2, true, null, null);
            this.this$0.r(new qu(9));
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppCallDownloadNotificationRouterImpl$onLaunch$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        InAppCallDownloadNotificationRouterImpl$onLaunch$1 inAppCallDownloadNotificationRouterImpl$onLaunch$1 = new InAppCallDownloadNotificationRouterImpl$onLaunch$1(this.this$0, continuation);
        inAppCallDownloadNotificationRouterImpl$onLaunch$1.L$0 = obj;
        return inAppCallDownloadNotificationRouterImpl$onLaunch$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((InAppCallDownloadNotificationRouterImpl$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ce, code lost:
    
        if (com.yandex.go.inapp_calls.navigation.c.P(r11, r10) == r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a4, code lost:
    
        if (r11 == r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0082, code lost:
    
        if (r11 == r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0063, code lost:
    
        if (r11 == r1) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0120 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InAppCallExperiment inAppCallExperiment;
        pz40 pz40Var;
        o950 lifecycle;
        Lifecycle.State state;
        AnonymousClass2 anonymousClass2;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                kotlin.b.b(obj);
                j jVar = this.this$0.I;
                this.L$0 = tseVar;
                this.label = 1;
                obj = jVar.a(this);
                break;
            case 1:
                kotlin.b.b(obj);
                boolean booleanValue = ((Boolean) obj).booleanValue();
                c cVar = this.this$0;
                if (!booleanValue) {
                    q qVar = cVar.F;
                    this.L$0 = tseVar;
                    this.label = 2;
                    obj = qVar.d.b(this);
                    break;
                } else {
                    cVar.r(new qu(9));
                    return zy11Var;
                }
            case 2:
                kotlin.b.b(obj);
                inAppCallExperiment = (InAppCallExperiment) obj;
                InAppCallExperiment.Companion.getClass();
                InAppCallExperiment inAppCallExperiment2 = InAppCallExperiment.r;
                c cVar2 = this.this$0;
                if (inAppCallExperiment != inAppCallExperiment2) {
                    com.yandex.go.inapp_calls.repository.c cVar3 = cVar2.E;
                    this.L$0 = tseVar;
                    this.L$1 = inAppCallExperiment;
                    this.label = 3;
                    obj = cVar3.b(this);
                    break;
                } else {
                    cVar2.r(new qu(9));
                    return zy11Var;
                }
            case 3:
                inAppCallExperiment = (InAppCallExperiment) this.L$1;
                kotlin.b.b(obj);
                InAppCallsFeatureWrapper$State inAppCallsFeatureWrapper$State = (InAppCallsFeatureWrapper$State) obj;
                njv njvVar = this.this$0.H;
                InAppCallsFeatureWrapper$State inAppCallsFeatureWrapper$State2 = InAppCallsFeatureWrapper$State.READY;
                njvVar.d(null, null, inAppCallsFeatureWrapper$State == inAppCallsFeatureWrapper$State2);
                if (inAppCallsFeatureWrapper$State != inAppCallsFeatureWrapper$State2 && inAppCallsFeatureWrapper$State != InAppCallsFeatureWrapper$State.UNAVAILABLE) {
                    c cVar4 = this.this$0;
                    this.L$0 = tseVar;
                    this.L$1 = inAppCallExperiment;
                    this.L$2 = null;
                    this.label = 4;
                    break;
                } else {
                    this.this$0.r(new qu(9));
                    return zy11Var;
                }
                break;
            case 4:
                inAppCallExperiment = (InAppCallExperiment) this.L$1;
                kotlin.b.b(obj);
                r0 c = bvf0.c(InAppCallsFeatureWrapper$State.NOT_LOADED);
                com.yandex.go.coroutines.b.g(tseVar, null, null, new AnonymousClass1(this.this$0, c, null), 3);
                com.yandex.go.inapp_calls.repository.c cVar5 = this.this$0.E;
                this.L$0 = null;
                this.L$1 = inAppCallExperiment;
                this.L$2 = null;
                this.L$3 = c;
                this.label = 5;
                if (cVar5.a(this) != coroutineSingletons) {
                    pz40Var = c;
                    this.this$0.H.b(null, null, true);
                    lifecycle = this.this$0.getLifecycle();
                    state = Lifecycle.State.STARTED;
                    anonymousClass2 = new AnonymousClass2(this.this$0, inAppCallExperiment, pz40Var, null);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 6;
                    if (b0.b(lifecycle, state, anonymousClass2, this) != coroutineSingletons) {
                        return zy11Var;
                    }
                }
                return coroutineSingletons;
            case 5:
                pz40Var = (pz40) this.L$3;
                inAppCallExperiment = (InAppCallExperiment) this.L$1;
                kotlin.b.b(obj);
                this.this$0.H.b(null, null, true);
                lifecycle = this.this$0.getLifecycle();
                state = Lifecycle.State.STARTED;
                anonymousClass2 = new AnonymousClass2(this.this$0, inAppCallExperiment, pz40Var, null);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 6;
                if (b0.b(lifecycle, state, anonymousClass2, this) != coroutineSingletons) {
                    return coroutineSingletons;
                }
                break;
            case 6:
                kotlin.b.b(obj);
                return zy11Var;
            default:
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
