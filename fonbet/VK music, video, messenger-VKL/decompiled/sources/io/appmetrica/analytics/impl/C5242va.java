package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.va, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5242va implements InterfaceC4883hc {
    @Override // io.appmetrica.analytics.impl.InterfaceC4883hc
    public final C4983l9 a(C5214u7 c5214u7) {
        C4983l9 c4983l9 = null;
        if ((c5214u7 != null ? c5214u7.b : null) != null && c5214u7.c != null) {
            c4983l9 = new C4983l9();
            c4983l9.b = c5214u7.b.doubleValue();
            c4983l9.a = c5214u7.c.doubleValue();
            Integer num = c5214u7.d;
            if (num != null) {
                c4983l9.g = num.intValue();
            }
            Integer num2 = c5214u7.e;
            if (num2 != null) {
                c4983l9.e = num2.intValue();
            }
            Integer num3 = c5214u7.f;
            if (num3 != null) {
                c4983l9.d = num3.intValue();
            }
            Integer num4 = c5214u7.g;
            if (num4 != null) {
                c4983l9.f = num4.intValue();
            }
            Long l = c5214u7.h;
            if (l != null) {
                c4983l9.c = TimeUnit.MILLISECONDS.toSeconds(l.longValue());
            }
            String str = c5214u7.i;
            if (str != null) {
                if (str.equals("gps")) {
                    c4983l9.h = 1;
                } else if (str.equals("network")) {
                    c4983l9.h = 2;
                }
            }
            String str2 = c5214u7.j;
            if (str2 != null) {
                c4983l9.i = str2;
            }
        }
        return c4983l9;
    }
}
