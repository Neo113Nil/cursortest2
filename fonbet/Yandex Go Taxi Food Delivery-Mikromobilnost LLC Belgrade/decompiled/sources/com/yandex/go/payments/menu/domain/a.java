package com.yandex.go.payments.menu.domain;

import defpackage.jfa0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ c b;
    public final /* synthetic */ boolean c;

    public a(vpr vprVar, c cVar, boolean z) {
        this.a = vprVar;
        this.b = cVar;
        this.c = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x008a, code lost:
    
        if (r7.emit(r9, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MenuPaymentOptionsSourceInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1 menuPaymentOptionsSourceInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        if (continuation instanceof MenuPaymentOptionsSourceInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1) {
            menuPaymentOptionsSourceInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1 = (MenuPaymentOptionsSourceInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1) continuation;
            int i2 = menuPaymentOptionsSourceInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                menuPaymentOptionsSourceInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = menuPaymentOptionsSourceInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = menuPaymentOptionsSourceInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    menuPaymentOptionsSourceInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1.L$0 = null;
                    menuPaymentOptionsSourceInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1.L$1 = null;
                    menuPaymentOptionsSourceInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1.L$2 = null;
                    menuPaymentOptionsSourceInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1.L$3 = null;
                    vpr vprVar2 = this.a;
                    menuPaymentOptionsSourceInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1.L$4 = vprVar2;
                    menuPaymentOptionsSourceInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1.L$5 = null;
                    menuPaymentOptionsSourceInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1.L$6 = null;
                    menuPaymentOptionsSourceInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1.label = 1;
                    Object a = c.a(this.b, (jfa0) obj, this.c, menuPaymentOptionsSourceInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1);
                    if (a != coroutineSingletons) {
                        obj2 = a;
                        vprVar = vprVar2;
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
                vprVar = (vpr) menuPaymentOptionsSourceInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1.L$4;
                kotlin.b.b(obj2);
                menuPaymentOptionsSourceInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1.L$0 = null;
                menuPaymentOptionsSourceInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1.L$1 = null;
                menuPaymentOptionsSourceInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1.L$2 = null;
                menuPaymentOptionsSourceInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1.L$3 = null;
                menuPaymentOptionsSourceInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1.L$4 = null;
                menuPaymentOptionsSourceInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1.L$5 = null;
                menuPaymentOptionsSourceInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1.L$6 = null;
                menuPaymentOptionsSourceInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1.label = 2;
            }
        }
        menuPaymentOptionsSourceInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1 = new MenuPaymentOptionsSourceInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1(this, continuation);
        Object obj22 = menuPaymentOptionsSourceInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = menuPaymentOptionsSourceInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        menuPaymentOptionsSourceInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1.L$0 = null;
        menuPaymentOptionsSourceInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1.L$1 = null;
        menuPaymentOptionsSourceInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1.L$2 = null;
        menuPaymentOptionsSourceInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1.L$3 = null;
        menuPaymentOptionsSourceInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1.L$4 = null;
        menuPaymentOptionsSourceInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1.L$5 = null;
        menuPaymentOptionsSourceInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1.L$6 = null;
        menuPaymentOptionsSourceInteractor$optionsFlow$lambda$0$$inlined$map$1$2$1.label = 2;
    }
}
