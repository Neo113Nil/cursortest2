package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class okw0 extends qkw0 {
    public final /* synthetic */ int w = 1;
    public final AutoCloseable x;

    public okw0(hkw0 hkw0Var, String str) {
        super(hkw0Var, str);
        this.x = hkw0Var.g(str);
    }

    @Override // defpackage.qkw0, defpackage.ull0
    public final void C() {
        int i = this.w;
        AutoCloseable autoCloseable = this.x;
        switch (i) {
            case 0:
                ((pkw0) autoCloseable).C();
                break;
            default:
                a();
                ((zfs) autoCloseable).C();
                break;
        }
    }

    @Override // defpackage.ull0
    public boolean Q1() {
        switch (this.w) {
            case 0:
                return ((pkw0) this.x).Q1();
            default:
                return super.Q1();
        }
    }

    @Override // defpackage.ull0
    public final String Y1(int i) {
        switch (this.w) {
            case 0:
                return ((pkw0) this.x).Y1(i);
            default:
                a();
                vez0.Y(21, "no row");
                throw null;
        }
    }

    @Override // defpackage.ull0
    public final void b(int i, long j) {
        int i2 = this.w;
        AutoCloseable autoCloseable = this.x;
        switch (i2) {
            case 0:
                ((pkw0) autoCloseable).b(i, j);
                break;
            default:
                a();
                ((zfs) autoCloseable).b(i, j);
                break;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        int i = this.w;
        AutoCloseable autoCloseable = this.x;
        switch (i) {
            case 0:
                ((pkw0) autoCloseable).close();
                break;
            default:
                ((zfs) autoCloseable).close();
                this.c = true;
                break;
        }
    }

    @Override // defpackage.ull0
    public final void g1(int i, String str) {
        int i2 = this.w;
        AutoCloseable autoCloseable = this.x;
        switch (i2) {
            case 0:
                ((pkw0) autoCloseable).g1(i, str);
                break;
            default:
                a();
                ((zfs) autoCloseable).m0(i, str);
                break;
        }
    }

    @Override // defpackage.ull0
    public final byte[] getBlob(int i) {
        switch (this.w) {
            case 0:
                return ((pkw0) this.x).getBlob(i);
            default:
                a();
                vez0.Y(21, "no row");
                throw null;
        }
    }

    @Override // defpackage.ull0
    public final int getColumnCount() {
        switch (this.w) {
            case 0:
                return ((pkw0) this.x).getColumnCount();
            default:
                a();
                return 0;
        }
    }

    @Override // defpackage.ull0
    public final String getColumnName(int i) {
        switch (this.w) {
            case 0:
                return ((pkw0) this.x).getColumnName(i);
            default:
                a();
                vez0.Y(21, "no row");
                throw null;
        }
    }

    @Override // defpackage.ull0
    public List getColumnNames() {
        switch (this.w) {
            case 0:
                return ((pkw0) this.x).getColumnNames();
            default:
                return super.getColumnNames();
        }
    }

    @Override // defpackage.ull0
    public final double getDouble(int i) {
        switch (this.w) {
            case 0:
                return ((pkw0) this.x).getDouble(i);
            default:
                a();
                vez0.Y(21, "no row");
                throw null;
        }
    }

    @Override // defpackage.ull0
    public final long getLong(int i) {
        switch (this.w) {
            case 0:
                return ((pkw0) this.x).getLong(i);
            default:
                a();
                vez0.Y(21, "no row");
                throw null;
        }
    }

    @Override // defpackage.ull0
    public final boolean isNull(int i) {
        switch (this.w) {
            case 0:
                return ((pkw0) this.x).isNull(i);
            default:
                a();
                vez0.Y(21, "no row");
                throw null;
        }
    }

    @Override // defpackage.ull0
    public final void m(int i, byte[] bArr) {
        int i2 = this.w;
        AutoCloseable autoCloseable = this.x;
        switch (i2) {
            case 0:
                ((pkw0) autoCloseable).m(i, bArr);
                break;
            default:
                a();
                ((zfs) autoCloseable).m(i, bArr);
                break;
        }
    }

    @Override // defpackage.ull0
    public final void p(int i) {
        int i2 = this.w;
        AutoCloseable autoCloseable = this.x;
        switch (i2) {
            case 0:
                ((pkw0) autoCloseable).p(i);
                break;
            default:
                a();
                ((zfs) autoCloseable).p(i);
                break;
        }
    }

    @Override // defpackage.ull0
    public final boolean q() {
        int i = this.w;
        AutoCloseable autoCloseable = this.x;
        switch (i) {
            case 0:
                pkw0 pkw0Var = (pkw0) autoCloseable;
                boolean q = pkw0Var.q();
                boolean equalsIgnoreCase = pkw0Var.Y1(0).equalsIgnoreCase("wal");
                hkw0 hkw0Var = this.a;
                if (equalsIgnoreCase) {
                    hkw0Var.k1();
                } else {
                    hkw0Var.E();
                }
                return q;
            default:
                a();
                ((zfs) autoCloseable).b.execute();
                return false;
        }
    }

    @Override // defpackage.qkw0, defpackage.ull0
    public void reset() {
        switch (this.w) {
            case 0:
                ((pkw0) this.x).reset();
                break;
            default:
                super.reset();
                break;
        }
    }

    @Override // defpackage.ull0
    public final void z(double d, int i) {
        int i2 = this.w;
        AutoCloseable autoCloseable = this.x;
        switch (i2) {
            case 0:
                ((pkw0) autoCloseable).z(d, i);
                break;
            default:
                a();
                ((zfs) autoCloseable).z(d, i);
                break;
        }
    }

    public okw0(hkw0 hkw0Var, String str, pkw0 pkw0Var) {
        super(hkw0Var, str);
        this.x = pkw0Var;
    }
}
