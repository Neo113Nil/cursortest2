package com.yandex.go.scooters.tariff_fix.selection;

import com.yandex.go.scooters.domain.e;
import com.yandex.go.scooters.tariff_fix.domain.model.ScootersFixTariffOfferBuildingException;
import defpackage.con0;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o1b1;
import defpackage.pxm0;
import defpackage.t4p0;
import defpackage.tse;
import defpackage.vbn0;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.ssl.cl_88;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.tariff_fix.selection.ScootersTariffFixSelectionPresenter$updateTariffOffer$1", f = "ScootersTariffFixSelectionPresenter.kt", l = {cl_88.n}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersTariffFixSelectionPresenter$updateTariffOffer$1 extends SuspendLambda implements wls {
    final /* synthetic */ zzs $geoPoint;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersTariffFixSelectionPresenter$updateTariffOffer$1(b bVar, zzs zzsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$geoPoint = zzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersTariffFixSelectionPresenter$updateTariffOffer$1(this.this$0, this.$geoPoint, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersTariffFixSelectionPresenter$updateTariffOffer$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        b bVar;
        Throwable th;
        b bVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                ((t4p0) this.this$0.Dg()).m2(o1b1.a(this.this$0.K.b) ? kyh0.scooters_start_riding : kyh0.scooters_book);
                b bVar3 = this.this$0;
                zzs zzsVar = this.$geoPoint;
                try {
                    e eVar = bVar3.G;
                    String str = ((pxm0) bVar3.I.d).b;
                    vbn0 vbn0Var = bVar3.K;
                    this.L$0 = bVar3;
                    this.L$1 = bVar3;
                    this.label = 1;
                    Object a = eVar.a(str, zzsVar, vbn0Var, this);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    bVar = bVar3;
                    obj = a;
                    bVar2 = bVar;
                } catch (Throwable th2) {
                    bVar = bVar3;
                    th = th2;
                    if (th instanceof ScootersFixTariffOfferBuildingException) {
                    }
                    ((t4p0) this.this$0.Dg()).K5();
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bVar = (b) this.L$1;
                bVar2 = (b) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th3) {
                    th = th3;
                    if (th instanceof ScootersFixTariffOfferBuildingException) {
                        ((t4p0) bVar.Dg()).t5(th);
                    }
                    ((t4p0) this.this$0.Dg()).K5();
                    return zy11.a;
                }
            }
            ((t4p0) bVar2.Dg()).Ye((con0) obj);
            ((t4p0) this.this$0.Dg()).K5();
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
