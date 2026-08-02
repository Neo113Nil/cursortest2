package xsna;

import androidx.annotation.NonNull;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes.dex */
public final class zt50 implements ThreadFactory {
    public final String b;
    public final ThreadFactory c = Executors.defaultThreadFactory();

    public zt50(@NonNull String str) {
        this.b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    @NonNull
    public final Thread newThread(@NonNull Runnable runnable) {
        Thread newThread = this.c.newThread(new jsz0(runnable));
        newThread.setName(this.b);
        return newThread;
    }
}
