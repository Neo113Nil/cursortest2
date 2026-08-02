package xsna;

import androidx.annotation.NonNull;
import xsna.hwx0;

/* compiled from: TaskExecutor.java */
/* loaded from: classes.dex */
public interface r5o0 {
    @NonNull
    default ovj a() {
        return qu5.b(d());
    }

    default void b(@NonNull Runnable runnable) {
        d().execute(runnable);
    }

    @NonNull
    hwx0.a c();

    @NonNull
    emi0 d();
}
