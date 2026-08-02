package com.yandex.go.ultima_mode.domain;

import defpackage.mv11;
import defpackage.ny61;
import defpackage.pv01;
import defpackage.tpr;
import defpackage.tv11;
import defpackage.xv11;
import defpackage.zo1;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes8.dex */
public final class c implements xv11 {
    public final tv11 a;
    public final com.yandex.go.ultima_mode.preferences.a b;

    public c(tv11 tv11Var, com.yandex.go.ultima_mode.preferences.a aVar) {
        this.a = tv11Var;
        this.b = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        UltimaModeStateInteractorImpl$getUltimaAppearanceState$1 ultimaModeStateInteractorImpl$getUltimaAppearanceState$1;
        int i;
        boolean booleanValue;
        if (continuationImpl instanceof UltimaModeStateInteractorImpl$getUltimaAppearanceState$1) {
            ultimaModeStateInteractorImpl$getUltimaAppearanceState$1 = (UltimaModeStateInteractorImpl$getUltimaAppearanceState$1) continuationImpl;
            int i2 = ultimaModeStateInteractorImpl$getUltimaAppearanceState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ultimaModeStateInteractorImpl$getUltimaAppearanceState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = ultimaModeStateInteractorImpl$getUltimaAppearanceState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ultimaModeStateInteractorImpl$getUltimaAppearanceState$1.label;
                com.yandex.go.ultima_mode.preferences.a aVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ultimaModeStateInteractorImpl$getUltimaAppearanceState$1.label = 1;
                    aVar.getClass();
                    obj = aVar.a(new mv11(aVar, 0), ultimaModeStateInteractorImpl$getUltimaAppearanceState$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return ((Boolean) obj).booleanValue() ? "default" : "ultima";
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                booleanValue = ((Boolean) obj).booleanValue();
                if (booleanValue) {
                    return null;
                }
                ultimaModeStateInteractorImpl$getUltimaAppearanceState$1.Z$0 = booleanValue;
                ultimaModeStateInteractorImpl$getUltimaAppearanceState$1.label = 2;
                aVar.getClass();
                obj = aVar.a(new pv01(12, aVar), ultimaModeStateInteractorImpl$getUltimaAppearanceState$1);
            }
        }
        ultimaModeStateInteractorImpl$getUltimaAppearanceState$1 = new UltimaModeStateInteractorImpl$getUltimaAppearanceState$1(this, continuationImpl);
        Object obj2 = ultimaModeStateInteractorImpl$getUltimaAppearanceState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ultimaModeStateInteractorImpl$getUltimaAppearanceState$1.label;
        com.yandex.go.ultima_mode.preferences.a aVar2 = this.b;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        if (booleanValue) {
        }
    }

    public final Object b(ContinuationImpl continuationImpl) {
        com.yandex.go.ultima_mode.preferences.a aVar = this.b;
        aVar.getClass();
        return aVar.a(new mv11(aVar, 1), continuationImpl);
    }

    public final tpr c() {
        return e.t(new m0(this.a.d, this.b.d, new UltimaModeStateInteractorImpl$ultimaModeStateChangesFlow$1(3, null)));
    }

    public final tpr d() {
        return e.t(new m0(this.b.d, this.a.c, new UltimaModeStateInteractorImpl$ultimaModeStateFlow$1()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        if (r6 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        UltimaModeStateInteractorImpl$toggleUltimaMode$1 ultimaModeStateInteractorImpl$toggleUltimaMode$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object a;
        if (continuationImpl instanceof UltimaModeStateInteractorImpl$toggleUltimaMode$1) {
            ultimaModeStateInteractorImpl$toggleUltimaMode$1 = (UltimaModeStateInteractorImpl$toggleUltimaMode$1) continuationImpl;
            int i2 = ultimaModeStateInteractorImpl$toggleUltimaMode$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ultimaModeStateInteractorImpl$toggleUltimaMode$1.label = i2 - Integer.MIN_VALUE;
                Object obj = ultimaModeStateInteractorImpl$toggleUltimaMode$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ultimaModeStateInteractorImpl$toggleUltimaMode$1.label;
                com.yandex.go.ultima_mode.preferences.a aVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ultimaModeStateInteractorImpl$toggleUltimaMode$1.label = 1;
                    aVar.getClass();
                    obj = aVar.a(new pv01(12, aVar), ultimaModeStateInteractorImpl$toggleUltimaMode$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ultimaModeStateInteractorImpl$toggleUltimaMode$1.Z$0 = booleanValue;
                ultimaModeStateInteractorImpl$toggleUltimaMode$1.label = 2;
                aVar.getClass();
                a = aVar.a(new zo1(aVar, !booleanValue, 17), ultimaModeStateInteractorImpl$toggleUltimaMode$1);
                if (a != coroutineSingletons) {
                    a = zy11.a;
                }
                return a != coroutineSingletons ? coroutineSingletons : a;
            }
        }
        ultimaModeStateInteractorImpl$toggleUltimaMode$1 = new UltimaModeStateInteractorImpl$toggleUltimaMode$1(this, continuationImpl);
        Object obj2 = ultimaModeStateInteractorImpl$toggleUltimaMode$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ultimaModeStateInteractorImpl$toggleUltimaMode$1.label;
        com.yandex.go.ultima_mode.preferences.a aVar2 = this.b;
        if (i != 0) {
        }
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        ultimaModeStateInteractorImpl$toggleUltimaMode$1.Z$0 = booleanValue2;
        ultimaModeStateInteractorImpl$toggleUltimaMode$1.label = 2;
        aVar2.getClass();
        a = aVar2.a(new zo1(aVar2, !booleanValue2, 17), ultimaModeStateInteractorImpl$toggleUltimaMode$1);
        if (a != coroutineSingletons) {
        }
        if (a != coroutineSingletons) {
        }
    }
}
