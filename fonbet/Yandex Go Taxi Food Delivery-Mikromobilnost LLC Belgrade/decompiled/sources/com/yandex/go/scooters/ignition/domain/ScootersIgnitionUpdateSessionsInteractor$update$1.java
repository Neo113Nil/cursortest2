package com.yandex.go.scooters.ignition.domain;

import android.os.SystemClock;
import defpackage.ern0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qsn0;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zgz;
import defpackage.zuo0;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.ignition.domain.ScootersIgnitionUpdateSessionsInteractor$update$1", f = "ScootersIgnitionUpdateSessionsInteractor.kt", l = {43}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersIgnitionUpdateSessionsInteractor$update$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ qsn0 this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.scooters.ignition.domain.ScootersIgnitionUpdateSessionsInteractor$update$1$1", f = "ScootersIgnitionUpdateSessionsInteractor.kt", l = {33, 37, 39}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.scooters.ignition.domain.ScootersIgnitionUpdateSessionsInteractor$update$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        Object L$0;
        int label;
        final /* synthetic */ qsn0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(qsn0 qsn0Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = qsn0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0080, code lost:
        
            if (r9.a(r8) == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0082, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
        
            if (r1.a.emit(r9, r8) == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x003c, code lost:
        
            if (r9 == r0) goto L22;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                ScootersIgnitionUpdateSessionsInteractor$update$1$1$appearedSessionState$1 scootersIgnitionUpdateSessionsInteractor$update$1$1$appearedSessionState$1 = new ScootersIgnitionUpdateSessionsInteractor$update$1$1$appearedSessionState$1(this.this$0, null);
                this.label = 1;
                obj = kotlinx.coroutines.a.w(5000L, scootersIgnitionUpdateSessionsInteractor$update$1$1$appearedSessionState$1, this);
            } else if (i == 1) {
                kotlin.b.b(obj);
            } else {
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                kotlin.b.b(obj);
                com.yandex.go.analytics.b bVar = this.this$0.b;
                MapBuilder mapBuilder = new MapBuilder();
                mapBuilder.put("current_time_ms", new Long(SystemClock.elapsedRealtime()));
                bVar.b("Scooters.Live.IgnitionNewSession", mapBuilder.j());
                com.yandex.go.scooters.live.domain.c cVar = this.this$0.c;
                this.L$0 = null;
                this.label = 3;
            }
            zuo0 zuo0Var = (zuo0) obj;
            if (zuo0Var != null) {
                ern0 ern0Var = this.this$0.f;
                this.L$0 = null;
                this.label = 2;
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersIgnitionUpdateSessionsInteractor$update$1(qsn0 qsn0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = qsn0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersIgnitionUpdateSessionsInteractor$update$1 scootersIgnitionUpdateSessionsInteractor$update$1 = new ScootersIgnitionUpdateSessionsInteractor$update$1(this.this$0, continuation);
        scootersIgnitionUpdateSessionsInteractor$update$1.L$0 = obj;
        return scootersIgnitionUpdateSessionsInteractor$update$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersIgnitionUpdateSessionsInteractor$update$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                tje.N(tseVar, null, null, new AnonymousClass1(this.this$0, null), 3);
                ru.yandex.taxi.scooters.domain.e eVar = this.this$0.d;
                this.L$0 = null;
                this.label = 1;
                if (eVar.a.a(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            zgz.a(null, th);
        }
        return zy11.a;
    }
}
