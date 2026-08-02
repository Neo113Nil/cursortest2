package com.yandex.go.user_profile.settings.style.domain;

import com.yandex.go.user_profile.fullscreen.models.UserProfileExperiment;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zdr0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
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
        SettingsStyleInteractorImpl$settingsStyleFlow$$inlined$map$1$2$1 settingsStyleInteractorImpl$settingsStyleFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof SettingsStyleInteractorImpl$settingsStyleFlow$$inlined$map$1$2$1) {
            settingsStyleInteractorImpl$settingsStyleFlow$$inlined$map$1$2$1 = (SettingsStyleInteractorImpl$settingsStyleFlow$$inlined$map$1$2$1) continuation;
            int i2 = settingsStyleInteractorImpl$settingsStyleFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                settingsStyleInteractorImpl$settingsStyleFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = settingsStyleInteractorImpl$settingsStyleFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = settingsStyleInteractorImpl$settingsStyleFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    zdr0 zdr0Var = ((UserProfileExperiment) obj).i() ? zdr0.b : zdr0.a;
                    settingsStyleInteractorImpl$settingsStyleFlow$$inlined$map$1$2$1.L$0 = null;
                    settingsStyleInteractorImpl$settingsStyleFlow$$inlined$map$1$2$1.L$1 = null;
                    settingsStyleInteractorImpl$settingsStyleFlow$$inlined$map$1$2$1.L$2 = null;
                    settingsStyleInteractorImpl$settingsStyleFlow$$inlined$map$1$2$1.L$3 = null;
                    settingsStyleInteractorImpl$settingsStyleFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(zdr0Var, settingsStyleInteractorImpl$settingsStyleFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        settingsStyleInteractorImpl$settingsStyleFlow$$inlined$map$1$2$1 = new SettingsStyleInteractorImpl$settingsStyleFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = settingsStyleInteractorImpl$settingsStyleFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = settingsStyleInteractorImpl$settingsStyleFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
