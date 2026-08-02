package ru.mail.libverify.u;

import android.content.Context;
import xsna.d9e0;

/* loaded from: classes9.dex */
public final class b0 implements d9e0 {
    private final d9e0<ru.mail.libverify.g0.d> a;
    private final ru.mail.verify.core.api.g b;

    private b0(d9e0 d9e0Var, ru.mail.verify.core.api.g gVar) {
        this.a = d9e0Var;
        this.b = gVar;
    }

    public static b0 a(d9e0 d9e0Var, ru.mail.verify.core.api.g gVar) {
        return new b0(d9e0Var, gVar);
    }

    @Override // xsna.e9e0
    public final Object get() {
        return new a0(this.a.get(), (Context) this.b.get());
    }
}
