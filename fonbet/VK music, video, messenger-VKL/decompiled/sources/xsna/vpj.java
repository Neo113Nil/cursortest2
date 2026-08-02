package xsna;

import android.os.OutcomeReceiver;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;

/* compiled from: OutcomeReceiver.kt */
/* loaded from: classes11.dex */
public final class vpj<R, E extends Throwable> extends AtomicBoolean implements OutcomeReceiver {
    private final spj<R> continuation;

    public vpj(lq9 lq9Var) {
        super(false);
        this.continuation = lq9Var;
    }

    public final void onError(E e) {
        if (compareAndSet(false, true)) {
            this.continuation.resumeWith(new Result.Failure(e));
        }
    }

    public final void onResult(R r) {
        if (compareAndSet(false, true)) {
            this.continuation.resumeWith(r);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
