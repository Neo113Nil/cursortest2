package ru.ok.tracer.crash.report;

import android.content.Context;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import ru.ok.tracer.base.io.FileUtils;
import ru.ok.tracer.crash.report.LogEntry;
import ru.ok.tracer.utils.Logger;
import ru.ok.tracer.utils.TracerFiles;
import ru.ok.tracer.utils.TracerThreads;
import xsna.d8h;
import xsna.e43;
import xsna.g5g;
import xsna.j5g;
import xsna.jw5;
import xsna.nbr;
import xsna.s3q0;
import xsna.sk3;
import xsna.zcl;

/* compiled from: LogStorage.kt */
/* loaded from: classes9.dex */
public final class LogStorage {
    public static final Companion Companion = new Companion(null);
    private static final String DIR_USER_LOGS = "logs";
    private static final String LOGS_FILE_A = "a.log";
    private static final String LOGS_FILE_B = "b.log";
    private static final String LOGS_FILE_STASH_A = "stash-a.log";
    private static final String LOGS_FILE_STASH_B = "stash-b.log";
    private final Context appContext;
    private final Object lock;
    private final LogBuf logsData;
    private File logsFile;
    private LogsState logsState;
    private final int maxLogsLength;
    private List<LogEntry> prevLogsData;
    private AtomicBoolean prevLogsPreserved;
    private volatile PrevLogsState prevLogsState;

    /* compiled from: LogStorage.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void deleteIfExist(File... fileArr) {
            for (File file : fileArr) {
                if (file.exists()) {
                    try {
                        FileUtils.deleteChecked(file);
                    } catch (IOException unused) {
                        file.toString();
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<LogEntry> readIfExist(File[] fileArr, int i) {
            sk3 sk3Var = new sk3();
            int i2 = 0;
            for (File file : fileArr) {
                List<LogEntry> readIfExists = LogStorage.Companion.readIfExists(file);
                if (!readIfExists.isEmpty()) {
                    if (sk3Var.isEmpty() || ((LogEntry) sk3Var.last()).getTs() < ((LogEntry) j5g.Y(readIfExists)).getTs()) {
                        sk3Var.addAll(readIfExists);
                    } else {
                        int size = sk3Var.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= size) {
                                break;
                            }
                            if (((LogEntry) sk3Var.get(i3)).getTs() > ((LogEntry) j5g.i0(readIfExists)).getTs()) {
                                sk3Var.addAll(i3, readIfExists);
                                break;
                            }
                            i3++;
                        }
                    }
                }
            }
            Iterator<E> it = sk3Var.iterator();
            while (it.hasNext()) {
                i2 += ((LogEntry) it.next()).getApiLineLength();
            }
            while (i2 > i) {
                i2 -= ((LogEntry) sk3Var.removeFirst()).getApiLineLength();
            }
            return sk3Var;
        }

        private final List<LogEntry> readIfExists(File file) {
            if (!file.exists()) {
                return EmptyList.b;
            }
            try {
                ByteBuffer wrap = ByteBuffer.wrap(nbr.p(file));
                ListBuilder e = e43.e();
                while (wrap.hasRemaining()) {
                    try {
                        e.add(LogEntry.Companion.parseFromStorage(wrap));
                    } catch (BufferUnderflowException unused) {
                    }
                }
                if (e.size() > 1) {
                    g5g.L(e, new Comparator() { // from class: ru.ok.tracer.crash.report.LogStorage$Companion$readIfExists$lambda$3$$inlined$sortBy$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            return jw5.b(Long.valueOf(((LogEntry) t).getTs()), Long.valueOf(((LogEntry) t2).getTs()));
                        }
                    });
                }
                return e.g();
            } catch (Exception unused2) {
                file.toString();
                return EmptyList.b;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void renameIfExist(Pair<? extends File, ? extends File>... pairArr) {
            for (Pair<? extends File, ? extends File> pair : pairArr) {
                File d = pair.d();
                File g = pair.g();
                if (d.exists()) {
                    try {
                        d.renameTo(g);
                    } catch (IOException unused) {
                        d.toString();
                        Objects.toString(g);
                    }
                }
            }
        }

        private Companion() {
        }
    }

    /* compiled from: LogStorage.kt */
    public enum LogsState {
        NONE,
        APPEND_A,
        APPEND_B
    }

    /* compiled from: LogStorage.kt */
    public enum PrevLogsState {
        NONE,
        STASHED,
        LOADED,
        CLEAN
    }

    /* compiled from: LogStorage.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LogsState.values().length];
            try {
                iArr[LogsState.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LogsState.APPEND_A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LogsState.APPEND_B.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PrevLogsState.values().length];
            try {
                iArr2[PrevLogsState.STASHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[PrevLogsState.LOADED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[PrevLogsState.CLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[PrevLogsState.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public LogStorage(Context context, boolean z, int i) {
        this.maxLogsLength = i;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.appContext = applicationContext;
        this.lock = new Object();
        this.prevLogsState = PrevLogsState.NONE;
        this.prevLogsPreserved = new AtomicBoolean(!z);
        this.logsState = LogsState.NONE;
        this.logsData = new LogBuf(i);
    }

    private final boolean ensureLogStateAppend() {
        File t = nbr.t(TracerFiles.INSTANCE.getTracerDir(this.appContext), DIR_USER_LOGS);
        try {
            FileUtils.mkdirsChecked(t);
        } catch (IOException unused) {
            Logger.e$default("Cannot create dir " + t, null, 2, null);
        }
        int i = WhenMappings.$EnumSwitchMapping$0[this.logsState.ordinal()];
        if (i == 1) {
            File t2 = nbr.t(t, LOGS_FILE_A);
            Companion.deleteIfExist(nbr.t(t, LOGS_FILE_B));
            this.logsFile = t2;
            this.logsState = LogsState.APPEND_A;
            persistLogs(this.logsData, false);
            return false;
        }
        if (i == 2) {
            File file = this.logsFile;
            if ((file != null ? file : null).length() > this.maxLogsLength) {
                File t3 = nbr.t(t, LOGS_FILE_B);
                Companion.deleteIfExist(t3);
                this.logsFile = t3;
                this.logsState = LogsState.APPEND_B;
            }
        } else if (i == 3) {
            File file2 = this.logsFile;
            if ((file2 != null ? file2 : null).length() > this.maxLogsLength) {
                File t4 = nbr.t(t, LOGS_FILE_A);
                Companion.deleteIfExist(t4);
                this.logsFile = t4;
                this.logsState = LogsState.APPEND_A;
            }
        }
        return true;
    }

    private final void ensurePrevLogsState(PrevLogsState prevLogsState) {
        if (this.prevLogsState.compareTo(prevLogsState) >= 0) {
            return;
        }
        synchronized (this.lock) {
            try {
                PrevLogsState prevLogsState2 = this.prevLogsState;
                if (prevLogsState2.compareTo(prevLogsState) >= 0) {
                    return;
                }
                File t = nbr.t(TracerFiles.INSTANCE.getTracerDir(this.appContext), DIR_USER_LOGS);
                File t2 = nbr.t(t, LOGS_FILE_A);
                File t3 = nbr.t(t, LOGS_FILE_B);
                File t4 = nbr.t(t, LOGS_FILE_STASH_A);
                File t5 = nbr.t(t, LOGS_FILE_STASH_B);
                int[] iArr = WhenMappings.$EnumSwitchMapping$1;
                int i = iArr[prevLogsState2.ordinal()];
                if (i == 1) {
                    int i2 = iArr[prevLogsState.ordinal()];
                    if (i2 == 2) {
                        Companion companion = Companion;
                        this.prevLogsData = companion.readIfExist(new File[]{t4, t5}, this.maxLogsLength);
                        companion.deleteIfExist(t4, t5);
                    } else {
                        if (i2 != 3) {
                            throw new AssertionError("Unreachable code");
                        }
                        Companion.deleteIfExist(t4, t5);
                    }
                } else if (i != 2) {
                    if (i != 4) {
                        throw new AssertionError("Unreachable code");
                    }
                    int i3 = iArr[prevLogsState.ordinal()];
                    if (i3 == 1) {
                        Companion companion2 = Companion;
                        companion2.deleteIfExist(t4, t5);
                        companion2.renameIfExist(new Pair(t2, t4), new Pair(t3, t5));
                    } else if (i3 == 2) {
                        Companion companion3 = Companion;
                        this.prevLogsData = companion3.readIfExist(new File[]{t2, t3}, this.maxLogsLength);
                        companion3.deleteIfExist(t2, t3);
                    } else {
                        if (i3 != 3) {
                            throw new AssertionError("Unreachable code");
                        }
                        Companion companion4 = Companion;
                        companion4.deleteIfExist(t4, t5);
                        companion4.deleteIfExist(t2, t3);
                    }
                } else {
                    if (iArr[prevLogsState.ordinal()] != 3) {
                        throw new AssertionError("Unreachable code");
                    }
                    this.prevLogsData = null;
                }
                this.prevLogsState = prevLogsState;
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void log$lambda$1(LogStorage logStorage, LogEntry logEntry) {
        logStorage.preservePrevLogsIfNeeded();
        logStorage.ensurePrevLogsState(PrevLogsState.STASHED);
        if (logStorage.ensureLogStateAppend()) {
            logStorage.persistLogs(Collections.singletonList(logEntry), true);
        }
    }

    private final void persistLogs(Iterable<LogEntry> iterable, boolean z) {
        try {
            File file = this.logsFile;
            if (file == null) {
                file = null;
            }
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file, z));
            try {
                Iterator<LogEntry> it = iterable.iterator();
                while (it.hasNext()) {
                    it.next().writeToStorage(dataOutputStream);
                }
                s3q0 s3q0Var = s3q0.a;
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    private final void preservePrevLogsIfNeeded() {
        LogEntry logEntry;
        if (this.prevLogsPreserved.getAndSet(true)) {
            return;
        }
        synchronized (this.lock) {
            try {
                ensurePrevLogsState(PrevLogsState.LOADED);
                ArrayList arrayList = new ArrayList(getPrevLogs());
                if (arrayList.isEmpty()) {
                    return;
                }
                arrayList.add(LogEntry.Companion.invoke$default(LogEntry.Companion, System.currentTimeMillis(), "Preserved logs from previous session", 0, 4, null));
                while (!arrayList.isEmpty() && (logEntry = (LogEntry) g5g.J(arrayList)) != null && this.logsData.offerFirst(logEntry)) {
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void clearPrevLogs() {
        preservePrevLogsIfNeeded();
        ensurePrevLogsState(PrevLogsState.CLEAN);
    }

    public final List<LogEntry> getLogs() {
        return j5g.O0(this.logsData);
    }

    public final List<LogEntry> getPrevLogs() {
        ensurePrevLogsState(PrevLogsState.LOADED);
        List<LogEntry> list = this.prevLogsData;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("Cannot get prev logs after clear");
    }

    public final void log(String str) {
        int i = this.maxLogsLength - 36;
        if (i <= 0) {
            Logger.e$default("Log length too limited", null, 2, null);
            return;
        }
        LogEntry invoke = LogEntry.Companion.invoke(System.currentTimeMillis(), str, i);
        this.logsData.addLast(invoke);
        TracerThreads.INSTANCE.runInBgSequential(new d8h(1, this, invoke));
    }

    public /* synthetic */ LogStorage(Context context, boolean z, int i, int i2, zcl zclVar) {
        this(context, z, (i2 & 4) != 0 ? 65536 : i);
    }
}
