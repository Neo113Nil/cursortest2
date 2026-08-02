package com.yandex.go.masstransit.sdk.ble.impl.ble;

import com.yandex.go.masstransit.sdk.ble.impl.network.MtVehiclesParam;
import defpackage.bvf0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.v4r0;
import defpackage.wls;
import defpackage.zy11;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.masstransit.sdk.ble.impl.ble.MtBleScannerRepository$startRemoveBeaconJob$1", f = "MtBleScannerRepository.kt", l = {HProv.PP_FAST_CODE}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MtBleScannerRepository$startRemoveBeaconJob$1 extends SuspendLambda implements wls {
    final /* synthetic */ MtVehiclesParam.BleInfo $beaconData;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtBleScannerRepository$startRemoveBeaconJob$1(c cVar, MtVehiclesParam.BleInfo bleInfo, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$beaconData = bleInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MtBleScannerRepository$startRemoveBeaconJob$1 mtBleScannerRepository$startRemoveBeaconJob$1 = new MtBleScannerRepository$startRemoveBeaconJob$1(this.this$0, this.$beaconData, continuation);
        mtBleScannerRepository$startRemoveBeaconJob$1.L$0 = obj;
        return mtBleScannerRepository$startRemoveBeaconJob$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtBleScannerRepository$startRemoveBeaconJob$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        Set set;
        Object value2;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.L$0 = tseVar;
            this.label = 1;
            if (kotlinx.coroutines.a.i(10000L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        boolean D = bvf0.D(tseVar);
        zy11 zy11Var = zy11.a;
        if (!D) {
            return zy11Var;
        }
        Set set2 = (Set) this.this$0.e.getValue();
        if (set2 == null || set2.size() != 1) {
            r0 r0Var = this.this$0.e;
            MtVehiclesParam.BleInfo bleInfo = this.$beaconData;
            do {
                value = r0Var.getValue();
                set = (Set) value;
            } while (!r0Var.k(value, set != null ? v4r0.f(set, bleInfo) : null));
        } else {
            c cVar = this.this$0;
            cVar.i = cVar.b();
            r0 r0Var2 = this.this$0.e;
            do {
                value2 = r0Var2.getValue();
            } while (!r0Var2.k(value2, null));
        }
        this.this$0.h.remove(this.$beaconData);
        return zy11Var;
    }
}
