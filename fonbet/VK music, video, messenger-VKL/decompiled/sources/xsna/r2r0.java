package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* compiled from: Util.java */
/* loaded from: classes12.dex */
public final class r2r0 {
    public static final Charset a = Charset.forName(C.ASCII_NAME);

    static {
        Charset.forName(C.UTF8_NAME);
    }

    public static void a(File file) throws IOException {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            throw new IOException(z9r.a(file, "not a readable directory: "));
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                a(file2);
            }
            if (!file2.delete()) {
                throw new IOException(z9r.a(file2, "failed to delete file: "));
            }
        }
    }
}
