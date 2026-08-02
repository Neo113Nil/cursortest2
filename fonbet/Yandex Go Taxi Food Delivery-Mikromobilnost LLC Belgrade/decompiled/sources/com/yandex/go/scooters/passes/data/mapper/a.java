package com.yandex.go.scooters.passes.data.mapper;

import com.yandex.go.scooters.passes.model.PassPayment;
import defpackage.b0g0;
import defpackage.bvf0;
import defpackage.evu0;
import defpackage.jk90;
import defpackage.joo0;
import defpackage.lea0;
import defpackage.ny61;
import java.util.List;
import java.util.UUID;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes13.dex */
public final class a {
    public final e a;
    public final ru.yandex.taxi.scooters.data.mapper.e b;

    public a(e eVar, ru.yandex.taxi.scooters.data.mapper.e eVar2) {
        this.a = eVar;
        this.b = eVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, boolean z, lea0 lea0Var, ContinuationImpl continuationImpl) {
        ScootersPassPurchaseMapper$createToPassPurchaseParams$1 scootersPassPurchaseMapper$createToPassPurchaseParams$1;
        int i;
        if (continuationImpl instanceof ScootersPassPurchaseMapper$createToPassPurchaseParams$1) {
            scootersPassPurchaseMapper$createToPassPurchaseParams$1 = (ScootersPassPurchaseMapper$createToPassPurchaseParams$1) continuationImpl;
            int i2 = scootersPassPurchaseMapper$createToPassPurchaseParams$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPassPurchaseMapper$createToPassPurchaseParams$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersPassPurchaseMapper$createToPassPurchaseParams$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPassPurchaseMapper$createToPassPurchaseParams$1.label;
                if (i != 0) {
                    b.b(obj);
                    scootersPassPurchaseMapper$createToPassPurchaseParams$1.L$0 = null;
                    scootersPassPurchaseMapper$createToPassPurchaseParams$1.L$1 = null;
                    scootersPassPurchaseMapper$createToPassPurchaseParams$1.L$2 = str;
                    scootersPassPurchaseMapper$createToPassPurchaseParams$1.Z$0 = z;
                    scootersPassPurchaseMapper$createToPassPurchaseParams$1.label = 1;
                    obj = this.b.a(lea0Var, z, scootersPassPurchaseMapper$createToPassPurchaseParams$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) scootersPassPurchaseMapper$createToPassPurchaseParams$1.L$2;
                    b.b(obj);
                }
                return new jk90(str, (PassPayment) obj, UUID.randomUUID().toString());
            }
        }
        scootersPassPurchaseMapper$createToPassPurchaseParams$1 = new ScootersPassPurchaseMapper$createToPassPurchaseParams$1(this, continuationImpl);
        Object obj2 = scootersPassPurchaseMapper$createToPassPurchaseParams$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPassPurchaseMapper$createToPassPurchaseParams$1.label;
        if (i != 0) {
        }
        return new jk90(str, (PassPayment) obj2, UUID.randomUUID().toString());
    }

    public final Object b(b0g0 b0g0Var, Continuation continuation) {
        if (b0g0Var == null) {
            return joo0.a;
        }
        List list = b0g0Var.d;
        b0g0.a aVar = list != null ? (b0g0.a) list.get(0) : null;
        String str = aVar != null ? aVar.b : null;
        return (str == null || evu0.J(str)) ? bvf0.n(new ScootersPassPurchaseMapper$mapTextStatus$2(b0g0Var, this, null), continuation) : bvf0.n(new ScootersPassPurchaseMapper$mapIconStatus$2(b0g0Var, this, null), continuation);
    }
}
