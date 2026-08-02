package com.yandex.go.delivery.tracking.postcard;

import android.content.Intent;
import defpackage.hli;
import defpackage.m5u;
import defpackage.n5u;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.ofe0;
import defpackage.x7w;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.logistics.delivery_state.DeliveryPushParams;
import ru.yandex.taxi.logistics.postcard.presentation.g;

/* loaded from: classes.dex */
public final class a implements x7w {
    public final g a;
    public final com.yandex.go.lifecycle.a b;

    public a(g gVar, com.yandex.go.lifecycle.a aVar) {
        this.a = gVar;
        this.b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.x7w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oep0 oep0Var, Intent intent, Continuation continuation) {
        PostcardIntentHandler$processIntent$1 postcardIntentHandler$processIntent$1;
        int i;
        DeliveryPushParams a;
        if (continuation instanceof PostcardIntentHandler$processIntent$1) {
            postcardIntentHandler$processIntent$1 = (PostcardIntentHandler$processIntent$1) continuation;
            int i2 = postcardIntentHandler$processIntent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                postcardIntentHandler$processIntent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = postcardIntentHandler$processIntent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = postcardIntentHandler$processIntent$1.label;
                if (i != 0) {
                    b.b(obj);
                    if (!intent.hasExtra("ru.yandex.taxi.activity.MainActivity.DELIVERY_POSTCARD_TO_DISPLAY_EXTRA")) {
                        return n5u.a;
                    }
                    DeliveryPushParams.Companion.getClass();
                    a = hli.a(intent, "ru.yandex.taxi.activity.MainActivity.DELIVERY_POSTCARD_TO_DISPLAY_EXTRA");
                    if (a == null) {
                        return new m5u(false, false);
                    }
                    postcardIntentHandler$processIntent$1.L$0 = null;
                    postcardIntentHandler$processIntent$1.L$1 = null;
                    postcardIntentHandler$processIntent$1.L$2 = a;
                    postcardIntentHandler$processIntent$1.label = 1;
                    if (this.b.a(postcardIntentHandler$processIntent$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    a = (DeliveryPushParams) postcardIntentHandler$processIntent$1.L$2;
                    b.b(obj);
                }
                this.a.a(new ofe0(a.getDeliveryId(), a.getMeta()));
                return new m5u(true, false);
            }
        }
        postcardIntentHandler$processIntent$1 = new PostcardIntentHandler$processIntent$1(this, (ContinuationImpl) continuation);
        Object obj2 = postcardIntentHandler$processIntent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = postcardIntentHandler$processIntent$1.label;
        if (i != 0) {
        }
        this.a.a(new ofe0(a.getDeliveryId(), a.getMeta()));
        return new m5u(true, false);
    }
}
