package xsna;

import com.vk.push.common.Logger;
import com.vk.push.common.analytics.BaseAnalyticsEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Lambda;

/* compiled from: BaseAnalyticsSender.kt */
/* loaded from: classes.dex */
public final class w46 extends Lambda implements izs<Logger, s3q0> {
    final /* synthetic */ BaseAnalyticsEvent $event;
    final /* synthetic */ Map<String, String> $params;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w46(BaseAnalyticsEvent baseAnalyticsEvent, LinkedHashMap linkedHashMap) {
        super(1);
        this.$event = baseAnalyticsEvent;
        this.$params = linkedHashMap;
    }

    @Override // xsna.izs
    public final s3q0 invoke(Logger logger) {
        Logger.DefaultImpls.info$default(logger, "Send metric: eventName = " + this.$event.getEventName() + ", params = " + this.$params, null, 2, null);
        return s3q0.a;
    }
}
