package ru.mail.libverify.y;

import ru.mail.libverify.g0.g;
import ru.mail.libverify.o.f;
import xsna.d9e0;

/* loaded from: classes9.dex */
public final class b implements d9e0 {
    private final g a;
    private final d9e0<f> b;

    private b(g gVar, d9e0 d9e0Var) {
        this.a = gVar;
        this.b = d9e0Var;
    }

    public static b a(g gVar, d9e0 d9e0Var) {
        return new b(gVar, d9e0Var);
    }

    @Override // xsna.e9e0
    public final Object get() {
        return new a((ru.mail.libverify.i0.a) this.a.get(), this.b.get());
    }
}
