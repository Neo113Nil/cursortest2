package xsna;

/* compiled from: ClipsViewersExperimentsImpl.kt */
/* loaded from: classes.dex */
public final class epf implements vyp, j601 {
    public Object b;

    @Override // xsna.vyp
    public boolean a(rrk0 rrk0Var, boolean z) {
        for (vyp vypVar : (vyp[]) this.b) {
            if (vypVar.a(rrk0Var, z)) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.vyp
    public boolean b() {
        for (vyp vypVar : (vyp[]) this.b) {
            if (!vypVar.b()) {
                return false;
            }
        }
        return true;
    }

    @Override // xsna.vyp
    public boolean c() {
        for (vyp vypVar : (vyp[]) this.b) {
            if (vypVar.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.vyp
    public void clear() {
        for (vyp vypVar : (vyp[]) this.b) {
            vypVar.clear();
        }
    }

    public boolean d() {
        return ((dpf) this.b).c.b();
    }

    @Override // xsna.j601
    public Object zza() {
        return ((yuz0) this.b).a;
    }
}
