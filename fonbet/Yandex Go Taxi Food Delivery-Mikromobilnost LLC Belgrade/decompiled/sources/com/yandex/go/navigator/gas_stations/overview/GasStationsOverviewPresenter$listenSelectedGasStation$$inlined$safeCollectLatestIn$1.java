package com.yandex.go.navigator.gas_stations.overview;

import com.yandex.go.navigator.gas_stations.models.GasStationSearchType;
import com.yandex.mapkit.GeoObject;
import defpackage.gvs;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.gas_stations.overview.GasStationsOverviewPresenter$listenSelectedGasStation$$inlined$safeCollectLatestIn$1", f = "GasStationsOverviewPresenter.kt", l = {32}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
public final class GasStationsOverviewPresenter$listenSelectedGasStation$$inlined$safeCollectLatestIn$1 extends SuspendLambda implements wls {
    final /* synthetic */ tpr $this_safeCollectLatestIn;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ h this$0;

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lvpr;", "", "cause", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.navigator.gas_stations.overview.GasStationsOverviewPresenter$listenSelectedGasStation$$inlined$safeCollectLatestIn$1$1", f = "GasStationsOverviewPresenter.kt", l = {28}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.navigator.gas_stations.overview.GasStationsOverviewPresenter$listenSelectedGasStation$$inlined$safeCollectLatestIn$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements zls {
        final /* synthetic */ wls $onError;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(wls wlsVar, Continuation continuation) {
            super(3, continuation);
            this.$onError = wlsVar;
        }

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onError, (Continuation) obj3);
            anonymousClass1.L$0 = (Throwable) obj2;
            return anonymousClass1.invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Throwable th = (Throwable) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                wls wlsVar = this.$onError;
                this.L$0 = null;
                this.label = 1;
                if (wlsVar.invoke(th, this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n"}, d2 = {"T", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.navigator.gas_stations.overview.GasStationsOverviewPresenter$listenSelectedGasStation$$inlined$safeCollectLatestIn$1$2", f = "GasStationsOverviewPresenter.kt", l = {33, 34}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.navigator.gas_stations.overview.GasStationsOverviewPresenter$listenSelectedGasStation$$inlined$safeCollectLatestIn$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final /* synthetic */ h this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(h hVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create(obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
        
            if (com.yandex.go.navigator.gas_stations.overview.h.Lg(r0, r7, r6) == r1) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
        
            if (com.yandex.go.navigator.gas_stations.overview.h.Mg(r0, r7, r6) == r1) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object obj2 = this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                Pair pair = (Pair) obj2;
                GeoObject geoObject = (GeoObject) pair.getFirst();
                int i2 = gvs.a[((GasStationSearchType) pair.getSecond()).ordinal()];
                if (i2 == 1) {
                    h hVar = this.this$0;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 1;
                } else {
                    if (i2 != 2) {
                        w511.b();
                        return null;
                    }
                    h hVar2 = this.this$0;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 2;
                }
            } else {
                if (i != 1 && i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GasStationsOverviewPresenter$listenSelectedGasStation$$inlined$safeCollectLatestIn$1(tpr tprVar, Continuation continuation, h hVar) {
        super(2, continuation);
        this.$this_safeCollectLatestIn = tprVar;
        this.this$0 = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GasStationsOverviewPresenter$listenSelectedGasStation$$inlined$safeCollectLatestIn$1(this.$this_safeCollectLatestIn, continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GasStationsOverviewPresenter$listenSelectedGasStation$$inlined$safeCollectLatestIn$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            o oVar = new o(this.$this_safeCollectLatestIn, new AnonymousClass1(com.yandex.go.coroutines.b.e(), null));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.k(oVar, anonymousClass2, this) == coroutineSingletons) {
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
