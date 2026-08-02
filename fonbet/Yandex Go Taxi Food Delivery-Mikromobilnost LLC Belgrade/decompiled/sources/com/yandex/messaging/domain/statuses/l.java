package com.yandex.messaging.domain.statuses;

import defpackage.au21;
import defpackage.iz01;
import defpackage.kgx;
import defpackage.op3;
import defpackage.oyr;
import defpackage.pzt0;
import defpackage.qoi0;
import defpackage.rp3;
import defpackage.tje;
import defpackage.ut21;
import defpackage.w0j0;
import defpackage.x08;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes15.dex */
public final class l implements x08 {
    public static final /* synthetic */ kgx[] z = {new MutablePropertyReference1Impl("cancellable", 0, "getCancellable()Lcom/yandex/messaging/Cancelable;", l.class), oyr.B(qoi0.a, l.class, "debounceJob", "getDebounceJob()Lkotlinx/coroutines/Job;", 0)};
    public final Set a;
    public final long b;
    public final String[] c;
    public final op3 w = new op3();
    public final rp3 x;
    public final /* synthetic */ au21 y;

    public l(au21 au21Var, Set set, long j) {
        this.y = au21Var;
        this.a = set;
        this.b = j;
        this.c = (String[]) set.toArray(new String[0]);
        rp3 rp3Var = new rp3();
        this.x = rp3Var;
        if (j == 0) {
            a(au21Var.a.a(55L, TimeUnit.SECONDS, new iz01(au21Var, this)));
        } else {
            ut21 ut21Var = au21Var.c;
            Objects.toString(set);
            ut21Var.getClass();
            pzt0 N = tje.N(au21Var.d, null, null, new UserStatusSubscriptionManager$UserStatusCall$4(this, au21Var, null), 3);
            kgx kgxVar = z[1];
            rp3Var.a(N);
        }
    }

    public final void a(w0j0 w0j0Var) {
        kgx kgxVar = z[0];
        this.w.b(w0j0Var);
    }

    @Override // defpackage.x08
    public final void cancel() {
        ut21 ut21Var = this.y.c;
        Objects.toString(this.a);
        ut21Var.getClass();
        a(null);
        kgx kgxVar = z[1];
        this.x.a(null);
    }
}
