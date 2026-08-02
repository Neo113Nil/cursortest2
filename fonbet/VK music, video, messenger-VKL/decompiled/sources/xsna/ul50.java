package xsna;

import xsna.lm50;

/* compiled from: MviScene.kt */
/* loaded from: classes3.dex */
public final class ul50<Content, State extends lm50> extends e41 implements uic {
    public wzs<? super Content, ? super State, s3q0> e;
    public en50 f;
    public final ul50<Content, State>.a g = new a();

    /* compiled from: MviScene.kt */
    public final class a implements uic {
        public a() {
        }

        public final void a(izs<? super gom0<Content, State>, s3q0> izsVar) {
            gom0 gom0Var = new gom0();
            izsVar.invoke(gom0Var);
            ul50.this.f = new en50(gom0Var.a, gom0Var.b, gom0Var.c);
        }

        @Override // xsna.uic
        public final void clear() {
            ul50<Content, State> ul50Var = ul50.this;
            ul50Var.e = null;
            ul50Var.f = null;
        }
    }

    @Override // xsna.uic
    public final void clear() {
        this.g.clear();
    }

    @Override // xsna.e41
    public final void h(Content content, State state) {
        jd2 jd2Var = jd2.a;
        y4p y4pVar = new y4p(this, content, state, 1);
        jd2Var.getClass();
        jd2.a(y4pVar);
        en50 en50Var = this.f;
        if (en50Var != null) {
            en50Var.consume(content, state);
        }
    }

    @Override // xsna.e41
    public final void m(Content content) {
        jd2 jd2Var = jd2.a;
        ii4 ii4Var = new ii4(4, this, content);
        jd2Var.getClass();
        jd2.a(ii4Var);
    }
}
