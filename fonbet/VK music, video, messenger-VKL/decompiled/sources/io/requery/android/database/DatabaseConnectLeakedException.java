package io.requery.android.database;

import xsna.zr;

/* compiled from: DatabaseConnectLeakedException.kt */
/* loaded from: classes8.dex */
public final class DatabaseConnectLeakedException extends IllegalStateException {
    public DatabaseConnectLeakedException(String str) {
        super(zr.a("A SQLiteConnection object for database '", str, "' was leaked!"));
    }
}
