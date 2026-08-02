package xsna;

import xsna.nak;

/* compiled from: PingableOrder.kt */
/* loaded from: classes6.dex */
public final class azm0 implements hu80 {
    public final nak a;
    public final int b;
    public final boolean c;

    public azm0(nak nakVar) {
        this.a = nakVar;
        this.b = nakVar.a;
        this.c = nakVar instanceof nak.a;
    }

    @Override // xsna.hu80
    public final int a() {
        return this.b;
    }

    @Override // xsna.hu80
    public final boolean isReady() {
        return this.c;
    }
}
