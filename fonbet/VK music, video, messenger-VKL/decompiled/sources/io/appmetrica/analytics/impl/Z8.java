package io.appmetrica.analytics.impl;

import android.content.ContentValues;

/* loaded from: classes8.dex */
public final class Z8 {
    public final String a;
    public String b;
    public final Long c;
    public final Long d;
    public final Long e;
    public final Long f;
    public final C5214u7 g;
    public final EnumC5037nb h;
    public final Integer i;
    public final String j;
    public final Integer k;
    public final Integer l;
    public final String m;
    public final String n;
    public final U8 o;
    public final EnumC5088pa p;
    public final EnumC5316y9 q;
    public final Boolean r;
    public final Integer s;
    public final byte[] t;

    /* JADX WARN: Multi-variable type inference failed */
    public Z8(ContentValues contentValues) {
        C5111q7 model = new C5136r7(null, 1, 0 == true ? 1 : 0).toModel(contentValues);
        this.a = model.a().j();
        this.b = model.a().p();
        this.c = model.c();
        this.d = model.b();
        this.e = model.a().k();
        this.f = model.d();
        this.g = model.a().i();
        this.h = model.e();
        this.i = model.a().d();
        this.j = model.a().f();
        this.k = model.a().o();
        this.l = model.a().c();
        this.m = model.a().b();
        this.n = model.a().m();
        U8 e = model.a().e();
        this.o = e == null ? U8.a(null) : e;
        EnumC5088pa h = model.a().h();
        this.p = h == null ? EnumC5088pa.a(null) : h;
        this.q = model.a().n();
        this.r = model.a().a();
        this.s = model.a().l();
        this.t = model.a().g();
    }
}
