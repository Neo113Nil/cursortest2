package xsna;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: DefaultLoggingPrefixer.kt */
/* loaded from: classes15.dex */
public final class zhl implements h200 {
    public final AtomicInteger b = new AtomicInteger(0);

    @Override // xsna.h200
    public final String getPrefix() {
        return String.valueOf(this.b.getAndIncrement());
    }
}
