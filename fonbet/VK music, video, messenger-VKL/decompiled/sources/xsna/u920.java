package xsna;

import xsna.jun0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class u920 implements gzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ u920(int i, w920 w920Var) {
        this.c = i;
        this.d = w920Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                w920 w920Var = (w920) this.d;
                StringBuilder b = ji.b(this.c, "loadNext: from network with targetChunkSize=", " historySize=");
                b.append(w920Var.c().size());
                return b.toString();
            default:
                ((izs) this.d).invoke(new jun0.a(this.c));
                return s3q0.a;
        }
    }

    public /* synthetic */ u920(izs izsVar, int i) {
        this.d = izsVar;
        this.c = i;
    }
}
