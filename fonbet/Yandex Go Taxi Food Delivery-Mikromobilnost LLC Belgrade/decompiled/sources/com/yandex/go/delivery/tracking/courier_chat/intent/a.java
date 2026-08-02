package com.yandex.go.delivery.tracking.courier_chat.intent;

import android.content.Intent;
import defpackage.f8b;
import defpackage.hxx;
import defpackage.m5u;
import defpackage.m950;
import defpackage.n5u;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.pep0;
import defpackage.w2i;
import defpackage.x7w;
import defpackage.yvf0;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class a implements x7w {
    public final com.yandex.go.lifecycle.a a;
    public final yvf0 b;
    public final ru.yandex.taxi.messenger.a c;

    public a(com.yandex.go.lifecycle.a aVar, yvf0 yvf0Var, ru.yandex.taxi.messenger.a aVar2) {
        this.a = aVar;
        this.b = yvf0Var;
        this.c = aVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0067, code lost:
    
        if (r10 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // defpackage.x7w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oep0 oep0Var, Intent intent, Continuation continuation) {
        DeliveryCourierChatIntentHandler$processIntent$1 deliveryCourierChatIntentHandler$processIntent$1;
        Object obj;
        int i;
        String stringExtra;
        oep0 oep0Var2;
        f8b f8bVar;
        if (continuation instanceof DeliveryCourierChatIntentHandler$processIntent$1) {
            deliveryCourierChatIntentHandler$processIntent$1 = (DeliveryCourierChatIntentHandler$processIntent$1) continuation;
            int i2 = deliveryCourierChatIntentHandler$processIntent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryCourierChatIntentHandler$processIntent$1.label = i2 - Integer.MIN_VALUE;
                obj = deliveryCourierChatIntentHandler$processIntent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryCourierChatIntentHandler$processIntent$1.label;
                if (i != 0) {
                    b.b(obj);
                    if (intent.hasExtra("ru.yandex.taxi.activity.MainActivity.DELIVERY_MESSENGER_TO_DISPLAY")) {
                        deliveryCourierChatIntentHandler$processIntent$1.L$0 = oep0Var;
                        deliveryCourierChatIntentHandler$processIntent$1.L$1 = intent;
                        deliveryCourierChatIntentHandler$processIntent$1.label = 1;
                        obj = this.c.a(deliveryCourierChatIntentHandler$processIntent$1);
                    }
                    return n5u.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f8bVar = (f8b) deliveryCourierChatIntentHandler$processIntent$1.L$3;
                    stringExtra = (String) deliveryCourierChatIntentHandler$processIntent$1.L$2;
                    oep0Var2 = (oep0) deliveryCourierChatIntentHandler$processIntent$1.L$0;
                    b.b(obj);
                    ((pep0) oep0Var2).f((m950) this.b.get(), new w2i(f8bVar), hxx.a);
                    return new m5u(stringExtra != null, false);
                }
                intent = (Intent) deliveryCourierChatIntentHandler$processIntent$1.L$1;
                oep0Var = (oep0) deliveryCourierChatIntentHandler$processIntent$1.L$0;
                b.b(obj);
                if (((Boolean) obj).booleanValue()) {
                    stringExtra = intent.getStringExtra("ru.yandex.taxi.activity.MainActivity.DELIVERY_MESSENGER_TO_DISPLAY");
                    if (stringExtra != null) {
                        f8b f8bVar2 = new f8b(stringExtra);
                        deliveryCourierChatIntentHandler$processIntent$1.L$0 = oep0Var;
                        deliveryCourierChatIntentHandler$processIntent$1.L$1 = null;
                        deliveryCourierChatIntentHandler$processIntent$1.L$2 = stringExtra;
                        deliveryCourierChatIntentHandler$processIntent$1.L$3 = f8bVar2;
                        deliveryCourierChatIntentHandler$processIntent$1.label = 2;
                        if (this.a.a(deliveryCourierChatIntentHandler$processIntent$1) != coroutineSingletons) {
                            oep0Var2 = oep0Var;
                            f8bVar = f8bVar2;
                            ((pep0) oep0Var2).f((m950) this.b.get(), new w2i(f8bVar), hxx.a);
                        }
                        return coroutineSingletons;
                    }
                    return new m5u(stringExtra != null, false);
                }
                return n5u.a;
            }
        }
        deliveryCourierChatIntentHandler$processIntent$1 = new DeliveryCourierChatIntentHandler$processIntent$1(this, (ContinuationImpl) continuation);
        obj = deliveryCourierChatIntentHandler$processIntent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryCourierChatIntentHandler$processIntent$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return n5u.a;
    }
}
