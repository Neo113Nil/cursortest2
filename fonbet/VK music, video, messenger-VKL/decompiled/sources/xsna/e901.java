package xsna;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class e901 extends fa01 {
    public final x701 f;
    public boolean g;

    public e901(mb01 mb01Var) {
        super(mb01Var);
        this.f = new x701(this, ((mb01) this.b).b);
    }

    @Override // xsna.fa01
    public final boolean n() {
        return false;
    }

    @VisibleForTesting
    public final SQLiteDatabase o() throws SQLiteException {
        if (this.g) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.g = true;
        return null;
    }

    public final void p() {
        int delete;
        mb01 mb01Var = (mb01) this.b;
        k();
        try {
            SQLiteDatabase o = o();
            if (o == null || (delete = o.delete("messages", null, null)) <= 0) {
                return;
            }
            k901 k901Var = mb01Var.j;
            mb01.k(k901Var);
            k901Var.q.b(Integer.valueOf(delete), "Reset local analytics data. records");
        } catch (SQLiteException e) {
            k901 k901Var2 = mb01Var.j;
            mb01.k(k901Var2);
            k901Var2.i.b(e, "Error resetting local analytics data. error");
        }
    }

    public final void q() {
        int i;
        mb01 mb01Var = (mb01) this.b;
        k();
        if (!this.g && mb01Var.b.getDatabasePath("google_app_measurement_local.db").exists()) {
            int i2 = 5;
            while (i < 5) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        SQLiteDatabase o = o();
                        if (o == null) {
                            this.g = true;
                            return;
                        }
                        o.beginTransaction();
                        o.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                        o.setTransactionSuccessful();
                        o.endTransaction();
                        o.close();
                        return;
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
                        k901 k901Var = mb01Var.j;
                        mb01.k(k901Var);
                        k901Var.i.b(e, "Error deleting app launch break from local database");
                        this.g = true;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i2);
                    i2 += 20;
                    i = 0 == 0 ? i + 1 : 0;
                    sQLiteDatabase.close();
                } catch (SQLiteFullException e2) {
                    k901 k901Var2 = mb01Var.j;
                    mb01.k(k901Var2);
                    k901Var2.i.b(e2, "Error deleting app launch break from local database");
                    this.g = true;
                    if (0 == 0) {
                    }
                    sQLiteDatabase.close();
                }
            }
            k901 k901Var3 = mb01Var.j;
            mb01.k(k901Var3);
            k901Var3.l.a("Error deleting app launch break from local database in reasonable time");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x014b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x014b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean r(int i, byte[] bArr) {
        SQLiteDatabase sQLiteDatabase;
        boolean z;
        boolean z2;
        Cursor cursor;
        mb01 mb01Var = (mb01) this.b;
        k();
        boolean z3 = false;
        z3 = false;
        if (!this.g) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("type", Integer.valueOf(i));
            contentValues.put("entry", bArr);
            mb01Var.getClass();
            k901 k901Var = mb01Var.j;
            int i2 = 0;
            int i3 = 5;
            for (int i4 = 5; i2 < i4; i4 = 5) {
                Cursor cursor2 = null;
                cursor2 = null;
                r9 = null;
                Cursor cursor3 = null;
                r9 = null;
                SQLiteDatabase sQLiteDatabase2 = null;
                try {
                    sQLiteDatabase = o();
                    if (sQLiteDatabase == null) {
                        this.g = true;
                    } else {
                        try {
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
                                        cursor3 = cursor;
                                        SystemClock.sleep(i3);
                                        i3 += 20;
                                        if (cursor3 != null) {
                                        }
                                        if (sQLiteDatabase == null) {
                                        }
                                        i2++;
                                        z3 = z;
                                    } catch (SQLiteFullException e) {
                                        e = e;
                                        z = z3 ? 1 : 0;
                                        sQLiteDatabase2 = sQLiteDatabase;
                                        mb01.k(k901Var);
                                        k901Var.i.b(e, "Error writing entry; local database full");
                                        this.g = true;
                                        if (cursor != null) {
                                        }
                                        if (sQLiteDatabase2 == null) {
                                        }
                                        sQLiteDatabase2.close();
                                        i2++;
                                        z3 = z;
                                    } catch (SQLiteException e2) {
                                        e = e2;
                                        z = z3 ? 1 : 0;
                                        z2 = true;
                                        sQLiteDatabase2 = sQLiteDatabase;
                                        if (sQLiteDatabase2 != null) {
                                        }
                                        mb01.k(k901Var);
                                        k901Var.i.b(e, "Error writing entry to local database");
                                        this.g = z2;
                                        if (cursor != null) {
                                        }
                                        if (sQLiteDatabase2 == null) {
                                        }
                                        sQLiteDatabase2.close();
                                        i2++;
                                        z3 = z;
                                    }
                                }
                                if (j >= 100000) {
                                    mb01.k(k901Var);
                                    k901Var.i.a("Data loss, local db full");
                                    long j2 = 100001 - j;
                                    long delete = sQLiteDatabase.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(j2)});
                                    if (delete != j2) {
                                        mb01.k(k901Var);
                                        i901 i901Var = k901Var.i;
                                        z = z3 ? 1 : 0;
                                        try {
                                            try {
                                                z2 = true;
                                            } catch (SQLiteDatabaseLockedException unused2) {
                                                cursor3 = cursor;
                                                SystemClock.sleep(i3);
                                                i3 += 20;
                                                if (cursor3 != null) {
                                                    cursor3.close();
                                                }
                                                if (sQLiteDatabase == null) {
                                                    sQLiteDatabase.close();
                                                }
                                                i2++;
                                                z3 = z;
                                            }
                                        } catch (SQLiteFullException e3) {
                                            e = e3;
                                            sQLiteDatabase2 = sQLiteDatabase;
                                            mb01.k(k901Var);
                                            k901Var.i.b(e, "Error writing entry; local database full");
                                            this.g = true;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (sQLiteDatabase2 == null) {
                                                i2++;
                                                z3 = z;
                                            }
                                            sQLiteDatabase2.close();
                                            i2++;
                                            z3 = z;
                                        } catch (SQLiteException e4) {
                                            e = e4;
                                            z2 = true;
                                            sQLiteDatabase2 = sQLiteDatabase;
                                            if (sQLiteDatabase2 != null) {
                                                try {
                                                    if (sQLiteDatabase2.inTransaction()) {
                                                        sQLiteDatabase2.endTransaction();
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    sQLiteDatabase = sQLiteDatabase2;
                                                    cursor2 = cursor;
                                                    if (cursor2 != null) {
                                                    }
                                                    if (sQLiteDatabase != null) {
                                                    }
                                                    throw th;
                                                }
                                            }
                                            mb01.k(k901Var);
                                            k901Var.i.b(e, "Error writing entry to local database");
                                            this.g = z2;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (sQLiteDatabase2 == null) {
                                                i2++;
                                                z3 = z;
                                            }
                                            sQLiteDatabase2.close();
                                            i2++;
                                            z3 = z;
                                        }
                                        try {
                                            i901Var.d("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j2), Long.valueOf(delete), Long.valueOf(j2 - delete));
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
                                            sQLiteDatabase2 = sQLiteDatabase;
                                            mb01.k(k901Var);
                                            k901Var.i.b(e, "Error writing entry; local database full");
                                            this.g = true;
                                            if (cursor != null) {
                                            }
                                            if (sQLiteDatabase2 == null) {
                                            }
                                            sQLiteDatabase2.close();
                                            i2++;
                                            z3 = z;
                                        } catch (SQLiteException e6) {
                                            e = e6;
                                            sQLiteDatabase2 = sQLiteDatabase;
                                            if (sQLiteDatabase2 != null) {
                                            }
                                            mb01.k(k901Var);
                                            k901Var.i.b(e, "Error writing entry to local database");
                                            this.g = z2;
                                            if (cursor != null) {
                                            }
                                            if (sQLiteDatabase2 == null) {
                                            }
                                            sQLiteDatabase2.close();
                                            i2++;
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
                            } catch (Throwable th3) {
                                th = th3;
                                if (cursor2 != null) {
                                }
                                if (sQLiteDatabase != null) {
                                }
                                throw th;
                            }
                        } catch (SQLiteDatabaseLockedException unused3) {
                            z = z3 ? 1 : 0;
                        } catch (SQLiteFullException e7) {
                            e = e7;
                            z = z3 ? 1 : 0;
                            cursor = null;
                        } catch (SQLiteException e8) {
                            e = e8;
                            z = z3 ? 1 : 0;
                            z2 = true;
                            cursor = null;
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused4) {
                    z = z3 ? 1 : 0;
                    sQLiteDatabase = null;
                } catch (SQLiteFullException e9) {
                    e = e9;
                    z = z3 ? 1 : 0;
                    cursor = null;
                } catch (SQLiteException e10) {
                    e = e10;
                    z = z3 ? 1 : 0;
                    z2 = true;
                    cursor = null;
                } catch (Throwable th4) {
                    th = th4;
                    sQLiteDatabase = null;
                }
            }
            boolean z4 = z3 ? 1 : 0;
            mb01.k(k901Var);
            k901Var.q.a("Failed to write entry to local database");
            return z4;
        }
        return z3;
    }
}
