package xsna;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;

/* compiled from: Clock.java */
/* loaded from: classes12.dex */
public interface dvf {
    public static final ypn0 a = new ypn0();

    long a();

    fqn0 createHandler(Looper looper, @Nullable Handler.Callback callback);

    long currentTimeMillis();

    long elapsedRealtime();

    long uptimeMillis();
}
