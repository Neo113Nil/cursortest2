package ru.mail.libverify.c;

import android.content.Context;
import xsna.d9e0;

/* loaded from: classes9.dex */
public final class h implements d9e0 {
    private final ru.mail.verify.core.api.g a;

    private h(ru.mail.verify.core.api.g gVar) {
        this.a = gVar;
    }

    public static h a(ru.mail.verify.core.api.g gVar) {
        return new h(gVar);
    }

    @Override // xsna.e9e0
    public final Object get() {
        return new g((Context) this.a.get());
    }
}
