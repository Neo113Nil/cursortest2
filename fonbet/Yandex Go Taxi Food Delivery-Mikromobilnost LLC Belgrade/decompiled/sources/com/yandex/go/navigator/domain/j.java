package com.yandex.go.navigator.domain;

import defpackage.g950;
import defpackage.h950;
import defpackage.i950;
import defpackage.j950;
import defpackage.jl40;
import defpackage.k950;
import defpackage.l950;
import defpackage.ny61;
import defpackage.pe50;
import defpackage.w511;
import defpackage.yxf0;
import defpackage.zy11;
import java.io.IOException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class j {
    public final t a;
    public final com.yandex.go.navigator.alt_select.a b;
    public final yxf0 c;

    public j(t tVar, com.yandex.go.navigator.alt_select.a aVar, yxf0 yxf0Var) {
        this.a = tVar;
        this.b = aVar;
        this.c = yxf0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(pe50 pe50Var, ContinuationImpl continuationImpl) {
        HandleStartOnLaunchInteractor$start$1 handleStartOnLaunchInteractor$start$1;
        int i;
        l950 l950Var;
        if (continuationImpl instanceof HandleStartOnLaunchInteractor$start$1) {
            handleStartOnLaunchInteractor$start$1 = (HandleStartOnLaunchInteractor$start$1) continuationImpl;
            int i2 = handleStartOnLaunchInteractor$start$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                handleStartOnLaunchInteractor$start$1.label = i2 - Integer.MIN_VALUE;
                Object obj = handleStartOnLaunchInteractor$start$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = handleStartOnLaunchInteractor$start$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    i iVar = new i(new kotlinx.coroutines.flow.n(this.a.M, new HandleStartOnLaunchInteractor$start$requestRoutesResult$1(this, pe50Var, null)));
                    handleStartOnLaunchInteractor$start$1.L$0 = null;
                    handleStartOnLaunchInteractor$start$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.y(iVar, handleStartOnLaunchInteractor$start$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                l950Var = (l950) obj;
                if (!jl40.l(l950Var, h950.a)) {
                    this.b.a();
                    return zy11.a;
                }
                if (jl40.l(l950Var, j950.a) || jl40.l(l950Var, k950.a)) {
                    return new Result.Failure(new IOException("Routes request failed"));
                }
                if (jl40.l(l950Var, g950.a) || jl40.l(l950Var, i950.a)) {
                    return new Result.Failure(new IllegalStateException("Filtered out NavigationRouteState"));
                }
                w511.b();
                return null;
            }
        }
        handleStartOnLaunchInteractor$start$1 = new HandleStartOnLaunchInteractor$start$1(this, continuationImpl);
        Object obj2 = handleStartOnLaunchInteractor$start$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = handleStartOnLaunchInteractor$start$1.label;
        if (i != 0) {
        }
        l950Var = (l950) obj2;
        if (!jl40.l(l950Var, h950.a)) {
        }
    }
}
