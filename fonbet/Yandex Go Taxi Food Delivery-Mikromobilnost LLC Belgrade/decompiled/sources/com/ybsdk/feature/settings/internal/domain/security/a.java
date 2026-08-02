package com.ybsdk.feature.settings.internal.domain.security;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.settings.api.domain.SettingsItemEntity$Type;
import com.ybsdk.rconfig.configs.CommonFeatureFlag;
import defpackage.dzh0;
import defpackage.g8e;
import defpackage.if8;
import defpackage.j59;
import defpackage.nw70;
import defpackage.ny61;
import defpackage.o8r0;
import defpackage.unr0;
import defpackage.v7r0;
import defpackage.wlp;
import defpackage.x7r0;
import java.util.ArrayList;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final nw70 a;
    public final x7r0 b;
    public final if8 c;

    public a(nw70 nw70Var, x7r0 x7r0Var, if8 if8Var) {
        this.a = nw70Var;
        this.b = x7r0Var;
        this.c = if8Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.ybsdk.core.utils.text.Text] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        SecuritySettingsInteractor$getBiometricItem$1 securitySettingsInteractor$getBiometricItem$1;
        int i;
        SettingsItemEntity$Type settingsItemEntity$Type;
        Text h;
        Text.Resource resource;
        String str;
        int i2;
        if (continuationImpl instanceof SecuritySettingsInteractor$getBiometricItem$1) {
            securitySettingsInteractor$getBiometricItem$1 = (SecuritySettingsInteractor$getBiometricItem$1) continuationImpl;
            int i3 = securitySettingsInteractor$getBiometricItem$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                securitySettingsInteractor$getBiometricItem$1.label = i3 - Integer.MIN_VALUE;
                Object obj = securitySettingsInteractor$getBiometricItem$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = securitySettingsInteractor$getBiometricItem$1.label;
                if (i != 0) {
                    b.b(obj);
                    settingsItemEntity$Type = SettingsItemEntity$Type.SWITCH;
                    h = unr0.h(Text.Companion, dzh0.ybsdk_pin_biometric_settings_title);
                    Text.Resource resource2 = new Text.Resource(dzh0.ybsdk_pin_biometric_settings_description);
                    securitySettingsInteractor$getBiometricItem$1.L$0 = "biometric";
                    securitySettingsInteractor$getBiometricItem$1.L$1 = settingsItemEntity$Type;
                    securitySettingsInteractor$getBiometricItem$1.L$2 = h;
                    securitySettingsInteractor$getBiometricItem$1.L$3 = resource2;
                    securitySettingsInteractor$getBiometricItem$1.I$0 = 1;
                    securitySettingsInteractor$getBiometricItem$1.label = 1;
                    Object k = ((com.ybsdk.feature.pin.internal.a) this.a.b).c.k(securitySettingsInteractor$getBiometricItem$1);
                    if (k == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    resource = resource2;
                    str = "biometric";
                    obj = k;
                    i2 = 1;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = securitySettingsInteractor$getBiometricItem$1.I$0;
                    ?? r3 = (Text) securitySettingsInteractor$getBiometricItem$1.L$3;
                    h = (Text) securitySettingsInteractor$getBiometricItem$1.L$2;
                    settingsItemEntity$Type = (SettingsItemEntity$Type) securitySettingsInteractor$getBiometricItem$1.L$1;
                    String str2 = (String) securitySettingsInteractor$getBiometricItem$1.L$0;
                    b.b(obj);
                    str = str2;
                    resource = r3;
                }
                return new o8r0(str, settingsItemEntity$Type, h, resource, null, i2 != 0, ((Boolean) obj).booleanValue(), null, null, null, null, 3984);
            }
        }
        securitySettingsInteractor$getBiometricItem$1 = new SecuritySettingsInteractor$getBiometricItem$1(this, continuationImpl);
        Object obj2 = securitySettingsInteractor$getBiometricItem$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = securitySettingsInteractor$getBiometricItem$1.label;
        if (i != 0) {
        }
        return new o8r0(str, settingsItemEntity$Type, h, resource, null, i2 != 0, ((Boolean) obj2).booleanValue(), null, null, null, null, 3984);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x015c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r26v0, types: [com.ybsdk.feature.settings.internal.domain.security.a] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(v7r0 v7r0Var, ContinuationImpl continuationImpl) {
        SecuritySettingsInteractor$getSecuritySettings$1 securitySettingsInteractor$getSecuritySettings$1;
        Object obj;
        int i;
        v7r0 v7r0Var2;
        ArrayList arrayList;
        v7r0 v7r0Var3;
        ArrayList arrayList2;
        v7r0 v7r0Var4;
        ArrayList arrayList3;
        List list;
        v7r0 v7r0Var5;
        ArrayList arrayList4;
        ArrayList arrayList5;
        if (continuationImpl instanceof SecuritySettingsInteractor$getSecuritySettings$1) {
            securitySettingsInteractor$getSecuritySettings$1 = (SecuritySettingsInteractor$getSecuritySettings$1) continuationImpl;
            int i2 = securitySettingsInteractor$getSecuritySettings$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                securitySettingsInteractor$getSecuritySettings$1.label = i2 - Integer.MIN_VALUE;
                obj = securitySettingsInteractor$getSecuritySettings$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = securitySettingsInteractor$getSecuritySettings$1.label;
                nw70 nw70Var = this.a;
                if (i != 0) {
                    ArrayList t = g8e.t(obj);
                    v7r0Var2 = v7r0Var;
                    securitySettingsInteractor$getSecuritySettings$1.L$0 = v7r0Var2;
                    securitySettingsInteractor$getSecuritySettings$1.L$1 = t;
                    securitySettingsInteractor$getSecuritySettings$1.label = 1;
                    Object d = ((com.ybsdk.feature.pin.internal.a) nw70Var.b).d(securitySettingsInteractor$getSecuritySettings$1);
                    if (d != coroutineSingletons) {
                        arrayList = t;
                        obj = d;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        ?? r4 = (List) securitySettingsInteractor$getSecuritySettings$1.L$1;
                        v7r0Var3 = (v7r0) securitySettingsInteractor$getSecuritySettings$1.L$0;
                        b.b(obj);
                        arrayList2 = r4;
                        if (((Boolean) obj).booleanValue()) {
                            arrayList2.add(new o8r0("set_pin", SettingsItemEntity$Type.GOTO, unr0.h(Text.Companion, dzh0.ybsdk_pin_set_pin_settings_title), new Text.Resource(dzh0.ybsdk_pin_set_pin_settings_description), null, true, false, null, null, null, null, 4048));
                            arrayList = arrayList2;
                            v7r0Var2 = v7r0Var3;
                            if (((CommonFeatureFlag) this.c.a.d(wlp.C).getData()).isEnabled()) {
                            }
                            return new j59("security_settings_category", unr0.h(Text.Companion, dzh0.ybsdk_common_security_settings_title), arrayList);
                        }
                        securitySettingsInteractor$getSecuritySettings$1.L$0 = v7r0Var3;
                        securitySettingsInteractor$getSecuritySettings$1.L$1 = arrayList2;
                        securitySettingsInteractor$getSecuritySettings$1.label = 3;
                        obj = Boolean.valueOf(((com.ybsdk.feature.pin.internal.domain.biometric.a) ((com.ybsdk.feature.pin.internal.a) nw70Var.b).e).c());
                        if (obj != coroutineSingletons) {
                            v7r0Var4 = v7r0Var3;
                            arrayList3 = arrayList2;
                            arrayList4 = arrayList3;
                            if (((Boolean) obj).booleanValue()) {
                            }
                            arrayList4.add(new o8r0("change_pin", SettingsItemEntity$Type.GOTO, unr0.h(Text.Companion, dzh0.ybsdk_pin_change_pin_settings), new Text.Resource(dzh0.ybsdk_pin_change_pin_settings_description), null, true, false, null, null, null, null, 4048));
                            arrayList = arrayList4;
                            v7r0Var2 = v7r0Var4;
                            if (((CommonFeatureFlag) this.c.a.d(wlp.C).getData()).isEnabled()) {
                            }
                            return new j59("security_settings_category", unr0.h(Text.Companion, dzh0.ybsdk_common_security_settings_title), arrayList);
                        }
                        return coroutineSingletons;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        list = (List) securitySettingsInteractor$getSecuritySettings$1.L$2;
                        ?? r42 = (List) securitySettingsInteractor$getSecuritySettings$1.L$1;
                        v7r0Var5 = (v7r0) securitySettingsInteractor$getSecuritySettings$1.L$0;
                        b.b(obj);
                        arrayList5 = r42;
                        list.add(obj);
                        v7r0Var4 = v7r0Var5;
                        arrayList4 = arrayList5;
                        arrayList4.add(new o8r0("change_pin", SettingsItemEntity$Type.GOTO, unr0.h(Text.Companion, dzh0.ybsdk_pin_change_pin_settings), new Text.Resource(dzh0.ybsdk_pin_change_pin_settings_description), null, true, false, null, null, null, null, 4048));
                        arrayList = arrayList4;
                        v7r0Var2 = v7r0Var4;
                        if (((CommonFeatureFlag) this.c.a.d(wlp.C).getData()).isEnabled() && (v7r0Var2 == null || !v7r0Var2.a())) {
                            SettingsItemEntity$Type settingsItemEntity$Type = SettingsItemEntity$Type.SWITCH;
                            Text.Resource h = unr0.h(Text.Companion, dzh0.ybsdk_settings_spoiler_hide_with_gesture_settings_title);
                            Text.Resource resource = new Text.Resource(dzh0.ybsdk_settings_spoiler_settings_description);
                            x7r0 x7r0Var = this.b;
                            o8r0 o8r0Var = new o8r0("hide_spoiler_on_rotation", settingsItemEntity$Type, h, resource, null, true, x7r0Var.a.a(), null, null, null, null, 3984);
                            arrayList.add(o8r0Var);
                            boolean z = o8r0Var.g;
                            boolean z2 = false ? 1 : 0;
                            arrayList.add(new o8r0("show_spoiler_on_launch", settingsItemEntity$Type, new Text.Resource(dzh0.ybsdk_settings_spoiler_always_hide_with_login_settings_title), new Text.Resource(dzh0.ybsdk_settings_spoiler_always_hide_with_login_settings_description), null, z, x7r0Var.a.b(), false ? 1 : 0, false ? 1 : 0, z2, null, 3984));
                        }
                        return new j59("security_settings_category", unr0.h(Text.Companion, dzh0.ybsdk_common_security_settings_title), arrayList);
                    }
                    ?? r43 = (List) securitySettingsInteractor$getSecuritySettings$1.L$1;
                    v7r0Var4 = (v7r0) securitySettingsInteractor$getSecuritySettings$1.L$0;
                    b.b(obj);
                    arrayList3 = r43;
                    arrayList4 = arrayList3;
                    if (((Boolean) obj).booleanValue()) {
                        securitySettingsInteractor$getSecuritySettings$1.L$0 = v7r0Var4;
                        securitySettingsInteractor$getSecuritySettings$1.L$1 = arrayList3;
                        securitySettingsInteractor$getSecuritySettings$1.L$2 = arrayList3;
                        securitySettingsInteractor$getSecuritySettings$1.label = 4;
                        obj = a(securitySettingsInteractor$getSecuritySettings$1);
                        if (obj != coroutineSingletons) {
                            list = arrayList3;
                            v7r0Var5 = v7r0Var4;
                            arrayList5 = arrayList3;
                            list.add(obj);
                            v7r0Var4 = v7r0Var5;
                            arrayList4 = arrayList5;
                        }
                        return coroutineSingletons;
                    }
                    arrayList4.add(new o8r0("change_pin", SettingsItemEntity$Type.GOTO, unr0.h(Text.Companion, dzh0.ybsdk_pin_change_pin_settings), new Text.Resource(dzh0.ybsdk_pin_change_pin_settings_description), null, true, false, null, null, null, null, 4048));
                    arrayList = arrayList4;
                    v7r0Var2 = v7r0Var4;
                    if (((CommonFeatureFlag) this.c.a.d(wlp.C).getData()).isEnabled()) {
                        SettingsItemEntity$Type settingsItemEntity$Type2 = SettingsItemEntity$Type.SWITCH;
                        Text.Resource h2 = unr0.h(Text.Companion, dzh0.ybsdk_settings_spoiler_hide_with_gesture_settings_title);
                        Text.Resource resource2 = new Text.Resource(dzh0.ybsdk_settings_spoiler_settings_description);
                        x7r0 x7r0Var2 = this.b;
                        o8r0 o8r0Var2 = new o8r0("hide_spoiler_on_rotation", settingsItemEntity$Type2, h2, resource2, null, true, x7r0Var2.a.a(), null, null, null, null, 3984);
                        arrayList.add(o8r0Var2);
                        boolean z3 = o8r0Var2.g;
                        boolean z22 = false ? 1 : 0;
                        arrayList.add(new o8r0("show_spoiler_on_launch", settingsItemEntity$Type2, new Text.Resource(dzh0.ybsdk_settings_spoiler_always_hide_with_login_settings_title), new Text.Resource(dzh0.ybsdk_settings_spoiler_always_hide_with_login_settings_description), null, z3, x7r0Var2.a.b(), false ? 1 : 0, false ? 1 : 0, z22, null, 3984));
                    }
                    return new j59("security_settings_category", unr0.h(Text.Companion, dzh0.ybsdk_common_security_settings_title), arrayList);
                }
                ?? r44 = (List) securitySettingsInteractor$getSecuritySettings$1.L$1;
                v7r0 v7r0Var6 = (v7r0) securitySettingsInteractor$getSecuritySettings$1.L$0;
                b.b(obj);
                arrayList = r44;
                v7r0Var2 = v7r0Var6;
                if (((Boolean) obj).booleanValue()) {
                    securitySettingsInteractor$getSecuritySettings$1.L$0 = v7r0Var2;
                    securitySettingsInteractor$getSecuritySettings$1.L$1 = arrayList;
                    securitySettingsInteractor$getSecuritySettings$1.label = 2;
                    obj = ((com.ybsdk.feature.pin.internal.a) nw70Var.b).c.l(securitySettingsInteractor$getSecuritySettings$1);
                    if (obj != coroutineSingletons) {
                        v7r0Var3 = v7r0Var2;
                        arrayList2 = arrayList;
                        if (((Boolean) obj).booleanValue()) {
                        }
                    }
                    return coroutineSingletons;
                }
                if (((CommonFeatureFlag) this.c.a.d(wlp.C).getData()).isEnabled()) {
                }
                return new j59("security_settings_category", unr0.h(Text.Companion, dzh0.ybsdk_common_security_settings_title), arrayList);
            }
        }
        securitySettingsInteractor$getSecuritySettings$1 = new SecuritySettingsInteractor$getSecuritySettings$1(this, continuationImpl);
        obj = securitySettingsInteractor$getSecuritySettings$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = securitySettingsInteractor$getSecuritySettings$1.label;
        nw70 nw70Var2 = this.a;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        if (((CommonFeatureFlag) this.c.a.d(wlp.C).getData()).isEnabled()) {
        }
        return new j59("security_settings_category", unr0.h(Text.Companion, dzh0.ybsdk_common_security_settings_title), arrayList);
    }
}
