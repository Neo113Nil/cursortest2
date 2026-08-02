package com.yandex.go.scooters.live;

import android.app.Notification;
import android.os.SystemClock;
import com.yandex.go.scooters.live.notification.ScootersLiveNotificationUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.axn0;
import defpackage.bxn0;
import defpackage.dxn0;
import defpackage.exn0;
import defpackage.jqr;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qxm0;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.tse0;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzf;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.live.ScootersLivePresenter$onStartCommand$2", f = "ScootersLivePresenter.kt", l = {69}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersLivePresenter$onStartCommand$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ bxn0 this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.scooters.live.ScootersLivePresenter$onStartCommand$2$1", f = "ScootersLivePresenter.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.scooters.live.ScootersLivePresenter$onStartCommand$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        Object L$0;
        int label;
        final /* synthetic */ bxn0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(bxn0 bxn0Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = bxn0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(1:(1:4)(2:30|31))(4:32|(2:34|(1:36)(1:37))|15|16)|5|(1:29)(1:9)|10|(1:12)(1:28)|13|14|15|16|(1:(1:23))) */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
        
            r6 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x007d, code lost:
        
            defpackage.zgz.a("Using fallback", r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0082, code lost:
        
            r0.a(1, r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0086, code lost:
        
            r6 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0087, code lost:
        
            defpackage.zgz.a("Fallback failed", r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
        
            r6 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0076, code lost:
        
            defpackage.zgz.a("Unknown case", r6);
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            dxn0 dxn0Var;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                com.yandex.go.analytics.b bVar = this.this$0.b;
                MapBuilder mapBuilder = new MapBuilder();
                mapBuilder.put("current_time_ms", new Long(SystemClock.elapsedRealtime()));
                bVar.b("Scooters.Live.PresenterStartForeground", mapBuilder.j());
                bxn0 bxn0Var = this.this$0;
                dxn0 dxn0Var2 = bxn0Var.j;
                if (dxn0Var2 != null) {
                    com.yandex.go.scooters.live.notification.a aVar = bxn0Var.f;
                    this.L$0 = dxn0Var2;
                    this.label = 1;
                    obj = aVar.b(this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    dxn0Var = dxn0Var2;
                }
                return zy11.a;
            }
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dxn0Var = (dxn0) this.L$0;
            kotlin.b.b(obj);
            Notification notification = (Notification) obj;
            boolean z = this.this$0.e.b() && this.this$0.e.i();
            dxn0Var.getClass();
            dxn0Var.a(z ? 8 : 1, notification);
            return zy11.a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.scooters.live.ScootersLivePresenter$onStartCommand$2$2", f = "ScootersLivePresenter.kt", l = {65}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.scooters.live.ScootersLivePresenter$onStartCommand$2$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ bxn0 this$0;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/app/Notification;", "it", "Lzy11;", "<anonymous>", "(Landroid/app/Notification;)V"}, k = 3, mv = {2, 4, 0})
        @mvg(c = "com.yandex.go.scooters.live.ScootersLivePresenter$onStartCommand$2$2$2", f = "ScootersLivePresenter.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.yandex.go.scooters.live.ScootersLivePresenter$onStartCommand$2$2$2, reason: invalid class name and collision with other inner class name */
        final class C00682 extends SuspendLambda implements wls {
            int label;
            final /* synthetic */ bxn0 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00682(bxn0 bxn0Var, Continuation continuation) {
                super(2, continuation);
                this.this$0 = bxn0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C00682(this.this$0, continuation);
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                C00682 c00682 = (C00682) create((Notification) obj, (Continuation) obj2);
                zy11 zy11Var = zy11.a;
                c00682.invokeSuspend(zy11Var);
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
                com.yandex.go.analytics.b bVar = this.this$0.b;
                MapBuilder mapBuilder = new MapBuilder();
                mapBuilder.put("current_time_ms", new Long(SystemClock.elapsedRealtime()));
                bVar.b("Scooters.Live.PresenterUiStateFirstEmit", mapBuilder.j());
                qxm0 qxm0Var = this.this$0.c;
                qxm0Var.a.a("Scooters.LiveActivity.Opened", tse0.p(qxm0Var), 1, new HashMap());
                return zy11.a;
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/app/Notification;", "it", "Lzy11;", "<anonymous>", "(Landroid/app/Notification;)V"}, k = 3, mv = {2, 4, 0})
        @mvg(c = "com.yandex.go.scooters.live.ScootersLivePresenter$onStartCommand$2$2$3", f = "ScootersLivePresenter.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.yandex.go.scooters.live.ScootersLivePresenter$onStartCommand$2$2$3, reason: invalid class name */
        final class AnonymousClass3 extends SuspendLambda implements wls {
            int label;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass3(2, continuation);
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                AnonymousClass3 anonymousClass3 = (AnonymousClass3) create((Notification) obj, (Continuation) obj2);
                zy11 zy11Var = zy11.a;
                anonymousClass3.invokeSuspend(zy11Var);
                return zy11Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label == 0) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(bxn0 bxn0Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = bxn0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.this$0, continuation);
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
                com.yandex.go.analytics.b bVar = this.this$0.b;
                MapBuilder mapBuilder = new MapBuilder();
                mapBuilder.put("current_time_ms", new Long(SystemClock.elapsedRealtime()));
                bVar.b("Scooters.Live.PresenterListenUiState", mapBuilder.j());
                axn0 axn0Var = this.this$0.h;
                com.yandex.go.analytics.b bVar2 = axn0Var.a;
                MapBuilder mapBuilder2 = new MapBuilder();
                mapBuilder2.put("current_time_ms", Long.valueOf(SystemClock.elapsedRealtime()));
                bVar2.b("Scooters.Live.UiStateInteractorUiStateFlow", mapBuilder2.j());
                g X = e.X(new com.yandex.go.scooters.live.notification.c(axn0Var.d.b(true)), new ScootersLiveNotificationUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1(null, axn0Var));
                bxn0 bxn0Var = this.this$0;
                jqr c = com.yandex.go.coroutines.b.c(new c(X, bxn0Var), new C00682(bxn0Var, null));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(2, null);
                this.label = 1;
                if (e.k(c, anonymousClass3, this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "isActive"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @mvg(c = "com.yandex.go.scooters.live.ScootersLivePresenter$onStartCommand$2$3", f = "ScootersLivePresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.scooters.live.ScootersLivePresenter$onStartCommand$2$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements wls {
        /* synthetic */ boolean Z$0;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(2, continuation);
            anonymousClass3.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass3;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            return ((AnonymousClass3) create(bool, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z = this.Z$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                kotlin.b.b(obj);
                return Boolean.valueOf(!z);
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersLivePresenter$onStartCommand$2(bxn0 bxn0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bxn0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersLivePresenter$onStartCommand$2 scootersLivePresenter$onStartCommand$2 = new ScootersLivePresenter$onStartCommand$2(this.this$0, continuation);
        scootersLivePresenter$onStartCommand$2.L$0 = obj;
        return scootersLivePresenter$onStartCommand$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersLivePresenter$onStartCommand$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        exn0 dependencies;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tje.N(tseVar, null, null, new AnonymousClass1(this.this$0, null), 3);
            tje.N(tseVar, null, null, new AnonymousClass2(this.this$0, null), 3);
            com.yandex.go.analytics.b bVar = this.this$0.b;
            MapBuilder mapBuilder = new MapBuilder();
            mapBuilder.put("current_time_ms", new Long(SystemClock.elapsedRealtime()));
            bVar.b("Scooters.Live.PresenterStartWaitNotActiveLiveFlow", mapBuilder.j());
            tpr c = this.this$0.g.c();
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(2, null);
            this.L$0 = null;
            this.label = 1;
            if (e.x(c, anonymousClass3, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        dxn0 dxn0Var = this.this$0.j;
        if (dxn0Var != null) {
            ScootersLiveService scootersLiveService = dxn0Var.a;
            dependencies = scootersLiveService.getDependencies();
            com.yandex.go.analytics.b r = ((zzf) dependencies).r();
            MapBuilder mapBuilder2 = new MapBuilder();
            mapBuilder2.put("current_time_ms", Long.valueOf(SystemClock.elapsedRealtime()));
            r.b("Scooters.Live.StopService", mapBuilder2.j());
            scootersLiveService.stopSelf();
        }
        return zy11.a;
    }
}
