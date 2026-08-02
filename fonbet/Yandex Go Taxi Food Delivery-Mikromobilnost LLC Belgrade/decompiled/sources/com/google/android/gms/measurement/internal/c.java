package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;
import defpackage.gw91;
import defpackage.j691;
import defpackage.l1a1;
import defpackage.nw91;
import defpackage.vw91;
import defpackage.y1a1;
import ru.yandex.common.startup.StartupRequest;

/* loaded from: classes.dex */
public final class c extends vw91 {
    public static final String[] y = {StartupRequest.PARAM_APP_VERSION, "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};
    public final zzgj w;
    public boolean x;

    public c(g gVar) {
        super(gVar);
        g gVar2 = (g) this.b;
        Context context = gVar2.a;
        gVar2.getClass();
        this.w = new zzgj(this, context, "google_app_measurement_local.db");
    }

    @Override // defpackage.vw91
    public final boolean Jg() {
        return false;
    }

    public final void Kg() {
        int delete;
        g gVar = (g) this.b;
        Gg();
        try {
            SQLiteDatabase Mg = Mg();
            if (Mg == null || (delete = Mg.delete("messages", null, null)) <= 0) {
                return;
            }
            y1a1 y1a1Var = gVar.y;
            g.g(y1a1Var);
            y1a1Var.H.b(Integer.valueOf(delete), "Reset local analytics data. records");
        } catch (SQLiteException e) {
            y1a1 y1a1Var2 = gVar.y;
            g.g(y1a1Var2);
            y1a1Var2.z.b(e, "Error resetting local analytics data. error");
        }
    }

    public final boolean Lg() {
        g gVar = (g) this.b;
        Gg();
        if (!this.x && gVar.a.getDatabasePath("google_app_measurement_local.db").exists()) {
            int i = 5;
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    y1a1 y1a1Var = gVar.y;
                    g.g(y1a1Var);
                    y1a1Var.C.a("Error deleting app launch break from local database in reasonable time");
                    break;
                }
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        SQLiteDatabase Mg = Mg();
                        if (Mg != null) {
                            Mg.beginTransaction();
                            Mg.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                            Mg.setTransactionSuccessful();
                            Mg.endTransaction();
                            Mg.close();
                            return true;
                        }
                        this.x = true;
                    } catch (SQLiteException e) {
                        if (0 != 0) {
                            try {
                                if (sQLiteDatabase.inTransaction()) {
                                    sQLiteDatabase.endTransaction();
                                }
                            } catch (Throwable th) {
                                if (0 != 0) {
                                    sQLiteDatabase.close();
                                }
                                throw th;
                            }
                        }
                        y1a1 y1a1Var2 = gVar.y;
                        g.g(y1a1Var2);
                        y1a1Var2.z.b(e, "Error deleting app launch break from local database");
                        this.x = true;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i);
                    i += 20;
                    if (0 == 0) {
                    }
                    sQLiteDatabase.close();
                } catch (SQLiteFullException e2) {
                    y1a1 y1a1Var3 = gVar.y;
                    g.g(y1a1Var3);
                    y1a1Var3.z.b(e2, "Error deleting app launch break from local database");
                    this.x = true;
                    if (0 == 0) {
                    }
                    sQLiteDatabase.close();
                }
                i2++;
            }
        }
        return false;
    }

    public final SQLiteDatabase Mg() {
        if (this.x) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.w.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.x = true;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0120 A[Catch: all -> 0x0154, TRY_ENTER, TryCatch #10 {all -> 0x0154, blocks: (B:95:0x0088, B:97:0x008e, B:65:0x00ae, B:67:0x00cf, B:70:0x00d8, B:73:0x00de, B:74:0x00f8, B:42:0x0120, B:44:0x0126, B:45:0x0129, B:33:0x015b, B:21:0x0144), top: B:94:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Ng(int i, byte[] bArr) {
        SQLiteDatabase sQLiteDatabase;
        boolean z;
        boolean z2;
        Cursor cursor;
        g gVar = (g) this.b;
        Gg();
        boolean z3 = false;
        z3 = false;
        if (!this.x) {
            j691 j691Var = gVar.w;
            y1a1 y1a1Var = gVar.y;
            gw91 gw91Var = nw91.b1;
            Cursor cursor2 = null;
            zzr Kg = j691Var.Qg(null, gw91Var) ? gVar.l().Kg(null) : null;
            ContentValues contentValues = new ContentValues();
            contentValues.put("type", Integer.valueOf(i));
            contentValues.put("entry", bArr);
            if (gVar.w.Qg(null, gw91Var) && Kg != null) {
                contentValues.put(StartupRequest.PARAM_APP_VERSION, Kg.zzc);
                contentValues.put("app_version_int", Long.valueOf(Kg.zzj));
            }
            int i2 = 5;
            int i3 = 0;
            for (int i4 = 5; i3 < i4; i4 = 5) {
                try {
                    sQLiteDatabase = Mg();
                    if (sQLiteDatabase == null) {
                        this.x = true;
                    } else {
                        try {
                            sQLiteDatabase.beginTransaction();
                            cursor = sQLiteDatabase.rawQuery("select count(1) from messages", null);
                            long j = 0;
                            if (cursor != null) {
                                try {
                                    try {
                                        if (cursor.moveToFirst()) {
                                            j = cursor.getLong(z3 ? 1 : 0);
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        cursor2 = cursor;
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.close();
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteDatabaseLockedException unused) {
                                    z = z3 ? 1 : 0;
                                    SystemClock.sleep(i2);
                                    i2 += 20;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i3++;
                                    z3 = z;
                                } catch (SQLiteFullException e) {
                                    e = e;
                                    z = z3 ? 1 : 0;
                                    g.g(y1a1Var);
                                    y1a1Var.z.b(e, "Error writing entry; local database full");
                                    this.x = true;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i3++;
                                    z3 = z;
                                } catch (SQLiteException e2) {
                                    e = e2;
                                    z = z3 ? 1 : 0;
                                    z2 = true;
                                    if (sQLiteDatabase != null) {
                                    }
                                    g.g(y1a1Var);
                                    y1a1Var.z.b(e, "Error writing entry to local database");
                                    this.x = z2;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i3++;
                                    z3 = z;
                                }
                            }
                            if (j >= 100000) {
                                g.g(y1a1Var);
                                y1a1Var.z.a("Data loss, local db full");
                                long j2 = 100001 - j;
                                long delete = sQLiteDatabase.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(j2)});
                                if (delete != j2) {
                                    g.g(y1a1Var);
                                    l1a1 l1a1Var = y1a1Var.z;
                                    z = z3 ? 1 : 0;
                                    try {
                                        try {
                                            z2 = true;
                                        } catch (SQLiteDatabaseLockedException unused2) {
                                            SystemClock.sleep(i2);
                                            i2 += 20;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (sQLiteDatabase == null) {
                                                i3++;
                                                z3 = z;
                                            }
                                            sQLiteDatabase.close();
                                            i3++;
                                            z3 = z;
                                        }
                                    } catch (SQLiteFullException e3) {
                                        e = e3;
                                        g.g(y1a1Var);
                                        y1a1Var.z.b(e, "Error writing entry; local database full");
                                        this.x = true;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (sQLiteDatabase == null) {
                                            i3++;
                                            z3 = z;
                                        }
                                        sQLiteDatabase.close();
                                        i3++;
                                        z3 = z;
                                    } catch (SQLiteException e4) {
                                        e = e4;
                                        z2 = true;
                                        if (sQLiteDatabase != null && sQLiteDatabase.inTransaction()) {
                                            sQLiteDatabase.endTransaction();
                                        }
                                        g.g(y1a1Var);
                                        y1a1Var.z.b(e, "Error writing entry to local database");
                                        this.x = z2;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (sQLiteDatabase == null) {
                                            i3++;
                                            z3 = z;
                                        }
                                        sQLiteDatabase.close();
                                        i3++;
                                        z3 = z;
                                    }
                                    try {
                                        l1a1Var.d("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j2), Long.valueOf(delete), Long.valueOf(j2 - delete));
                                        sQLiteDatabase.insertOrThrow("messages", null, contentValues);
                                        sQLiteDatabase.setTransactionSuccessful();
                                        sQLiteDatabase.endTransaction();
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        sQLiteDatabase.close();
                                        return z2;
                                    } catch (SQLiteFullException e5) {
                                        e = e5;
                                        g.g(y1a1Var);
                                        y1a1Var.z.b(e, "Error writing entry; local database full");
                                        this.x = true;
                                        if (cursor != null) {
                                        }
                                        if (sQLiteDatabase == null) {
                                        }
                                        sQLiteDatabase.close();
                                        i3++;
                                        z3 = z;
                                    } catch (SQLiteException e6) {
                                        e = e6;
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.endTransaction();
                                        }
                                        g.g(y1a1Var);
                                        y1a1Var.z.b(e, "Error writing entry to local database");
                                        this.x = z2;
                                        if (cursor != null) {
                                        }
                                        if (sQLiteDatabase == null) {
                                        }
                                        sQLiteDatabase.close();
                                        i3++;
                                        z3 = z;
                                    }
                                }
                            }
                            z = z3 ? 1 : 0;
                            z2 = true;
                            sQLiteDatabase.insertOrThrow("messages", null, contentValues);
                            sQLiteDatabase.setTransactionSuccessful();
                            sQLiteDatabase.endTransaction();
                            if (cursor != null) {
                            }
                            sQLiteDatabase.close();
                            return z2;
                        } catch (SQLiteDatabaseLockedException unused3) {
                            z = z3 ? 1 : 0;
                            cursor = null;
                        } catch (SQLiteFullException e7) {
                            e = e7;
                            z = z3 ? 1 : 0;
                            cursor = null;
                        } catch (SQLiteException e8) {
                            e = e8;
                            z = z3 ? 1 : 0;
                            z2 = true;
                            cursor = null;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused4) {
                    z = z3 ? 1 : 0;
                    sQLiteDatabase = null;
                    cursor = null;
                } catch (SQLiteFullException e9) {
                    e = e9;
                    z = z3 ? 1 : 0;
                    sQLiteDatabase = null;
                    cursor = null;
                } catch (SQLiteException e10) {
                    e = e10;
                    z = z3 ? 1 : 0;
                    z2 = true;
                    sQLiteDatabase = null;
                    cursor = null;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteDatabase = null;
                }
            }
            boolean z4 = z3 ? 1 : 0;
            g.g(y1a1Var);
            y1a1Var.H.a("Failed to write entry to local database");
            return z4;
        }
        return z3;
    }
}
