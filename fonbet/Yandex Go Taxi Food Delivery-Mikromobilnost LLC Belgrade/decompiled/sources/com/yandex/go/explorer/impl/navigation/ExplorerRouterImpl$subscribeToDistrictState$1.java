package com.yandex.go.explorer.impl.navigation;

import com.yandex.go.explorer.impl.ui.map.m;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qto;
import defpackage.rto;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.wuo;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.explorer.impl.navigation.ExplorerRouterImpl$subscribeToDistrictState$1", f = "ExplorerRouterImpl.kt", l = {161}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ExplorerRouterImpl$subscribeToDistrictState$1 extends SuspendLambda implements wls {
    final /* synthetic */ rto $districtRepo;
    final /* synthetic */ m $uiStateProvider;
    int label;
    final /* synthetic */ c this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqto;", "districtState", "Lzy11;", "<anonymous>", "(Lqto;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.explorer.impl.navigation.ExplorerRouterImpl$subscribeToDistrictState$1$1", f = "ExplorerRouterImpl.kt", l = {165}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.explorer.impl.navigation.ExplorerRouterImpl$subscribeToDistrictState$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ m $uiStateProvider;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(c cVar, m mVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = cVar;
            this.$uiStateProvider = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$uiStateProvider, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((qto) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            qto qtoVar = (qto) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                if (qtoVar == null) {
                    this.this$0.E.c.l(null);
                    return zy11.a;
                }
                m mVar = this.$uiStateProvider;
                this.L$0 = qtoVar;
                this.label = 1;
                obj = mVar.a(this);
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
            wuo wuoVar = this.this$0.E;
            wuoVar.c.l(qto.a(qtoVar, false, (String) obj, 7));
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExplorerRouterImpl$subscribeToDistrictState$1(rto rtoVar, c cVar, m mVar, Continuation continuation) {
        super(2, continuation);
        this.$districtRepo = rtoVar;
        this.this$0 = cVar;
        this.$uiStateProvider = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ExplorerRouterImpl$subscribeToDistrictState$1(this.$districtRepo, this.this$0, this.$uiStateProvider, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ExplorerRouterImpl$subscribeToDistrictState$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr t = e.t(this.$districtRepo.b);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$uiStateProvider, null);
            this.label = 1;
            if (e.k(t, anonymousClass1, this) == coroutineSingletons) {
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
