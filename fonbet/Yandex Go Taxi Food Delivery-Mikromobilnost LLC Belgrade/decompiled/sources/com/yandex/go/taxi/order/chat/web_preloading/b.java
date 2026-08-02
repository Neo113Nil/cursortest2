package com.yandex.go.taxi.order.chat.web_preloading;

import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.yandex.messenger.websdk.api.WebMessenger;
import defpackage.hbp0;
import defpackage.n20;
import defpackage.seh0;
import defpackage.tje;
import defpackage.tls;
import defpackage.tt2;

/* loaded from: classes14.dex */
public final class b {
    public final tt2 a;
    public final WebMessenger b;
    public final FragmentActivity c;
    public final n20 d;
    public final ru.yandex.taxi.messenger.domain.a e;
    public final com.yandex.go.taxi.order.chat.experiments.b f;
    public final hbp0 g;

    public b(tt2 tt2Var, WebMessenger webMessenger, FragmentActivity fragmentActivity, n20 n20Var, ru.yandex.taxi.messenger.domain.a aVar, com.yandex.go.taxi.order.chat.experiments.b bVar) {
        this.a = tt2Var;
        this.b = webMessenger;
        this.c = fragmentActivity;
        this.d = n20Var;
        this.e = aVar;
        this.f = bVar;
        this.g = new hbp0(new TaxiOrderWebMessengerPreloaderImpl$scopeDelegate$1(0, tt2Var, tt2.class, "computation", "computation()Lkotlinx/coroutines/CoroutineDispatcher;", 0), null, null, 6);
    }

    public final void a(tls tlsVar) {
        Object invoke = tlsVar.invoke(Integer.valueOf(seh0.messenger_webview_preload_container));
        ViewGroup viewGroup = invoke instanceof ViewGroup ? (ViewGroup) invoke : null;
        if (viewGroup == null) {
            return;
        }
        hbp0 hbp0Var = this.g;
        hbp0Var.a();
        tje.N(hbp0Var.c(), null, null, new TaxiOrderWebMessengerPreloaderImpl$attach$1(viewGroup, this, null), 3);
    }
}
