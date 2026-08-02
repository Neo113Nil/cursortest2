package ru.ok.tracer.crash.report;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import ru.ok.tracer.SystemState;
import ru.ok.tracer.base.process.ProcessUtils;
import ru.ok.tracer.crash.report.AnrSnapshotStorage;
import ru.ok.tracer.session.SessionState;
import ru.ok.tracer.session.SessionStateStorage;
import ru.ok.tracer.session.TagsStorage;
import ru.ok.tracer.utils.Logger;
import xsna.a0a;
import xsna.emb;
import xsna.epx;
import xsna.i7s;
import xsna.ro;

/* compiled from: AnrReporter.kt */
/* loaded from: classes9.dex */
public final class AnrReporter {
    public static final AnrReporter INSTANCE = new AnrReporter();

    private AnrReporter() {
    }

    private final String insertSnapshotsIfAny(String str, long j, AnrSnapshotStorage anrSnapshotStorage) {
        List<AnrSnapshotStorage.ThreadSnapshot> readAll = anrSnapshotStorage.readAll();
        if (readAll.isEmpty()) {
            Logger.d$default("No main snapshots to attach", null, 2, null);
            return str;
        }
        int indexToInsertSnapshots = AnrReporterKt.indexToInsertSnapshots(str);
        if (indexToInsertSnapshots < 0) {
            Logger.e$default("Unable to find where to insert snapshots", null, 2, null);
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str, 0, indexToInsertSnapshots);
        for (AnrSnapshotStorage.ThreadSnapshot threadSnapshot : readAll) {
            sb.append("\"SNAPSHOT main\" tid=1 (");
            sb.append(j - threadSnapshot.getTimestamp$tracer_crash_report_release());
            sb.append("ms before)\n");
            sb.append(threadSnapshot.getStack$tracer_crash_report_release());
            sb.append('\n');
        }
        sb.append('\n');
        sb.append((CharSequence) str, indexToInsertSnapshots, str.length());
        return sb.toString();
    }

    public final void check(Context context, SessionStateStorage sessionStateStorage, TagsStorage tagsStorage, LogStorage logStorage, CrashStorage crashStorage, AnrSnapshotStorage anrSnapshotStorage) {
        List historicalProcessExitReasons;
        int reason;
        String processName;
        long timestamp;
        String str;
        String description;
        long timestamp2;
        long timestamp3;
        InputStream traceInputStream;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                String processName2 = ProcessUtils.getProcessName(context);
                Iterator it = historicalProcessExitReasons.iterator();
                while (it.hasNext()) {
                    ApplicationExitInfo a = i7s.a(it.next());
                    reason = a.getReason();
                    if (reason == 6) {
                        processName = a.getProcessName();
                        if (epx.f(processName, processName2)) {
                            long prevLaunchTs = sessionStateStorage.getPrevLaunchTs();
                            timestamp = a.getTimestamp();
                            if (timestamp < prevLaunchTs) {
                                a.getTimestamp();
                            } else {
                                try {
                                    traceInputStream = a.getTraceInputStream();
                                } catch (Exception unused) {
                                }
                                if (traceInputStream != null) {
                                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(traceInputStream, emb.b), 8192);
                                    try {
                                        str = a0a.b(bufferedReader);
                                        bufferedReader.close();
                                        if (str != null || str.length() == 0) {
                                            description = a.getDescription();
                                            Logger.w$default("ANR with empty trace. " + description, null, 2, null);
                                        } else {
                                            a.getTimestamp();
                                            SystemState prevLaunchSystemState = sessionStateStorage.getPrevLaunchSystemState();
                                            if (prevLaunchSystemState == null) {
                                                Logger.w$default("No prevSystemState", null, 2, null);
                                            } else {
                                                timestamp2 = a.getTimestamp();
                                                String insertSnapshotsIfAny = insertSnapshotsIfAny(str, timestamp2, anrSnapshotStorage);
                                                ReportType reportType = ReportType.ANR;
                                                byte[] bytes = insertSnapshotsIfAny.getBytes(emb.b);
                                                timestamp3 = a.getTimestamp();
                                                CrashStorage.save$default(crashStorage, reportType, bytes, prevLaunchSystemState.withDate(timestamp3), tagsStorage.getPrevTags(), null, logStorage.getPrevLogs(), 16, null);
                                                sessionStateStorage.setPrevLaunchSessionStatus(SessionState.Status.ANR);
                                            }
                                        }
                                    } catch (Throwable th) {
                                        try {
                                            throw th;
                                        } catch (Throwable th2) {
                                            ro.e(bufferedReader, th);
                                            throw th2;
                                        }
                                    }
                                }
                                str = null;
                                if (str != null) {
                                }
                                description = a.getDescription();
                                Logger.w$default("ANR with empty trace. " + description, null, 2, null);
                            }
                        } else {
                            a.getProcessName();
                        }
                    }
                }
            } catch (Exception unused2) {
            }
        }
    }
}
