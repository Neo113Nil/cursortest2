package yads;

/* loaded from: classes10.dex */
public final class bp2 implements cg3 {
    public final q62 a;
    public final nf3 b;
    public final zg3 c;
    public final ap2 d;
    public ig3 e;

    public /* synthetic */ bp2(q62 q62Var, nf3 nf3Var, vg3 vg3Var) {
        this(q62Var, nf3Var, new zg3(new s62(q62Var), vg3Var));
    }

    @Override // yads.cg3
    public final void a(af2 af2Var) {
        this.e = af2Var;
    }

    @Override // yads.cg3
    public final void play() {
        this.a.a(this.d);
        q62 q62Var = this.a;
        nf3 nf3Var = this.b;
        q62Var.a((p72) nf3Var.d, (p72) nf3Var.e);
    }

    @Override // yads.cg3
    public final void stop() {
        this.c.a();
        this.a.pauseAd();
        this.a.a();
    }

    public bp2(q62 q62Var, nf3 nf3Var, zg3 zg3Var) {
        this.a = q62Var;
        this.b = nf3Var;
        this.c = zg3Var;
        this.d = new ap2(this);
    }
}
