package com.yandex.go.scooters.passes.active.domain;

import com.yandex.go.scooters.data.g;
import com.yandex.go.scooters.passes.domain.model.ScootersPassesFromScreen;
import defpackage.lbn0;
import defpackage.nro0;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.scooters.data.model.ScootersPassesListServiceDto;

/* loaded from: classes13.dex */
public final class e {
    public final g a;
    public final nro0 b;
    public final lbn0 c;

    public e(g gVar, nro0 nro0Var, lbn0 lbn0Var) {
        this.a = gVar;
        this.b = nro0Var;
        this.c = lbn0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0067, code lost:
    
        if (r10.invoke(r0) == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ScootersPassesFromScreen scootersPassesFromScreen, tls tlsVar, ContinuationImpl continuationImpl) {
        ScootersPassesUpdateInteractor$execute$1 scootersPassesUpdateInteractor$execute$1;
        int i;
        lbn0 lbn0Var;
        if (continuationImpl instanceof ScootersPassesUpdateInteractor$execute$1) {
            scootersPassesUpdateInteractor$execute$1 = (ScootersPassesUpdateInteractor$execute$1) continuationImpl;
            int i2 = scootersPassesUpdateInteractor$execute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPassesUpdateInteractor$execute$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersPassesUpdateInteractor$execute$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPassesUpdateInteractor$execute$1.label;
                Object obj3 = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersPassesUpdateInteractor$execute$1.L$0 = scootersPassesFromScreen;
                    scootersPassesUpdateInteractor$execute$1.L$1 = null;
                    scootersPassesUpdateInteractor$execute$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            return obj3;
                        }
                        lbn0Var = (lbn0) scootersPassesUpdateInteractor$execute$1.L$2;
                        kotlin.b.b(obj);
                        scootersPassesUpdateInteractor$execute$1.L$0 = null;
                        scootersPassesUpdateInteractor$execute$1.L$1 = null;
                        scootersPassesUpdateInteractor$execute$1.L$2 = null;
                        scootersPassesUpdateInteractor$execute$1.label = 3;
                        lbn0Var.Cg(obj, scootersPassesUpdateInteractor$execute$1);
                        return obj3 != obj2 ? obj2 : obj3;
                    }
                    scootersPassesFromScreen = (ScootersPassesFromScreen) scootersPassesUpdateInteractor$execute$1.L$0;
                    kotlin.b.b(obj);
                }
                if (scootersPassesFromScreen != ScootersPassesFromScreen.OFFER_CARD) {
                    this.b.a(obj3);
                    return obj3;
                }
                ScootersPassesListServiceDto scootersPassesListServiceDto = scootersPassesFromScreen == ScootersPassesFromScreen.CHARGERS ? ScootersPassesListServiceDto.CHARGERS : null;
                scootersPassesUpdateInteractor$execute$1.L$0 = null;
                scootersPassesUpdateInteractor$execute$1.L$1 = null;
                lbn0 lbn0Var2 = this.c;
                scootersPassesUpdateInteractor$execute$1.L$2 = lbn0Var2;
                scootersPassesUpdateInteractor$execute$1.label = 2;
                obj = this.a.a(scootersPassesListServiceDto, scootersPassesUpdateInteractor$execute$1);
                if (obj != obj2) {
                    lbn0Var = lbn0Var2;
                    scootersPassesUpdateInteractor$execute$1.L$0 = null;
                    scootersPassesUpdateInteractor$execute$1.L$1 = null;
                    scootersPassesUpdateInteractor$execute$1.L$2 = null;
                    scootersPassesUpdateInteractor$execute$1.label = 3;
                    lbn0Var.Cg(obj, scootersPassesUpdateInteractor$execute$1);
                    if (obj3 != obj2) {
                    }
                }
            }
        }
        scootersPassesUpdateInteractor$execute$1 = new ScootersPassesUpdateInteractor$execute$1(this, continuationImpl);
        Object obj4 = scootersPassesUpdateInteractor$execute$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPassesUpdateInteractor$execute$1.label;
        Object obj32 = zy11.a;
        if (i != 0) {
        }
        if (scootersPassesFromScreen != ScootersPassesFromScreen.OFFER_CARD) {
        }
    }
}
