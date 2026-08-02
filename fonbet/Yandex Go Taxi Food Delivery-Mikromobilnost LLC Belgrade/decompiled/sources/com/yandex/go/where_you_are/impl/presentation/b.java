package com.yandex.go.where_you_are.impl.presentation;

import android.graphics.Rect;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes11.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;

    public b(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        WhereYouAreBubbleHolder$pinRectFlow$$inlined$map$1$2$1 whereYouAreBubbleHolder$pinRectFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof WhereYouAreBubbleHolder$pinRectFlow$$inlined$map$1$2$1) {
            whereYouAreBubbleHolder$pinRectFlow$$inlined$map$1$2$1 = (WhereYouAreBubbleHolder$pinRectFlow$$inlined$map$1$2$1) continuation;
            int i2 = whereYouAreBubbleHolder$pinRectFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                whereYouAreBubbleHolder$pinRectFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = whereYouAreBubbleHolder$pinRectFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = whereYouAreBubbleHolder$pinRectFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Rect rect = (Rect) ((Pair) obj).getFirst();
                    whereYouAreBubbleHolder$pinRectFlow$$inlined$map$1$2$1.L$0 = null;
                    whereYouAreBubbleHolder$pinRectFlow$$inlined$map$1$2$1.L$1 = null;
                    whereYouAreBubbleHolder$pinRectFlow$$inlined$map$1$2$1.L$2 = null;
                    whereYouAreBubbleHolder$pinRectFlow$$inlined$map$1$2$1.L$3 = null;
                    whereYouAreBubbleHolder$pinRectFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(rect, whereYouAreBubbleHolder$pinRectFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        whereYouAreBubbleHolder$pinRectFlow$$inlined$map$1$2$1 = new WhereYouAreBubbleHolder$pinRectFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = whereYouAreBubbleHolder$pinRectFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = whereYouAreBubbleHolder$pinRectFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
