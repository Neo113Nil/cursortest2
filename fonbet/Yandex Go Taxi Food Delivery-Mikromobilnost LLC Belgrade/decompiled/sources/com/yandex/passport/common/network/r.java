package com.yandex.passport.common.network;

import defpackage.d5j0;
import defpackage.kwu;
import defpackage.l3s;
import defpackage.m3s;
import defpackage.m5j0;
import defpackage.t4j0;
import java.util.Map;

/* loaded from: classes8.dex */
public class r extends o {
    public final l3s c;

    public r(String str) {
        super(str);
        this.c = new l3s(0);
    }

    @Override // com.yandex.passport.common.network.o
    public final d5j0 a() {
        kwu e = this.b.e();
        t4j0 t4j0Var = this.a;
        t4j0Var.a = e;
        t4j0Var.e("POST", h());
        return new d5j0(t4j0Var);
    }

    public void f(String str, String str2) {
        if (str2 != null) {
            this.c.a(str, str2);
        }
    }

    public final void g(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            f((String) entry.getKey(), (String) entry.getValue());
        }
    }

    public m5j0 h() {
        l3s l3sVar = this.c;
        l3sVar.getClass();
        return new m3s(l3sVar.a, l3sVar.b);
    }
}
