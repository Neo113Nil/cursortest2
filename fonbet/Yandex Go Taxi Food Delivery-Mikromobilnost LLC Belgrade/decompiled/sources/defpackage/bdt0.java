package defpackage;

/* loaded from: classes.dex */
public final class bdt0 implements xev {
    public final r1r a;
    public final vev b;
    public final Object c = new Object();
    public boolean w;
    public qq6 x;

    public bdt0(qq6 qq6Var, r1r r1rVar, vev vevVar) {
        this.a = r1rVar;
        this.b = vevVar;
        this.x = qq6Var;
    }

    @Override // defpackage.xev
    public final oq90 K0() {
        synchronized (this.c) {
            if (this.w) {
                throw new IllegalStateException("closed");
            }
        }
        return null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.c) {
            this.w = true;
            qq6 qq6Var = this.x;
            if (qq6Var != null) {
                try {
                    qq6Var.close();
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // defpackage.xev
    public final r1r getFileSystem() {
        return this.a;
    }

    @Override // defpackage.xev
    public final vev getMetadata() {
        return this.b;
    }

    @Override // defpackage.xev
    public final qq6 source() {
        synchronized (this.c) {
            if (this.w) {
                throw new IllegalStateException("closed");
            }
            qq6 qq6Var = this.x;
            if (qq6Var != null) {
                return qq6Var;
            }
            jci0 jci0Var = new jci0(this.a.G(null));
            this.x = jci0Var;
            return jci0Var;
        }
    }
}
