package com.yandex.go.masstransit.sdk.ble.impl.repository;

import com.yandex.go.masstransit.sdk.ble.impl.ble.f;
import com.yandex.go.masstransit.sdk.ble.impl.domain.ResponseLoadingState;
import com.yandex.go.masstransit.sdk.ble.impl.network.MtPaymentBleParam;
import defpackage.em30;
import defpackage.gm30;
import defpackage.im30;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sj40;
import defpackage.tse;
import defpackage.u26;
import defpackage.uj40;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.masstransit.sdk.ble.impl.repository.MtGeoVehiclesRepository$refreshScan$1", f = "MtGeoVehiclesRepository.kt", l = {HProv.PROV_GOST_2001_DH}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MtGeoVehiclesRepository$refreshScan$1 extends SuspendLambda implements wls {
    final /* synthetic */ u26 $bleScanSettings;
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtGeoVehiclesRepository$refreshScan$1(u26 u26Var, b bVar, Continuation continuation) {
        super(2, continuation);
        this.$bleScanSettings = u26Var;
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtGeoVehiclesRepository$refreshScan$1(this.$bleScanSettings, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtGeoVehiclesRepository$refreshScan$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            u26 u26Var = this.$bleScanSettings;
            if (u26Var != null && u26Var.a) {
                zzs a = this.this$0.d.a();
                b bVar = this.this$0;
                if (a == null) {
                    bVar.c.a();
                    r0 r0Var = this.this$0.l;
                    do {
                        value2 = r0Var.getValue();
                    } while (!r0Var.k(value2, uj40.e));
                } else {
                    bVar.i.clear();
                    r0 r0Var2 = this.this$0.l;
                    do {
                        value = r0Var2.getValue();
                    } while (!r0Var2.k(value, uj40.d));
                    b bVar2 = this.this$0;
                    MtPaymentBleParam mtPaymentBleParam = new MtPaymentBleParam(a);
                    this.L$0 = null;
                    this.label = 1;
                    obj = b.b(bVar2, mtPaymentBleParam, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
            return zy11.a;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        im30 im30Var = (im30) obj;
        if (im30Var instanceof em30) {
            this.this$0.c.a();
            r0 r0Var3 = this.this$0.l;
            do {
                value4 = r0Var3.getValue();
            } while (!r0Var3.k(value4, new uj40(EmptyList.a, ResponseLoadingState.ERROR, new sj40(((em30) im30Var).a, null))));
        } else {
            if (!(im30Var instanceof gm30)) {
                w511.b();
                return null;
            }
            this.this$0.c.a();
            f fVar = this.this$0.c;
            List list = ((gm30) im30Var).a;
            fVar.b(list, this.$bleScanSettings);
            if (list.isEmpty()) {
                r0 r0Var4 = this.this$0.l;
                do {
                    value3 = r0Var4.getValue();
                } while (!r0Var4.k(value3, uj40.e));
            }
        }
        return zy11.a;
    }
}
