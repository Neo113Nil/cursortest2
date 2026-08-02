package com.yandex.go.mainscreen.superapp.impl.header.domain;

import android.graphics.drawable.Drawable;
import defpackage.m2h0;
import defpackage.nfv;
import defpackage.ny61;
import defpackage.tje;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ h b;

    public d(vpr vprVar, h hVar) {
        this.a = vprVar;
        this.b = hVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0098, code lost:
    
        if (r6.emit(r7, r0) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007e, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MenuStateInteractorImpl$avatarImage$$inlined$map$1$2$1 menuStateInteractorImpl$avatarImage$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        Drawable c0;
        if (continuation instanceof MenuStateInteractorImpl$avatarImage$$inlined$map$1$2$1) {
            menuStateInteractorImpl$avatarImage$$inlined$map$1$2$1 = (MenuStateInteractorImpl$avatarImage$$inlined$map$1$2$1) continuation;
            int i2 = menuStateInteractorImpl$avatarImage$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                menuStateInteractorImpl$avatarImage$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = menuStateInteractorImpl$avatarImage$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = menuStateInteractorImpl$avatarImage$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    String str = (String) obj;
                    ru.yandex.taxi.widget.utils.e eVar = this.b.b;
                    vprVar = this.a;
                    if (str == null) {
                        c0 = tje.c0(m2h0.ic_avatar_placeholder, eVar.a);
                        menuStateInteractorImpl$avatarImage$$inlined$map$1$2$1.L$0 = null;
                        menuStateInteractorImpl$avatarImage$$inlined$map$1$2$1.L$1 = null;
                        menuStateInteractorImpl$avatarImage$$inlined$map$1$2$1.L$2 = null;
                        menuStateInteractorImpl$avatarImage$$inlined$map$1$2$1.L$3 = null;
                        menuStateInteractorImpl$avatarImage$$inlined$map$1$2$1.L$4 = null;
                        menuStateInteractorImpl$avatarImage$$inlined$map$1$2$1.L$5 = null;
                        menuStateInteractorImpl$avatarImage$$inlined$map$1$2$1.L$6 = null;
                        menuStateInteractorImpl$avatarImage$$inlined$map$1$2$1.label = 2;
                    } else {
                        menuStateInteractorImpl$avatarImage$$inlined$map$1$2$1.L$0 = null;
                        menuStateInteractorImpl$avatarImage$$inlined$map$1$2$1.L$1 = null;
                        menuStateInteractorImpl$avatarImage$$inlined$map$1$2$1.L$2 = null;
                        menuStateInteractorImpl$avatarImage$$inlined$map$1$2$1.L$3 = null;
                        menuStateInteractorImpl$avatarImage$$inlined$map$1$2$1.L$4 = vprVar;
                        menuStateInteractorImpl$avatarImage$$inlined$map$1$2$1.L$5 = null;
                        menuStateInteractorImpl$avatarImage$$inlined$map$1$2$1.L$6 = null;
                        menuStateInteractorImpl$avatarImage$$inlined$map$1$2$1.label = 1;
                        obj2 = ru.yandex.taxi.widget.utils.e.k(eVar, str, nfv.a, menuStateInteractorImpl$avatarImage$$inlined$map$1$2$1, 6);
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    vprVar = (vpr) menuStateInteractorImpl$avatarImage$$inlined$map$1$2$1.L$4;
                    kotlin.b.b(obj2);
                }
                c0 = (Drawable) obj2;
                menuStateInteractorImpl$avatarImage$$inlined$map$1$2$1.L$0 = null;
                menuStateInteractorImpl$avatarImage$$inlined$map$1$2$1.L$1 = null;
                menuStateInteractorImpl$avatarImage$$inlined$map$1$2$1.L$2 = null;
                menuStateInteractorImpl$avatarImage$$inlined$map$1$2$1.L$3 = null;
                menuStateInteractorImpl$avatarImage$$inlined$map$1$2$1.L$4 = null;
                menuStateInteractorImpl$avatarImage$$inlined$map$1$2$1.L$5 = null;
                menuStateInteractorImpl$avatarImage$$inlined$map$1$2$1.L$6 = null;
                menuStateInteractorImpl$avatarImage$$inlined$map$1$2$1.label = 2;
            }
        }
        menuStateInteractorImpl$avatarImage$$inlined$map$1$2$1 = new MenuStateInteractorImpl$avatarImage$$inlined$map$1$2$1(this, continuation);
        Object obj22 = menuStateInteractorImpl$avatarImage$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = menuStateInteractorImpl$avatarImage$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        c0 = (Drawable) obj22;
        menuStateInteractorImpl$avatarImage$$inlined$map$1$2$1.L$0 = null;
        menuStateInteractorImpl$avatarImage$$inlined$map$1$2$1.L$1 = null;
        menuStateInteractorImpl$avatarImage$$inlined$map$1$2$1.L$2 = null;
        menuStateInteractorImpl$avatarImage$$inlined$map$1$2$1.L$3 = null;
        menuStateInteractorImpl$avatarImage$$inlined$map$1$2$1.L$4 = null;
        menuStateInteractorImpl$avatarImage$$inlined$map$1$2$1.L$5 = null;
        menuStateInteractorImpl$avatarImage$$inlined$map$1$2$1.L$6 = null;
        menuStateInteractorImpl$avatarImage$$inlined$map$1$2$1.label = 2;
    }
}
