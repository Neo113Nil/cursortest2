package com.yandex.div.storage.database;

import android.database.sqlite.SQLiteStatement;

/* compiled from: SqlCompiler.kt */
/* loaded from: classes7.dex */
public interface SqlCompiler {
    ReadState compileQuery(String str, String... strArr);

    SQLiteStatement compileStatement(String str);
}
