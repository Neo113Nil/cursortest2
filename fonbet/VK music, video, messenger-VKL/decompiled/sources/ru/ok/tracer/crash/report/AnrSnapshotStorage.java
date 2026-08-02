package ru.ok.tracer.crash.report;

import android.content.Context;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.text.Regex;
import ru.ok.tracer.base.io.FileUtils;
import ru.ok.tracer.base.stacktrace.ThrowableUtils;
import ru.ok.tracer.utils.Logger;
import ru.ok.tracer.utils.TracerFiles;
import xsna.e43;
import xsna.emb;
import xsna.hl10;
import xsna.nbr;
import xsna.rl3;
import xsna.s3q0;
import xsna.swe0;
import xsna.zcl;

/* compiled from: AnrSnapshotStorage.kt */
/* loaded from: classes9.dex */
public final class AnrSnapshotStorage {
    private static final int ABSOLUTE_MAX_COUNT = 100;
    public static final Companion Companion = new Companion(null);
    private static final Regex FILENAME_REGEX = new Regex("main-([0-9]+)\\.txt");
    private final Context context;
    private final int maxCount;

    /* compiled from: AnrSnapshotStorage.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: AnrSnapshotStorage.kt */
    public static final class ThreadSnapshot {
        private final String stack;
        private final long timestamp;

        public ThreadSnapshot(long j, String str) {
            this.timestamp = j;
            this.stack = str;
        }

        public final String getStack$tracer_crash_report_release() {
            return this.stack;
        }

        public final long getTimestamp$tracer_crash_report_release() {
            return this.timestamp;
        }
    }

    public AnrSnapshotStorage(int i, Context context) {
        this.context = context;
        this.maxCount = swe0.g(i, 1, 100);
    }

    private final File getSnapshotDir() {
        return nbr.t(TracerFiles.INSTANCE.getTracerDir(this.context), "main_snapshots");
    }

    public final void clean() {
        if (getSnapshotDir().exists() && getSnapshotDir().isDirectory() && !nbr.l(getSnapshotDir())) {
            Logger.e$default("Cannot delete snapshots dir", null, 2, null);
        }
    }

    public final List<ThreadSnapshot> readAll() {
        File snapshotDir = getSnapshotDir();
        if (!snapshotDir.exists() || !snapshotDir.isDirectory()) {
            return EmptyList.b;
        }
        try {
            File[] listFiles = snapshotDir.listFiles();
            if (listFiles == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            File[] fileArr = listFiles;
            if (fileArr.length > 1) {
                Arrays.sort(fileArr);
            }
            rl3.k0(listFiles);
            ListBuilder e = e43.e();
            for (File file : listFiles) {
                hl10 e2 = FILENAME_REGEX.e(file.getName());
                if (e2 != null) {
                    e.add(new ThreadSnapshot(Long.parseLong((String) ((hl10.a) e2.b()).get(1)), nbr.r(file, emb.b)));
                }
            }
            return e.g();
        } catch (Throwable unused) {
            if (!nbr.l(snapshotDir)) {
                Logger.e$default("Cannot delete snapshots dir", null, 2, null);
            }
            return EmptyList.b;
        }
    }

    public final void save(StackTraceElement[] stackTraceElementArr) {
        File snapshotDir = getSnapshotDir();
        File t = nbr.t(snapshotDir, "main-" + System.currentTimeMillis() + ".txt");
        try {
            FileUtils.mkdirsChecked(snapshotDir);
            File[] listFiles = snapshotDir.listFiles();
            if (listFiles == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            if (listFiles.length >= this.maxCount) {
                File[] fileArr = listFiles;
                if (fileArr.length > 1) {
                    Arrays.sort(fileArr);
                }
                int length = listFiles.length - this.maxCount;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        FileUtils.deleteChecked(listFiles[i]);
                        if (i == length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(t), emb.b), 8192);
            try {
                for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                    ThrowableUtils.appendTo$default(stackTraceElement, bufferedWriter, 0, null, 6, null);
                }
                s3q0 s3q0Var = s3q0.a;
                bufferedWriter.close();
            } finally {
            }
        } catch (Throwable unused) {
        }
    }

    public /* synthetic */ AnrSnapshotStorage(int i, Context context, int i2, zcl zclVar) {
        this((i2 & 1) != 0 ? 100 : i, context);
    }
}
