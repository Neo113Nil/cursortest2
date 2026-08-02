package ru.mail.libverify.o;

import ru.mail.libverify.u.w;
import xsna.d9e0;
import xsna.rtl;

/* loaded from: classes9.dex */
public final class h implements d9e0 {
    private final rtl a;
    private final ru.mail.libverify.g0.h b;
    private final ru.mail.libverify.g0.g c;
    private final d9e0<ru.mail.libverify.g0.d> d;

    private h(rtl rtlVar, ru.mail.libverify.g0.h hVar, ru.mail.libverify.g0.g gVar, d9e0 d9e0Var) {
        this.a = rtlVar;
        this.b = hVar;
        this.c = gVar;
        this.d = d9e0Var;
    }

    public static h a(rtl rtlVar, ru.mail.libverify.g0.h hVar, ru.mail.libverify.g0.g gVar, d9e0 d9e0Var) {
        return new h(rtlVar, hVar, gVar, d9e0Var);
    }

    @Override // xsna.e9e0
    public final Object get() {
        return new g((w) this.a.get(), (ru.mail.libverify.q.d) this.b.get(), (ru.mail.libverify.i0.a) this.c.get(), this.d.get());
    }
}
