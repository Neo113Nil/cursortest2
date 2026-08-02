package xsna;

import android.os.Handler;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* compiled from: AutoValue_CameraThreadConfig.java */
/* loaded from: classes11.dex */
public final class sk5 extends wl9 {
    public final Executor a;
    public final Handler b;

    public sk5(Executor executor, Handler handler) {
        if (executor == null) {
            throw new NullPointerException("Null cameraExecutor");
        }
        this.a = executor;
        if (handler == null) {
            throw new NullPointerException("Null schedulerHandler");
        }
        this.b = handler;
    }

    @Override // xsna.wl9
    @NonNull
    public final Executor a() {
        return this.a;
    }

    @Override // xsna.wl9
    @NonNull
    public final Handler b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wl9)) {
            return false;
        }
        wl9 wl9Var = (wl9) obj;
        return this.a.equals(wl9Var.a()) && this.b.equals(wl9Var.b());
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.a + ", schedulerHandler=" + this.b + "}";
    }
}
