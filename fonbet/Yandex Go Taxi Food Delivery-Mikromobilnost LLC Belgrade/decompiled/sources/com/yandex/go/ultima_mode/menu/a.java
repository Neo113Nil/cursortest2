package com.yandex.go.ultima_mode.menu;

import com.yandex.go.ultima_mode.api.data.UltimaModeResponse;
import defpackage.mn10;
import defpackage.mv11;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ mn10 b;

    public a(vpr vprVar, mn10 mn10Var) {
        this.a = vprVar;
        this.b = mn10Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ae, code lost:
    
        if (r9.emit(r8, r0) != r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MenuUltimaModeInteractorImpl$isMenuUltimaModeViewAvailable$$inlined$map$1$2$1 menuUltimaModeInteractorImpl$isMenuUltimaModeViewAvailable$$inlined$map$1$2$1;
        int i;
        boolean z;
        vpr vprVar;
        int i2;
        if (continuation instanceof MenuUltimaModeInteractorImpl$isMenuUltimaModeViewAvailable$$inlined$map$1$2$1) {
            menuUltimaModeInteractorImpl$isMenuUltimaModeViewAvailable$$inlined$map$1$2$1 = (MenuUltimaModeInteractorImpl$isMenuUltimaModeViewAvailable$$inlined$map$1$2$1) continuation;
            int i3 = menuUltimaModeInteractorImpl$isMenuUltimaModeViewAvailable$$inlined$map$1$2$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                menuUltimaModeInteractorImpl$isMenuUltimaModeViewAvailable$$inlined$map$1$2$1.label = i3 - Integer.MIN_VALUE;
                Object obj2 = menuUltimaModeInteractorImpl$isMenuUltimaModeViewAvailable$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = menuUltimaModeInteractorImpl$isMenuUltimaModeViewAvailable$$inlined$map$1$2$1.label;
                z = false;
                z = false;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    int i4 = ((UltimaModeResponse) obj).e != null ? 1 : 0;
                    com.yandex.go.ultima_mode.preferences.a aVar = this.b.a;
                    menuUltimaModeInteractorImpl$isMenuUltimaModeViewAvailable$$inlined$map$1$2$1.L$0 = null;
                    menuUltimaModeInteractorImpl$isMenuUltimaModeViewAvailable$$inlined$map$1$2$1.L$1 = null;
                    menuUltimaModeInteractorImpl$isMenuUltimaModeViewAvailable$$inlined$map$1$2$1.L$2 = null;
                    menuUltimaModeInteractorImpl$isMenuUltimaModeViewAvailable$$inlined$map$1$2$1.L$3 = null;
                    vpr vprVar2 = this.a;
                    menuUltimaModeInteractorImpl$isMenuUltimaModeViewAvailable$$inlined$map$1$2$1.L$4 = vprVar2;
                    menuUltimaModeInteractorImpl$isMenuUltimaModeViewAvailable$$inlined$map$1$2$1.L$5 = null;
                    menuUltimaModeInteractorImpl$isMenuUltimaModeViewAvailable$$inlined$map$1$2$1.L$6 = null;
                    menuUltimaModeInteractorImpl$isMenuUltimaModeViewAvailable$$inlined$map$1$2$1.I$0 = i4;
                    menuUltimaModeInteractorImpl$isMenuUltimaModeViewAvailable$$inlined$map$1$2$1.label = 1;
                    aVar.getClass();
                    obj2 = aVar.a(new mv11(aVar, z ? 1 : 0), menuUltimaModeInteractorImpl$isMenuUltimaModeViewAvailable$$inlined$map$1$2$1);
                    if (obj2 != coroutineSingletons) {
                        int i5 = i4;
                        vprVar = vprVar2;
                        i2 = i5;
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
                i2 = menuUltimaModeInteractorImpl$isMenuUltimaModeViewAvailable$$inlined$map$1$2$1.I$0;
                vprVar = (vpr) menuUltimaModeInteractorImpl$isMenuUltimaModeViewAvailable$$inlined$map$1$2$1.L$4;
                kotlin.b.b(obj2);
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                if (i2 != 0 && !booleanValue) {
                    z = true;
                }
                Boolean valueOf = Boolean.valueOf(z);
                menuUltimaModeInteractorImpl$isMenuUltimaModeViewAvailable$$inlined$map$1$2$1.L$0 = null;
                menuUltimaModeInteractorImpl$isMenuUltimaModeViewAvailable$$inlined$map$1$2$1.L$1 = null;
                menuUltimaModeInteractorImpl$isMenuUltimaModeViewAvailable$$inlined$map$1$2$1.L$2 = null;
                menuUltimaModeInteractorImpl$isMenuUltimaModeViewAvailable$$inlined$map$1$2$1.L$3 = null;
                menuUltimaModeInteractorImpl$isMenuUltimaModeViewAvailable$$inlined$map$1$2$1.L$4 = null;
                menuUltimaModeInteractorImpl$isMenuUltimaModeViewAvailable$$inlined$map$1$2$1.L$5 = null;
                menuUltimaModeInteractorImpl$isMenuUltimaModeViewAvailable$$inlined$map$1$2$1.L$6 = null;
                menuUltimaModeInteractorImpl$isMenuUltimaModeViewAvailable$$inlined$map$1$2$1.label = 2;
            }
        }
        menuUltimaModeInteractorImpl$isMenuUltimaModeViewAvailable$$inlined$map$1$2$1 = new MenuUltimaModeInteractorImpl$isMenuUltimaModeViewAvailable$$inlined$map$1$2$1(this, continuation);
        Object obj22 = menuUltimaModeInteractorImpl$isMenuUltimaModeViewAvailable$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = menuUltimaModeInteractorImpl$isMenuUltimaModeViewAvailable$$inlined$map$1$2$1.label;
        z = false;
        z = false;
        if (i != 0) {
        }
        boolean booleanValue2 = ((Boolean) obj22).booleanValue();
        if (i2 != 0) {
            z = true;
        }
        Boolean valueOf2 = Boolean.valueOf(z);
        menuUltimaModeInteractorImpl$isMenuUltimaModeViewAvailable$$inlined$map$1$2$1.L$0 = null;
        menuUltimaModeInteractorImpl$isMenuUltimaModeViewAvailable$$inlined$map$1$2$1.L$1 = null;
        menuUltimaModeInteractorImpl$isMenuUltimaModeViewAvailable$$inlined$map$1$2$1.L$2 = null;
        menuUltimaModeInteractorImpl$isMenuUltimaModeViewAvailable$$inlined$map$1$2$1.L$3 = null;
        menuUltimaModeInteractorImpl$isMenuUltimaModeViewAvailable$$inlined$map$1$2$1.L$4 = null;
        menuUltimaModeInteractorImpl$isMenuUltimaModeViewAvailable$$inlined$map$1$2$1.L$5 = null;
        menuUltimaModeInteractorImpl$isMenuUltimaModeViewAvailable$$inlined$map$1$2$1.L$6 = null;
        menuUltimaModeInteractorImpl$isMenuUltimaModeViewAvailable$$inlined$map$1$2$1.label = 2;
    }
}
