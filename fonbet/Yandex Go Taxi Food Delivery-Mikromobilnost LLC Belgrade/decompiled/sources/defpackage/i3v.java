package defpackage;

import java.io.File;
import java.io.PrintWriter;
import org.apache.commons.io.output.StringBuilderWriter;

/* loaded from: classes11.dex */
public class i3v {
    public static final /* synthetic */ int a = 0;

    static {
        char c = File.separatorChar;
        StringBuilderWriter stringBuilderWriter = new StringBuilderWriter(0);
        PrintWriter printWriter = new PrintWriter(stringBuilderWriter);
        try {
            printWriter.println();
            stringBuilderWriter.toString();
            printWriter.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    printWriter.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }
}
