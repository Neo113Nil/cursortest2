package com.yandex.messaging.internal.authorized;

import androidx.fragment.app.FragmentActivity;
import defpackage.eja1;
import defpackage.enp0;
import defpackage.i3y;
import defpackage.kgx;
import defpackage.oyr;
import defpackage.pv01;
import defpackage.qoi0;
import defpackage.qp3;
import defpackage.z8g;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes15.dex */
public final class h {
    public static final /* synthetic */ kgx[] g = {new MutablePropertyReference1Impl("bannedDisposable", 0, "getBannedDisposable()Lcom/yandex/alicekit/core/Disposable;", h.class), oyr.B(qoi0.a, h.class, "blacklistedDisposable", "getBlacklistedDisposable()Lcom/yandex/alicekit/core/Disposable;", 0), new MutablePropertyReference1Impl("spamDetectDisposable", 0, "getSpamDetectDisposable()Lcom/yandex/alicekit/core/Disposable;", h.class), new MutablePropertyReference1Impl("migrationEnvironmentDisposable", 0, "getMigrationEnvironmentDisposable()Lcom/yandex/alicekit/core/Disposable;", h.class)};
    public final FragmentActivity a;
    public final i3y b = kotlin.a.a(new pv01(18, this));
    public final qp3 c = new qp3();
    public final qp3 d = new qp3();
    public final qp3 e = new qp3();
    public final qp3 f = new qp3();

    public h(FragmentActivity fragmentActivity) {
        this.a = fragmentActivity;
    }

    public final void a() {
        com.yandex.messaging.extension.flow.c.b(((z8g) ((enp0) this.b.getValue())).b().b(), eja1.s(this.a), new UserActionFailedController$onResume$1(this, null));
    }
}
