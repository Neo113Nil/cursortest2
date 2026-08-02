package com.vungle.ads.internal.network;

import java.util.Map;

/* loaded from: classes7.dex */
public final class p {
    public final String a;
    public Map c;
    public String d;
    public Boolean e;
    public String i;
    public com.vungle.ads.internal.util.s j;
    public g b = g.GET;
    public int f = 3;
    public boolean g = true;
    public int h = 5;

    public p(String str) {
        this.a = str;
    }

    public final p a(g gVar) {
        this.b = gVar;
        return this;
    }

    public final void b() {
        this.b = g.GET;
    }

    public final void c() {
        this.b = g.POST;
    }

    public final p d() {
        this.e = Boolean.TRUE;
        return this;
    }

    public final p a(Map map) {
        this.c = map;
        return this;
    }

    public final p b(String str) {
        this.i = str;
        return this;
    }

    public final p a(String str) {
        this.d = str;
        return this;
    }

    public final p a(boolean z) {
        this.g = z;
        return this;
    }

    public final p a(com.vungle.ads.internal.util.s sVar) {
        this.j = sVar;
        return this;
    }

    public final q a() {
        return new q(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }
}
