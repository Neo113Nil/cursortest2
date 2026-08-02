package io.appmetrica.analytics.impl;

/* loaded from: classes8.dex */
public final class T8 {
    public final Pc a;
    public final Pc b;

    public T8() {
        this(new C4879h8(), new X9(), new C4715b());
    }

    public T8(C4879h8 c4879h8, X9 x9, C4715b c4715b) {
        Pc pc = new Pc(c4879h8);
        this.a = pc;
        pc.a(U8.NONE, c4879h8);
        pc.a(U8.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER, x9);
        pc.a(U8.AES_VALUE_ENCRYPTION, c4715b);
        this.b = new Pc(c4879h8);
    }
}
