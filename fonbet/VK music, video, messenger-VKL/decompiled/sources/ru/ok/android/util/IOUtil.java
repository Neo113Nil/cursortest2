package ru.ok.android.util;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* compiled from: IOUtil.kt */
/* loaded from: classes9.dex */
public final class IOUtil {
    public static final IOUtil INSTANCE = new IOUtil();

    private IOUtil() {
    }

    public final void close(Closeable... closeableArr) {
        for (Closeable closeable : closeableArr) {
            close(closeable);
        }
    }

    public final void flush(Flushable... flushableArr) {
        for (Flushable flushable : flushableArr) {
            flush(flushable);
        }
    }

    public final void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public final void flush(Flushable flushable) {
        if (flushable != null) {
            try {
                flushable.flush();
            } catch (IOException unused) {
            }
        }
    }
}
