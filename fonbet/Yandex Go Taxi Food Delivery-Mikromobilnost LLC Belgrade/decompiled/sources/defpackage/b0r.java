package defpackage;

/* loaded from: classes.dex */
public final class b0r implements xev {
    public final oq90 a;
    public final r1r b;
    public final String c;
    public final AutoCloseable w;
    public final Object x = new Object();
    public boolean y;
    public jci0 z;

    public b0r(oq90 oq90Var, r1r r1rVar, String str, AutoCloseable autoCloseable) {
        this.a = oq90Var;
        this.b = r1rVar;
        this.c = str;
        this.w = autoCloseable;
    }

    @Override // defpackage.xev
    public final oq90 K0() {
        oq90 oq90Var;
        synchronized (this.x) {
            if (this.y) {
                throw new IllegalStateException("closed");
            }
            oq90Var = this.a;
        }
        return oq90Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.x) {
            this.y = true;
            jci0 jci0Var = this.z;
            if (jci0Var != null) {
                try {
                    jci0Var.close();
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
            }
            AutoCloseable autoCloseable = this.w;
            if (autoCloseable != null) {
                try {
                    oo31.o(autoCloseable);
                } catch (RuntimeException e2) {
                    throw e2;
                } catch (Exception unused2) {
                }
            }
        }
    }

    @Override // defpackage.xev
    public final r1r getFileSystem() {
        return this.b;
    }

    @Override // defpackage.xev
    public final vev getMetadata() {
        return null;
    }

    @Override // defpackage.xev
    public final qq6 source() {
        synchronized (this.x) {
            if (this.y) {
                throw new IllegalStateException("closed");
            }
            jci0 jci0Var = this.z;
            if (jci0Var != null) {
                return jci0Var;
            }
            jci0 jci0Var2 = new jci0(this.b.G(this.a));
            this.z = jci0Var2;
            return jci0Var2;
        }
    }
}
