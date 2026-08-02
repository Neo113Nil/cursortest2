package defpackage;

import java.io.Closeable;

/* loaded from: classes10.dex */
public final class c0r extends zev {
    public final oq90 a;
    public final r1r b;
    public final String c;
    public final Closeable w;
    public boolean x;
    public jci0 y;

    public c0r(oq90 oq90Var, r1r r1rVar, String str, Closeable closeable) {
        this.a = oq90Var;
        this.b = r1rVar;
        this.c = str;
        this.w = closeable;
    }

    @Override // defpackage.zev
    public final oq90 K0() {
        return a();
    }

    @Override // defpackage.zev
    public final synchronized oq90 a() {
        if (this.x) {
            throw new IllegalStateException("closed");
        }
        return this.a;
    }

    @Override // defpackage.zev
    public final wev c() {
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            this.x = true;
            jci0 jci0Var = this.y;
            if (jci0Var != null) {
                m.a(jci0Var);
            }
            Closeable closeable = this.w;
            if (closeable != null) {
                m.a(closeable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final String d() {
        return this.c;
    }

    @Override // defpackage.zev
    public final synchronized qq6 source() {
        if (this.x) {
            throw new IllegalStateException("closed");
        }
        jci0 jci0Var = this.y;
        if (jci0Var != null) {
            return jci0Var;
        }
        jci0 jci0Var2 = new jci0(this.b.G(this.a));
        this.y = jci0Var2;
        return jci0Var2;
    }
}
