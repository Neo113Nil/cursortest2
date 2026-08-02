package xsna;

import com.vk.push.common.Logger;
import com.vk.push.common.analytics.BaseAnalyticsEvent;
import kotlin.jvm.internal.Lambda;

/* compiled from: BaseAnalyticsSender.kt */
/* loaded from: classes5.dex */
public final class v46 extends Lambda implements izs<Logger, s3q0> {
    final /* synthetic */ BaseAnalyticsEvent $event;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v46(BaseAnalyticsEvent baseAnalyticsEvent) {
        super(1);
        this.$event = baseAnalyticsEvent;
    }

    @Override // xsna.izs
    public final s3q0 invoke(Logger logger) {
        Logger.DefaultImpls.info$default(logger, "Event skipped, eventName = " + this.$event.getEventName(), null, 2, null);
        return s3q0.a;
    }
}
