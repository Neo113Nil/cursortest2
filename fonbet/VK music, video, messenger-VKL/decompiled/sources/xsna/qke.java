package xsna;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: ClipsLiteItemCheckerImpl.kt */
/* loaded from: classes17.dex */
public final class qke implements pke {
    public final AtomicBoolean a = new AtomicBoolean(false);

    @Override // xsna.pke
    public final boolean a() {
        return !this.a.getAndSet(true);
    }
}
