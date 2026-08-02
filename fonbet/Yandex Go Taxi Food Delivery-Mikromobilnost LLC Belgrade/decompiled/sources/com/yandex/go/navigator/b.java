package com.yandex.go.navigator;

import android.graphics.Rect;
import defpackage.ny61;
import defpackage.ofp0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ BaseNavigatorModalView b;

    public b(vpr vprVar, BaseNavigatorModalView baseNavigatorModalView) {
        this.a = vprVar;
        this.b = baseNavigatorModalView;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        BaseNavigatorModalView$special$$inlined$map$1$2$1 baseNavigatorModalView$special$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof BaseNavigatorModalView$special$$inlined$map$1$2$1) {
            baseNavigatorModalView$special$$inlined$map$1$2$1 = (BaseNavigatorModalView$special$$inlined$map$1$2$1) continuation;
            int i2 = baseNavigatorModalView$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                baseNavigatorModalView$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = baseNavigatorModalView$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = baseNavigatorModalView$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    int intValue = ((Number) obj).intValue();
                    BaseNavigatorModalView baseNavigatorModalView = this.b;
                    Rect rect = new Rect(baseNavigatorModalView.getHorizontalFocusRectOffset(), baseNavigatorModalView.getTopFocusRectOffset(), ofp0.b - baseNavigatorModalView.getHorizontalFocusRectOffset(), ofp0.c - (baseNavigatorModalView.getBottomFocusRectOffset() + intValue));
                    baseNavigatorModalView$special$$inlined$map$1$2$1.L$0 = null;
                    baseNavigatorModalView$special$$inlined$map$1$2$1.L$1 = null;
                    baseNavigatorModalView$special$$inlined$map$1$2$1.L$2 = null;
                    baseNavigatorModalView$special$$inlined$map$1$2$1.L$3 = null;
                    baseNavigatorModalView$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(rect, baseNavigatorModalView$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        baseNavigatorModalView$special$$inlined$map$1$2$1 = new BaseNavigatorModalView$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = baseNavigatorModalView$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = baseNavigatorModalView$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
