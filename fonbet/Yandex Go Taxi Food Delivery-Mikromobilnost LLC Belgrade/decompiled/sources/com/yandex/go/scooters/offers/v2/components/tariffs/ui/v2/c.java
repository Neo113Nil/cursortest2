package com.yandex.go.scooters.offers.v2.components.tariffs.ui.v2;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import defpackage.l5p0;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes13.dex */
public final class c implements l5p0 {
    public final /* synthetic */ ScootersTariffItemViewImplV2 a;
    public final /* synthetic */ ScootersTariffView b;
    public final /* synthetic */ String c;

    public c(ScootersTariffItemViewImplV2 scootersTariffItemViewImplV2, ScootersTariffView scootersTariffView, String str) {
        this.a = scootersTariffItemViewImplV2;
        this.b = scootersTariffView;
        this.c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.l5p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        ScootersTariffItemViewImplV2$setLeadPriceIcon$1$execute$1 scootersTariffItemViewImplV2$setLeadPriceIcon$1$execute$1;
        int i;
        Drawable drawable;
        ScootersTariffView scootersTariffView;
        e eVar;
        ScootersTariffItemViewImplV2 scootersTariffItemViewImplV2;
        ScootersTariffView scootersTariffView2;
        BitmapDrawable bitmapDrawable;
        Drawable mutate;
        if (continuation instanceof ScootersTariffItemViewImplV2$setLeadPriceIcon$1$execute$1) {
            scootersTariffItemViewImplV2$setLeadPriceIcon$1$execute$1 = (ScootersTariffItemViewImplV2$setLeadPriceIcon$1$execute$1) continuation;
            int i2 = scootersTariffItemViewImplV2$setLeadPriceIcon$1$execute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersTariffItemViewImplV2$setLeadPriceIcon$1$execute$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersTariffItemViewImplV2$setLeadPriceIcon$1$execute$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersTariffItemViewImplV2$setLeadPriceIcon$1$execute$1.label;
                drawable = null;
                scootersTariffView = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ScootersTariffItemViewImplV2 scootersTariffItemViewImplV22 = this.a;
                    eVar = scootersTariffItemViewImplV22.mediaInfoConverter;
                    scootersTariffItemViewImplV2$setLeadPriceIcon$1$execute$1.L$0 = scootersTariffItemViewImplV22;
                    scootersTariffItemViewImplV2$setLeadPriceIcon$1$execute$1.L$1 = scootersTariffView;
                    scootersTariffItemViewImplV2$setLeadPriceIcon$1$execute$1.label = 1;
                    Object f = e.f(eVar, this.c, null, scootersTariffItemViewImplV2$setLeadPriceIcon$1$execute$1, 6);
                    if (f == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    scootersTariffItemViewImplV2 = scootersTariffItemViewImplV22;
                    obj = f;
                    scootersTariffView2 = scootersTariffView;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    scootersTariffView2 = (ScootersTariffView) scootersTariffItemViewImplV2$setLeadPriceIcon$1$execute$1.L$1;
                    scootersTariffItemViewImplV2 = (ScootersTariffItemViewImplV2) scootersTariffItemViewImplV2$setLeadPriceIcon$1$execute$1.L$0;
                    kotlin.b.b(obj);
                }
                bitmapDrawable = (BitmapDrawable) obj;
                if (bitmapDrawable != null && (mutate = bitmapDrawable.mutate()) != null) {
                    mutate.setTint(scootersTariffView.getPriceTextView().getCurrentTextColor());
                    drawable = mutate;
                }
                scootersTariffItemViewImplV2.setLeadPriceIcon(scootersTariffView2, drawable);
                return zy11.a;
            }
        }
        scootersTariffItemViewImplV2$setLeadPriceIcon$1$execute$1 = new ScootersTariffItemViewImplV2$setLeadPriceIcon$1$execute$1(this, (ContinuationImpl) continuation);
        Object obj2 = scootersTariffItemViewImplV2$setLeadPriceIcon$1$execute$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersTariffItemViewImplV2$setLeadPriceIcon$1$execute$1.label;
        drawable = null;
        scootersTariffView = this.b;
        if (i != 0) {
        }
        bitmapDrawable = (BitmapDrawable) obj2;
        if (bitmapDrawable != null) {
            mutate.setTint(scootersTariffView.getPriceTextView().getCurrentTextColor());
            drawable = mutate;
        }
        scootersTariffItemViewImplV2.setLeadPriceIcon(scootersTariffView2, drawable);
        return zy11.a;
    }
}
