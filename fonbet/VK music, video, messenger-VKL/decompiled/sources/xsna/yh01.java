package xsna;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzkw;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
@VisibleForTesting
/* loaded from: classes13.dex */
public final class yh01 extends fa01 {
    public final xh01 f;
    public v701 g;
    public volatile Boolean h;
    public final pg01 i;
    public final gj01 j;
    public final ArrayList k;
    public final rg01 l;

    public yh01(mb01 mb01Var) {
        super(mb01Var);
        this.k = new ArrayList();
        this.j = new gj01(mb01Var.o);
        this.f = new xh01(this);
        this.i = new pg01(this, mb01Var);
        this.l = new rg01(this, mb01Var);
    }

    public static void y(yh01 yh01Var, ComponentName componentName) {
        yh01Var.k();
        if (yh01Var.g != null) {
            yh01Var.g = null;
            k901 k901Var = ((mb01) yh01Var.b).j;
            mb01.k(k901Var);
            k901Var.q.b(componentName, "Disconnected from device MeasurementService");
            yh01Var.k();
            yh01Var.z();
        }
    }

    public final void A() {
        k();
        l();
        xh01 xh01Var = this.f;
        if (xh01Var.c != null && (xh01Var.c.isConnected() || xh01Var.c.isConnecting())) {
            xh01Var.c.disconnect();
        }
        xh01Var.c = null;
        try {
            o4j.b().c(((mb01) this.b).b, this.f);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.g = null;
    }

    public final void B(AtomicReference atomicReference) {
        k();
        l();
        w(new gok(this, atomicReference, t(false), 2));
    }

    @Override // xsna.fa01
    public final boolean n() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0357 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0357 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0357 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x01f9 A[Catch: all -> 0x014e, SQLiteException -> 0x01db, SQLiteFullException -> 0x01de, SQLiteDatabaseLockedException -> 0x0295, TryCatch #23 {all -> 0x014e, blocks: (B:100:0x0143, B:102:0x0148, B:155:0x0174, B:156:0x0177, B:153:0x0170, B:163:0x018d, B:166:0x01a1, B:168:0x01b9, B:171:0x01bd, B:172:0x01c0, B:174:0x01b3, B:176:0x01c3, B:184:0x01d7, B:186:0x01f9, B:196:0x01fd, B:197:0x0200, B:194:0x01f3, B:206:0x0205, B:208:0x0212, B:232:0x024b, B:234:0x0268, B:235:0x0274), top: B:99:0x0143 }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x021e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x038c  */
    @VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(v701 v701Var, AbstractSafeParcelable abstractSafeParcelable, com.google.android.gms.measurement.internal.zzq zzqVar) {
        ArrayList arrayList;
        int i;
        mb01 mb01Var;
        int i2;
        SQLiteDatabase sQLiteDatabase;
        int i3;
        int i4;
        Cursor cursor;
        Cursor cursor2;
        Cursor cursor3;
        Cursor cursor4;
        SQLiteDatabase sQLiteDatabase2;
        Cursor cursor5;
        long j;
        String str;
        String[] strArr;
        Cursor cursor6;
        Parcel obtain;
        zzac zzacVar;
        zzkw zzkwVar;
        int i5;
        int size;
        int i6;
        k();
        l();
        mb01 mb01Var2 = (mb01) this.b;
        mb01Var2.getClass();
        mb01Var2.getClass();
        k901 k901Var = mb01Var2.j;
        int i7 = 100;
        int i8 = 100;
        int i9 = 0;
        while (i9 < 1001 && i8 == i7) {
            ArrayList arrayList2 = new ArrayList();
            e901 p = mb01Var2.p();
            mb01 mb01Var3 = (mb01) p.b;
            p.k();
            if (p.g) {
                mb01Var = mb01Var2;
                i = i7;
            } else {
                arrayList = new ArrayList();
                i = i7;
                if (((mb01) p.b).b.getDatabasePath("google_app_measurement_local.db").exists()) {
                    int i10 = 5;
                    int i11 = 0;
                    for (int i12 = 5; i11 < i12; i12 = 5) {
                        try {
                            SQLiteDatabase o = p.o();
                            if (o == null) {
                                try {
                                    try {
                                        p.g = true;
                                        mb01Var = mb01Var2;
                                    } catch (Throwable th) {
                                        th = th;
                                        sQLiteDatabase2 = o;
                                        sQLiteDatabase = sQLiteDatabase2;
                                        cursor4 = null;
                                        if (cursor4 != null) {
                                        }
                                        if (sQLiteDatabase != null) {
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteDatabaseLockedException unused) {
                                    mb01Var = mb01Var2;
                                    i4 = i9;
                                    sQLiteDatabase2 = o;
                                    i3 = i11;
                                    sQLiteDatabase = sQLiteDatabase2;
                                    cursor3 = null;
                                    SystemClock.sleep(i10);
                                    i10 += 20;
                                    if (cursor3 != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i11 = i3 + 1;
                                    i9 = i4;
                                    mb01Var2 = mb01Var;
                                } catch (SQLiteFullException e) {
                                    e = e;
                                    mb01Var = mb01Var2;
                                    i4 = i9;
                                    sQLiteDatabase2 = o;
                                    i3 = i11;
                                    sQLiteDatabase = sQLiteDatabase2;
                                    cursor2 = null;
                                    k901 k901Var2 = mb01Var3.j;
                                    mb01.k(k901Var2);
                                    k901Var2.i.b(e, "Error reading entries from local database");
                                    p.g = true;
                                    if (cursor2 != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i11 = i3 + 1;
                                    i9 = i4;
                                    mb01Var2 = mb01Var;
                                } catch (SQLiteException e2) {
                                    e = e2;
                                    mb01Var = mb01Var2;
                                    i4 = i9;
                                    sQLiteDatabase2 = o;
                                    i3 = i11;
                                    sQLiteDatabase = sQLiteDatabase2;
                                    cursor = null;
                                    if (sQLiteDatabase != null) {
                                    }
                                    k901 k901Var3 = mb01Var3.j;
                                    mb01.k(k901Var3);
                                    k901Var3.i.b(e, "Error reading entries from local database");
                                    p.g = true;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i11 = i3 + 1;
                                    i9 = i4;
                                    mb01Var2 = mb01Var;
                                }
                            } else {
                                o.beginTransaction();
                                try {
                                    cursor5 = o.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
                                    try {
                                        long j2 = -1;
                                        if (cursor5.moveToFirst()) {
                                            mb01Var = mb01Var2;
                                            try {
                                                j = cursor5.getLong(0);
                                                try {
                                                    cursor5.close();
                                                } catch (SQLiteDatabaseLockedException unused2) {
                                                    i4 = i9;
                                                    sQLiteDatabase2 = o;
                                                    i3 = i11;
                                                    sQLiteDatabase = sQLiteDatabase2;
                                                    cursor3 = null;
                                                    SystemClock.sleep(i10);
                                                    i10 += 20;
                                                    if (cursor3 != null) {
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                    }
                                                    sQLiteDatabase.close();
                                                    i11 = i3 + 1;
                                                    i9 = i4;
                                                    mb01Var2 = mb01Var;
                                                } catch (SQLiteFullException e3) {
                                                    e = e3;
                                                    i4 = i9;
                                                    sQLiteDatabase2 = o;
                                                    i3 = i11;
                                                    sQLiteDatabase = sQLiteDatabase2;
                                                    cursor2 = null;
                                                    k901 k901Var22 = mb01Var3.j;
                                                    mb01.k(k901Var22);
                                                    k901Var22.i.b(e, "Error reading entries from local database");
                                                    p.g = true;
                                                    if (cursor2 != null) {
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                    }
                                                    sQLiteDatabase.close();
                                                    i11 = i3 + 1;
                                                    i9 = i4;
                                                    mb01Var2 = mb01Var;
                                                } catch (SQLiteException e4) {
                                                    e = e4;
                                                    i4 = i9;
                                                    sQLiteDatabase2 = o;
                                                    i3 = i11;
                                                    sQLiteDatabase = sQLiteDatabase2;
                                                    cursor = null;
                                                    if (sQLiteDatabase != null) {
                                                    }
                                                    k901 k901Var32 = mb01Var3.j;
                                                    mb01.k(k901Var32);
                                                    k901Var32.i.b(e, "Error reading entries from local database");
                                                    p.g = true;
                                                    if (cursor != null) {
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                    }
                                                    sQLiteDatabase.close();
                                                    i11 = i3 + 1;
                                                    i9 = i4;
                                                    mb01Var2 = mb01Var;
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                i4 = i9;
                                                sQLiteDatabase2 = o;
                                                i3 = i11;
                                                if (cursor5 != null) {
                                                    try {
                                                        cursor5.close();
                                                    } catch (SQLiteDatabaseLockedException unused3) {
                                                        sQLiteDatabase = sQLiteDatabase2;
                                                        cursor3 = null;
                                                        SystemClock.sleep(i10);
                                                        i10 += 20;
                                                        if (cursor3 != null) {
                                                        }
                                                        if (sQLiteDatabase == null) {
                                                        }
                                                        sQLiteDatabase.close();
                                                        i11 = i3 + 1;
                                                        i9 = i4;
                                                        mb01Var2 = mb01Var;
                                                    } catch (SQLiteFullException e5) {
                                                        e = e5;
                                                        sQLiteDatabase = sQLiteDatabase2;
                                                        cursor2 = null;
                                                        k901 k901Var222 = mb01Var3.j;
                                                        mb01.k(k901Var222);
                                                        k901Var222.i.b(e, "Error reading entries from local database");
                                                        p.g = true;
                                                        if (cursor2 != null) {
                                                        }
                                                        if (sQLiteDatabase == null) {
                                                        }
                                                        sQLiteDatabase.close();
                                                        i11 = i3 + 1;
                                                        i9 = i4;
                                                        mb01Var2 = mb01Var;
                                                    } catch (SQLiteException e6) {
                                                        e = e6;
                                                        sQLiteDatabase = sQLiteDatabase2;
                                                        cursor = null;
                                                        if (sQLiteDatabase != null) {
                                                        }
                                                        k901 k901Var322 = mb01Var3.j;
                                                        mb01.k(k901Var322);
                                                        k901Var322.i.b(e, "Error reading entries from local database");
                                                        p.g = true;
                                                        if (cursor != null) {
                                                        }
                                                        if (sQLiteDatabase == null) {
                                                        }
                                                        sQLiteDatabase.close();
                                                        i11 = i3 + 1;
                                                        i9 = i4;
                                                        mb01Var2 = mb01Var;
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        sQLiteDatabase = sQLiteDatabase2;
                                                        cursor4 = null;
                                                        if (cursor4 != null) {
                                                        }
                                                        if (sQLiteDatabase != null) {
                                                        }
                                                        throw th;
                                                    }
                                                }
                                                throw th;
                                            }
                                        } else {
                                            mb01Var = mb01Var2;
                                            cursor5.close();
                                            j = -1;
                                        }
                                        if (j != -1) {
                                            str = "rowid<?";
                                            strArr = new String[]{String.valueOf(j)};
                                        } else {
                                            str = null;
                                            strArr = null;
                                        }
                                        try {
                                            Cursor query = o.query("messages", new String[]{"rowid", "type", "entry"}, str, strArr, null, null, "rowid asc", Integer.toString(i));
                                            sQLiteDatabase = o;
                                            while (query.moveToNext()) {
                                                try {
                                                    try {
                                                        i3 = i11;
                                                        try {
                                                            j2 = query.getLong(0);
                                                            try {
                                                                int i13 = query.getInt(1);
                                                                i4 = i9;
                                                                try {
                                                                    byte[] blob = query.getBlob(2);
                                                                    if (i13 == 0) {
                                                                        obtain = Parcel.obtain();
                                                                        try {
                                                                            cursor6 = query;
                                                                            try {
                                                                                try {
                                                                                    obtain.unmarshall(blob, 0, blob.length);
                                                                                    obtain.setDataPosition(0);
                                                                                    zzaw createFromParcel = zzaw.CREATOR.createFromParcel(obtain);
                                                                                    try {
                                                                                        try {
                                                                                            if (createFromParcel != null) {
                                                                                                arrayList.add(createFromParcel);
                                                                                            }
                                                                                        } catch (Throwable th4) {
                                                                                            th = th4;
                                                                                            cursor4 = cursor6;
                                                                                            if (cursor4 != null) {
                                                                                            }
                                                                                            if (sQLiteDatabase != null) {
                                                                                            }
                                                                                            throw th;
                                                                                        }
                                                                                    } catch (SQLiteDatabaseLockedException unused4) {
                                                                                        cursor3 = cursor6;
                                                                                        SystemClock.sleep(i10);
                                                                                        i10 += 20;
                                                                                        if (cursor3 != null) {
                                                                                        }
                                                                                        if (sQLiteDatabase == null) {
                                                                                        }
                                                                                        sQLiteDatabase.close();
                                                                                        i11 = i3 + 1;
                                                                                        i9 = i4;
                                                                                        mb01Var2 = mb01Var;
                                                                                    } catch (SQLiteFullException e7) {
                                                                                        e = e7;
                                                                                        cursor2 = cursor6;
                                                                                        k901 k901Var2222 = mb01Var3.j;
                                                                                        mb01.k(k901Var2222);
                                                                                        k901Var2222.i.b(e, "Error reading entries from local database");
                                                                                        p.g = true;
                                                                                        if (cursor2 != null) {
                                                                                        }
                                                                                        if (sQLiteDatabase == null) {
                                                                                        }
                                                                                        sQLiteDatabase.close();
                                                                                        i11 = i3 + 1;
                                                                                        i9 = i4;
                                                                                        mb01Var2 = mb01Var;
                                                                                    } catch (SQLiteException e8) {
                                                                                        e = e8;
                                                                                        cursor = cursor6;
                                                                                        if (sQLiteDatabase != null) {
                                                                                        }
                                                                                        k901 k901Var3222 = mb01Var3.j;
                                                                                        mb01.k(k901Var3222);
                                                                                        k901Var3222.i.b(e, "Error reading entries from local database");
                                                                                        p.g = true;
                                                                                        if (cursor != null) {
                                                                                        }
                                                                                        if (sQLiteDatabase == null) {
                                                                                        }
                                                                                        sQLiteDatabase.close();
                                                                                        i11 = i3 + 1;
                                                                                        i9 = i4;
                                                                                        mb01Var2 = mb01Var;
                                                                                    }
                                                                                } catch (SafeParcelReader.ParseException unused5) {
                                                                                    k901 k901Var4 = mb01Var3.j;
                                                                                    mb01.k(k901Var4);
                                                                                    k901Var4.i.a("Failed to load event from local database");
                                                                                    obtain.recycle();
                                                                                    i11 = i3;
                                                                                    i9 = i4;
                                                                                    query = cursor6;
                                                                                }
                                                                            } catch (Throwable th5) {
                                                                                th = th5;
                                                                                throw th;
                                                                            }
                                                                        } catch (SafeParcelReader.ParseException unused6) {
                                                                            cursor6 = query;
                                                                        } catch (Throwable th6) {
                                                                            th = th6;
                                                                        }
                                                                    } else {
                                                                        cursor6 = query;
                                                                        if (i13 == 1) {
                                                                            obtain = Parcel.obtain();
                                                                            try {
                                                                                try {
                                                                                    obtain.unmarshall(blob, 0, blob.length);
                                                                                    obtain.setDataPosition(0);
                                                                                    zzkwVar = zzkw.CREATOR.createFromParcel(obtain);
                                                                                } finally {
                                                                                    obtain.recycle();
                                                                                }
                                                                            } catch (SafeParcelReader.ParseException unused7) {
                                                                                k901 k901Var5 = mb01Var3.j;
                                                                                mb01.k(k901Var5);
                                                                                k901Var5.i.a("Failed to load user property from local database");
                                                                                obtain.recycle();
                                                                                zzkwVar = null;
                                                                            }
                                                                            if (zzkwVar != null) {
                                                                                arrayList.add(zzkwVar);
                                                                            }
                                                                        } else {
                                                                            if (i13 == 2) {
                                                                                obtain = Parcel.obtain();
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            obtain.unmarshall(blob, 0, blob.length);
                                                                                            obtain.setDataPosition(0);
                                                                                            zzacVar = zzac.CREATOR.createFromParcel(obtain);
                                                                                        } catch (SafeParcelReader.ParseException unused8) {
                                                                                            k901 k901Var6 = mb01Var3.j;
                                                                                            mb01.k(k901Var6);
                                                                                            k901Var6.i.a("Failed to load conditional user property from local database");
                                                                                            obtain.recycle();
                                                                                            zzacVar = null;
                                                                                            if (zzacVar == null) {
                                                                                            }
                                                                                            i11 = i3;
                                                                                            i9 = i4;
                                                                                            query = cursor6;
                                                                                        }
                                                                                    } catch (Throwable th7) {
                                                                                        th = th7;
                                                                                        throw th;
                                                                                    }
                                                                                } catch (SafeParcelReader.ParseException unused9) {
                                                                                } catch (Throwable th8) {
                                                                                    th = th8;
                                                                                }
                                                                                try {
                                                                                    if (zzacVar == null) {
                                                                                        arrayList.add(zzacVar);
                                                                                    }
                                                                                } catch (SQLiteDatabaseLockedException unused10) {
                                                                                    cursor3 = cursor6;
                                                                                    SystemClock.sleep(i10);
                                                                                    i10 += 20;
                                                                                    if (cursor3 != null) {
                                                                                        cursor3.close();
                                                                                    }
                                                                                    if (sQLiteDatabase == null) {
                                                                                        i11 = i3 + 1;
                                                                                        i9 = i4;
                                                                                        mb01Var2 = mb01Var;
                                                                                    }
                                                                                    sQLiteDatabase.close();
                                                                                    i11 = i3 + 1;
                                                                                    i9 = i4;
                                                                                    mb01Var2 = mb01Var;
                                                                                } catch (SQLiteFullException e9) {
                                                                                    e = e9;
                                                                                    cursor2 = cursor6;
                                                                                    k901 k901Var22222 = mb01Var3.j;
                                                                                    mb01.k(k901Var22222);
                                                                                    k901Var22222.i.b(e, "Error reading entries from local database");
                                                                                    p.g = true;
                                                                                    if (cursor2 != null) {
                                                                                        cursor2.close();
                                                                                    }
                                                                                    if (sQLiteDatabase == null) {
                                                                                        i11 = i3 + 1;
                                                                                        i9 = i4;
                                                                                        mb01Var2 = mb01Var;
                                                                                    }
                                                                                    sQLiteDatabase.close();
                                                                                    i11 = i3 + 1;
                                                                                    i9 = i4;
                                                                                    mb01Var2 = mb01Var;
                                                                                } catch (SQLiteException e10) {
                                                                                    e = e10;
                                                                                    cursor = cursor6;
                                                                                    if (sQLiteDatabase != null) {
                                                                                        try {
                                                                                            if (sQLiteDatabase.inTransaction()) {
                                                                                                sQLiteDatabase.endTransaction();
                                                                                            }
                                                                                        } catch (Throwable th9) {
                                                                                            th = th9;
                                                                                            cursor4 = cursor;
                                                                                            if (cursor4 != null) {
                                                                                                cursor4.close();
                                                                                            }
                                                                                            if (sQLiteDatabase != null) {
                                                                                                sQLiteDatabase.close();
                                                                                            }
                                                                                            throw th;
                                                                                        }
                                                                                    }
                                                                                    k901 k901Var32222 = mb01Var3.j;
                                                                                    mb01.k(k901Var32222);
                                                                                    k901Var32222.i.b(e, "Error reading entries from local database");
                                                                                    p.g = true;
                                                                                    if (cursor != null) {
                                                                                        cursor.close();
                                                                                    }
                                                                                    if (sQLiteDatabase == null) {
                                                                                        i11 = i3 + 1;
                                                                                        i9 = i4;
                                                                                        mb01Var2 = mb01Var;
                                                                                    }
                                                                                    sQLiteDatabase.close();
                                                                                    i11 = i3 + 1;
                                                                                    i9 = i4;
                                                                                    mb01Var2 = mb01Var;
                                                                                }
                                                                            } else if (i13 == 3) {
                                                                                k901 k901Var7 = mb01Var3.j;
                                                                                mb01.k(k901Var7);
                                                                                k901Var7.l.a("Skipping app launch break");
                                                                            } else {
                                                                                k901 k901Var8 = mb01Var3.j;
                                                                                mb01.k(k901Var8);
                                                                                k901Var8.i.a("Unknown record type in local database");
                                                                            }
                                                                            i11 = i3;
                                                                            i9 = i4;
                                                                            query = cursor6;
                                                                        }
                                                                    }
                                                                    i11 = i3;
                                                                    i9 = i4;
                                                                    query = cursor6;
                                                                } catch (SQLiteDatabaseLockedException unused11) {
                                                                    cursor6 = query;
                                                                } catch (SQLiteFullException e11) {
                                                                    e = e11;
                                                                    cursor6 = query;
                                                                } catch (SQLiteException e12) {
                                                                    e = e12;
                                                                    cursor6 = query;
                                                                }
                                                            } catch (SQLiteDatabaseLockedException unused12) {
                                                                cursor6 = query;
                                                                i4 = i9;
                                                                cursor3 = cursor6;
                                                                SystemClock.sleep(i10);
                                                                i10 += 20;
                                                                if (cursor3 != null) {
                                                                }
                                                                if (sQLiteDatabase == null) {
                                                                }
                                                                sQLiteDatabase.close();
                                                                i11 = i3 + 1;
                                                                i9 = i4;
                                                                mb01Var2 = mb01Var;
                                                            } catch (SQLiteFullException e13) {
                                                                e = e13;
                                                                cursor6 = query;
                                                                i4 = i9;
                                                                cursor2 = cursor6;
                                                                k901 k901Var222222 = mb01Var3.j;
                                                                mb01.k(k901Var222222);
                                                                k901Var222222.i.b(e, "Error reading entries from local database");
                                                                p.g = true;
                                                                if (cursor2 != null) {
                                                                }
                                                                if (sQLiteDatabase == null) {
                                                                }
                                                                sQLiteDatabase.close();
                                                                i11 = i3 + 1;
                                                                i9 = i4;
                                                                mb01Var2 = mb01Var;
                                                            } catch (SQLiteException e14) {
                                                                e = e14;
                                                                cursor6 = query;
                                                                i4 = i9;
                                                                cursor = cursor6;
                                                                if (sQLiteDatabase != null) {
                                                                }
                                                                k901 k901Var322222 = mb01Var3.j;
                                                                mb01.k(k901Var322222);
                                                                k901Var322222.i.b(e, "Error reading entries from local database");
                                                                p.g = true;
                                                                if (cursor != null) {
                                                                }
                                                                if (sQLiteDatabase == null) {
                                                                }
                                                                sQLiteDatabase.close();
                                                                i11 = i3 + 1;
                                                                i9 = i4;
                                                                mb01Var2 = mb01Var;
                                                            }
                                                        } catch (SQLiteDatabaseLockedException unused13) {
                                                            cursor6 = query;
                                                            i4 = i9;
                                                        } catch (SQLiteFullException e15) {
                                                            e = e15;
                                                            cursor6 = query;
                                                            i4 = i9;
                                                        } catch (SQLiteException e16) {
                                                            e = e16;
                                                            cursor6 = query;
                                                            i4 = i9;
                                                        }
                                                    } catch (Throwable th10) {
                                                        th = th10;
                                                        cursor6 = query;
                                                    }
                                                } catch (SQLiteDatabaseLockedException unused14) {
                                                    cursor6 = query;
                                                    i3 = i11;
                                                } catch (SQLiteFullException e17) {
                                                    e = e17;
                                                    cursor6 = query;
                                                    i3 = i11;
                                                } catch (SQLiteException e18) {
                                                    e = e18;
                                                    cursor6 = query;
                                                    i3 = i11;
                                                }
                                            }
                                            Cursor cursor7 = query;
                                            i2 = i9;
                                            if (sQLiteDatabase.delete("messages", "rowid <= ?", new String[]{Long.toString(j2)}) < arrayList.size()) {
                                                k901 k901Var9 = mb01Var3.j;
                                                mb01.k(k901Var9);
                                                k901Var9.i.a("Fewer entries removed from local database than expected");
                                            }
                                            sQLiteDatabase.setTransactionSuccessful();
                                            sQLiteDatabase.endTransaction();
                                            cursor7.close();
                                            sQLiteDatabase.close();
                                        } catch (SQLiteDatabaseLockedException unused15) {
                                            i4 = i9;
                                            i3 = i11;
                                            sQLiteDatabase2 = o;
                                            sQLiteDatabase = sQLiteDatabase2;
                                            cursor3 = null;
                                            SystemClock.sleep(i10);
                                            i10 += 20;
                                            if (cursor3 != null) {
                                            }
                                            if (sQLiteDatabase == null) {
                                            }
                                            sQLiteDatabase.close();
                                            i11 = i3 + 1;
                                            i9 = i4;
                                            mb01Var2 = mb01Var;
                                        } catch (SQLiteFullException e19) {
                                            e = e19;
                                            i4 = i9;
                                            i3 = i11;
                                            sQLiteDatabase2 = o;
                                            sQLiteDatabase = sQLiteDatabase2;
                                            cursor2 = null;
                                            k901 k901Var2222222 = mb01Var3.j;
                                            mb01.k(k901Var2222222);
                                            k901Var2222222.i.b(e, "Error reading entries from local database");
                                            p.g = true;
                                            if (cursor2 != null) {
                                            }
                                            if (sQLiteDatabase == null) {
                                            }
                                            sQLiteDatabase.close();
                                            i11 = i3 + 1;
                                            i9 = i4;
                                            mb01Var2 = mb01Var;
                                        } catch (SQLiteException e20) {
                                            e = e20;
                                            i4 = i9;
                                            i3 = i11;
                                            sQLiteDatabase2 = o;
                                            sQLiteDatabase = sQLiteDatabase2;
                                            cursor = null;
                                            if (sQLiteDatabase != null) {
                                            }
                                            k901 k901Var3222222 = mb01Var3.j;
                                            mb01.k(k901Var3222222);
                                            k901Var3222222.i.b(e, "Error reading entries from local database");
                                            p.g = true;
                                            if (cursor != null) {
                                            }
                                            if (sQLiteDatabase == null) {
                                            }
                                            sQLiteDatabase.close();
                                            i11 = i3 + 1;
                                            i9 = i4;
                                            mb01Var2 = mb01Var;
                                        } catch (Throwable th11) {
                                            th = th11;
                                            sQLiteDatabase2 = o;
                                            sQLiteDatabase = sQLiteDatabase2;
                                            cursor4 = null;
                                            if (cursor4 != null) {
                                            }
                                            if (sQLiteDatabase != null) {
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th12) {
                                        th = th12;
                                        mb01Var = mb01Var2;
                                    }
                                } catch (Throwable th13) {
                                    th = th13;
                                    mb01Var = mb01Var2;
                                    i4 = i9;
                                    sQLiteDatabase2 = o;
                                    i3 = i11;
                                    cursor5 = null;
                                }
                            }
                        } catch (SQLiteDatabaseLockedException unused16) {
                            mb01Var = mb01Var2;
                            i3 = i11;
                            i4 = i9;
                            cursor3 = null;
                            sQLiteDatabase = null;
                        } catch (SQLiteFullException e21) {
                            e = e21;
                            mb01Var = mb01Var2;
                            i3 = i11;
                            i4 = i9;
                            cursor2 = null;
                            sQLiteDatabase = null;
                        } catch (SQLiteException e22) {
                            e = e22;
                            mb01Var = mb01Var2;
                            i3 = i11;
                            i4 = i9;
                            cursor = null;
                            sQLiteDatabase = null;
                        } catch (Throwable th14) {
                            th = th14;
                            sQLiteDatabase = null;
                        }
                    }
                    mb01Var = mb01Var2;
                    i2 = i9;
                    k901 k901Var10 = mb01Var3.j;
                    mb01.k(k901Var10);
                    k901Var10.l.a("Failed to read events from database in reasonable time");
                    arrayList = null;
                } else {
                    mb01Var = mb01Var2;
                    i2 = i9;
                }
                if (arrayList == null) {
                    arrayList2.addAll(arrayList);
                    i5 = arrayList.size();
                } else {
                    i5 = 0;
                }
                int i14 = i;
                if (abstractSafeParcelable != null && i5 < i14) {
                    arrayList2.add(abstractSafeParcelable);
                }
                size = arrayList2.size();
                for (i6 = 0; i6 < size; i6++) {
                    AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) arrayList2.get(i6);
                    if (abstractSafeParcelable2 instanceof zzaw) {
                        try {
                            v701Var.a1((zzaw) abstractSafeParcelable2, zzqVar);
                        } catch (RemoteException e23) {
                            mb01.k(k901Var);
                            k901Var.i.b(e23, "Failed to send event to the service");
                        }
                    } else if (abstractSafeParcelable2 instanceof zzkw) {
                        try {
                            v701Var.f1((zzkw) abstractSafeParcelable2, zzqVar);
                        } catch (RemoteException e24) {
                            mb01.k(k901Var);
                            k901Var.i.b(e24, "Failed to send user property to the service");
                        }
                    } else if (abstractSafeParcelable2 instanceof zzac) {
                        try {
                            v701Var.D1((zzac) abstractSafeParcelable2, zzqVar);
                        } catch (RemoteException e25) {
                            mb01.k(k901Var);
                            k901Var.i.b(e25, "Failed to send conditional user property to the service");
                        }
                    } else {
                        mb01.k(k901Var);
                        k901Var.i.a("Discarding data. Unrecognized parcel type.");
                    }
                }
                i9 = i2 + 1;
                i8 = i5;
                i7 = i14;
                mb01Var2 = mb01Var;
            }
            i2 = i9;
            arrayList = null;
            if (arrayList == null) {
            }
            int i142 = i;
            if (abstractSafeParcelable != null) {
                arrayList2.add(abstractSafeParcelable);
            }
            size = arrayList2.size();
            while (i6 < size) {
            }
            i9 = i2 + 1;
            i8 = i5;
            i7 = i142;
            mb01Var2 = mb01Var;
        }
    }

    public final void p(zzac zzacVar) {
        boolean r;
        k();
        l();
        mb01 mb01Var = (mb01) this.b;
        mb01Var.getClass();
        e901 p = mb01Var.p();
        mb01 mb01Var2 = (mb01) p.b;
        mb01.i(mb01Var2.m);
        byte[] X = sk01.X(zzacVar);
        if (X.length > 131072) {
            k901 k901Var = mb01Var2.j;
            mb01.k(k901Var);
            k901Var.j.a("Conditional user property too long for local database. Sending directly to service");
            r = false;
        } else {
            r = p.r(2, X);
        }
        w(new ph01(this, t(true), r, new zzac(zzacVar)));
    }

    public final boolean q() {
        k();
        l();
        return this.g != null;
    }

    public final boolean r() {
        k();
        l();
        if (!s()) {
            return true;
        }
        sk01 sk01Var = ((mb01) this.b).m;
        mb01.i(sk01Var);
        return sk01Var.h0() >= ((Integer) s701.e0.a(null)).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s() {
        k();
        l();
        if (this.h == null) {
            k();
            l();
            x901 x901Var = ((mb01) this.b).i;
            mb01.i(x901Var);
            x901Var.k();
            boolean z = false;
            Boolean valueOf = !x901Var.o().contains("use_service") ? null : Boolean.valueOf(x901Var.o().getBoolean("use_service", false));
            if (valueOf == null || !valueOf.booleanValue()) {
                ((mb01) this.b).getClass();
                w701 o = ((mb01) this.b).o();
                o.l();
                if (o.n != 1) {
                    k901 k901Var = ((mb01) this.b).j;
                    mb01.k(k901Var);
                    k901Var.q.a("Checking service availability");
                    sk01 sk01Var = ((mb01) this.b).m;
                    mb01.i(sk01Var);
                    int c = com.google.android.gms.common.a.b.c(((mb01) sk01Var.b).b, 12451000);
                    if (c != 0) {
                        if (c == 1) {
                            k901 k901Var2 = ((mb01) this.b).j;
                            mb01.k(k901Var2);
                            k901Var2.q.a("Service missing");
                        } else if (c != 2) {
                            if (c == 3) {
                                k901 k901Var3 = ((mb01) this.b).j;
                                mb01.k(k901Var3);
                                k901Var3.l.a("Service disabled");
                            } else if (c == 9) {
                                k901 k901Var4 = ((mb01) this.b).j;
                                mb01.k(k901Var4);
                                k901Var4.l.a("Service invalid");
                            } else if (c != 18) {
                                k901 k901Var5 = ((mb01) this.b).j;
                                mb01.k(k901Var5);
                                k901Var5.l.b(Integer.valueOf(c), "Unexpected service status");
                            } else {
                                k901 k901Var6 = ((mb01) this.b).j;
                                mb01.k(k901Var6);
                                k901Var6.l.a("Service updating");
                            }
                            r1 = false;
                        } else {
                            k901 k901Var7 = ((mb01) this.b).j;
                            mb01.k(k901Var7);
                            k901Var7.p.a("Service container out of date");
                            sk01 sk01Var2 = ((mb01) this.b).m;
                            mb01.i(sk01Var2);
                            if (sk01Var2.h0() >= 17443) {
                                z = valueOf == null;
                                r1 = false;
                            }
                        }
                        if (z && ((mb01) this.b).h.y()) {
                            k901 k901Var8 = ((mb01) this.b).j;
                            mb01.k(k901Var8);
                            k901Var8.i.a("No way to upload. Consider using the full version of Analytics");
                        } else if (r1) {
                            x901 x901Var2 = ((mb01) this.b).i;
                            mb01.i(x901Var2);
                            x901Var2.k();
                            SharedPreferences.Editor edit = x901Var2.o().edit();
                            edit.putBoolean("use_service", z);
                            edit.apply();
                        }
                        r1 = z;
                    } else {
                        k901 k901Var9 = ((mb01) this.b).j;
                        mb01.k(k901Var9);
                        k901Var9.q.a("Service available");
                    }
                }
                z = true;
                if (z) {
                }
                if (r1) {
                }
                r1 = z;
            }
            this.h = Boolean.valueOf(r1);
        }
        return this.h.booleanValue();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v0 com.google.android.gms.measurement.internal.zzq, still in use, count: 2, list:
          (r6v0 com.google.android.gms.measurement.internal.zzq) from 0x0197: MOVE (r23v0 com.google.android.gms.measurement.internal.zzq) = (r6v0 com.google.android.gms.measurement.internal.zzq) (LINE:408)
          (r6v0 com.google.android.gms.measurement.internal.zzq) from 0x010e: MOVE (r23v3 com.google.android.gms.measurement.internal.zzq) = (r6v0 com.google.android.gms.measurement.internal.zzq) (LINE:271)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public final com.google.android.gms.measurement.internal.zzq t(boolean r35) {
        /*
            Method dump skipped, instructions count: 825
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xsna.yh01.t(boolean):com.google.android.gms.measurement.internal.zzq");
    }

    public final void u() {
        k();
        mb01 mb01Var = (mb01) this.b;
        k901 k901Var = mb01Var.j;
        mb01.k(k901Var);
        i901 i901Var = k901Var.q;
        ArrayList arrayList = this.k;
        i901Var.b(Integer.valueOf(arrayList.size()), "Processing queued up service tasks");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e) {
                k901 k901Var2 = mb01Var.j;
                mb01.k(k901Var2);
                k901Var2.i.b(e, "Task exception while flushing queue");
            }
        }
        arrayList.clear();
        this.l.a();
    }

    public final void v() {
        k();
        gj01 gj01Var = this.j;
        gj01Var.b = gj01Var.a.elapsedRealtime();
        ((mb01) this.b).getClass();
        this.i.c(((Long) s701.J.a(null)).longValue());
    }

    public final void w(Runnable runnable) throws IllegalStateException {
        mb01 mb01Var = (mb01) this.b;
        k();
        if (q()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        mb01Var.getClass();
        if (size >= 1000) {
            k901 k901Var = mb01Var.j;
            mb01.k(k901Var);
            k901Var.i.a("Discarding data. Max runnable queue size reached");
        } else {
            arrayList.add(runnable);
            this.l.c(60000L);
            z();
        }
    }

    public final Boolean x() {
        return this.h;
    }

    public final void z() {
        k();
        l();
        if (q()) {
            return;
        }
        if (s()) {
            xh01 xh01Var = this.f;
            xh01Var.d.k();
            Context context = ((mb01) xh01Var.d.b).b;
            synchronized (xh01Var) {
                try {
                    if (xh01Var.b) {
                        k901 k901Var = ((mb01) xh01Var.d.b).j;
                        mb01.k(k901Var);
                        k901Var.q.a("Connection attempt already in progress");
                        return;
                    } else {
                        if (xh01Var.c != null && (xh01Var.c.isConnecting() || xh01Var.c.isConnected())) {
                            k901 k901Var2 = ((mb01) xh01Var.d.b).j;
                            mb01.k(k901Var2);
                            k901Var2.q.a("Already awaiting connection attempt");
                            return;
                        }
                        xh01Var.c = new g901(context, Looper.getMainLooper(), 93, xh01Var, xh01Var, null);
                        k901 k901Var3 = ((mb01) xh01Var.d.b).j;
                        mb01.k(k901Var3);
                        k901Var3.q.a("Connecting to remote service");
                        xh01Var.b = true;
                        exc0.i(xh01Var.c);
                        xh01Var.c.checkAvailabilityAndConnect();
                        return;
                    }
                } finally {
                }
            }
        }
        if (((mb01) this.b).h.y()) {
            return;
        }
        ((mb01) this.b).getClass();
        List<ResolveInfo> queryIntentServices = ((mb01) this.b).b.getPackageManager().queryIntentServices(new Intent().setClassName(((mb01) this.b).b, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            k901 k901Var4 = ((mb01) this.b).j;
            mb01.k(k901Var4);
            k901Var4.i.a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new ComponentName(((mb01) this.b).b, "com.google.android.gms.measurement.AppMeasurementService"));
        xh01 xh01Var2 = this.f;
        xh01Var2.d.k();
        Context context2 = ((mb01) xh01Var2.d.b).b;
        o4j b = o4j.b();
        synchronized (xh01Var2) {
            try {
                if (xh01Var2.b) {
                    k901 k901Var5 = ((mb01) xh01Var2.d.b).j;
                    mb01.k(k901Var5);
                    k901Var5.q.a("Connection attempt already in progress");
                } else {
                    k901 k901Var6 = ((mb01) xh01Var2.d.b).j;
                    mb01.k(k901Var6);
                    k901Var6.q.a("Using local app measurement service");
                    xh01Var2.b = true;
                    b.a(context2, intent, xh01Var2.d.f, 129);
                }
            } finally {
            }
        }
    }
}
