package ru.mail.libverify.w;

import ru.mail.libverify.u.w;
import xsna.c6o;
import xsna.d9e0;
import xsna.rtl;

/* loaded from: classes9.dex */
public final class h implements d9e0 {
    private final d9e0<b> a;
    private final rtl b;

    private h(d9e0 d9e0Var, rtl rtlVar) {
        this.a = d9e0Var;
        this.b = rtlVar;
    }

    public static h a(d9e0 d9e0Var, rtl rtlVar) {
        return new h(d9e0Var, rtlVar);
    }

    @Override // xsna.e9e0
    public final Object get() {
        return new g(c6o.a(this.a), (w) this.b.get());
    }
}
