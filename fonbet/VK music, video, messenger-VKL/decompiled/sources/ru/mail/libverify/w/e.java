package ru.mail.libverify.w;

import ru.mail.libverify.u.w;
import xsna.d9e0;
import xsna.rtl;

/* loaded from: classes9.dex */
public final class e implements d9e0 {
    private final rtl a;

    private e(rtl rtlVar) {
        this.a = rtlVar;
    }

    public static e a(rtl rtlVar) {
        return new e(rtlVar);
    }

    @Override // xsna.e9e0
    public final Object get() {
        return new c((w) this.a.get());
    }
}
