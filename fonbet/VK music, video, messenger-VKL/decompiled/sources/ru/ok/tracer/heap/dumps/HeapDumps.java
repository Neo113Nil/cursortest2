package ru.ok.tracer.heap.dumps;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Debug;
import androidx.work.c;
import java.io.File;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import ru.ok.tracer.Tracer;
import ru.ok.tracer.base.io.FileUtils;
import ru.ok.tracer.heap.dumps.exceptions.ShrinkDumpWorker;
import ru.ok.tracer.utils.Logger;
import ru.ok.tracer.utils.TracerFiles;
import ru.ok.tracer.utils.TracerThreads;
import ru.ok.tracer.utils.UncaughtExceptionHandlers;
import xsna.drm0;
import xsna.dwx0;
import xsna.e1v;
import xsna.e6;
import xsna.emb;
import xsna.epx;
import xsna.nbr;
import xsna.ss9;
import xsna.zcl;

/* compiled from: HeapDumps.kt */
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes11.dex */
public final class HeapDumps {
    private static final String DUMP_FILE_NAME = "dump.hprof";
    private static final String DUMP_TMP_FILE_NAME = "dump-tmp.hprof";
    private static final String META_FILE_NAME = "dump-meta.json";
    private static final String META_TMP_FILE_NAME = "dump-tmp-meta.json";
    private static Context context;
    public static final HeapDumps INSTANCE = new HeapDumps();
    private static final AtomicBoolean canDump = new AtomicBoolean(true);

    /* compiled from: HeapDumps.kt */
    /* loaded from: classes9.dex */
    public static final class DumpMeta {
        public static final Companion Companion = new Companion(null);
        private final String buildUuid;
        private final String tag;

        /* compiled from: HeapDumps.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final DumpMeta parse(String str) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    String optString = jSONObject.optString("buildUuid");
                    if (drm0.N(optString)) {
                        optString = null;
                    }
                    String optString2 = jSONObject.optString("tag");
                    return new DumpMeta(optString, drm0.N(optString2) ? null : optString2);
                } catch (Exception e) {
                    throw new IllegalArgumentException(e);
                }
            }

            private Companion() {
            }
        }

        public DumpMeta(String str, String str2) {
            this.buildUuid = str;
            this.tag = str2;
        }

        public static /* synthetic */ DumpMeta copy$default(DumpMeta dumpMeta, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dumpMeta.buildUuid;
            }
            if ((i & 2) != 0) {
                str2 = dumpMeta.tag;
            }
            return dumpMeta.copy(str, str2);
        }

        public final String component1() {
            return this.buildUuid;
        }

        public final String component2() {
            return this.tag;
        }

        public final DumpMeta copy(String str, String str2) {
            return new DumpMeta(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DumpMeta)) {
                return false;
            }
            DumpMeta dumpMeta = (DumpMeta) obj;
            return epx.f(this.buildUuid, dumpMeta.buildUuid) && epx.f(this.tag, dumpMeta.tag);
        }

        public final String getBuildUuid() {
            return this.buildUuid;
        }

        public final String getTag() {
            return this.tag;
        }

        public int hashCode() {
            String str = this.buildUuid;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.tag;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String serialize() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("buildUuid", this.buildUuid);
            jSONObject.put("tag", this.tag);
            return jSONObject.toString();
        }

        public String toString() {
            return ss9.a("DumpMeta(buildUuid=", this.buildUuid, ", tag=", this.tag, ")");
        }
    }

    private HeapDumps() {
    }

    private final void cleanupFile(File file) {
        if (file.exists()) {
            Logger.d$default("Removing file " + file, null, 2, null);
            file.delete();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void install$lambda$0(Thread thread, Throwable th) {
        if (OutOfMemoryErrors.isOom(th)) {
            INSTANCE.runInternal(null);
        }
    }

    private final void runInternal(String str) {
        if (Tracer.isDisabled()) {
            Logger.w$default("Tracer is disabled", null, 2, null);
            return;
        }
        Context context2 = context;
        if (context2 == null) {
            Logger.e$default("HeapDumps not initialized", null, 2, null);
            return;
        }
        if (!canDump.getAndSet(false)) {
            Logger.d$default("Cannot run hprof", null, 2, null);
            return;
        }
        String buildUuid = Tracer.INSTANCE.getApplicationInfo().getBuildUuid();
        File tracerDir = TracerFiles.INSTANCE.getTracerDir(context2);
        File t = nbr.t(tracerDir, DUMP_TMP_FILE_NAME);
        File t2 = nbr.t(tracerDir, META_TMP_FILE_NAME);
        try {
            FileUtils.mkdirsChecked(tracerDir);
            Debug.dumpHprofData(t.getAbsolutePath());
            nbr.w(t2, new DumpMeta(buildUuid, str).serialize(), emb.b);
        } catch (Exception unused) {
            cleanupFile(t);
            cleanupFile(t2);
        }
        File t3 = nbr.t(tracerDir, DUMP_FILE_NAME);
        File t4 = nbr.t(tracerDir, META_FILE_NAME);
        try {
            if (t3.exists()) {
                FileUtils.deleteChecked(t3);
            }
            if (t4.exists()) {
                FileUtils.deleteChecked(t4);
            }
            FileUtils.renameToChecked(t, t3);
            FileUtils.renameToChecked(t2, t4);
        } catch (Exception unused2) {
            cleanupFile(t3);
            cleanupFile(t4);
        }
    }

    private final void shrinkAndUpload() {
        Context context2 = context;
        if (context2 == null) {
            Logger.e$default("HeapDumps not initialized", null, 2, null);
            return;
        }
        TracerFiles tracerFiles = TracerFiles.INSTANCE;
        File tracerDir = tracerFiles.getTracerDir(context2);
        File t = nbr.t(tracerDir, DUMP_FILE_NAME);
        File t2 = nbr.t(tracerDir, META_FILE_NAME);
        if (t.exists() || t2.exists()) {
            try {
                DumpMeta parse = DumpMeta.Companion.parse(nbr.r(t2, emb.b));
                FileUtils.deleteChecked(t2);
                String buildUuid = parse.getBuildUuid();
                String buildUuid2 = Tracer.INSTANCE.getApplicationInfo().getBuildUuid();
                if (!epx.f(buildUuid, buildUuid2)) {
                    throw new IllegalStateException(("Dump from different buildUuid. Current " + buildUuid2 + " != " + buildUuid).toString());
                }
                String tag = parse.getTag();
                File newSampleFile$default = TracerFiles.getNewSampleFile$default(tracerFiles, context2, FEATURE_HEAP_DUMPKt.getFEATURE_HEAP_DUMP(), null, 4, null);
                FileUtils.renameToChecked(t, newSampleFile$default);
                Logger.d$default("Schedule hprof upload", null, 2, null);
                TracerThreads.INSTANCE.runInBgAfterStartup(new e6(3, context2, new c.a(ShrinkDumpWorker.class).h(ShrinkDumpWorker.Companion.createInputData$tracer_heap_dumps_release(newSampleFile$default, tag)).b()));
            } catch (Exception unused) {
                cleanupFile(t);
                cleanupFile(t2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void shrinkAndUpload$lambda$4(Context context2, c cVar) {
        dwx0 h = dwx0.h(context2);
        h.getClass();
        h.d(Collections.singletonList(cVar));
    }

    public final void install$tracer_heap_dumps_release(Context context2) {
        context = context2;
        File tracerDir = TracerFiles.INSTANCE.getTracerDir(context2);
        HeapDumpConfiguration heapDumpConfiguration = HeapDumpConfiguration.Companion.get$tracer_heap_dumps_release();
        cleanupFile(nbr.t(tracerDir, DUMP_TMP_FILE_NAME));
        cleanupFile(nbr.t(tracerDir, META_TMP_FILE_NAME));
        if (heapDumpConfiguration.getEnabled$tracer_heap_dumps_release()) {
            UncaughtExceptionHandlers.prependDefault(new e1v());
            shrinkAndUpload();
        } else {
            Logger.v$default("HeapDumps disabled", null, 2, null);
            cleanupFile(nbr.t(tracerDir, DUMP_FILE_NAME));
            cleanupFile(nbr.t(tracerDir, META_FILE_NAME));
            canDump.set(false);
        }
    }

    public final void runNow(String str) {
        if (drm0.N(str)) {
            throw new IllegalArgumentException("Blank tag");
        }
        runInternal(str);
    }
}
