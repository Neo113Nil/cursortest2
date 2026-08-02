package xsna;

import com.vk.metrics.eventtracking.Event;
import java.io.PrintWriter;
import java.io.StringWriter;

/* compiled from: ImEngineTrack.kt */
/* loaded from: classes.dex */
public final class v2w {
    public static void a(Event.a aVar) {
        String str;
        try {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            try {
                new RuntimeException("dump_stack").printStackTrace(printWriter);
                str = stringWriter.toString();
                printWriter.close();
            } finally {
            }
        } catch (Throwable unused) {
            str = "dumpStack failed";
        }
        int i = 0;
        for (Object obj : j5g.S(drm0.c0(str, new String[]{"\n"}, 0, 6), 3)) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            aVar.c("st" + i, (String) obj);
            i = i2;
        }
    }
}
