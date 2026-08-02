package com.yandex.go.scooters.live.domain;

import android.content.Context;
import defpackage.g6u;
import defpackage.ny61;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class c {
    public final Context a;
    public final tt2 b;
    public final com.yandex.go.analytics.b c;
    public final b d;

    public c(Context context, tt2 tt2Var, com.yandex.go.analytics.b bVar, b bVar2) {
        this.a = context;
        this.b = tt2Var;
        this.c = bVar;
        this.d = bVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
    
        if (r9 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        ScootersLiveServiceStarterInteractorImpl$startLiveService$1 scootersLiveServiceStarterInteractorImpl$startLiveService$1;
        int i;
        boolean booleanValue;
        if (continuation instanceof ScootersLiveServiceStarterInteractorImpl$startLiveService$1) {
            scootersLiveServiceStarterInteractorImpl$startLiveService$1 = (ScootersLiveServiceStarterInteractorImpl$startLiveService$1) continuation;
            int i2 = scootersLiveServiceStarterInteractorImpl$startLiveService$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersLiveServiceStarterInteractorImpl$startLiveService$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersLiveServiceStarterInteractorImpl$startLiveService$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersLiveServiceStarterInteractorImpl$startLiveService$1.label;
                zy11 zy11Var = zy11.a;
                tt2 tt2Var = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tt2Var.getClass();
                    sjh sjhVar = uyj.a;
                    ScootersLiveServiceStarterInteractorImpl$startLiveService$isActive$1 scootersLiveServiceStarterInteractorImpl$startLiveService$isActive$1 = new ScootersLiveServiceStarterInteractorImpl$startLiveService$isActive$1(this, null);
                    scootersLiveServiceStarterInteractorImpl$startLiveService$1.label = 1;
                    obj = tje.k0(sjhVar, scootersLiveServiceStarterInteractorImpl$startLiveService$isActive$1, scootersLiveServiceStarterInteractorImpl$startLiveService$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return zy11Var;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                booleanValue = ((Boolean) obj).booleanValue();
                if (booleanValue) {
                    tt2Var.getClass();
                    sjh sjhVar2 = uyj.a;
                    g6u g6uVar = o400.a;
                    ScootersLiveServiceStarterInteractorImpl$startLiveService$2 scootersLiveServiceStarterInteractorImpl$startLiveService$2 = new ScootersLiveServiceStarterInteractorImpl$startLiveService$2(this, null);
                    scootersLiveServiceStarterInteractorImpl$startLiveService$1.Z$0 = booleanValue;
                    scootersLiveServiceStarterInteractorImpl$startLiveService$1.label = 2;
                    if (tje.k0(g6uVar, scootersLiveServiceStarterInteractorImpl$startLiveService$2, scootersLiveServiceStarterInteractorImpl$startLiveService$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11Var;
            }
        }
        scootersLiveServiceStarterInteractorImpl$startLiveService$1 = new ScootersLiveServiceStarterInteractorImpl$startLiveService$1(this, continuation);
        Object obj2 = scootersLiveServiceStarterInteractorImpl$startLiveService$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersLiveServiceStarterInteractorImpl$startLiveService$1.label;
        zy11 zy11Var2 = zy11.a;
        tt2 tt2Var2 = this.b;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        if (booleanValue) {
        }
        return zy11Var2;
    }
}
