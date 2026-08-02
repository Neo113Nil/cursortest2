package com.yandex.go.payments.data;

import defpackage.b03;
import defpackage.cne0;
import defpackage.dne0;
import defpackage.i3y;
import defpackage.lv90;
import defpackage.qhq0;
import defpackage.u3a1;
import defpackage.wnt;
import defpackage.xnt;

/* loaded from: classes8.dex */
public final class k {
    public final wnt a;
    public final dne0 b;
    public final b03 c;
    public final i3y d = kotlin.a.a(new qhq0(0, this));

    public k(b03 b03Var, wnt wntVar, dne0 dne0Var) {
        this.a = wntVar;
        this.b = dne0Var;
        this.c = b03Var;
    }

    public final cne0 a() {
        return (cne0) this.d.getValue();
    }

    public final lv90 b(String str) {
        String l = a().l(str, null);
        if (l == null) {
            return null;
        }
        try {
            return (lv90) ((xnt) this.a).c(l, lv90.Companion.serializer());
        } catch (Exception unused) {
            return null;
        }
    }

    public final kotlinx.coroutines.flow.n c(String str) {
        return new kotlinx.coroutines.flow.n(new j(u3a1.c(a(), str), this), new SelectedPaymentDataSourceImpl$selectedPaymentFlow$2(this, str, null));
    }
}
