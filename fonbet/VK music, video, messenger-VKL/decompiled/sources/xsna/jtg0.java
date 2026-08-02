package xsna;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: RxExtCore.kt */
/* loaded from: classes17.dex */
public final class jtg0 implements io.reactivex.rxjava3.functions.f<Throwable> {
    public final TimeoutException b;

    public jtg0(long j) {
        this.b = new TimeoutException(io.reactivex.rxjava3.internal.util.f.e(j, TimeUnit.MILLISECONDS));
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Throwable th) {
        if (th instanceof TimeoutException) {
            com.vk.metrics.eventtracking.b.a.a(this.b);
        }
    }
}
