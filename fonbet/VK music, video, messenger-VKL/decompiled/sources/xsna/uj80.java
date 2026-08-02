package xsna;

import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Lambda;

/* compiled from: OneTimePushReceiveHelper.kt */
/* loaded from: classes5.dex */
public final class uj80 extends Lambda implements gzs<s3q0> {
    final /* synthetic */ CountDownLatch $latch;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uj80(CountDownLatch countDownLatch) {
        super(0);
        this.$latch = countDownLatch;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        this.$latch.countDown();
        return s3q0.a;
    }
}
