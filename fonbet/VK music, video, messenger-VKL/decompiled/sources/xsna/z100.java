package xsna;

import android.content.SharedPreferences;
import java.util.concurrent.ExecutorService;

/* compiled from: LoggerSettings.kt */
/* loaded from: classes.dex */
public final class z100 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final jar d;
    public final e100 e;
    public final jcc f;
    public final gzs<ExecutorService> g;
    public final SharedPreferences h;
    public final hu2 i;

    /* compiled from: LoggerSettings.kt */
    public static final class a {
        public jar a;
        public boolean d;
        public boolean e;
        public boolean f;
        public final jcc b = new jcc(0);
        public final e100 c = new e100(0);
        public gzs<? extends ExecutorService> g = new r63(4);
    }

    public z100(boolean z, boolean z2, boolean z3, jar jarVar, e100 e100Var, jcc jccVar, gzs gzsVar, SharedPreferences sharedPreferences, hu2 hu2Var) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = jarVar;
        this.e = e100Var;
        this.f = jccVar;
        this.g = gzsVar;
        this.h = sharedPreferences;
        this.i = hu2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z100)) {
            return false;
        }
        z100 z100Var = (z100) obj;
        return this.a == z100Var.a && this.b == z100Var.b && this.c == z100Var.c && epx.f(this.d, z100Var.d) && epx.f(this.e, z100Var.e) && epx.f(this.f, z100Var.f) && epx.f(this.g, z100Var.g) && epx.f(this.h, z100Var.h) && this.i.equals(z100Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + ((this.h.hashCode() + sf3.a((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31)) * 31)) * 31, 31, this.g)) * 31);
    }

    public final String toString() {
        return "LoggerSettings(captureOnDemand=" + this.a + ", isThreadDumpEnabled=" + this.b + ", needArchiveResult=" + this.c + ", fileSettings=" + this.d + ", logcatSettings=" + this.e + ", chunkSettings=" + this.f + ", executorServiceProvider=" + this.g + ", preference=" + this.h + ", externalLogTargetProvider=" + this.i + ')';
    }
}
