package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.internal.measurement.zzby;
import defpackage.tje;
import defpackage.y1a1;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzgj extends zzby {
    final /* synthetic */ c zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgj(c cVar, Context context, String str) {
        super(context, "google_app_measurement_local.db", null, 1);
        Objects.requireNonNull(cVar);
        this.zza = cVar;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() throws SQLiteException {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e) {
            throw e;
        } catch (SQLiteException unused) {
            g gVar = (g) this.zza.b;
            y1a1 y1a1Var = gVar.y;
            g.g(y1a1Var);
            y1a1Var.z.a("Opening the local database failed, dropping and recreating it");
            if (!gVar.a.getDatabasePath("google_app_measurement_local.db").delete()) {
                y1a1 y1a1Var2 = gVar.y;
                g.g(y1a1Var2);
                y1a1Var2.z.b("google_app_measurement_local.db", "Failed to delete corrupted local db file");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e2) {
                y1a1 y1a1Var3 = ((g) this.zza.b).y;
                g.g(y1a1Var3);
                y1a1Var3.z.b(e2, "Failed to open local database. Events will bypass local storage");
                return null;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        y1a1 y1a1Var = ((g) this.zza.b).y;
        g.g(y1a1Var);
        tje.m0(y1a1Var, sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        y1a1 y1a1Var = ((g) this.zza.b).y;
        g.g(y1a1Var);
        tje.l0(y1a1Var, sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", c.y);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
