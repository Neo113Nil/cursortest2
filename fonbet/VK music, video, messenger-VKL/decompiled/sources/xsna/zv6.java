package xsna;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.io.File;
import java.util.concurrent.Future;

/* compiled from: BeatDetectTask.java */
/* loaded from: classes3.dex */
public final class zv6 {
    public final Handler a = new Handler(Looper.getMainLooper());
    public final w7 b;
    public final File c;
    public final Future<?> d;
    public volatile boolean e;

    /* compiled from: BeatDetectTask.java */
    public static final class a {
        public w7 a;
        public File b;

        public final zv6 a() {
            File file = this.b;
            if (file != null && file.exists() && this.b.isFile()) {
                return new zv6(this);
            }
            throw new IllegalStateException("No audio specified");
        }

        public final void b(@NonNull File file) {
            this.b = file;
        }

        public final void c(w7 w7Var) {
            this.a = w7Var;
        }
    }

    public zv6(a aVar) {
        this.b = aVar.a;
        this.c = aVar.b;
        asu0.a.getClass();
        this.d = asu0.h().submit(new yv6(this, 0));
    }

    public final void a() {
        this.d.cancel(true);
        this.e = true;
    }

    public final File b() {
        return this.c;
    }
}
