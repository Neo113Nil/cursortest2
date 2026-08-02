package com.yandex.go.navigator.driving;

import defpackage.avj0;
import defpackage.c9v;
import defpackage.iby;
import defpackage.kyh0;
import defpackage.mg50;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zuj0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ c9v b;

    public a(vpr vprVar, c9v c9vVar) {
        this.a = vprVar;
        this.b = c9vVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DrivingBubbleStateInteractor$special$$inlined$map$1$2$1 drivingBubbleStateInteractor$special$$inlined$map$1$2$1;
        int i;
        String str;
        if (continuation instanceof DrivingBubbleStateInteractor$special$$inlined$map$1$2$1) {
            drivingBubbleStateInteractor$special$$inlined$map$1$2$1 = (DrivingBubbleStateInteractor$special$$inlined$map$1$2$1) continuation;
            int i2 = drivingBubbleStateInteractor$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                drivingBubbleStateInteractor$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = drivingBubbleStateInteractor$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = drivingBubbleStateInteractor$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    iby ibyVar = (iby) obj;
                    c9v c9vVar = this.b;
                    if (ibyVar != null) {
                        str = ((avj0) ((zuj0) c9vVar.c)).i(kyh0.navigator_traffic_jam_for_template, ((mg50) c9vVar.b).a((long) ibyVar.a));
                    } else {
                        c9vVar.getClass();
                        str = null;
                    }
                    drivingBubbleStateInteractor$special$$inlined$map$1$2$1.L$0 = null;
                    drivingBubbleStateInteractor$special$$inlined$map$1$2$1.L$1 = null;
                    drivingBubbleStateInteractor$special$$inlined$map$1$2$1.L$2 = null;
                    drivingBubbleStateInteractor$special$$inlined$map$1$2$1.L$3 = null;
                    drivingBubbleStateInteractor$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(str, drivingBubbleStateInteractor$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        drivingBubbleStateInteractor$special$$inlined$map$1$2$1 = new DrivingBubbleStateInteractor$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = drivingBubbleStateInteractor$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = drivingBubbleStateInteractor$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
