package xsna;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* compiled from: SmartHandler.java */
/* loaded from: classes13.dex */
public final class s5k0 {
    public final Handler a;
    public final Executor b;

    public s5k0(@Nullable Executor executor) {
        this.b = executor;
        if (executor == null) {
            this.a = new Handler(Looper.getMainLooper());
        } else {
            this.a = null;
        }
    }
}
