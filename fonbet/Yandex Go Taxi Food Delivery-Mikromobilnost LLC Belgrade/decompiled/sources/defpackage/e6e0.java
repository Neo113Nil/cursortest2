package defpackage;

import androidx.room.coroutines.f;

/* loaded from: classes10.dex */
public final class e6e0 implements ull0 {
    public final ull0 a;
    public final long b = pob1.d();
    public final /* synthetic */ f c;

    public e6e0(f fVar, ull0 ull0Var) {
        this.c = fVar;
        this.a = ull0Var;
    }

    @Override // defpackage.ull0
    public final void C() {
        if (this.c.e) {
            vez0.Y(21, "Statement is recycled");
            throw null;
        }
        if (this.b == pob1.d()) {
            this.a.C();
        } else {
            vez0.Y(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.ull0
    public final String Y1(int i) {
        if (this.c.e) {
            vez0.Y(21, "Statement is recycled");
            throw null;
        }
        if (this.b == pob1.d()) {
            return this.a.Y1(i);
        }
        vez0.Y(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.ull0
    public final void b(int i, long j) {
        if (this.c.e) {
            vez0.Y(21, "Statement is recycled");
            throw null;
        }
        if (this.b == pob1.d()) {
            this.a.b(i, j);
        } else {
            vez0.Y(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.c.e) {
            vez0.Y(21, "Statement is recycled");
            throw null;
        }
        if (this.b == pob1.d()) {
            this.a.close();
        } else {
            vez0.Y(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.ull0
    public final void g1(int i, String str) {
        if (this.c.e) {
            vez0.Y(21, "Statement is recycled");
            throw null;
        }
        if (this.b == pob1.d()) {
            this.a.g1(i, str);
        } else {
            vez0.Y(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.ull0
    public final byte[] getBlob(int i) {
        if (this.c.e) {
            vez0.Y(21, "Statement is recycled");
            throw null;
        }
        if (this.b == pob1.d()) {
            return this.a.getBlob(i);
        }
        vez0.Y(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.ull0
    public final int getColumnCount() {
        if (this.c.e) {
            vez0.Y(21, "Statement is recycled");
            throw null;
        }
        if (this.b == pob1.d()) {
            return this.a.getColumnCount();
        }
        vez0.Y(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.ull0
    public final String getColumnName(int i) {
        if (this.c.e) {
            vez0.Y(21, "Statement is recycled");
            throw null;
        }
        if (this.b == pob1.d()) {
            return this.a.getColumnName(i);
        }
        vez0.Y(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.ull0
    public final double getDouble(int i) {
        if (this.c.e) {
            vez0.Y(21, "Statement is recycled");
            throw null;
        }
        if (this.b == pob1.d()) {
            return this.a.getDouble(i);
        }
        vez0.Y(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.ull0
    public final long getLong(int i) {
        if (this.c.e) {
            vez0.Y(21, "Statement is recycled");
            throw null;
        }
        if (this.b == pob1.d()) {
            return this.a.getLong(i);
        }
        vez0.Y(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.ull0
    public final boolean isNull(int i) {
        if (this.c.e) {
            vez0.Y(21, "Statement is recycled");
            throw null;
        }
        if (this.b == pob1.d()) {
            return this.a.isNull(i);
        }
        vez0.Y(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.ull0
    public final void m(int i, byte[] bArr) {
        if (this.c.e) {
            vez0.Y(21, "Statement is recycled");
            throw null;
        }
        if (this.b == pob1.d()) {
            this.a.m(i, bArr);
        } else {
            vez0.Y(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.ull0
    public final void p(int i) {
        if (this.c.e) {
            vez0.Y(21, "Statement is recycled");
            throw null;
        }
        if (this.b == pob1.d()) {
            this.a.p(i);
        } else {
            vez0.Y(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.ull0
    public final boolean q() {
        if (this.c.e) {
            vez0.Y(21, "Statement is recycled");
            throw null;
        }
        if (this.b == pob1.d()) {
            return this.a.q();
        }
        vez0.Y(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.ull0
    public final void reset() {
        if (this.c.e) {
            vez0.Y(21, "Statement is recycled");
            throw null;
        }
        if (this.b == pob1.d()) {
            this.a.reset();
        } else {
            vez0.Y(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.ull0
    public final void z(double d, int i) {
        if (this.c.e) {
            vez0.Y(21, "Statement is recycled");
            throw null;
        }
        if (this.b == pob1.d()) {
            this.a.z(d, i);
        } else {
            vez0.Y(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }
}
