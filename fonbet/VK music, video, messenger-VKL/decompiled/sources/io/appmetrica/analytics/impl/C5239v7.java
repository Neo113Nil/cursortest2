package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import xsna.epx;
import xsna.zcl;

/* renamed from: io.appmetrica.analytics.impl.v7, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5239v7 implements Converter {
    public final C5271we a;

    /* JADX WARN: Multi-variable type inference failed */
    public C5239v7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5339z7 fromModel(C5214u7 c5214u7) {
        C5339z7 c5339z7 = new C5339z7();
        Boolean bool = c5214u7.a;
        if (bool != null) {
            c5339z7.a = this.a.fromModel(bool).intValue();
        }
        Double d = c5214u7.c;
        if (d != null) {
            c5339z7.c = d.doubleValue();
        }
        Double d2 = c5214u7.b;
        if (d2 != null) {
            c5339z7.b = d2.doubleValue();
        }
        Long l = c5214u7.h;
        if (l != null) {
            c5339z7.h = l.longValue();
        }
        Integer num = c5214u7.f;
        if (num != null) {
            c5339z7.f = num.intValue();
        }
        Integer num2 = c5214u7.e;
        if (num2 != null) {
            c5339z7.e = num2.intValue();
        }
        Integer num3 = c5214u7.g;
        if (num3 != null) {
            c5339z7.g = num3.intValue();
        }
        Integer num4 = c5214u7.d;
        if (num4 != null) {
            c5339z7.d = num4.intValue();
        }
        String str = c5214u7.i;
        if (str != null) {
            c5339z7.i = str;
        }
        String str2 = c5214u7.j;
        if (str2 != null) {
            c5339z7.j = str2;
        }
        return c5339z7;
    }

    public C5239v7(C5271we c5271we) {
        this.a = c5271we;
    }

    public /* synthetic */ C5239v7(C5271we c5271we, int i, zcl zclVar) {
        this((i & 1) != 0 ? new C5271we() : c5271we);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5214u7 toModel(C5339z7 c5339z7) {
        if (c5339z7 == null) {
            return new C5214u7(null, null, null, null, null, null, null, null, null, null);
        }
        C5339z7 c5339z72 = new C5339z7();
        Boolean a = this.a.a(c5339z7.a);
        double d = c5339z7.c;
        Double valueOf = Double.valueOf(d);
        if (d == c5339z72.c) {
            valueOf = null;
        }
        double d2 = c5339z7.b;
        Double valueOf2 = !(d2 == c5339z72.b) ? Double.valueOf(d2) : null;
        long j = c5339z7.h;
        Long valueOf3 = j != c5339z72.h ? Long.valueOf(j) : null;
        int i = c5339z7.f;
        Integer valueOf4 = i != c5339z72.f ? Integer.valueOf(i) : null;
        int i2 = c5339z7.e;
        Integer valueOf5 = i2 != c5339z72.e ? Integer.valueOf(i2) : null;
        int i3 = c5339z7.g;
        Integer valueOf6 = i3 != c5339z72.g ? Integer.valueOf(i3) : null;
        int i4 = c5339z7.d;
        Integer valueOf7 = i4 != c5339z72.d ? Integer.valueOf(i4) : null;
        String str = c5339z7.i;
        String str2 = !epx.f(str, c5339z72.i) ? str : null;
        String str3 = c5339z7.j;
        return new C5214u7(a, valueOf2, valueOf, valueOf7, valueOf5, valueOf4, valueOf6, valueOf3, str2, !epx.f(str3, c5339z72.j) ? str3 : null);
    }
}
