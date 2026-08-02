package com.yandex.go.scooters.parking;

import com.yandex.go.scooters.parking.api.ParkingButtonAction;
import com.yandex.go.scooters.parking.api.ParkingCardOpenReason;
import com.yandex.go.scooters.parking.data.model.ScootersParkingDescriptionExperiment;
import defpackage.aco0;
import defpackage.bco0;
import defpackage.cco0;
import defpackage.cjm0;
import defpackage.d6z;
import defpackage.dco0;
import defpackage.eco0;
import defpackage.fco0;
import defpackage.kgx;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.nbo0;
import defpackage.ny61;
import defpackage.qdx;
import defpackage.qwo0;
import defpackage.tcc;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zbo0;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Leco0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.parking.ScootersParkingUiStateInteractor$uiStateFlow$1", f = "ScootersParkingUiStateInteractor.kt", l = {38, 39}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersParkingUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $allowPanorama;
    final /* synthetic */ ParkingButtonAction $buttonAction;
    final /* synthetic */ Integer $buttonTitle;
    final /* synthetic */ ParkingCardOpenReason $openReason;
    final /* synthetic */ zzs $parkingGeo;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ fco0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersParkingUiStateInteractor$uiStateFlow$1(fco0 fco0Var, zzs zzsVar, boolean z, ParkingButtonAction parkingButtonAction, Integer num, ParkingCardOpenReason parkingCardOpenReason, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fco0Var;
        this.$parkingGeo = zzsVar;
        this.$allowPanorama = z;
        this.$buttonAction = parkingButtonAction;
        this.$buttonTitle = num;
        this.$openReason = parkingCardOpenReason;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersParkingUiStateInteractor$uiStateFlow$1 scootersParkingUiStateInteractor$uiStateFlow$1 = new ScootersParkingUiStateInteractor$uiStateFlow$1(this.this$0, this.$parkingGeo, this.$allowPanorama, this.$buttonAction, this.$buttonTitle, this.$openReason, continuation);
        scootersParkingUiStateInteractor$uiStateFlow$1.L$0 = obj;
        return scootersParkingUiStateInteractor$uiStateFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersParkingUiStateInteractor$uiStateFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x010d, code lost:
    
        if (r1.emit(r12, r18) == r2) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x010f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0039, code lost:
    
        if (r3 == r2) goto L34;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b;
        cjm0 cjm0Var;
        cco0 cco0Var;
        aco0 aco0Var;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            nbo0 nbo0Var = this.this$0.c;
            this.L$0 = vprVar;
            this.label = 1;
            b = nbo0Var.a.b(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
            b = obj;
        }
        ScootersParkingDescriptionExperiment scootersParkingDescriptionExperiment = (ScootersParkingDescriptionExperiment) b;
        fco0 fco0Var = this.this$0;
        zzs zzsVar = this.$parkingGeo;
        boolean z = this.$allowPanorama;
        ParkingButtonAction parkingButtonAction = this.$buttonAction;
        Integer num = this.$buttonTitle;
        ParkingCardOpenReason parkingCardOpenReason = this.$openReason;
        fco0Var.getClass();
        Map map = scootersParkingDescriptionExperiment.c;
        ScootersParkingDescriptionExperiment.Content content = scootersParkingDescriptionExperiment.d;
        String str = (String) map.get(content.a);
        if (str == null) {
            str = "";
        }
        cjm0 cjm0Var2 = new cjm0(5, fco0Var.a.getString(num != null ? num.intValue() : kyh0.common_got_it), parkingButtonAction);
        List<ScootersParkingDescriptionExperiment.Content.Item> list = content.b;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (ScootersParkingDescriptionExperiment.Content.Item item : list) {
            arrayList.add(new dco0(d6z.Y(scootersParkingDescriptionExperiment, item.a), item.b));
        }
        if (z) {
            ScootersParkingDescriptionExperiment.Content.PanoramaOnboarding panoramaOnboarding = content.c;
            qwo0 qwo0Var = fco0Var.b;
            qdx qdxVar = qwo0Var.u;
            qdx qdxVar2 = qwo0Var.u;
            kgx[] kgxVarArr = qwo0.B;
            if (((Number) qdxVar.getValue(qwo0Var, kgxVarArr[19])).intValue() >= panoramaOnboarding.c) {
                cjm0Var = cjm0Var2;
                aco0Var = null;
            } else {
                qdxVar2.setValue(qwo0Var, kgxVarArr[19], Integer.valueOf(((Number) qdxVar2.getValue(qwo0Var, kgxVarArr[19])).intValue() + 1));
                cjm0Var = cjm0Var2;
                aco0Var = new aco0(d6z.Y(scootersParkingDescriptionExperiment, panoramaOnboarding.a), panoramaOnboarding.b);
            }
            cco0Var = new bco0(zzsVar, aco0Var);
        } else {
            cjm0Var = cjm0Var2;
            cco0Var = zbo0.a;
        }
        eco0 eco0Var = new eco0(str, cjm0Var, arrayList, cco0Var, parkingCardOpenReason);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }
}
