package com.yandex.go.mainscreen.superapp.impl.foundation.presentation;

import com.yandex.go.flex.main_screen.data.sticky.SectionUpdaterRepository;
import com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain.v;
import defpackage.av0;
import defpackage.c2t;
import defpackage.f2t;
import defpackage.hay0;
import defpackage.lcw0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pcw0;
import defpackage.pzt0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.w4q0;
import defpackage.wls;
import defpackage.y1t;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.mainscreen.superapp.impl.foundation.presentation.SuperAppMainScreenPresenter$observeReloadingRequests$$inlined$collectLatestIn$1", f = "SuperAppMainScreenPresenter.kt", l = {54}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class SuperAppMainScreenPresenter$observeReloadingRequests$$inlined$collectLatestIn$1 extends SuspendLambda implements wls {
    final /* synthetic */ tpr $this_collectLatestIn;
    int label;
    final /* synthetic */ e this$0;

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n"}, d2 = {"T", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.mainscreen.superapp.impl.foundation.presentation.SuperAppMainScreenPresenter$observeReloadingRequests$$inlined$collectLatestIn$1$1", f = "SuperAppMainScreenPresenter.kt", l = {59, 64}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.mainscreen.superapp.impl.foundation.presentation.SuperAppMainScreenPresenter$observeReloadingRequests$$inlined$collectLatestIn$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        final /* synthetic */ e this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(e eVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create(obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x00d5, code lost:
        
            if (r9.b(r8) == r2) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x00d7, code lost:
        
            return r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00a8, code lost:
        
            if (ru.yandex.taxi.persuggest.repository.b.a(r9, r1, r8) == r2) goto L27;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            w4q0 w4q0Var = w4q0.d;
            Object obj2 = this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                boolean z = this.this$0.H.a.c;
                e eVar = this.this$0;
                if (!z) {
                    boolean z2 = eVar.C.b.c().h() != null;
                    e eVar2 = this.this$0;
                    if (z2) {
                        ((SectionUpdaterRepository) eVar2.E).a(w4q0Var);
                    } else {
                        pzt0 pzt0Var = eVar2.q0;
                        if (pzt0Var != null) {
                            pzt0Var.a(null);
                        }
                        pzt0 pzt0Var2 = eVar2.r0;
                        if (pzt0Var2 != null) {
                            pzt0Var2.a(null);
                        }
                        eVar2.r0 = com.yandex.go.coroutines.b.g(eVar2.Jg(), null, null, new SuperAppMainScreenPresenter$listenToAddress$1(eVar2, null), 3);
                        eVar2.q0 = com.yandex.go.coroutines.b.g(eVar2.Jg(), null, null, new SuperAppMainScreenPresenter$listenToUserLocation$1(eVar2, null), 3);
                    }
                    return zy11.a;
                }
                if (((c2t) ((f2t) eVar.g0.a).g.a.getValue()) instanceof y1t) {
                    e eVar3 = this.this$0;
                    pzt0 pzt0Var3 = eVar3.q0;
                    if (pzt0Var3 != null) {
                        pzt0Var3.a(null);
                    }
                    pzt0 pzt0Var4 = eVar3.r0;
                    if (pzt0Var4 != null) {
                        pzt0Var4.a(null);
                    }
                    eVar3.r0 = com.yandex.go.coroutines.b.g(eVar3.Jg(), null, null, new SuperAppMainScreenPresenter$listenToAddress$1(eVar3, null), 3);
                    eVar3.q0 = com.yandex.go.coroutines.b.g(eVar3.Jg(), null, null, new SuperAppMainScreenPresenter$listenToUserLocation$1(eVar3, null), 3);
                    hay0 hay0Var = this.this$0.g0;
                    av0 av0Var = av0.L;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 1;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    ((SectionUpdaterRepository) this.this$0.E).a(w4q0Var);
                    return zy11.a;
                }
                kotlin.b.b(obj);
            }
            if (((pcw0) this.this$0.N.b.a.getValue()).a instanceof lcw0) {
                v vVar = this.this$0.C;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.label = 2;
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppMainScreenPresenter$observeReloadingRequests$$inlined$collectLatestIn$1(tpr tprVar, Continuation continuation, e eVar) {
        super(2, continuation);
        this.$this_collectLatestIn = tprVar;
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperAppMainScreenPresenter$observeReloadingRequests$$inlined$collectLatestIn$1(this.$this_collectLatestIn, continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperAppMainScreenPresenter$observeReloadingRequests$$inlined$collectLatestIn$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr tprVar = this.$this_collectLatestIn;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (kotlinx.coroutines.flow.e.k(tprVar, anonymousClass1, this) == coroutineSingletons) {
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
