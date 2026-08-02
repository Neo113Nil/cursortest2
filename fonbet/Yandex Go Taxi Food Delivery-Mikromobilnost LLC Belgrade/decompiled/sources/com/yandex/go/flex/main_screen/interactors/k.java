package com.yandex.go.flex.main_screen.interactors;

import defpackage.b5q0;
import defpackage.ga00;
import defpackage.ny61;
import defpackage.q4q0;
import defpackage.t4q0;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class k implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ ga00 b;

    public k(vpr vprVar, ga00 ga00Var) {
        this.a = vprVar;
        this.b = ga00Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$2$2$1 mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$2$2$1;
        int i;
        if (continuation instanceof MainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$2$2$1) {
            mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$2$2$1 = (MainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$2$2$1) continuation;
            int i2 = mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Collection collection = (Set) obj;
                    this.b.getClass();
                    Collection collection2 = collection;
                    if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
                        Iterator it = collection2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (((b5q0) it.next()) instanceof q4q0) {
                                collection = new LinkedHashSet();
                                for (Object obj3 : collection2) {
                                    b5q0 b5q0Var = (b5q0) obj3;
                                    if (!(b5q0Var instanceof t4q0) || (b5q0Var instanceof q4q0)) {
                                        collection.add(obj3);
                                    }
                                }
                            }
                        }
                    }
                    mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$2$2$1.L$0 = null;
                    mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$2$2$1.L$1 = null;
                    mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$2$2$1.L$2 = null;
                    mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$2$2$1.L$3 = null;
                    mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$2$2$1.label = 1;
                    if (this.a.emit(collection, mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$2$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$2$2$1 = new MainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$2$2$1(this, continuation);
        Object obj22 = mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
