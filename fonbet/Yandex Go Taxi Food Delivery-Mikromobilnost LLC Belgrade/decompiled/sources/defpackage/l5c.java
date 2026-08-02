package defpackage;

import java.io.Closeable;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class l5c implements Closeable {
    public boolean a;
    public final zko b = new zko(Executors.newSingleThreadExecutor());

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.a) {
            return;
        }
        this.b.close();
        this.a = true;
    }
}
