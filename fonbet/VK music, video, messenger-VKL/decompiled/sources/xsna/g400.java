package xsna;

import com.vk.im.engine.models.LongPollType;
import com.vk.im.engine.reporters.performance.PerformanceEventType;
import com.vk.im.reporters.api.engine.LongPollExpiredReporter;

/* compiled from: LongPollExpiredExpiredReporterImpl.kt */
/* loaded from: classes5.dex */
public final class g400 implements LongPollExpiredReporter {
    @Override // com.vk.im.reporters.api.engine.LongPollExpiredReporter
    public final void a(LongPollType longPollType, LongPollExpiredReporter.Reason reason) {
        s3w0 s3w0Var = new s3w0(PerformanceEventType.LONG_POLL_EXPIRED.h(), false);
        String h = longPollType.h();
        String[] strArr = s3w0Var.i;
        strArr[1] = h;
        strArr[2] = reason.h();
        s3w0Var.q();
    }
}
