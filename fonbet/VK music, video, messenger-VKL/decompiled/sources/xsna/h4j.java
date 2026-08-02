package xsna;

import java.util.concurrent.TimeUnit;
import okhttp3.internal.concurrent.TaskRunner;

/* compiled from: ConnectionPool.kt */
/* loaded from: classes11.dex */
public final class h4j {
    public final l8f0 a;

    public h4j(long j) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        this.a = new l8f0(TaskRunner.i, j);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h4j() {
        this(5L);
        TimeUnit timeUnit = TimeUnit.MINUTES;
    }
}
