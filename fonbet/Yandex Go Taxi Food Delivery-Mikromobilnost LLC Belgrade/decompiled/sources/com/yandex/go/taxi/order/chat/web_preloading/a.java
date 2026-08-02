package com.yandex.go.taxi.order.chat.web_preloading;

import android.view.ViewGroup;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.common_models.net.SimpleBooleanExperiment;

/* loaded from: classes14.dex */
public final class a implements vpr {
    public final /* synthetic */ b a;
    public final /* synthetic */ ViewGroup b;

    public a(b bVar, ViewGroup viewGroup) {
        this.a = bVar;
        this.b = viewGroup;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        OrderStatusInfo V = ((TaxiOrder) obj).V();
        V.getClass();
        boolean f = V.f(SimpleBooleanExperiment.WEB_MESSENGER_PRELOADING);
        ViewGroup viewGroup = this.b;
        b bVar = this.a;
        if (f) {
            bVar.a.getClass();
            sjh sjhVar = uyj.a;
            Object k0 = tje.k0(o400.a, new TaxiOrderWebMessengerPreloaderImpl$startPreloading$2(viewGroup, bVar, null), continuation);
            if (k0 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return k0;
            }
        } else {
            bVar.a.getClass();
            sjh sjhVar2 = uyj.a;
            Object k02 = tje.k0(o400.a, new TaxiOrderWebMessengerPreloaderImpl$stopPreloading$2(viewGroup, null), continuation);
            if (k02 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return k02;
            }
        }
        return zy11.a;
    }
}
