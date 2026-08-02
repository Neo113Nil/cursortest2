package xsna;

import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* compiled from: ImageReaderProxy.java */
/* loaded from: classes11.dex */
public interface hlw {

    /* compiled from: ImageReaderProxy.java */
    public interface a {
        void d(@NonNull hlw hlwVar);
    }

    void a(@NonNull a aVar, @NonNull Executor executor);

    @Nullable
    alw b();

    @Nullable
    alw c();

    void close();

    void d();

    int e();

    @Nullable
    Surface getSurface();
}
