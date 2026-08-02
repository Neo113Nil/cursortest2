package com.ybsdk.di.modules.features;

import com.ybsdk.api.entities.YBSdkSettingsTheme;
import com.ybsdk.feature.settings.api.SettingsTheme;
import defpackage.jx81;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes3.dex */
public final class r implements vpr {
    public final /* synthetic */ vpr a;

    public r(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SettingsFeatureModule$settingsThemeManager$1$special$$inlined$map$1$2$1 settingsFeatureModule$settingsThemeManager$1$special$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof SettingsFeatureModule$settingsThemeManager$1$special$$inlined$map$1$2$1) {
            settingsFeatureModule$settingsThemeManager$1$special$$inlined$map$1$2$1 = (SettingsFeatureModule$settingsThemeManager$1$special$$inlined$map$1$2$1) continuation;
            int i2 = settingsFeatureModule$settingsThemeManager$1$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                settingsFeatureModule$settingsThemeManager$1$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = settingsFeatureModule$settingsThemeManager$1$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = settingsFeatureModule$settingsThemeManager$1$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    SettingsTheme J = jx81.J((YBSdkSettingsTheme) obj);
                    settingsFeatureModule$settingsThemeManager$1$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(J, settingsFeatureModule$settingsThemeManager$1$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        settingsFeatureModule$settingsThemeManager$1$special$$inlined$map$1$2$1 = new SettingsFeatureModule$settingsThemeManager$1$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = settingsFeatureModule$settingsThemeManager$1$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = settingsFeatureModule$settingsThemeManager$1$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
