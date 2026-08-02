package xsna;

import androidx.annotation.NonNull;
import com.ironsource.X3;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes.dex */
public final class vn70 implements ThreadFactory {
    public final String b;
    public final AtomicInteger c = new AtomicInteger();
    public final ThreadFactory d = Executors.defaultThreadFactory();

    public vn70(@NonNull String str) {
        this.b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    @NonNull
    public final Thread newThread(@NonNull Runnable runnable) {
        Thread newThread = this.d.newThread(new jsz0(runnable));
        int andIncrement = this.c.getAndIncrement();
        int length = String.valueOf(andIncrement).length();
        String str = this.b;
        StringBuilder sb = new StringBuilder(str.length() + 1 + length + 1);
        sb.append(str);
        sb.append(X3.j.d);
        sb.append(andIncrement);
        sb.append(X3.j.e);
        newThread.setName(sb.toString());
        return newThread;
    }
}
