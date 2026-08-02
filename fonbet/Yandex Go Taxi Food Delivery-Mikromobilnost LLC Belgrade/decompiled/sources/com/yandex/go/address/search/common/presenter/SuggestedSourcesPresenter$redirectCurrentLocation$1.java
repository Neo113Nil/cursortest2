package com.yandex.go.address.search.common.presenter;

import defpackage.i51;
import defpackage.jst;
import defpackage.kr0;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.systemrequeirements.location.LocationRequirementsException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.address.search.common.presenter.SuggestedSourcesPresenter$redirectCurrentLocation$1", f = "SuggestedSourcesPresenter.kt", l = {246}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class SuggestedSourcesPresenter$redirectCurrentLocation$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ d this$0;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "Lkotlin/Pair;", "Lpv0;", "", "<anonymous>", "(Ltse;)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.address.search.common.presenter.SuggestedSourcesPresenter$redirectCurrentLocation$1$1", f = "SuggestedSourcesPresenter.kt", l = {247, 248}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.address.search.common.presenter.SuggestedSourcesPresenter$redirectCurrentLocation$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        Object L$0;
        int label;
        final /* synthetic */ d this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(d dVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x002e, code lost:
        
            if (r6 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            pv0 pv0Var;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                ru.yandex.taxi.interactors.a Ih = this.this$0.Ih();
                this.label = 1;
                obj = Ih.a(this);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pv0Var = (pv0) this.L$0;
                    kotlin.b.b(obj);
                    Boolean bool = (Boolean) obj;
                    bool.booleanValue();
                    return new Pair(pv0Var, bool);
                }
                kotlin.b.b(obj);
            }
            pv0 pv0Var2 = (pv0) obj;
            kr0 kr0Var = this.this$0.z0;
            this.L$0 = pv0Var2;
            this.label = 2;
            Object a = ((com.yandex.go.clarify_address.a) kr0Var).b.a(this);
            if (a != coroutineSingletons) {
                obj = a;
                pv0Var = pv0Var2;
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return new Pair(pv0Var, bool2);
            }
            return coroutineSingletons;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestedSourcesPresenter$redirectCurrentLocation$1(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuggestedSourcesPresenter$redirectCurrentLocation$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuggestedSourcesPresenter$redirectCurrentLocation$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                this.this$0.A0.getClass();
                sjh sjhVar = uyj.a;
                mdh mdhVar = mdh.b;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                obj = tje.k0(mdhVar, anonymousClass1, this);
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
            Pair pair = (Pair) obj;
            d.Gh(this.this$0, (pv0) pair.getFirst(), ((Boolean) pair.getSecond()).booleanValue());
        } catch (Exception e) {
            d dVar = this.this$0;
            ((i51) dVar.Dg()).hideProgress();
            if (e instanceof LocationRequirementsException) {
                jst.e.k(e, "No geo permission for currentLocation");
            } else {
                dVar.Yg();
            }
        }
        return zy11.a;
    }
}
