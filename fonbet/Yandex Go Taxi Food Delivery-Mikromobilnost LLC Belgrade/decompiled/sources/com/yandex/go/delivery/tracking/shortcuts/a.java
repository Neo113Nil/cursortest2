package com.yandex.go.delivery.tracking.shortcuts;

import com.yandex.go.delivery.tracking.shortcuts.DeliveryShortcutsRequest;
import defpackage.ck;
import defpackage.cmt;
import defpackage.i3y;
import defpackage.jst;
import defpackage.jtq0;
import defpackage.ny61;
import defpackage.on2;
import defpackage.uc4;
import defpackage.zzs;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class a {
    public final jtq0 a;
    public final i3y b;

    public a(on2 on2Var, jtq0 jtq0Var) {
        this.a = jtq0Var;
        this.b = kotlin.a.a(new ck(on2Var, 6));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, zzs zzsVar, uc4 uc4Var, ContinuationImpl continuationImpl) {
        DeliveryShortcutsRepository$get$1 deliveryShortcutsRepository$get$1;
        int i;
        try {
            if (continuationImpl instanceof DeliveryShortcutsRepository$get$1) {
                deliveryShortcutsRepository$get$1 = (DeliveryShortcutsRepository$get$1) continuationImpl;
                int i2 = deliveryShortcutsRepository$get$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    deliveryShortcutsRepository$get$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = deliveryShortcutsRepository$get$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = deliveryShortcutsRepository$get$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        cmt<DeliveryShortcutsResponse> a = ((DeliveryShortcutsApi) this.b.getValue()).a(new DeliveryShortcutsRequest(str, new DeliveryShortcutsRequest.UserContext(zzsVar, new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX", Locale.US).format(this.a.c()), uc4Var)));
                        deliveryShortcutsRepository$get$1.L$0 = null;
                        deliveryShortcutsRepository$get$1.L$1 = null;
                        deliveryShortcutsRepository$get$1.L$2 = null;
                        deliveryShortcutsRepository$get$1.L$3 = null;
                        deliveryShortcutsRepository$get$1.label = 1;
                        obj = ru.yandex.taxi.network.api.a.a(a, null, deliveryShortcutsRepository$get$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    return (DeliveryShortcutsResponse) obj;
                }
            }
            if (i != 0) {
            }
            return (DeliveryShortcutsResponse) obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            jst.e.k(th, "failed to request shortcuts");
            return DeliveryShortcutsResponse.d;
        }
        deliveryShortcutsRepository$get$1 = new DeliveryShortcutsRepository$get$1(this, continuationImpl);
        Object obj2 = deliveryShortcutsRepository$get$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryShortcutsRepository$get$1.label;
    }
}
