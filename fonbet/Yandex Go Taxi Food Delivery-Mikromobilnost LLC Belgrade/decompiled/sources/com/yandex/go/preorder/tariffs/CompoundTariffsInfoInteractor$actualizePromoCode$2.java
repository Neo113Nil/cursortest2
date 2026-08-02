package com.yandex.go.preorder.tariffs;

import com.yandex.go.zone.model.Zone;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.preorder.tariffs.CompoundTariffsInfoInteractor$actualizePromoCode$2", f = "CompoundTariffsInfoInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class CompoundTariffsInfoInteractor$actualizePromoCode$2 extends SuspendLambda implements wls {
    final /* synthetic */ Zone $zone;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompoundTariffsInfoInteractor$actualizePromoCode$2(a aVar, Zone zone, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$zone = zone;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CompoundTariffsInfoInteractor$actualizePromoCode$2(this.this$0, this.$zone, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        CompoundTariffsInfoInteractor$actualizePromoCode$2 compoundTariffsInfoInteractor$actualizePromoCode$2 = (CompoundTariffsInfoInteractor$actualizePromoCode$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        compoundTariffsInfoInteractor$actualizePromoCode$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        a aVar = this.this$0;
        Zone zone = this.$zone;
        try {
            if (aVar.f.g()) {
                aVar.g.r(zone.a);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            jst.e.x(th, "Fail to actualize preorder info");
        }
        return zy11.a;
    }
}
