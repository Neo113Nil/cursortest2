package io.appmetrica.analytics.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import xsna.e43;
import xsna.rl3;

/* loaded from: classes8.dex */
public final class J5 implements R8, InterfaceC4802e9 {
    public final X6 a;
    public final Set b;
    public final AtomicLong c;

    public J5(X6 x6) {
        this.a = x6;
        Set y0 = rl3.y0(new Integer[]{Integer.valueOf(EnumC5037nb.EVENT_CLIENT_EXTERNAL_ATTRIBUTION.a()), Integer.valueOf(EnumC5037nb.EVENT_TYPE_APP_UPDATE.a()), Integer.valueOf(EnumC5037nb.EVENT_TYPE_FIRST_ACTIVATION.a()), Integer.valueOf(EnumC5037nb.EVENT_TYPE_INIT.a()), Integer.valueOf(EnumC5037nb.EVENT_TYPE_SEND_AD_REVENUE_EVENT.a()), Integer.valueOf(EnumC5037nb.EVENT_TYPE_SEND_ECOMMERCE_EVENT.a()), Integer.valueOf(EnumC5037nb.EVENT_TYPE_SEND_REFERRER.a()), Integer.valueOf(EnumC5037nb.EVENT_TYPE_SEND_REVENUE_EVENT.a())});
        this.b = y0;
        this.c = new AtomicLong(x6.a(y0));
        x6.a(this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4802e9
    public final void a() {
        this.c.set(this.a.a(this.b));
    }

    @Override // io.appmetrica.analytics.impl.R8
    public final boolean b() {
        return this.c.get() > 0;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4802e9
    public final void b(List<Integer> list) {
        int i = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (this.b.contains(Integer.valueOf(((Number) it.next()).intValue())) && (i = i + 1) < 0) {
                    e43.s();
                    throw null;
                }
            }
        }
        this.c.addAndGet(-i);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4802e9
    public final void a(List<Integer> list) {
        int i = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (this.b.contains(Integer.valueOf(((Number) it.next()).intValue())) && (i = i + 1) < 0) {
                    e43.s();
                    throw null;
                }
            }
        }
        this.c.addAndGet(i);
    }
}
