package androidx.room;

import androidx.room.RoomDatabase;
import defpackage.bh20;
import defpackage.cvu0;
import defpackage.dac;
import defpackage.gwk0;
import defpackage.jl40;
import defpackage.kne0;
import defpackage.oll0;
import defpackage.p2l;
import defpackage.qqy;
import defpackage.rcc;
import defpackage.ull0;
import defpackage.vez0;
import defpackage.zg20;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.builders.ListBuilder;

/* loaded from: classes.dex */
public abstract class b {
    public boolean a;
    public boolean b;

    public static final void a(i iVar, oll0 oll0Var) {
        Object failure;
        p2l p2lVar = iVar.d;
        b(oll0Var);
        RoomDatabase.JournalMode journalMode = iVar.c.g;
        RoomDatabase.JournalMode journalMode2 = RoomDatabase.JournalMode.WRITE_AHEAD_LOGGING;
        if (journalMode == journalMode2) {
            vez0.s(oll0Var, "PRAGMA journal_mode = WAL");
        } else {
            vez0.s(oll0Var, "PRAGMA journal_mode = TRUNCATE");
        }
        if (iVar.d().g == journalMode2) {
            vez0.s(oll0Var, "PRAGMA synchronous = NORMAL");
        } else {
            vez0.s(oll0Var, "PRAGMA synchronous = FULL");
        }
        ull0 T0 = oll0Var.T0("PRAGMA user_version");
        try {
            T0.q();
            int i = (int) T0.getLong(0);
            gwk0.m(T0, null);
            if (i != p2lVar.a) {
                vez0.s(oll0Var, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    if (i == 0) {
                        iVar.f(oll0Var);
                    } else {
                        iVar.g(oll0Var, i, p2lVar.a);
                    }
                    vez0.s(oll0Var, "PRAGMA user_version = " + p2lVar.a);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                if (!(failure instanceof Result.Failure)) {
                    vez0.s(oll0Var, "END TRANSACTION");
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    vez0.s(oll0Var, "ROLLBACK TRANSACTION");
                    throw a;
                }
            }
            iVar.h(oll0Var);
        } finally {
        }
    }

    public static void b(oll0 oll0Var) {
        ull0 T0 = oll0Var.T0("PRAGMA busy_timeout");
        try {
            T0.q();
            long j = T0.getLong(0);
            gwk0.m(T0, null);
            if (j < 3000) {
                vez0.s(oll0Var, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                gwk0.m(T0, th);
                throw th2;
            }
        }
    }

    public abstract List c();

    public abstract c d();

    public abstract p2l e();

    public final void f(oll0 oll0Var) {
        ull0 T0 = oll0Var.T0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (T0.q()) {
                if (T0.getLong(0) == 0) {
                    z = true;
                }
            }
            gwk0.m(T0, null);
            e().d(oll0Var);
            if (!z) {
                kne0 m = e().m(oll0Var);
                if (!m.b) {
                    dac.f(m.a, "Pre-packaged database has an invalid schema: ");
                    return;
                }
            }
            i(oll0Var);
            e().i();
            for (RoomDatabase.a aVar : c()) {
                aVar.getClass();
                if (oll0Var instanceof androidx.sqlite.driver.a) {
                    aVar.a(((androidx.sqlite.driver.a) oll0Var).a);
                }
            }
        } finally {
        }
    }

    public final void g(oll0 oll0Var, int i, int i2) {
        List a = bh20.a(d().d, i, i2);
        if (a != null) {
            e().l(oll0Var);
            Iterator it = a.iterator();
            while (it.hasNext()) {
                ((zg20) it.next()).a(oll0Var);
            }
            kne0 m = e().m(oll0Var);
            if (!m.b) {
                dac.f(m.a, "Migration didn't properly handle: ");
                return;
            } else {
                e().k();
                i(oll0Var);
                return;
            }
        }
        if (bh20.b(d(), i, i2)) {
            throw new IllegalStateException(("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
        }
        if (d().t) {
            ull0 T0 = oll0Var.T0("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                ListBuilder a2 = rcc.a();
                while (T0.q()) {
                    String Y1 = T0.Y1(0);
                    if (!cvu0.x(Y1, "sqlite_", false) && !Y1.equals("android_metadata")) {
                        a2.add(new Pair(Y1, Boolean.valueOf(jl40.l(T0.Y1(1), "view"))));
                    }
                }
                ListBuilder j = a2.j();
                gwk0.m(T0, null);
                ListIterator listIterator = j.listIterator(0);
                while (true) {
                    qqy qqyVar = (qqy) listIterator;
                    if (!qqyVar.hasNext()) {
                        break;
                    }
                    Pair pair = (Pair) qqyVar.next();
                    String str = (String) pair.getFirst();
                    if (((Boolean) pair.getSecond()).booleanValue()) {
                        vez0.s(oll0Var, "DROP VIEW IF EXISTS `" + str + '`');
                    } else {
                        vez0.s(oll0Var, "DROP TABLE IF EXISTS `" + str + '`');
                    }
                }
            } finally {
            }
        } else {
            e().e(oll0Var);
        }
        for (RoomDatabase.a aVar : c()) {
            aVar.getClass();
            if (oll0Var instanceof androidx.sqlite.driver.a) {
                aVar.b(((androidx.sqlite.driver.a) oll0Var).a);
            }
        }
        e().d(oll0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(oll0 oll0Var) {
        boolean z;
        Object failure;
        kne0 m;
        ull0 T0 = oll0Var.T0("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
        try {
            if (T0.q()) {
                if (T0.getLong(0) != 0) {
                    z = true;
                    gwk0.m(T0, null);
                    if (z) {
                        vez0.s(oll0Var, "BEGIN EXCLUSIVE TRANSACTION");
                        try {
                            m = e().m(oll0Var);
                        } catch (Throwable th) {
                            failure = new Result.Failure(th);
                        }
                        if (!m.b) {
                            throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + m.a).toString());
                        }
                        e().k();
                        i(oll0Var);
                        failure = zy11.a;
                        if (!(failure instanceof Result.Failure)) {
                            vez0.s(oll0Var, "END TRANSACTION");
                        }
                        Throwable a = Result.a(failure);
                        if (a != null) {
                            vez0.s(oll0Var, "ROLLBACK TRANSACTION");
                            throw a;
                        }
                    } else {
                        T0 = oll0Var.T0("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
                        try {
                            String Y1 = T0.q() ? T0.Y1(0) : null;
                            gwk0.m(T0, null);
                            if (!((String) e().b).equals(Y1) && !((String) e().c).equals(Y1)) {
                                throw new IllegalStateException(("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + ((String) e().b) + ", found: " + Y1).toString());
                            }
                        } finally {
                        }
                    }
                    e().j(oll0Var);
                    for (RoomDatabase.a aVar : c()) {
                        aVar.getClass();
                        if (oll0Var instanceof androidx.sqlite.driver.a) {
                            aVar.c(((androidx.sqlite.driver.a) oll0Var).a);
                        }
                    }
                    this.a = true;
                }
            }
            z = false;
            gwk0.m(T0, null);
            if (z) {
            }
            e().j(oll0Var);
            while (r0.hasNext()) {
            }
            this.a = true;
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    public final void i(oll0 oll0Var) {
        vez0.s(oll0Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        vez0.s(oll0Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) e().b) + "')");
    }
}
