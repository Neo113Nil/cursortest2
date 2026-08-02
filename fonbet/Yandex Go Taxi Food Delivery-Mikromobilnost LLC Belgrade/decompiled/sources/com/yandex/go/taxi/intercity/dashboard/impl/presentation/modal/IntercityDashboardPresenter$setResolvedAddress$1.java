package com.yandex.go.taxi.intercity.dashboard.impl.presentation.modal;

import com.yandex.go.address.models.Address;
import defpackage.a0z;
import defpackage.g050;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qow;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.search.address.view.PointType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.intercity.dashboard.impl.presentation.modal.IntercityDashboardPresenter$setResolvedAddress$1", f = "IntercityDashboardPresenter.kt", l = {509, 393}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class IntercityDashboardPresenter$setResolvedAddress$1 extends SuspendLambda implements wls {
    final /* synthetic */ Address $address;
    final /* synthetic */ PointType $pointType;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntercityDashboardPresenter$setResolvedAddress$1(g gVar, Address address, PointType pointType, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$address = address;
        this.$pointType = pointType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new IntercityDashboardPresenter$setResolvedAddress$1(this.this$0, this.$address, this.$pointType, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((IntercityDashboardPresenter$setResolvedAddress$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [g050] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        g gVar;
        kotlinx.coroutines.sync.a aVar;
        Address address;
        PointType pointType;
        Throwable th;
        g050 g050Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                ((qow) this.this$0.L).d(a0z.e);
                gVar = this.this$0;
                aVar = gVar.S;
                Address address2 = this.$address;
                PointType pointType2 = this.$pointType;
                this.L$0 = aVar;
                this.L$1 = gVar;
                this.L$2 = address2;
                this.L$3 = pointType2;
                this.label = 1;
                if (aVar.a(this) != coroutineSingletons) {
                    address = address2;
                    pointType = pointType2;
                }
                return coroutineSingletons;
            }
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g050Var = (g050) this.L$0;
                try {
                    kotlin.b.b(obj);
                    g050Var.d(null);
                    return zy11.a;
                } catch (Throwable th2) {
                    th = th2;
                    g050Var.d(null);
                    throw th;
                }
            }
            pointType = (PointType) this.L$3;
            address = (Address) this.L$2;
            gVar = (g) this.L$1;
            ?? r6 = (g050) this.L$0;
            kotlin.b.b(obj);
            aVar = r6;
            ((qow) gVar.L).c(a0z.e);
            com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.f fVar = gVar.z;
            this.L$0 = aVar;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 2;
            if (fVar.p(address, pointType, this) != coroutineSingletons) {
                g050Var = aVar;
                g050Var.d(null);
                return zy11.a;
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            kotlinx.coroutines.sync.a aVar2 = aVar;
            th = th3;
            g050Var = aVar2;
            g050Var.d(null);
            throw th;
        }
    }
}
