package com.yandex.go.flex.main_screen.presentation.feed;

import com.yandex.go.flex.main_screen.experiments.j;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ e b;

    public c(vpr vprVar, e eVar) {
        this.a = vprVar;
        this.b = eVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009a, code lost:
    
        if (r8.emit(r7, r0) != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MainScreenFeedStateRepositoryImpl$special$$inlined$map$1$2$1 mainScreenFeedStateRepositoryImpl$special$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        boolean z;
        if (continuation instanceof MainScreenFeedStateRepositoryImpl$special$$inlined$map$1$2$1) {
            mainScreenFeedStateRepositoryImpl$special$$inlined$map$1$2$1 = (MainScreenFeedStateRepositoryImpl$special$$inlined$map$1$2$1) continuation;
            int i2 = mainScreenFeedStateRepositoryImpl$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mainScreenFeedStateRepositoryImpl$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = mainScreenFeedStateRepositoryImpl$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mainScreenFeedStateRepositoryImpl$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    j jVar = this.b.a;
                    mainScreenFeedStateRepositoryImpl$special$$inlined$map$1$2$1.L$0 = null;
                    mainScreenFeedStateRepositoryImpl$special$$inlined$map$1$2$1.L$1 = null;
                    mainScreenFeedStateRepositoryImpl$special$$inlined$map$1$2$1.L$2 = null;
                    mainScreenFeedStateRepositoryImpl$special$$inlined$map$1$2$1.L$3 = null;
                    vpr vprVar2 = this.a;
                    mainScreenFeedStateRepositoryImpl$special$$inlined$map$1$2$1.L$4 = vprVar2;
                    mainScreenFeedStateRepositoryImpl$special$$inlined$map$1$2$1.L$5 = null;
                    mainScreenFeedStateRepositoryImpl$special$$inlined$map$1$2$1.Z$0 = booleanValue;
                    mainScreenFeedStateRepositoryImpl$special$$inlined$map$1$2$1.label = 1;
                    obj2 = jVar.d(mainScreenFeedStateRepositoryImpl$special$$inlined$map$1$2$1);
                    if (obj2 != coroutineSingletons) {
                        vprVar = vprVar2;
                        z = booleanValue;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11.a;
                }
                z = mainScreenFeedStateRepositoryImpl$special$$inlined$map$1$2$1.Z$0;
                vprVar = (vpr) mainScreenFeedStateRepositoryImpl$special$$inlined$map$1$2$1.L$4;
                kotlin.b.b(obj2);
                Boolean valueOf = Boolean.valueOf(!((Boolean) obj2).booleanValue() && z);
                mainScreenFeedStateRepositoryImpl$special$$inlined$map$1$2$1.L$0 = null;
                mainScreenFeedStateRepositoryImpl$special$$inlined$map$1$2$1.L$1 = null;
                mainScreenFeedStateRepositoryImpl$special$$inlined$map$1$2$1.L$2 = null;
                mainScreenFeedStateRepositoryImpl$special$$inlined$map$1$2$1.L$3 = null;
                mainScreenFeedStateRepositoryImpl$special$$inlined$map$1$2$1.L$4 = null;
                mainScreenFeedStateRepositoryImpl$special$$inlined$map$1$2$1.L$5 = null;
                mainScreenFeedStateRepositoryImpl$special$$inlined$map$1$2$1.label = 2;
            }
        }
        mainScreenFeedStateRepositoryImpl$special$$inlined$map$1$2$1 = new MainScreenFeedStateRepositoryImpl$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = mainScreenFeedStateRepositoryImpl$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mainScreenFeedStateRepositoryImpl$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        Boolean valueOf2 = Boolean.valueOf(!((Boolean) obj22).booleanValue() && z);
        mainScreenFeedStateRepositoryImpl$special$$inlined$map$1$2$1.L$0 = null;
        mainScreenFeedStateRepositoryImpl$special$$inlined$map$1$2$1.L$1 = null;
        mainScreenFeedStateRepositoryImpl$special$$inlined$map$1$2$1.L$2 = null;
        mainScreenFeedStateRepositoryImpl$special$$inlined$map$1$2$1.L$3 = null;
        mainScreenFeedStateRepositoryImpl$special$$inlined$map$1$2$1.L$4 = null;
        mainScreenFeedStateRepositoryImpl$special$$inlined$map$1$2$1.L$5 = null;
        mainScreenFeedStateRepositoryImpl$special$$inlined$map$1$2$1.label = 2;
    }
}
