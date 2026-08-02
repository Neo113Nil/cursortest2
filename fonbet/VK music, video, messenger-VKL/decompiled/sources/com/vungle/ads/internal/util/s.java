package com.vungle.ads.internal.util;

import xsna.epx;
import xsna.ho8;

/* loaded from: classes7.dex */
public final class s {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public Boolean g;
    public Boolean h;
    public com.vungle.ads.internal.h i;
    public Boolean j;
    public String k;
    public Long l;
    public String m;

    public final void a(com.vungle.ads.internal.h hVar) {
        this.i = hVar;
    }

    public final void b(String str) {
        this.d = str;
    }

    public final void c(String str) {
        this.b = str;
    }

    public final void d(String str) {
        this.c = str;
    }

    public final void e(String str) {
        this.k = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!s.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        s sVar = (s) obj;
        return epx.f(this.a, sVar.a) && epx.f(this.b, sVar.b) && epx.f(this.c, sVar.c) && epx.f(this.d, sVar.d) && epx.f(this.e, sVar.e) && epx.f(this.f, sVar.f) && epx.f(this.g, sVar.g) && epx.f(this.h, sVar.h) && this.i == sVar.i && epx.f(this.j, sVar.j) && epx.f(this.k, sVar.k) && epx.f(this.l, sVar.l) && epx.f(this.m, sVar.m);
    }

    public final void f(String str) {
        this.e = str;
    }

    public final void g(String str) {
        this.a = str;
    }

    public final String h() {
        return this.c;
    }

    public final int hashCode() {
        int a = (a(this.f) + ((a(this.e) + ((a(this.d) + ((a(this.c) + ((a(this.b) + (a(this.a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        Boolean bool = this.g;
        int hashCode = (a + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.h;
        int hashCode2 = (hashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        com.vungle.ads.internal.h hVar = this.i;
        int hashCode3 = (hashCode2 + (hVar != null ? hVar.hashCode() : 0)) * 31;
        Boolean bool3 = this.j;
        int a2 = (a(this.k) + ((hashCode3 + (bool3 != null ? bool3.hashCode() : 0)) * 31)) * 31;
        Long l = this.l;
        return a(this.m) + ((a2 + (l != null ? l.hashCode() : 0)) * 31);
    }

    public final String i() {
        return this.k;
    }

    public final String j() {
        return this.e;
    }

    public final Boolean k() {
        return this.g;
    }

    public final String l() {
        return this.a;
    }

    public final String m() {
        return this.f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogEntry(placementRefId=");
        sb.append(this.a);
        sb.append(", creativeId=");
        sb.append(this.b);
        sb.append(", eventId=");
        sb.append(this.c);
        sb.append(", adSource=");
        sb.append(this.d);
        sb.append(", mediationName=");
        sb.append(this.e);
        sb.append(", vmVersion=");
        sb.append(this.f);
        sb.append(", partialDownloadEnabled=");
        sb.append(this.g);
        sb.append(", adoEnabled=");
        sb.append(this.h);
        sb.append(", adState=");
        sb.append(this.i);
        sb.append(" adPoddingEnabled=");
        sb.append(this.j);
        sb.append(", experiments=");
        sb.append(this.k);
        sb.append(", adLoadType=");
        sb.append(this.l);
        sb.append(", adapterAdFormat=");
        return ho8.a(sb, this.m, ')');
    }

    public final void a(Boolean bool) {
        this.j = bool;
    }

    public final void b(Boolean bool) {
        this.h = bool;
    }

    public final String c() {
        return this.d;
    }

    public final com.vungle.ads.internal.h d() {
        return this.i;
    }

    public final String e() {
        return this.m;
    }

    public final Boolean f() {
        return this.h;
    }

    public final String g() {
        return this.b;
    }

    public final void h(String str) {
        this.f = str;
    }

    public final Long a() {
        return this.l;
    }

    public final Boolean b() {
        return this.j;
    }

    public final void c(Boolean bool) {
        this.g = bool;
    }

    public final void a(Long l) {
        this.l = l;
    }

    public static int a(String str) {
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
