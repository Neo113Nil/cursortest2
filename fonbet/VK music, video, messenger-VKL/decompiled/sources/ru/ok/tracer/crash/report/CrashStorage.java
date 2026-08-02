package ru.ok.tracer.crash.report;

import android.content.Context;
import com.huawei.hms.framework.common.BundleUtil;
import com.ironsource.X3;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import ru.ok.tracer.SystemState;
import ru.ok.tracer.SystemStateSerializer;
import ru.ok.tracer.base.io.FileUtils;
import ru.ok.tracer.base.stacktrace.ThrowableUtils;
import ru.ok.tracer.utils.Logger;
import ru.ok.tracer.utils.TracerFiles;
import xsna.drm0;
import xsna.emb;
import xsna.epx;
import xsna.g5g;
import xsna.j5g;
import xsna.jgp;
import xsna.jw5;
import xsna.nbr;
import xsna.ro;
import xsna.s3q0;
import xsna.zcl;

/* compiled from: CrashStorage.kt */
/* loaded from: classes9.dex */
public final class CrashStorage {
    private static final String DIR_CRASHES = "crashes";
    private static final String FILE_ALL_STACKTRACES = "all_stacktraces";
    private static final String FILE_LOGS = "all_logs";
    private static final String FILE_STACKTRACE = "stacktrace";
    private static final String FILE_SYSTEM_INFO = "system_info";
    private static final String FILE_TAGS = "tags";
    private static final String MAIN_THREAD_NAME = "main";
    private static final Comparator<Thread> THREAD_COMPARATOR;
    private final Context appContext;
    public static final Companion Companion = new Companion(null);
    private static final Comparator<Thread> THREAD_MAIN_FIRST_COMPARATOR = new Comparator<Thread>() { // from class: ru.ok.tracer.crash.report.CrashStorage$Companion$THREAD_MAIN_FIRST_COMPARATOR$1
        @Override // java.util.Comparator
        public int compare(Thread thread, Thread thread2) {
            Comparator comparator;
            if (epx.f(thread != null ? thread.getName() : null, X3.i.Z)) {
                return -1;
            }
            if (epx.f(thread2 != null ? thread2.getName() : null, X3.i.Z)) {
                return 1;
            }
            comparator = CrashStorage.THREAD_COMPARATOR;
            return comparator.compare(thread, thread2);
        }
    };

    /* compiled from: CrashStorage.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [ru.ok.tracer.crash.report.CrashStorage$special$$inlined$compareBy$1] */
    static {
        final ?? r0 = new Comparator() { // from class: ru.ok.tracer.crash.report.CrashStorage$special$$inlined$compareBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return jw5.b(((Thread) t).getName(), ((Thread) t2).getName());
            }
        };
        final Comparator comparator = new Comparator() { // from class: xsna.d7i
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                if (obj == obj2) {
                    return 0;
                }
                if (obj == null) {
                    return 1;
                }
                if (obj2 == null) {
                    return -1;
                }
                return compare(obj, obj2);
            }
        };
        final Comparator comparator2 = new Comparator() { // from class: ru.ok.tracer.crash.report.CrashStorage$special$$inlined$thenBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int compare = comparator.compare(t, t2);
                if (compare != 0) {
                    return compare;
                }
                Thread thread = (Thread) t;
                Thread thread2 = (Thread) t2;
                return jw5.b(thread != null ? Long.valueOf(thread.getId()) : r0, thread2 != null ? Long.valueOf(thread2.getId()) : 0);
            }
        };
        THREAD_COMPARATOR = new Comparator() { // from class: ru.ok.tracer.crash.report.CrashStorage$special$$inlined$thenBy$2
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int compare = comparator2.compare(t, t2);
                return compare != 0 ? compare : jw5.b(Integer.valueOf(System.identityHashCode(t)), Integer.valueOf(System.identityHashCode(t2)));
            }
        };
    }

    public CrashStorage(Context context) {
        this.appContext = context;
    }

    private final CrashDescription read(File file) {
        try {
            String name = file.getName();
            int P = drm0.P(name, '_', 0, 6);
            if (P < 0) {
                throw new IllegalStateException("Malformed directory name ".concat(name).toString());
            }
            ReportType valueOf = ReportType.valueOf(name.substring(0, P));
            long parseLong = Long.parseLong(name.substring(P + 1));
            File t = nbr.t(file, FILE_SYSTEM_INFO);
            if (!t.exists()) {
                throw new IllegalStateException("No system info file");
            }
            File t2 = nbr.t(file, FILE_STACKTRACE);
            if (!t2.exists()) {
                throw new IllegalStateException("No stacktrace file");
            }
            return new CrashDescription(parseLong, valueOf, file.getPath(), t.getPath(), nbr.t(file, FILE_TAGS).getPath(), t2.getPath(), nbr.t(file, FILE_ALL_STACKTRACES).getPath(), nbr.t(file, FILE_LOGS).getPath());
        } catch (Exception e) {
            nbr.l(file);
            throw e;
        }
    }

    public static CrashDescription save$default(CrashStorage crashStorage, ReportType reportType, byte[] bArr, SystemState systemState, List list, Map map, List list2, int i, Object obj) {
        if ((i & 8) != 0) {
            list = EmptyList.b;
        }
        List list3 = list;
        if ((i & 16) != 0) {
            map = jgp.b;
        }
        Map map2 = map;
        if ((i & 32) != 0) {
            list2 = EmptyList.b;
        }
        return crashStorage.save(reportType, bArr, systemState, list3, map2, list2);
    }

    public final void deleteAll() {
        File t = nbr.t(TracerFiles.INSTANCE.getTracerDir(this.appContext), DIR_CRASHES);
        if (t.exists() && !nbr.l(t)) {
            Logger.d$default("Can't delete crashes", null, 2, null);
        }
    }

    public final List<CrashDescription> readAll() {
        File t = nbr.t(TracerFiles.INSTANCE.getTracerDir(this.appContext), DIR_CRASHES);
        if (!t.exists()) {
            Logger.d$default("No crashes detected", null, 2, null);
            return EmptyList.b;
        }
        File[] listFiles = t.listFiles();
        if (listFiles == null || listFiles.length == 0) {
            Logger.d$default("No crashes detected", null, 2, null);
            return EmptyList.b;
        }
        ArrayList arrayList = new ArrayList();
        for (File file : listFiles) {
            try {
                arrayList.add(read(file));
            } catch (Exception unused) {
            }
        }
        if (arrayList.isEmpty()) {
            return EmptyList.b;
        }
        long currentTimeMillis = System.currentTimeMillis() - BuildConfig.LIMIT_MAX_CRASH_REPORT_TTL_MILLIS;
        if (arrayList.size() > 1) {
            g5g.L(arrayList, new Comparator() { // from class: ru.ok.tracer.crash.report.CrashStorage$readAll$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t2, T t3) {
                    return jw5.b(Long.valueOf(((CrashDescription) t2).getTimestamp()), Long.valueOf(((CrashDescription) t3).getTimestamp()));
                }
            });
        }
        while (arrayList.size() > 10) {
            CrashDescription crashDescription = (CrashDescription) g5g.G(arrayList);
            Logger.d$default("Removing obsolete crash", null, 2, null);
            crashDescription.delete();
        }
        while (((CrashDescription) j5g.Y(arrayList)).getTimestamp() < currentTimeMillis) {
            CrashDescription crashDescription2 = (CrashDescription) g5g.G(arrayList);
            Logger.d$default("Removing obsolete crash", null, 2, null);
            crashDescription2.delete();
            if (arrayList.isEmpty()) {
                break;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Finally extract failed */
    public final CrashDescription save(ReportType reportType, byte[] bArr, SystemState systemState, List<String> list, Map<Thread, StackTraceElement[]> map, List<LogEntry> list2) {
        long currentTimeMillis = System.currentTimeMillis();
        File t = nbr.t(nbr.t(TracerFiles.INSTANCE.getTracerDir(this.appContext), DIR_CRASHES), reportType.name() + BundleUtil.UNDERLINE_TAG + currentTimeMillis);
        if (t.exists()) {
            Logger.d$default("Crash exists with current timestamp. " + t.getName(), null, 2, null);
            return null;
        }
        try {
            FileUtils.mkdirsChecked(t);
            File t2 = nbr.t(t, FILE_STACKTRACE);
            nbr.v(t2, bArr);
            File t3 = nbr.t(t, FILE_SYSTEM_INFO);
            nbr.w(t3, SystemStateSerializer.INSTANCE.toJson(systemState), emb.b);
            File t4 = nbr.t(t, FILE_TAGS);
            if (!list.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
                nbr.w(t4, jSONArray.toString(), emb.b);
            }
            File t5 = nbr.t(t, FILE_ALL_STACKTRACES);
            if (!map.isEmpty()) {
                TreeMap treeMap = new TreeMap(THREAD_MAIN_FIRST_COMPARATOR);
                treeMap.putAll(map);
                PrintWriter printWriter = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(t5), emb.b), 8192));
                try {
                    for (Map.Entry entry : treeMap.entrySet()) {
                        Thread thread = (Thread) entry.getKey();
                        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) entry.getValue();
                        printWriter.append((CharSequence) "Thread: ").append((CharSequence) thread.getName()).append((CharSequence) " (").append((CharSequence) thread.getState().toString()).append((CharSequence) ")");
                        printWriter.append('\n');
                        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                            ThrowableUtils.appendTo$default(stackTraceElement, printWriter, 0, null, 6, null);
                        }
                    }
                    s3q0 s3q0Var = s3q0.a;
                    printWriter.close();
                } finally {
                }
            }
            File t6 = nbr.t(t, FILE_LOGS);
            if (!list2.isEmpty()) {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(t6), 8192);
                try {
                    Iterator<LogEntry> it2 = list2.iterator();
                    int i = 0;
                    while (it2.hasNext()) {
                        it2.next().writeToApi(bufferedOutputStream, i);
                        i++;
                    }
                    s3q0 s3q0Var2 = s3q0.a;
                    bufferedOutputStream.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ro.e(bufferedOutputStream, th);
                        throw th2;
                    }
                }
            }
            Logger.d$default("Crash is written", null, 2, null);
            return new CrashDescription(currentTimeMillis, reportType, t.getPath(), t3.getPath(), t4.getPath(), t2.getPath(), t5.getPath(), t6.getPath());
        } catch (IOException unused) {
            nbr.l(t);
            return null;
        }
    }
}
