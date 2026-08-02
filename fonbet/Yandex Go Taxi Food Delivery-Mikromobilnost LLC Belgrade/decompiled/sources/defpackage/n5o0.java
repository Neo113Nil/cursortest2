package defpackage;

import android.os.SystemClock;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class n5o0 {
    public final jua0 a;
    public final czf0 b;
    public final h3y c;

    public n5o0(jua0 jua0Var, czf0 czf0Var, h3y h3yVar) {
        this.a = jua0Var;
        this.b = czf0Var;
        this.c = h3yVar;
    }

    public final void a(String str) {
        ((e270) this.c.get()).a(str, "Time", new qz10(12), new vam0(22, this, str));
    }

    public final void b(String str) {
        e270 e270Var = (e270) this.c.get();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        e270Var.getClass();
        String str2 = str + Extension.DOT_CHAR + "Time";
        if (e270Var.e.contains(str2)) {
            return;
        }
        e270Var.c.updateAndGet(new d270(elapsedRealtime));
        e270Var.d.putIfAbsent(str2, Long.valueOf(elapsedRealtime));
        this.a.getClass();
    }
}
