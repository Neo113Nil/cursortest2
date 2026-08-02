package ru.ok.tracer.lite.crash.report;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;

/* compiled from: LogEntryLite.kt */
/* loaded from: classes9.dex */
public final class LogEntryLiteKt {
    private static final SimpleDateFormat BASE_FMT = new SimpleDateFormat(AppUpdateInfo.Factory.UPDATED_FORMAT, Locale.US);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void appendRFC3339(Appendable appendable, long j) {
        String format = BASE_FMT.format(new Date(j));
        int length = format.length();
        int i = length - 2;
        appendable.append(format, 0, i);
        appendable.append(':');
        appendable.append(format, i, length);
    }
}
