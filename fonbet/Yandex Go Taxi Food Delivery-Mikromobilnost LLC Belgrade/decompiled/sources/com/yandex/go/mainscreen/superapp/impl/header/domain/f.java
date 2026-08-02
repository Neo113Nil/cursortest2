package com.yandex.go.mainscreen.superapp.impl.header.domain;

import android.graphics.drawable.Drawable;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.yj10;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class f implements vpr {
    public final /* synthetic */ vpr a;

    public f(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MenuStateInteractorImpl$avatarMenu$$inlined$map$1$2$1 menuStateInteractorImpl$avatarMenu$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof MenuStateInteractorImpl$avatarMenu$$inlined$map$1$2$1) {
            menuStateInteractorImpl$avatarMenu$$inlined$map$1$2$1 = (MenuStateInteractorImpl$avatarMenu$$inlined$map$1$2$1) continuation;
            int i2 = menuStateInteractorImpl$avatarMenu$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                menuStateInteractorImpl$avatarMenu$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = menuStateInteractorImpl$avatarMenu$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = menuStateInteractorImpl$avatarMenu$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    yj10 yj10Var = h.f;
                    yj10 yj10Var2 = new yj10(yj10Var.a, (Drawable) obj, yj10Var.c, yj10Var.d);
                    menuStateInteractorImpl$avatarMenu$$inlined$map$1$2$1.L$0 = null;
                    menuStateInteractorImpl$avatarMenu$$inlined$map$1$2$1.L$1 = null;
                    menuStateInteractorImpl$avatarMenu$$inlined$map$1$2$1.L$2 = null;
                    menuStateInteractorImpl$avatarMenu$$inlined$map$1$2$1.L$3 = null;
                    menuStateInteractorImpl$avatarMenu$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(yj10Var2, menuStateInteractorImpl$avatarMenu$$inlined$map$1$2$1) == coroutineSingletons) {
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
        menuStateInteractorImpl$avatarMenu$$inlined$map$1$2$1 = new MenuStateInteractorImpl$avatarMenu$$inlined$map$1$2$1(this, continuation);
        Object obj22 = menuStateInteractorImpl$avatarMenu$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = menuStateInteractorImpl$avatarMenu$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
