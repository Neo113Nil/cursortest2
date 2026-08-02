package com.yandex.go.navigator;

import com.yandex.mapkit.geometry.Point;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ f b;

    public d(vpr vprVar, f fVar) {
        this.a = vprVar;
        this.b = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        NavigatorMapInputListener$special$$inlined$mapNotNull$1$2$1 navigatorMapInputListener$special$$inlined$mapNotNull$1$2$1;
        int i;
        Object value;
        Point point;
        if (continuation instanceof NavigatorMapInputListener$special$$inlined$mapNotNull$1$2$1) {
            navigatorMapInputListener$special$$inlined$mapNotNull$1$2$1 = (NavigatorMapInputListener$special$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = navigatorMapInputListener$special$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                navigatorMapInputListener$special$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = navigatorMapInputListener$special$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = navigatorMapInputListener$special$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    r0 r0Var = this.b.g;
                    do {
                        value = r0Var.getValue();
                        point = (Point) value;
                    } while (!r0Var.k(value, null));
                    if (point != null) {
                        navigatorMapInputListener$special$$inlined$mapNotNull$1$2$1.L$0 = null;
                        navigatorMapInputListener$special$$inlined$mapNotNull$1$2$1.L$1 = null;
                        navigatorMapInputListener$special$$inlined$mapNotNull$1$2$1.L$2 = null;
                        navigatorMapInputListener$special$$inlined$mapNotNull$1$2$1.L$3 = null;
                        navigatorMapInputListener$special$$inlined$mapNotNull$1$2$1.L$4 = null;
                        navigatorMapInputListener$special$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(point, navigatorMapInputListener$special$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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
        navigatorMapInputListener$special$$inlined$mapNotNull$1$2$1 = new NavigatorMapInputListener$special$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = navigatorMapInputListener$special$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = navigatorMapInputListener$special$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
