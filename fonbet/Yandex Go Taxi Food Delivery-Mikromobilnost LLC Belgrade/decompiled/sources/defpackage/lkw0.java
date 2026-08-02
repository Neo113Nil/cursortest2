package defpackage;

import java.io.Closeable;

/* loaded from: classes.dex */
public interface lkw0 extends Closeable {
    String getDatabaseName();

    hkw0 getReadableDatabase();

    hkw0 getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean z);
}
