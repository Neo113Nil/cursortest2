package com.google.firebase.crashlytics.internal.common;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonReader;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzw;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import defpackage.atx0;
import defpackage.b44;
import defpackage.bkg0;
import defpackage.c3f;
import defpackage.c44;
import defpackage.c54;
import defpackage.c6v;
import defpackage.d3f;
import defpackage.d44;
import defpackage.dlx;
import defpackage.ds6;
import defpackage.dwk0;
import defpackage.e3f;
import defpackage.g3f;
import defpackage.h44;
import defpackage.hek0;
import defpackage.hgz;
import defpackage.i44;
import defpackage.i450;
import defpackage.i54;
import defpackage.j0r;
import defpackage.j3f;
import defpackage.j450;
import defpackage.jp21;
import defpackage.k84;
import defpackage.kju0;
import defpackage.krb1;
import defpackage.kyq;
import defpackage.l44;
import defpackage.l84;
import defpackage.lb7;
import defpackage.m820;
import defpackage.m84;
import defpackage.mh;
import defpackage.n2f;
import defpackage.n44;
import defpackage.n84;
import defpackage.ny61;
import defpackage.o501;
import defpackage.p1b;
import defpackage.p2f;
import defpackage.q1r;
import defpackage.q44;
import defpackage.q5z;
import defpackage.r2f;
import defpackage.s44;
import defpackage.t44;
import defpackage.u0r0;
import defpackage.u44;
import defpackage.u54;
import defpackage.udq0;
import defpackage.uo2;
import defpackage.w32;
import defpackage.w44;
import defpackage.w77;
import defpackage.y2f;
import defpackage.y34;
import defpackage.yx1;
import defpackage.z34;
import defpackage.z64;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCSP.CStructReader.BlobHeaderStructure;
import ru.cprocsp.ACSP.tools.common.CSPDirectoryConstants;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

/* loaded from: classes.dex */
public final class a {
    public static final n2f s = new n2f(1);
    public static final Charset t = Charset.forName("UTF-8");
    public final Context a;
    public final uo2 b;
    public final lb7 c;
    public final jp21 d;
    public final com.google.firebase.crashlytics.internal.concurrency.a e;
    public final c6v f;
    public final q1r g;
    public final yx1 h;
    public final lb7 i;
    public final y2f j;
    public final w32 k;
    public final p2f l;
    public final u0r0 m;
    public j3f n;
    public final atx0 o = new atx0();
    public final atx0 p = new atx0();
    public final atx0 q = new atx0();
    public final AtomicBoolean r = new AtomicBoolean(false);

    public a(Context context, c6v c6vVar, uo2 uo2Var, q1r q1rVar, lb7 lb7Var, yx1 yx1Var, jp21 jp21Var, lb7 lb7Var2, u0r0 u0r0Var, y2f y2fVar, w32 w32Var, p2f p2fVar, com.google.firebase.crashlytics.internal.concurrency.a aVar) {
        this.a = context;
        this.f = c6vVar;
        this.b = uo2Var;
        this.g = q1rVar;
        this.c = lb7Var;
        this.h = yx1Var;
        this.d = jp21Var;
        this.i = lb7Var2;
        this.j = y2fVar;
        this.k = w32Var;
        this.l = p2fVar;
        this.m = u0r0Var;
        this.e = aVar;
    }

    public static zzw a(a aVar) {
        zzw h;
        aVar.getClass();
        ArrayList arrayList = new ArrayList();
        q1r q1rVar = aVar.g;
        for (File file : q1r.f(q1rVar.c.listFiles(s))) {
            try {
                long parseLong = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    h = udq0.p(null);
                } catch (ClassNotFoundException unused) {
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    h = udq0.h(new ScheduledThreadPoolExecutor(1), new r2f(aVar, parseLong));
                }
                arrayList.add(h);
            } catch (NumberFormatException unused2) {
                file.getName();
            }
            file.delete();
        }
        return udq0.U(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x06d9 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0558 A[LOOP:3: B:98:0x0558->B:100:0x055e, LOOP_START] */
    /* JADX WARN: Type inference failed for: r15v11, types: [kyq] */
    /* JADX WARN: Type inference failed for: r23v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(boolean z, com.google.firebase.crashlytics.internal.settings.a aVar, boolean z2) {
        int i;
        int i2;
        boolean z3;
        boolean z4;
        String str;
        q1r q1rVar;
        NavigableSet<String> c;
        int size;
        int i3;
        c3f n;
        String e;
        boolean z5;
        String[] list;
        j0r j0rVar;
        w77 w77Var;
        List historicalProcessExitReasons;
        List list2;
        ApplicationExitInfo applicationExitInfo;
        String str2;
        int importance;
        String processName;
        int reason;
        long timestamp;
        int pid;
        long pss;
        long rss;
        int i4;
        List list3;
        InputStream traceInputStream;
        long timestamp2;
        int reason2;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        com.google.firebase.crashlytics.internal.concurrency.a.a();
        ArrayList arrayList = new ArrayList(this.m.b.c());
        int i5 = 2;
        if (arrayList.size() <= z) {
            Log.isLoggable("FirebaseCrashlytics", 2);
            return;
        }
        String str3 = (String) arrayList.get(z == true ? 1 : 0);
        if (!z2 || !aVar.b().b.b) {
            i = 2;
            i2 = 4;
            Log.isLoggable("FirebaseCrashlytics", 2);
        } else if (Build.VERSION.SDK_INT >= 30) {
            historicalProcessExitReasons = ((ActivityManager) this.a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
            if (historicalProcessExitReasons.size() != 0) {
                lb7 lb7Var = new lb7(this.g, str3);
                q1r q1rVar2 = this.g;
                com.google.firebase.crashlytics.internal.concurrency.a aVar2 = this.e;
                m820 m820Var = new m820(q1rVar2);
                jp21 jp21Var = new jp21(str3, q1rVar2, aVar2);
                i2 = 4;
                ((dlx) ((AtomicMarkableReference) jp21Var.d.c).getReference()).c(m820Var.c(str3, false));
                ((dlx) ((AtomicMarkableReference) jp21Var.e.c).getReference()).c(m820Var.c(str3, true));
                jp21Var.g.set(m820Var.d(str3), false);
                dwk0 dwk0Var = jp21Var.f;
                File c2 = q1rVar2.c(str3, "rollouts-state");
                if (!c2.exists() || c2.length() == 0) {
                    m820.g(c2, "The file has a length of zero for session: " + str3);
                    list2 = Collections.EMPTY_LIST;
                } else {
                    try {
                        fileInputStream2 = new FileInputStream(c2);
                        try {
                            try {
                                list2 = m820.b(CommonUtils.j(fileInputStream2));
                                list2.toString();
                                Log.isLoggable("FirebaseCrashlytics", 3);
                                CommonUtils.b(fileInputStream2, "Failed to close rollouts state file.");
                            } catch (Exception unused) {
                                m820.f(c2);
                                CommonUtils.b(fileInputStream2, "Failed to close rollouts state file.");
                                list2 = Collections.EMPTY_LIST;
                                List list4 = list2;
                                synchronized (dwk0Var) {
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            fileInputStream = fileInputStream2;
                            CommonUtils.b(fileInputStream, "Failed to close rollouts state file.");
                            throw th;
                        }
                    } catch (Exception unused2) {
                        fileInputStream2 = null;
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream = null;
                        CommonUtils.b(fileInputStream, "Failed to close rollouts state file.");
                        throw th;
                    }
                }
                List list42 = list2;
                synchronized (dwk0Var) {
                    dwk0Var.a.clear();
                    int size2 = list42.size();
                    int i6 = dwk0Var.b;
                    if (size2 > i6) {
                        dwk0Var.a.addAll(list42.subList(0, i6));
                    } else {
                        dwk0Var.a.addAll(list42);
                    }
                }
                u0r0 u0r0Var = this.m;
                g3f g3fVar = u0r0Var.b;
                long lastModified = g3fVar.b.c(str3, "start-time").lastModified();
                Iterator it = historicalProcessExitReasons.iterator();
                while (it.hasNext()) {
                    applicationExitInfo = mh.g(it.next());
                    timestamp2 = applicationExitInfo.getTimestamp();
                    if (timestamp2 < lastModified) {
                        break;
                    }
                    reason2 = applicationExitInfo.getReason();
                    if (reason2 == 6) {
                        break;
                    }
                }
                applicationExitInfo = null;
                if (applicationExitInfo == null) {
                    Log.isLoggable("FirebaseCrashlytics", 2);
                    i4 = 2;
                } else {
                    d3f d3fVar = u0r0Var.a;
                    try {
                        traceInputStream = applicationExitInfo.getTraceInputStream();
                    } catch (IOException e2) {
                        applicationExitInfo.toString();
                        e2.toString();
                    }
                    if (traceInputStream != null) {
                        str2 = u0r0.c(traceInputStream);
                        b44 b44Var = new b44();
                        importance = applicationExitInfo.getImportance();
                        b44Var.c(importance);
                        processName = applicationExitInfo.getProcessName();
                        b44Var.e(processName);
                        reason = applicationExitInfo.getReason();
                        b44Var.g(reason);
                        timestamp = applicationExitInfo.getTimestamp();
                        b44Var.i(timestamp);
                        pid = applicationExitInfo.getPid();
                        b44Var.d(pid);
                        pss = applicationExitInfo.getPss();
                        b44Var.f(pss);
                        rss = applicationExitInfo.getRss();
                        b44Var.h(rss);
                        b44Var.j(str2);
                        c44 a = b44Var.a();
                        int i7 = d3fVar.a.getResources().getConfiguration().orientation;
                        s44 s44Var = new s44();
                        s44Var.g("anr");
                        s44Var.f(a.g);
                        yx1 yx1Var = d3fVar.c;
                        if (d3fVar.e.b().b.c || ((ArrayList) yx1Var.c).size() <= 0) {
                            i4 = 2;
                            list3 = null;
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = ((ArrayList) yx1Var.c).iterator();
                            while (it2.hasNext()) {
                                ds6 ds6Var = (ds6) it2.next();
                                int i8 = i5;
                                d44 d44Var = new d44();
                                d44Var.d(ds6Var.c());
                                d44Var.b(ds6Var.a());
                                d44Var.c(ds6Var.b());
                                arrayList2.add(d44Var.a());
                                i5 = i8;
                            }
                            i4 = i5;
                            list3 = Collections.unmodifiableList(arrayList2);
                        }
                        b44 b44Var2 = new b44();
                        b44Var2.c(a.d);
                        b44Var2.e(a.b);
                        b44Var2.g(a.c);
                        b44Var2.i(a.g);
                        b44Var2.d(a.a);
                        b44Var2.f(a.e);
                        b44Var2.h(a.f);
                        b44Var2.j(a.h);
                        b44Var2.b(list3);
                        c44 a2 = b44Var2.a();
                        boolean z6 = a2.d == 100;
                        u44 u44Var = new u44();
                        u44Var.c(Boolean.valueOf(z6));
                        String str4 = a2.b;
                        int i9 = a2.a;
                        int i10 = a2.d;
                        i54 i54Var = new i54();
                        i54Var.a = str4;
                        i54Var.b = i9;
                        byte b = (byte) (i54Var.e | 1);
                        i54Var.c = i10;
                        i54Var.d = false;
                        i54Var.e = (byte) (((byte) (b | 2)) | 4);
                        u44Var.d(i54Var.a());
                        u44Var.h(i7);
                        w44 w44Var = new w44();
                        w44Var.b(a2);
                        c54 c54Var = new c54();
                        c54Var.d("0");
                        c54Var.c("0");
                        c54Var.b(0L);
                        w44Var.e(c54Var.a());
                        w44Var.c(d3fVar.a());
                        u44Var.f(w44Var.a());
                        s44Var.b(u44Var.a());
                        s44Var.c(d3fVar.b(i7));
                        t44 a3 = s44Var.a();
                        Log.isLoggable("FirebaseCrashlytics", 3);
                        g3fVar.d(u0r0.b(u0r0.a(a3, lb7Var, jp21Var, Collections.EMPTY_MAP), jp21Var), str3, true);
                    }
                    str2 = null;
                    b44 b44Var3 = new b44();
                    importance = applicationExitInfo.getImportance();
                    b44Var3.c(importance);
                    processName = applicationExitInfo.getProcessName();
                    b44Var3.e(processName);
                    reason = applicationExitInfo.getReason();
                    b44Var3.g(reason);
                    timestamp = applicationExitInfo.getTimestamp();
                    b44Var3.i(timestamp);
                    pid = applicationExitInfo.getPid();
                    b44Var3.d(pid);
                    pss = applicationExitInfo.getPss();
                    b44Var3.f(pss);
                    rss = applicationExitInfo.getRss();
                    b44Var3.h(rss);
                    b44Var3.j(str2);
                    c44 a4 = b44Var3.a();
                    int i72 = d3fVar.a.getResources().getConfiguration().orientation;
                    s44 s44Var2 = new s44();
                    s44Var2.g("anr");
                    s44Var2.f(a4.g);
                    yx1 yx1Var2 = d3fVar.c;
                    if (d3fVar.e.b().b.c) {
                    }
                    i4 = 2;
                    list3 = null;
                    b44 b44Var22 = new b44();
                    b44Var22.c(a4.d);
                    b44Var22.e(a4.b);
                    b44Var22.g(a4.c);
                    b44Var22.i(a4.g);
                    b44Var22.d(a4.a);
                    b44Var22.f(a4.e);
                    b44Var22.h(a4.f);
                    b44Var22.j(a4.h);
                    b44Var22.b(list3);
                    c44 a22 = b44Var22.a();
                    if (a22.d == 100) {
                    }
                    u44 u44Var2 = new u44();
                    u44Var2.c(Boolean.valueOf(z6));
                    String str42 = a22.b;
                    int i92 = a22.a;
                    int i102 = a22.d;
                    i54 i54Var2 = new i54();
                    i54Var2.a = str42;
                    i54Var2.b = i92;
                    byte b2 = (byte) (i54Var2.e | 1);
                    i54Var2.c = i102;
                    i54Var2.d = false;
                    i54Var2.e = (byte) (((byte) (b2 | 2)) | 4);
                    u44Var2.d(i54Var2.a());
                    u44Var2.h(i72);
                    w44 w44Var2 = new w44();
                    w44Var2.b(a22);
                    c54 c54Var2 = new c54();
                    c54Var2.d("0");
                    c54Var2.c("0");
                    c54Var2.b(0L);
                    w44Var2.e(c54Var2.a());
                    w44Var2.c(d3fVar.a());
                    u44Var2.f(w44Var2.a());
                    s44Var2.b(u44Var2.a());
                    s44Var2.c(d3fVar.b(i72));
                    t44 a32 = s44Var2.a();
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    g3fVar.d(u0r0.b(u0r0.a(a32, lb7Var, jp21Var, Collections.EMPTY_MAP), jp21Var), str3, true);
                }
                i = i4;
            } else {
                i2 = 4;
                i = 2;
                Log.isLoggable("FirebaseCrashlytics", 2);
            }
        } else {
            i = 2;
            i2 = 4;
            Log.isLoggable("FirebaseCrashlytics", 2);
        }
        if (z2 && this.j.d(str3)) {
            q1r q1rVar3 = this.g;
            Log.isLoggable("FirebaseCrashlytics", i);
            j450 a5 = this.j.a(str3);
            File c3 = a5.c();
            c3f.a b3 = a5.b();
            if (c3 != null) {
                c3.exists();
            }
            if (b3 == null) {
                Log.i("FirebaseCrashlytics", "No Tombstones data found for session " + str3, null);
            }
            if ((c3 != null && c3.exists()) || b3 != null) {
                long lastModified2 = c3.lastModified();
                j0r j0rVar2 = lb7.x;
                if (str3 != null) {
                    j0rVar2 = new bkg0(q1rVar3.c(str3, "userlog"));
                }
                File b4 = q1rVar3.b(str3);
                if (b4.isDirectory()) {
                    d(lastModified2);
                    byte[] a6 = j0rVar2.a();
                    File c4 = q1rVar3.c(str3, "user-data");
                    File c5 = q1rVar3.c(str3, CSPDirectoryConstants.SUBDIRECTORY_KEYS);
                    File c6 = q1rVar3.c(str3, "rollouts-state");
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(new w77("logs_file", "logs", a6));
                    arrayList3.add(new kyq(a5.g(), "crash_meta_file", kju0.j));
                    arrayList3.add(new kyq(a5.f(), "session_meta_file", "session"));
                    arrayList3.add(new kyq(a5.d(), "app_meta_file", "app"));
                    arrayList3.add(new kyq(a5.a(), "device_meta_file", "device"));
                    arrayList3.add(new kyq(a5.e(), "os_meta_file", "os"));
                    File c7 = a5.c();
                    if (c7 == null || !c7.exists()) {
                        j0rVar = j0rVar2;
                        z3 = true;
                        w77Var = new w77("minidump_file", "minidump", new byte[]{0});
                    } else {
                        ?? kyqVar = new kyq(c7, "minidump_file", "minidump");
                        j0rVar = j0rVar2;
                        z3 = true;
                        w77Var = kyqVar;
                    }
                    arrayList3.add(w77Var);
                    arrayList3.add(new kyq(c4, "user_meta_file", "user"));
                    arrayList3.add(new kyq(c5, "keys_file", CSPDirectoryConstants.SUBDIRECTORY_KEYS));
                    arrayList3.add(new kyq(c6, "rollouts_file", "rollouts"));
                    krb1.d(b4, arrayList3);
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    u0r0 u0r0Var2 = this.m;
                    u0r0Var2.getClass();
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        c3f.d.b b5 = ((i450) it3.next()).b();
                        if (b5 != null) {
                            arrayList4.add(b5);
                        }
                    }
                    g3f g3fVar2 = u0r0Var2.b;
                    h44 h44Var = new h44();
                    h44Var.b(Collections.unmodifiableList(arrayList4));
                    i44 a7 = h44Var.a();
                    q1r q1rVar4 = g3fVar2.b;
                    File c8 = q1rVar4.c(str3, "report");
                    c8.toString();
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    String a8 = g3fVar2.d.a(str3);
                    try {
                        e3f e3fVar = g3f.g;
                        String e3 = g3f.e(c8);
                        e3fVar.getClass();
                        y34 m = e3f.i(e3).m();
                        m.j = null;
                        m.k = a7;
                        z34 a9 = m.a();
                        if (b3 != null) {
                            y34 m2 = a9.m();
                            m2.l = b3;
                            a9 = m2.a();
                        }
                        g3f.f(new File(q1rVar4.g, str3), e3f.a.k(a9.n(a8)));
                    } catch (IOException unused3) {
                        Objects.toString(c8);
                    }
                    j0rVar.c();
                    if (z == 0) {
                        z4 = false;
                        str = (String) arrayList.get(0);
                    } else {
                        z4 = false;
                        this.l.b(null);
                        str = null;
                    }
                    u0r0 u0r0Var3 = this.m;
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    g3f g3fVar3 = u0r0Var3.b;
                    q1rVar = g3fVar3.b;
                    q1rVar.a(".com.google.firebase.crashlytics");
                    q1rVar.a(".com.google.firebase.crashlytics-ndk");
                    if (!q1rVar.a.isEmpty()) {
                        q1rVar.a(".com.google.firebase.crashlytics.files.v1");
                        final String str5 = ".com.google.firebase.crashlytics.files.v2" + File.pathSeparator;
                        File file = q1rVar.b;
                        if (file.exists() && (list = file.list(new FilenameFilter() { // from class: p1r
                            @Override // java.io.FilenameFilter
                            public final boolean accept(File file2, String str6) {
                                return str6.startsWith(str5);
                            }
                        })) != null) {
                            int length = list.length;
                            for (?? r7 = z4; r7 < length; r7++) {
                                q1rVar.a(list[r7]);
                            }
                        }
                    }
                    c = g3fVar3.c();
                    if (str != null) {
                        c.remove(str);
                    }
                    if (c.size() > 8) {
                        while (c.size() > 8) {
                            String str6 = (String) c.last();
                            Log.isLoggable("FirebaseCrashlytics", 3);
                            q1r.e(new File(q1rVar.d, str6));
                            c.remove(str6);
                        }
                    }
                    for (String str7 : c) {
                        Log.isLoggable("FirebaseCrashlytics", 2);
                        e3f e3fVar2 = g3f.g;
                        n2f n2fVar = g3f.i;
                        File file2 = new File(q1rVar.d, str7);
                        file2.mkdirs();
                        List<File> f = q1r.f(file2.listFiles(n2fVar));
                        if (f.isEmpty()) {
                            Log.isLoggable("FirebaseCrashlytics", 2);
                        } else {
                            Collections.sort(f);
                            ArrayList arrayList5 = new ArrayList();
                            boolean z7 = z4;
                            for (File file3 : f) {
                                try {
                                    e = g3f.e(file3);
                                    e3fVar2.getClass();
                                } catch (IOException unused4) {
                                    Objects.toString(file3);
                                }
                                try {
                                    JsonReader jsonReader = new JsonReader(new StringReader(e));
                                    try {
                                        c3f.e.d e4 = e3f.e(jsonReader);
                                        jsonReader.close();
                                        arrayList5.add(e4);
                                        if (!z7) {
                                            String name = file3.getName();
                                            if (!name.startsWith(DatabaseHelper.OttTrackingTable.COLUMN_EVENT) || !name.endsWith("_")) {
                                                z5 = false;
                                                z7 = z5;
                                            }
                                        }
                                        z5 = z3;
                                        z7 = z5;
                                    } finally {
                                    }
                                } catch (IllegalStateException e5) {
                                    throw new IOException(e5);
                                }
                            }
                            if (!arrayList5.isEmpty()) {
                                String d = new m820(q1rVar).d(str7);
                                String a10 = g3fVar3.d.a(str7);
                                File c9 = q1rVar.c(str7, "report");
                                try {
                                    String e6 = g3f.e(c9);
                                    e3fVar2.getClass();
                                    n = e3f.i(e6).o(d, currentTimeMillis, z7).n(a10);
                                } catch (IOException unused5) {
                                }
                                if (((z34) n).k == null) {
                                    throw new IllegalStateException("Reports without sessions cannot have events added to them.");
                                }
                                y34 m3 = n.m();
                                l44 m4 = ((z34) n).k.m();
                                m4.k = arrayList5;
                                m3.j = m4.a();
                                z34 a11 = m3.a();
                                c3f.e eVar = a11.k;
                                if (eVar != null) {
                                    try {
                                        Log.isLoggable("FirebaseCrashlytics", 3);
                                        g3f.f(z7 ? new File(q1rVar.f, eVar.h()) : new File(q1rVar.e, eVar.h()), e3f.a.k(a11));
                                    } catch (IOException unused6) {
                                    }
                                    q1r.e(new File(q1rVar.d, str7));
                                    z4 = false;
                                }
                                Objects.toString(c9);
                                q1r.e(new File(q1rVar.d, str7));
                                z4 = false;
                            }
                        }
                        q1r.e(new File(q1rVar.d, str7));
                        z4 = false;
                    }
                    hgz hgzVar = g3fVar3.c.b().a;
                    ArrayList b6 = g3fVar3.b();
                    size = b6.size();
                    i3 = i2;
                    if (size > i3) {
                        return;
                    }
                    Iterator it4 = b6.subList(i3, size).iterator();
                    while (it4.hasNext()) {
                        ((File) it4.next()).delete();
                    }
                    return;
                }
            }
        }
        z3 = true;
        if (z == 0) {
        }
        u0r0 u0r0Var32 = this.m;
        long currentTimeMillis2 = System.currentTimeMillis() / 1000;
        g3f g3fVar32 = u0r0Var32.b;
        q1rVar = g3fVar32.b;
        q1rVar.a(".com.google.firebase.crashlytics");
        q1rVar.a(".com.google.firebase.crashlytics-ndk");
        if (!q1rVar.a.isEmpty()) {
        }
        c = g3fVar32.c();
        if (str != null) {
        }
        if (c.size() > 8) {
        }
        while (r6.hasNext()) {
        }
        hgz hgzVar2 = g3fVar32.c.b().a;
        ArrayList b62 = g3fVar32.b();
        size = b62.size();
        i3 = i2;
        if (size > i3) {
        }
    }

    public final void c(String str, Boolean bool) {
        String str2;
        Integer num;
        Map unmodifiableMap;
        List unmodifiableList;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        Log.isLoggable("FirebaseCrashlytics", 3);
        Locale locale = Locale.US;
        c6v c6vVar = this.f;
        yx1 yx1Var = this.h;
        l84 l84Var = new l84(c6vVar.c, (String) yx1Var.f, (String) yx1Var.g, ((z64) c6vVar.c()).a, (((String) yx1Var.d) != null ? DeliveryMechanism.APP_STORE : DeliveryMechanism.DEVELOPER).a(), (lb7) yx1Var.h);
        String str3 = Build.VERSION.RELEASE;
        String str4 = Build.VERSION.CODENAME;
        n84 n84Var = new n84(CommonUtils.h());
        Context context = this.a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int ordinal = CommonUtils.Architecture.a().ordinal();
        String str5 = Build.MODEL;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long a = CommonUtils.a(context);
        boolean g = CommonUtils.g();
        int d = CommonUtils.d();
        String str6 = Build.MANUFACTURER;
        String str7 = Build.PRODUCT;
        this.j.c(str, currentTimeMillis, new k84(l84Var, n84Var, new m84(ordinal, availableProcessors, a, statFs.getBlockCount() * statFs.getBlockSize(), g, d)));
        if (!bool.booleanValue() || str == null) {
            str2 = str7;
        } else {
            jp21 jp21Var = this.d;
            synchronized (jp21Var.c) {
                jp21Var.c = str;
                dlx dlxVar = (dlx) ((AtomicMarkableReference) jp21Var.d.c).getReference();
                synchronized (dlxVar) {
                    unmodifiableMap = Collections.unmodifiableMap(new HashMap(dlxVar.a));
                }
                dwk0 dwk0Var = jp21Var.f;
                synchronized (dwk0Var) {
                    unmodifiableList = Collections.unmodifiableList(new ArrayList(dwk0Var.a));
                }
                str2 = str7;
                jp21Var.b.b.a(new hek0(jp21Var, str, unmodifiableMap, unmodifiableList, 7));
            }
        }
        lb7 lb7Var = this.i;
        ((j0r) lb7Var.c).f();
        lb7Var.c = lb7.x;
        if (str != null) {
            lb7Var.c = new bkg0(((q1r) lb7Var.b).c(str, "userlog"));
        }
        this.l.b(str);
        u0r0 u0r0Var = this.m;
        d3f d3fVar = u0r0Var.a;
        Charset charset = c3f.a;
        y34 y34Var = new y34();
        y34Var.a = "20.0.3";
        yx1 yx1Var2 = d3fVar.c;
        String str8 = (String) yx1Var2.a;
        if (str8 == null) {
            ny61.t("Null gmpAppId");
            return;
        }
        y34Var.b = str8;
        c6v c6vVar2 = d3fVar.b;
        String str9 = ((z64) c6vVar2.c()).a;
        if (str9 == null) {
            ny61.t("Null installationUuid");
            return;
        }
        y34Var.d = str9;
        y34Var.e = ((z64) c6vVar2.c()).b;
        y34Var.f = ((z64) c6vVar2.c()).c;
        String str10 = (String) yx1Var2.f;
        if (str10 == null) {
            ny61.t("Null buildVersion");
            return;
        }
        y34Var.h = str10;
        String str11 = (String) yx1Var2.g;
        if (str11 == null) {
            ny61.t("Null displayVersion");
            return;
        }
        y34Var.i = str11;
        y34Var.c = 4;
        y34Var.m = (byte) (y34Var.m | 1);
        l44 l44Var = new l44();
        l44Var.b(false);
        l44Var.d = currentTimeMillis;
        l44Var.m = (byte) (l44Var.m | 1);
        if (str == null) {
            ny61.t("Null identifier");
            return;
        }
        l44Var.b = str;
        String str12 = d3f.g;
        if (str12 == null) {
            ny61.t("Null generator");
            return;
        }
        l44Var.a = str12;
        n44 n44Var = new n44();
        String str13 = c6vVar2.c;
        if (str13 == null) {
            ny61.t("Null identifier");
            return;
        }
        n44Var.a = str13;
        n44Var.b = str10;
        n44Var.c = str11;
        n44Var.d = ((z64) c6vVar2.c()).a;
        lb7 lb7Var2 = (lb7) yx1Var2.h;
        n44Var.e = lb7Var2.s().a;
        n44Var.f = lb7Var2.s().b;
        l44Var.g = n44Var.a();
        u54 u54Var = new u54();
        u54Var.a = 3;
        u54Var.e = (byte) (u54Var.e | 1);
        if (str3 == null) {
            ny61.t("Null version");
            return;
        }
        u54Var.b = str3;
        if (str4 == null) {
            ny61.t("Null buildVersion");
            return;
        }
        u54Var.c = str4;
        u54Var.d = CommonUtils.h();
        u54Var.e = (byte) (u54Var.e | 2);
        l44Var.i = u54Var.a();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        String str14 = Build.CPU_ABI;
        int i = 7;
        if (!TextUtils.isEmpty(str14) && (num = (Integer) d3f.f.get(str14.toLowerCase(locale))) != null) {
            i = num.intValue();
        }
        int availableProcessors2 = Runtime.getRuntime().availableProcessors();
        long a2 = CommonUtils.a(d3fVar.a);
        long blockCount = statFs2.getBlockCount() * statFs2.getBlockSize();
        boolean g2 = CommonUtils.g();
        int d2 = CommonUtils.d();
        q44 q44Var = new q44();
        q44Var.a = i;
        byte b = (byte) (q44Var.j | 1);
        q44Var.j = b;
        if (str5 == null) {
            ny61.t("Null model");
            return;
        }
        q44Var.b = str5;
        q44Var.c = availableProcessors2;
        q44Var.d = a2;
        q44Var.e = blockCount;
        q44Var.f = g2;
        byte b2 = (byte) (((byte) (((byte) (((byte) (b | 2)) | 4)) | 8)) | PKIBody._CKUANN);
        q44Var.g = d2;
        q44Var.j = (byte) (b2 | BlobHeaderStructure.BLOB_VERSION);
        if (str6 == null) {
            ny61.t("Null manufacturer");
            return;
        }
        q44Var.h = str6;
        String str15 = str2;
        if (str15 == null) {
            ny61.t("Null modelClass");
            return;
        }
        q44Var.i = str15;
        l44Var.j = q44Var.a();
        l44Var.l = 3;
        l44Var.m = (byte) (l44Var.m | 4);
        y34Var.j = l44Var.a();
        z34 a3 = y34Var.a();
        q1r q1rVar = u0r0Var.b.b;
        c3f.e eVar = a3.k;
        if (eVar == null) {
            Log.isLoggable("FirebaseCrashlytics", 3);
            return;
        }
        String h = eVar.h();
        try {
            g3f.g.getClass();
            g3f.f(q1rVar.c(h, "report"), e3f.a.k(a3));
            File c = q1rVar.c(h, "start-time");
            long j = eVar.j();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(c), g3f.e);
            try {
                outputStreamWriter.write("");
                c.setLastModified(j * 1000);
                outputStreamWriter.close();
            } finally {
            }
        } catch (IOException unused) {
            Log.isLoggable("FirebaseCrashlytics", 3);
        }
    }

    public final void d(long j) {
        try {
            q1r q1rVar = this.g;
            String str = ".ae" + j;
            q1rVar.getClass();
            if (new File(q1rVar.c, str).createNewFile()) {
            } else {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException unused) {
        }
    }

    public final void e(com.google.firebase.crashlytics.internal.settings.a aVar) {
        com.google.firebase.crashlytics.internal.concurrency.a.a();
        j3f j3fVar = this.n;
        if (j3fVar == null || !j3fVar.e.get()) {
            Log.isLoggable("FirebaseCrashlytics", 2);
            try {
                b(true, aVar, true);
                Log.isLoggable("FirebaseCrashlytics", 2);
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e);
            }
        }
    }

    public final String f() {
        NavigableSet c = this.m.b.c();
        if (c.isEmpty()) {
            return null;
        }
        return (String) c.first();
    }

    public final String g() {
        Context context = this.a;
        int e = CommonUtils.e(context, "com.google.firebase.crashlytics.version_control_info", "string");
        String string = e == 0 ? null : context.getResources().getString(e);
        if (string != null) {
            Log.isLoggable("FirebaseCrashlytics", 3);
            return Base64.encodeToString(string.getBytes(t), 0);
        }
        ClassLoader classLoader = a.class.getClassLoader();
        InputStream resourceAsStream = classLoader == null ? null : classLoader.getResourceAsStream("META-INF/version-control-info.textproto");
        if (resourceAsStream == null) {
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
            Log.i("FirebaseCrashlytics", "No version control information found", null);
            return null;
        }
        try {
            Log.isLoggable("FirebaseCrashlytics", 3);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = resourceAsStream.read(bArr);
                    if (read == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        String encodeToString = Base64.encodeToString(byteArray, 0);
                        resourceAsStream.close();
                        return encodeToString;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                resourceAsStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void h() {
        try {
            String g = g();
            if (g != null) {
                try {
                    this.d.e.n("com.crashlytics.version-control-info", g);
                } catch (IllegalArgumentException e) {
                    Context context = this.a;
                    if (context != null) {
                        if ((context.getApplicationInfo().flags & 2) != 0) {
                            throw e;
                        }
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                }
                Log.i("FirebaseCrashlytics", "Saved version control info", null);
            }
        } catch (IOException unused) {
        }
    }

    public final void i(zzw zzwVar) {
        zzw zzwVar2;
        zzw V;
        atx0 atx0Var = this.o;
        q1r q1rVar = this.m.b.b;
        if (q1r.f(q1rVar.e.listFiles()).isEmpty() && q1r.f(q1rVar.f.listFiles()).isEmpty() && q1r.f(q1rVar.g.listFiles()).isEmpty()) {
            Log.isLoggable("FirebaseCrashlytics", 2);
            atx0Var.c(Boolean.FALSE);
            return;
        }
        Log.isLoggable("FirebaseCrashlytics", 2);
        uo2 uo2Var = this.b;
        if (uo2Var.c()) {
            Log.isLoggable("FirebaseCrashlytics", 3);
            atx0Var.c(Boolean.FALSE);
            V = udq0.p(Boolean.TRUE);
        } else {
            Log.isLoggable("FirebaseCrashlytics", 3);
            Log.isLoggable("FirebaseCrashlytics", 2);
            atx0Var.c(Boolean.TRUE);
            synchronized (uo2Var.w) {
                zzwVar2 = ((atx0) uo2Var.x).a;
            }
            Task p = zzwVar2.p(new o501(15));
            Log.isLoggable("FirebaseCrashlytics", 3);
            V = q5z.V(p, this.p.a);
        }
        V.q(this.e.a, new p1b((Object) this, (Object) zzwVar, false));
    }
}
