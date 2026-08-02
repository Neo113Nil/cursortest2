package xsna;

import android.database.sqlite.SQLiteProgram;

/* compiled from: FrameworkSQLiteProgram.android.kt */
/* loaded from: classes.dex */
public class rgs implements win0 {
    public final SQLiteProgram b;

    public rgs(SQLiteProgram sQLiteProgram) {
        this.b = sQLiteProgram;
    }

    @Override // xsna.win0
    public final void bindBlob(int i, byte[] bArr) {
        this.b.bindBlob(i, bArr);
    }

    @Override // xsna.win0
    public final void bindDouble(int i, double d) {
        this.b.bindDouble(i, d);
    }

    @Override // xsna.win0
    public final void bindLong(int i, long j) {
        this.b.bindLong(i, j);
    }

    @Override // xsna.win0
    public final void bindNull(int i) {
        this.b.bindNull(i);
    }

    @Override // xsna.win0
    public final void bindString(int i, String str) {
        this.b.bindString(i, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }
}
