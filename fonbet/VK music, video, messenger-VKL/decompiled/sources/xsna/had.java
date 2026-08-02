package xsna;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.io.FileWriter;

/* compiled from: ClipUpload.kt */
/* loaded from: classes17.dex */
public final class had {
    public final File a;

    public had(File file, int i) {
        switch (i) {
            case 1:
                this.a = file;
                break;
            default:
                this.a = file;
                break;
        }
    }

    public void a(String str) {
        FileWriter fileWriter = new FileWriter(this.a, true);
        fileWriter.append((CharSequence) str);
        fileWriter.flush();
        fileWriter.close();
    }

    public void b(String str, String str2) {
        if (str2 != null) {
            a(str);
            a(StringUtils.PROCESS_POSTFIX_DELIMITER);
            a(str2);
            a("\n");
        }
    }

    public void c(String str) {
        a(str);
        a("\n");
    }
}
