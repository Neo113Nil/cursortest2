package ru.mail.libverify.p0;

import xsna.c6o;
import xsna.d9e0;
import xsna.rtl;

/* loaded from: classes9.dex */
public final class d implements d9e0 {
    private final rtl a;

    private d(rtl rtlVar) {
        this.a = rtlVar;
    }

    public static d a(rtl rtlVar) {
        return new d(rtlVar);
    }

    @Override // xsna.e9e0
    public final Object get() {
        return new c(c6o.a(this.a));
    }
}
