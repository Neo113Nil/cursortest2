package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.mh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5017mh extends AbstractC4733bh {
    public C5017mh(C4927j5 c4927j5) {
        super(c4927j5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4733bh
    public final boolean a(C4722b6 c4722b6) {
        Nk nk;
        C4789dl c4789dl;
        C5266w9 c5266w9 = this.a.n;
        C4737bl c4737bl = c5266w9.c;
        if (c4737bl.g == 0) {
            nk = c4737bl.d.b();
            Nk b = c4737bl.e.b();
            if ((nk == null ? -1L : nk.d) <= (b != null ? b.d : -1L)) {
                nk = b;
            }
        } else {
            nk = c4737bl.f;
        }
        if (nk != null) {
            c4789dl = new C4789dl();
            c4789dl.a = nk.d;
            long andIncrement = nk.f.getAndIncrement();
            C4814el c4814el = nk.b;
            c4814el.a(C4814el.g, Long.valueOf(nk.f.get()));
            c4814el.b();
            c4789dl.b = andIncrement;
            c4789dl.c = TimeUnit.MILLISECONDS.toSeconds(nk.j);
            c4789dl.d = nk.c.a;
        } else {
            long j = c4722b6.j;
            long a = c4737bl.b.a();
            X6 x6 = c4737bl.a.e;
            EnumC4840fl enumC4840fl = EnumC4840fl.BACKGROUND;
            x6.a(a, enumC4840fl, j);
            c4789dl = new C4789dl();
            c4789dl.a = a;
            c4789dl.d = enumC4840fl;
            c4789dl.b = 0L;
            c4789dl.c = 0L;
        }
        c5266w9.a(c4722b6, c4789dl);
        return false;
    }
}
