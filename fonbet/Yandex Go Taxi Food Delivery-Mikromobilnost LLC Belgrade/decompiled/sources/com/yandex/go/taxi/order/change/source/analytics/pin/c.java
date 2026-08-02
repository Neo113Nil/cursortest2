package com.yandex.go.taxi.order.change.source.analytics.pin;

import android.content.Context;
import com.yandex.go.taxi.order.search.polling.model.ETA;
import defpackage.a0c0;
import defpackage.b0c0;
import defpackage.n4h0;
import defpackage.ny61;
import defpackage.qje;
import defpackage.sf9;
import defpackage.tf9;
import defpackage.tje;
import defpackage.uf9;
import defpackage.vf9;
import defpackage.vpr;
import defpackage.w511;
import defpackage.xng0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.widget.map.SourceOnMapControl;

/* loaded from: classes14.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ e b;

    public c(vpr vprVar, e eVar) {
        this.a = vprVar;
        this.b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ChangeSourcePointPinV2DataRepository$stateFlow$$inlined$map$1$2$1 changeSourcePointPinV2DataRepository$stateFlow$$inlined$map$1$2$1;
        int i;
        SourceOnMapControl.a aVar;
        if (continuation instanceof ChangeSourcePointPinV2DataRepository$stateFlow$$inlined$map$1$2$1) {
            changeSourcePointPinV2DataRepository$stateFlow$$inlined$map$1$2$1 = (ChangeSourcePointPinV2DataRepository$stateFlow$$inlined$map$1$2$1) continuation;
            int i2 = changeSourcePointPinV2DataRepository$stateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                changeSourcePointPinV2DataRepository$stateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = changeSourcePointPinV2DataRepository$stateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = changeSourcePointPinV2DataRepository$stateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    vf9 vf9Var = (vf9) obj;
                    boolean z = vf9Var instanceof tf9;
                    e eVar = this.b;
                    if (z) {
                        tf9 tf9Var = (tf9) vf9Var;
                        Integer num = tf9Var.a;
                        boolean z2 = tf9Var.b;
                        if (num != null) {
                            int a = new ETA(num.intValue(), z2).a();
                            aVar = new SourceOnMapControl.a(a <= 0 ? a0c0.c : new a0c0(String.valueOf(a), Integer.valueOf(a)), null, null, false, false, null, null, 2046);
                        } else {
                            aVar = eVar.d;
                        }
                    } else if (vf9Var instanceof uf9) {
                        aVar = eVar.e;
                    } else {
                        if (!(vf9Var instanceof sf9)) {
                            w511.b();
                            return null;
                        }
                        sf9 sf9Var = (sf9) vf9Var;
                        String str = sf9Var.a;
                        String str2 = sf9Var.b;
                        Context context = eVar.a.a;
                        aVar = new SourceOnMapControl.a(new b0c0(tje.y(n4h0.ic_pin_error_change_source_point, context), qje.t(xng0.error, context)), str2, str, false, true, null, null, 1976);
                    }
                    changeSourcePointPinV2DataRepository$stateFlow$$inlined$map$1$2$1.L$0 = null;
                    changeSourcePointPinV2DataRepository$stateFlow$$inlined$map$1$2$1.L$1 = null;
                    changeSourcePointPinV2DataRepository$stateFlow$$inlined$map$1$2$1.L$2 = null;
                    changeSourcePointPinV2DataRepository$stateFlow$$inlined$map$1$2$1.L$3 = null;
                    changeSourcePointPinV2DataRepository$stateFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(aVar, changeSourcePointPinV2DataRepository$stateFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        changeSourcePointPinV2DataRepository$stateFlow$$inlined$map$1$2$1 = new ChangeSourcePointPinV2DataRepository$stateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = changeSourcePointPinV2DataRepository$stateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = changeSourcePointPinV2DataRepository$stateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
