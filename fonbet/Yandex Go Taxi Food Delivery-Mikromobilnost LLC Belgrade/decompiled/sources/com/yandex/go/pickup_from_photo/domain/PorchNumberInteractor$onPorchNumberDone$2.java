package com.yandex.go.pickup_from_photo.domain;

import com.yandex.go.address.models.Address;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ll8x;", "<anonymous>", "(Ltse;)Ll8x;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.pickup_from_photo.domain.PorchNumberInteractor$onPorchNumberDone$2", f = "PorchNumberInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PorchNumberInteractor$onPorchNumberDone$2 extends SuspendLambda implements wls {
    final /* synthetic */ Address $address;
    final /* synthetic */ String $porchNumber;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ j this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.pickup_from_photo.domain.PorchNumberInteractor$onPorchNumberDone$2$1", f = "PorchNumberInteractor.kt", l = {33}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.pickup_from_photo.domain.PorchNumberInteractor$onPorchNumberDone$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ Address $address;
        final /* synthetic */ String $porchNumber;
        int label;
        final /* synthetic */ j this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(j jVar, Address address, String str, Continuation continuation) {
            super(2, continuation);
            this.this$0 = jVar;
            this.$address = address;
            this.$porchNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$address, this.$porchNumber, continuation);
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
                tpr f = ((ru.yandex.taxi.search.suggest.i) this.this$0.b).f(this.$address.B(), this.$porchNumber, RoutePointType.POINT_A, "");
                this.label = 1;
                if (kotlinx.coroutines.flow.e.j(f, this) == coroutineSingletons) {
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
    public PorchNumberInteractor$onPorchNumberDone$2(j jVar, Address address, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jVar;
        this.$address = address;
        this.$porchNumber = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PorchNumberInteractor$onPorchNumberDone$2 porchNumberInteractor$onPorchNumberDone$2 = new PorchNumberInteractor$onPorchNumberDone$2(this.this$0, this.$address, this.$porchNumber, continuation);
        porchNumberInteractor$onPorchNumberDone$2.L$0 = obj;
        return porchNumberInteractor$onPorchNumberDone$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PorchNumberInteractor$onPorchNumberDone$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return com.yandex.go.coroutines.b.g(tseVar, null, null, new AnonymousClass1(this.this$0, this.$address, this.$porchNumber, null), 3);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
