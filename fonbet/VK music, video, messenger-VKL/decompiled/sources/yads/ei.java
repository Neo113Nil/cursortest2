package yads;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.collections.EmptyList;
import xsna.a0a;
import xsna.bpn0;
import xsna.i5g;
import xsna.rli0;

/* loaded from: classes10.dex */
public final class ei {
    public final Context a;
    public final Lazy b = new bpn0(new zh(this));

    public ei(Context context) {
        this.a = context;
    }

    public static final lf a(ei eiVar, ApplicationExitInfo applicationExitInfo) {
        InputStream traceInputStream;
        long timestamp;
        String description;
        int importance;
        int pid;
        long pss;
        long rss;
        String processName;
        int status;
        int realUid;
        eiVar.getClass();
        try {
            traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream == null) {
                return null;
            }
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(traceInputStream));
                try {
                    String b = a0a.b(bufferedReader);
                    bufferedReader.close();
                    traceInputStream.close();
                    timestamp = applicationExitInfo.getTimestamp();
                    description = applicationExitInfo.getDescription();
                    if (description == null) {
                        description = "ANR";
                    }
                    importance = applicationExitInfo.getImportance();
                    pid = applicationExitInfo.getPid();
                    pss = applicationExitInfo.getPss();
                    rss = applicationExitInfo.getRss();
                    processName = applicationExitInfo.getProcessName();
                    applicationExitInfo.getReason();
                    status = applicationExitInfo.getStatus();
                    realUid = applicationExitInfo.getRealUid();
                    return new lf(timestamp, description, b, importance, pid, pss, rss, processName, status, realUid);
                } finally {
                }
            } finally {
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    public final List a(int i, int i2, long j) {
        List historicalProcessExitReasons;
        ActivityManager activityManager = (ActivityManager) this.b.getValue();
        if (activityManager != null) {
            historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(this.a.getPackageName(), 0, i);
            return rli0.A(rli0.t(rli0.j(rli0.j(rli0.j(new i5g(historicalProcessExitReasons), ai.b), new bi(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(i2))), new ci(j)), new di(this)));
        }
        return EmptyList.b;
    }
}
