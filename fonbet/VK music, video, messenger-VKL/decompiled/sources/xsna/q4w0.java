package xsna;

import com.vk.push.common.Logger;
import kotlin.jvm.internal.Lambda;

/* compiled from: VkpnsNotifierMessagesReceiver.kt */
/* loaded from: classes5.dex */
public final class q4w0 extends Lambda implements gzs<Logger> {
    final /* synthetic */ Logger $logger;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4w0(Logger logger) {
        super(0);
        this.$logger = logger;
    }

    @Override // xsna.gzs
    public final Logger invoke() {
        return this.$logger.createLogger("Notifier");
    }
}
