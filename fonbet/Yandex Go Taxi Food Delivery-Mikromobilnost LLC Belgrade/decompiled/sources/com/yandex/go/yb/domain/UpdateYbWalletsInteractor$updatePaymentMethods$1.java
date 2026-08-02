package com.yandex.go.yb.domain;

import com.yandex.go.yb.api.experiments.YbWalletEntryPointExperiment;
import com.yandex.go.zone.model.Zone;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.yb.domain.UpdateYbWalletsInteractor$updatePaymentMethods$1", f = "UpdateYbWalletsInteractor.kt", l = {45, 48}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class UpdateYbWalletsInteractor$updatePaymentMethods$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateYbWalletsInteractor$updatePaymentMethods$1(o oVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UpdateYbWalletsInteractor$updatePaymentMethods$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UpdateYbWalletsInteractor$updatePaymentMethods$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        if (r7 == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.taxi.tariffs.interactor.g gVar = this.this$0.c;
            this.label = 1;
            obj = kotlinx.coroutines.flow.e.y(new com.yandex.go.taxi.tariffs.interactor.f(gVar.d.k()), this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11Var;
            }
            kotlin.b.b(obj);
        }
        Zone zone = (Zone) obj;
        this.this$0.getClass();
        YbWalletEntryPointExperiment ybWalletEntryPointExperiment = (YbWalletEntryPointExperiment) zone.b(YbWalletEntryPointExperiment.class);
        if (ybWalletEntryPointExperiment != null && ybWalletEntryPointExperiment.b) {
            o oVar = this.this$0;
            String str = zone.B;
            this.L$0 = null;
            this.label = 2;
            if (oVar.a(str, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return zy11Var;
    }
}
