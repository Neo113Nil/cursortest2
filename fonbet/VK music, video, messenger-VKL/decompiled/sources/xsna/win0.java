package xsna;

import java.io.Closeable;

/* compiled from: SupportSQLiteProgram.android.kt */
/* loaded from: classes.dex */
public interface win0 extends Closeable {
    void bindBlob(int i, byte[] bArr);

    void bindDouble(int i, double d);

    void bindLong(int i, long j);

    void bindNull(int i);

    void bindString(int i, String str);
}
