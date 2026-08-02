package com.yandex.go.taxi.order.details.v2.state.elements.feedback.rating;

import android.graphics.drawable.BitmapDrawable;
import defpackage.ny61;
import defpackage.pkf;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes14.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ String b;

    public a(vpr vprVar, String str) {
        this.a = vprVar;
        this.b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RideCardBaseRatingSelectorDataSource$backgroundFlow$$inlined$map$1$2$1 rideCardBaseRatingSelectorDataSource$backgroundFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof RideCardBaseRatingSelectorDataSource$backgroundFlow$$inlined$map$1$2$1) {
            rideCardBaseRatingSelectorDataSource$backgroundFlow$$inlined$map$1$2$1 = (RideCardBaseRatingSelectorDataSource$backgroundFlow$$inlined$map$1$2$1) continuation;
            int i2 = rideCardBaseRatingSelectorDataSource$backgroundFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideCardBaseRatingSelectorDataSource$backgroundFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = rideCardBaseRatingSelectorDataSource$backgroundFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardBaseRatingSelectorDataSource$backgroundFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                    UiStateDrawableWrapper g = bitmapDrawable != null ? pkf.g(bitmapDrawable, this.b, null) : null;
                    rideCardBaseRatingSelectorDataSource$backgroundFlow$$inlined$map$1$2$1.L$0 = null;
                    rideCardBaseRatingSelectorDataSource$backgroundFlow$$inlined$map$1$2$1.L$1 = null;
                    rideCardBaseRatingSelectorDataSource$backgroundFlow$$inlined$map$1$2$1.L$2 = null;
                    rideCardBaseRatingSelectorDataSource$backgroundFlow$$inlined$map$1$2$1.L$3 = null;
                    rideCardBaseRatingSelectorDataSource$backgroundFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(g, rideCardBaseRatingSelectorDataSource$backgroundFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        rideCardBaseRatingSelectorDataSource$backgroundFlow$$inlined$map$1$2$1 = new RideCardBaseRatingSelectorDataSource$backgroundFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = rideCardBaseRatingSelectorDataSource$backgroundFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardBaseRatingSelectorDataSource$backgroundFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
