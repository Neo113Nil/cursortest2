package com.yandex.go;

import com.yandex.go.config.i;
import defpackage.jqr;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.po21;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.wnp0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.analytics.n;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.LocationSdkController$init$1", f = "LocationSdkController.kt", l = {HProv.ALG_SID_SHA3_256, HProv.ALG_SID_SHA3_384}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class LocationSdkController$init$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ g this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.LocationSdkController$init$1$1", f = "LocationSdkController.kt", l = {HProv.ALG_SID_SHA3_224}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.LocationSdkController$init$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ g this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(g gVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
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
                i iVar = this.this$0.e;
                this.label = 1;
                if (iVar.d(this) == coroutineSingletons) {
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
    @mvg(c = "com.yandex.go.LocationSdkController$init$1$2", f = "LocationSdkController.kt", l = {81}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.LocationSdkController$init$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        final /* synthetic */ wnp0 $config;
        int label;
        final /* synthetic */ g this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(g gVar, wnp0 wnp0Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = gVar;
            this.$config = wnp0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.this$0, this.$config, continuation);
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
                com.yandex.go.sdk.a h = this.this$0.h();
                boolean z = this.$config.c;
                this.label = 1;
                if (h.a(z, this) == coroutineSingletons) {
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
    @mvg(c = "com.yandex.go.LocationSdkController$init$1$3", f = "LocationSdkController.kt", l = {82}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.LocationSdkController$init$1$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ g this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(g gVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass3(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                g gVar = this.this$0;
                this.label = 1;
                if (kotlinx.coroutines.flow.e.j(ru.yandex.taxi.locationsdk.core.utils.a.a(new jqr(new jqr(new f(new mth(ru.yandex.taxi.locationsdk.core.output_location_provider.a.a(gVar.h().c), 6), gVar), new LocationSdkController$requestOutputLocationsAndPushToFlow$3(gVar, null), 3), new LocationSdkController$requestOutputLocationsAndPushToFlow$4(gVar, null), 3), gVar.c, "LocationSdkController/requestOutput"), this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationSdkController$init$1(g gVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LocationSdkController$init$1 locationSdkController$init$1 = new LocationSdkController$init$1(this.this$0, continuation);
        locationSdkController$init$1.L$0 = obj;
        return locationSdkController$init$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LocationSdkController$init$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        if (r8 == r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        wnp0 wnp0Var;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tje.N(tseVar, null, null, new AnonymousClass1(this.this$0, null), 3);
            i iVar = this.this$0.e;
            this.L$0 = tseVar;
            this.label = 1;
            obj = kotlinx.coroutines.flow.e.y(new com.yandex.go.config.f(iVar.d), this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wnp0Var = (wnp0) this.L$1;
                kotlin.b.b(obj);
                tje.N(tseVar, null, null, new AnonymousClass2(this.this$0, wnp0Var, null), 3);
                tje.N(tseVar, null, null, new AnonymousClass3(this.this$0, null), 3);
                n nVar = (n) this.this$0.g.get();
                nVar.m.set(true);
                nVar.n.set(true);
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        wnp0 wnp0Var2 = (wnp0) obj;
        po21 po21Var = this.this$0.b;
        this.L$0 = tseVar;
        this.L$1 = wnp0Var2;
        this.label = 2;
        if (((ru.yandex.taxi.preorder.source.userposition.e) po21Var).d(this) != coroutineSingletons) {
            wnp0Var = wnp0Var2;
            tje.N(tseVar, null, null, new AnonymousClass2(this.this$0, wnp0Var, null), 3);
            tje.N(tseVar, null, null, new AnonymousClass3(this.this$0, null), 3);
            n nVar2 = (n) this.this$0.g.get();
            nVar2.m.set(true);
            nVar2.n.set(true);
            return zy11.a;
        }
        return coroutineSingletons;
    }
}
