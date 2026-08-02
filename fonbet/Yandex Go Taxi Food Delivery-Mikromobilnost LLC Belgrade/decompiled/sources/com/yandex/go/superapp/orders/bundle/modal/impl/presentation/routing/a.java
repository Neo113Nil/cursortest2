package com.yandex.go.superapp.orders.bundle.modal.impl.presentation.routing;

import android.content.Intent;
import android.net.Uri;
import defpackage.f0p;
import defpackage.jsv0;
import defpackage.mfi;
import defpackage.n5u;
import defpackage.ny61;
import defpackage.o5w0;
import defpackage.qoh;
import defpackage.qu;
import defpackage.tje;
import defpackage.vje;
import defpackage.zzo;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class a implements vje {
    public final /* synthetic */ o5w0 a;

    public a(o5w0 o5w0Var) {
        this.a = o5w0Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(2:10|11)(2:13|14))(4:18|(5:20|(3:30|(2:38|(1:44))(1:34)|(1:36))|45|46|(1:48))|49|50)|15|16))|52|6|7|(0)(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c8, code lost:
    
        if (defpackage.po91.e(r7) != false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // defpackage.vje
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Intent intent, Continuation continuation) {
        SuperAppOrderBundleModalRouterImpl$postponeDeeplinkUntilScreenClose$1$processIntent$1 superAppOrderBundleModalRouterImpl$postponeDeeplinkUntilScreenClose$1$processIntent$1;
        int i;
        Uri a;
        f0p e;
        if (continuation instanceof SuperAppOrderBundleModalRouterImpl$postponeDeeplinkUntilScreenClose$1$processIntent$1) {
            superAppOrderBundleModalRouterImpl$postponeDeeplinkUntilScreenClose$1$processIntent$1 = (SuperAppOrderBundleModalRouterImpl$postponeDeeplinkUntilScreenClose$1$processIntent$1) continuation;
            int i2 = superAppOrderBundleModalRouterImpl$postponeDeeplinkUntilScreenClose$1$processIntent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppOrderBundleModalRouterImpl$postponeDeeplinkUntilScreenClose$1$processIntent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superAppOrderBundleModalRouterImpl$postponeDeeplinkUntilScreenClose$1$processIntent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppOrderBundleModalRouterImpl$postponeDeeplinkUntilScreenClose$1$processIntent$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    o5w0 o5w0Var = this.a;
                    jsv0 jsv0Var = o5w0Var.H;
                    jsv0Var.getClass();
                    Uri data = intent.getData();
                    if (data != null) {
                        if (!"route".equalsIgnoreCase(data.getAuthority()) && !"requirement".equalsIgnoreCase(data.getAuthority()) && !"transport_routes".equalsIgnoreCase(data.getAuthority()) && !"mobility_hub".equalsIgnoreCase(data.getAuthority()) && !"geo".equalsIgnoreCase(data.getScheme())) {
                            ru.yandex.taxi.superapp.deeplink.a aVar = jsv0Var.a;
                            aVar.getClass();
                            mfi mfiVar = mfi.l;
                            f0p e2 = mfiVar.e(data);
                            if (e2 == null || e2.a().length() <= 0) {
                                a = ((zzo) aVar.a.get()).a(data);
                                if (a == null || (e = mfiVar.e(a)) == null || e.a().length() <= 0) {
                                    a = null;
                                }
                            } else {
                                a = data;
                            }
                            if (a == null) {
                            }
                        }
                        o5w0Var.r(new qu(9));
                        qoh h = tje.h(o5w0Var.o(), null, null, new SuperAppOrderBundleModalRouterImpl$postponeDeeplinkUntilScreenClose$1$1$1(2, null), 3);
                        superAppOrderBundleModalRouterImpl$postponeDeeplinkUntilScreenClose$1$processIntent$1.L$0 = null;
                        superAppOrderBundleModalRouterImpl$postponeDeeplinkUntilScreenClose$1$processIntent$1.L$1 = null;
                        superAppOrderBundleModalRouterImpl$postponeDeeplinkUntilScreenClose$1$processIntent$1.label = 1;
                        if (h.s(superAppOrderBundleModalRouterImpl$postponeDeeplinkUntilScreenClose$1$processIntent$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return n5u.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                throw new KotlinNothingValueException();
            }
        }
        superAppOrderBundleModalRouterImpl$postponeDeeplinkUntilScreenClose$1$processIntent$1 = new SuperAppOrderBundleModalRouterImpl$postponeDeeplinkUntilScreenClose$1$processIntent$1(this, (ContinuationImpl) continuation);
        Object obj2 = superAppOrderBundleModalRouterImpl$postponeDeeplinkUntilScreenClose$1$processIntent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppOrderBundleModalRouterImpl$postponeDeeplinkUntilScreenClose$1$processIntent$1.label;
        if (i != 0) {
        }
        throw new KotlinNothingValueException();
    }
}
