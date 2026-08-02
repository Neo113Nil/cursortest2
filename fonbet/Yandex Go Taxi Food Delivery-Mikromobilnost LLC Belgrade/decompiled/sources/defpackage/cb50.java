package defpackage;

/* loaded from: classes8.dex */
public final class cb50 {
    public final h3y a;
    public g4g b;
    public zrm c;
    public boolean d;

    public cb50(h3y h3yVar) {
        this.a = h3yVar;
    }

    public final void a() {
        hbp0 f;
        if ((this.c != null || this.d) && ((oc50) ((zzf) ((h6r) this.a.get())).sb.get()).a()) {
            return;
        }
        g4g g4gVar = this.b;
        if (g4gVar != null && (f = g4gVar.f()) != null) {
            f.b();
        }
        this.b = null;
    }

    public final g4g b() {
        g4g g4gVar = this.b;
        if (g4gVar != null || g4gVar != null) {
            return g4gVar;
        }
        g4g a = uvb1.a((h6r) this.a.get(), this);
        this.b = a;
        return a;
    }

    public final j4n c() {
        zrm zrmVar = this.c;
        if (zrmVar == null) {
            zrmVar = b().b();
            this.c = zrmVar;
        }
        return zrmVar.a();
    }
}
