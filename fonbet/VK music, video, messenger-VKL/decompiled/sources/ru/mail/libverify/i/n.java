package ru.mail.libverify.i;

import android.content.Context;
import xsna.d9e0;

/* loaded from: classes9.dex */
public final class n implements d9e0 {
    private final ru.mail.verify.core.api.g a;

    private n(ru.mail.verify.core.api.g gVar) {
        this.a = gVar;
    }

    public static n a(ru.mail.verify.core.api.g gVar) {
        return new n(gVar);
    }

    @Override // xsna.e9e0
    public final Object get() {
        return new m((Context) this.a.get());
    }
}
