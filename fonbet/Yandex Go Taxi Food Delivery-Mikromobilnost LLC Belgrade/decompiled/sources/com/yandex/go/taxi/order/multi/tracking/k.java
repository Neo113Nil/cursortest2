package com.yandex.go.taxi.order.multi.tracking;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.xw31;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class k implements vpr {
    public final /* synthetic */ TaxiOrderTrackingView a;

    public k(TaxiOrderTrackingView taxiOrderTrackingView) {
        this.a = taxiOrderTrackingView;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TaxiOrderTrackingView$onAttachedToWindow$$inlined$collectIn$1$1$1 taxiOrderTrackingView$onAttachedToWindow$$inlined$collectIn$1$1$1;
        int i;
        ru.yandex.taxi.design.utils.b bVar;
        View compactOrderView;
        int i2;
        int i3;
        if (continuation instanceof TaxiOrderTrackingView$onAttachedToWindow$$inlined$collectIn$1$1$1) {
            taxiOrderTrackingView$onAttachedToWindow$$inlined$collectIn$1$1$1 = (TaxiOrderTrackingView$onAttachedToWindow$$inlined$collectIn$1$1$1) continuation;
            int i4 = taxiOrderTrackingView$onAttachedToWindow$$inlined$collectIn$1$1$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                taxiOrderTrackingView$onAttachedToWindow$$inlined$collectIn$1$1$1.label = i4 - Integer.MIN_VALUE;
                Object obj2 = taxiOrderTrackingView$onAttachedToWindow$$inlined$collectIn$1$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiOrderTrackingView$onAttachedToWindow$$inlined$collectIn$1$1$1.label;
                TaxiOrderTrackingView taxiOrderTrackingView = this.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    bVar = taxiOrderTrackingView.shadowBgRepository;
                    taxiOrderTrackingView$onAttachedToWindow$$inlined$collectIn$1$1$1.L$0 = null;
                    taxiOrderTrackingView$onAttachedToWindow$$inlined$collectIn$1$1$1.L$1 = null;
                    taxiOrderTrackingView$onAttachedToWindow$$inlined$collectIn$1$1$1.L$2 = null;
                    taxiOrderTrackingView$onAttachedToWindow$$inlined$collectIn$1$1$1.label = 1;
                    obj2 = bVar.a(24, false, taxiOrderTrackingView$onAttachedToWindow$$inlined$collectIn$1$1$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                Drawable drawable = (Drawable) obj2;
                compactOrderView = taxiOrderTrackingView.getCompactOrderView();
                i2 = taxiOrderTrackingView.compactOrderViewHorizontalMarginPx;
                i3 = taxiOrderTrackingView.compactOrderViewHorizontalMarginPx;
                Rect rect = new Rect();
                drawable.getPadding(rect);
                compactOrderView.setBackground(drawable);
                xw31.E(compactOrderView, Integer.valueOf((-rect.left) + i2), Integer.valueOf((-rect.top) + 15), Integer.valueOf((-rect.right) + i3), Integer.valueOf(-rect.bottom));
                return zy11.a;
            }
        }
        taxiOrderTrackingView$onAttachedToWindow$$inlined$collectIn$1$1$1 = new TaxiOrderTrackingView$onAttachedToWindow$$inlined$collectIn$1$1$1(this, continuation);
        Object obj22 = taxiOrderTrackingView$onAttachedToWindow$$inlined$collectIn$1$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiOrderTrackingView$onAttachedToWindow$$inlined$collectIn$1$1$1.label;
        TaxiOrderTrackingView taxiOrderTrackingView2 = this.a;
        if (i != 0) {
        }
        Drawable drawable2 = (Drawable) obj22;
        compactOrderView = taxiOrderTrackingView2.getCompactOrderView();
        i2 = taxiOrderTrackingView2.compactOrderViewHorizontalMarginPx;
        i3 = taxiOrderTrackingView2.compactOrderViewHorizontalMarginPx;
        Rect rect2 = new Rect();
        drawable2.getPadding(rect2);
        compactOrderView.setBackground(drawable2);
        xw31.E(compactOrderView, Integer.valueOf((-rect2.left) + i2), Integer.valueOf((-rect2.top) + 15), Integer.valueOf((-rect2.right) + i3), Integer.valueOf(-rect2.bottom));
        return zy11.a;
    }
}
