package com.yandex.passport.internal.ui.router;

import android.content.Intent;
import android.os.Bundle;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import defpackage.ffx;
import defpackage.ny61;
import defpackage.yr31;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes8.dex */
public final class m extends yr31 {
    public final com.yandex.passport.internal.flags.j b;
    public final PassportProcessGlobalComponent c = com.yandex.passport.internal.di.a.a();
    public final n0 w = ffx.c(0, 0, null, 7);

    public m(com.yandex.passport.internal.flags.j jVar) {
        this.b = jVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0084, code lost:
    
        if (r8 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007e, code lost:
    
        if (r7.w.emit(r9, r0) == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object W(Intent intent, boolean z, ContinuationImpl continuationImpl) {
        GlobalRouterViewModel$wire$1 globalRouterViewModel$wire$1;
        int i;
        RoadSign roadSign;
        String string;
        zy11 zy11Var;
        if (continuationImpl instanceof GlobalRouterViewModel$wire$1) {
            globalRouterViewModel$wire$1 = (GlobalRouterViewModel$wire$1) continuationImpl;
            int i2 = globalRouterViewModel$wire$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                globalRouterViewModel$wire$1.label = i2 - Integer.MIN_VALUE;
                Object obj = globalRouterViewModel$wire$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = globalRouterViewModel$wire$1.label;
                zy11 zy11Var2 = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (intent != null) {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            try {
                                string = extras.getString(GlobalRouterActivity.ROAD_SIGN_EXTRA, null);
                            } catch (IllegalArgumentException unused) {
                            }
                            if (string != null) {
                                roadSign = RoadSign.valueOf(string);
                                if (roadSign != null) {
                                    if (!z || !((Boolean) this.b.b(com.yandex.passport.internal.flags.q.B0)).booleanValue()) {
                                        k kVar = new k(roadSign, extras, extras.getString(GlobalRouterActivity.CORRECTION_EXTRA, null));
                                        globalRouterViewModel$wire$1.L$0 = this;
                                        globalRouterViewModel$wire$1.label = 1;
                                    }
                                }
                            }
                            roadSign = null;
                            if (roadSign != null) {
                            }
                        }
                        zy11Var = null;
                    }
                    n0 n0Var = this.w;
                    globalRouterViewModel$wire$1.L$0 = null;
                    globalRouterViewModel$wire$1.label = 2;
                    return n0Var.emit(h.a, globalRouterViewModel$wire$1) == coroutineSingletons ? coroutineSingletons : zy11Var2;
                }
                if (i != 1) {
                    if (i == 2) {
                        kotlin.b.b(obj);
                        return zy11Var2;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = (m) globalRouterViewModel$wire$1.L$0;
                kotlin.b.b(obj);
                zy11Var = zy11Var2;
            }
        }
        globalRouterViewModel$wire$1 = new GlobalRouterViewModel$wire$1(this, continuationImpl);
        Object obj2 = globalRouterViewModel$wire$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = globalRouterViewModel$wire$1.label;
        zy11 zy11Var22 = zy11.a;
        if (i != 0) {
        }
        zy11Var = zy11Var22;
    }
}
