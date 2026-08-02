package com.yandex.go.walking.navigation.impl.guidance.service;

import android.content.Context;
import android.content.Intent;
import defpackage.ist;
import defpackage.jst;
import defpackage.k0b0;
import defpackage.k441;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.tse;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class e {
    public final Context a;
    public final tse b;
    public final k0b0 c;
    public final k441 d;
    public final ist e = jst.e.A("WALKING_NAVIGATION:GUIDANCE_SERVICE_INTERACTOR");
    public final Intent f;
    public pzt0 g;

    public e(Context context, tse tseVar, k0b0 k0b0Var, k441 k441Var) {
        this.a = context;
        this.b = tseVar;
        this.c = k0b0Var;
        this.d = k441Var;
        this.f = new Intent(context, (Class<?>) WalkNavGuidanceService.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(e eVar, ContinuationImpl continuationImpl) {
        WalkNavGuidanceServiceInteractor$awaitPermission$1 walkNavGuidanceServiceInteractor$awaitPermission$1;
        int i;
        eVar.getClass();
        if (continuationImpl instanceof WalkNavGuidanceServiceInteractor$awaitPermission$1) {
            walkNavGuidanceServiceInteractor$awaitPermission$1 = (WalkNavGuidanceServiceInteractor$awaitPermission$1) continuationImpl;
            int i2 = walkNavGuidanceServiceInteractor$awaitPermission$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                walkNavGuidanceServiceInteractor$awaitPermission$1.label = i2 - Integer.MIN_VALUE;
                Object obj = walkNavGuidanceServiceInteractor$awaitPermission$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = walkNavGuidanceServiceInteractor$awaitPermission$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = new b(new d(eVar.d.b, eVar));
                    walkNavGuidanceServiceInteractor$awaitPermission$1.label = 1;
                    if (kotlinx.coroutines.flow.e.y(bVar, walkNavGuidanceServiceInteractor$awaitPermission$1) == coroutineSingletons) {
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
        walkNavGuidanceServiceInteractor$awaitPermission$1 = new WalkNavGuidanceServiceInteractor$awaitPermission$1(eVar, continuationImpl);
        Object obj2 = walkNavGuidanceServiceInteractor$awaitPermission$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = walkNavGuidanceServiceInteractor$awaitPermission$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    public final void b() {
        this.e.getClass();
        k0b0 k0b0Var = this.c;
        boolean z = k0b0Var.a() || k0b0Var.g();
        pzt0 pzt0Var = this.g;
        if (z) {
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            this.a.startForegroundService(this.f);
        } else if (pzt0Var == null || !pzt0Var.isActive()) {
            this.g = com.yandex.go.coroutines.b.g(this.b, null, null, new WalkNavGuidanceServiceInteractor$startService$1(this, null), 3);
        }
    }

    public final void c() {
        this.e.getClass();
        pzt0 pzt0Var = this.g;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.a.stopService(this.f);
    }
}
