package com.yandex.div.storage.database;

import android.database.SQLException;

/* compiled from: StorageStatement.kt */
/* loaded from: classes7.dex */
public interface StorageStatement {
    void execute(SqlCompiler sqlCompiler) throws SQLException;
}
