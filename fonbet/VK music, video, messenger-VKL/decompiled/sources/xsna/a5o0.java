package xsna;

import android.os.SystemClock;
import java.io.File;
import xsna.ppa0;
import xsna.qpa0;
import xsna.rkp0;

/* compiled from: Task.kt */
/* loaded from: classes3.dex */
public abstract class a5o0 {
    public final csp a;
    public final File b;
    public final ppa0.a c;
    public final ju4 d;
    public final String e;
    public long f = -1;

    public a5o0(csp cspVar, File file, ppa0.a aVar, ju4 ju4Var, String str) {
        this.a = cspVar;
        this.b = file;
        this.c = aVar;
        this.d = ju4Var;
        this.e = str;
    }

    public static qpa0 a(a5o0 a5o0Var, rkp0 rkp0Var, Exception exc, int i) {
        if ((i & 1) != 0) {
            rkp0Var = rkp0.a.a;
        }
        if ((i & 2) != 0) {
            exc = null;
        }
        File file = a5o0Var.b;
        ((ejp0) a5o0Var.d.a).f = a5o0Var.f != -1 ? SystemClock.elapsedRealtime() - a5o0Var.f : -1L;
        if (((Boolean) a5o0Var.c.get()).booleanValue()) {
            try {
                if (file.exists()) {
                    file.delete();
                }
            } catch (Throwable unused) {
            }
            return qpa0.a.a;
        }
        if (exc == null) {
            return new qpa0.b(rkp0Var);
        }
        try {
            if (file.exists()) {
                file.delete();
            }
        } catch (Throwable unused2) {
        }
        return new qpa0.c(exc);
    }

    public abstract void b();

    public qpa0 c() {
        this.f = SystemClock.elapsedRealtime();
        return new qpa0.d(false);
    }
}
