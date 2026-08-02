package xsna;

import xsna.lm50;

/* compiled from: MviScene.kt */
/* loaded from: classes3.dex */
public final class im50<Content, State extends lm50> extends e41 {
    public final dn50<Content, State> e;

    public im50(dn50 dn50Var) {
        this.e = dn50Var;
    }

    @Override // xsna.e41
    public final void h(Content content, State state) {
        jd2 jd2Var = jd2.a;
        i iVar = new i(this, content, state);
        jd2Var.getClass();
        jd2.a(iVar);
        dn50<Content, State> dn50Var = this.e;
        if (dn50Var != null) {
            dn50Var.consume(content, state);
        }
    }

    @Override // xsna.e41
    public final void m(Content content) {
        jd2 jd2Var = jd2.a;
        h hVar = new h(7, this, content);
        jd2Var.getClass();
        jd2.a(hVar);
    }
}
