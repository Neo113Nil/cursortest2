package ru.rustore.sdk.metrics.internal;

import android.database.sqlite.SQLiteDatabase;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;
import xsna.slv;

/* loaded from: classes11.dex */
public final class E extends Lambda implements gzs<SQLiteDatabase> {
    public final /* synthetic */ slv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(slv slvVar) {
        super(0);
        this.a = slvVar;
    }

    @Override // xsna.gzs
    public final SQLiteDatabase invoke() {
        SQLiteDatabase writableDatabase = this.a.a.getWritableDatabase();
        writableDatabase.enableWriteAheadLogging();
        return writableDatabase;
    }
}
