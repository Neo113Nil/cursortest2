package androidx.sqlite.driver;

import defpackage.hkw0;
import defpackage.qkw0;
import defpackage.vez0;
import defpackage.w511;

/* loaded from: classes.dex */
public final class c extends qkw0 {
    public final SupportSQLiteStatement$Companion$TransactionOperation w;

    public c(hkw0 hkw0Var, String str, SupportSQLiteStatement$Companion$TransactionOperation supportSQLiteStatement$Companion$TransactionOperation) {
        super(hkw0Var, str);
        this.w = supportSQLiteStatement$Companion$TransactionOperation;
    }

    @Override // defpackage.ull0
    public final String Y1(int i) {
        a();
        vez0.Y(21, "no row");
        throw null;
    }

    @Override // defpackage.ull0
    public final void b(int i, long j) {
        a();
        vez0.Y(25, "column index out of range");
        throw null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.c = true;
    }

    @Override // defpackage.ull0
    public final void g1(int i, String str) {
        a();
        vez0.Y(25, "column index out of range");
        throw null;
    }

    @Override // defpackage.ull0
    public final byte[] getBlob(int i) {
        a();
        vez0.Y(21, "no row");
        throw null;
    }

    @Override // defpackage.ull0
    public final int getColumnCount() {
        a();
        return 0;
    }

    @Override // defpackage.ull0
    public final String getColumnName(int i) {
        a();
        vez0.Y(21, "no row");
        throw null;
    }

    @Override // defpackage.ull0
    public final double getDouble(int i) {
        a();
        vez0.Y(21, "no row");
        throw null;
    }

    @Override // defpackage.ull0
    public final long getLong(int i) {
        a();
        vez0.Y(21, "no row");
        throw null;
    }

    @Override // defpackage.ull0
    public final boolean isNull(int i) {
        a();
        vez0.Y(21, "no row");
        throw null;
    }

    @Override // defpackage.ull0
    public final void m(int i, byte[] bArr) {
        a();
        vez0.Y(25, "column index out of range");
        throw null;
    }

    @Override // defpackage.ull0
    public final void p(int i) {
        a();
        vez0.Y(25, "column index out of range");
        throw null;
    }

    @Override // defpackage.ull0
    public final boolean q() {
        int i = b.a[this.w.ordinal()];
        hkw0 hkw0Var = this.a;
        if (i == 1) {
            hkw0Var.s();
            hkw0Var.t();
        } else if (i == 2) {
            hkw0Var.t();
        } else if (i == 3) {
            hkw0Var.i();
        } else if (i == 4) {
            hkw0Var.N();
        } else {
            if (i != 5) {
                w511.b();
                return false;
            }
            hkw0Var.s0();
        }
        return false;
    }

    @Override // defpackage.ull0
    public final void z(double d, int i) {
        a();
        vez0.Y(25, "column index out of range");
        throw null;
    }
}
