package com.ybsdk.feature.settings.internal.data;

import com.ybsdk.core.utils.dto.OldDataWithStatusResponse;
import com.ybsdk.core.utils.dto.OldTwoFactorAuthResponse;
import com.ybsdk.core.utils.dto.f;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.feature.settings.internal.network.SettingsApi;
import defpackage.ec01;
import defpackage.ny61;
import defpackage.o8r0;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class b {
    public final SettingsApi a;

    public b(SettingsApi settingsApi) {
        this.a = settingsApi;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        SettingsRepository$getSettings$1 settingsRepository$getSettings$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof SettingsRepository$getSettings$1) {
            settingsRepository$getSettings$1 = (SettingsRepository$getSettings$1) continuationImpl;
            int i2 = settingsRepository$getSettings$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                settingsRepository$getSettings$1.label = i2 - Integer.MIN_VALUE;
                Object obj = settingsRepository$getSettings$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = settingsRepository$getSettings$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    SettingsRepository$getSettings$2 settingsRepository$getSettings$2 = new SettingsRepository$getSettings$2(this, null);
                    settingsRepository$getSettings$1.label = 1;
                    c = c.c(settingsRepository$getSettings$2, settingsRepository$getSettings$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                SettingsRepository$getSettings$3$1 settingsRepository$getSettings$3$1 = SettingsRepository$getSettings$3$1.a;
                settingsRepository$getSettings$1.label = 2;
                Object e = com.ybsdk.core.utils.dto.b.e((OldDataWithStatusResponse) c, settingsRepository$getSettings$3$1, settingsRepository$getSettings$1);
                return e == coroutineSingletons ? coroutineSingletons : e;
            }
        }
        settingsRepository$getSettings$1 = new SettingsRepository$getSettings$1(this, continuationImpl);
        Object obj2 = settingsRepository$getSettings$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = settingsRepository$getSettings$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, o8r0 o8r0Var, String str2, String str3, ContinuationImpl continuationImpl) {
        SettingsRepository$setSetting$1 settingsRepository$setSetting$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof SettingsRepository$setSetting$1) {
            settingsRepository$setSetting$1 = (SettingsRepository$setSetting$1) continuationImpl;
            int i2 = settingsRepository$setSetting$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                settingsRepository$setSetting$1.label = i2 - Integer.MIN_VALUE;
                Object obj = settingsRepository$setSetting$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = settingsRepository$setSetting$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    SettingsRepository$setSetting$2 settingsRepository$setSetting$2 = new SettingsRepository$setSetting$2(this, str, str3, str2, o8r0Var, null);
                    settingsRepository$setSetting$1.label = 1;
                    c = c.c(settingsRepository$setSetting$2, settingsRepository$setSetting$1);
                    if (c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                return f.b((OldTwoFactorAuthResponse) c, new ec01(10, SettingsRepository$setSetting$3$1.b));
            }
        }
        settingsRepository$setSetting$1 = new SettingsRepository$setSetting$1(this, continuationImpl);
        Object obj2 = settingsRepository$setSetting$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = settingsRepository$setSetting$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }
}
