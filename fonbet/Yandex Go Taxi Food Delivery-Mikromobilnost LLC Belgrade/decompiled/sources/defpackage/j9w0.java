package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes14.dex */
public final class j9w0 {
    public final AtomicBoolean a = new AtomicBoolean(false);

    public final boolean a() {
        return this.a.get();
    }

    public final void b(boolean z) {
        this.a.set(z);
    }
}
