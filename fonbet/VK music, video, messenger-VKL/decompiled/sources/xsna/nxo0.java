package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.TimeoutCancellationException;
import xsna.zno;

/* compiled from: Timeout.kt */
/* loaded from: classes8.dex */
public final class nxo0<U, T extends U> extends z9h0<T> implements Runnable {
    public final long f;

    public nxo0(long j, ContinuationImpl continuationImpl) {
        super(continuationImpl, continuationImpl.getContext());
        this.f = j;
    }

    @Override // xsna.pyx
    public final String k0() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.k0());
        sb.append("(timeMillis=");
        return vu5.a(')', this.f, sb);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
    
        if (r0 == null) goto L10;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String a;
        osl d = qsl.d(this.d);
        ssl sslVar = d instanceof ssl ? (ssl) d : null;
        long j = this.f;
        if (sslVar != null) {
            zno.a aVar = zno.c;
            eoo.f(j, DurationUnit.MILLISECONDS);
            a = sslVar.p();
        }
        a = qlb0.a(j, "Timed out waiting for ", " ms");
        M(new TimeoutCancellationException(a, this));
    }
}
