package com.yandex.passport.common.network;

import defpackage.ax40;
import defpackage.brb1;
import defpackage.l5j0;
import defpackage.m5j0;
import defpackage.wg10;
import defpackage.wms;
import defpackage.yw40;

/* loaded from: classes4.dex */
public final class p extends r {
    public final yw40 d;

    public p(String str) {
        super(str);
        yw40 yw40Var = new yw40(0);
        yw40Var.d(ax40.g);
        this.d = yw40Var;
    }

    @Override // com.yandex.passport.common.network.r
    public final void f(String str, String str2) {
        if (str2 != null) {
            yw40 yw40Var = this.d;
            yw40Var.getClass();
            int i = m5j0.a;
            yw40Var.b(brb1.b(str, null, wms.a(str2, null)));
        }
    }

    @Override // com.yandex.passport.common.network.r
    public final m5j0 h() {
        return this.d.c();
    }

    public final void i(wg10 wg10Var, byte[] bArr) {
        int i = m5j0.a;
        l5j0 c = wms.c(wg10Var, bArr);
        yw40 yw40Var = this.d;
        yw40Var.getClass();
        yw40Var.b(brb1.b("file", "avatar.jpg", c));
    }
}
