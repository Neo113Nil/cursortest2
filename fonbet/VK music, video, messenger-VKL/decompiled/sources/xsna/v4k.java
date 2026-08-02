package xsna;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* compiled from: CrashlyticsController.java */
/* loaded from: classes13.dex */
public final class v4k implements Callable<Void> {
    public final /* synthetic */ long b;
    public final /* synthetic */ u4k c;

    public v4k(u4k u4kVar, long j) {
        this.c = u4kVar;
        this.b = j;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        Bundle b = ar.b(1, "fatal");
        b.putLong("timestamp", this.b);
        this.c.k.a(b);
        return null;
    }
}
