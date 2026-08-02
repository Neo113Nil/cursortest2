package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class jll implements qrq0 {
    public final m3k a;
    public final rvo b;
    public final tls c;
    public final tls d;
    public final tls e;

    public jll(m3k m3kVar, rvo rvoVar, tls tlsVar, tls tlsVar2, tls tlsVar3) {
        this.a = m3kVar;
        this.b = rvoVar;
        this.c = tlsVar;
        this.d = tlsVar2;
        this.e = tlsVar3;
    }

    @Override // defpackage.qrq0
    public final Iterator iterator() {
        return new c2k(this, this.a, this.b, this.e);
    }
}
