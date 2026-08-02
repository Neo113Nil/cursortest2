package com.yandex.go.taxi.order.change.source.data;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class d implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ DriveState b;

    public d(tpr tprVar, DriveState driveState) {
        this.a = tprVar;
        this.b = driveState;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ChangeSourcePointExperimentRepository$pinAsEntryPoint$$inlined$map$1$1 changeSourcePointExperimentRepository$pinAsEntryPoint$$inlined$map$1$1;
        int i;
        if (continuation instanceof ChangeSourcePointExperimentRepository$pinAsEntryPoint$$inlined$map$1$1) {
            changeSourcePointExperimentRepository$pinAsEntryPoint$$inlined$map$1$1 = (ChangeSourcePointExperimentRepository$pinAsEntryPoint$$inlined$map$1$1) continuation;
            int i2 = changeSourcePointExperimentRepository$pinAsEntryPoint$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                changeSourcePointExperimentRepository$pinAsEntryPoint$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = changeSourcePointExperimentRepository$pinAsEntryPoint$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = changeSourcePointExperimentRepository$pinAsEntryPoint$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = new c(vprVar, this.b);
                    changeSourcePointExperimentRepository$pinAsEntryPoint$$inlined$map$1$1.L$0 = null;
                    changeSourcePointExperimentRepository$pinAsEntryPoint$$inlined$map$1$1.L$1 = null;
                    changeSourcePointExperimentRepository$pinAsEntryPoint$$inlined$map$1$1.L$2 = null;
                    changeSourcePointExperimentRepository$pinAsEntryPoint$$inlined$map$1$1.label = 1;
                    if (this.a.collect(cVar, changeSourcePointExperimentRepository$pinAsEntryPoint$$inlined$map$1$1) == coroutineSingletons) {
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
        changeSourcePointExperimentRepository$pinAsEntryPoint$$inlined$map$1$1 = new ChangeSourcePointExperimentRepository$pinAsEntryPoint$$inlined$map$1$1(this, continuation);
        Object obj2 = changeSourcePointExperimentRepository$pinAsEntryPoint$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = changeSourcePointExperimentRepository$pinAsEntryPoint$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
