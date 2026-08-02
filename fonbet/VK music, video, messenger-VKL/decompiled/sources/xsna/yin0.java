package xsna;

import android.database.Cursor;
import java.util.Arrays;

/* compiled from: SupportSQLiteStatement.android.kt */
/* loaded from: classes.dex */
public abstract class yin0 implements qyg0 {
    public final sin0 b;
    public final String c;
    public boolean d;

    /* compiled from: SupportSQLiteStatement.android.kt */
    public static final class a extends yin0 {
        public int[] e;
        public long[] f;
        public double[] g;
        public String[] h;
        public byte[][] i;
        public Cursor j;

        /* compiled from: SupportSQLiteStatement.android.kt */
        /* renamed from: xsna.yin0$a$a, reason: collision with other inner class name */
        public static final class C4102a implements xin0 {
            public C4102a() {
            }

            @Override // xsna.xin0
            public final void b(win0 win0Var) {
                a aVar = a.this;
                int length = aVar.e.length;
                for (int i = 1; i < length; i++) {
                    int i2 = aVar.e[i];
                    if (i2 == 1) {
                        win0Var.bindLong(i, aVar.f[i]);
                    } else if (i2 == 2) {
                        win0Var.bindDouble(i, aVar.g[i]);
                    } else if (i2 == 3) {
                        win0Var.bindString(i, aVar.h[i]);
                    } else if (i2 == 4) {
                        win0Var.bindBlob(i, aVar.i[i]);
                    } else if (i2 == 5) {
                        win0Var.bindNull(i);
                    }
                }
            }

            @Override // xsna.xin0
            public final String m() {
                return a.this.c;
            }
        }

        public static void p(Cursor cursor, int i) {
            if (i < 0 || i >= cursor.getColumnCount()) {
                p7i.g(25, "column index out of range");
                throw null;
            }
        }

        @Override // xsna.qyg0
        public final void D3(int i, String str) {
            m();
            n(3, i);
            this.e[i] = 3;
            this.h[i] = str;
        }

        @Override // xsna.qyg0
        public final void bindLong(int i, long j) {
            m();
            n(1, i);
            this.e[i] = 1;
            this.f[i] = j;
        }

        @Override // xsna.qyg0
        public final void bindNull(int i) {
            m();
            n(5, i);
            this.e[i] = 5;
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            if (!this.d) {
                m();
                this.e = new int[0];
                this.f = new long[0];
                this.g = new double[0];
                this.h = new String[0];
                this.i = new byte[0][];
                reset();
            }
            this.d = true;
        }

        @Override // xsna.qyg0
        public final int getColumnCount() {
            m();
            o();
            Cursor cursor = this.j;
            if (cursor != null) {
                return cursor.getColumnCount();
            }
            return 0;
        }

        @Override // xsna.qyg0
        public final String getColumnName(int i) {
            m();
            o();
            Cursor cursor = this.j;
            if (cursor == null) {
                throw new IllegalStateException("Required value was null.");
            }
            p(cursor, i);
            return cursor.getColumnName(i);
        }

        @Override // xsna.qyg0
        public final long getLong(int i) {
            m();
            Cursor cursor = this.j;
            if (cursor != null) {
                p(cursor, i);
                return cursor.getLong(i);
            }
            p7i.g(21, "no row");
            throw null;
        }

        @Override // xsna.qyg0
        public final boolean isNull(int i) {
            m();
            Cursor cursor = this.j;
            if (cursor != null) {
                p(cursor, i);
                return cursor.isNull(i);
            }
            p7i.g(21, "no row");
            throw null;
        }

        @Override // xsna.qyg0
        public final String l2(int i) {
            m();
            Cursor cursor = this.j;
            if (cursor != null) {
                p(cursor, i);
                return cursor.getString(i);
            }
            p7i.g(21, "no row");
            throw null;
        }

        public final void n(int i, int i2) {
            int i3 = i2 + 1;
            int[] iArr = this.e;
            if (iArr.length < i3) {
                this.e = Arrays.copyOf(iArr, i3);
            }
            if (i == 1) {
                long[] jArr = this.f;
                if (jArr.length < i3) {
                    this.f = Arrays.copyOf(jArr, i3);
                    return;
                }
                return;
            }
            if (i == 2) {
                double[] dArr = this.g;
                if (dArr.length < i3) {
                    this.g = Arrays.copyOf(dArr, i3);
                    return;
                }
                return;
            }
            if (i == 3) {
                String[] strArr = this.h;
                if (strArr.length < i3) {
                    this.h = (String[]) Arrays.copyOf(strArr, i3);
                    return;
                }
                return;
            }
            if (i != 4) {
                return;
            }
            byte[][] bArr = this.i;
            if (bArr.length < i3) {
                this.i = (byte[][]) Arrays.copyOf(bArr, i3);
            }
        }

        public final void o() {
            if (this.j == null) {
                this.j = this.b.query(new C4102a());
            }
        }

        @Override // xsna.qyg0
        public final void reset() {
            m();
            Cursor cursor = this.j;
            if (cursor != null) {
                cursor.close();
            }
            this.j = null;
        }

        @Override // xsna.qyg0
        public final boolean step() {
            m();
            o();
            Cursor cursor = this.j;
            if (cursor != null) {
                return cursor.moveToNext();
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public yin0(sin0 sin0Var, String str) {
        this.b = sin0Var;
        this.c = str;
    }

    public final void m() {
        if (this.d) {
            p7i.g(21, "statement is closed");
            throw null;
        }
    }

    /* compiled from: SupportSQLiteStatement.android.kt */
    public static final class b extends yin0 {
        public final zin0 e;

        public b(sin0 sin0Var, String str) {
            super(sin0Var, str);
            this.e = sin0Var.compileStatement(str);
        }

        @Override // xsna.qyg0
        public final void D3(int i, String str) {
            m();
            this.e.bindString(i, str);
        }

        @Override // xsna.qyg0
        public final void bindLong(int i, long j) {
            m();
            this.e.bindLong(i, j);
        }

        @Override // xsna.qyg0
        public final void bindNull(int i) {
            m();
            this.e.bindNull(i);
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            this.e.close();
            this.d = true;
        }

        @Override // xsna.qyg0
        public final int getColumnCount() {
            m();
            return 0;
        }

        @Override // xsna.qyg0
        public final String getColumnName(int i) {
            m();
            p7i.g(21, "no row");
            throw null;
        }

        @Override // xsna.qyg0
        public final long getLong(int i) {
            m();
            p7i.g(21, "no row");
            throw null;
        }

        @Override // xsna.qyg0
        public final boolean isNull(int i) {
            m();
            p7i.g(21, "no row");
            throw null;
        }

        @Override // xsna.qyg0
        public final String l2(int i) {
            m();
            p7i.g(21, "no row");
            throw null;
        }

        @Override // xsna.qyg0
        public final boolean step() {
            m();
            this.e.execute();
            return false;
        }

        @Override // xsna.qyg0
        public final void reset() {
        }
    }
}
