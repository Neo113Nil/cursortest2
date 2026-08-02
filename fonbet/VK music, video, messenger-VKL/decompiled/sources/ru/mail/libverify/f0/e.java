package ru.mail.libverify.f0;

import android.content.Context;
import ru.mail.verify.core.api.g;
import xsna.d9e0;

/* loaded from: classes9.dex */
public final class e implements d9e0 {
    private final g a;

    private e(g gVar) {
        this.a = gVar;
    }

    public static e a(g gVar) {
        return new e(gVar);
    }

    @Override // xsna.e9e0
    public final Object get() {
        return new d((Context) this.a.get());
    }
}
