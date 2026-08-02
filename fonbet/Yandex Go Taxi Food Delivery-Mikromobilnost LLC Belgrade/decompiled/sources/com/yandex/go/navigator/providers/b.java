package com.yandex.go.navigator.providers;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.yandex.go.pin.api.v2.PinV2Component;
import com.yandex.go.pin.api.v2.d;
import defpackage.c0c0;
import defpackage.f1h0;
import defpackage.h1c0;
import defpackage.ny61;
import defpackage.tje;
import defpackage.v2h0;
import defpackage.xzb0;
import defpackage.yyg0;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.widget.map.PinSlot;
import ru.yandex.taxi.widget.map.SourceOnMapControl;

/* loaded from: classes12.dex */
public final class b {
    public final Context a;
    public final ru.yandex.taxi.design.utils.b b;

    public b(Context context, ru.yandex.taxi.design.utils.b bVar) {
        this.a = context;
        this.b = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        RateRoutePinImageProvider$createDestPin$1 rateRoutePinImageProvider$createDestPin$1;
        int i;
        Drawable drawable;
        if (continuationImpl instanceof RateRoutePinImageProvider$createDestPin$1) {
            rateRoutePinImageProvider$createDestPin$1 = (RateRoutePinImageProvider$createDestPin$1) continuationImpl;
            int i2 = rateRoutePinImageProvider$createDestPin$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rateRoutePinImageProvider$createDestPin$1.label = i2 - Integer.MIN_VALUE;
                Object obj = rateRoutePinImageProvider$createDestPin$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rateRoutePinImageProvider$createDestPin$1.label;
                Context context = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Drawable y = tje.y(yyg0.address_select_empty_bg, context);
                    rateRoutePinImageProvider$createDestPin$1.L$0 = y;
                    rateRoutePinImageProvider$createDestPin$1.label = 1;
                    Object b = this.b.b(rateRoutePinImageProvider$createDestPin$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = b;
                    drawable = y;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    drawable = (Drawable) rateRoutePinImageProvider$createDestPin$1.L$0;
                    kotlin.b.b(obj);
                }
                PinV2Component pinV2Component = new PinV2Component(context, new h1c0((List) obj, drawable, drawable));
                PinSlot.Companion.getClass();
                return d.a(pinV2Component, xzb0.b(context), PinV2Component.Position.ANCHORED, new SourceOnMapControl.a(new c0c0(tje.y(f1h0.ic_finish_flag, context)), null, null, false, false, null, null, 2046));
            }
        }
        rateRoutePinImageProvider$createDestPin$1 = new RateRoutePinImageProvider$createDestPin$1(this, continuationImpl);
        Object obj2 = rateRoutePinImageProvider$createDestPin$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rateRoutePinImageProvider$createDestPin$1.label;
        Context context2 = this.a;
        if (i != 0) {
        }
        PinV2Component pinV2Component2 = new PinV2Component(context2, new h1c0((List) obj2, drawable, drawable));
        PinSlot.Companion.getClass();
        return d.a(pinV2Component2, xzb0.b(context2), PinV2Component.Position.ANCHORED, new SourceOnMapControl.a(new c0c0(tje.y(f1h0.ic_finish_flag, context2)), null, null, false, false, null, null, 2046));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        RateRoutePinImageProvider$createSourcePin$1 rateRoutePinImageProvider$createSourcePin$1;
        int i;
        Drawable drawable;
        if (continuationImpl instanceof RateRoutePinImageProvider$createSourcePin$1) {
            rateRoutePinImageProvider$createSourcePin$1 = (RateRoutePinImageProvider$createSourcePin$1) continuationImpl;
            int i2 = rateRoutePinImageProvider$createSourcePin$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rateRoutePinImageProvider$createSourcePin$1.label = i2 - Integer.MIN_VALUE;
                Object obj = rateRoutePinImageProvider$createSourcePin$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rateRoutePinImageProvider$createSourcePin$1.label;
                Context context = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Drawable y = tje.y(yyg0.address_select_empty_bg, context);
                    rateRoutePinImageProvider$createSourcePin$1.L$0 = y;
                    rateRoutePinImageProvider$createSourcePin$1.label = 1;
                    Object b = this.b.b(rateRoutePinImageProvider$createSourcePin$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = b;
                    drawable = y;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    drawable = (Drawable) rateRoutePinImageProvider$createSourcePin$1.L$0;
                    kotlin.b.b(obj);
                }
                PinV2Component pinV2Component = new PinV2Component(context, new h1c0((List) obj, drawable, drawable));
                PinSlot.Companion.getClass();
                return d.a(pinV2Component, xzb0.b(context), PinV2Component.Position.ANCHORED, new SourceOnMapControl.a(new c0c0(tje.y(v2h0.ic_rate_pin_source, context)), null, null, false, false, null, null, 2046));
            }
        }
        rateRoutePinImageProvider$createSourcePin$1 = new RateRoutePinImageProvider$createSourcePin$1(this, continuationImpl);
        Object obj2 = rateRoutePinImageProvider$createSourcePin$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rateRoutePinImageProvider$createSourcePin$1.label;
        Context context2 = this.a;
        if (i != 0) {
        }
        PinV2Component pinV2Component2 = new PinV2Component(context2, new h1c0((List) obj2, drawable, drawable));
        PinSlot.Companion.getClass();
        return d.a(pinV2Component2, xzb0.b(context2), PinV2Component.Position.ANCHORED, new SourceOnMapControl.a(new c0c0(tje.y(v2h0.ic_rate_pin_source, context2)), null, null, false, false, null, null, 2046));
    }
}
