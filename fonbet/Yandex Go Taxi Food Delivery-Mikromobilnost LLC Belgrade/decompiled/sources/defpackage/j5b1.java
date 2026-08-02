package defpackage;

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
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.b;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import com.google.android.gms.measurement.internal.c;
import com.google.android.gms.measurement.internal.g;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzgb;
import com.google.android.gms.measurement.internal.zznf;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import ru.yandex.common.startup.StartupRequest;

/* loaded from: classes.dex */
public final class j5b1 extends vw91 {
    public ScheduledExecutorService A;
    public final jpb B;
    public final ArrayList C;
    public final n0b1 D;
    public final zznf w;
    public zzgb x;
    public volatile Boolean y;
    public final n0b1 z;

    public j5b1(g gVar) {
        super(gVar);
        this.C = new ArrayList();
        this.B = new jpb(gVar.D);
        this.w = new zznf(this);
        this.z = new n0b1(this, gVar, 0);
        this.D = new n0b1(this, gVar, 1);
    }

    @Override // defpackage.vw91
    public final boolean Jg() {
        return false;
    }

    public final void Kg(AtomicReference atomicReference) {
        Gg();
        Hg();
        Ug(new w1l(this, atomicReference, Wg(false)));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Lg(Bundle bundle) {
        boolean z;
        boolean Ng;
        Gg();
        Hg();
        zzbe zzbeVar = new zzbe(bundle);
        Sg();
        g gVar = (g) this.b;
        if (gVar.w.Qg(null, nw91.b1)) {
            c i = gVar.i();
            g gVar2 = (g) i.b;
            ieb1 ieb1Var = gVar2.B;
            y1a1 y1a1Var = gVar2.y;
            g.e(ieb1Var);
            byte[] jh = ieb1.jh(zzbeVar);
            if (jh == null) {
                g.g(y1a1Var);
                y1a1Var.A.a("Null default event parameters; not writing to database");
            } else if (jh.length > 131072) {
                g.g(y1a1Var);
                y1a1Var.A.a("Default event parameters too long for local database. Sending directly to service");
            } else {
                Ng = i.Ng(4, jh);
                if (Ng) {
                    z = true;
                    Ug(new y0b1(this, Wg(false), z, zzbeVar, bundle));
                }
            }
            Ng = false;
            if (Ng) {
            }
        }
        z = false;
        Ug(new y0b1(this, Wg(false), z, zzbeVar, bundle));
    }

    public final void Mg() {
        Gg();
        Hg();
        if (Xg()) {
            return;
        }
        boolean Ng = Ng();
        zznf zznfVar = this.w;
        if (Ng) {
            zznfVar.zzc();
            return;
        }
        g gVar = (g) this.b;
        j691 j691Var = gVar.w;
        Context context = gVar.a;
        if (j691Var.Jg()) {
            return;
        }
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            y1a1 y1a1Var = gVar.y;
            g.g(y1a1Var);
            y1a1Var.z.a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
        } else {
            Intent intent = new Intent("com.google.android.gms.measurement.START");
            intent.setComponent(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementService"));
            zznfVar.zza(intent);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Ng() {
        Gg();
        Hg();
        if (this.y == null) {
            Gg();
            Hg();
            g gVar = (g) this.b;
            o5a1 o5a1Var = gVar.x;
            g.e(o5a1Var);
            o5a1Var.Gg();
            boolean z = false;
            Boolean valueOf = !o5a1Var.Kg().contains("use_service") ? null : Boolean.valueOf(o5a1Var.Kg().getBoolean("use_service", false));
            if (valueOf == null || !valueOf.booleanValue()) {
                fz91 l = ((g) this.b).l();
                l.Hg();
                if (l.G != 1) {
                    y1a1 y1a1Var = gVar.y;
                    g.g(y1a1Var);
                    y1a1Var.H.a("Checking service availability");
                    ieb1 ieb1Var = gVar.B;
                    g.e(ieb1Var);
                    int d = b.b.d(((g) ieb1Var.b).a, 12451000);
                    if (d != 0) {
                        if (d == 1) {
                            y1a1 y1a1Var2 = gVar.y;
                            g.g(y1a1Var2);
                            y1a1Var2.H.a("Service missing");
                        } else if (d != 2) {
                            if (d != 3) {
                                y1a1 y1a1Var3 = gVar.y;
                                if (d == 9) {
                                    g.g(y1a1Var3);
                                    y1a1Var3.C.a("Service invalid");
                                } else if (d != 18) {
                                    g.g(y1a1Var3);
                                    y1a1Var3.C.b(Integer.valueOf(d), "Unexpected service status");
                                } else {
                                    g.g(y1a1Var3);
                                    y1a1Var3.C.a("Service updating");
                                }
                            } else {
                                y1a1 y1a1Var4 = gVar.y;
                                g.g(y1a1Var4);
                                y1a1Var4.C.a("Service disabled");
                            }
                            r2 = false;
                        } else {
                            y1a1 y1a1Var5 = gVar.y;
                            g.g(y1a1Var5);
                            y1a1Var5.G.a("Service container out of date");
                            ieb1 ieb1Var2 = gVar.B;
                            g.e(ieb1Var2);
                            if (ieb1Var2.lh() >= 17443) {
                                z = valueOf == null;
                                r2 = false;
                            }
                        }
                        if (z && gVar.w.Jg()) {
                            y1a1 y1a1Var6 = gVar.y;
                            g.g(y1a1Var6);
                            y1a1Var6.z.a("No way to upload. Consider using the full version of Analytics");
                        } else if (r2) {
                            o5a1 o5a1Var2 = gVar.x;
                            g.e(o5a1Var2);
                            o5a1Var2.Gg();
                            SharedPreferences.Editor edit = o5a1Var2.Kg().edit();
                            edit.putBoolean("use_service", z);
                            edit.apply();
                        }
                        r2 = z;
                    } else {
                        y1a1 y1a1Var7 = gVar.y;
                        g.g(y1a1Var7);
                        y1a1Var7.H.a("Service available");
                    }
                }
                z = true;
                if (z) {
                }
                if (r2) {
                }
                r2 = z;
            }
            this.y = Boolean.valueOf(r2);
        }
        return this.y.booleanValue();
    }

    public final void Og() {
        Gg();
        Hg();
        zznf zznfVar = this.w;
        zznfVar.zzb();
        try {
            yvi0.s().w(((g) this.b).a, zznfVar);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.x = null;
    }

    public final boolean Pg() {
        Gg();
        Hg();
        if (!Ng()) {
            return true;
        }
        ieb1 ieb1Var = ((g) this.b).B;
        g.e(ieb1Var);
        return ieb1Var.lh() >= ((Integer) nw91.J0.a(null)).intValue();
    }

    public final boolean Qg() {
        Gg();
        Hg();
        if (!Ng()) {
            return true;
        }
        ieb1 ieb1Var = ((g) this.b).B;
        g.e(ieb1Var);
        return ieb1Var.lh() >= 241200;
    }

    public final void Rg(ComponentName componentName) {
        Gg();
        if (this.x != null) {
            this.x = null;
            y1a1 y1a1Var = ((g) this.b).y;
            g.g(y1a1Var);
            y1a1Var.H.b(componentName, "Disconnected from device MeasurementService");
            Gg();
            Mg();
        }
    }

    public final void Sg() {
        ((g) this.b).getClass();
    }

    public final void Tg() {
        Gg();
        jpb jpbVar = this.B;
        ((kl40) ((t3c) jpbVar.c)).getClass();
        jpbVar.b = SystemClock.elapsedRealtime();
        ((g) this.b).getClass();
        this.z.b(((Long) nw91.Y.a(null)).longValue());
    }

    public final void Ug(Runnable runnable) {
        Gg();
        if (Xg()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.C;
        long size = arrayList.size();
        g gVar = (g) this.b;
        gVar.getClass();
        if (size >= 1000) {
            y1a1 y1a1Var = gVar.y;
            g.g(y1a1Var);
            y1a1Var.z.a("Discarding data. Max runnable queue size reached");
        } else {
            arrayList.add(runnable);
            this.D.b(60000L);
            Mg();
        }
    }

    public final void Vg() {
        Gg();
        g gVar = (g) this.b;
        y1a1 y1a1Var = gVar.y;
        g.g(y1a1Var);
        l1a1 l1a1Var = y1a1Var.H;
        ArrayList arrayList = this.C;
        l1a1Var.b(Integer.valueOf(arrayList.size()), "Processing queued up service tasks");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e) {
                y1a1 y1a1Var2 = gVar.y;
                g.g(y1a1Var2);
                y1a1Var2.z.b(e, "Task exception while flushing queue");
            }
        }
        arrayList.clear();
        this.D.c();
    }

    public final zzr Wg(boolean z) {
        long abs;
        Pair pair;
        g gVar = (g) this.b;
        gVar.getClass();
        fz91 l = gVar.l();
        String str = null;
        if (z) {
            y1a1 y1a1Var = gVar.y;
            g.g(y1a1Var);
            g gVar2 = (g) y1a1Var.b;
            o5a1 o5a1Var = gVar2.x;
            g.e(o5a1Var);
            if (o5a1Var.y != null) {
                o5a1 o5a1Var2 = gVar2.x;
                g.e(o5a1Var2);
                jcp jcpVar = o5a1Var2.y;
                o5a1 o5a1Var3 = (o5a1) jcpVar.x;
                o5a1Var3.Gg();
                o5a1Var3.Gg();
                long j = ((o5a1) jcpVar.x).Kg().getLong((String) jcpVar.b, 0L);
                if (j == 0) {
                    jcpVar.e();
                    abs = 0;
                } else {
                    ((g) o5a1Var3.b).D.getClass();
                    abs = Math.abs(j - System.currentTimeMillis());
                }
                long j2 = jcpVar.a;
                if (abs >= j2) {
                    if (abs > j2 + j2) {
                        jcpVar.e();
                    } else {
                        String string = o5a1Var3.Kg().getString((String) jcpVar.w, null);
                        long j3 = o5a1Var3.Kg().getLong((String) jcpVar.c, 0L);
                        jcpVar.e();
                        pair = (string == null || j3 <= 0) ? o5a1.T : new Pair(string, Long.valueOf(j3));
                        if (pair != null && pair != o5a1.T) {
                            String valueOf = String.valueOf(pair.second);
                            String str2 = (String) pair.first;
                            str = unr0.r(new StringBuilder(valueOf.length() + 1 + String.valueOf(str2).length()), valueOf, ":", str2);
                        }
                    }
                }
                pair = null;
                if (pair != null) {
                    String valueOf2 = String.valueOf(pair.second);
                    String str22 = (String) pair.first;
                    str = unr0.r(new StringBuilder(valueOf2.length() + 1 + String.valueOf(str22).length()), valueOf2, ":", str22);
                }
            }
        }
        return l.Kg(str);
    }

    public final boolean Xg() {
        Gg();
        Hg();
        return this.x != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0543 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0501 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0501 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x049b A[Catch: all -> 0x04d9, TRY_ENTER, TryCatch #30 {all -> 0x04d9, blocks: (B:191:0x04c9, B:214:0x049b, B:216:0x04a1, B:217:0x04a4, B:205:0x04ec, B:335:0x03b6, B:339:0x03c0, B:340:0x03d1), top: B:190:0x04c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0501 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x02fe A[Catch: all -> 0x0222, SQLiteException -> 0x02d8, SQLiteDatabaseLockedException -> 0x02dd, SQLiteFullException -> 0x02e1, TryCatch #2 {all -> 0x0222, blocks: (B:156:0x01fb, B:162:0x0211, B:164:0x0216, B:171:0x0238, B:174:0x023c, B:175:0x023f, B:224:0x0247, B:227:0x025b, B:229:0x0273, B:232:0x027c, B:233:0x027f, B:235:0x026d, B:238:0x0283, B:241:0x0297, B:243:0x02af, B:248:0x02b9, B:249:0x02bc, B:246:0x02a9, B:259:0x02c0, B:267:0x02d4, B:269:0x02fe, B:282:0x0308, B:283:0x030b, B:280:0x02f8, B:254:0x031a, B:256:0x0325, B:332:0x039f), top: B:155:0x01fb }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x053e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Yg(zzgb zzgbVar, AbstractSafeParcelable abstractSafeParcelable, zzr zzrVar) {
        ArrayList arrayList;
        kl40 kl40Var;
        y1a1 y1a1Var;
        j691 j691Var;
        int i;
        int i2;
        Cursor cursor;
        SQLiteDatabase sQLiteDatabase;
        String str;
        int i3;
        String str2;
        String str3;
        int i4;
        Cursor cursor2;
        Cursor cursor3;
        long j;
        String str4;
        String[] strArr;
        int i5;
        int i6;
        int i7;
        Cursor cursor4;
        long j2;
        String str5;
        gw91 gw91Var;
        Parcel obtain;
        zzbe zzbeVar;
        int i8;
        zzah zzahVar;
        zzpl zzplVar;
        int i9;
        int size;
        int i10;
        int i11;
        j691 j691Var2;
        y1a1 y1a1Var2;
        String str6;
        long j3;
        long j4;
        long currentTimeMillis;
        long j5;
        AbstractSafeParcelable abstractSafeParcelable2 = abstractSafeParcelable;
        Gg();
        Hg();
        Sg();
        g gVar = (g) this.b;
        gVar.getClass();
        y1a1 y1a1Var3 = gVar.y;
        kl40 kl40Var2 = gVar.D;
        j691 j691Var3 = gVar.w;
        int i12 = 100;
        zzr zzrVar2 = zzrVar;
        int i13 = 100;
        int i14 = 0;
        while (i14 < 1001 && i13 == i12) {
            ArrayList arrayList2 = new ArrayList();
            c i15 = gVar.i();
            String str7 = "entry";
            String str8 = "type";
            int i16 = i12;
            String str9 = "rowid";
            g gVar2 = (g) i15.b;
            i15.Gg();
            g gVar3 = gVar;
            if (i15.x) {
                y1a1Var = y1a1Var3;
                kl40Var = kl40Var2;
                j691Var = j691Var3;
                i = i14;
            } else {
                arrayList = new ArrayList();
                kl40Var = kl40Var2;
                if (((g) i15.b).a.getDatabasePath("google_app_measurement_local.db").exists()) {
                    int i17 = 5;
                    y1a1Var = y1a1Var3;
                    int i18 = 5;
                    i = i14;
                    int i19 = 0;
                    while (true) {
                        if (i19 >= i17) {
                            j691Var = j691Var3;
                            i2 = 0;
                            y1a1 y1a1Var4 = gVar2.y;
                            g.g(y1a1Var4);
                            y1a1Var4.C.a("Failed to read events from database in reasonable time");
                            arrayList = null;
                            break;
                        }
                        try {
                            SQLiteDatabase Mg = i15.Mg();
                            if (Mg == null) {
                                try {
                                    try {
                                        i15.x = true;
                                        j691Var = j691Var3;
                                        break;
                                    } catch (Throwable th) {
                                        th = th;
                                        sQLiteDatabase = Mg;
                                        cursor = null;
                                        if (cursor != null) {
                                        }
                                        if (sQLiteDatabase != null) {
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteDatabaseLockedException unused) {
                                    j691Var = j691Var3;
                                    str = str9;
                                    i3 = i19;
                                    str3 = str8;
                                    sQLiteDatabase = Mg;
                                    i4 = 5;
                                    str2 = str7;
                                    cursor2 = null;
                                    try {
                                        SystemClock.sleep(i18);
                                        i18 += 20;
                                        if (cursor2 != null) {
                                        }
                                        if (sQLiteDatabase == null) {
                                        }
                                        sQLiteDatabase.close();
                                        i19 = i3 + 1;
                                        i17 = i4;
                                        str7 = str2;
                                        str8 = str3;
                                        j691Var3 = j691Var;
                                        str9 = str;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        cursor = cursor2;
                                        if (cursor != null) {
                                        }
                                        if (sQLiteDatabase != null) {
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteFullException e) {
                                    e = e;
                                    j691Var = j691Var3;
                                    str = str9;
                                    i3 = i19;
                                    str3 = str8;
                                    sQLiteDatabase = Mg;
                                    i4 = 5;
                                    str2 = str7;
                                    cursor2 = null;
                                    y1a1 y1a1Var5 = gVar2.y;
                                    g.g(y1a1Var5);
                                    y1a1Var5.z.b(e, "Error reading entries from local database");
                                    i15.x = true;
                                    if (cursor2 != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i19 = i3 + 1;
                                    i17 = i4;
                                    str7 = str2;
                                    str8 = str3;
                                    j691Var3 = j691Var;
                                    str9 = str;
                                } catch (SQLiteException e2) {
                                    e = e2;
                                    j691Var = j691Var3;
                                    str = str9;
                                    i3 = i19;
                                    str3 = str8;
                                    sQLiteDatabase = Mg;
                                    i4 = 5;
                                    str2 = str7;
                                    cursor2 = null;
                                    if (sQLiteDatabase != null) {
                                    }
                                    y1a1 y1a1Var6 = gVar2.y;
                                    g.g(y1a1Var6);
                                    y1a1Var6.z.b(e, "Error reading entries from local database");
                                    i15.x = true;
                                    if (cursor2 != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i19 = i3 + 1;
                                    i17 = i4;
                                    str7 = str2;
                                    str8 = str3;
                                    j691Var3 = j691Var;
                                    str9 = str;
                                }
                            } else {
                                Mg.beginTransaction();
                                try {
                                    cursor3 = Mg.query("messages", new String[]{str9}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
                                    try {
                                        long j6 = -1;
                                        if (cursor3.moveToFirst()) {
                                            i3 = i19;
                                            try {
                                                j = cursor3.getLong(0);
                                                try {
                                                    cursor3.close();
                                                } catch (SQLiteDatabaseLockedException unused2) {
                                                    j691Var = j691Var3;
                                                    str = str9;
                                                    str3 = str8;
                                                    sQLiteDatabase = Mg;
                                                    i4 = 5;
                                                    str2 = str7;
                                                    cursor2 = null;
                                                    SystemClock.sleep(i18);
                                                    i18 += 20;
                                                    if (cursor2 != null) {
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                    }
                                                    sQLiteDatabase.close();
                                                    i19 = i3 + 1;
                                                    i17 = i4;
                                                    str7 = str2;
                                                    str8 = str3;
                                                    j691Var3 = j691Var;
                                                    str9 = str;
                                                } catch (SQLiteFullException e3) {
                                                    e = e3;
                                                    j691Var = j691Var3;
                                                    str = str9;
                                                    str3 = str8;
                                                    sQLiteDatabase = Mg;
                                                    i4 = 5;
                                                    str2 = str7;
                                                    cursor2 = null;
                                                    y1a1 y1a1Var52 = gVar2.y;
                                                    g.g(y1a1Var52);
                                                    y1a1Var52.z.b(e, "Error reading entries from local database");
                                                    i15.x = true;
                                                    if (cursor2 != null) {
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                    }
                                                    sQLiteDatabase.close();
                                                    i19 = i3 + 1;
                                                    i17 = i4;
                                                    str7 = str2;
                                                    str8 = str3;
                                                    j691Var3 = j691Var;
                                                    str9 = str;
                                                } catch (SQLiteException e4) {
                                                    e = e4;
                                                    j691Var = j691Var3;
                                                    str = str9;
                                                    str3 = str8;
                                                    sQLiteDatabase = Mg;
                                                    i4 = 5;
                                                    str2 = str7;
                                                    cursor2 = null;
                                                    if (sQLiteDatabase != null) {
                                                    }
                                                    y1a1 y1a1Var62 = gVar2.y;
                                                    g.g(y1a1Var62);
                                                    y1a1Var62.z.b(e, "Error reading entries from local database");
                                                    i15.x = true;
                                                    if (cursor2 != null) {
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                    }
                                                    sQLiteDatabase.close();
                                                    i19 = i3 + 1;
                                                    i17 = i4;
                                                    str7 = str2;
                                                    str8 = str3;
                                                    j691Var3 = j691Var;
                                                    str9 = str;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                j691Var = j691Var3;
                                                str = str9;
                                                str3 = str8;
                                                sQLiteDatabase = Mg;
                                                i4 = 5;
                                                str2 = str7;
                                                if (cursor3 != null) {
                                                    try {
                                                        cursor3.close();
                                                    } catch (SQLiteDatabaseLockedException unused3) {
                                                        cursor2 = null;
                                                        SystemClock.sleep(i18);
                                                        i18 += 20;
                                                        if (cursor2 != null) {
                                                        }
                                                        if (sQLiteDatabase == null) {
                                                        }
                                                        sQLiteDatabase.close();
                                                        i19 = i3 + 1;
                                                        i17 = i4;
                                                        str7 = str2;
                                                        str8 = str3;
                                                        j691Var3 = j691Var;
                                                        str9 = str;
                                                    } catch (SQLiteFullException e5) {
                                                        e = e5;
                                                        cursor2 = null;
                                                        y1a1 y1a1Var522 = gVar2.y;
                                                        g.g(y1a1Var522);
                                                        y1a1Var522.z.b(e, "Error reading entries from local database");
                                                        i15.x = true;
                                                        if (cursor2 != null) {
                                                        }
                                                        if (sQLiteDatabase == null) {
                                                        }
                                                        sQLiteDatabase.close();
                                                        i19 = i3 + 1;
                                                        i17 = i4;
                                                        str7 = str2;
                                                        str8 = str3;
                                                        j691Var3 = j691Var;
                                                        str9 = str;
                                                    } catch (SQLiteException e6) {
                                                        e = e6;
                                                        cursor2 = null;
                                                        if (sQLiteDatabase != null) {
                                                        }
                                                        y1a1 y1a1Var622 = gVar2.y;
                                                        g.g(y1a1Var622);
                                                        y1a1Var622.z.b(e, "Error reading entries from local database");
                                                        i15.x = true;
                                                        if (cursor2 != null) {
                                                        }
                                                        if (sQLiteDatabase == null) {
                                                        }
                                                        sQLiteDatabase.close();
                                                        i19 = i3 + 1;
                                                        i17 = i4;
                                                        str7 = str2;
                                                        str8 = str3;
                                                        j691Var3 = j691Var;
                                                        str9 = str;
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        cursor = null;
                                                        if (cursor != null) {
                                                        }
                                                        if (sQLiteDatabase != null) {
                                                        }
                                                        throw th;
                                                    }
                                                }
                                                throw th;
                                            }
                                        } else {
                                            i3 = i19;
                                            cursor3.close();
                                            j = -1;
                                        }
                                        if (j != -1) {
                                            str4 = "rowid<?";
                                            strArr = new String[]{String.valueOf(j)};
                                        } else {
                                            str4 = null;
                                            strArr = null;
                                        }
                                        try {
                                            String[] strArr2 = {str9, str8, str7};
                                            j691 j691Var4 = gVar2.w;
                                            gw91 gw91Var2 = nw91.b1;
                                            str = str9;
                                            try {
                                                try {
                                                    i5 = 4;
                                                    i6 = 3;
                                                    if (j691Var4.Qg(null, gw91Var2)) {
                                                        i7 = 5;
                                                        try {
                                                            strArr2 = new String[]{str, str8, str7, StartupRequest.PARAM_APP_VERSION, "app_version_int"};
                                                        } catch (SQLiteDatabaseLockedException unused4) {
                                                            i4 = 5;
                                                            j691Var = j691Var3;
                                                            str3 = str8;
                                                            sQLiteDatabase = Mg;
                                                            str2 = str7;
                                                            cursor2 = null;
                                                            SystemClock.sleep(i18);
                                                            i18 += 20;
                                                            if (cursor2 != null) {
                                                            }
                                                            if (sQLiteDatabase == null) {
                                                            }
                                                            sQLiteDatabase.close();
                                                            i19 = i3 + 1;
                                                            i17 = i4;
                                                            str7 = str2;
                                                            str8 = str3;
                                                            j691Var3 = j691Var;
                                                            str9 = str;
                                                        } catch (SQLiteFullException e7) {
                                                            e = e7;
                                                            i4 = 5;
                                                            j691Var = j691Var3;
                                                            str3 = str8;
                                                            sQLiteDatabase = Mg;
                                                            str2 = str7;
                                                            cursor2 = null;
                                                            y1a1 y1a1Var5222 = gVar2.y;
                                                            g.g(y1a1Var5222);
                                                            y1a1Var5222.z.b(e, "Error reading entries from local database");
                                                            i15.x = true;
                                                            if (cursor2 != null) {
                                                            }
                                                            if (sQLiteDatabase == null) {
                                                            }
                                                            sQLiteDatabase.close();
                                                            i19 = i3 + 1;
                                                            i17 = i4;
                                                            str7 = str2;
                                                            str8 = str3;
                                                            j691Var3 = j691Var;
                                                            str9 = str;
                                                        } catch (SQLiteException e8) {
                                                            e = e8;
                                                            i4 = 5;
                                                            j691Var = j691Var3;
                                                            str3 = str8;
                                                            sQLiteDatabase = Mg;
                                                            str2 = str7;
                                                            cursor2 = null;
                                                            if (sQLiteDatabase != null) {
                                                            }
                                                            y1a1 y1a1Var6222 = gVar2.y;
                                                            g.g(y1a1Var6222);
                                                            y1a1Var6222.z.b(e, "Error reading entries from local database");
                                                            i15.x = true;
                                                            if (cursor2 != null) {
                                                            }
                                                            if (sQLiteDatabase == null) {
                                                            }
                                                            sQLiteDatabase.close();
                                                            i19 = i3 + 1;
                                                            i17 = i4;
                                                            str7 = str2;
                                                            str8 = str3;
                                                            j691Var3 = j691Var;
                                                            str9 = str;
                                                        }
                                                    } else {
                                                        i7 = 5;
                                                    }
                                                } catch (SQLiteDatabaseLockedException unused5) {
                                                    j691Var = j691Var3;
                                                    str3 = str8;
                                                    sQLiteDatabase = Mg;
                                                    str2 = str7;
                                                    i4 = 5;
                                                    cursor2 = null;
                                                    SystemClock.sleep(i18);
                                                    i18 += 20;
                                                    if (cursor2 != null) {
                                                        cursor2.close();
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                        i19 = i3 + 1;
                                                        i17 = i4;
                                                        str7 = str2;
                                                        str8 = str3;
                                                        j691Var3 = j691Var;
                                                        str9 = str;
                                                    }
                                                    sQLiteDatabase.close();
                                                    i19 = i3 + 1;
                                                    i17 = i4;
                                                    str7 = str2;
                                                    str8 = str3;
                                                    j691Var3 = j691Var;
                                                    str9 = str;
                                                }
                                                try {
                                                    Cursor query = Mg.query("messages", strArr2, str4, strArr, null, null, "rowid asc", Integer.toString(i16));
                                                    while (query.moveToNext()) {
                                                        try {
                                                            try {
                                                                try {
                                                                    j6 = query.getLong(0);
                                                                    try {
                                                                        int i20 = query.getInt(1);
                                                                        str2 = str7;
                                                                        try {
                                                                            byte[] blob = query.getBlob(2);
                                                                            str3 = str8;
                                                                            try {
                                                                                if (gVar2.w.Qg(null, gw91Var2)) {
                                                                                    try {
                                                                                        str5 = query.getString(i6);
                                                                                        cursor4 = query;
                                                                                        j691Var = j691Var3;
                                                                                        j2 = query.getLong(i5);
                                                                                    } catch (SQLiteDatabaseLockedException unused6) {
                                                                                        cursor2 = query;
                                                                                        j691Var = j691Var3;
                                                                                        sQLiteDatabase = Mg;
                                                                                        i4 = 5;
                                                                                        SystemClock.sleep(i18);
                                                                                        i18 += 20;
                                                                                        if (cursor2 != null) {
                                                                                        }
                                                                                        if (sQLiteDatabase == null) {
                                                                                        }
                                                                                        sQLiteDatabase.close();
                                                                                        i19 = i3 + 1;
                                                                                        i17 = i4;
                                                                                        str7 = str2;
                                                                                        str8 = str3;
                                                                                        j691Var3 = j691Var;
                                                                                        str9 = str;
                                                                                    } catch (SQLiteFullException e9) {
                                                                                        e = e9;
                                                                                        cursor2 = query;
                                                                                        j691Var = j691Var3;
                                                                                        sQLiteDatabase = Mg;
                                                                                        i4 = 5;
                                                                                        y1a1 y1a1Var52222 = gVar2.y;
                                                                                        g.g(y1a1Var52222);
                                                                                        y1a1Var52222.z.b(e, "Error reading entries from local database");
                                                                                        i15.x = true;
                                                                                        if (cursor2 != null) {
                                                                                        }
                                                                                        if (sQLiteDatabase == null) {
                                                                                        }
                                                                                        sQLiteDatabase.close();
                                                                                        i19 = i3 + 1;
                                                                                        i17 = i4;
                                                                                        str7 = str2;
                                                                                        str8 = str3;
                                                                                        j691Var3 = j691Var;
                                                                                        str9 = str;
                                                                                    } catch (SQLiteException e10) {
                                                                                        e = e10;
                                                                                        cursor2 = query;
                                                                                        j691Var = j691Var3;
                                                                                        sQLiteDatabase = Mg;
                                                                                        i4 = 5;
                                                                                        if (sQLiteDatabase != null) {
                                                                                        }
                                                                                        y1a1 y1a1Var62222 = gVar2.y;
                                                                                        g.g(y1a1Var62222);
                                                                                        y1a1Var62222.z.b(e, "Error reading entries from local database");
                                                                                        i15.x = true;
                                                                                        if (cursor2 != null) {
                                                                                        }
                                                                                        if (sQLiteDatabase == null) {
                                                                                        }
                                                                                        sQLiteDatabase.close();
                                                                                        i19 = i3 + 1;
                                                                                        i17 = i4;
                                                                                        str7 = str2;
                                                                                        str8 = str3;
                                                                                        j691Var3 = j691Var;
                                                                                        str9 = str;
                                                                                    }
                                                                                } else {
                                                                                    cursor4 = query;
                                                                                    j691Var = j691Var3;
                                                                                    j2 = 0;
                                                                                    str5 = null;
                                                                                }
                                                                                if (i20 == 0) {
                                                                                    cursor2 = cursor4;
                                                                                    try {
                                                                                        try {
                                                                                            obtain = Parcel.obtain();
                                                                                            try {
                                                                                                try {
                                                                                                    gw91Var = gw91Var2;
                                                                                                } finally {
                                                                                                }
                                                                                            } catch (SafeParcelReader$ParseException unused7) {
                                                                                                gw91Var = gw91Var2;
                                                                                            }
                                                                                            try {
                                                                                                obtain.unmarshall(blob, 0, blob.length);
                                                                                                obtain.setDataPosition(0);
                                                                                                zzbg createFromParcel = zzbg.CREATOR.createFromParcel(obtain);
                                                                                                if (createFromParcel != null) {
                                                                                                    arrayList.add(new rz91(createFromParcel, str5, j2));
                                                                                                }
                                                                                            } catch (SafeParcelReader$ParseException unused8) {
                                                                                                y1a1 y1a1Var7 = gVar2.y;
                                                                                                g.g(y1a1Var7);
                                                                                                y1a1Var7.z.a("Failed to load event from local database");
                                                                                                obtain.recycle();
                                                                                                i8 = 3;
                                                                                                i6 = i8;
                                                                                                str7 = str2;
                                                                                                str8 = str3;
                                                                                                j691Var3 = j691Var;
                                                                                                query = cursor2;
                                                                                                gw91Var2 = gw91Var;
                                                                                                i5 = 4;
                                                                                            }
                                                                                        } catch (Throwable th5) {
                                                                                            th = th5;
                                                                                            sQLiteDatabase = Mg;
                                                                                            cursor = cursor2;
                                                                                            if (cursor != null) {
                                                                                                cursor.close();
                                                                                            }
                                                                                            if (sQLiteDatabase != null) {
                                                                                                sQLiteDatabase.close();
                                                                                            }
                                                                                            throw th;
                                                                                        }
                                                                                    } catch (SQLiteDatabaseLockedException unused9) {
                                                                                        sQLiteDatabase = Mg;
                                                                                        i4 = 5;
                                                                                        SystemClock.sleep(i18);
                                                                                        i18 += 20;
                                                                                        if (cursor2 != null) {
                                                                                        }
                                                                                        if (sQLiteDatabase == null) {
                                                                                        }
                                                                                        sQLiteDatabase.close();
                                                                                        i19 = i3 + 1;
                                                                                        i17 = i4;
                                                                                        str7 = str2;
                                                                                        str8 = str3;
                                                                                        j691Var3 = j691Var;
                                                                                        str9 = str;
                                                                                    } catch (SQLiteFullException e11) {
                                                                                        e = e11;
                                                                                        sQLiteDatabase = Mg;
                                                                                        i4 = 5;
                                                                                        y1a1 y1a1Var522222 = gVar2.y;
                                                                                        g.g(y1a1Var522222);
                                                                                        y1a1Var522222.z.b(e, "Error reading entries from local database");
                                                                                        i15.x = true;
                                                                                        if (cursor2 != null) {
                                                                                        }
                                                                                        if (sQLiteDatabase == null) {
                                                                                        }
                                                                                        sQLiteDatabase.close();
                                                                                        i19 = i3 + 1;
                                                                                        i17 = i4;
                                                                                        str7 = str2;
                                                                                        str8 = str3;
                                                                                        j691Var3 = j691Var;
                                                                                        str9 = str;
                                                                                    } catch (SQLiteException e12) {
                                                                                        e = e12;
                                                                                        sQLiteDatabase = Mg;
                                                                                        i4 = 5;
                                                                                        if (sQLiteDatabase != null) {
                                                                                        }
                                                                                        y1a1 y1a1Var622222 = gVar2.y;
                                                                                        g.g(y1a1Var622222);
                                                                                        y1a1Var622222.z.b(e, "Error reading entries from local database");
                                                                                        i15.x = true;
                                                                                        if (cursor2 != null) {
                                                                                        }
                                                                                        if (sQLiteDatabase == null) {
                                                                                        }
                                                                                        sQLiteDatabase.close();
                                                                                        i19 = i3 + 1;
                                                                                        i17 = i4;
                                                                                        str7 = str2;
                                                                                        str8 = str3;
                                                                                        j691Var3 = j691Var;
                                                                                        str9 = str;
                                                                                    }
                                                                                } else {
                                                                                    cursor2 = cursor4;
                                                                                    gw91Var = gw91Var2;
                                                                                    if (i20 == 1) {
                                                                                        obtain = Parcel.obtain();
                                                                                        try {
                                                                                            try {
                                                                                                obtain.unmarshall(blob, 0, blob.length);
                                                                                                obtain.setDataPosition(0);
                                                                                                zzplVar = zzpl.CREATOR.createFromParcel(obtain);
                                                                                            } finally {
                                                                                            }
                                                                                        } catch (SafeParcelReader$ParseException unused10) {
                                                                                            y1a1 y1a1Var8 = gVar2.y;
                                                                                            g.g(y1a1Var8);
                                                                                            y1a1Var8.z.a("Failed to load user property from local database");
                                                                                            obtain.recycle();
                                                                                            zzplVar = null;
                                                                                        }
                                                                                        if (zzplVar != null) {
                                                                                            arrayList.add(new rz91(zzplVar, str5, j2));
                                                                                        }
                                                                                    } else if (i20 == 2) {
                                                                                        obtain = Parcel.obtain();
                                                                                        try {
                                                                                            try {
                                                                                                obtain.unmarshall(blob, 0, blob.length);
                                                                                                obtain.setDataPosition(0);
                                                                                                zzahVar = zzah.CREATOR.createFromParcel(obtain);
                                                                                            } catch (SafeParcelReader$ParseException unused11) {
                                                                                                y1a1 y1a1Var9 = gVar2.y;
                                                                                                g.g(y1a1Var9);
                                                                                                y1a1Var9.z.a("Failed to load conditional user property from local database");
                                                                                                obtain.recycle();
                                                                                                zzahVar = null;
                                                                                            }
                                                                                            if (zzahVar != null) {
                                                                                                arrayList.add(new rz91(zzahVar, str5, j2));
                                                                                            }
                                                                                        } finally {
                                                                                        }
                                                                                    } else {
                                                                                        if (i20 == 4) {
                                                                                            try {
                                                                                                obtain = Parcel.obtain();
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            obtain.unmarshall(blob, 0, blob.length);
                                                                                                            obtain.setDataPosition(0);
                                                                                                            zzbeVar = zzbe.CREATOR.createFromParcel(obtain);
                                                                                                        } catch (SafeParcelReader$ParseException unused12) {
                                                                                                            y1a1 y1a1Var10 = gVar2.y;
                                                                                                            g.g(y1a1Var10);
                                                                                                            y1a1Var10.z.a("Failed to load default event parameters from local database");
                                                                                                            obtain.recycle();
                                                                                                            zzbeVar = null;
                                                                                                            if (zzbeVar != null) {
                                                                                                            }
                                                                                                            i8 = 3;
                                                                                                            i6 = i8;
                                                                                                            str7 = str2;
                                                                                                            str8 = str3;
                                                                                                            j691Var3 = j691Var;
                                                                                                            query = cursor2;
                                                                                                            gw91Var2 = gw91Var;
                                                                                                            i5 = 4;
                                                                                                        }
                                                                                                    } catch (Throwable th6) {
                                                                                                        th = th6;
                                                                                                        throw th;
                                                                                                    }
                                                                                                } catch (SafeParcelReader$ParseException unused13) {
                                                                                                } catch (Throwable th7) {
                                                                                                    th = th7;
                                                                                                }
                                                                                            } catch (SQLiteDatabaseLockedException unused14) {
                                                                                                sQLiteDatabase = Mg;
                                                                                                i4 = 5;
                                                                                                SystemClock.sleep(i18);
                                                                                                i18 += 20;
                                                                                                if (cursor2 != null) {
                                                                                                }
                                                                                                if (sQLiteDatabase == null) {
                                                                                                }
                                                                                                sQLiteDatabase.close();
                                                                                                i19 = i3 + 1;
                                                                                                i17 = i4;
                                                                                                str7 = str2;
                                                                                                str8 = str3;
                                                                                                j691Var3 = j691Var;
                                                                                                str9 = str;
                                                                                            } catch (SQLiteFullException e13) {
                                                                                                e = e13;
                                                                                                sQLiteDatabase = Mg;
                                                                                                i4 = 5;
                                                                                                y1a1 y1a1Var5222222 = gVar2.y;
                                                                                                g.g(y1a1Var5222222);
                                                                                                y1a1Var5222222.z.b(e, "Error reading entries from local database");
                                                                                                i15.x = true;
                                                                                                if (cursor2 != null) {
                                                                                                }
                                                                                                if (sQLiteDatabase == null) {
                                                                                                }
                                                                                                sQLiteDatabase.close();
                                                                                                i19 = i3 + 1;
                                                                                                i17 = i4;
                                                                                                str7 = str2;
                                                                                                str8 = str3;
                                                                                                j691Var3 = j691Var;
                                                                                                str9 = str;
                                                                                            } catch (SQLiteException e14) {
                                                                                                e = e14;
                                                                                                sQLiteDatabase = Mg;
                                                                                                i4 = 5;
                                                                                                if (sQLiteDatabase != null) {
                                                                                                    sQLiteDatabase.endTransaction();
                                                                                                }
                                                                                                y1a1 y1a1Var6222222 = gVar2.y;
                                                                                                g.g(y1a1Var6222222);
                                                                                                y1a1Var6222222.z.b(e, "Error reading entries from local database");
                                                                                                i15.x = true;
                                                                                                if (cursor2 != null) {
                                                                                                }
                                                                                                if (sQLiteDatabase == null) {
                                                                                                }
                                                                                                sQLiteDatabase.close();
                                                                                                i19 = i3 + 1;
                                                                                                i17 = i4;
                                                                                                str7 = str2;
                                                                                                str8 = str3;
                                                                                                j691Var3 = j691Var;
                                                                                                str9 = str;
                                                                                            }
                                                                                            try {
                                                                                                if (zzbeVar != null) {
                                                                                                    arrayList.add(new rz91(zzbeVar, str5, j2));
                                                                                                }
                                                                                                i8 = 3;
                                                                                            } catch (SQLiteDatabaseLockedException unused15) {
                                                                                                sQLiteDatabase = Mg;
                                                                                                i4 = 5;
                                                                                                SystemClock.sleep(i18);
                                                                                                i18 += 20;
                                                                                                if (cursor2 != null) {
                                                                                                }
                                                                                                if (sQLiteDatabase == null) {
                                                                                                }
                                                                                                sQLiteDatabase.close();
                                                                                                i19 = i3 + 1;
                                                                                                i17 = i4;
                                                                                                str7 = str2;
                                                                                                str8 = str3;
                                                                                                j691Var3 = j691Var;
                                                                                                str9 = str;
                                                                                            } catch (SQLiteFullException e15) {
                                                                                                e = e15;
                                                                                                sQLiteDatabase = Mg;
                                                                                                i4 = 5;
                                                                                                y1a1 y1a1Var52222222 = gVar2.y;
                                                                                                g.g(y1a1Var52222222);
                                                                                                y1a1Var52222222.z.b(e, "Error reading entries from local database");
                                                                                                i15.x = true;
                                                                                                if (cursor2 != null) {
                                                                                                }
                                                                                                if (sQLiteDatabase == null) {
                                                                                                }
                                                                                                sQLiteDatabase.close();
                                                                                                i19 = i3 + 1;
                                                                                                i17 = i4;
                                                                                                str7 = str2;
                                                                                                str8 = str3;
                                                                                                j691Var3 = j691Var;
                                                                                                str9 = str;
                                                                                            } catch (SQLiteException e16) {
                                                                                                e = e16;
                                                                                                sQLiteDatabase = Mg;
                                                                                                i4 = 5;
                                                                                                if (sQLiteDatabase != null) {
                                                                                                }
                                                                                                y1a1 y1a1Var62222222 = gVar2.y;
                                                                                                g.g(y1a1Var62222222);
                                                                                                y1a1Var62222222.z.b(e, "Error reading entries from local database");
                                                                                                i15.x = true;
                                                                                                if (cursor2 != null) {
                                                                                                }
                                                                                                if (sQLiteDatabase == null) {
                                                                                                }
                                                                                                sQLiteDatabase.close();
                                                                                                i19 = i3 + 1;
                                                                                                i17 = i4;
                                                                                                str7 = str2;
                                                                                                str8 = str3;
                                                                                                j691Var3 = j691Var;
                                                                                                str9 = str;
                                                                                            }
                                                                                        } else {
                                                                                            y1a1 y1a1Var11 = gVar2.y;
                                                                                            i8 = 3;
                                                                                            if (i20 == 3) {
                                                                                                g.g(y1a1Var11);
                                                                                                y1a1Var11.H.a("Skipping app launch break");
                                                                                            } else {
                                                                                                g.g(y1a1Var11);
                                                                                                y1a1Var11.z.a("Unknown record type in local database");
                                                                                            }
                                                                                        }
                                                                                        i6 = i8;
                                                                                        str7 = str2;
                                                                                        str8 = str3;
                                                                                        j691Var3 = j691Var;
                                                                                        query = cursor2;
                                                                                        gw91Var2 = gw91Var;
                                                                                        i5 = 4;
                                                                                    }
                                                                                }
                                                                                i8 = 3;
                                                                                i6 = i8;
                                                                                str7 = str2;
                                                                                str8 = str3;
                                                                                j691Var3 = j691Var;
                                                                                query = cursor2;
                                                                                gw91Var2 = gw91Var;
                                                                                i5 = 4;
                                                                            } catch (SQLiteDatabaseLockedException unused16) {
                                                                                cursor2 = query;
                                                                                j691Var = j691Var3;
                                                                            } catch (SQLiteFullException e17) {
                                                                                e = e17;
                                                                                cursor2 = query;
                                                                                j691Var = j691Var3;
                                                                            } catch (SQLiteException e18) {
                                                                                e = e18;
                                                                                cursor2 = query;
                                                                                j691Var = j691Var3;
                                                                            }
                                                                        } catch (SQLiteDatabaseLockedException unused17) {
                                                                            cursor2 = query;
                                                                            j691Var = j691Var3;
                                                                            str3 = str8;
                                                                            sQLiteDatabase = Mg;
                                                                            i4 = 5;
                                                                            SystemClock.sleep(i18);
                                                                            i18 += 20;
                                                                            if (cursor2 != null) {
                                                                            }
                                                                            if (sQLiteDatabase == null) {
                                                                            }
                                                                            sQLiteDatabase.close();
                                                                            i19 = i3 + 1;
                                                                            i17 = i4;
                                                                            str7 = str2;
                                                                            str8 = str3;
                                                                            j691Var3 = j691Var;
                                                                            str9 = str;
                                                                        } catch (SQLiteFullException e19) {
                                                                            e = e19;
                                                                            cursor2 = query;
                                                                            j691Var = j691Var3;
                                                                            str3 = str8;
                                                                            sQLiteDatabase = Mg;
                                                                            i4 = 5;
                                                                            y1a1 y1a1Var522222222 = gVar2.y;
                                                                            g.g(y1a1Var522222222);
                                                                            y1a1Var522222222.z.b(e, "Error reading entries from local database");
                                                                            i15.x = true;
                                                                            if (cursor2 != null) {
                                                                            }
                                                                            if (sQLiteDatabase == null) {
                                                                            }
                                                                            sQLiteDatabase.close();
                                                                            i19 = i3 + 1;
                                                                            i17 = i4;
                                                                            str7 = str2;
                                                                            str8 = str3;
                                                                            j691Var3 = j691Var;
                                                                            str9 = str;
                                                                        } catch (SQLiteException e20) {
                                                                            e = e20;
                                                                            cursor2 = query;
                                                                            j691Var = j691Var3;
                                                                            str3 = str8;
                                                                            sQLiteDatabase = Mg;
                                                                            i4 = 5;
                                                                            if (sQLiteDatabase != null) {
                                                                            }
                                                                            y1a1 y1a1Var622222222 = gVar2.y;
                                                                            g.g(y1a1Var622222222);
                                                                            y1a1Var622222222.z.b(e, "Error reading entries from local database");
                                                                            i15.x = true;
                                                                            if (cursor2 != null) {
                                                                            }
                                                                            if (sQLiteDatabase == null) {
                                                                            }
                                                                            sQLiteDatabase.close();
                                                                            i19 = i3 + 1;
                                                                            i17 = i4;
                                                                            str7 = str2;
                                                                            str8 = str3;
                                                                            j691Var3 = j691Var;
                                                                            str9 = str;
                                                                        }
                                                                    } catch (SQLiteDatabaseLockedException unused18) {
                                                                        cursor2 = query;
                                                                        j691Var = j691Var3;
                                                                        str2 = str7;
                                                                    } catch (SQLiteFullException e21) {
                                                                        e = e21;
                                                                        cursor2 = query;
                                                                        j691Var = j691Var3;
                                                                        str2 = str7;
                                                                    } catch (SQLiteException e22) {
                                                                        e = e22;
                                                                        cursor2 = query;
                                                                        j691Var = j691Var3;
                                                                        str2 = str7;
                                                                    }
                                                                } catch (SQLiteDatabaseLockedException unused19) {
                                                                    cursor2 = query;
                                                                    j691Var = j691Var3;
                                                                    str2 = str7;
                                                                    str3 = str8;
                                                                } catch (SQLiteFullException e23) {
                                                                    e = e23;
                                                                    cursor2 = query;
                                                                    j691Var = j691Var3;
                                                                    str2 = str7;
                                                                    str3 = str8;
                                                                } catch (SQLiteException e24) {
                                                                    e = e24;
                                                                    cursor2 = query;
                                                                    j691Var = j691Var3;
                                                                    str2 = str7;
                                                                    str3 = str8;
                                                                }
                                                            } catch (Throwable th8) {
                                                                th = th8;
                                                                cursor2 = query;
                                                            }
                                                        } catch (SQLiteDatabaseLockedException unused20) {
                                                            cursor2 = query;
                                                            j691Var = j691Var3;
                                                            str2 = str7;
                                                            str3 = str8;
                                                        } catch (SQLiteFullException e25) {
                                                            e = e25;
                                                            cursor2 = query;
                                                            j691Var = j691Var3;
                                                            str2 = str7;
                                                            str3 = str8;
                                                        } catch (SQLiteException e26) {
                                                            e = e26;
                                                            cursor2 = query;
                                                            j691Var = j691Var3;
                                                            str2 = str7;
                                                            str3 = str8;
                                                        }
                                                    }
                                                    cursor2 = query;
                                                    j691Var = j691Var3;
                                                    str2 = str7;
                                                    str3 = str8;
                                                    i2 = 0;
                                                    sQLiteDatabase = Mg;
                                                } catch (SQLiteDatabaseLockedException unused21) {
                                                    j691Var = j691Var3;
                                                    str3 = str8;
                                                    sQLiteDatabase = Mg;
                                                    str2 = str7;
                                                    i4 = i7;
                                                    cursor2 = null;
                                                    SystemClock.sleep(i18);
                                                    i18 += 20;
                                                    if (cursor2 != null) {
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                    }
                                                    sQLiteDatabase.close();
                                                    i19 = i3 + 1;
                                                    i17 = i4;
                                                    str7 = str2;
                                                    str8 = str3;
                                                    j691Var3 = j691Var;
                                                    str9 = str;
                                                }
                                            } catch (SQLiteFullException e27) {
                                                e = e27;
                                                j691Var = j691Var3;
                                                str3 = str8;
                                                sQLiteDatabase = Mg;
                                                str2 = str7;
                                                i4 = 5;
                                                cursor2 = null;
                                                y1a1 y1a1Var5222222222 = gVar2.y;
                                                g.g(y1a1Var5222222222);
                                                y1a1Var5222222222.z.b(e, "Error reading entries from local database");
                                                i15.x = true;
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                if (sQLiteDatabase == null) {
                                                    i19 = i3 + 1;
                                                    i17 = i4;
                                                    str7 = str2;
                                                    str8 = str3;
                                                    j691Var3 = j691Var;
                                                    str9 = str;
                                                }
                                                sQLiteDatabase.close();
                                                i19 = i3 + 1;
                                                i17 = i4;
                                                str7 = str2;
                                                str8 = str3;
                                                j691Var3 = j691Var;
                                                str9 = str;
                                            } catch (SQLiteException e28) {
                                                e = e28;
                                                j691Var = j691Var3;
                                                str3 = str8;
                                                sQLiteDatabase = Mg;
                                                str2 = str7;
                                                i4 = 5;
                                                cursor2 = null;
                                                if (sQLiteDatabase != null && sQLiteDatabase.inTransaction()) {
                                                    sQLiteDatabase.endTransaction();
                                                }
                                                y1a1 y1a1Var6222222222 = gVar2.y;
                                                g.g(y1a1Var6222222222);
                                                y1a1Var6222222222.z.b(e, "Error reading entries from local database");
                                                i15.x = true;
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                if (sQLiteDatabase == null) {
                                                    i19 = i3 + 1;
                                                    i17 = i4;
                                                    str7 = str2;
                                                    str8 = str3;
                                                    j691Var3 = j691Var;
                                                    str9 = str;
                                                }
                                                sQLiteDatabase.close();
                                                i19 = i3 + 1;
                                                i17 = i4;
                                                str7 = str2;
                                                str8 = str3;
                                                j691Var3 = j691Var;
                                                str9 = str;
                                            }
                                        } catch (SQLiteDatabaseLockedException unused22) {
                                            j691Var = j691Var3;
                                            str = str9;
                                        } catch (SQLiteFullException e29) {
                                            e = e29;
                                            j691Var = j691Var3;
                                            str = str9;
                                        } catch (SQLiteException e30) {
                                            e = e30;
                                            j691Var = j691Var3;
                                            str = str9;
                                        }
                                        try {
                                            if (sQLiteDatabase.delete("messages", "rowid <= ?", new String[]{Long.toString(j6)}) < arrayList.size()) {
                                                y1a1 y1a1Var12 = gVar2.y;
                                                g.g(y1a1Var12);
                                                y1a1Var12.z.a("Fewer entries removed from local database than expected");
                                            }
                                            sQLiteDatabase.setTransactionSuccessful();
                                            sQLiteDatabase.endTransaction();
                                            cursor2.close();
                                            sQLiteDatabase.close();
                                        } catch (SQLiteDatabaseLockedException unused23) {
                                            i4 = 5;
                                            SystemClock.sleep(i18);
                                            i18 += 20;
                                            if (cursor2 != null) {
                                            }
                                            if (sQLiteDatabase == null) {
                                            }
                                            sQLiteDatabase.close();
                                            i19 = i3 + 1;
                                            i17 = i4;
                                            str7 = str2;
                                            str8 = str3;
                                            j691Var3 = j691Var;
                                            str9 = str;
                                        } catch (SQLiteFullException e31) {
                                            e = e31;
                                            i4 = 5;
                                            y1a1 y1a1Var52222222222 = gVar2.y;
                                            g.g(y1a1Var52222222222);
                                            y1a1Var52222222222.z.b(e, "Error reading entries from local database");
                                            i15.x = true;
                                            if (cursor2 != null) {
                                            }
                                            if (sQLiteDatabase == null) {
                                            }
                                            sQLiteDatabase.close();
                                            i19 = i3 + 1;
                                            i17 = i4;
                                            str7 = str2;
                                            str8 = str3;
                                            j691Var3 = j691Var;
                                            str9 = str;
                                        } catch (SQLiteException e32) {
                                            e = e32;
                                            i4 = 5;
                                            if (sQLiteDatabase != null) {
                                            }
                                            y1a1 y1a1Var62222222222 = gVar2.y;
                                            g.g(y1a1Var62222222222);
                                            y1a1Var62222222222.z.b(e, "Error reading entries from local database");
                                            i15.x = true;
                                            if (cursor2 != null) {
                                            }
                                            if (sQLiteDatabase == null) {
                                            }
                                            sQLiteDatabase.close();
                                            i19 = i3 + 1;
                                            i17 = i4;
                                            str7 = str2;
                                            str8 = str3;
                                            j691Var3 = j691Var;
                                            str9 = str;
                                        }
                                    } catch (Throwable th9) {
                                        th = th9;
                                        i3 = i19;
                                    }
                                } catch (Throwable th10) {
                                    th = th10;
                                    j691Var = j691Var3;
                                    str = str9;
                                    i3 = i19;
                                    str3 = str8;
                                    sQLiteDatabase = Mg;
                                    i4 = 5;
                                    str2 = str7;
                                    cursor3 = null;
                                }
                            }
                        } catch (SQLiteDatabaseLockedException unused24) {
                            j691Var = j691Var3;
                            str = str9;
                            i3 = i19;
                            str2 = str7;
                            str3 = str8;
                            i4 = 5;
                            sQLiteDatabase = null;
                        } catch (SQLiteFullException e33) {
                            e = e33;
                            j691Var = j691Var3;
                            str = str9;
                            i3 = i19;
                            str2 = str7;
                            str3 = str8;
                            i4 = 5;
                            sQLiteDatabase = null;
                        } catch (SQLiteException e34) {
                            e = e34;
                            j691Var = j691Var3;
                            str = str9;
                            i3 = i19;
                            str2 = str7;
                            str3 = str8;
                            i4 = 5;
                            sQLiteDatabase = null;
                        } catch (Throwable th11) {
                            th = th11;
                            cursor = null;
                            sQLiteDatabase = null;
                        }
                        i19 = i3 + 1;
                        i17 = i4;
                        str7 = str2;
                        str8 = str3;
                        j691Var3 = j691Var;
                        str9 = str;
                    }
                    if (arrayList != null) {
                        arrayList2.addAll(arrayList);
                        i9 = arrayList.size();
                    } else {
                        i9 = i2;
                    }
                    if (abstractSafeParcelable2 != null && i9 < i16) {
                        arrayList2.add(new rz91(abstractSafeParcelable2, zzrVar2.zzc, zzrVar2.zzj));
                    }
                    j691 j691Var5 = j691Var;
                    String str10 = null;
                    boolean Qg = j691Var5.Qg(null, nw91.O0);
                    size = arrayList2.size();
                    i10 = i2;
                    while (i10 < size) {
                        rz91 rz91Var = (rz91) arrayList2.get(i10);
                        AbstractSafeParcelable abstractSafeParcelable3 = rz91Var.a;
                        gw91 gw91Var3 = nw91.b1;
                        if (j691Var5.Qg(str10, gw91Var3)) {
                            String str11 = rz91Var.b;
                            if (!TextUtils.isEmpty(str11)) {
                                j691Var2 = j691Var5;
                                i11 = i9;
                                zzrVar2 = new zzr(zzrVar2.zza, zzrVar2.zzb, str11, rz91Var.c, zzrVar2.zzd, zzrVar2.zze, zzrVar2.zzf, zzrVar2.zzg, zzrVar2.zzh, zzrVar2.zzi, zzrVar2.zzk, zzrVar2.zzl, zzrVar2.zzm, zzrVar2.zzn, zzrVar2.zzo, zzrVar2.zzp, zzrVar2.zzq, zzrVar2.zzr, zzrVar2.zzs, zzrVar2.zzt, zzrVar2.zzu, zzrVar2.zzv, zzrVar2.zzw, zzrVar2.zzx, zzrVar2.zzy, zzrVar2.zzz, zzrVar2.zzA, zzrVar2.zzB, zzrVar2.zzC, zzrVar2.zzD, zzrVar2.zzE);
                                if (abstractSafeParcelable3 instanceof zzbg) {
                                    y1a1Var2 = y1a1Var;
                                    if (abstractSafeParcelable3 instanceof zzpl) {
                                        try {
                                            zzgbVar.zzf((zzpl) abstractSafeParcelable3, zzrVar2);
                                        } catch (RemoteException e35) {
                                            g.g(y1a1Var2);
                                            y1a1Var2.z.b(e35, "Failed to send user property to the service");
                                        }
                                    } else if (abstractSafeParcelable3 instanceof zzah) {
                                        try {
                                            zzgbVar.zzn((zzah) abstractSafeParcelable3, zzrVar2);
                                        } catch (RemoteException e36) {
                                            g.g(y1a1Var2);
                                            y1a1Var2.z.b(e36, "Failed to send conditional user property to the service");
                                        }
                                    } else {
                                        str6 = null;
                                        if (j691Var2.Qg(null, gw91Var3) && (abstractSafeParcelable3 instanceof zzbe)) {
                                            try {
                                                zzgbVar.zzu(((zzbe) abstractSafeParcelable3).zzf(), zzrVar2);
                                            } catch (RemoteException e37) {
                                                g.g(y1a1Var2);
                                                y1a1Var2.z.b(e37, "Failed to send default event parameters to the service");
                                            }
                                        } else {
                                            g.g(y1a1Var2);
                                            y1a1Var2.z.a("Discarding data. Unrecognized parcel type.");
                                        }
                                        i10++;
                                        y1a1Var = y1a1Var2;
                                        j691Var5 = j691Var2;
                                        i9 = i11;
                                        str10 = str6;
                                    }
                                } else {
                                    if (Qg) {
                                        try {
                                            kl40Var.getClass();
                                            currentTimeMillis = System.currentTimeMillis();
                                        } catch (RemoteException e38) {
                                            e = e38;
                                            j3 = 0;
                                            j4 = 0;
                                        }
                                        try {
                                            kl40Var.getClass();
                                            j3 = SystemClock.elapsedRealtime();
                                            j5 = currentTimeMillis;
                                        } catch (RemoteException e39) {
                                            e = e39;
                                            j4 = currentTimeMillis;
                                            j3 = 0;
                                            y1a1Var2 = y1a1Var;
                                            g.g(y1a1Var2);
                                            y1a1Var2.z.b(e, "Failed to send event to the service");
                                            if (Qg) {
                                                p891 b = p891.b(gVar3);
                                                kl40Var.getClass();
                                                long currentTimeMillis2 = System.currentTimeMillis();
                                                kl40Var.getClass();
                                                b.e(13, (int) (SystemClock.elapsedRealtime() - j3), j4, currentTimeMillis2);
                                            }
                                            str6 = null;
                                            i10++;
                                            y1a1Var = y1a1Var2;
                                            j691Var5 = j691Var2;
                                            i9 = i11;
                                            str10 = str6;
                                        }
                                    } else {
                                        j3 = 0;
                                        j5 = 0;
                                    }
                                    try {
                                        zzgbVar.zze((zzbg) abstractSafeParcelable3, zzrVar2);
                                        if (Qg) {
                                            g.g(y1a1Var);
                                            y1a1Var2 = y1a1Var;
                                            try {
                                                y1a1Var2.H.a("Logging telemetry for logEvent from database");
                                                p891 b2 = p891.b(gVar3);
                                                kl40Var.getClass();
                                                long currentTimeMillis3 = System.currentTimeMillis();
                                                kl40Var.getClass();
                                                b2.e(0, (int) (SystemClock.elapsedRealtime() - j3), j5, currentTimeMillis3);
                                            } catch (RemoteException e40) {
                                                e = e40;
                                                j4 = j5;
                                                g.g(y1a1Var2);
                                                y1a1Var2.z.b(e, "Failed to send event to the service");
                                                if (Qg && j4 != 0) {
                                                    p891 b3 = p891.b(gVar3);
                                                    kl40Var.getClass();
                                                    long currentTimeMillis22 = System.currentTimeMillis();
                                                    kl40Var.getClass();
                                                    b3.e(13, (int) (SystemClock.elapsedRealtime() - j3), j4, currentTimeMillis22);
                                                }
                                                str6 = null;
                                                i10++;
                                                y1a1Var = y1a1Var2;
                                                j691Var5 = j691Var2;
                                                i9 = i11;
                                                str10 = str6;
                                            }
                                        } else {
                                            y1a1Var2 = y1a1Var;
                                        }
                                    } catch (RemoteException e41) {
                                        e = e41;
                                        y1a1Var2 = y1a1Var;
                                    }
                                }
                                str6 = null;
                                i10++;
                                y1a1Var = y1a1Var2;
                                j691Var5 = j691Var2;
                                i9 = i11;
                                str10 = str6;
                            }
                        }
                        i11 = i9;
                        j691Var2 = j691Var5;
                        if (abstractSafeParcelable3 instanceof zzbg) {
                        }
                        str6 = null;
                        i10++;
                        y1a1Var = y1a1Var2;
                        j691Var5 = j691Var2;
                        i9 = i11;
                        str10 = str6;
                    }
                    int i21 = i9;
                    i14 = i + 1;
                    y1a1Var3 = y1a1Var;
                    j691Var3 = j691Var5;
                    gVar = gVar3;
                    kl40Var2 = kl40Var;
                    i13 = i21;
                    i12 = 100;
                    abstractSafeParcelable2 = abstractSafeParcelable;
                } else {
                    y1a1Var = y1a1Var3;
                    j691Var = j691Var3;
                    i = i14;
                    i2 = 0;
                    if (arrayList != null) {
                    }
                    if (abstractSafeParcelable2 != null) {
                        arrayList2.add(new rz91(abstractSafeParcelable2, zzrVar2.zzc, zzrVar2.zzj));
                    }
                    j691 j691Var52 = j691Var;
                    String str102 = null;
                    boolean Qg2 = j691Var52.Qg(null, nw91.O0);
                    size = arrayList2.size();
                    i10 = i2;
                    while (i10 < size) {
                    }
                    int i212 = i9;
                    i14 = i + 1;
                    y1a1Var3 = y1a1Var;
                    j691Var3 = j691Var52;
                    gVar = gVar3;
                    kl40Var2 = kl40Var;
                    i13 = i212;
                    i12 = 100;
                    abstractSafeParcelable2 = abstractSafeParcelable;
                }
            }
            arrayList = null;
            i2 = 0;
            if (arrayList != null) {
            }
            if (abstractSafeParcelable2 != null) {
            }
            j691 j691Var522 = j691Var;
            String str1022 = null;
            boolean Qg22 = j691Var522.Qg(null, nw91.O0);
            size = arrayList2.size();
            i10 = i2;
            while (i10 < size) {
            }
            int i2122 = i9;
            i14 = i + 1;
            y1a1Var3 = y1a1Var;
            j691Var3 = j691Var522;
            gVar = gVar3;
            kl40Var2 = kl40Var;
            i13 = i2122;
            i12 = 100;
            abstractSafeParcelable2 = abstractSafeParcelable;
        }
    }

    public final void Zg(zzah zzahVar) {
        boolean Ng;
        Gg();
        Hg();
        g gVar = (g) this.b;
        gVar.getClass();
        c i = gVar.i();
        g gVar2 = (g) i.b;
        g.e(gVar2.B);
        byte[] jh = ieb1.jh(zzahVar);
        if (jh.length > 131072) {
            y1a1 y1a1Var = gVar2.y;
            g.g(y1a1Var);
            y1a1Var.A.a("Conditional user property too long for local database. Sending directly to service");
            Ng = false;
        } else {
            Ng = i.Ng(2, jh);
        }
        Ug(new rz(this, Wg(true), Ng, new zzah(zzahVar)));
    }
}
