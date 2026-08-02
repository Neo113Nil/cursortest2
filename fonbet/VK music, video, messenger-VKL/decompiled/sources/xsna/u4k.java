package xsna;

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
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.common.DeliveryMechanism;
import com.huawei.hms.framework.common.BundleUtil;
import com.ironsource.O6;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
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
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.proto.rtmp.amf.AmfConstants;
import xsna.bl5;
import xsna.d0j0;
import xsna.el5;
import xsna.fl5;
import xsna.fng;
import xsna.g000;
import xsna.j5k;
import xsna.nl5;
import xsna.tl5;
import xsna.uk5;
import xsna.wk5;
import xsna.xk5;
import xsna.zk5;

/* compiled from: CrashlyticsController.java */
/* loaded from: classes.dex */
public final class u4k {
    public static final p4k s = new p4k();
    public static final Charset t = Charset.forName(C.UTF8_NAME);
    public final Context a;
    public final wtk b;
    public final e5k c;
    public final alq0 d;
    public final g6k e;
    public final isv f;
    public final sar g;
    public final g43 h;
    public final g000 i;
    public final f5k j;
    public final ux1 k;
    public final n4k l;
    public final tui0 m;
    public y5k n;
    public final TaskCompletionSource<Boolean> o = new TaskCompletionSource<>();
    public final TaskCompletionSource<Boolean> p = new TaskCompletionSource<>();
    public final TaskCompletionSource<Void> q = new TaskCompletionSource<>();
    public final AtomicBoolean r = new AtomicBoolean(false);

    /* compiled from: CrashlyticsController.java */
    public class a implements SuccessContinuation<Boolean, Void> {
        public final /* synthetic */ Task b;

        public a(Task task) {
            this.b = task;
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        @NonNull
        public final Task<Void> then(@Nullable Boolean bool) throws Exception {
            Boolean bool2 = bool;
            boolean booleanValue = bool2.booleanValue();
            u4k u4kVar = u4k.this;
            if (booleanValue) {
                boolean booleanValue2 = bool2.booleanValue();
                wtk wtkVar = u4kVar.b;
                if (!booleanValue2) {
                    wtkVar.getClass();
                    throw new IllegalStateException("An invalid data collection token was used.");
                }
                wtkVar.g.trySetResult(null);
                return this.b.onSuccessTask(u4kVar.e.a, new t4k(this));
            }
            sar sarVar = u4kVar.g;
            Iterator it = sar.f(sarVar.c.listFiles(u4k.s)).iterator();
            while (it.hasNext()) {
                ((File) it.next()).delete();
            }
            sar sarVar2 = u4kVar.m.b.b;
            t5k.a(sar.f(sarVar2.e.listFiles()));
            t5k.a(sar.f(sarVar2.f.listFiles()));
            t5k.a(sar.f(sarVar2.g.listFiles()));
            u4kVar.q.trySetResult(null);
            return Tasks.forResult(null);
        }
    }

    public u4k(Context context, isv isvVar, wtk wtkVar, sar sarVar, e5k e5kVar, g43 g43Var, alq0 alq0Var, g000 g000Var, tui0 tui0Var, f5k f5kVar, ux1 ux1Var, n4k n4kVar, g6k g6kVar) {
        this.a = context;
        this.f = isvVar;
        this.b = wtkVar;
        this.g = sarVar;
        this.c = e5kVar;
        this.h = g43Var;
        this.d = alq0Var;
        this.i = g000Var;
        this.j = f5kVar;
        this.k = ux1Var;
        this.l = n4kVar;
        this.m = tui0Var;
        this.e = g6kVar;
    }

    public static Task a(u4k u4kVar) {
        Task call;
        u4kVar.getClass();
        ArrayList arrayList = new ArrayList();
        sar sarVar = u4kVar.g;
        for (File file : sar.f(sarVar.c.listFiles(s))) {
            try {
                long parseLong = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    call = Tasks.forResult(null);
                } catch (ClassNotFoundException unused) {
                    call = Tasks.call(new ScheduledThreadPoolExecutor(1), new v4k(u4kVar, parseLong));
                }
                arrayList.add(call);
            } catch (NumberFormatException unused2) {
                file.getName();
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0516 A[LOOP:4: B:134:0x0516->B:136:0x051c, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:217:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x034d  */
    /* JADX WARN: Type inference failed for: r14v13, types: [xsna.w7r] */
    /* JADX WARN: Type inference failed for: r14v40, types: [int] */
    /* JADX WARN: Type inference failed for: r14v41 */
    /* JADX WARN: Type inference failed for: r14v44 */
    /* JADX WARN: Type inference failed for: r14v46 */
    /* JADX WARN: Type inference failed for: r14v47 */
    /* JADX WARN: Type inference failed for: r29v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(boolean z, k1j0 k1j0Var, boolean z2) {
        int i;
        boolean z3;
        String str;
        sar sarVar;
        NavigableSet<String> c;
        int size;
        int i2;
        boolean z4;
        String[] list;
        sar sarVar2;
        File b;
        File b2;
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
        boolean z5;
        List list3;
        List<j5k.e.d.a.b.AbstractC3098a> a2;
        InputStream traceInputStream;
        long timestamp2;
        int reason2;
        Closeable closeable;
        FileInputStream fileInputStream;
        g6k.a();
        ArrayList arrayList = new ArrayList(this.m.b.c());
        if (arrayList.size() <= z) {
            return;
        }
        String str3 = (String) arrayList.get(z == true ? 1 : 0);
        boolean z6 = true;
        if (z2 && k1j0Var.b().b.b && Build.VERSION.SDK_INT >= 30) {
            historicalProcessExitReasons = ((ActivityManager) this.a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
            if (historicalProcessExitReasons.size() != 0) {
                sar sarVar3 = this.g;
                g000 g000Var = new g000(sarVar3);
                g000.a aVar = g000.c;
                aVar.c();
                g000Var.b = aVar;
                if (str3 != null) {
                    g000Var.b = new lre0(sarVar3.c(str3, "userlog"));
                }
                sar sarVar4 = this.g;
                g6k g6kVar = this.e;
                zh20 zh20Var = new zh20(sarVar4);
                alq0 alq0Var = new alq0(str3, sarVar4, g6kVar);
                alq0Var.d.a.getReference().c(zh20Var.c(str3, false));
                alq0Var.e.a.getReference().c(zh20Var.c(str3, true));
                alq0Var.g.set(zh20Var.d(str3), false);
                slg0 slg0Var = alq0Var.f;
                File c2 = sarVar4.c(str3, "rollouts-state");
                if (c2.exists()) {
                    ?? r14 = (c2.length() > 0L ? 1 : (c2.length() == 0L ? 0 : -1));
                    try {
                        if (r14 != 0) {
                            try {
                                fileInputStream = new FileInputStream(c2);
                                try {
                                    list2 = zh20.b(fng.j(fileInputStream));
                                    list2.toString();
                                    fng.b(fileInputStream, "Failed to close rollouts state file.");
                                    r14 = fileInputStream;
                                } catch (Exception unused) {
                                    zh20.f(c2);
                                    fng.b(fileInputStream, "Failed to close rollouts state file.");
                                    list2 = Collections.EMPTY_LIST;
                                    r14 = fileInputStream;
                                    synchronized (slg0Var) {
                                    }
                                }
                            } catch (Exception unused2) {
                                fileInputStream = null;
                            } catch (Throwable th) {
                                th = th;
                                closeable = null;
                                fng.b(closeable, "Failed to close rollouts state file.");
                                throw th;
                            }
                            synchronized (slg0Var) {
                                slg0Var.a.clear();
                                int size2 = list2.size();
                                int i3 = slg0Var.b;
                                if (size2 > i3) {
                                    slg0Var.a.addAll(list2.subList(0, i3));
                                } else {
                                    slg0Var.a.addAll(list2);
                                }
                            }
                            tui0 tui0Var = this.m;
                            t5k t5kVar = tui0Var.b;
                            long lastModified = t5kVar.b.c(str3, "start-time").lastModified();
                            Iterator it = historicalProcessExitReasons.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    i = 4;
                                    applicationExitInfo = null;
                                    break;
                                }
                                applicationExitInfo = i7s.a(it.next());
                                timestamp2 = applicationExitInfo.getTimestamp();
                                if (timestamp2 < lastModified) {
                                    applicationExitInfo = null;
                                    i = 4;
                                    break;
                                } else {
                                    i = 4;
                                    reason2 = applicationExitInfo.getReason();
                                    if (reason2 == 6) {
                                        break;
                                    }
                                }
                            }
                            if (applicationExitInfo != null) {
                                k5k k5kVar = tui0Var.a;
                                try {
                                    traceInputStream = applicationExitInfo.getTraceInputStream();
                                } catch (IOException e) {
                                    applicationExitInfo.toString();
                                    e.toString();
                                }
                                if (traceInputStream != null) {
                                    str2 = tui0.c(traceInputStream);
                                    wk5.a aVar2 = new wk5.a();
                                    importance = applicationExitInfo.getImportance();
                                    aVar2.c(importance);
                                    processName = applicationExitInfo.getProcessName();
                                    aVar2.e(processName);
                                    reason = applicationExitInfo.getReason();
                                    aVar2.g(reason);
                                    timestamp = applicationExitInfo.getTimestamp();
                                    aVar2.i(timestamp);
                                    pid = applicationExitInfo.getPid();
                                    aVar2.d(pid);
                                    pss = applicationExitInfo.getPss();
                                    aVar2.f(pss);
                                    rss = applicationExitInfo.getRss();
                                    aVar2.h(rss);
                                    aVar2.j(str2);
                                    wk5 a3 = aVar2.a();
                                    int i4 = k5kVar.a.getResources().getConfiguration().orientation;
                                    fl5.a aVar3 = new fl5.a();
                                    aVar3.b = "anr";
                                    aVar3.a = a3.g;
                                    aVar3.g = (byte) (aVar3.g | 1);
                                    g43 g43Var = k5kVar.c;
                                    if (k5kVar.e.b().b.c || g43Var.c.size() <= 0) {
                                        z5 = true;
                                        list3 = null;
                                    } else {
                                        ArrayList arrayList2 = new ArrayList();
                                        Iterator it2 = g43Var.c.iterator();
                                        while (it2.hasNext()) {
                                            jn8 jn8Var = (jn8) it2.next();
                                            boolean z7 = z6;
                                            xk5.a aVar4 = new xk5.a();
                                            aVar4.d(jn8Var.a);
                                            aVar4.b(jn8Var.b);
                                            aVar4.c(jn8Var.c);
                                            arrayList2.add(aVar4.a());
                                            z6 = z7;
                                        }
                                        z5 = z6;
                                        list3 = Collections.unmodifiableList(arrayList2);
                                    }
                                    wk5.a aVar5 = new wk5.a();
                                    aVar5.c(a3.d);
                                    aVar5.e(a3.b);
                                    aVar5.g(a3.c);
                                    aVar5.i(a3.g);
                                    aVar5.d(a3.a);
                                    aVar5.f(a3.e);
                                    aVar5.h(a3.f);
                                    aVar5.j(a3.h);
                                    aVar5.b(list3);
                                    wk5 a4 = aVar5.a();
                                    Boolean valueOf = Boolean.valueOf(a4.d == 100 ? z5 : false);
                                    String str4 = a4.b;
                                    int i5 = a4.a;
                                    int i6 = a4.d;
                                    if ((8 & 4) != 0) {
                                        i6 = 0;
                                    }
                                    nl5.a aVar6 = new nl5.a();
                                    aVar6.a = str4;
                                    aVar6.b = i5;
                                    byte b3 = (byte) (aVar6.e | 1);
                                    aVar6.c = i6;
                                    aVar6.d = false;
                                    aVar6.e = (byte) (((byte) (b3 | 2)) | 4);
                                    nl5 a5 = aVar6.a();
                                    boolean z8 = z5;
                                    byte b4 = z8 ? (byte) 1 : (byte) 0;
                                    kl5 e2 = k5k.e();
                                    a2 = k5kVar.a();
                                    if (a2 != null) {
                                        throw new NullPointerException("Null binaries");
                                    }
                                    hl5 hl5Var = new hl5(null, null, a4, e2, a2);
                                    if (b4 != z8) {
                                        StringBuilder sb = new StringBuilder();
                                        if (b4 == 0) {
                                            sb.append(" uiOrientation");
                                        }
                                        throw new IllegalStateException(t9c.b("Missing required properties:", sb));
                                    }
                                    aVar3.c = new gl5(hl5Var, null, null, valueOf, a5, null, i4);
                                    aVar3.d = k5kVar.b(i4);
                                    t5kVar.d(tui0.b(tui0.a(aVar3.a(), g000Var, alq0Var, Collections.EMPTY_MAP), alq0Var), str3, true);
                                }
                                str2 = null;
                                wk5.a aVar22 = new wk5.a();
                                importance = applicationExitInfo.getImportance();
                                aVar22.c(importance);
                                processName = applicationExitInfo.getProcessName();
                                aVar22.e(processName);
                                reason = applicationExitInfo.getReason();
                                aVar22.g(reason);
                                timestamp = applicationExitInfo.getTimestamp();
                                aVar22.i(timestamp);
                                pid = applicationExitInfo.getPid();
                                aVar22.d(pid);
                                pss = applicationExitInfo.getPss();
                                aVar22.f(pss);
                                rss = applicationExitInfo.getRss();
                                aVar22.h(rss);
                                aVar22.j(str2);
                                wk5 a32 = aVar22.a();
                                int i42 = k5kVar.a.getResources().getConfiguration().orientation;
                                fl5.a aVar32 = new fl5.a();
                                aVar32.b = "anr";
                                aVar32.a = a32.g;
                                aVar32.g = (byte) (aVar32.g | 1);
                                g43 g43Var2 = k5kVar.c;
                                if (k5kVar.e.b().b.c) {
                                }
                                z5 = true;
                                list3 = null;
                                wk5.a aVar52 = new wk5.a();
                                aVar52.c(a32.d);
                                aVar52.e(a32.b);
                                aVar52.g(a32.c);
                                aVar52.i(a32.g);
                                aVar52.d(a32.a);
                                aVar52.f(a32.e);
                                aVar52.h(a32.f);
                                aVar52.j(a32.h);
                                aVar52.b(list3);
                                wk5 a42 = aVar52.a();
                                Boolean valueOf2 = Boolean.valueOf(a42.d == 100 ? z5 : false);
                                String str42 = a42.b;
                                int i52 = a42.a;
                                int i62 = a42.d;
                                if ((8 & 4) != 0) {
                                }
                                nl5.a aVar62 = new nl5.a();
                                aVar62.a = str42;
                                aVar62.b = i52;
                                byte b32 = (byte) (aVar62.e | 1);
                                aVar62.c = i62;
                                aVar62.d = false;
                                aVar62.e = (byte) (((byte) (b32 | 2)) | 4);
                                nl5 a52 = aVar62.a();
                                boolean z82 = z5;
                                byte b42 = z82 ? (byte) 1 : (byte) 0;
                                kl5 e22 = k5k.e();
                                a2 = k5kVar.a();
                                if (a2 != null) {
                                }
                            }
                            if (z2 && this.j.d(str3)) {
                                sarVar2 = this.g;
                                fw50 b5 = this.j.b(str3);
                                b = b5.b();
                                j5k.a a6 = b5.a();
                                if (b != null) {
                                    b.exists();
                                }
                                if ((b != null && b.exists()) || a6 != null) {
                                    long lastModified2 = b.lastModified();
                                    j9r j9rVar = g000.c;
                                    if (str3 != null) {
                                        j9rVar = new lre0(sarVar2.c(str3, "userlog"));
                                    }
                                    b2 = sarVar2.b(str3);
                                    if (b2.isDirectory()) {
                                        d(lastModified2);
                                        byte[] e3 = j9rVar.e();
                                        File c3 = sarVar2.c(str3, "user-data");
                                        File c4 = sarVar2.c(str3, ApiProtocol.PARAM_KEYS);
                                        File c5 = sarVar2.c(str3, "rollouts-state");
                                        ArrayList arrayList3 = new ArrayList();
                                        arrayList3.add(new ou8("logs_file", e3, "logs"));
                                        arrayList3.add(new w7r("crash_meta_file", "metadata", b5.d()));
                                        arrayList3.add(new w7r("session_meta_file", "session", b5.c()));
                                        arrayList3.add(new w7r("app_meta_file", MBridgeConstans.DYNAMIC_VIEW_WX_APP, b5.f()));
                                        arrayList3.add(new w7r("device_meta_file", "device", b5.e()));
                                        arrayList3.add(new w7r("os_meta_file", O6.F, b5.g()));
                                        File b6 = b5.b();
                                        arrayList3.add((b6 == null || !b6.exists()) ? new ou8("minidump_file", new byte[]{0}, "minidump") : new w7r("minidump_file", "minidump", b6));
                                        arrayList3.add(new w7r("user_meta_file", "user", c3));
                                        arrayList3.add(new w7r("keys_file", ApiProtocol.PARAM_KEYS, c4));
                                        arrayList3.add(new w7r("rollouts_file", "rollouts", c5));
                                        qxm0.u(b2, arrayList3);
                                        tui0 tui0Var2 = this.m;
                                        tui0Var2.getClass();
                                        ArrayList arrayList4 = new ArrayList();
                                        Iterator it3 = arrayList3.iterator();
                                        while (it3.hasNext()) {
                                            al5 a7 = ((ew50) it3.next()).a();
                                            if (a7 != null) {
                                                arrayList4.add(a7);
                                            }
                                        }
                                        t5k t5kVar2 = tui0Var2.b;
                                        zk5.a aVar7 = new zk5.a();
                                        aVar7.b(Collections.unmodifiableList(arrayList4));
                                        zk5 a8 = aVar7.a();
                                        sar sarVar5 = t5kVar2.b;
                                        File c6 = sarVar5.c(str3, "report");
                                        c6.toString();
                                        String d = t5kVar2.d.d(str3);
                                        try {
                                            o5k o5kVar = t5k.g;
                                            String e4 = t5k.e(c6);
                                            o5kVar.getClass();
                                            uk5.a m = o5k.i(e4).m();
                                            m.j = null;
                                            m.k = a8;
                                            uk5 a9 = m.a();
                                            if (a6 != null) {
                                                uk5.a m2 = a9.m();
                                                m2.l = a6;
                                                a9 = m2.a();
                                            }
                                            t5k.f(new File(sarVar5.g, str3), o5k.a.a(a9.n(d)));
                                        } catch (IOException unused3) {
                                            Objects.toString(c6);
                                        }
                                        j9rVar.a();
                                        if (z != 0) {
                                            z3 = false;
                                            str = (String) arrayList.get(0);
                                        } else {
                                            z3 = false;
                                            this.l.e(null);
                                            str = null;
                                        }
                                        tui0 tui0Var3 = this.m;
                                        long currentTimeMillis = System.currentTimeMillis() / 1000;
                                        t5k t5kVar3 = tui0Var3.b;
                                        sarVar = t5kVar3.b;
                                        sarVar.a(".com.google.firebase.crashlytics");
                                        sarVar.a(".com.google.firebase.crashlytics-ndk");
                                        if (!sarVar.a.isEmpty()) {
                                            sarVar.a(".com.google.firebase.crashlytics.files.v1");
                                            final String str5 = ".com.google.firebase.crashlytics.files.v2" + File.pathSeparator;
                                            File file = sarVar.b;
                                            if (file.exists() && (list = file.list(new FilenameFilter() { // from class: xsna.rar
                                                @Override // java.io.FilenameFilter
                                                public final boolean accept(File file2, String str6) {
                                                    return str6.startsWith(str5);
                                                }
                                            })) != null) {
                                                int length = list.length;
                                                for (?? r9 = z3; r9 < length; r9++) {
                                                    sarVar.a(list[r9]);
                                                }
                                            }
                                        }
                                        c = t5kVar3.c();
                                        if (str != null) {
                                            c.remove(str);
                                        }
                                        if (c.size() > 8) {
                                            while (c.size() > 8) {
                                                String str6 = (String) c.last();
                                                sar.e(new File(sarVar.d, str6));
                                                c.remove(str6);
                                            }
                                        }
                                        for (String str7 : c) {
                                            o5k o5kVar2 = t5k.g;
                                            q5k q5kVar = t5k.i;
                                            File file2 = new File(sarVar.d, str7);
                                            file2.mkdirs();
                                            List<File> f = sar.f(file2.listFiles(q5kVar));
                                            if (!f.isEmpty()) {
                                                Collections.sort(f);
                                                ArrayList arrayList5 = new ArrayList();
                                                boolean z9 = z3;
                                                for (File file3 : f) {
                                                    try {
                                                        String e5 = t5k.e(file3);
                                                        o5kVar2.getClass();
                                                        try {
                                                            JsonReader jsonReader = new JsonReader(new StringReader(e5));
                                                            try {
                                                                fl5 e6 = o5k.e(jsonReader);
                                                                jsonReader.close();
                                                                arrayList5.add(e6);
                                                            } finally {
                                                            }
                                                        } catch (IllegalStateException e7) {
                                                            throw new IOException(e7);
                                                        }
                                                    } catch (IOException unused4) {
                                                        Objects.toString(file3);
                                                    }
                                                    if (!z9) {
                                                        String name = file3.getName();
                                                        if (!name.startsWith(NotificationCompat.CATEGORY_EVENT) || !name.endsWith(BundleUtil.UNDERLINE_TAG)) {
                                                            z4 = z3;
                                                            z9 = z4;
                                                        }
                                                    }
                                                    z4 = true;
                                                    z9 = z4;
                                                }
                                                if (arrayList5.isEmpty()) {
                                                    continue;
                                                } else {
                                                    String d2 = new zh20(sarVar).d(str7);
                                                    String d3 = t5kVar3.d.d(str7);
                                                    File c7 = sarVar.c(str7, "report");
                                                    try {
                                                        String e8 = t5k.e(c7);
                                                        o5kVar2.getClass();
                                                        uk5 n = o5k.i(e8).o(currentTimeMillis, d2, z9).n(d3);
                                                        if (n.k == null) {
                                                            throw new IllegalStateException("Reports without sessions cannot have events added to them.");
                                                        }
                                                        uk5.a m3 = n.m();
                                                        bl5.a m4 = n.k.m();
                                                        m4.k = arrayList5;
                                                        m3.j = m4.a();
                                                        uk5 a10 = m3.a();
                                                        j5k.e eVar = a10.k;
                                                        if (eVar != null) {
                                                            t5k.f(z9 ? new File(sarVar.f, eVar.h()) : new File(sarVar.e, eVar.h()), o5k.a.a(a10));
                                                        }
                                                    } catch (IOException unused5) {
                                                        Objects.toString(c7);
                                                    }
                                                }
                                            }
                                            sar.e(new File(sarVar.d, str7));
                                        }
                                        d0j0.b bVar = t5kVar3.c.b().a;
                                        ArrayList b7 = t5kVar3.b();
                                        size = b7.size();
                                        i2 = i;
                                        if (size <= i2) {
                                            return;
                                        }
                                        Iterator it4 = b7.subList(i2, size).iterator();
                                        while (it4.hasNext()) {
                                            ((File) it4.next()).delete();
                                        }
                                        return;
                                    }
                                }
                            }
                            if (z != 0) {
                            }
                            tui0 tui0Var32 = this.m;
                            long currentTimeMillis2 = System.currentTimeMillis() / 1000;
                            t5k t5kVar32 = tui0Var32.b;
                            sarVar = t5kVar32.b;
                            sarVar.a(".com.google.firebase.crashlytics");
                            sarVar.a(".com.google.firebase.crashlytics-ndk");
                            if (!sarVar.a.isEmpty()) {
                            }
                            c = t5kVar32.c();
                            if (str != null) {
                            }
                            if (c.size() > 8) {
                            }
                            while (r7.hasNext()) {
                            }
                            d0j0.b bVar2 = t5kVar32.c.b().a;
                            ArrayList b72 = t5kVar32.b();
                            size = b72.size();
                            i2 = i;
                            if (size <= i2) {
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        closeable = r14;
                    }
                }
                zh20.g(c2, "The file has a length of zero for session: " + str3);
                list2 = Collections.EMPTY_LIST;
                synchronized (slg0Var) {
                }
            }
        }
        i = 4;
        if (z2) {
            sarVar2 = this.g;
            fw50 b52 = this.j.b(str3);
            b = b52.b();
            j5k.a a62 = b52.a();
            if (b != null) {
            }
            if (b != null) {
                long lastModified22 = b.lastModified();
                j9r j9rVar2 = g000.c;
                if (str3 != null) {
                }
                b2 = sarVar2.b(str3);
                if (b2.isDirectory()) {
                }
            }
            long lastModified222 = b.lastModified();
            j9r j9rVar22 = g000.c;
            if (str3 != null) {
            }
            b2 = sarVar2.b(str3);
            if (b2.isDirectory()) {
            }
        }
        if (z != 0) {
        }
        tui0 tui0Var322 = this.m;
        long currentTimeMillis22 = System.currentTimeMillis() / 1000;
        t5k t5kVar322 = tui0Var322.b;
        sarVar = t5kVar322.b;
        sarVar.a(".com.google.firebase.crashlytics");
        sarVar.a(".com.google.firebase.crashlytics-ndk");
        if (!sarVar.a.isEmpty()) {
        }
        c = t5kVar322.c();
        if (str != null) {
        }
        if (c.size() > 8) {
        }
        while (r7.hasNext()) {
        }
        d0j0.b bVar22 = t5kVar322.c.b().a;
        ArrayList b722 = t5kVar322.b();
        size = b722.size();
        i2 = i;
        if (size <= i2) {
        }
    }

    public final void c(Boolean bool, final String str) {
        long j;
        Integer num;
        final Map unmodifiableMap;
        final List unmodifiableList;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        Locale locale = Locale.US;
        isv isvVar = this.f;
        g43 g43Var = this.h;
        xn5 xn5Var = new xn5(isvVar.c, g43Var.f, g43Var.g, ((wm5) isvVar.c()).a, (g43Var.d != null ? DeliveryMechanism.APP_STORE : DeliveryMechanism.DEVELOPER).h(), g43Var.h);
        String str2 = Build.VERSION.RELEASE;
        String str3 = Build.VERSION.CODENAME;
        zn5 zn5Var = new zn5(fng.h());
        Context context = this.a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int ordinal = fng.a.h().ordinal();
        String str4 = Build.MODEL;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long a2 = fng.a(context);
        boolean g = fng.g();
        int d = fng.d();
        String str5 = Build.MANUFACTURER;
        String str6 = Build.PRODUCT;
        this.j.a(str, currentTimeMillis, new wn5(xn5Var, zn5Var, new yn5(a2, statFs.getBlockCount() * statFs.getBlockSize(), ordinal, availableProcessors, d, g)));
        if (!bool.booleanValue() || str == null) {
            j = 1000;
        } else {
            final alq0 alq0Var = this.d;
            synchronized (alq0Var.c) {
                alq0Var.c = str;
                zhy reference = alq0Var.d.a.getReference();
                synchronized (reference) {
                    unmodifiableMap = Collections.unmodifiableMap(new HashMap(reference.a));
                }
                slg0 slg0Var = alq0Var.f;
                synchronized (slg0Var) {
                    j = 1000;
                    unmodifiableList = Collections.unmodifiableList(new ArrayList(slg0Var.a));
                }
                alq0Var.b.b.a(new Runnable() { // from class: xsna.zkq0
                    @Override // java.lang.Runnable
                    public final void run() {
                        String e;
                        BufferedWriter bufferedWriter;
                        alq0 alq0Var2 = alq0.this;
                        zh20 zh20Var = alq0Var2.a;
                        AtomicMarkableReference<String> atomicMarkableReference = alq0Var2.g;
                        String reference2 = atomicMarkableReference.getReference();
                        String str7 = str;
                        if (reference2 != null) {
                            zh20Var.i(str7, atomicMarkableReference.getReference());
                        }
                        Map<String, String> map = unmodifiableMap;
                        if (!map.isEmpty()) {
                            zh20Var.h(str7, map, false);
                        }
                        List list = unmodifiableList;
                        if (list.isEmpty()) {
                            return;
                        }
                        File c = zh20Var.a.c(str7, "rollouts-state");
                        if (list.isEmpty()) {
                            zh20.g(c, "Rollout state is empty for session: " + str7);
                            return;
                        }
                        BufferedWriter bufferedWriter2 = null;
                        try {
                            try {
                                e = zh20.e(list);
                                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(c), zh20.b));
                            } catch (Throwable th) {
                                th = th;
                            }
                        } catch (Exception unused) {
                        }
                        try {
                            bufferedWriter.write(e);
                            bufferedWriter.flush();
                            fng.b(bufferedWriter, "Failed to close rollouts state file.");
                        } catch (Exception unused2) {
                            bufferedWriter2 = bufferedWriter;
                            zh20.f(c);
                            fng.b(bufferedWriter2, "Failed to close rollouts state file.");
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedWriter2 = bufferedWriter;
                            fng.b(bufferedWriter2, "Failed to close rollouts state file.");
                            throw th;
                        }
                    }
                });
            }
        }
        g000 g000Var = this.i;
        g000Var.b.c();
        g000Var.b = g000.c;
        if (str != null) {
            g000Var.b = new lre0(g000Var.a.c(str, "userlog"));
        }
        this.l.e(str);
        tui0 tui0Var = this.m;
        k5k k5kVar = tui0Var.a;
        Charset charset = j5k.a;
        uk5.a aVar = new uk5.a();
        aVar.a = "19.4.4";
        g43 g43Var2 = k5kVar.c;
        String str7 = g43Var2.a;
        if (str7 == null) {
            throw new NullPointerException("Null gmpAppId");
        }
        aVar.b = str7;
        isv isvVar2 = k5kVar.b;
        String str8 = ((wm5) isvVar2.c()).a;
        if (str8 == null) {
            throw new NullPointerException("Null installationUuid");
        }
        aVar.d = str8;
        aVar.e = ((wm5) isvVar2.c()).b;
        aVar.f = ((wm5) isvVar2.c()).c;
        String str9 = g43Var2.f;
        if (str9 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        aVar.h = str9;
        String str10 = g43Var2.g;
        if (str10 == null) {
            throw new NullPointerException("Null displayVersion");
        }
        aVar.i = str10;
        aVar.c = 4;
        aVar.m = (byte) (aVar.m | 1);
        bl5.a aVar2 = new bl5.a();
        aVar2.f = false;
        byte b = (byte) (aVar2.m | 2);
        aVar2.d = currentTimeMillis;
        aVar2.m = (byte) (b | 1);
        if (str == null) {
            throw new NullPointerException("Null identifier");
        }
        aVar2.b = str;
        String str11 = k5k.g;
        if (str11 == null) {
            throw new NullPointerException("Null generator");
        }
        aVar2.a = str11;
        String str12 = isvVar2.c;
        if (str12 == null) {
            throw new NullPointerException("Null identifier");
        }
        String str13 = ((wm5) isvVar2.c()).a;
        s5m s5mVar = g43Var2.h;
        aVar2.g = new cl5(str12, str9, str10, str13, s5mVar.a().a, s5mVar.a().b);
        tl5.a aVar3 = new tl5.a();
        aVar3.a = 3;
        aVar3.e = (byte) (aVar3.e | 1);
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        aVar3.b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        aVar3.c = str3;
        aVar3.d = fng.h();
        aVar3.e = (byte) (aVar3.e | 2);
        aVar2.i = aVar3.a();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        String str14 = Build.CPU_ABI;
        int i = 7;
        if (!TextUtils.isEmpty(str14) && (num = (Integer) k5k.f.get(str14.toLowerCase(locale))) != null) {
            i = num.intValue();
        }
        int availableProcessors2 = Runtime.getRuntime().availableProcessors();
        long a3 = fng.a(k5kVar.a);
        long blockCount = statFs2.getBlockCount() * statFs2.getBlockSize();
        boolean g2 = fng.g();
        int d2 = fng.d();
        el5.a aVar4 = new el5.a();
        aVar4.a = i;
        byte b2 = (byte) (aVar4.j | 1);
        aVar4.j = b2;
        if (str4 == null) {
            throw new NullPointerException("Null model");
        }
        aVar4.b = str4;
        aVar4.c = availableProcessors2;
        aVar4.d = a3;
        aVar4.e = blockCount;
        aVar4.f = g2;
        byte b3 = (byte) (((byte) (((byte) (((byte) (b2 | 2)) | 4)) | 8)) | AmfConstants.TYPE_TYPED_OBJECT_MARKER);
        aVar4.g = d2;
        aVar4.j = (byte) (b3 | 32);
        if (str5 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        aVar4.h = str5;
        if (str6 == null) {
            throw new NullPointerException("Null modelClass");
        }
        aVar4.i = str6;
        aVar2.j = aVar4.a();
        aVar2.l = 3;
        aVar2.m = (byte) (aVar2.m | 4);
        aVar.j = aVar2.a();
        uk5 a4 = aVar.a();
        sar sarVar = tui0Var.b.b;
        j5k.e eVar = a4.k;
        if (eVar == null) {
            return;
        }
        String h = eVar.h();
        try {
            t5k.g.getClass();
            t5k.f(sarVar.c(h, "report"), o5k.a.a(a4));
            File c = sarVar.c(h, "start-time");
            long j2 = eVar.j();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(c), t5k.e);
            try {
                outputStreamWriter.write("");
                c.setLastModified(j2 * j);
                outputStreamWriter.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public final void d(long j) {
        try {
            sar sarVar = this.g;
            String str = ".ae" + j;
            sarVar.getClass();
            if (new File(sarVar.c, str).createNewFile()) {
            } else {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException unused) {
        }
    }

    @Nullable
    public final String e() {
        NavigableSet c = this.m.b.c();
        if (c.isEmpty()) {
            return null;
        }
        return (String) c.first();
    }

    public final String f() throws IOException {
        Context context = this.a;
        int e = fng.e(context, "com.google.firebase.crashlytics.version_control_info", "string");
        String string = e == 0 ? null : context.getResources().getString(e);
        if (string != null) {
            return Base64.encodeToString(string.getBytes(t), 0);
        }
        ClassLoader classLoader = u4k.class.getClassLoader();
        InputStream resourceAsStream = classLoader == null ? null : classLoader.getResourceAsStream("META-INF/version-control-info.textproto");
        if (resourceAsStream == null) {
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
            return null;
        }
        try {
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

    public final void g() {
        try {
            String f = f();
            if (f != null) {
                try {
                    this.d.e.a("com.crashlytics.version-control-info", f);
                } catch (IllegalArgumentException e) {
                    Context context = this.a;
                    if (context != null) {
                        if ((context.getApplicationInfo().flags & 2) != 0) {
                            throw e;
                        }
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                }
            }
        } catch (IOException unused) {
        }
    }

    public final void h(Task<d0j0> task) {
        Task<Void> task2;
        Task a2;
        TaskCompletionSource<Boolean> taskCompletionSource = this.o;
        sar sarVar = this.m.b.b;
        if (sar.f(sarVar.e.listFiles()).isEmpty() && sar.f(sarVar.f.listFiles()).isEmpty() && sar.f(sarVar.g.listFiles()).isEmpty()) {
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return;
        }
        wtk wtkVar = this.b;
        if (wtkVar.b()) {
            taskCompletionSource.trySetResult(Boolean.FALSE);
            a2 = Tasks.forResult(Boolean.TRUE);
        } else {
            taskCompletionSource.trySetResult(Boolean.TRUE);
            synchronized (wtkVar.c) {
                task2 = wtkVar.d.getTask();
            }
            a2 = x5k.a(task2.onSuccessTask(new kn4(2)), this.p.getTask());
        }
        a2.onSuccessTask(this.e.a, new a(task));
    }
}
