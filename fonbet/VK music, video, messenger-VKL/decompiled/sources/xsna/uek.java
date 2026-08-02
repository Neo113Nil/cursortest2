package xsna;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.chromium.net.ExperimentalCronetEngine;

/* compiled from: CronetLog.kt */
/* loaded from: classes.dex */
public final class uek {
    public final a a;
    public final ExperimentalCronetEngine b;
    public boolean c;
    public final Object d = new Object();
    public final File e;

    /* compiled from: CronetLog.kt */
    public static final class a {
        public final File a;

        public a(File file) {
            this.a = file;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return Boolean.hashCode(false) + shy.a(10485760, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            return "Config(path=" + this.a + ", maxSize=10485760, isFull=false)";
        }
    }

    public uek(a aVar, ExperimentalCronetEngine experimentalCronetEngine) {
        this.a = aVar;
        this.b = experimentalCronetEngine;
        this.e = aVar.a;
    }

    public final boolean a() {
        boolean z;
        synchronized (this.d) {
            z = this.c;
        }
        return z;
    }

    public final boolean b() {
        synchronized (this.d) {
            try {
                if (this.c) {
                    return false;
                }
                String format = new SimpleDateFormat("dd-MMM-yyyy_HH-mm-ss", Locale.US).format(new Date(System.currentTimeMillis()));
                File file = new File(this.a.a.getAbsolutePath() + "/net_log_" + format);
                if (!file.exists()) {
                    nbr.l(file);
                }
                file.mkdirs();
                ExperimentalCronetEngine experimentalCronetEngine = this.b;
                String absolutePath = file.getAbsolutePath();
                this.a.getClass();
                experimentalCronetEngine.startNetLogToDisk(absolutePath, false, 10485760);
                this.c = true;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.d) {
            if (this.c) {
                this.b.stopNetLog();
                this.c = false;
            }
        }
    }
}
