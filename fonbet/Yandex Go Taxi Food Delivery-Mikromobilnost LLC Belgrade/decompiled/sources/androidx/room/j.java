package androidx.room;

import android.app.ActivityManager;
import android.content.Context;
import androidx.room.RoomDatabase;
import defpackage.b43;
import defpackage.c43;
import defpackage.g0c;
import defpackage.kkw0;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.qoi0;
import defpackage.tpx;
import defpackage.w511;
import defpackage.xfs;
import defpackage.zg20;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class j {
    public final g0c a;
    public final Context b;
    public final String c;
    public Executor f;
    public Executor g;
    public tpx h;
    public boolean i;
    public boolean q;
    public boolean r;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public RoomDatabase.JournalMode j = RoomDatabase.JournalMode.AUTOMATIC;
    public final long k = -1;
    public final RoomDatabase.b l = new RoomDatabase.b();
    public final LinkedHashSet m = new LinkedHashSet();
    public final LinkedHashSet n = new LinkedHashSet();
    public final ArrayList o = new ArrayList();
    public boolean p = true;
    public final boolean s = true;

    public j(Context context, Class cls, String str) {
        this.a = qoi0.a(cls);
        this.b = context;
        this.c = str;
    }

    public final void a(zg20... zg20VarArr) {
        for (zg20 zg20Var : zg20VarArr) {
            Integer valueOf = Integer.valueOf(zg20Var.a);
            LinkedHashSet linkedHashSet = this.n;
            linkedHashSet.add(valueOf);
            linkedHashSet.add(Integer.valueOf(zg20Var.b));
        }
        zg20[] zg20VarArr2 = (zg20[]) Arrays.copyOf(zg20VarArr, zg20VarArr.length);
        RoomDatabase.b bVar = this.l;
        bVar.getClass();
        for (zg20 zg20Var2 : zg20VarArr2) {
            bVar.a(zg20Var2);
        }
    }

    public final RoomDatabase b() {
        String str;
        String str2;
        Executor executor = this.f;
        if (executor == null && this.g == null) {
            b43 b43Var = c43.c;
            this.g = b43Var;
            this.f = b43Var;
        } else if (executor != null && this.g == null) {
            this.g = executor;
        } else if (executor == null) {
            this.f = this.g;
        }
        LinkedHashSet linkedHashSet = this.n;
        boolean isEmpty = linkedHashSet.isEmpty();
        LinkedHashSet linkedHashSet2 = this.m;
        if (!isEmpty) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (linkedHashSet2.contains(Integer.valueOf(intValue))) {
                    w511.f(oyr.i(intValue, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: "));
                    return null;
                }
            }
        }
        kkw0 kkw0Var = this.h;
        if (kkw0Var == null) {
            kkw0Var = new xfs();
        }
        kkw0 kkw0Var2 = kkw0Var;
        if (this.k > 0) {
            if (this.c != null) {
                ny61.g("Required value was null.");
                return null;
            }
            ny61.g("Cannot create auto-closing database for an in-memory database.");
            return null;
        }
        boolean z = this.i;
        RoomDatabase.JournalMode journalMode = this.j;
        journalMode.getClass();
        RoomDatabase.JournalMode journalMode2 = RoomDatabase.JournalMode.AUTOMATIC;
        Context context = this.b;
        if (journalMode == journalMode2) {
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            journalMode = (activityManager == null || activityManager.isLowRamDevice()) ? RoomDatabase.JournalMode.TRUNCATE : RoomDatabase.JournalMode.WRITE_AHEAD_LOGGING;
        }
        RoomDatabase.JournalMode journalMode3 = journalMode;
        Executor executor2 = this.f;
        if (executor2 == null) {
            ny61.g("Required value was null.");
            return null;
        }
        Executor executor3 = this.g;
        if (executor3 == null) {
            ny61.g("Required value was null.");
            return null;
        }
        c cVar = new c(context, this.c, kkw0Var2, this.l, this.d, z, journalMode3, executor2, executor3, null, this.p, this.q, linkedHashSet2, null, null, null, null, this.e, this.o, this.r, null, null);
        cVar.w = this.s;
        Class a = this.a.a();
        Package r0 = a.getPackage();
        if (r0 == null || (str = r0.getName()) == null) {
            str = "";
        }
        String canonicalName = a.getCanonicalName();
        if (str.length() != 0) {
            canonicalName = canonicalName.substring(str.length() + 1);
        }
        String concat = canonicalName.replace('.', '_').concat("_Impl");
        try {
            if (str.length() == 0) {
                str2 = concat;
            } else {
                str2 = str + '.' + concat;
            }
            RoomDatabase roomDatabase = (RoomDatabase) Class.forName(str2, true, a.getClassLoader()).getDeclaredConstructor(null).newInstance(null);
            roomDatabase.K0(cVar);
            return roomDatabase;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Cannot find implementation for " + a.getCanonicalName() + ". " + concat + " does not exist. Is Room annotation processor correctly configured?", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Cannot access the constructor " + a.getCanonicalName(), e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("Failed to create an instance of " + a.getCanonicalName(), e3);
        }
    }
}
