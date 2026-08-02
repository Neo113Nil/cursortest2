package com.yandex.plus.home.plaque.plugin.internal;

import com.yandex.plus.home.state.UpdateTargetEvent;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PlusPlaquePluginBuilder$build$lambda$5$$inlined$filter$1$2$1 plusPlaquePluginBuilder$build$lambda$5$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof PlusPlaquePluginBuilder$build$lambda$5$$inlined$filter$1$2$1) {
            plusPlaquePluginBuilder$build$lambda$5$$inlined$filter$1$2$1 = (PlusPlaquePluginBuilder$build$lambda$5$$inlined$filter$1$2$1) continuation;
            int i2 = plusPlaquePluginBuilder$build$lambda$5$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusPlaquePluginBuilder$build$lambda$5$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = plusPlaquePluginBuilder$build$lambda$5$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusPlaquePluginBuilder$build$lambda$5$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Set set = (Set) obj;
                    if (set.contains(UpdateTargetEvent.PLAQUE) || set.contains(UpdateTargetEvent.ALL)) {
                        plusPlaquePluginBuilder$build$lambda$5$$inlined$filter$1$2$1.L$0 = null;
                        plusPlaquePluginBuilder$build$lambda$5$$inlined$filter$1$2$1.L$1 = null;
                        plusPlaquePluginBuilder$build$lambda$5$$inlined$filter$1$2$1.L$2 = null;
                        plusPlaquePluginBuilder$build$lambda$5$$inlined$filter$1$2$1.L$3 = null;
                        plusPlaquePluginBuilder$build$lambda$5$$inlined$filter$1$2$1.I$0 = 0;
                        plusPlaquePluginBuilder$build$lambda$5$$inlined$filter$1$2$1.label = 1;
                        if (this.a.emit(obj, plusPlaquePluginBuilder$build$lambda$5$$inlined$filter$1$2$1) == coroutineSingletons) {
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
        plusPlaquePluginBuilder$build$lambda$5$$inlined$filter$1$2$1 = new PlusPlaquePluginBuilder$build$lambda$5$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = plusPlaquePluginBuilder$build$lambda$5$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusPlaquePluginBuilder$build$lambda$5$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
