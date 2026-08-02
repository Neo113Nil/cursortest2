package com.yandex.go.taxi.order.change.source.data;

import com.yandex.go.taxi.order.change.source.experiment.ChangeSourcePointExperiment;
import defpackage.d6z;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.xf9;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ DriveState b;

    public c(vpr vprVar, DriveState driveState) {
        this.a = vprVar;
        this.b = driveState;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ChangeSourcePointExperimentRepository$pinAsEntryPoint$$inlined$map$1$2$1 changeSourcePointExperimentRepository$pinAsEntryPoint$$inlined$map$1$2$1;
        int i;
        ChangeSourcePointExperiment.PinConfig pinConfig;
        if (continuation instanceof ChangeSourcePointExperimentRepository$pinAsEntryPoint$$inlined$map$1$2$1) {
            changeSourcePointExperimentRepository$pinAsEntryPoint$$inlined$map$1$2$1 = (ChangeSourcePointExperimentRepository$pinAsEntryPoint$$inlined$map$1$2$1) continuation;
            int i2 = changeSourcePointExperimentRepository$pinAsEntryPoint$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                changeSourcePointExperimentRepository$pinAsEntryPoint$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = changeSourcePointExperimentRepository$pinAsEntryPoint$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = changeSourcePointExperimentRepository$pinAsEntryPoint$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ChangeSourcePointExperiment changeSourcePointExperiment = (ChangeSourcePointExperiment) obj;
                    boolean z = changeSourcePointExperiment.b;
                    xf9 xf9Var = xf9.g;
                    if (z && (pinConfig = changeSourcePointExperiment.i) != null) {
                        xf9Var = new xf9(d6z.Y(changeSourcePointExperiment, pinConfig.a), this.b != DriveState.DRIVING || pinConfig.f, d6z.Y(changeSourcePointExperiment, pinConfig.b), pinConfig.c, pinConfig.d, pinConfig.e);
                    }
                    changeSourcePointExperimentRepository$pinAsEntryPoint$$inlined$map$1$2$1.L$0 = null;
                    changeSourcePointExperimentRepository$pinAsEntryPoint$$inlined$map$1$2$1.L$1 = null;
                    changeSourcePointExperimentRepository$pinAsEntryPoint$$inlined$map$1$2$1.L$2 = null;
                    changeSourcePointExperimentRepository$pinAsEntryPoint$$inlined$map$1$2$1.L$3 = null;
                    changeSourcePointExperimentRepository$pinAsEntryPoint$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(xf9Var, changeSourcePointExperimentRepository$pinAsEntryPoint$$inlined$map$1$2$1) == coroutineSingletons) {
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
        changeSourcePointExperimentRepository$pinAsEntryPoint$$inlined$map$1$2$1 = new ChangeSourcePointExperimentRepository$pinAsEntryPoint$$inlined$map$1$2$1(this, continuation);
        Object obj22 = changeSourcePointExperimentRepository$pinAsEntryPoint$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = changeSourcePointExperimentRepository$pinAsEntryPoint$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
