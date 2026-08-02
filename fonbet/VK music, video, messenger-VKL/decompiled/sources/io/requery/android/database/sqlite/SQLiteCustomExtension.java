package io.requery.android.database.sqlite;

import java.util.Set;
import java.util.function.Supplier;

/* loaded from: classes8.dex */
public final class SQLiteCustomExtension {
    public final String entryPoint;
    public final String name;
    public final Supplier<Set<String>> pathsProvider;

    public SQLiteCustomExtension(String str, Supplier<Set<String>> supplier, String str2) {
        if (supplier == null) {
            throw new IllegalArgumentException("null paths provider");
        }
        this.name = str;
        this.pathsProvider = supplier;
        this.entryPoint = str2;
    }
}
