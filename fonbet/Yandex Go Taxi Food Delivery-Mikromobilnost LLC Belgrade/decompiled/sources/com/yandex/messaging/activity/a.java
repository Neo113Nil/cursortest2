package com.yandex.messaging.activity;

import defpackage.ccg;
import defpackage.ny61;
import defpackage.p8g;
import defpackage.v320;
import defpackage.vbb;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        UiProfileHolder$special$$inlined$map$1$2$1 uiProfileHolder$special$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof UiProfileHolder$special$$inlined$map$1$2$1) {
            uiProfileHolder$special$$inlined$map$1$2$1 = (UiProfileHolder$special$$inlined$map$1$2$1) continuation;
            int i2 = uiProfileHolder$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uiProfileHolder$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = uiProfileHolder$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = uiProfileHolder$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    p8g p8gVar = (p8g) ((v320) obj);
                    ccg ccgVar = new ccg(new vbb(p8gVar.b, p8gVar.c));
                    uiProfileHolder$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(ccgVar, uiProfileHolder$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        uiProfileHolder$special$$inlined$map$1$2$1 = new UiProfileHolder$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = uiProfileHolder$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = uiProfileHolder$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
