package ru.mail.libverify.requests;

import ru.mail.libverify.u.w;
import xsna.d9e0;
import xsna.rtl;

/* loaded from: classes9.dex */
public final class n implements d9e0 {
    private final rtl a;

    private n(rtl rtlVar) {
        this.a = rtlVar;
    }

    public static n a(rtl rtlVar) {
        return new n(rtlVar);
    }

    @Override // xsna.e9e0
    public final Object get() {
        return new m((w) this.a.get());
    }
}
