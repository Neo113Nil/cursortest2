package com.yandex.go.chargers.order.preparing;

import defpackage.gci0;
import defpackage.hda;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class c implements tpr {
    public final /* synthetic */ gci0 a;
    public final /* synthetic */ hda b;

    public c(gci0 gci0Var, hda hdaVar) {
        this.a = gci0Var;
        this.b = hdaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ChargersOrderPreparingPresenter$listenOrderStatusForNavigating$$inlined$map$1$1 chargersOrderPreparingPresenter$listenOrderStatusForNavigating$$inlined$map$1$1;
        int i;
        if (continuation instanceof ChargersOrderPreparingPresenter$listenOrderStatusForNavigating$$inlined$map$1$1) {
            chargersOrderPreparingPresenter$listenOrderStatusForNavigating$$inlined$map$1$1 = (ChargersOrderPreparingPresenter$listenOrderStatusForNavigating$$inlined$map$1$1) continuation;
            int i2 = chargersOrderPreparingPresenter$listenOrderStatusForNavigating$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersOrderPreparingPresenter$listenOrderStatusForNavigating$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersOrderPreparingPresenter$listenOrderStatusForNavigating$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersOrderPreparingPresenter$listenOrderStatusForNavigating$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = new b(vprVar, this.b);
                    chargersOrderPreparingPresenter$listenOrderStatusForNavigating$$inlined$map$1$1.L$0 = null;
                    chargersOrderPreparingPresenter$listenOrderStatusForNavigating$$inlined$map$1$1.L$1 = null;
                    chargersOrderPreparingPresenter$listenOrderStatusForNavigating$$inlined$map$1$1.L$2 = null;
                    chargersOrderPreparingPresenter$listenOrderStatusForNavigating$$inlined$map$1$1.label = 1;
                    if (this.a.a.collect(bVar, chargersOrderPreparingPresenter$listenOrderStatusForNavigating$$inlined$map$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        chargersOrderPreparingPresenter$listenOrderStatusForNavigating$$inlined$map$1$1 = new ChargersOrderPreparingPresenter$listenOrderStatusForNavigating$$inlined$map$1$1(this, continuation);
        Object obj2 = chargersOrderPreparingPresenter$listenOrderStatusForNavigating$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersOrderPreparingPresenter$listenOrderStatusForNavigating$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
