package com.yandex.go.places.impl.ui.main.map.filters;

import com.yandex.go.places.impl.domain.entities.FavoritesState;
import com.yandex.mapkit.geometry.BoundingBox;
import defpackage.gh00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uc4;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.ui.main.map.filters.PlacesCategoryFiltersPresenter$subscribeToBboxUpdates$$inlined$collectLatestIn$1", f = "PlacesCategoryFiltersPresenter.kt", l = {54}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class PlacesCategoryFiltersPresenter$subscribeToBboxUpdates$$inlined$collectLatestIn$1 extends SuspendLambda implements wls {
    final /* synthetic */ tpr $this_collectLatestIn;
    int label;
    final /* synthetic */ f this$0;

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n"}, d2 = {"T", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.places.impl.ui.main.map.filters.PlacesCategoryFiltersPresenter$subscribeToBboxUpdates$$inlined$collectLatestIn$1$1", f = "PlacesCategoryFiltersPresenter.kt", l = {59}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.places.impl.ui.main.map.filters.PlacesCategoryFiltersPresenter$subscribeToBboxUpdates$$inlined$collectLatestIn$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements wls {
        float F$0;
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ f this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(f fVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = fVar;
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

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AnonymousClass1 anonymousClass1;
            uc4 uc4Var;
            Object obj2 = this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                Pair pair = (Pair) obj2;
                uc4 uc4Var2 = (uc4) pair.getFirst();
                float floatValue = ((Number) pair.getSecond()).floatValue();
                f fVar = this.this$0;
                if (fVar.V) {
                    fVar.V = false;
                    return zy11.a;
                }
                com.yandex.go.places.impl.domain.interactors.map.e eVar = fVar.K;
                Float f = new Float(floatValue);
                boolean z = this.this$0.W == FavoritesState.SELECTED;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = uc4Var2;
                this.F$0 = floatValue;
                this.label = 1;
                anonymousClass1 = this;
                obj = eVar.b(uc4Var2, f, z, null, null, anonymousClass1);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                uc4Var = uc4Var2;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uc4Var = (uc4) this.L$2;
                kotlin.b.b(obj);
                anonymousClass1 = this;
            }
            BoundingBox boundingBox = (BoundingBox) obj;
            f fVar2 = anonymousClass1.this$0;
            if (fVar2.U) {
                fVar2.U = false;
                if (boundingBox != null && !boundingBox.equals(uc4Var)) {
                    f fVar3 = anonymousClass1.this$0;
                    fVar3.V = true;
                    ((gh00) fVar3.D.a).A(boundingBox, null);
                }
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacesCategoryFiltersPresenter$subscribeToBboxUpdates$$inlined$collectLatestIn$1(tpr tprVar, Continuation continuation, f fVar) {
        super(2, continuation);
        this.$this_collectLatestIn = tprVar;
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlacesCategoryFiltersPresenter$subscribeToBboxUpdates$$inlined$collectLatestIn$1(this.$this_collectLatestIn, continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlacesCategoryFiltersPresenter$subscribeToBboxUpdates$$inlined$collectLatestIn$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
