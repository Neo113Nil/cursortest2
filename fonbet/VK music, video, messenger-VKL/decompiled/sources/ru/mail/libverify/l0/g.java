package ru.mail.libverify.l0;

import android.content.Context;
import xsna.d9e0;

/* loaded from: classes9.dex */
public final class g implements d9e0 {
    private final ru.mail.verify.core.api.g a;

    private g(ru.mail.verify.core.api.g gVar) {
        this.a = gVar;
    }

    public static g a(ru.mail.verify.core.api.g gVar) {
        return new g(gVar);
    }

    @Override // xsna.e9e0
    public final Object get() {
        return new f((Context) this.a.get());
    }
}
