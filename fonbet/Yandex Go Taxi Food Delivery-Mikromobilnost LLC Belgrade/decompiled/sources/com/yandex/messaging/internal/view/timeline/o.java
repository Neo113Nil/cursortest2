package com.yandex.messaging.internal.view.timeline;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.chat.attachments.NeophonishUpgradeDialogInteractor$getShowDialogEvents$$inlined$flatMapLatest$1;
import defpackage.ike;
import defpackage.jqr;
import defpackage.kgx;
import defpackage.lm50;
import defpackage.pzt0;
import defpackage.qoi0;
import defpackage.rp3;
import defpackage.sfl0;
import defpackage.tje;
import defpackage.vse;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes15.dex */
public final class o {
    public static final /* synthetic */ kgx[] f;
    public final lm50 a;
    public final ChatRequest b;
    public final sfl0 c;
    public final ike d;
    public final rp3 e = new rp3();

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl("subscriptionJob", 0, "getSubscriptionJob()Lkotlinx/coroutines/Job;", o.class);
        qoi0.a.getClass();
        f = new kgx[]{mutablePropertyReference1Impl};
    }

    public o(lm50 lm50Var, ChatRequest chatRequest, sfl0 sfl0Var, vse vseVar) {
        this.a = lm50Var;
        this.b = chatRequest;
        this.c = sfl0Var;
        this.d = vseVar.c(false);
    }

    public final void a() {
        lm50 lm50Var = this.a;
        lm50Var.getClass();
        tje.e();
        pzt0 H = kotlinx.coroutines.flow.e.H(this.d, new jqr(kotlinx.coroutines.flow.e.F(kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.X(((com.yandex.messaging.internal.authorized.chat.b) lm50Var.a.get()).b(this.b), new NeophonishUpgradeDialogInteractor$getShowDialogEvents$$inlined$flatMapLatest$1(3, null))), lm50Var.b.e), new NeophonishUpgradeDialogObserver$start$1(this, null), 3));
        kgx kgxVar = f[0];
        this.e.a(H);
    }
}
