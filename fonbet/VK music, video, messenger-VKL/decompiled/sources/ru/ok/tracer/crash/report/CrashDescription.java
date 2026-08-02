package ru.ok.tracer.crash.report;

import java.io.File;
import xsna.epx;
import xsna.n6j;
import xsna.nbr;
import xsna.urd0;

/* compiled from: CrashDescription.kt */
/* loaded from: classes9.dex */
public final class CrashDescription {
    private final String allStacktracesPath;
    private final String crashFilesDir;
    private final String logsPath;
    private final String stacktracePath;
    private final String systemStatePath;
    private final String tagsPath;
    private final long timestamp;
    private final ReportType type;

    public CrashDescription(long j, ReportType reportType, String str, String str2, String str3, String str4, String str5, String str6) {
        this.timestamp = j;
        this.type = reportType;
        this.crashFilesDir = str;
        this.systemStatePath = str2;
        this.tagsPath = str3;
        this.stacktracePath = str4;
        this.allStacktracesPath = str5;
        this.logsPath = str6;
    }

    public static /* synthetic */ CrashDescription copy$default(CrashDescription crashDescription, long j, ReportType reportType, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            j = crashDescription.timestamp;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            reportType = crashDescription.type;
        }
        ReportType reportType2 = reportType;
        if ((i & 4) != 0) {
            str = crashDescription.crashFilesDir;
        }
        String str7 = str;
        if ((i & 8) != 0) {
            str2 = crashDescription.systemStatePath;
        }
        return crashDescription.copy(j2, reportType2, str7, str2, (i & 16) != 0 ? crashDescription.tagsPath : str3, (i & 32) != 0 ? crashDescription.stacktracePath : str4, (i & 64) != 0 ? crashDescription.allStacktracesPath : str5, (i & 128) != 0 ? crashDescription.logsPath : str6);
    }

    public final long component1() {
        return this.timestamp;
    }

    public final ReportType component2() {
        return this.type;
    }

    public final String component3() {
        return this.crashFilesDir;
    }

    public final String component4() {
        return this.systemStatePath;
    }

    public final String component5() {
        return this.tagsPath;
    }

    public final String component6() {
        return this.stacktracePath;
    }

    public final String component7() {
        return this.allStacktracesPath;
    }

    public final String component8() {
        return this.logsPath;
    }

    public final CrashDescription copy(long j, ReportType reportType, String str, String str2, String str3, String str4, String str5, String str6) {
        return new CrashDescription(j, reportType, str, str2, str3, str4, str5, str6);
    }

    public final void delete() {
        nbr.l(new File(this.crashFilesDir));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CrashDescription)) {
            return false;
        }
        CrashDescription crashDescription = (CrashDescription) obj;
        return this.timestamp == crashDescription.timestamp && this.type == crashDescription.type && epx.f(this.crashFilesDir, crashDescription.crashFilesDir) && epx.f(this.systemStatePath, crashDescription.systemStatePath) && epx.f(this.tagsPath, crashDescription.tagsPath) && epx.f(this.stacktracePath, crashDescription.stacktracePath) && epx.f(this.allStacktracesPath, crashDescription.allStacktracesPath) && epx.f(this.logsPath, crashDescription.logsPath);
    }

    public final String getAllStacktracesPath() {
        return this.allStacktracesPath;
    }

    public final String getCrashFilesDir() {
        return this.crashFilesDir;
    }

    public final String getLogsPath() {
        return this.logsPath;
    }

    public final String getStacktracePath() {
        return this.stacktracePath;
    }

    public final String getSystemStatePath() {
        return this.systemStatePath;
    }

    public final String getTagsPath() {
        return this.tagsPath;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final ReportType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.logsPath.hashCode() + urd0.a(urd0.a(urd0.a(urd0.a(urd0.a((this.type.hashCode() + (Long.hashCode(this.timestamp) * 31)) * 31, 31, this.crashFilesDir), 31, this.systemStatePath), 31, this.tagsPath), 31, this.stacktracePath), 31, this.allStacktracesPath);
    }

    public String toString() {
        long j = this.timestamp;
        ReportType reportType = this.type;
        String str = this.crashFilesDir;
        String str2 = this.systemStatePath;
        String str3 = this.tagsPath;
        String str4 = this.stacktracePath;
        String str5 = this.allStacktracesPath;
        String str6 = this.logsPath;
        StringBuilder sb = new StringBuilder("CrashDescription(timestamp=");
        sb.append(j);
        sb.append(", type=");
        sb.append(reportType);
        n6j.b(sb, ", crashFilesDir=", str, ", systemStatePath=", str2);
        n6j.b(sb, ", tagsPath=", str3, ", stacktracePath=", str4);
        n6j.b(sb, ", allStacktracesPath=", str5, ", logsPath=", str6);
        sb.append(")");
        return sb.toString();
    }
}
