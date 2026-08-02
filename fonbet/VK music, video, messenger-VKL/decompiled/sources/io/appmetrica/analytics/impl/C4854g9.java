package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.g9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4854g9 {
    public static final Map h;
    public static final C4854g9 i;
    public final Id a;
    public final Do b;
    public final K8 c;
    public final F9 d;
    public final InterfaceC4883hc e;
    public final InterfaceC4833fe f;
    public final Z9 g;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(EnumC5088pa.FIRST_OCCURRENCE, 1);
        hashMap.put(EnumC5088pa.NON_FIRST_OCCURENCE, 0);
        hashMap.put(EnumC5088pa.UNKNOWN, -1);
        h = Collections.unmodifiableMap(hashMap);
        i = new C4854g9(new C4735bj(), new C4945jn(), new C5040ne(), new C4709aj(), new C5242va(), new C5267wa(), new C5217ua());
    }

    public C4854g9(C4828f9 c4828f9) {
        this(c4828f9.a, c4828f9.b, c4828f9.c, c4828f9.d, c4828f9.e, c4828f9.f, c4828f9.g);
    }

    public final C5113q9 a(Z8 z8, C5224uh c5224uh) {
        C5113q9 c5113q9 = new C5113q9();
        C5087p9 a = this.f.a(z8.l, z8.m);
        C4983l9 a2 = this.e.a(z8.g);
        if (a != null) {
            c5113q9.g = a;
        }
        if (a2 != null) {
            c5113q9.f = a2;
        }
        String a3 = this.a.a(z8.a);
        if (a3 != null) {
            c5113q9.d = a3;
        }
        c5113q9.e = this.b.a(z8, c5224uh);
        String str = z8.j;
        if (str != null) {
            c5113q9.h = str;
        }
        Integer a4 = this.d.a(z8);
        if (a4 != null) {
            c5113q9.c = a4.intValue();
        }
        Long l = z8.c;
        if (l != null) {
            c5113q9.a = l.longValue();
        }
        Long l2 = z8.d;
        if (l2 != null) {
            c5113q9.n = l2.longValue();
        }
        Long l3 = z8.e;
        if (l3 != null) {
            c5113q9.o = l3.longValue();
        }
        Long l4 = z8.f;
        if (l4 != null) {
            c5113q9.b = l4.longValue();
        }
        Integer num = z8.k;
        if (num != null) {
            c5113q9.i = num.intValue();
        }
        c5113q9.j = this.c.a(z8.o);
        C5214u7 c5214u7 = z8.g;
        c5113q9.k = c5214u7 != null ? new C5187t6().a(c5214u7.a) : -1;
        String str2 = z8.n;
        if (str2 != null) {
            c5113q9.l = str2.getBytes();
        }
        EnumC5088pa enumC5088pa = z8.p;
        Integer num2 = enumC5088pa != null ? (Integer) h.get(enumC5088pa) : null;
        if (num2 != null) {
            c5113q9.m = num2.intValue();
        }
        EnumC5316y9 enumC5316y9 = z8.q;
        if (enumC5316y9 != null) {
            int ordinal = enumC5316y9.ordinal();
            if (ordinal == 0) {
                c5113q9.p = 0;
            } else if (ordinal == 1) {
                c5113q9.p = 1;
            } else if (ordinal == 2) {
                c5113q9.p = 2;
            }
        }
        Boolean bool = z8.r;
        if (bool != null) {
            c5113q9.q = bool.booleanValue();
        }
        if (z8.s != null) {
            c5113q9.r = r6.intValue();
        }
        c5113q9.s = ((C5217ua) this.g).a(z8.t);
        return c5113q9;
    }

    public C4854g9(Id id, Do r2, K8 k8, F9 f9, InterfaceC4883hc interfaceC4883hc, InterfaceC4833fe interfaceC4833fe, Z9 z9) {
        this.a = id;
        this.b = r2;
        this.c = k8;
        this.d = f9;
        this.e = interfaceC4883hc;
        this.f = interfaceC4833fe;
        this.g = z9;
    }

    public static C4828f9 a() {
        return new C4828f9(i);
    }
}
