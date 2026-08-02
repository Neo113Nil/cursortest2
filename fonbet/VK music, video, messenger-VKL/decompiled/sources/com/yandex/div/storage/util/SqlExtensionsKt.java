package com.yandex.div.storage.util;

import com.yandex.div.storage.database.DatabaseOpenHelper;
import java.io.Closeable;
import java.io.IOException;

/* compiled from: SqlExtensions.kt */
/* loaded from: classes7.dex */
public final class SqlExtensionsKt {
    public static final void closeSilently(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public static final void endTransactionSilently(DatabaseOpenHelper.Database database) {
        try {
            database.endTransaction();
        } catch (IllegalStateException unused) {
        }
    }
}
