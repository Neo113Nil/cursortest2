package com.yandex.go.yb.data;

import com.yandex.go.yb.api.domain.model.YbScreenSource;
import defpackage.b2k;
import defpackage.cda0;
import defpackage.ffx;
import defpackage.py51;
import defpackage.tyo0;
import defpackage.vng;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes15.dex */
public final class h {
    public final n0 a;
    public YbScreenSource b;
    public final b2k c;

    public h(cda0 cda0Var, py51 py51Var) {
        n0 b = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
        this.a = b;
        this.c = vng.l(new g(kotlinx.coroutines.flow.e.n(py51Var.b(), b, ((com.yandex.go.payments.paymentlist.data.c) cda0Var).u, new SelectYbCardRepository$openedYbWalletFlow$1(4, null))), new tyo0(22), vng.c);
    }
}
