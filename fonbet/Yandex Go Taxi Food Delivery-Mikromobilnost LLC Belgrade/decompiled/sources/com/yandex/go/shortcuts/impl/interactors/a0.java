package com.yandex.go.shortcuts.impl.interactors;

import defpackage.ny61;
import defpackage.sa90;
import defpackage.vpr;
import defpackage.y430;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class a0 implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ y430 b;

    public a0(vpr vprVar, y430 y430Var) {
        this.a = vprVar;
        this.b = y430Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ShortcutsViewModelUpdatersInteractorImpl$createModelUpdatersFlow$lambda$0$$inlined$map$1$2$1 shortcutsViewModelUpdatersInteractorImpl$createModelUpdatersFlow$lambda$0$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ShortcutsViewModelUpdatersInteractorImpl$createModelUpdatersFlow$lambda$0$$inlined$map$1$2$1) {
            shortcutsViewModelUpdatersInteractorImpl$createModelUpdatersFlow$lambda$0$$inlined$map$1$2$1 = (ShortcutsViewModelUpdatersInteractorImpl$createModelUpdatersFlow$lambda$0$$inlined$map$1$2$1) continuation;
            int i2 = shortcutsViewModelUpdatersInteractorImpl$createModelUpdatersFlow$lambda$0$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                shortcutsViewModelUpdatersInteractorImpl$createModelUpdatersFlow$lambda$0$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = shortcutsViewModelUpdatersInteractorImpl$createModelUpdatersFlow$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = shortcutsViewModelUpdatersInteractorImpl$createModelUpdatersFlow$lambda$0$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    sa90 sa90Var = new sa90(this.b, obj);
                    shortcutsViewModelUpdatersInteractorImpl$createModelUpdatersFlow$lambda$0$$inlined$map$1$2$1.L$0 = null;
                    shortcutsViewModelUpdatersInteractorImpl$createModelUpdatersFlow$lambda$0$$inlined$map$1$2$1.L$1 = null;
                    shortcutsViewModelUpdatersInteractorImpl$createModelUpdatersFlow$lambda$0$$inlined$map$1$2$1.L$2 = null;
                    shortcutsViewModelUpdatersInteractorImpl$createModelUpdatersFlow$lambda$0$$inlined$map$1$2$1.L$3 = null;
                    shortcutsViewModelUpdatersInteractorImpl$createModelUpdatersFlow$lambda$0$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(sa90Var, shortcutsViewModelUpdatersInteractorImpl$createModelUpdatersFlow$lambda$0$$inlined$map$1$2$1) == coroutineSingletons) {
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
        shortcutsViewModelUpdatersInteractorImpl$createModelUpdatersFlow$lambda$0$$inlined$map$1$2$1 = new ShortcutsViewModelUpdatersInteractorImpl$createModelUpdatersFlow$lambda$0$$inlined$map$1$2$1(this, continuation);
        Object obj22 = shortcutsViewModelUpdatersInteractorImpl$createModelUpdatersFlow$lambda$0$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = shortcutsViewModelUpdatersInteractorImpl$createModelUpdatersFlow$lambda$0$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
