package com.yandex.go.flex.main_screen.interactors;

import defpackage.i7x0;
import defpackage.jl40;
import defpackage.jmr;
import defpackage.jst;
import defpackage.ny61;
import defpackage.u1m;
import defpackage.y500;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class c {
    public final y500 a;

    public c(y500 y500Var) {
        this.a = y500Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(2:19|(2:21|(1:23))(3:24|13|14))|12|13|14))|28|6|7|(0)(0)|12|13|14|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
    
        throw r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(u1m u1mVar, ContinuationImpl continuationImpl) {
        MainScreenDocumentPrefetchInteractor$prefetchDocument$1 mainScreenDocumentPrefetchInteractor$prefetchDocument$1;
        int i;
        if (continuationImpl instanceof MainScreenDocumentPrefetchInteractor$prefetchDocument$1) {
            mainScreenDocumentPrefetchInteractor$prefetchDocument$1 = (MainScreenDocumentPrefetchInteractor$prefetchDocument$1) continuationImpl;
            int i2 = mainScreenDocumentPrefetchInteractor$prefetchDocument$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mainScreenDocumentPrefetchInteractor$prefetchDocument$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mainScreenDocumentPrefetchInteractor$prefetchDocument$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mainScreenDocumentPrefetchInteractor$prefetchDocument$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.go.flex.main_screen.data.network.c cVar = (com.yandex.go.flex.main_screen.data.network.c) this.a.get();
                    if (cVar == null) {
                        jst.e.s(new IllegalStateException("MainScreenDocumentLoader is not present"));
                        return zy11.a;
                    }
                    boolean l = jl40.l(jmr.a.get(), Boolean.TRUE);
                    mainScreenDocumentPrefetchInteractor$prefetchDocument$1.L$0 = null;
                    mainScreenDocumentPrefetchInteractor$prefetchDocument$1.L$1 = null;
                    mainScreenDocumentPrefetchInteractor$prefetchDocument$1.label = 1;
                    if (cVar.b(u1mVar, new i7x0(), l, mainScreenDocumentPrefetchInteractor$prefetchDocument$1) == coroutineSingletons) {
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
        mainScreenDocumentPrefetchInteractor$prefetchDocument$1 = new MainScreenDocumentPrefetchInteractor$prefetchDocument$1(this, continuationImpl);
        Object obj2 = mainScreenDocumentPrefetchInteractor$prefetchDocument$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mainScreenDocumentPrefetchInteractor$prefetchDocument$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
