package com.ybsdk.core.mvp.widgets;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.w2y;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes2.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ w2y b;

    public a(vpr vprVar, w2y w2yVar) {
        this.a = vprVar;
        this.b = w2yVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        LayoutViewModel$special$$inlined$map$1$2$1 layoutViewModel$special$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof LayoutViewModel$special$$inlined$map$1$2$1) {
            layoutViewModel$special$$inlined$map$1$2$1 = (LayoutViewModel$special$$inlined$map$1$2$1) continuation;
            int i2 = layoutViewModel$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                layoutViewModel$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = layoutViewModel$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = layoutViewModel$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    b.b(obj2);
                    Object q = this.b.c.q(obj);
                    layoutViewModel$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(q, layoutViewModel$special$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj2);
                }
                return zy11.a;
            }
        }
        layoutViewModel$special$$inlined$map$1$2$1 = new LayoutViewModel$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = layoutViewModel$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = layoutViewModel$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
