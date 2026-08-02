package io.reactivex.rxjava3.internal.subscribers;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.reactivex.rxjava3.core.j;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import xsna.axm0;
import xsna.jxm0;

/* loaded from: classes8.dex */
public abstract class SinglePostCompleteSubscriber<T, R> extends AtomicLong implements j<T>, jxm0 {
    private static final long serialVersionUID = 7917814472626990048L;
    protected final axm0<? super R> downstream;
    protected long produced;
    protected jxm0 upstream;
    protected R value;

    public SinglePostCompleteSubscriber(axm0<? super R> axm0Var) {
        this.downstream = axm0Var;
    }

    public final void a(R r) {
        long j = this.produced;
        if (j != 0) {
            io.reactivex.rxjava3.internal.util.b.d(this, j);
        }
        while (true) {
            long j2 = get();
            if ((j2 & Long.MIN_VALUE) != 0) {
                return;
            }
            if ((j2 & Long.MAX_VALUE) != 0) {
                lazySet(C.TIME_UNSET);
                this.downstream.onNext(r);
                this.downstream.onComplete();
                return;
            } else {
                this.value = r;
                if (compareAndSet(0L, Long.MIN_VALUE)) {
                    return;
                } else {
                    this.value = null;
                }
            }
        }
    }

    @Override // xsna.jxm0
    public final void cancel() {
        this.upstream.cancel();
    }

    @Override // xsna.axm0
    public final void onSubscribe(jxm0 jxm0Var) {
        if (SubscriptionHelper.f(this.upstream, jxm0Var)) {
            this.upstream = jxm0Var;
            this.downstream.onSubscribe(this);
        }
    }

    @Override // xsna.jxm0
    public final void request(long j) {
        long j2;
        if (SubscriptionHelper.e(j)) {
            do {
                j2 = get();
                if ((j2 & Long.MIN_VALUE) != 0) {
                    if (compareAndSet(Long.MIN_VALUE, C.TIME_UNSET)) {
                        this.downstream.onNext(this.value);
                        this.downstream.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(j2, io.reactivex.rxjava3.internal.util.b.b(j2, j)));
            this.upstream.request(j);
        }
    }
}
