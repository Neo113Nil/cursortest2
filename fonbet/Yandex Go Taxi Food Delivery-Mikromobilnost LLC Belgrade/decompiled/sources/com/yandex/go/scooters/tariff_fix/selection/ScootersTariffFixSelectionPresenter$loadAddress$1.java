package com.yandex.go.scooters.tariff_fix.selection;

import defpackage.atd0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.t4p0;
import defpackage.tse;
import defpackage.u4p0;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.tariff_fix.selection.ScootersTariffFixSelectionPresenter$loadAddress$1", f = "ScootersTariffFixSelectionPresenter.kt", l = {HProv.PP_SECURITY_LEVEL}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersTariffFixSelectionPresenter$loadAddress$1 extends SuspendLambda implements wls {
    final /* synthetic */ ScootersTariffFixSelectionPresenter$AddressType $addressType;
    final /* synthetic */ zzs $geoPoint;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersTariffFixSelectionPresenter$loadAddress$1(b bVar, zzs zzsVar, ScootersTariffFixSelectionPresenter$AddressType scootersTariffFixSelectionPresenter$AddressType, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$geoPoint = zzsVar;
        this.$addressType = scootersTariffFixSelectionPresenter$AddressType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersTariffFixSelectionPresenter$loadAddress$1(this.this$0, this.$geoPoint, this.$addressType, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersTariffFixSelectionPresenter$loadAddress$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b bVar;
        ScootersTariffFixSelectionPresenter$AddressType scootersTariffFixSelectionPresenter$AddressType;
        b bVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                ((t4p0) this.this$0.Dg()).G();
                b bVar3 = this.this$0;
                zzs zzsVar = this.$geoPoint;
                ScootersTariffFixSelectionPresenter$AddressType scootersTariffFixSelectionPresenter$AddressType2 = this.$addressType;
                try {
                    this.L$0 = bVar3;
                    this.L$1 = scootersTariffFixSelectionPresenter$AddressType2;
                    this.L$2 = bVar3;
                    this.label = 1;
                    Object y = e.y(atd0.a(bVar3.A, zzsVar, RoutePointType.SERVICE_SCOOTERS), this);
                    if (y == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    scootersTariffFixSelectionPresenter$AddressType = scootersTariffFixSelectionPresenter$AddressType2;
                    obj = y;
                    bVar2 = bVar3;
                } catch (Throwable th) {
                    th = th;
                    bVar = bVar3;
                    ((t4p0) bVar.Dg()).t5(th);
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bVar = (b) this.L$2;
                scootersTariffFixSelectionPresenter$AddressType = (ScootersTariffFixSelectionPresenter$AddressType) this.L$1;
                bVar2 = (b) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    ((t4p0) bVar.Dg()).t5(th);
                    return zy11.a;
                }
            }
            pv0 pv0Var = (pv0) obj;
            int i2 = u4p0.a[scootersTariffFixSelectionPresenter$AddressType.ordinal()];
            if (i2 == 1) {
                ((t4p0) bVar2.Dg()).U(pv0Var.a.D1());
            } else if (i2 == 2) {
                ((t4p0) bVar2.Dg()).z9(pv0Var.a.D1());
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                ((t4p0) bVar2.Dg()).Y6(pv0Var.a.D1());
            }
            ((t4p0) bVar2.Dg()).Z();
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
