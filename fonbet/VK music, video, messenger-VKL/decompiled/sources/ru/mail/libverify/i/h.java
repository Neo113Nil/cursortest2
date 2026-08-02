package ru.mail.libverify.i;

import android.content.Context;
import ru.mail.libverify.u.w;
import xsna.d9e0;
import xsna.rtl;

/* loaded from: classes9.dex */
public final class h implements d9e0 {
    private final ru.mail.verify.core.api.g a;
    private final rtl b;

    private h(ru.mail.verify.core.api.g gVar, rtl rtlVar) {
        this.a = gVar;
        this.b = rtlVar;
    }

    public static h a(ru.mail.verify.core.api.g gVar, rtl rtlVar) {
        return new h(gVar, rtlVar);
    }

    @Override // xsna.e9e0
    public final Object get() {
        return new g((Context) this.a.get(), (w) this.b.get());
    }
}
