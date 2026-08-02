package defpackage;

/* loaded from: classes2.dex */
public final class jle extends yr31 {
    public final cle b;
    public final dy40 c;

    public jle(px90 px90Var, bga0 bga0Var, cle cleVar) {
        int i;
        this.b = cleVar;
        dy40 dy40Var = new dy40();
        this.c = dy40Var;
        pg8 pg8Var = new pg8(1, this);
        sae saeVar = new sae(3, this);
        wf91 wf91Var = bga0Var.b;
        if (wf91Var instanceof zfa0) {
            dy40Var.l(fle.a);
            px90Var.a = pg8Var;
            esx esxVar = px90Var.b;
            if (esxVar != null) {
                pg8Var.a(esxVar.a, esxVar.b);
            }
            bga0Var.a.b = saeVar;
            return;
        }
        if (wf91Var instanceof xfa0) {
            dy40Var.l(new ele(((xfa0) wf91Var).c));
            return;
        }
        if (!(wf91Var instanceof aga0)) {
            ny61.r("ContinuePayment without active payment");
            throw null;
        }
        if (ile.a[((aga0) wf91Var).c.ordinal()] == 1) {
            xry0 xry0Var = yry0.a;
            i = yry0.a.q;
        } else {
            xry0 xry0Var2 = yry0.a;
            i = yry0.a.c;
        }
        dy40Var.l(new gle(i));
    }
}
