package defpackage;

/* loaded from: classes12.dex */
public final class k630 implements g60 {
    public final /* synthetic */ int a;
    public final pep0 b;
    public final v7p c;

    public /* synthetic */ k630(pep0 pep0Var, v7p v7pVar, int i) {
        this.a = i;
        this.b = pep0Var;
        this.c = v7pVar;
    }

    @Override // defpackage.g60
    public final void a(m950 m950Var, Object obj) {
        int i = this.a;
        v7p v7pVar = this.c;
        pep0 pep0Var = this.b;
        switch (i) {
            case 0:
                gb0 gb0Var = (gb0) v7pVar;
                if (!(m950Var instanceof e5y0)) {
                    if (!(m950Var instanceof fre0)) {
                        if (!(m950Var instanceof yui)) {
                            pep0Var.c((qa00) gb0Var.get(), l630.a, new l3a(m950Var, obj, 2));
                            break;
                        } else {
                            pep0Var.c((qa00) gb0Var.get(), m630.a, new l3a(m950Var, obj, 1));
                            break;
                        }
                    } else {
                        pep0Var.e((qa00) gb0Var.get(), new n630((rre0) obj));
                        break;
                    }
                } else {
                    pep0Var.e((qa00) gb0Var.get(), new o630((d5y0) obj));
                    break;
                }
            case 1:
                vw2 vw2Var = (vw2) v7pVar;
                if (!(m950Var instanceof e5y0)) {
                    if (!(m950Var instanceof fre0)) {
                        pep0Var.c((qa00) vw2Var.get(), a5k0.a, new l3a(m950Var, obj, 3));
                        break;
                    } else {
                        pep0Var.e((qa00) vw2Var.get(), new b5k0((rre0) obj));
                        break;
                    }
                } else {
                    pep0Var.e((qa00) vw2Var.get(), new c5k0((d5y0) obj));
                    break;
                }
            default:
                pep0Var.c((qa00) ((ggl0) v7pVar).get(), zy11.a, new l3a(m950Var, obj, 4));
                break;
        }
    }

    @Override // defpackage.g60
    public final void b() {
        int i = this.a;
        v7p v7pVar = this.c;
        pep0 pep0Var = this.b;
        switch (i) {
            case 0:
                pep0Var.e((qa00) ((gb0) v7pVar).get(), l630.a);
                break;
            case 1:
                pep0Var.e((qa00) ((vw2) v7pVar).get(), a5k0.a);
                break;
            default:
                pep0Var.e((qa00) ((ggl0) v7pVar).get(), zy11.a);
                break;
        }
    }
}
