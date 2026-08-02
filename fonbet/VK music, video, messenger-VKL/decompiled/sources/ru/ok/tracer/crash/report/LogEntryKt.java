package ru.ok.tracer.crash.report;

import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import xsna.emb;
import xsna.jw5;

/* compiled from: LogEntry.kt */
/* loaded from: classes9.dex */
public final class LogEntryKt {
    private static final SimpleDateFormat BASE_FMT = new SimpleDateFormat(AppUpdateInfo.Factory.UPDATED_FORMAT, Locale.US);

    public static final byte[] coerceUtf8SizeAtMost(byte[] bArr, int i) {
        if (bArr.length <= i) {
            return bArr;
        }
        if ((bArr[i] & 192) == 128) {
            do {
                i--;
                if (i < 0) {
                    break;
                }
            } while ((bArr[i] & 192) == 128);
        }
        return jw5.l(0, i, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void writeAscii(OutputStream outputStream, char c) {
        outputStream.write(c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void writeRFC3339(OutputStream outputStream, long j) {
        byte[] bytes = BASE_FMT.format(new Date(j)).getBytes(emb.b);
        int length = bytes.length - 2;
        outputStream.write(bytes, 0, length);
        outputStream.write(58);
        outputStream.write(bytes, length, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void writeAscii(OutputStream outputStream, String str) {
        for (int i = 0; i < str.length(); i++) {
            outputStream.write(str.charAt(i));
        }
    }
}
