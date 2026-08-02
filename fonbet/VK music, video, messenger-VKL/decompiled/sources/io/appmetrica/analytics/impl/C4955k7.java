package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.io.Closeable;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.k7, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4955k7 extends SQLiteOpenHelper implements Closeable {
    public final String a;
    public final PublicLogger b;
    public final C5178sn c;

    public C4955k7(Context context, String str, C5178sn c5178sn, PublicLogger publicLogger) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, I5.b);
        this.c = c5178sn;
        this.a = str;
        this.b = publicLogger;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getReadableDatabase() {
        try {
            return super.getReadableDatabase();
        } catch (Throwable th) {
            this.b.error(th, "Could not get readable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.a);
            C4710ak c4710ak = AbstractC5326yj.a;
            c4710ak.getClass();
            c4710ak.a(new C5351zj("db_read_error", th));
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (Throwable th) {
            this.b.error(th, "Could not get writable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.a);
            C4710ak c4710ak = AbstractC5326yj.a;
            c4710ak.getClass();
            c4710ak.a(new C5351zj("db_write_error", th));
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            this.c.a.runScript(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C5178sn c5178sn = this.c;
        if (i <= i2) {
            c5178sn.getClass();
            return;
        }
        try {
            c5178sn.b.runScript(sQLiteDatabase);
        } catch (Throwable unused) {
        }
        try {
            c5178sn.a.runScript(sQLiteDatabase);
        } catch (Throwable unused2) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        C5178sn c5178sn = this.c;
        c5178sn.getClass();
        try {
            InterfaceC5204tn interfaceC5204tn = c5178sn.d;
            if (interfaceC5204tn == null || interfaceC5204tn.a(sQLiteDatabase)) {
                return;
            }
            try {
                c5178sn.b.runScript(sQLiteDatabase);
            } catch (Throwable unused) {
            }
            c5178sn.a.runScript(sQLiteDatabase);
        } catch (Throwable unused2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        boolean z;
        C5178sn c5178sn = this.c;
        c5178sn.getClass();
        if (i2 > i) {
            for (int i3 = i + 1; i3 <= i2; i3++) {
                try {
                    Collection collection = (Collection) c5178sn.c.a.get(Integer.valueOf(i3));
                    if (collection != null) {
                        Iterator it = collection.iterator();
                        while (it.hasNext()) {
                            ((DatabaseScript) it.next()).runScript(sQLiteDatabase);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            z = false;
            if (!z && !(!c5178sn.d.a(sQLiteDatabase))) {
                try {
                    c5178sn.b.runScript(sQLiteDatabase);
                } catch (Throwable unused2) {
                }
                try {
                    c5178sn.a.runScript(sQLiteDatabase);
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            }
            return;
        }
        z = true;
        if (!(z | (c5178sn.d.a(sQLiteDatabase) ^ true))) {
        }
    }
}
