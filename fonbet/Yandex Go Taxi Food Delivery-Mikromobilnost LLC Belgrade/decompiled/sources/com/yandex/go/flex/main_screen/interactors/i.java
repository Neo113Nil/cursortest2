package com.yandex.go.flex.main_screen.interactors;

import com.yandex.go.flex.common.api.FeedSdkTheme;
import defpackage.a5q0;
import defpackage.b5q0;
import defpackage.h4q0;
import defpackage.hl3;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.t4q0;
import defpackage.u4q0;
import defpackage.v4q0;
import defpackage.vpr;
import defpackage.w4q0;
import defpackage.w511;
import defpackage.x4q0;
import defpackage.y4q0;
import defpackage.z4q0;
import defpackage.zxq0;
import defpackage.zy11;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class i implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ o b;

    public i(vpr vprVar, o oVar) {
        this.a = vprVar;
        this.b = oVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007a, code lost:
    
        if (defpackage.jl40.l(r7 != null ? r7.getId() : null, ((defpackage.a5q0) r6).d.getId()) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008e, code lost:
    
        if (r9.b.a.equals(((defpackage.u4q0) r6).d) == false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$1$2$1 mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof MainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$1$2$1) {
            mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$1$2$1 = (MainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$1$2$1) continuation;
            int i2 = mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    vpr vprVar = this.a;
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    h4q0 h4q0Var = this.b.i;
                    for (Object obj3 : (Set) obj) {
                        b5q0 b5q0Var = (b5q0) obj3;
                        h4q0Var.getClass();
                        boolean z = false;
                        if (b5q0Var instanceof a5q0) {
                            FeedSdkTheme feedSdkTheme = h4q0Var.a.c;
                        } else if (!(b5q0Var instanceof u4q0)) {
                            if (b5q0Var instanceof y4q0) {
                                zxq0 zxq0Var = h4q0Var.c;
                                hl3 a = ((y4q0) b5q0Var).a();
                                z = !jl40.l(zxq0Var.a.getAndSet(a), a);
                                if (!z) {
                                    linkedHashSet.add(obj3);
                                }
                            } else {
                                if (!(b5q0Var instanceof t4q0) && !(b5q0Var instanceof w4q0) && !(b5q0Var instanceof x4q0) && !(b5q0Var instanceof z4q0) && !(b5q0Var instanceof v4q0)) {
                                    w511.b();
                                    return null;
                                }
                                z = true;
                                if (!z) {
                                }
                            }
                        }
                    }
                    mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$1$2$1.L$0 = null;
                    mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$1$2$1.L$1 = null;
                    mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$1$2$1.L$2 = null;
                    mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$1$2$1.L$3 = null;
                    mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$1$2$1.label = 1;
                    if (vprVar.emit(linkedHashSet, mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$1$2$1) == coroutineSingletons) {
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
        mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$1$2$1 = new MainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$1$2$1(this, continuation);
        Object obj22 = mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
