package ru.ok.tracer.crash.report;

import android.content.Context;
import java.io.File;
import ru.ok.tracer.SystemState;
import ru.ok.tracer.base.io.FileUtils;
import ru.ok.tracer.minidump.Minidump;
import ru.ok.tracer.session.SessionState;
import ru.ok.tracer.session.SessionStateStorage;
import ru.ok.tracer.session.TagsStorage;
import ru.ok.tracer.utils.Logger;
import ru.ok.tracer.utils.TracerFiles;
import xsna.epx;
import xsna.nbr;

/* compiled from: TracerNativeCrashReport.kt */
/* loaded from: classes11.dex */
public final class TracerNativeCrashReport {
    private static final String DIR_MINIDUMP = "minidump";
    public static final TracerNativeCrashReport INSTANCE = new TracerNativeCrashReport();

    private TracerNativeCrashReport() {
    }

    private final File getMinidumpDir(Context context) {
        return nbr.t(TracerFiles.INSTANCE.getTracerDir(context), DIR_MINIDUMP);
    }

    public final boolean calculateEnabled$tracer_crash_report_release(Boolean bool) {
        if (epx.f(bool, Boolean.FALSE)) {
            return false;
        }
        try {
            Minidump.getInstance();
            return true;
        } catch (Throwable unused) {
            epx.f(bool, Boolean.TRUE);
            return false;
        }
    }

    public final void check$tracer_crash_report_release(Context context, SessionStateStorage sessionStateStorage, TagsStorage tagsStorage, LogStorage logStorage, CrashStorage crashStorage) {
        File[] listFiles;
        byte[] p;
        File minidumpDir = getMinidumpDir(context);
        if (!minidumpDir.exists() || (listFiles = minidumpDir.listFiles()) == null || listFiles.length == 0) {
            return;
        }
        SystemState prevLaunchSystemState = sessionStateStorage.getPrevLaunchSystemState();
        if (prevLaunchSystemState == null) {
            Logger.w$default("No prev system state but have minidumps", null, 2, null);
            return;
        }
        for (File file : listFiles) {
            long lastModified = file.lastModified();
            try {
                p = nbr.p(file);
                FileUtils.deleteChecked(file);
            } catch (Exception unused) {
            }
            if (p.length == 0) {
                Logger.w$default("Empty minidump. " + file, null, 2, null);
            } else {
                CrashStorage.save$default(crashStorage, ReportType.MINIDUMP, p, prevLaunchSystemState.withDate(lastModified), tagsStorage.getPrevTags(), null, logStorage.getPrevLogs(), 16, null);
                sessionStateStorage.setPrevLaunchSessionStatus(SessionState.Status.NATIVE);
            }
        }
    }

    public final void installExceptionHandler$tracer_crash_report_release(Context context) {
        try {
            File minidumpDir = getMinidumpDir(context);
            FileUtils.mkdirsChecked(minidumpDir);
            Minidump.getInstance().installMinidumpWriter(minidumpDir.getPath());
        } catch (Throwable unused) {
        }
    }
}
