package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.w9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5266w9 {
    public final C4860gf a;
    public final Ho b;
    public final C4737bl c;
    public final X6 d;
    public final T8 e;
    public final Tk f;
    public final C4922j0 g;
    public final C4979l5 h;
    public final TimeProvider i;
    public final int j;
    public long k;
    public int l;

    public C5266w9(C4860gf c4860gf, Ho ho, C4737bl c4737bl, X6 x6, C4922j0 c4922j0, T8 t8, Tk tk, int i, C4979l5 c4979l5, SystemTimeProvider systemTimeProvider) {
        this.a = c4860gf;
        this.b = ho;
        this.c = c4737bl;
        this.d = x6;
        this.g = c4922j0;
        this.e = t8;
        this.f = tk;
        this.j = i;
        this.i = systemTimeProvider;
        this.h = c4979l5;
        this.k = c4860gf.i();
        this.l = c4860gf.h();
    }

    public final void a(C4722b6 c4722b6, C4789dl c4789dl) {
        long optLong;
        Map map = c4722b6.p;
        Tk tk = this.f;
        tk.getClass();
        map.putAll(new HashMap(tk.b));
        c4722b6.c(this.a.j());
        c4722b6.o = Integer.valueOf(this.b.b());
        C4897i0 a = this.g.a();
        T8 t8 = this.e;
        t8.getClass();
        S8 s8 = (S8) t8.b.a(EnumC5037nb.a(c4722b6.d));
        X6 x6 = this.d;
        L8 a2 = s8.a(c4722b6);
        int i = c4722b6.d;
        Ho ho = this.b;
        C5188t7 c5188t7 = new C5188t7(x6.g, c4789dl, i, ho, a2, (C5224uh) x6.h.k.a(), a);
        Long valueOf = Long.valueOf(c4789dl.a);
        EnumC4840fl enumC4840fl = c4789dl.d;
        Long valueOf2 = Long.valueOf(c4789dl.b);
        EnumC5037nb a3 = EnumC5037nb.a(c5188t7.h.d);
        long j = 0;
        if (!I9.g.contains(EnumC5037nb.a(i))) {
            synchronized (ho) {
                JSONObject a4 = ho.a.a();
                optLong = a4.optLong("global_number", 0L);
                ho.a.a(a4.put("global_number", optLong + 1));
            }
            j = optLong;
        }
        x6.a(x6.l.fromModel(new C5111q7(valueOf, enumC4840fl, valueOf2, a3, Long.valueOf(j), Long.valueOf(c4789dl.c), c5188t7.a())));
        this.h.a.h();
    }
}
