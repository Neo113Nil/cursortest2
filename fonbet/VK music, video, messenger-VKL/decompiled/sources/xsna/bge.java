package xsna;

import xsna.iuf;

/* compiled from: ClipsHostTooltipsDisplayAdapter.kt */
/* loaded from: classes17.dex */
public final class bge implements age {
    public final String b;
    public final urf c;

    public bge(String str, urf urfVar) {
        this.b = str;
        this.c = urfVar;
    }

    @Override // xsna.age
    public final void c(String str) {
        this.c.d(this.b, new iuf.a(str));
    }
}
