package defpackage;

/* loaded from: classes15.dex */
public final class k1b extends ck3 {
    public final gcf k;
    public final sfl0 l;
    public final String m;
    public j1b n;
    public sls o;

    public k1b(pk3 pk3Var, jn3 jn3Var, oo90 oo90Var, zm90 zm90Var, gcf gcfVar, sfl0 sfl0Var) {
        super(new zj3(false), pk3Var, jn3Var, oo90Var, zm90Var);
        this.k = gcfVar;
        this.l = sfl0Var;
        this.m = "android_messenger_create_chat";
    }

    @Override // defpackage.ck3
    public final void a() {
        this.k.a = false;
        this.n = null;
        sls slsVar = this.o;
        if (slsVar != null) {
            slsVar.invoke();
        }
        this.o = null;
    }

    @Override // defpackage.ck3
    public final void b() {
        gcf gcfVar = this.k;
        if (gcfVar.a) {
            if (this.n == null) {
                new j1b(e520.d);
            }
            this.l.getClass();
            this.n = null;
        }
        gcfVar.a = false;
        sls slsVar = this.o;
        if (slsVar != null) {
            slsVar.invoke();
        }
        this.o = null;
    }

    @Override // defpackage.ck3
    public final String d() {
        return this.m;
    }
}
