package com.yandex.go.navigator.main_screen;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class e implements tpr {
    public final /* synthetic */ tpr a;

    public e(com.yandex.go.navigator.main_screen.experiement.d dVar) {
        this.a = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        MainModalAddressShortcutsInteractor$special$$inlined$map$1$1 mainModalAddressShortcutsInteractor$special$$inlined$map$1$1;
        int i;
        if (continuation instanceof MainModalAddressShortcutsInteractor$special$$inlined$map$1$1) {
            mainModalAddressShortcutsInteractor$special$$inlined$map$1$1 = (MainModalAddressShortcutsInteractor$special$$inlined$map$1$1) continuation;
            int i2 = mainModalAddressShortcutsInteractor$special$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mainModalAddressShortcutsInteractor$special$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mainModalAddressShortcutsInteractor$special$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mainModalAddressShortcutsInteractor$special$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d dVar = new d(vprVar);
                    mainModalAddressShortcutsInteractor$special$$inlined$map$1$1.L$0 = null;
                    mainModalAddressShortcutsInteractor$special$$inlined$map$1$1.L$1 = null;
                    mainModalAddressShortcutsInteractor$special$$inlined$map$1$1.L$2 = null;
                    mainModalAddressShortcutsInteractor$special$$inlined$map$1$1.label = 1;
                    if (this.a.collect(dVar, mainModalAddressShortcutsInteractor$special$$inlined$map$1$1) == coroutineSingletons) {
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
        mainModalAddressShortcutsInteractor$special$$inlined$map$1$1 = new MainModalAddressShortcutsInteractor$special$$inlined$map$1$1(this, continuation);
        Object obj2 = mainModalAddressShortcutsInteractor$special$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mainModalAddressShortcutsInteractor$special$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
