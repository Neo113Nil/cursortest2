package androidx.room;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import defpackage.b64;
import defpackage.bh20;
import defpackage.cjx;
import defpackage.cvu0;
import defpackage.g8e;
import defpackage.hkw0;
import defpackage.jkw0;
import defpackage.jl40;
import defpackage.kne0;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qqy;
import defpackage.rcc;
import defpackage.sub1;
import defpackage.ufs;
import defpackage.yci0;
import defpackage.zg20;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.collections.builders.ListBuilder;

/* loaded from: classes.dex */
public final class m extends jkw0 {
    public c b;
    public final List c;
    public final com.yandex.passport.internal.database.k d;

    public m(c cVar, com.yandex.passport.internal.database.k kVar) {
        super(3);
        this.c = cVar.e;
        this.b = cVar;
        this.d = kVar;
    }

    @Override // defpackage.jkw0
    public final void b(ufs ufsVar) {
        Cursor W1 = ufsVar.W1("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            Cursor cursor = W1;
            boolean z = false;
            if (cursor.moveToFirst()) {
                if (cursor.getInt(0) == 0) {
                    z = true;
                }
            }
            W1.close();
            com.yandex.passport.internal.database.k kVar = this.d;
            kVar.M(ufsVar);
            if (!z) {
                kne0 N = kVar.N(ufsVar);
                if (!N.b) {
                    yci0.t(N.a, "Pre-packaged database has an invalid schema: ");
                    return;
                }
            }
            ufsVar.r("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            ufsVar.r("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '51126f9ef807fa748bae1e4190fbd279')");
            List list = this.c;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((RoomDatabase.a) it.next()).a(ufsVar);
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ooc.g(W1, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.jkw0
    public final void c(ufs ufsVar, int i, int i2) {
        e(ufsVar, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0069  */
    @Override // defpackage.jkw0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(ufs ufsVar) {
        boolean z;
        List list;
        Cursor W1 = ufsVar.W1("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            Cursor cursor = W1;
            if (cursor.moveToFirst()) {
                if (cursor.getInt(0) != 0) {
                    z = true;
                    W1.close();
                    com.yandex.passport.internal.database.k kVar = this.d;
                    if (z) {
                        kne0 N = kVar.N(ufsVar);
                        if (!N.b) {
                            yci0.t(N.a, "Pre-packaged database has an invalid schema: ");
                            return;
                        } else {
                            ufsVar.r("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                            ufsVar.r("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '51126f9ef807fa748bae1e4190fbd279')");
                        }
                    } else {
                        W1 = ufsVar.U0(new cjx("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1", 2));
                        try {
                            Cursor cursor2 = W1;
                            String string = cursor2.moveToFirst() ? cursor2.getString(0) : null;
                            W1.close();
                            if (!"51126f9ef807fa748bae1e4190fbd279".equals(string) && !"ada19719cca56d05ee2aa2bb2b6f85c5".equals(string)) {
                                ny61.r(g8e.o("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: 51126f9ef807fa748bae1e4190fbd279, found: ", string));
                                return;
                            }
                        } finally {
                        }
                    }
                    kVar.h.L0(new androidx.sqlite.driver.a(ufsVar));
                    list = this.c;
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((RoomDatabase.a) it.next()).c(ufsVar);
                        }
                    }
                    this.b = null;
                }
            }
            z = false;
            W1.close();
            com.yandex.passport.internal.database.k kVar2 = this.d;
            if (z) {
            }
            kVar2.h.L0(new androidx.sqlite.driver.a(ufsVar));
            list = this.c;
            if (list != null) {
            }
            this.b = null;
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    @Override // defpackage.jkw0
    public final void e(hkw0 hkw0Var, int i, int i2) {
        c cVar = this.b;
        com.yandex.passport.internal.database.k kVar = this.d;
        if (cVar != null) {
            RoomDatabase.b bVar = cVar.d;
            bVar.getClass();
            List a = bh20.a(bVar, i, i2);
            if (a != null) {
                sub1.d(new androidx.sqlite.driver.a(hkw0Var));
                Iterator it = a.iterator();
                while (it.hasNext()) {
                    ((zg20) it.next()).a(new androidx.sqlite.driver.a(hkw0Var));
                }
                kne0 N = kVar.N(hkw0Var);
                if (!N.b) {
                    yci0.t(N.a, "Migration didn't properly handle: ");
                    return;
                } else {
                    hkw0Var.r("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                    hkw0Var.r("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '51126f9ef807fa748bae1e4190fbd279')");
                    return;
                }
            }
        }
        c cVar2 = this.b;
        if (cVar2 == null || bh20.b(cVar2, i, i2)) {
            ny61.r(b64.d(i, i2, "A migration from ", " to ", " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."));
            return;
        }
        if (cVar2.t) {
            Cursor W1 = hkw0Var.W1("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                Cursor cursor = W1;
                ListBuilder a2 = rcc.a();
                while (cursor.moveToNext()) {
                    String string = cursor.getString(0);
                    if (!cvu0.x(string, "sqlite_", false) && !string.equals("android_metadata")) {
                        a2.add(new Pair(string, Boolean.valueOf(jl40.l(cursor.getString(1), "view"))));
                    }
                }
                ListBuilder j = a2.j();
                ooc.g(W1, null);
                ListIterator listIterator = j.listIterator(0);
                while (true) {
                    qqy qqyVar = (qqy) listIterator;
                    if (!qqyVar.hasNext()) {
                        break;
                    }
                    Pair pair = (Pair) qqyVar.next();
                    String str = (String) pair.getFirst();
                    if (((Boolean) pair.getSecond()).booleanValue()) {
                        hkw0Var.r("DROP VIEW IF EXISTS " + str);
                    } else {
                        hkw0Var.r("DROP TABLE IF EXISTS " + str);
                    }
                }
            } finally {
            }
        } else {
            hkw0Var.r("DROP TABLE IF EXISTS `diary_method`");
            hkw0Var.r("DROP TABLE IF EXISTS `diary_parameter`");
            hkw0Var.r("DROP TABLE IF EXISTS `diary_upload`");
            hkw0Var.r("DROP TABLE IF EXISTS `modern_auth_cookie`");
        }
        List list = this.c;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((RoomDatabase.a) it2.next()).b(hkw0Var);
            }
        }
        kVar.M(hkw0Var);
    }
}
