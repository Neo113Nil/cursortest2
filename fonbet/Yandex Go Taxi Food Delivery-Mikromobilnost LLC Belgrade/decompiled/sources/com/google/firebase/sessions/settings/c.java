package com.google.firebase.sessions.settings;

import defpackage.bvf0;
import defpackage.e7z0;
import defpackage.fse;
import defpackage.myq0;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tpg;
import defpackage.zy11;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class c {
    public final e7z0 a;
    public final tpg b;
    public final AtomicReference c = new AtomicReference();

    public c(fse fseVar, e7z0 e7z0Var, tpg tpgVar) {
        this.a = e7z0Var;
        this.b = tpgVar;
        tje.N(bvf0.a(fseVar), null, null, new SettingsCacheImpl$1(this, null), 3);
    }

    public final myq0 a() {
        AtomicReference atomicReference = this.c;
        if (atomicReference.get() == null) {
            Object Y = tje.Y(EmptyCoroutineContext.a, new SettingsCacheImpl$sessionConfigs$1(this, null));
            while (!atomicReference.compareAndSet(null, Y) && atomicReference.get() == null) {
            }
        }
        return (myq0) atomicReference.get();
    }

    public final boolean b() {
        Long l = a().e;
        Integer num = a().d;
        if (l == null || num == null) {
            return true;
        }
        this.a.getClass();
        return e7z0.a().c - l.longValue() >= ((long) num.intValue());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
    
        r5.toString();
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(myq0 myq0Var, ContinuationImpl continuationImpl) {
        SettingsCacheImpl$updateConfigs$1 settingsCacheImpl$updateConfigs$1;
        int i;
        if (continuationImpl instanceof SettingsCacheImpl$updateConfigs$1) {
            settingsCacheImpl$updateConfigs$1 = (SettingsCacheImpl$updateConfigs$1) continuationImpl;
            int i2 = settingsCacheImpl$updateConfigs$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                settingsCacheImpl$updateConfigs$1.label = i2 - Integer.MIN_VALUE;
                Object obj = settingsCacheImpl$updateConfigs$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = settingsCacheImpl$updateConfigs$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tpg tpgVar = this.b;
                    SettingsCacheImpl$updateConfigs$2 settingsCacheImpl$updateConfigs$2 = new SettingsCacheImpl$updateConfigs$2(myq0Var, null);
                    settingsCacheImpl$updateConfigs$1.label = 1;
                    if (tpgVar.a(settingsCacheImpl$updateConfigs$2, settingsCacheImpl$updateConfigs$1) == coroutineSingletons) {
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
        settingsCacheImpl$updateConfigs$1 = new SettingsCacheImpl$updateConfigs$1(this, continuationImpl);
        Object obj2 = settingsCacheImpl$updateConfigs$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = settingsCacheImpl$updateConfigs$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
