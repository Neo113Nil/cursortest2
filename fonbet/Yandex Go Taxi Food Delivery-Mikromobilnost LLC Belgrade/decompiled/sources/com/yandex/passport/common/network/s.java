package com.yandex.passport.common.network;

import com.yandex.passport.data.network.k3;
import defpackage.d5j0;
import defpackage.kwu;
import defpackage.m5j0;
import defpackage.qje;
import defpackage.t4j0;
import defpackage.wg10;
import defpackage.wms;
import kotlin.text.Regex;

/* loaded from: classes15.dex */
public final class s extends o {
    public final k3 c;
    public final String d;
    public final wg10 e;

    public s(String str, k3 k3Var) {
        super(str);
        wg10 wg10Var;
        this.c = k3Var;
        this.d = "application/json; charset=utf-8";
        Regex regex = wg10.e;
        try {
            wg10Var = qje.o("application/json; charset=utf-8");
        } catch (IllegalArgumentException unused) {
            wg10Var = null;
        }
        this.e = wg10Var;
    }

    @Override // com.yandex.passport.common.network.o
    public final d5j0 a() {
        kwu e = this.b.e();
        t4j0 t4j0Var = this.a;
        t4j0Var.a = e;
        int i = m5j0.a;
        t4j0Var.e("POST", wms.a((String) this.c.invoke(), this.e));
        t4j0Var.a("content-type", this.d);
        return new d5j0(t4j0Var);
    }
}
